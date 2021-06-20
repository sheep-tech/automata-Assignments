import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

public class Function {
    private FunctionType functionType;
    private MyGrammarParser.ParamsContext parameters;
    private List<MyGrammarParser.StatementContext> nodeTree;

    public Function(FunctionType functionType, MyGrammarParser.ParamsContext parameters, List<MyGrammarParser.StatementContext> nodeTree) {
        this.functionType = functionType;
        this.nodeTree = nodeTree;
        this.parameters = parameters;
    }

    public void assignArguments(List<Value> arguments) {
        int paramsIndex = 1;
        for (Value argument : arguments) {
            this.parameters.children.get(paramsIndex);
        }
    }

    public List<MyGrammarParser.StatementContext> getNodeTree() {
        return nodeTree;
    }

    public FunctionType getFunctionType() {
        return functionType;
    }
}