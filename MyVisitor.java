import gen.MyGrammarBaseVisitor;
import gen.MyGrammarParser;
import org.antlr.runtime.Parser;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyVisitor extends MyGrammarBaseVisitor<Value> {
    /** "memory" for our calculator; variable/value pairs go here */
    Map<String, Value> memory = new HashMap<>();
    Map<String, Function> functionList = new HashMap<>();

    /** print statement */
    @Override
    public Value visitPrint(MyGrammarParser.PrintContext ctx) {
        for (MyGrammarParser.ExprContext expr : ctx.expr()) {
//            String id = expr.getText(); // id is left-hand side of '='
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

    /** declare function statement */
    @Override
    public Value visitDeclareFunStat(MyGrammarParser.DeclareFunStatContext ctx) {
        String type = ctx.TYPE().getText();
        type = type.substring(0,1).toUpperCase() + type.substring(1);
        System.out.println("type: " + type);

        String id = ctx.ID().getText();
        System.out.println("params: " + ctx.params().children.get(1).getText());
        System.out.println("params: " + ctx.params().children.get(4).getText());

        System.out.println("nodes: " + ctx.statement());
        functionList.put(id, new Function(FunctionType.valueOf(type), ctx.params(), ctx.statement()));

        return Value.VOID;
    }

    @Override
    public Value visitFunCall(MyGrammarParser.FunCallContext ctx) {
        String id = ctx.getText();
        List<ParseTree> arguments = ctx.arguments().children;

        Value returnedValue = Value.VOID;

        if (functionList.containsKey(id)) {
            Function function = functionList.get(id);

            function.assignArguments(arguments);

                for(MyGrammarParser.StatementContext statement : function.getNodeTree()) {
                    visit(statement);
                }

        } else
            throw new RuntimeException("function indeclared: " + MyGrammarParser.VOCABULARY);

        return returnedValue;
    }

    @Override
    public Value visitReturnExpr(MyGrammarParser.ReturnExprContext ctx) {
        return (new Value(visit(ctx.expr())));
    }

    @Override
    public Value visitReturnBool(MyGrammarParser.ReturnBoolContext ctx) {
        return (new Value(visit(ctx.boolExpr())));
    }

    /** if statement */
    @Override
    public Value visitIfStat(MyGrammarParser.IfStatContext ctx) {
        Value boolExprResult = visit(ctx.boolExpr());

        if (boolExprResult.asBoolean()) {
            visit(ctx.statement(0));
        }
        else if (!boolExprResult.asBoolean() && ctx.statement(1) != null) {
            visit(ctx.statement(1));
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
    public Value visitOrExpr(MyGrammarParser.OrExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
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
        memory.put(id, value); // store it in our memory
        return value;
    }

    @Override
    public Value visitNumber(MyGrammarParser.NumberContext ctx) {
        return new Value(ctx.getText());
    }

    @Override
    public Value visitId(MyGrammarParser.IdContext ctx) {
        String id = ctx.ID().getText();
        if ( memory.containsKey(id) ) return memory.get(id);
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
