import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Parser.TraceListener;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.prefs.NodeChangeListener;

public class main  {
    public Writer quads=new Writer("quads.txt");
    public static void main (String args[]) throws java.io.IOException {
        //for symbol table:

        grmLexer lexer = new grmLexer( CharStreams.fromFileName("C:\\Users\\MSE\\IdeaProjects\\MicroJava\\src\\sample.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        grmParser parser = new grmParser(tokens);
        grmBaseListener listener=new grmBaseListener();
        lexer.setTable();
        parser.setLexer(lexer);
        parser.prog();
        //lexer.printSymbolTable();

        //for visitor:
        grmLexer visitorLexer = new grmLexer( CharStreams.fromFileName("C:\\Users\\MSE\\IdeaProjects\\MicroJava\\src\\sample.txt"));
        CommonTokenStream visitorTokens = new CommonTokenStream(visitorLexer);
        grmParser visitorParser = new grmParser(visitorTokens);
        visitorLexer.setTable();
        visitorParser.setLexer(visitorLexer);
        ParseTree tree=visitorParser.prog();
        SemanticVisitor semanticVisitor = new SemanticVisitor();
        semanticVisitor.setParser(visitorParser);
        semanticVisitor.setLexer(visitorLexer);
        semanticVisitor.visit(tree);

        QuadrupleVisitor quadrupleVisitor=new QuadrupleVisitor();
        lexer.printSymbolTable();
        quadrupleVisitor.setSymbolTable(lexer.symbolTable);
        quadrupleVisitor.setParser(parser);
        quadrupleVisitor.setLexer(lexer);
        quadrupleVisitor.visit(tree);


    }
}
