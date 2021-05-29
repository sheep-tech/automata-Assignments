import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;
import gen.*;

class MyListener extends MyGrammarBaseListener
{


//	@Override public void visitTerminal(TerminalNode node)
//	{
//		System.out.println("Node: '" + node.getText() + "' " +
//				"line: " + node.getSymbol().getLine() + " " +
//				"column: " + node.getSymbol().getCharPositionInLine() + " " +
//				"token's type: " + node.getSymbol().getType());
//	}
}

public class Main 
{
    public static void main(String[] args) throws Exception 
	{
        CharStream input = CharStreams.fromStream(System.in);
		MyGrammarLexer lexer = new MyGrammarLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

		// TODO: print the lexer's vocabulary and the actual list of tokens 
		
        MyGrammarParser parser = new MyGrammarParser(tokens);

        ParseTree tree = parser.prog();

//      run MyListener
//		MyListener m = new MyListener();
//		ParseTreeWalker.DEFAULT.walk(m, tree);

//		run MyVisitor
		MyVisitor visitor = new MyVisitor();
		visitor.visit(tree);
    }
}