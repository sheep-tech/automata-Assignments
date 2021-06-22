import java.util.ArrayList;
import java.util.List;

public class GraphVizListener extends MyGrammarBaseListener {
    boolean enable = false;
    List<GraphViz> graph = new ArrayList<>();

    String[] cell = new String[3];
    int index = 0;

    @Override
    public void enterModel_response(MyGrammarParser.Model_responseContext ctx) {
        String id = ctx.VAR_ID().getText();

        if (id.equals("A")) {
            enable = true;

            System.out.println("digraph dfa {\n" +
                    "\trankdir = LR\n" +
                    "\tnode [shape = circle, style = filled, fillcolor = white, fontname = Arial]\n" +
                    "\tedge [fontname = Arial]\n" +
                    "\t1 [shape = doublecircle]\n" +
                    "\t9 [shape = doublecircle]\n");
        }
    }

    @Override
    public void exitModel_response(MyGrammarParser.Model_responseContext ctx) {
        if (enable) {
            enable = false;

            for (GraphViz graph : this.graph) {
                System.out.println("\t" + graph.generateGraph());
            }

            System.out.println("}");
        }
    }

    @Override
    public void enterEqNestedOper(MyGrammarParser.EqNestedOperContext ctx) {
        if (!enable)
            return;

        Value value = new Value(ctx.oper(1).getText().trim());

        cell[index++] = value.toString();

        if (checkIndex()) {
            this.graph.add(new GraphViz(Integer.parseInt(cell[0].substring(3)), Integer.parseInt(cell[1].substring(3)), cell[2]));
        }
    }

    private boolean checkIndex() {
        if (this.index == 3) {
            index = 0;
            return true;
        }
        return false;
    }
}
