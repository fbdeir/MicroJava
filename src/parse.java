import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Parser.TraceListener;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.prefs.NodeChangeListener;

public class parse{
    ParseTree tree=new ParseTree() {
        public RuleContext parent;
        public ArrayList<ParseTree> children;
        public String text;
        public String type;
        public String structure;

        @Override
        public ParseTree getParent() {
            return parent;
        }

        @Override
        public ParseTree getChild(int i) {
            return null;
        }

        public ArrayList<ParseTree> getChildren(int i) {
            return children;
        }

        @Override
        public void setParent(RuleContext ruleContext) {
            this.parent = ruleContext;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> parseTreeVisitor) {
            if (parseTreeVisitor instanceof grmVisitor) return ((grmVisitor<? extends T>) parseTreeVisitor).visit(this);
            else return parseTreeVisitor.visitChildren(new RuleNode() {
                @Override
                public RuleContext getRuleContext() {
                    return this.getRuleContext();
                }

                @Override
                public ParseTree getParent() {
                    return this.getParent();
                }

                @Override
                public ParseTree getChild(int i) {
                    return null;
                }

                @Override
                public void setParent(RuleContext ruleContext) {

                }

                @Override
                public <T> T accept(ParseTreeVisitor<? extends T> parseTreeVisitor) {
                    return null;
                }

                @Override
                public String getText() {
                    return null;
                }

                @Override
                public String toStringTree(Parser parser) {
                    return null;
                }

                @Override
                public Interval getSourceInterval() {
                    return null;
                }

                @Override
                public Object getPayload() {
                    return null;
                }

                @Override
                public int getChildCount() {
                    return 0;
                }

                @Override
                public String toStringTree() {
                    return null;
                }
            });
        }

        @Override
        public String getText() {
            return text;
        }

        @Override
        public String toStringTree(Parser parser) {
            return null;
        }

        @Override
        public Interval getSourceInterval() {
            return null;
        }

        @Override
        public Object getPayload() {
            return null;
        }

        @Override
        public int getChildCount() {
            return children.size();
        }

        @Override
        public String toStringTree() {
            return text + " " + type + " " + structure + "\n";
        }
    };

}