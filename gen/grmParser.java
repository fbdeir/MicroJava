// Generated from C:/Users/MSE/IdeaProjects/MicroJava/src\grm.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WhiteSpace=1, Comments=2, Unknown=3, TOK_INTLIT=4, TOK_CLASS=5, TOK_FINAL=6, 
		TOK_ELSE=7, TOK_IF=8, TOK_NEW=9, TOK_READ=10, TOK_RETURN=11, TOK_VOID=12, 
		TOK_WHILE=13, TOK_PRINT=14, TOK_PROGRAM=15, TOK_COMMA=16, TOK_SEMI=17, 
		TOK_DOT=18, TOK_LB=19, TOK_RB=20, TOK_LCB=21, TOK_RCB=22, TOK_LP=23, TOK_RP=24, 
		TOK_OP_REL=25, TOK_OP_ADD=26, TOK_OP_TIMES=27, TOK_EQ=28, TOK_OP_NE=29, 
		TOK_OP_LT=30, TOK_OP_LE=31, TOK_OP_GT=32, TOK_OP_GE=33, TOK_OP_ASSIGN=34, 
		OP_ADD_PLUS=35, OP_ADD_MINUS=36, OP_MUL_TIMES=37, OP_MUL_DIV=38, OP_MUL_MOD=39, 
		TOK_INVALID_IDENTIFIER=40, TOK_IDENTIFIER=41, TOK_INVALID_CHARLIT=42, 
		TOK_CHARLIT=43, UNRECOGNIZED_SYMBOL=44;
	public static final int
		RULE_program = 0, RULE_prog = 1, RULE_varDecl = 2, RULE_constDecl = 3, 
		RULE_classDecl = 4, RULE_methodDecl = 5, RULE_formPars = 6, RULE_block = 7, 
		RULE_statement = 8, RULE_actPars = 9, RULE_condition = 10, RULE_relop = 11, 
		RULE_expr = 12, RULE_term = 13, RULE_factor = 14, RULE_designator = 15, 
		RULE_x = 16, RULE_varType = 17;
	public static final String[] ruleNames = {
		"program", "prog", "varDecl", "constDecl", "classDecl", "methodDecl", 
		"formPars", "block", "statement", "actPars", "condition", "relop", "expr", 
		"term", "factor", "designator", "x", "varType"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, "'class'", "'final'", "'else'", "'if'", 
		"'new'", "'read'", "'return'", "'void'", "'while'", "'print'", "'program'", 
		"','", "';'", "'.'", "'['", "']'", "'{'", "'}'", "'('", "')'", null, null, 
		null, "'=='", "'!='", "'<'", null, "'>'", null, "'='", "'+'", "'-'", "'*'", 
		"'/'", "'%'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WhiteSpace", "Comments", "Unknown", "TOK_INTLIT", "TOK_CLASS", 
		"TOK_FINAL", "TOK_ELSE", "TOK_IF", "TOK_NEW", "TOK_READ", "TOK_RETURN", 
		"TOK_VOID", "TOK_WHILE", "TOK_PRINT", "TOK_PROGRAM", "TOK_COMMA", "TOK_SEMI", 
		"TOK_DOT", "TOK_LB", "TOK_RB", "TOK_LCB", "TOK_RCB", "TOK_LP", "TOK_RP", 
		"TOK_OP_REL", "TOK_OP_ADD", "TOK_OP_TIMES", "TOK_EQ", "TOK_OP_NE", "TOK_OP_LT", 
		"TOK_OP_LE", "TOK_OP_GT", "TOK_OP_GE", "TOK_OP_ASSIGN", "OP_ADD_PLUS", 
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

	@Override
	public String getGrammarFileName() { return "grm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	 public static Stack<Stack<ASTNode>> tempStack=new Stack<Stack<ASTNode>>(); //list of children of the current subroot
	 Stack<ASTNode> nodeStack=new Stack<ASTNode>(); //all subtrees
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
	    public void addTempStack(String type, String name){
	     		                  Stack<ASTNode> temp=new Stack<>();
	     		                  temp.push(new ASTNode(type, name));
	     		                  tempStack.push(temp);
	     					}
	     				public void printSymbolTable(){
	     					Set<Integer> keys=symbolTable.SymbolHashTable().keySet();
	     	                int line=0;
	     	                for(Integer i: keys){
	     	                    SymbolTableNode n = (SymbolTableNode) symbolTable.SymbolHashTable().get(i);
	     	                    while(n != null){
	     		                    System.out.println(line+": "+n.name+", "+n.structure+", scope: "+n.scope+", type: "+n.type);
	     	                        n=n.child;
	     	                        line++;
	     	                    }
	     	                }

	     				}

	public grmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grmVisitor ) return ((grmVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			prog();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode TOK_PROGRAM() { return getToken(grmParser.TOK_PROGRAM, 0); }
		public TerminalNode TOK_IDENTIFIER() { return getToken(grmParser.TOK_IDENTIFIER, 0); }
		public TerminalNode TOK_LCB() { return getToken(grmParser.TOK_LCB, 0); }
		public TerminalNode TOK_RCB() { return getToken(grmParser.TOK_RCB, 0); }
		public TerminalNode EOF() { return getToken(grmParser.EOF, 0); }
		public List<ConstDeclContext> constDecl() {
			return getRuleContexts(ConstDeclContext.class);
		}
		public ConstDeclContext constDecl(int i) {
			return getRuleContext(ConstDeclContext.class,i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<ClassDeclContext> classDecl() {
			return getRuleContexts(ClassDeclContext.class);
		}
		public ClassDeclContext classDecl(int i) {
			return getRuleContext(ClassDeclContext.class,i);
		}
		public List<MethodDeclContext> methodDecl() {
			return getRuleContexts(MethodDeclContext.class);
		}
		public MethodDeclContext methodDecl(int i) {
			return getRuleContext(MethodDeclContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grmVisitor ) return ((grmVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(TOK_PROGRAM);
			setState(39);
			match(TOK_IDENTIFIER);
			SymbolHashTable.put(getText());
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOK_CLASS) | (1L << TOK_FINAL) | (1L << TOK_IDENTIFIER))) != 0)) {
				{
				setState(44);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TOK_FINAL:
					{
					setState(41);
					constDecl();
					}
					break;
				case TOK_IDENTIFIER:
					{
					setState(42);
					varDecl();
					}
					break;
				case TOK_CLASS:
					{
					setState(43);
					classDecl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			match(TOK_LCB);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_VOID || _la==TOK_IDENTIFIER) {
				{
				{
				setState(50);
				methodDecl();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			match(TOK_RCB);
			setState(57);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclContext extends ParserRuleContext {
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public List<TerminalNode> TOK_IDENTIFIER() { return getTokens(grmParser.TOK_IDENTIFIER); }
		public TerminalNode TOK_IDENTIFIER(int i) {
			return getToken(grmParser.TOK_IDENTIFIER, i);
		}
		public TerminalNode TOK_SEMI() { return getToken(grmParser.TOK_SEMI, 0); }
		public List<TerminalNode> TOK_COMMA() { return getTokens(grmParser.TOK_COMMA); }
		public TerminalNode TOK_COMMA(int i) {
			return getToken(grmParser.TOK_COMMA, i);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grmVisitor ) return ((grmVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			varType();
			setState(60);
			match(TOK_IDENTIFIER);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_COMMA) {
				{
				{
				setState(61);
				match(TOK_COMMA);
				setState(62);
				match(TOK_IDENTIFIER);
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			match(TOK_SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstDeclContext extends ParserRuleContext {
		public TerminalNode TOK_FINAL() { return getToken(grmParser.TOK_FINAL, 0); }
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public TerminalNode TOK_IDENTIFIER() { return getToken(grmParser.TOK_IDENTIFIER, 0); }
		public TerminalNode TOK_OP_ASSIGN() { return getToken(grmParser.TOK_OP_ASSIGN, 0); }
		public TerminalNode TOK_SEMI() { return getToken(grmParser.TOK_SEMI, 0); }
		public TerminalNode TOK_INTLIT() { return getToken(grmParser.TOK_INTLIT, 0); }
		public TerminalNode TOK_CHARLIT() { return getToken(grmParser.TOK_CHARLIT, 0); }
		public ConstDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).enterConstDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).exitConstDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grmVisitor ) return ((grmVisitor<? extends T>)visitor).visitConstDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclContext constDecl() throws RecognitionException {
		ConstDeclContext _localctx = new ConstDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_constDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(TOK_FINAL);
			setState(71);
			varType();
			setState(72);
			match(TOK_IDENTIFIER);
			setState(73);
			match(TOK_OP_ASSIGN);
			setState(74);
			_la = _input.LA(1);
			if ( !(_la==TOK_INTLIT || _la==TOK_CHARLIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(75);
			match(TOK_SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclContext extends ParserRuleContext {
		public TerminalNode TOK_CLASS() { return getToken(grmParser.TOK_CLASS, 0); }
		public TerminalNode TOK_IDENTIFIER() { return getToken(grmParser.TOK_IDENTIFIER, 0); }
		public TerminalNode TOK_LCB() { return getToken(grmParser.TOK_LCB, 0); }
		public TerminalNode TOK_RCB() { return getToken(grmParser.TOK_RCB, 0); }
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public ClassDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).enterClassDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).exitClassDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grmVisitor ) return ((grmVisitor<? extends T>)visitor).visitClassDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclContext classDecl() throws RecognitionException {
		ClassDeclContext _localctx = new ClassDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(TOK_CLASS);
			setState(78);
			match(TOK_IDENTIFIER);
			setState(79);
			match(TOK_LCB);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_IDENTIFIER) {
				{
				{
				setState(80);
				varDecl();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			match(TOK_RCB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclContext extends ParserRuleContext {
		public TerminalNode TOK_IDENTIFIER() { return getToken(grmParser.TOK_IDENTIFIER, 0); }
		public TerminalNode TOK_LP() { return getToken(grmParser.TOK_LP, 0); }
		public TerminalNode TOK_RP() { return getToken(grmParser.TOK_RP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public TerminalNode TOK_VOID() { return getToken(grmParser.TOK_VOID, 0); }
		public FormParsContext formPars() {
			return getRuleContext(FormParsContext.class,0);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public MethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).enterMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).exitMethodDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grmVisitor ) return ((grmVisitor<? extends T>)visitor).visitMethodDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_methodDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOK_IDENTIFIER:
				{
				setState(88);
				varType();
				}
				break;
			case TOK_VOID:
				{
				setState(89);
				match(TOK_VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(92);
			match(TOK_IDENTIFIER);
			setState(93);
			match(TOK_LP);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOK_IDENTIFIER) {
				{
				setState(94);
				formPars();
				}
			}

			setState(97);
			match(TOK_RP);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_IDENTIFIER) {
				{
				{
				setState(98);
				varDecl();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormParsContext extends ParserRuleContext {
		public List<VarTypeContext> varType() {
			return getRuleContexts(VarTypeContext.class);
		}
		public VarTypeContext varType(int i) {
			return getRuleContext(VarTypeContext.class,i);
		}
		public List<TerminalNode> TOK_IDENTIFIER() { return getTokens(grmParser.TOK_IDENTIFIER); }
		public TerminalNode TOK_IDENTIFIER(int i) {
			return getToken(grmParser.TOK_IDENTIFIER, i);
		}
		public List<TerminalNode> TOK_COMMA() { return getTokens(grmParser.TOK_COMMA); }
		public TerminalNode TOK_COMMA(int i) {
			return getToken(grmParser.TOK_COMMA, i);
		}
		public FormParsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formPars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).enterFormPars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).exitFormPars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grmVisitor ) return ((grmVisitor<? extends T>)visitor).visitFormPars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormParsContext formPars() throws RecognitionException {
		FormParsContext _localctx = new FormParsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_formPars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			varType();
			setState(107);
			match(TOK_IDENTIFIER);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_COMMA) {
				{
				{
				setState(108);
				match(TOK_COMMA);
				setState(109);
				varType();
				setState(110);
				match(TOK_IDENTIFIER);
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode TOK_LCB() { return getToken(grmParser.TOK_LCB, 0); }
		public TerminalNode TOK_RCB() { return getToken(grmParser.TOK_RCB, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grmVisitor ) return ((grmVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(TOK_LCB);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOK_IF) | (1L << TOK_READ) | (1L << TOK_RETURN) | (1L << TOK_WHILE) | (1L << TOK_PRINT) | (1L << TOK_SEMI) | (1L << TOK_LCB) | (1L << TOK_IDENTIFIER))) != 0)) {
				{
				{
				setState(118);
				statement();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			match(TOK_RCB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public TerminalNode TOK_SEMI() { return getToken(grmParser.TOK_SEMI, 0); }
		public TerminalNode TOK_OP_ASSIGN() { return getToken(grmParser.TOK_OP_ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ActParsContext actPars() {
			return getRuleContext(ActParsContext.class,0);
		}
		public TerminalNode TOK_IF() { return getToken(grmParser.TOK_IF, 0); }
		public TerminalNode TOK_LP() { return getToken(grmParser.TOK_LP, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode TOK_RP() { return getToken(grmParser.TOK_RP, 0); }
		public List<TerminalNode> TOK_LCB() { return getTokens(grmParser.TOK_LCB); }
		public TerminalNode TOK_LCB(int i) {
			return getToken(grmParser.TOK_LCB, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> TOK_RCB() { return getTokens(grmParser.TOK_RCB); }
		public TerminalNode TOK_RCB(int i) {
			return getToken(grmParser.TOK_RCB, i);
		}
		public List<TerminalNode> TOK_ELSE() { return getTokens(grmParser.TOK_ELSE); }
		public TerminalNode TOK_ELSE(int i) {
			return getToken(grmParser.TOK_ELSE, i);
		}
		public TerminalNode TOK_WHILE() { return getToken(grmParser.TOK_WHILE, 0); }
		public TerminalNode TOK_RETURN() { return getToken(grmParser.TOK_RETURN, 0); }
		public TerminalNode TOK_READ() { return getToken(grmParser.TOK_READ, 0); }
		public TerminalNode TOK_PRINT() { return getToken(grmParser.TOK_PRINT, 0); }
		public TerminalNode TOK_COMMA() { return getToken(grmParser.TOK_COMMA, 0); }
		public TerminalNode TOK_INTLIT() { return getToken(grmParser.TOK_INTLIT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grmVisitor ) return ((grmVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOK_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				designator();
				setState(130);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TOK_OP_ASSIGN:
					{
					setState(127);
					match(TOK_OP_ASSIGN);
					setState(128);
					expr();
					}
					break;
				case TOK_LP:
					{
					setState(129);
					actPars();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(132);
				match(TOK_SEMI);
				}
				break;
			case TOK_IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(TOK_IF);
				setState(135);
				match(TOK_LP);
				setState(136);
				condition();
				setState(137);
				match(TOK_RP);
				setState(139);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(138);
					match(TOK_LCB);
					}
					break;
				}
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(141);
						statement();
						}
						} 
					}
					setState(146);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(148);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(147);
					match(TOK_RCB);
					}
					break;
				}
				setState(160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(150);
						match(TOK_ELSE);
						setState(152);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
						case 1:
							{
							setState(151);
							match(TOK_LCB);
							}
							break;
						}
						setState(154);
						statement();
						setState(156);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
						case 1:
							{
							setState(155);
							match(TOK_RCB);
							}
							break;
						}
						}
						} 
					}
					setState(162);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				}
				break;
			case TOK_WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				match(TOK_WHILE);
				setState(164);
				match(TOK_LP);
				setState(165);
				condition();
				setState(166);
				match(TOK_RP);
				setState(167);
				statement();
				}
				break;
			case TOK_RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				match(TOK_RETURN);
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOK_INTLIT) | (1L << TOK_NEW) | (1L << TOK_LP) | (1L << OP_ADD_MINUS) | (1L << TOK_IDENTIFIER) | (1L << TOK_CHARLIT))) != 0)) {
					{
					setState(170);
					expr();
					}
				}

				setState(173);
				match(TOK_SEMI);
				}
				break;
			case TOK_READ:
				enterOuterAlt(_localctx, 5);
				{
				setState(174);
				match(TOK_READ);
				setState(175);
				match(TOK_LP);
				setState(176);
				designator();
				setState(177);
				match(TOK_RP);
				setState(178);
				match(TOK_SEMI);
				}
				break;
			case TOK_PRINT:
				enterOuterAlt(_localctx, 6);
				{
				setState(180);
				match(TOK_PRINT);
				setState(181);
				match(TOK_LP);
				setState(182);
				expr();
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TOK_COMMA) {
					{
					setState(183);
					match(TOK_COMMA);
					setState(184);
					match(TOK_INTLIT);
					}
				}

				setState(187);
				match(TOK_RP);
				setState(188);
				match(TOK_SEMI);
				}
				break;
			case TOK_LCB:
				enterOuterAlt(_localctx, 7);
				{
				setState(190);
				block();
				}
				break;
			case TOK_SEMI:
				enterOuterAlt(_localctx, 8);
				{
				setState(191);
				match(TOK_SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActParsContext extends ParserRuleContext {
		public TerminalNode TOK_LP() { return getToken(grmParser.TOK_LP, 0); }
		public TerminalNode TOK_RP() { return getToken(grmParser.TOK_RP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> TOK_COMMA() { return getTokens(grmParser.TOK_COMMA); }
		public TerminalNode TOK_COMMA(int i) {
			return getToken(grmParser.TOK_COMMA, i);
		}
		public ActParsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actPars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).enterActPars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).exitActPars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grmVisitor ) return ((grmVisitor<? extends T>)visitor).visitActPars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActParsContext actPars() throws RecognitionException {
		ActParsContext _localctx = new ActParsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_actPars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(TOK_LP);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOK_INTLIT) | (1L << TOK_NEW) | (1L << TOK_LP) | (1L << OP_ADD_MINUS) | (1L << TOK_IDENTIFIER) | (1L << TOK_CHARLIT))) != 0)) {
				{
				setState(195);
				expr();
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TOK_COMMA) {
					{
					{
					setState(196);
					match(TOK_COMMA);
					setState(197);
					expr();
					}
					}
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(205);
			match(TOK_RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grmVisitor ) return ((grmVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			expr();
			setState(208);
			relop();
			setState(209);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelopContext extends ParserRuleContext {
		public TerminalNode TOK_OP_REL() { return getToken(grmParser.TOK_OP_REL, 0); }
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).enterRelop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).exitRelop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grmVisitor ) return ((grmVisitor<? extends T>)visitor).visitRelop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_relop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(TOK_OP_REL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> TOK_OP_ADD() { return getTokens(grmParser.TOK_OP_ADD); }
		public TerminalNode TOK_OP_ADD(int i) {
			return getToken(grmParser.TOK_OP_ADD, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grmVisitor ) return ((grmVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ADD_MINUS) {
				{
				setState(213);
				match(OP_ADD_MINUS);
				}
			}

			setState(216);
			term();
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_OP_ADD) {
				{
				{
				setState(217);
				match(TOK_OP_ADD);
				setState(218);
				term();
				}
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> TOK_OP_TIMES() { return getTokens(grmParser.TOK_OP_TIMES); }
		public TerminalNode TOK_OP_TIMES(int i) {
			return getToken(grmParser.TOK_OP_TIMES, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grmVisitor ) return ((grmVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			factor();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_OP_TIMES) {
				{
				{
				setState(225);
				match(TOK_OP_TIMES);
				setState(226);
				factor();
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public ActParsContext actPars() {
			return getRuleContext(ActParsContext.class,0);
		}
		public TerminalNode TOK_INTLIT() { return getToken(grmParser.TOK_INTLIT, 0); }
		public TerminalNode TOK_CHARLIT() { return getToken(grmParser.TOK_CHARLIT, 0); }
		public TerminalNode TOK_NEW() { return getToken(grmParser.TOK_NEW, 0); }
		public XContext x() {
			return getRuleContext(XContext.class,0);
		}
		public TerminalNode TOK_LP() { return getToken(grmParser.TOK_LP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TOK_RP() { return getToken(grmParser.TOK_RP, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grmVisitor ) return ((grmVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_factor);
		int _la;
		try {
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOK_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				designator();
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TOK_LP) {
					{
					setState(233);
					actPars();
					}
				}

				}
				break;
			case TOK_INTLIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				match(TOK_INTLIT);
				}
				break;
			case TOK_CHARLIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(237);
				match(TOK_CHARLIT);
				}
				break;
			case TOK_NEW:
				enterOuterAlt(_localctx, 4);
				{
				setState(238);
				match(TOK_NEW);
				setState(239);
				x();
				}
				break;
			case TOK_LP:
				enterOuterAlt(_localctx, 5);
				{
				setState(240);
				match(TOK_LP);
				setState(241);
				expr();
				setState(242);
				match(TOK_RP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DesignatorContext extends ParserRuleContext {
		public List<TerminalNode> TOK_IDENTIFIER() { return getTokens(grmParser.TOK_IDENTIFIER); }
		public TerminalNode TOK_IDENTIFIER(int i) {
			return getToken(grmParser.TOK_IDENTIFIER, i);
		}
		public List<TerminalNode> TOK_DOT() { return getTokens(grmParser.TOK_DOT); }
		public TerminalNode TOK_DOT(int i) {
			return getToken(grmParser.TOK_DOT, i);
		}
		public List<TerminalNode> TOK_LB() { return getTokens(grmParser.TOK_LB); }
		public TerminalNode TOK_LB(int i) {
			return getToken(grmParser.TOK_LB, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> TOK_RB() { return getTokens(grmParser.TOK_RB); }
		public TerminalNode TOK_RB(int i) {
			return getToken(grmParser.TOK_RB, i);
		}
		public DesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).enterDesignator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).exitDesignator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grmVisitor ) return ((grmVisitor<? extends T>)visitor).visitDesignator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignatorContext designator() throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_designator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(TOK_IDENTIFIER);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_DOT || _la==TOK_LB) {
				{
				setState(253);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TOK_DOT:
					{
					setState(247);
					match(TOK_DOT);
					setState(248);
					match(TOK_IDENTIFIER);
					}
					break;
				case TOK_LB:
					{
					setState(249);
					match(TOK_LB);
					setState(250);
					expr();
					setState(251);
					match(TOK_RB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class XContext extends ParserRuleContext {
		public TerminalNode TOK_IDENTIFIER() { return getToken(grmParser.TOK_IDENTIFIER, 0); }
		public TerminalNode TOK_LP() { return getToken(grmParser.TOK_LP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TOK_RP() { return getToken(grmParser.TOK_RP, 0); }
		public List<TerminalNode> TOK_LB() { return getTokens(grmParser.TOK_LB); }
		public TerminalNode TOK_LB(int i) {
			return getToken(grmParser.TOK_LB, i);
		}
		public List<TerminalNode> TOK_RB() { return getTokens(grmParser.TOK_RB); }
		public TerminalNode TOK_RB(int i) {
			return getToken(grmParser.TOK_RB, i);
		}
		public XContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_x; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).enterX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).exitX(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grmVisitor ) return ((grmVisitor<? extends T>)visitor).visitX(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XContext x() throws RecognitionException {
		XContext _localctx = new XContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_x);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(TOK_IDENTIFIER);
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TOK_LP) {
					{
					setState(259);
					match(TOK_LP);
					setState(260);
					expr();
					setState(261);
					match(TOK_RP);
					}
				}

				}
				break;
			case 2:
				{
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TOK_LB) {
					{
					{
					setState(265);
					match(TOK_LB);
					setState(267);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOK_INTLIT) | (1L << TOK_NEW) | (1L << TOK_LP) | (1L << OP_ADD_MINUS) | (1L << TOK_IDENTIFIER) | (1L << TOK_CHARLIT))) != 0)) {
						{
						setState(266);
						expr();
						}
					}

					setState(269);
					match(TOK_RB);
					}
					}
					setState(274);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarTypeContext extends ParserRuleContext {
		public TerminalNode TOK_IDENTIFIER() { return getToken(grmParser.TOK_IDENTIFIER, 0); }
		public TerminalNode TOK_LB() { return getToken(grmParser.TOK_LB, 0); }
		public TerminalNode TOK_RB() { return getToken(grmParser.TOK_RB, 0); }
		public VarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).enterVarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).exitVarType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grmVisitor ) return ((grmVisitor<? extends T>)visitor).visitVarType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarTypeContext varType() throws RecognitionException {
		VarTypeContext _localctx = new VarTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_varType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(TOK_IDENTIFIER);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOK_LB) {
				{
				setState(278);
				match(TOK_LB);
				setState(279);
				match(TOK_RB);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u011d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3/\n\3\f\3\16\3\62\13\3\3"+
		"\3\3\3\7\3\66\n\3\f\3\16\39\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4B\n\4"+
		"\f\4\16\4E\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7"+
		"\6T\n\6\f\6\16\6W\13\6\3\6\3\6\3\7\3\7\5\7]\n\7\3\7\3\7\3\7\5\7b\n\7\3"+
		"\7\3\7\7\7f\n\7\f\7\16\7i\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\bs\n"+
		"\b\f\b\16\bv\13\b\3\t\3\t\7\tz\n\t\f\t\16\t}\13\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\5\n\u0085\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008e\n\n\3\n\7\n\u0091"+
		"\n\n\f\n\16\n\u0094\13\n\3\n\5\n\u0097\n\n\3\n\3\n\5\n\u009b\n\n\3\n\3"+
		"\n\5\n\u009f\n\n\7\n\u00a1\n\n\f\n\16\n\u00a4\13\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u00ae\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u00bc\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u00c3\n\n\3\13\3\13\3\13\3"+
		"\13\7\13\u00c9\n\13\f\13\16\13\u00cc\13\13\5\13\u00ce\n\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\16\5\16\u00d9\n\16\3\16\3\16\3\16\7\16\u00de"+
		"\n\16\f\16\16\16\u00e1\13\16\3\17\3\17\3\17\7\17\u00e6\n\17\f\17\16\17"+
		"\u00e9\13\17\3\20\3\20\5\20\u00ed\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\5\20\u00f7\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0100"+
		"\n\21\f\21\16\21\u0103\13\21\3\22\3\22\3\22\3\22\3\22\5\22\u010a\n\22"+
		"\3\22\3\22\5\22\u010e\n\22\3\22\7\22\u0111\n\22\f\22\16\22\u0114\13\22"+
		"\5\22\u0116\n\22\3\23\3\23\3\23\5\23\u011b\n\23\3\23\2\2\24\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$\2\3\4\2\6\6--\2\u0136\2&\3\2\2\2\4("+
		"\3\2\2\2\6=\3\2\2\2\bH\3\2\2\2\nO\3\2\2\2\f\\\3\2\2\2\16l\3\2\2\2\20w"+
		"\3\2\2\2\22\u00c2\3\2\2\2\24\u00c4\3\2\2\2\26\u00d1\3\2\2\2\30\u00d5\3"+
		"\2\2\2\32\u00d8\3\2\2\2\34\u00e2\3\2\2\2\36\u00f6\3\2\2\2 \u00f8\3\2\2"+
		"\2\"\u0104\3\2\2\2$\u0117\3\2\2\2&\'\5\4\3\2\'\3\3\2\2\2()\7\21\2\2)*"+
		"\7+\2\2*\60\b\3\1\2+/\5\b\5\2,/\5\6\4\2-/\5\n\6\2.+\3\2\2\2.,\3\2\2\2"+
		".-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62\60\3"+
		"\2\2\2\63\67\7\27\2\2\64\66\5\f\7\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3"+
		"\2\2\2\678\3\2\2\28:\3\2\2\29\67\3\2\2\2:;\7\30\2\2;<\7\2\2\3<\5\3\2\2"+
		"\2=>\5$\23\2>C\7+\2\2?@\7\22\2\2@B\7+\2\2A?\3\2\2\2BE\3\2\2\2CA\3\2\2"+
		"\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2FG\7\23\2\2G\7\3\2\2\2HI\7\b\2\2IJ\5$"+
		"\23\2JK\7+\2\2KL\7$\2\2LM\t\2\2\2MN\7\23\2\2N\t\3\2\2\2OP\7\7\2\2PQ\7"+
		"+\2\2QU\7\27\2\2RT\5\6\4\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VX\3"+
		"\2\2\2WU\3\2\2\2XY\7\30\2\2Y\13\3\2\2\2Z]\5$\23\2[]\7\16\2\2\\Z\3\2\2"+
		"\2\\[\3\2\2\2]^\3\2\2\2^_\7+\2\2_a\7\31\2\2`b\5\16\b\2a`\3\2\2\2ab\3\2"+
		"\2\2bc\3\2\2\2cg\7\32\2\2df\5\6\4\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3"+
		"\2\2\2hj\3\2\2\2ig\3\2\2\2jk\5\20\t\2k\r\3\2\2\2lm\5$\23\2mt\7+\2\2no"+
		"\7\22\2\2op\5$\23\2pq\7+\2\2qs\3\2\2\2rn\3\2\2\2sv\3\2\2\2tr\3\2\2\2t"+
		"u\3\2\2\2u\17\3\2\2\2vt\3\2\2\2w{\7\27\2\2xz\5\22\n\2yx\3\2\2\2z}\3\2"+
		"\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\7\30\2\2\177\21\3\2"+
		"\2\2\u0080\u0084\5 \21\2\u0081\u0082\7$\2\2\u0082\u0085\5\32\16\2\u0083"+
		"\u0085\5\24\13\2\u0084\u0081\3\2\2\2\u0084\u0083\3\2\2\2\u0085\u0086\3"+
		"\2\2\2\u0086\u0087\7\23\2\2\u0087\u00c3\3\2\2\2\u0088\u0089\7\n\2\2\u0089"+
		"\u008a\7\31\2\2\u008a\u008b\5\26\f\2\u008b\u008d\7\32\2\2\u008c\u008e"+
		"\7\27\2\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0092\3\2\2\2"+
		"\u008f\u0091\5\22\n\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090"+
		"\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0095"+
		"\u0097\7\30\2\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u00a2\3"+
		"\2\2\2\u0098\u009a\7\t\2\2\u0099\u009b\7\27\2\2\u009a\u0099\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\5\22\n\2\u009d\u009f\7"+
		"\30\2\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0"+
		"\u0098\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\u00c3\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\7\17\2\2\u00a6"+
		"\u00a7\7\31\2\2\u00a7\u00a8\5\26\f\2\u00a8\u00a9\7\32\2\2\u00a9\u00aa"+
		"\5\22\n\2\u00aa\u00c3\3\2\2\2\u00ab\u00ad\7\r\2\2\u00ac\u00ae\5\32\16"+
		"\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00c3"+
		"\7\23\2\2\u00b0\u00b1\7\f\2\2\u00b1\u00b2\7\31\2\2\u00b2\u00b3\5 \21\2"+
		"\u00b3\u00b4\7\32\2\2\u00b4\u00b5\7\23\2\2\u00b5\u00c3\3\2\2\2\u00b6\u00b7"+
		"\7\20\2\2\u00b7\u00b8\7\31\2\2\u00b8\u00bb\5\32\16\2\u00b9\u00ba\7\22"+
		"\2\2\u00ba\u00bc\7\6\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00be\7\32\2\2\u00be\u00bf\7\23\2\2\u00bf\u00c3\3"+
		"\2\2\2\u00c0\u00c3\5\20\t\2\u00c1\u00c3\7\23\2\2\u00c2\u0080\3\2\2\2\u00c2"+
		"\u0088\3\2\2\2\u00c2\u00a5\3\2\2\2\u00c2\u00ab\3\2\2\2\u00c2\u00b0\3\2"+
		"\2\2\u00c2\u00b6\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3"+
		"\23\3\2\2\2\u00c4\u00cd\7\31\2\2\u00c5\u00ca\5\32\16\2\u00c6\u00c7\7\22"+
		"\2\2\u00c7\u00c9\5\32\16\2\u00c8\u00c6\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2"+
		"\2\2\u00cd\u00c5\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00d0\7\32\2\2\u00d0\25\3\2\2\2\u00d1\u00d2\5\32\16\2\u00d2\u00d3\5\30"+
		"\r\2\u00d3\u00d4\5\32\16\2\u00d4\27\3\2\2\2\u00d5\u00d6\7\33\2\2\u00d6"+
		"\31\3\2\2\2\u00d7\u00d9\7&\2\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2"+
		"\u00d9\u00da\3\2\2\2\u00da\u00df\5\34\17\2\u00db\u00dc\7\34\2\2\u00dc"+
		"\u00de\5\34\17\2\u00dd\u00db\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3"+
		"\2\2\2\u00df\u00e0\3\2\2\2\u00e0\33\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2"+
		"\u00e7\5\36\20\2\u00e3\u00e4\7\35\2\2\u00e4\u00e6\5\36\20\2\u00e5\u00e3"+
		"\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\35\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00ec\5 \21\2\u00eb\u00ed\5\24\13"+
		"\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00f7\3\2\2\2\u00ee\u00f7"+
		"\7\6\2\2\u00ef\u00f7\7-\2\2\u00f0\u00f1\7\13\2\2\u00f1\u00f7\5\"\22\2"+
		"\u00f2\u00f3\7\31\2\2\u00f3\u00f4\5\32\16\2\u00f4\u00f5\7\32\2\2\u00f5"+
		"\u00f7\3\2\2\2\u00f6\u00ea\3\2\2\2\u00f6\u00ee\3\2\2\2\u00f6\u00ef\3\2"+
		"\2\2\u00f6\u00f0\3\2\2\2\u00f6\u00f2\3\2\2\2\u00f7\37\3\2\2\2\u00f8\u0101"+
		"\7+\2\2\u00f9\u00fa\7\24\2\2\u00fa\u0100\7+\2\2\u00fb\u00fc\7\25\2\2\u00fc"+
		"\u00fd\5\32\16\2\u00fd\u00fe\7\26\2\2\u00fe\u0100\3\2\2\2\u00ff\u00f9"+
		"\3\2\2\2\u00ff\u00fb\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102!\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0115\7+\2\2\u0105"+
		"\u0106\7\31\2\2\u0106\u0107\5\32\16\2\u0107\u0108\7\32\2\2\u0108\u010a"+
		"\3\2\2\2\u0109\u0105\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0116\3\2\2\2\u010b"+
		"\u010d\7\25\2\2\u010c\u010e\5\32\16\2\u010d\u010c\3\2\2\2\u010d\u010e"+
		"\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111\7\26\2\2\u0110\u010b\3\2\2\2"+
		"\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0116"+
		"\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0109\3\2\2\2\u0115\u0112\3\2\2\2\u0116"+
		"#\3\2\2\2\u0117\u011a\7+\2\2\u0118\u0119\7\25\2\2\u0119\u011b\7\26\2\2"+
		"\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b%\3\2\2\2$.\60\67CU\\ag"+
		"t{\u0084\u008d\u0092\u0096\u009a\u009e\u00a2\u00ad\u00bb\u00c2\u00ca\u00cd"+
		"\u00d8\u00df\u00e7\u00ec\u00f6\u00ff\u0101\u0109\u010d\u0112\u0115\u011a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}