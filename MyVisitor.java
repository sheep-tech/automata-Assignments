import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyVisitor extends MyGrammarBaseVisitor<Value> {
    /** "memory" for our calculator; variable/value pairs go here */
    Map<String, Value> memory = new TreeMap<>();

    char pos1;
    char pos2;

//    @Override
//    public Value visitModel_response(MyGrammarParser.Model_responseContext ctx) {
//        String id = ctx.VAR_ID().getText();
//        Value value = new Value(ctx.statement().VALUE());
//        memory.put(id, value);
//
//        return value;
//    }

    @Override
    public Value visitIte(MyGrammarParser.IteContext ctx) {
        visit(ctx.oper());
        // create arbitrary id
        String cellId = "b" + pos1 + pos2;
        // get the then statement value
        Value cellValue = visit(ctx.then_result());

        memory.put(cellId, cellValue);

        if (!ctx.else_result().statement().getChild(0).equals(MyGrammarParser.VALUE)) {
            visit(ctx.else_result());
        }

        return Value.VOID;
    }

    @Override
    public Value visitThen_result(MyGrammarParser.Then_resultContext ctx) {
        return new Value(ctx.getText());
    }

    @Override
    public Value visitAndNestedOper(MyGrammarParser.AndNestedOperContext ctx) {
        Value left = visit(ctx.oper(0));
        Value right = visit(ctx.oper(1));

//        if (left.asBoolean() && right.asBoolean())
//            return new Value(true);
//        else
//            return new Value(false);
        pos1 = left.asString().charAt(0);
        pos2 = right.asString().charAt(0);

        return Value.VOID;
    }

    @Override
    public Value visitEqNestedOper(MyGrammarParser.EqNestedOperContext ctx) {
        // arbitrary return the right oper value which is the sudoku cell position
        Value left = visit(ctx.oper(0));
        Value right = visit(ctx.oper(1));

        // check variable type (boolean || double)
//        if (left.asDouble() == right.asDouble())
//            return new Value(true);
//        else
//            return new Value(false);

        return right;
    }


    @Override
    public Value visitValueOper(MyGrammarParser.ValueOperContext ctx) {
        Value value;
        if (ctx.val.getType() == MyGrammarParser.VALUE)
            value = new Value(ctx.getText());
        else
            value = memory.get(ctx.getText());

        return value;
    }



    /** print statement */
    @Override
    public Value visitPrint(MyGrammarParser.PrintContext ctx) {
        defFunPrint();

        return Value.VOID;
    }

    private void defFunPrint() {
        int rowIndex = 1;

        System.out.println("+---+---+---+");
        for (Map.Entry<String, Value> a : memory.entrySet()) {
            String id = a.getKey();

            if ((Integer.parseInt(id.substring(2))) == 1) {
                System.out.print("|");
            }

            System.out.print(a.getValue());

            if ((Integer.parseInt(id.substring(2)) % 3) == 0 ) {
                System.out.print("|");
            }

            if (Character.getNumericValue(id.charAt(2)) == 9) {
                rowIndex++;
                System.out.println();
            }
            printNewLine(id);
        }
    }

    private void printNewLine(String id) {
        if ((Character.getNumericValue(id.charAt(1)) % 3) == 0 && Character.getNumericValue(id.charAt(2)) == 9) {
            System.out.println("+---+---+---+");
        }
    }
}
