import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;
import gen.*;

class MyListener extends MyGrammarBaseListener
{
	float result = 0;
	float var1 = 0;
	float var2 = 0;
	@Override public void enterMyStart(MyGrammarParser.MyStartContext ctx)
	{ }

	@Override
	public void enterVar1(MyGrammarParser.Var1Context ctx) {
		var1 = Float.parseFloat(ctx.getText());
		System.out.println("Var 1 is: " + var1);
	}

	@Override
	public void enterVar2(MyGrammarParser.Var2Context ctx) {
		var2 = Float.parseFloat(ctx.getText());
		System.out.println("Var 2 is: " + var2);
	}

	@Override
	public void enterAdd(MyGrammarParser.AddContext ctx) {
		result = var1 + var2;
	}

	@Override
	public void enterSub(MyGrammarParser.SubContext ctx) {
		result = var1 - var2;
	}

	@Override
	public void enterMul(MyGrammarParser.MulContext ctx) {
		result = var1 * var2;
	}

	@Override
	public void enterDiv(MyGrammarParser.DivContext ctx) {
		result = var1 / var2;
	}

	@Override public void exitMyStart(MyGrammarParser.MyStartContext ctx) {}

	@Override
	public void exitExpression(MyGrammarParser.ExpressionContext ctx) {
		System.out.println("The result is: " + result + "\n");

		var1 = 0;
		var2 = 0;
		result = 0;
	}

	@Override public void visitTerminal(TerminalNode node)
	{ 
		System.out.println("Node: '" + node.getText() + "' " +
				"line: " + node.getSymbol().getLine() + " " +
				"column: " + node.getSymbol().getCharPositionInLine() + " " +
				"token's type: " + node.getSymbol().getType());
	}
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

        ParseTree tree = parser.myStart();
		
		MyListener m = new MyListener();
		ParseTreeWalker.DEFAULT.walk(m, tree);
    }
}