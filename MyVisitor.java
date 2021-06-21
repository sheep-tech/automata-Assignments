import gen.MyGrammarBaseVisitor;
import gen.MyGrammarParser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyVisitor extends MyGrammarBaseVisitor<Value> {

    /** "memory" for our calculator; variable/value pairs go here */
    private List<HashMap<String, Value>> memory = new ArrayList<HashMap<String, Value>>();
    private int memoryIndex = 0;

    private Map<String, Function> functionList = new HashMap<>();

    public MyVisitor() {
        // initialize the global memory
        this.memory.add(new HashMap<>());
    }

    public List<HashMap<String, Value>> getMemory() {
        return memory;
    }
    /** print statement */
    @Override
    public Value visitPrint(MyGrammarParser.PrintContext ctx) {
        for (MyGrammarParser.ExprContext expr : ctx.expr()) {
            Value value = visit(expr);
            System.out.println(value); // print the assignment (e.g. a = 7)
        }
        return Value.VOID;
    }

    /** while loop */
    @Override
    public Value visitLoop(MyGrammarParser.LoopContext ctx) {
        // evaluate the boolean condition
        Value value = this.visit(ctx.boolExpr());

        while(value.asBoolean()) {

            // evaluate the code statement
            for (MyGrammarParser.StatementContext statement : ctx.statement()){
                this.visit(statement);
            }
            // evaluate the boolean condition
            value = this.visit(ctx.boolExpr());
        }

        return Value.VOID;
    }

    /** function statement */
    @Override
    public Value visitDeclareFunStat(MyGrammarParser.DeclareFunStatContext ctx){

        String type = ctx.TYPE().getText();
        type = type.substring(0,1).toUpperCase() + type.substring(1);
        String id = ctx.ID().getText();
        functionList.put(id, new Function(FunctionType.valueOf(type), ctx.params(), ctx.statement()));


        return Value.VOID;
    }

    @Override
    public Value visitFunCall(MyGrammarParser.FunCallContext ctx) {
        String id = ctx.ID().getText();
        List<ParseTree> arguments = ctx.arguments().children;
            //pass arguments into params
        // evaluate function
        //return the result
        Value returnedValue = Value.VOID;

        if (functionList.containsKey(id)) {
            // get function data
            Function function = functionList.get(id);
            List<Value> argumentValues = new ArrayList<>();

            // add arguments in a new local scope
            this.memoryIndex++;
            this.memory.add(new HashMap<>());

            MyGrammarParser.ParamsContext parameters = function.getParameters();
            List<MyGrammarParser.ExprContext> expressions = ctx.arguments().expr();

            for (int i = 0; i < parameters.ID().size(); i++) {
                memory.get(memoryIndex).put(parameters.ID(i).getText(), new Value(visit(expressions.get(i))));
            }

            // run statements. use try/catch flow to interrupt the function
            // when return statement is encountered
            try {
                for(MyGrammarParser.StatementContext statement : function.getNodeTree()) {
                    visit(statement);
                }
            } catch (ReturnException e) {
//                get the return value that was thrown
                returnedValue = e.getValue();
            }

            this.memory.remove(memoryIndex);
            this.memoryIndex--;

        } else
            throw new RuntimeException("function undeclared: " + MyGrammarParser.VOCABULARY);

        return returnedValue;
    }

    @Override
    public Value visitReturnBoolExpr(MyGrammarParser.ReturnBoolExprContext ctx) {
        Value value = new Value(visit(ctx.boolExpr()));

        throw new ReturnException(value);
    }

    @Override
    public Value visitReturnCommonExpr(MyGrammarParser.ReturnCommonExprContext ctx) {
        Value value = new Value(visit(ctx.expr()));

        throw new ReturnException(value);
    }

    /** if statement */
    @Override
    public Value visitIfStat(MyGrammarParser.IfStatContext ctx) {
        Value boolExprResult = visit(ctx.boolExpr());

//        then statement
        if (boolExprResult.asBoolean()) {
            for (MyGrammarParser.StatementContext statement : ctx.then_stat().statement()) {
                visit(statement);

            }
        }
//        else statement
        else if (!boolExprResult.asBoolean() && ctx.else_stat() != null) {
            for (MyGrammarParser.StatementContext statement : ctx.else_stat().statement()) {
                visit(statement);
            }
        }

        return Value.VOID;
    }

    /** expr op=(GT|LT) expr **/
    @Override
    public Value visitGtLtExpr(MyGrammarParser.GtLtExprContext ctx) {
        Double left = visit(ctx.expr(0)).asDouble();  // get value of left subexpression
        Double right = visit(ctx.expr(1)).asDouble(); // get value of right subexpression
        if ( ctx.op.getType() == MyGrammarParser.GT )
            return new Value(left > right);
        return new Value(left < right);
    }

    /** expr op=(GTEQ|LTEQ) expr **/
    @Override
    public Value visitGteqLteqExpr(MyGrammarParser.GteqLteqExprContext ctx) {
        Double left = visit(ctx.expr(0)).asDouble();  // get value of left subexpression
        Double right = visit(ctx.expr(1)).asDouble(); // get value of right subexpression
        if ( ctx.op.getType() == MyGrammarParser.GTEQ )
            return new Value(left >= right);
        return new Value(left <= right);
    }

    @Override
    public Value visitEqualityExpr(MyGrammarParser.EqualityExprContext ctx) {

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        if (ctx.stop.getType() == MyGrammarParser.NUMBER)
        {
            left.setNumber(true);
            right.setNumber(true);
        }

        switch (ctx.op.getType()) {
            case MyGrammarParser.EQ:
                return new Value(left.equals(right));
            case MyGrammarParser.NEQ:
                return new Value(!left.equals(right));
            default:
                throw new RuntimeException("unknown operator: " + MyGrammarParser.VOCABULARY);
        }
    }

    @Override
    public Value visitAndExpr(MyGrammarParser.AndExprContext ctx) {
        Value left = visit(ctx.expr(0));
        Value right = visit(ctx.expr(1));
        return new Value(left.asBoolean() && right.asBoolean());
    }

    @Override
    public Value visitAndBoolExpr(MyGrammarParser.AndBoolExprContext ctx) {
        Value left = visit(ctx.boolExpr(0));
        Value right = visit(ctx.boolExpr(1));
        return new Value(left.asBoolean() && right.asBoolean());
    }

    @Override
    public Value visitOrExpr(MyGrammarParser.OrExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asBoolean() || right.asBoolean());
    }

    @Override
    public Value visitOrBoolExpr(MyGrammarParser.OrBoolExprContext ctx) {
        Value left = this.visit(ctx.boolExpr(0));
        Value right = this.visit(ctx.boolExpr(1));
        return new Value(left.asBoolean() || right.asBoolean());
    }

    @Override
    public Value visitTrueExpr(MyGrammarParser.TrueExprContext ctx) {
        return new Value(true);
    }

    @Override
    public Value visitFalseExpr(MyGrammarParser.FalseExprContext ctx) {
        return new Value(false);
    }

    /** Basic arithmetic functionalities **/

    @Override
    public Value visitAssignExpr(MyGrammarParser.AssignExprContext ctx) {
        String id = ctx.ID().getText(); // id is left-hand side of '='
        Value value = new Value(visit(ctx.expr())); // compute value of expression on right
        memory.get(this.memoryIndex).put(id, value); // store it in our memory
        return value;
    }

    @Override
    public Value visitNumber(MyGrammarParser.NumberContext ctx) {
        return new Value(ctx.getText());
    }

    @Override
    public Value visitId(MyGrammarParser.IdContext ctx) {
        String id = ctx.ID().getText();

        for (int i = memoryIndex; i >= 0 ; i--) {
            if ( memory.get(i).containsKey(id) ) return memory.get(i).get(id);
        }

//      throw not recognized var error
        throw new RuntimeException("no such variable: " + id);
    }

    /** expr op=('*'|'/') expr */
    @Override
    public Value visitMulDivExpr(MyGrammarParser.MulDivExprContext ctx) {
        Value left = visit(ctx.expr(0));  // get value of left subexpression
        Value right = visit(ctx.expr(1)); // get value of right subexpression
        if ( ctx.op.getType() == MyGrammarParser.MULT )
            return new Value(left.asDouble() * right.asDouble());
        return new Value(left.asDouble() / right.asDouble()); // must be DIV
    }

    /** expr op=('+'|'-') expr */
    @Override
    public Value visitPlusMinusExpr(MyGrammarParser.PlusMinusExprContext ctx) {
        Value left = visit(ctx.expr(0));  // get value of left subexpression
        Value right = visit(ctx.expr(1)); // get value of right subexpression
        if ( ctx.op.getType() == MyGrammarParser.PLUS )
            return new Value(left.asDouble() + right.asDouble());
        return new Value(left.asDouble() - right.asDouble()); // must be SUB
    }

    /** '(' expr ')' */
    @Override
    public Value visitParens(MyGrammarParser.ParensContext ctx) {
        return visit(ctx.expr());
    }
}
