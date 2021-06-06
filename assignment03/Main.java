import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {
	public static void main(String[] args) throws Exception {
		CharStream input = CharStreams.fromFileName("input.txt");
		MyGrammarLexer lexer = new MyGrammarLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		MyGrammarParser parser = new MyGrammarParser(tokens);
		ParseTree tree = parser.parse();
		MyVisitor visitor = new MyVisitor();
		visitor.visit(tree);
	}
}