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
        visitorLexer.printSymbolTable();
        SemanticVisitor semanticVisitor = new SemanticVisitor();
        semanticVisitor.setParser(visitorParser);
        semanticVisitor.setLexer(visitorLexer);
        semanticVisitor.visit(tree);
        /*ParseTreeWalker walker=new ParseTreeWalker();
        ParseTreeListener lister=new ParseTreeListener() {
            ParseTree smalltree;
            ArrayList<TerminalNode> nodes=new ArrayList<>();
            public void printSmallTree(){

            }
            @Override
            public void visitTerminal(TerminalNode terminalNode) {
               // System.out.println(terminalNode.getParent().toStringTree());

            }

            @Override
            public void visitErrorNode(ErrorNode errorNode) {

            }

            @Override
            public void enterEveryRule(ParserRuleContext parserRuleContext) {
                //System.out.println("enter rule "+parserRuleContext.toInfoString(parser));
                System.out.println("children: "+parserRuleContext.children);
            }

            @Override
            public void exitEveryRule(ParserRuleContext parserRuleContext) {
                //   System.out.println("exit rule");
            }
        };
        walker.walk(lister, tree);



        //System.out.println(tree.toStringTree(parser));
        /*JFrame frame = new JFrame("Antlr AST");
        JPanel panel = new JPanel();
        TreeViewer viewr = new TreeViewer(Arrays.asList(
                parser.getTokenNames()),tree);
        viewr.setScale(1.5);//scale a little
        panel.add(viewr);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,200);
        frame.setVisible(true);
        System.out.println("Symbol Table");
        lexer.printSymbolTable();
        /*System.out.println("tempstack: ");
        Arrays.toString(lexer.tempStack.toArray());
        System.out.println("nodestack: ");
        Arrays.toString(lexer.nodeStack.toArray());*/

    }
}
