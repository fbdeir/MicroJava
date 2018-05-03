// Generated from C:/Users/MSE/IdeaProjects/MicroJava/src\grm.g4 by ANTLR 4.7

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.Set;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WhiteSpace=1, Comments=2, Unknown=3, TOK_INTLIT=4, TOK_CLASS=5, TOK_FINAL=6, 
		TOK_ELSE=7, TOK_IF=8, TOK_NEW=9, TOK_READ=10, TOK_RETURN=11, TOK_VOID=12, 
		TOK_WHILE=13, TOK_PRINT=14, TOK_PROGRAM=15, Minus=16, TOK_COMMA=17, TOK_SEMI=18, 
		TOK_DOT=19, TOK_LB=20, TOK_RB=21, TOK_LCB=22, TOK_RCB=23, TOK_LP=24, TOK_RP=25, 
		TOK_OP_REL=26, TOK_OP_ADD=27, TOK_OP_TIMES=28, TOK_EQ=29, TOK_OP_NE=30, 
		TOK_OP_LT=31, TOK_OP_LE=32, TOK_OP_GT=33, TOK_OP_GE=34, TOK_OP_ASSIGN=35, 
		OP_ADD_PLUS=36, OP_ADD_MINUS=37, OP_MUL_TIMES=38, OP_MUL_DIV=39, OP_MUL_MOD=40, 
		TOK_INVALID_IDENTIFIER=41, TOK_IDENTIFIER=42, TOK_INVALID_CHARLIT=43, 
		TOK_CHARLIT=44, UNRECOGNIZED_SYMBOL=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WhiteSpace", "Comments", "Unknown", "TOK_INTLIT", "TOK_CLASS", "TOK_FINAL", 
		"TOK_ELSE", "TOK_IF", "TOK_NEW", "TOK_READ", "TOK_RETURN", "TOK_VOID", 
		"TOK_WHILE", "TOK_PRINT", "TOK_PROGRAM", "Minus", "TOK_COMMA", "TOK_SEMI", 
		"TOK_DOT", "TOK_LB", "TOK_RB", "TOK_LCB", "TOK_RCB", "TOK_LP", "TOK_RP", 
		"TOK_OP_REL", "TOK_OP_ADD", "TOK_OP_TIMES", "TOK_EQ", "TOK_OP_NE", "TOK_OP_LT", 
		"TOK_OP_LE", "TOK_OP_GT", "TOK_OP_GE", "TOK_OP_ASSIGN", "OP_ADD_PLUS", 
		"OP_ADD_MINUS", "OP_MUL_TIMES", "OP_MUL_DIV", "OP_MUL_MOD", "TOK_INVALID_IDENTIFIER", 
		"TOK_IDENTIFIER", "TOK_INVALID_CHARLIT", "TOK_CHARLIT", "UNRECOGNIZED_SYMBOL", 
		"LETTER", "DIGIT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, "'class'", "'final'", "'else'", "'if'", 
		"'new'", "'read'", "'return'", "'void'", "'while'", "'print'", "'program'", 
		null, "','", "';'", "'.'", "'['", "']'", "'{'", "'}'", "'('", "')'", null, 
		null, null, "'=='", "'!='", "'<'", null, "'>'", null, "'='", "'+'", null, 
		"'*'", "'/'", "'%'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WhiteSpace", "Comments", "Unknown", "TOK_INTLIT", "TOK_CLASS", 
		"TOK_FINAL", "TOK_ELSE", "TOK_IF", "TOK_NEW", "TOK_READ", "TOK_RETURN", 
		"TOK_VOID", "TOK_WHILE", "TOK_PRINT", "TOK_PROGRAM", "Minus", "TOK_COMMA", 
		"TOK_SEMI", "TOK_DOT", "TOK_LB", "TOK_RB", "TOK_LCB", "TOK_RCB", "TOK_LP", 
		"TOK_RP", "TOK_OP_REL", "TOK_OP_ADD", "TOK_OP_TIMES", "TOK_EQ", "TOK_OP_NE", 
		"TOK_OP_LT", "TOK_OP_LE", "TOK_OP_GT", "TOK_OP_GE", "TOK_OP_ASSIGN", "OP_ADD_PLUS", 
		"OP_ADD_MINUS", "OP_MUL_TIMES", "OP_MUL_DIV", "OP_MUL_MOD", "TOK_INVALID_IDENTIFIER", 
		"TOK_IDENTIFIER", "TOK_INVALID_CHARLIT", "TOK_CHARLIT", "UNRECOGNIZED_SYMBOL"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	    boolean lexicalError=false;
	    public ArrayList<Integer> tracker=new ArrayList<Integer>(){{   add(0);}};;
	    Writer errors=new Writer("errors.txt");
	    Writer symbols=new Writer("Symbol Table");
	    public static Stack<Stack<ASTNode>> tempStack=new Stack<Stack<ASTNode>>(); //list of children of the current subroot
	 	Stack<ASTNode> nodeStack=new Stack<ASTNode>(); //all subtrees
	 	ASTNode Ptree=new ASTNode(); //The root of the program
	 	static String name;
	 	static int scope=0;
	 	static int count=0;
	 	static int isVar=0;
	 	static int isClass=0;
	 	static int isProgram=0;
	 	static int isArray=0;
	 	static int isAssign=0;
	 	static int isMethod=0;
	 	static int isField=0;
	 	static int isFinal=0;
	 	static String methodParams="";
	 	static int isParams=0;
	 	static String currType;
	 	static SymbolHashTable classes=new SymbolHashTable();
	 	static ArrayList<String> varTypes=new ArrayList<String>();
	 	private java.util.Queue<Token> queue = new java.util.LinkedList<Token>();
	 	public static SymbolHashTable symbolTable=new SymbolHashTable();
	 	public SymbolHashTable getSymbolTable(){
	    	 return symbolTable;
	    }
	    public void setTable(){
	        varTypes.add("int");
	        varTypes.add("char");
	        varTypes.add("void");
	        symbolTable.insert("int","int", "preloaded", 0,0);
	        symbolTable.insert("char","char", "preloaded", 0,0);
	        symbolTable.insert("null","null", "preloaded", 0,0);
	        symbolTable.insert("chr","chr", "preloaded", 0,0);
	        symbolTable.insert("ord","ord", "preloaded", 0,0);
	        symbolTable.insert("len","len", "preloaded", 0,0);
	        symbolTable.insert("program","program", "keyword", 0,0);
	        symbolTable.insert("class","class", "keyword", 0,0);
	        symbolTable.insert("if","if", "keyword", 0,0);
	        symbolTable.insert("else","else", "keyword", 0,0);
	        symbolTable.insert("while","while", "keyword", 0,0);
	        symbolTable.insert("read","read", "keyword", 0,0);
	        symbolTable.insert("print","print", "keyword", 0,0);
	        symbolTable.insert("return","return", "keyword", 0,0);
	        symbolTable.insert("void","void", "keyword", 0,0);
	        symbolTable.insert("final","final", "keyword", 0,0);
	        symbolTable.insert("new","new", "keyword", 0,0);
	    }
	     public int lexGetLine(){
	       return getLine();
	     }

	      public SymbolTableNode node;
	      @Override
	      public Token nextToken() {

	            if(!queue.isEmpty()) {
	              return queue.poll();
	            }

	            Token next = super.nextToken();

	            while(next.getType()==WhiteSpace){

	            }
	            if(next.getType() != Unknown) {
	                    if(next.getType()==TOK_LCB){
	                        count++;
	                        scope++;
	                        tracker.add(count);
	                    }else
	                    if(next.getType()==TOK_LCB){
	                        count++;
	                        scope--;
	                        tracker.remove(count);
	                    }else
	                    if(next.getType()==TOK_PROGRAM){
	 		                isProgram=1;
	                        node=new SymbolTableNode();
		                    node.type=getText();
	 		            }else
	 		             if(next.getType()==TOK_FINAL){
	 		                isFinal=1;
	                        node=new SymbolTableNode();
	                        node.isFinal=1;
	 		                node.type=getText();
	 		             }else
	 		             if(next.getType()==TOK_SEMI){
	 		                isVar=0;
	 		                isArray=0;
	 		             }else
	 		             if(next.getType()==TOK_LB){
	 		                 /*isArray=1;
	 		                 //System.out.println(name);
	 		                 checkScopeNode(name).isArray=1;
	 		                 checkScopeNode(name).type+="[]";
	 		                 isVar=0;*/
	 		             }else
	 		             if(next.getType()==TOK_VOID){
	                        isVar=1;
	                        node=new SymbolTableNode();
	                        node.type=getText();
	 		             }else
	 		             if(next.getType()==TOK_IDENTIFIER){
	                            if(varTypes.contains(getText()) && !(isVar==1)){
	                                isVar=1;
	                                node=new SymbolTableNode();
	                                node.type=getText();
	                            }
	                            else if(isVar==1){
	                                if(getText().equals("i")){
	                                    //System.out.println("hello i");
	                                }
	                                if(!checkScope(getText())){
	                                    node.name=getText();
	                                    node.scope=scope;
	                                    node.isArray=0;
	                                    node.structure="IDENTIFIER";
	                                    symbolTable.insert(node);


	                                }
	                                else{
	                                    SymbolTableNode n=checkScopeNode(getText());
	                                    if(n.structure.equals("keyword") || n.structure.equals("preloaded")){
	                                        errors.write(getText()+" is a "+n.structure+ " at line"+getLine()+"\n");
	                                    }else{
	                                        errors.write(getText()+" has already been defined at line"+getLine()+"\n");
	                                    }
	                                }
	                                name=getText();
	                                isVar=0;
	                            }
	                            else if(isClass==1){
	                                if(!checkScope(getText())){
	                                    node.name=getText();
	                                    node.scope=count;
	                                    node.isArray=0;
	                                    node.structure="CLASS";
	                                    symbolTable.insert(node);
	                                    varTypes.add(getText());
	                                }else{
	                                    SymbolTableNode n=checkScopeNode(getText());
	                                    if(n.structure.equals("keyword") || n.structure.equals("preloaded")){
	                                        errors.write(getText()+" is a"+n.structure+" at line "+getLine()+"\n");
	                                    }else{
	                                        errors.write(getText()+" has already been defined at line"+getLine()+"\n");
	                                    }
	                                }
	                                isClass=0;
	                            }else if(isProgram==1){
	                                node.name=getText();
	                                node.scope=count;
	                                node.isArray=0;
	                                node.structure="TOK_PROGRAM";
	                                symbolTable.insert(node);
	                                isProgram=0;
	                            }
	                         //else if(checkScope(getText())){
	                            //if(isAssign==1){
	                            else{
	                                try{
	                                    if((checkScopeNode(getText()).isFinal==1)){
	                                        errors.write(getText()+" is final "+getLine()+"\n");
	                                    }
	                                    else {
	                                        currType=checkScopeNode(getText()).type;
	                                    }
	                                }catch(NullPointerException e){
	                                    if(! (getText().equals("[") || getText().equals("]"))){
	                                        //errors.write(getText()+" is not defined "+getLine()+"\n");
	                                    }
	                                }
	                            }
	                         //}
	 	    	         }

	                //check if class:
	                 else if(next.getType()==TOK_CLASS){
	                    isClass=1;
	                    node=new SymbolTableNode();
	                    node.type="class";
	                 }



	          return next;
	             }


	        StringBuilder builder = new StringBuilder();

	        while(next.getType() == Unknown) {
	          next = super.nextToken();
	        }


	    queue.offer(next);

	    return new CommonToken(Unknown, builder.toString());
	}
	public Boolean checkScope(String name){
	 					   SymbolTableNode n=null;
	 					   if(name.equals("int") ||name.equals("char") || name.equals("null") ||name.equals("chr") ||name.equals("ord")||name.equals("len")||name.equals("program")||name.equals("class")
	 							   ||name.equals("if") ||name.equals("else")||name.equals("while")||name.equals("read")||name.equals("print")||name.equals("return")||name.equals("void")||name.equals("final")||name.equals("new")){
	 					   	return true;
	 					   }

	 					   for(int i=0; i<tracker.size(); i++) {
	 						  // for(Integer temp: set) {
	 							   n = (SymbolTableNode) symbolTable.get(tracker.get(i), name);

	 						//   }
	 						try {
	 							if (n != null)
	 								return true;
	 						}catch(NullPointerException e){
	 								return false;
	 							}
	 						}
	 						return false;

	 			   }
	 			   public SymbolTableNode checkScopeNode(String name){
	 	           	           				   SymbolTableNode n=null;
	 	           	           				   for(int i=0; i<tracker.size(); i++) {
	 	           	           					  // for(Integer temp: set) {
	 	           	           						   n = (SymbolTableNode) symbolTable.get(tracker.get(i), name);
	 	           								   try {
	 	           									   if (n != null)
	 	           										   return n;
	 	           								   }catch(NullPointerException e){
	 	           								   }
	 	           							   }
	 	           	           					return n;

	 	           	           		   }
	                public SymbolTableNode checkNode(String name){
	                 	           	           				   SymbolTableNode n=null;
	                 	           	           					  // for(Integer temp: set) {
	                 	           	           						   n = (SymbolTableNode) symbolTable.get(name);
	                 	           								   try {
	                 	           									   if (n != null)
	                 	           										   return n;
	                 	           								   }catch(NullPointerException e){
	                 	           								   }

	                 	           	           					return n;

	                 	           	           		   }
	public void printSymbolTable(){
	 					Set<Integer> keys=symbolTable.SymbolHashTable().keySet();
	 	                int line=0;
	 	                for(Integer i: keys){
	 	                    SymbolTableNode n = (SymbolTableNode) symbolTable.SymbolHashTable().get(i);
	 	                    while(n != null){
	 	                        if(n.isArray!=1){
	 		                    symbols.write(line+": "+n.name+", "+n.structure+", scope: "+n.scope+", type: "+n.type+Arrays.toString(n.parameters.toArray())+"\n");
	 		                    }else{
	 		                        symbols.write(line+": "+n.name+", "+n.structure+", scope: "+n.scope+", type: "+n.type+"[]"+Arrays.toString(n.parameters.toArray())+"\n");
	 		                    }
	 	                        n=n.child;
	 	                        line++;
	 	                    }
	 	                }
	 				}


	public grmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "grm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0:
			WhiteSpace_action((RuleContext)_localctx, actionIndex);
			break;
		case 1:
			Comments_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			TOK_INTLIT_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WhiteSpace_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void Comments_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}
	private void TOK_INTLIT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:

			long y= Long.parseLong(getText());
			if(y>2147483647){
			//lexicalError=true;
			}


			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u011f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3i\n\3"+
		"\f\3\16\3l\13\3\3\3\3\3\3\3\3\4\3\4\3\5\6\5t\n\5\r\5\16\5u\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00d1\n\33\3\34\3\34"+
		"\5\34\u00d5\n\34\3\35\3\35\3\35\5\35\u00da\n\35\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3("+
		"\3(\3)\3)\3*\3*\3*\3*\3*\5*\u00fd\n*\3+\3+\3+\7+\u0102\n+\f+\16+\u0105"+
		"\13+\3,\3,\5,\u0109\n,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0116\n-\3"+
		"-\3-\3.\3.\3/\3/\3\60\3\60\3j\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\2_\2\3\2\7\5\2\13\f\17\17\"\"\6\2##%&BB``\3\2))\4\2C\\c|\3\2\62;\2"+
		"\u012e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3a\3\2\2\2\5d\3\2\2"+
		"\2\7p\3\2\2\2\ts\3\2\2\2\13y\3\2\2\2\r\177\3\2\2\2\17\u0085\3\2\2\2\21"+
		"\u008a\3\2\2\2\23\u008d\3\2\2\2\25\u0091\3\2\2\2\27\u0096\3\2\2\2\31\u009d"+
		"\3\2\2\2\33\u00a2\3\2\2\2\35\u00a8\3\2\2\2\37\u00ae\3\2\2\2!\u00b6\3\2"+
		"\2\2#\u00b8\3\2\2\2%\u00ba\3\2\2\2\'\u00bc\3\2\2\2)\u00be\3\2\2\2+\u00c0"+
		"\3\2\2\2-\u00c2\3\2\2\2/\u00c4\3\2\2\2\61\u00c6\3\2\2\2\63\u00c8\3\2\2"+
		"\2\65\u00d0\3\2\2\2\67\u00d4\3\2\2\29\u00d9\3\2\2\2;\u00db\3\2\2\2=\u00de"+
		"\3\2\2\2?\u00e1\3\2\2\2A\u00e3\3\2\2\2C\u00e6\3\2\2\2E\u00e8\3\2\2\2G"+
		"\u00eb\3\2\2\2I\u00ed\3\2\2\2K\u00ef\3\2\2\2M\u00f1\3\2\2\2O\u00f3\3\2"+
		"\2\2Q\u00f5\3\2\2\2S\u00fc\3\2\2\2U\u00fe\3\2\2\2W\u0106\3\2\2\2Y\u010c"+
		"\3\2\2\2[\u0119\3\2\2\2]\u011b\3\2\2\2_\u011d\3\2\2\2ab\t\2\2\2bc\b\2"+
		"\2\2c\4\3\2\2\2de\7\61\2\2ef\7\61\2\2fj\3\2\2\2gi\13\2\2\2hg\3\2\2\2i"+
		"l\3\2\2\2jk\3\2\2\2jh\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\7\f\2\2no\b\3\3\2"+
		"o\6\3\2\2\2pq\t\3\2\2q\b\3\2\2\2rt\5_\60\2sr\3\2\2\2tu\3\2\2\2us\3\2\2"+
		"\2uv\3\2\2\2vw\3\2\2\2wx\b\5\4\2x\n\3\2\2\2yz\7e\2\2z{\7n\2\2{|\7c\2\2"+
		"|}\7u\2\2}~\7u\2\2~\f\3\2\2\2\177\u0080\7h\2\2\u0080\u0081\7k\2\2\u0081"+
		"\u0082\7p\2\2\u0082\u0083\7c\2\2\u0083\u0084\7n\2\2\u0084\16\3\2\2\2\u0085"+
		"\u0086\7g\2\2\u0086\u0087\7n\2\2\u0087\u0088\7u\2\2\u0088\u0089\7g\2\2"+
		"\u0089\20\3\2\2\2\u008a\u008b\7k\2\2\u008b\u008c\7h\2\2\u008c\22\3\2\2"+
		"\2\u008d\u008e\7p\2\2\u008e\u008f\7g\2\2\u008f\u0090\7y\2\2\u0090\24\3"+
		"\2\2\2\u0091\u0092\7t\2\2\u0092\u0093\7g\2\2\u0093\u0094\7c\2\2\u0094"+
		"\u0095\7f\2\2\u0095\26\3\2\2\2\u0096\u0097\7t\2\2\u0097\u0098\7g\2\2\u0098"+
		"\u0099\7v\2\2\u0099\u009a\7w\2\2\u009a\u009b\7t\2\2\u009b\u009c\7p\2\2"+
		"\u009c\30\3\2\2\2\u009d\u009e\7x\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7"+
		"k\2\2\u00a0\u00a1\7f\2\2\u00a1\32\3\2\2\2\u00a2\u00a3\7y\2\2\u00a3\u00a4"+
		"\7j\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7n\2\2\u00a6\u00a7\7g\2\2\u00a7"+
		"\34\3\2\2\2\u00a8\u00a9\7r\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab\7k\2\2\u00ab"+
		"\u00ac\7p\2\2\u00ac\u00ad\7v\2\2\u00ad\36\3\2\2\2\u00ae\u00af\7r\2\2\u00af"+
		"\u00b0\7t\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2\7i\2\2\u00b2\u00b3\7t\2\2"+
		"\u00b3\u00b4\7c\2\2\u00b4\u00b5\7o\2\2\u00b5 \3\2\2\2\u00b6\u00b7\7/\2"+
		"\2\u00b7\"\3\2\2\2\u00b8\u00b9\7.\2\2\u00b9$\3\2\2\2\u00ba\u00bb\7=\2"+
		"\2\u00bb&\3\2\2\2\u00bc\u00bd\7\60\2\2\u00bd(\3\2\2\2\u00be\u00bf\7]\2"+
		"\2\u00bf*\3\2\2\2\u00c0\u00c1\7_\2\2\u00c1,\3\2\2\2\u00c2\u00c3\7}\2\2"+
		"\u00c3.\3\2\2\2\u00c4\u00c5\7\177\2\2\u00c5\60\3\2\2\2\u00c6\u00c7\7*"+
		"\2\2\u00c7\62\3\2\2\2\u00c8\u00c9\7+\2\2\u00c9\64\3\2\2\2\u00ca\u00d1"+
		"\5;\36\2\u00cb\u00d1\5=\37\2\u00cc\u00d1\5? \2\u00cd\u00d1\5A!\2\u00ce"+
		"\u00d1\5C\"\2\u00cf\u00d1\5E#\2\u00d0\u00ca\3\2\2\2\u00d0\u00cb\3\2\2"+
		"\2\u00d0\u00cc\3\2\2\2\u00d0\u00cd\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf"+
		"\3\2\2\2\u00d1\66\3\2\2\2\u00d2\u00d5\5I%\2\u00d3\u00d5\5K&\2\u00d4\u00d2"+
		"\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d58\3\2\2\2\u00d6\u00da\5M\'\2\u00d7\u00da"+
		"\5O(\2\u00d8\u00da\5Q)\2\u00d9\u00d6\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9"+
		"\u00d8\3\2\2\2\u00da:\3\2\2\2\u00db\u00dc\7?\2\2\u00dc\u00dd\7?\2\2\u00dd"+
		"<\3\2\2\2\u00de\u00df\7#\2\2\u00df\u00e0\7?\2\2\u00e0>\3\2\2\2\u00e1\u00e2"+
		"\7>\2\2\u00e2@\3\2\2\2\u00e3\u00e4\7>\2\2\u00e4\u00e5\7?\2\2\u00e5B\3"+
		"\2\2\2\u00e6\u00e7\7@\2\2\u00e7D\3\2\2\2\u00e8\u00e9\7>\2\2\u00e9\u00ea"+
		"\7?\2\2\u00eaF\3\2\2\2\u00eb\u00ec\7?\2\2\u00ecH\3\2\2\2\u00ed\u00ee\7"+
		"-\2\2\u00eeJ\3\2\2\2\u00ef\u00f0\7/\2\2\u00f0L\3\2\2\2\u00f1\u00f2\7,"+
		"\2\2\u00f2N\3\2\2\2\u00f3\u00f4\7\61\2\2\u00f4P\3\2\2\2\u00f5\u00f6\7"+
		"\'\2\2\u00f6R\3\2\2\2\u00f7\u00f8\7a\2\2\u00f8\u00fd\5U+\2\u00f9\u00fa"+
		"\5_\60\2\u00fa\u00fb\5U+\2\u00fb\u00fd\3\2\2\2\u00fc\u00f7\3\2\2\2\u00fc"+
		"\u00f9\3\2\2\2\u00fdT\3\2\2\2\u00fe\u0103\5]/\2\u00ff\u0102\5]/\2\u0100"+
		"\u0102\5_\60\2\u0101\u00ff\3\2\2\2\u0101\u0100\3\2\2\2\u0102\u0105\3\2"+
		"\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104V\3\2\2\2\u0105\u0103"+
		"\3\2\2\2\u0106\u0108\7)\2\2\u0107\u0109\5Y-\2\u0108\u0107\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\n\4\2\2\u010bX\3\2\2\2"+
		"\u010c\u0115\7)\2\2\u010d\u0116\5]/\2\u010e\u0116\5_\60\2\u010f\u0110"+
		"\7^\2\2\u0110\u0116\7p\2\2\u0111\u0112\7^\2\2\u0112\u0116\7t\2\2\u0113"+
		"\u0114\7^\2\2\u0114\u0116\7v\2\2\u0115\u010d\3\2\2\2\u0115\u010e\3\2\2"+
		"\2\u0115\u010f\3\2\2\2\u0115\u0111\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0117"+
		"\3\2\2\2\u0117\u0118\7)\2\2\u0118Z\3\2\2\2\u0119\u011a\13\2\2\2\u011a"+
		"\\\3\2\2\2\u011b\u011c\t\5\2\2\u011c^\3\2\2\2\u011d\u011e\t\6\2\2\u011e"+
		"`\3\2\2\2\r\2ju\u00d0\u00d4\u00d9\u00fc\u0101\u0103\u0108\u0115\5\3\2"+
		"\2\3\3\3\3\5\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}