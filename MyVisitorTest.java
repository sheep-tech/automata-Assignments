import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MyVisitorTest {
    MyVisitor visitor;
    private ByteArrayOutputStream output = new ByteArrayOutputStream();

    @org.junit.jupiter.api.Test
    void visitPrint() {
        PrintStream ps = new PrintStream(output);
        // IMPORTANT: Save the old System.out!
        PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(ps);

        CharStream input = CharStreams.fromString("print 10");
        MyGrammarLexer lexer = new MyGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MyGrammarParser parser = new MyGrammarParser(tokens);
        ParseTree tree = parser.start();
        visitor = new MyVisitor();
        visitor.visit(tree);

        // Put things back
        System.out.flush();
        System.setOut(old);

        assertTrue(output.toString().contains("10"));
    }
}