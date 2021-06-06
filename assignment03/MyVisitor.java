import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyVisitor extends  MyGrammarBaseVisitor<Value> {

    // store variables (there's only one global scope!)
    Map<String, Value> memory = new HashMap<String, Value>();

    // assignment/id overrides
    @Override
    public Value visitAssignment(MyGrammarParser.AssignmentContext ctx) {
        String id = ctx.ID().getText();
        Value value = this.visit(ctx.expr());
        return memory.put(id, value);
    }

    @Override
    public Value visitIdExpr(MyGrammarParser.IdExprContext ctx) {
        String id = ctx.getText();
        Value value = memory.get(id);
        if(value == null) {
            throw new RuntimeException("no such variable: " + id);
        }
        return value;
    }


    @Override
    public Value visitBooleanExpr(MyGrammarParser.BooleanExprContext ctx) {
        return new Value(Boolean.valueOf(ctx.getText()));
    }



    @Override
    public Value visitUnaryMinusExpr(MyGrammarParser.UnaryMinusExprContext ctx) {
        Value value = this.visit(ctx.expr());
        return new Value(-value.asDouble());
    }

    @Override
    public Value visitNotExpr(MyGrammarParser.NotExprContext ctx) {
        Value value = this.visit(ctx.expr());
        return new Value(!value.asBoolean());
    }

    @Override
    public Value visitMultiplicationExpr(MyGrammarParser.MultiplicationExprContext ctx) {

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case MyGrammarParser.MULT:
                return new Value(left.asDouble() * right.asDouble());
            case MyGrammarParser.DIV:
                return new Value(left.asDouble() / right.asDouble());
            default:
                throw new RuntimeException("unknown operator: " + MyGrammarParser.VOCABULARY);
        }
    }

    @Override
    public Value visitAdditiveExpr(MyGrammarParser.AdditiveExprContext ctx) {

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case MyGrammarParser.PLUS:
                return left.isDouble() && right.isDouble() ?
                        new Value(left.asDouble() + right.asDouble()) :
                        new Value(left.asString() + right.asString());
            case MyGrammarParser.MINUS:
                return new Value(left.asDouble() - right.asDouble());
            default:
                throw new RuntimeException("unknown operator: " + MyGrammarParser.VOCABULARY);
        }
    }

    @Override
    public Value visitRelationalExpr(MyGrammarParser.RelationalExprContext ctx) {

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case MyGrammarParser.LT:
                return new Value(left.asDouble() < right.asDouble());
            case MyGrammarParser.LTEQ:
                return new Value(left.asDouble() <= right.asDouble());
            case MyGrammarParser.GT:
                return new Value(left.asDouble() > right.asDouble());
            case MyGrammarParser.GTEQ:
                return new Value(left.asDouble() >= right.asDouble());
            default:
                throw new RuntimeException("unknown operator: " + MyGrammarParser.VOCABULARY);
        }
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
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asBoolean() && right.asBoolean());
    }

    @Override
    public Value visitOrExpr(MyGrammarParser.OrExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asBoolean() || right.asBoolean());
    }

    @Override
    public Value visitPrint(MyGrammarParser.PrintContext ctx) {
        Value value = this.visit(ctx.expr());
        System.out.println(value);
        return value;
    }

    // if override
    @Override
    public Value visitIf_stat(MyGrammarParser.If_statContext ctx) {

        List<MyGrammarParser.Condition_blockContext> conditions =  ctx.condition_block();

        boolean evaluatedBlock = false;

        for(MyGrammarParser.Condition_blockContext condition : conditions) {

            Value evaluated = this.visit(condition.condition_expr());

            if(evaluated.asBoolean()) {
                evaluatedBlock = true;
                // evaluate this block whose expr==true
                this.visit(condition.stat_block());
                break;
            }
        }

        if(!evaluatedBlock && ctx.stat_block() != null) {
            // evaluate the else-stat_block (if present == not null)
            this.visit(ctx.stat_block());
        }

        return Value.VOID;
    }

    // while override
    @Override
    public Value visitWhile_stat(MyGrammarParser.While_statContext ctx) {

        Value value = this.visit(ctx.condition_expr());

        while(value.asBoolean()) {

            // evaluate the code block
            this.visit(ctx.stat_block());

            // evaluate the expression
            value = this.visit(ctx.condition_expr());
        }

        return Value.VOID;
    }
}