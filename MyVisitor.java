import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyVisitor extends MyGrammarBaseVisitor<Value> {
    /** "memory" for our calculator; variable/value pairs go here */
    Map<String, Value> memory = new TreeMap<>();

    @Override
    public Value visitModel_response(MyGrammarParser.Model_responseContext ctx) {
        String id = ctx.function_var().getText();
        Value value = new Value(ctx.VALUE());
        memory.put(id, value);

        return value;
    }

    /** print statement */
    @Override
    public Value visitPrint(MyGrammarParser.PrintContext ctx) {
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

        return Value.VOID;
    }

    private void printNewLine(String id) {
        if ((Character.getNumericValue(id.charAt(1)) % 3) == 0 && Character.getNumericValue(id.charAt(2)) == 9) {
            System.out.println("+---+---+---+");
        }
    }
}
