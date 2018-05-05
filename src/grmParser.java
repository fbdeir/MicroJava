// Generated from C:/Users/MSE/IdeaProjects/MicroJava/src\grm.g4 by ANTLR 4.7

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.Set;

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
		TOK_WHILE=13, TOK_PRINT=14, TOK_PROGRAM=15, Minus=16, TOK_COMMA=17, TOK_SEMI=18, 
		TOK_DOT=19, TOK_LB=20, TOK_RB=21, TOK_LCB=22, TOK_RCB=23, TOK_LP=24, TOK_RP=25, 
		TOK_OP_REL=26, TOK_OP_ADD=27, TOK_OP_TIMES=28, TOK_EQ=29, TOK_OP_NE=30, 
		TOK_OP_LT=31, TOK_OP_LE=32, TOK_OP_GT=33, TOK_OP_GE=34, TOK_OP_ASSIGN=35, 
		OP_ADD_PLUS=36, OP_ADD_MINUS=37, OP_MUL_TIMES=38, OP_MUL_DIV=39, OP_MUL_MOD=40, 
		TOK_INVALID_IDENTIFIER=41, TOK_IDENTIFIER=42, TOK_INVALID_CHARLIT=43, 
		TOK_CHARLIT=44, UNRECOGNIZED_SYMBOL=45;
	public static final int
		RULE_program = 0, RULE_prog = 1, RULE_eof = 2, RULE_constDecl = 3, RULE_varDecl = 4, 
		RULE_classDecl = 5, RULE_methodDecl = 6, RULE_formPars = 7, RULE_parsTemp = 8, 
		RULE_block = 9, RULE_rcb = 10, RULE_statement = 11, RULE_printStatement = 12, 
		RULE_ifStatment = 13, RULE_endif = 14, RULE_elseStatement = 15, RULE_endElse = 16, 
		RULE_whileStatement = 17, RULE_returnStatement = 18, RULE_assignment = 19, 
		RULE_assign_helper = 20, RULE_actPars = 21, RULE_condition = 22, RULE_relop = 23, 
		RULE_expr = 24, RULE_term = 25, RULE_factor = 26, RULE_d = 27, RULE_designator = 28, 
		RULE_x = 29, RULE_array_call = 30, RULE_object_call = 31, RULE_varType = 32, 
		RULE_ex = 33, RULE_ident = 34;
	public static final String[] ruleNames = {
		"program", "prog", "eof", "constDecl", "varDecl", "classDecl", "methodDecl", 
		"formPars", "parsTemp", "block", "rcb", "statement", "printStatement", 
		"ifStatment", "endif", "elseStatement", "endElse", "whileStatement", "returnStatement", 
		"assignment", "assign_helper", "actPars", "condition", "relop", "expr", 
		"term", "factor", "d", "designator", "x", "array_call", "object_call", 
		"varType", "ex", "ident"
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

	@Override
	public String getGrammarFileName() { return "grm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    QuadWriter quads=new QuadWriter();
	    int cCount=1;
	    int iCount=1;
	    int aCount=1;
	    int oCount=1;

	    grmLexer lexer;
	    public void setLexer(grmLexer lexer){
				this.lexer=lexer;
		}

	    @Override
			public void enterRule(ParserRuleContext localctx, int state, int ruleIndex) {
	            super.enterRule(localctx, state, ruleIndex);
	            if(ruleNames[ruleIndex].equals("statement")){
	                lexer.isAssign=1;
	            }else
	            if(ruleNames[ruleIndex].equals("assignment")){
	                //System.out.println("asssingment");
	                lexer.isAssign=1;
	            }
	            if(ruleNames[ruleIndex].equals("factor")){
	                //System.out.println("factor");
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
			setState(70);
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
		public RcbContext rcb() {
			return getRuleContext(RcbContext.class,0);
		}
		public EofContext eof() {
			return getRuleContext(EofContext.class,0);
		}
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
			setState(72);
			match(TOK_PROGRAM);
			setState(73);
			match(TOK_IDENTIFIER);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOK_CLASS) | (1L << TOK_FINAL) | (1L << TOK_IDENTIFIER))) != 0)) {
				{
				setState(77);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TOK_FINAL:
					{
					setState(74);
					constDecl();
					}
					break;
				case TOK_IDENTIFIER:
					{
					setState(75);
					varDecl();
					}
					break;
				case TOK_CLASS:
					{
					setState(76);
					classDecl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			match(TOK_LCB);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_VOID || _la==TOK_IDENTIFIER) {
				{
				{
				setState(83);
				methodDecl();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			rcb();
			setState(90);
			eof();
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

	public static class EofContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(grmParser.EOF, 0); }
		public EofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).enterEof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).exitEof(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grmVisitor ) return ((grmVisitor<? extends T>)visitor).visitEof(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EofContext eof() throws RecognitionException {
		EofContext _localctx = new EofContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
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
			setState(94);
			match(TOK_FINAL);
			setState(95);
			varType();
			setState(96);
			match(TOK_IDENTIFIER);
			setState(97);
			match(TOK_OP_ASSIGN);
			setState(98);
			_la = _input.LA(1);
			if ( !(_la==TOK_INTLIT || _la==TOK_CHARLIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(99);
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
		enterRule(_localctx, 8, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			varType();
			setState(102);
			match(TOK_IDENTIFIER);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_COMMA) {
				{
				{
				setState(103);
				match(TOK_COMMA);
				setState(104);
				match(TOK_IDENTIFIER);
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
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
		enterRule(_localctx, 10, RULE_classDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(TOK_CLASS);
			setState(113);
			match(TOK_IDENTIFIER);
			setState(114);
			match(TOK_LCB);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_IDENTIFIER) {
				{
				{
				setState(115);
				varDecl();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
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
		enterRule(_localctx, 12, RULE_methodDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOK_IDENTIFIER:
				{
				setState(123);
				varType();
				}
				break;
			case TOK_VOID:
				{
				setState(124);
				match(TOK_VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(127);
			match(TOK_IDENTIFIER);
			setState(128);
			match(TOK_LP);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOK_IDENTIFIER) {
				{
				setState(129);
				formPars();
				}
			}

			setState(132);
			match(TOK_RP);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_IDENTIFIER) {
				{
				{
				setState(133);
				varDecl();
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
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
		public List<ParsTempContext> parsTemp() {
			return getRuleContexts(ParsTempContext.class);
		}
		public ParsTempContext parsTemp(int i) {
			return getRuleContext(ParsTempContext.class,i);
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
		enterRule(_localctx, 14, RULE_formPars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			parsTemp();
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_COMMA) {
				{
				{
				setState(142);
				match(TOK_COMMA);
				setState(143);
				parsTemp();
				}
				}
				setState(148);
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

	public static class ParsTempContext extends ParserRuleContext {
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public TerminalNode TOK_IDENTIFIER() { return getToken(grmParser.TOK_IDENTIFIER, 0); }
		public ParsTempContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parsTemp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).enterParsTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).exitParsTemp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grmVisitor ) return ((grmVisitor<? extends T>)visitor).visitParsTemp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParsTempContext parsTemp() throws RecognitionException {
		ParsTempContext _localctx = new ParsTempContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parsTemp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			varType();
			setState(150);
			match(TOK_IDENTIFIER);
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
		public RcbContext rcb() {
			return getRuleContext(RcbContext.class,0);
		}
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
		enterRule(_localctx, 18, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(TOK_LCB);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOK_IF) | (1L << TOK_READ) | (1L << TOK_RETURN) | (1L << TOK_WHILE) | (1L << TOK_PRINT) | (1L << TOK_SEMI) | (1L << TOK_LCB) | (1L << TOK_IDENTIFIER))) != 0)) {
				{
				{
				setState(153);
				statement();
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159);
			rcb();
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

	public static class RcbContext extends ParserRuleContext {
		public TerminalNode TOK_RCB() { return getToken(grmParser.TOK_RCB, 0); }
		public RcbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rcb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).enterRcb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).exitRcb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grmVisitor ) return ((grmVisitor<? extends T>)visitor).visitRcb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RcbContext rcb() throws RecognitionException {
		RcbContext _localctx = new RcbContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_rcb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
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
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public IfStatmentContext ifStatment() {
			return getRuleContext(IfStatmentContext.class,0);
		}
		public List<ElseStatementContext> elseStatement() {
			return getRuleContexts(ElseStatementContext.class);
		}
		public ElseStatementContext elseStatement(int i) {
			return getRuleContext(ElseStatementContext.class,i);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public TerminalNode TOK_READ() { return getToken(grmParser.TOK_READ, 0); }
		public TerminalNode TOK_LP() { return getToken(grmParser.TOK_LP, 0); }
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public TerminalNode TOK_RP() { return getToken(grmParser.TOK_RP, 0); }
		public TerminalNode TOK_SEMI() { return getToken(grmParser.TOK_SEMI, 0); }
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
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
		enterRule(_localctx, 22, RULE_statement);
		try {
			int _alt;
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOK_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				assignment();
				}
				break;
			case TOK_IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				ifStatment();
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(165);
						elseStatement();
						}
						} 
					}
					setState(170);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				}
				break;
			case TOK_WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				whileStatement();
				}
				break;
			case TOK_RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				returnStatement();
				}
				break;
			case TOK_READ:
				enterOuterAlt(_localctx, 5);
				{
				setState(173);
				match(TOK_READ);
				setState(174);
				match(TOK_LP);
				setState(175);
				designator();
				setState(176);
				match(TOK_RP);
				setState(177);
				match(TOK_SEMI);
				}
				break;
			case TOK_PRINT:
				enterOuterAlt(_localctx, 6);
				{
				setState(179);
				printStatement();
				}
				break;
			case TOK_LCB:
				enterOuterAlt(_localctx, 7);
				{
				setState(180);
				block();
				}
				break;
			case TOK_SEMI:
				enterOuterAlt(_localctx, 8);
				{
				setState(181);
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

	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode TOK_PRINT() { return getToken(grmParser.TOK_PRINT, 0); }
		public TerminalNode TOK_LP() { return getToken(grmParser.TOK_LP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TOK_RP() { return getToken(grmParser.TOK_RP, 0); }
		public TerminalNode TOK_SEMI() { return getToken(grmParser.TOK_SEMI, 0); }
		public TerminalNode TOK_COMMA() { return getToken(grmParser.TOK_COMMA, 0); }
		public TerminalNode TOK_INTLIT() { return getToken(grmParser.TOK_INTLIT, 0); }
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grmVisitor ) return ((grmVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_printStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(TOK_PRINT);
			setState(185);
			match(TOK_LP);
			setState(186);
			expr();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOK_COMMA) {
				{
				setState(187);
				match(TOK_COMMA);
				setState(188);
				match(TOK_INTLIT);
				}
			}

			setState(191);
			match(TOK_RP);
			setState(192);
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

	public static class IfStatmentContext extends ParserRuleContext {
		public TerminalNode TOK_IF() { return getToken(grmParser.TOK_IF, 0); }
		public TerminalNode TOK_LP() { return getToken(grmParser.TOK_LP, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode TOK_RP() { return getToken(grmParser.TOK_RP, 0); }
		public TerminalNode TOK_LCB() { return getToken(grmParser.TOK_LCB, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public EndifContext endif() {
			return getRuleContext(EndifContext.class,0);
		}
		public IfStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).enterIfStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).exitIfStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grmVisitor ) return ((grmVisitor<? extends T>)visitor).visitIfStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatmentContext ifStatment() throws RecognitionException {
		IfStatmentContext _localctx = new IfStatmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifStatment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(TOK_IF);
			setState(195);
			match(TOK_LP);
			setState(196);
			condition();
			setState(197);
			match(TOK_RP);
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(198);
				match(TOK_LCB);
				}
				break;
			}
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(201);
					statement();
					}
					} 
				}
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(207);
				endif();
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

	public static class EndifContext extends ParserRuleContext {
		public TerminalNode TOK_RCB() { return getToken(grmParser.TOK_RCB, 0); }
		public EndifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).enterEndif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).exitEndif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grmVisitor ) return ((grmVisitor<? extends T>)visitor).visitEndif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndifContext endif() throws RecognitionException {
		EndifContext _localctx = new EndifContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_endif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
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

	public static class ElseStatementContext extends ParserRuleContext {
		public TerminalNode TOK_ELSE() { return getToken(grmParser.TOK_ELSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode TOK_LCB() { return getToken(grmParser.TOK_LCB, 0); }
		public EndElseContext endElse() {
			return getRuleContext(EndElseContext.class,0);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grmVisitor ) return ((grmVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(TOK_ELSE);
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(213);
				match(TOK_LCB);
				}
				break;
			}
			setState(216);
			statement();
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(217);
				endElse();
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

	public static class EndElseContext extends ParserRuleContext {
		public TerminalNode TOK_RCB() { return getToken(grmParser.TOK_RCB, 0); }
		public EndElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).enterEndElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).exitEndElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grmVisitor ) return ((grmVisitor<? extends T>)visitor).visitEndElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndElseContext endElse() throws RecognitionException {
		EndElseContext _localctx = new EndElseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_endElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode TOK_WHILE() { return getToken(grmParser.TOK_WHILE, 0); }
		public TerminalNode TOK_LP() { return getToken(grmParser.TOK_LP, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode TOK_RP() { return getToken(grmParser.TOK_RP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grmVisitor ) return ((grmVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(TOK_WHILE);
			setState(223);
			match(TOK_LP);
			setState(224);
			condition();
			setState(225);
			match(TOK_RP);
			setState(226);
			statement();
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode TOK_RETURN() { return getToken(grmParser.TOK_RETURN, 0); }
		public TerminalNode TOK_SEMI() { return getToken(grmParser.TOK_SEMI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grmVisitor ) return ((grmVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(TOK_RETURN);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOK_INTLIT) | (1L << TOK_NEW) | (1L << Minus) | (1L << TOK_LP) | (1L << TOK_IDENTIFIER) | (1L << TOK_CHARLIT))) != 0)) {
				{
				setState(229);
				expr();
				}
			}

			setState(232);
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

	public static class AssignmentContext extends ParserRuleContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public TerminalNode TOK_SEMI() { return getToken(grmParser.TOK_SEMI, 0); }
		public Assign_helperContext assign_helper() {
			return getRuleContext(Assign_helperContext.class,0);
		}
		public ActParsContext actPars() {
			return getRuleContext(ActParsContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grmVisitor ) return ((grmVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			designator();
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOK_OP_ASSIGN:
				{
				setState(235);
				assign_helper();
				}
				break;
			case TOK_LP:
				{
				setState(236);
				actPars();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(239);
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

	public static class Assign_helperContext extends ParserRuleContext {
		public TerminalNode TOK_OP_ASSIGN() { return getToken(grmParser.TOK_OP_ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Assign_helperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_helper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).enterAssign_helper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).exitAssign_helper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grmVisitor ) return ((grmVisitor<? extends T>)visitor).visitAssign_helper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_helperContext assign_helper() throws RecognitionException {
		Assign_helperContext _localctx = new Assign_helperContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assign_helper);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(TOK_OP_ASSIGN);
			setState(242);
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
		enterRule(_localctx, 42, RULE_actPars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(TOK_LP);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOK_INTLIT) | (1L << TOK_NEW) | (1L << Minus) | (1L << TOK_LP) | (1L << TOK_IDENTIFIER) | (1L << TOK_CHARLIT))) != 0)) {
				{
				setState(245);
				expr();
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TOK_COMMA) {
					{
					{
					setState(246);
					match(TOK_COMMA);
					setState(247);
					expr();
					}
					}
					setState(252);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(255);
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
		enterRule(_localctx, 44, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			expr();
			setState(258);
			relop();
			setState(259);
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
		enterRule(_localctx, 46, RULE_relop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
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
		public TerminalNode Minus() { return getToken(grmParser.Minus, 0); }
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
		enterRule(_localctx, 48, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Minus) {
				{
				setState(263);
				match(Minus);
				}
			}

			setState(266);
			term();
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_OP_ADD) {
				{
				{
				setState(267);
				match(TOK_OP_ADD);
				setState(268);
				term();
				}
				}
				setState(273);
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
		enterRule(_localctx, 50, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			factor();
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_OP_TIMES) {
				{
				{
				setState(275);
				match(TOK_OP_TIMES);
				setState(276);
				factor();
				}
				}
				setState(281);
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
		public DContext d() {
			return getRuleContext(DContext.class,0);
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
		enterRule(_localctx, 52, RULE_factor);
		try {
			setState(291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOK_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				d();
				}
				break;
			case TOK_INTLIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				match(TOK_INTLIT);
				}
				break;
			case TOK_CHARLIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				match(TOK_CHARLIT);
				}
				break;
			case TOK_NEW:
				enterOuterAlt(_localctx, 4);
				{
				setState(285);
				match(TOK_NEW);
				setState(286);
				x();
				}
				break;
			case TOK_LP:
				enterOuterAlt(_localctx, 5);
				{
				setState(287);
				match(TOK_LP);
				setState(288);
				expr();
				setState(289);
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

	public static class DContext extends ParserRuleContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public ActParsContext actPars() {
			return getRuleContext(ActParsContext.class,0);
		}
		public DContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_d; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).enterD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).exitD(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grmVisitor ) return ((grmVisitor<? extends T>)visitor).visitD(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DContext d() throws RecognitionException {
		DContext _localctx = new DContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_d);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			designator();
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOK_LP) {
				{
				setState(294);
				actPars();
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
		public List<ExContext> ex() {
			return getRuleContexts(ExContext.class);
		}
		public ExContext ex(int i) {
			return getRuleContext(ExContext.class,i);
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
		enterRule(_localctx, 56, RULE_designator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(TOK_IDENTIFIER);
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_DOT || _la==TOK_LB) {
				{
				setState(304);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TOK_DOT:
					{
					setState(298);
					match(TOK_DOT);
					setState(299);
					match(TOK_IDENTIFIER);
					}
					break;
				case TOK_LB:
					{
					setState(300);
					match(TOK_LB);
					setState(301);
					ex();
					setState(302);
					match(TOK_RB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(308);
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
		public Object_callContext object_call() {
			return getRuleContext(Object_callContext.class,0);
		}
		public Array_callContext array_call() {
			return getRuleContext(Array_callContext.class,0);
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
		enterRule(_localctx, 58, RULE_x);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(TOK_IDENTIFIER);
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(310);
				object_call();
				}
				break;
			case 2:
				{
				setState(311);
				array_call();
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

	public static class Array_callContext extends ParserRuleContext {
		public List<TerminalNode> TOK_LB() { return getTokens(grmParser.TOK_LB); }
		public TerminalNode TOK_LB(int i) {
			return getToken(grmParser.TOK_LB, i);
		}
		public List<TerminalNode> TOK_RB() { return getTokens(grmParser.TOK_RB); }
		public TerminalNode TOK_RB(int i) {
			return getToken(grmParser.TOK_RB, i);
		}
		public List<ExContext> ex() {
			return getRuleContexts(ExContext.class);
		}
		public ExContext ex(int i) {
			return getRuleContext(ExContext.class,i);
		}
		public Array_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).enterArray_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).exitArray_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grmVisitor ) return ((grmVisitor<? extends T>)visitor).visitArray_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_callContext array_call() throws RecognitionException {
		Array_callContext _localctx = new Array_callContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_array_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_LB) {
				{
				{
				setState(314);
				match(TOK_LB);
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOK_INTLIT) | (1L << TOK_NEW) | (1L << Minus) | (1L << TOK_LP) | (1L << TOK_IDENTIFIER) | (1L << TOK_CHARLIT))) != 0)) {
					{
					setState(315);
					ex();
					}
				}

				setState(318);
				match(TOK_RB);
				}
				}
				setState(323);
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

	public static class Object_callContext extends ParserRuleContext {
		public TerminalNode TOK_LP() { return getToken(grmParser.TOK_LP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TOK_RP() { return getToken(grmParser.TOK_RP, 0); }
		public Object_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).enterObject_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).exitObject_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grmVisitor ) return ((grmVisitor<? extends T>)visitor).visitObject_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Object_callContext object_call() throws RecognitionException {
		Object_callContext _localctx = new Object_callContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_object_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOK_LP) {
				{
				setState(324);
				match(TOK_LP);
				setState(325);
				expr();
				setState(326);
				match(TOK_RP);
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

	public static class VarTypeContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
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
		enterRule(_localctx, 64, RULE_varType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			ident();
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

	public static class ExContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).enterEx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).exitEx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grmVisitor ) return ((grmVisitor<? extends T>)visitor).visitEx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExContext ex() throws RecognitionException {
		ExContext _localctx = new ExContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_ex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
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

	public static class IdentContext extends ParserRuleContext {
		public TerminalNode TOK_IDENTIFIER() { return getToken(grmParser.TOK_IDENTIFIER, 0); }
		public TerminalNode TOK_LB() { return getToken(grmParser.TOK_LB, 0); }
		public TerminalNode TOK_RB() { return getToken(grmParser.TOK_RB, 0); }
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmListener ) ((grmListener)listener).exitIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grmVisitor ) return ((grmVisitor<? extends T>)visitor).visitIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_ident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(TOK_IDENTIFIER);
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOK_LB) {
				{
				setState(335);
				match(TOK_LB);
				setState(336);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u0156\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3P\n\3\f\3\16\3"+
		"S\13\3\3\3\3\3\7\3W\n\3\f\3\16\3Z\13\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6l\n\6\f\6\16\6o\13\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\7\7w\n\7\f\7\16\7z\13\7\3\7\3\7\3\b\3\b\5\b\u0080\n\b\3\b\3"+
		"\b\3\b\5\b\u0085\n\b\3\b\3\b\7\b\u0089\n\b\f\b\16\b\u008c\13\b\3\b\3\b"+
		"\3\t\3\t\3\t\7\t\u0093\n\t\f\t\16\t\u0096\13\t\3\n\3\n\3\n\3\13\3\13\7"+
		"\13\u009d\n\13\f\13\16\13\u00a0\13\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\7"+
		"\r\u00a9\n\r\f\r\16\r\u00ac\13\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\5\r\u00b9\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u00c0\n\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u00ca\n\17\3\17\7\17\u00cd\n\17\f"+
		"\17\16\17\u00d0\13\17\3\17\5\17\u00d3\n\17\3\20\3\20\3\21\3\21\5\21\u00d9"+
		"\n\21\3\21\3\21\5\21\u00dd\n\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\5\24\u00e9\n\24\3\24\3\24\3\25\3\25\3\25\5\25\u00f0\n\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u00fb\n\27\f\27\16\27"+
		"\u00fe\13\27\5\27\u0100\n\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\32\5\32\u010b\n\32\3\32\3\32\3\32\7\32\u0110\n\32\f\32\16\32\u0113\13"+
		"\32\3\33\3\33\3\33\7\33\u0118\n\33\f\33\16\33\u011b\13\33\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0126\n\34\3\35\3\35\5\35\u012a"+
		"\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u0133\n\36\f\36\16\36\u0136"+
		"\13\36\3\37\3\37\3\37\5\37\u013b\n\37\3 \3 \5 \u013f\n \3 \7 \u0142\n"+
		" \f \16 \u0145\13 \3!\3!\3!\3!\5!\u014b\n!\3\"\3\"\3#\3#\3$\3$\3$\5$\u0154"+
		"\n$\3$\2\2%\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDF\2\3\4\2\6\6..\2\u015e\2H\3\2\2\2\4J\3\2\2\2\6^\3\2\2\2\b`\3\2"+
		"\2\2\ng\3\2\2\2\fr\3\2\2\2\16\177\3\2\2\2\20\u008f\3\2\2\2\22\u0097\3"+
		"\2\2\2\24\u009a\3\2\2\2\26\u00a3\3\2\2\2\30\u00b8\3\2\2\2\32\u00ba\3\2"+
		"\2\2\34\u00c4\3\2\2\2\36\u00d4\3\2\2\2 \u00d6\3\2\2\2\"\u00de\3\2\2\2"+
		"$\u00e0\3\2\2\2&\u00e6\3\2\2\2(\u00ec\3\2\2\2*\u00f3\3\2\2\2,\u00f6\3"+
		"\2\2\2.\u0103\3\2\2\2\60\u0107\3\2\2\2\62\u010a\3\2\2\2\64\u0114\3\2\2"+
		"\2\66\u0125\3\2\2\28\u0127\3\2\2\2:\u012b\3\2\2\2<\u0137\3\2\2\2>\u0143"+
		"\3\2\2\2@\u014a\3\2\2\2B\u014c\3\2\2\2D\u014e\3\2\2\2F\u0150\3\2\2\2H"+
		"I\5\4\3\2I\3\3\2\2\2JK\7\21\2\2KQ\7,\2\2LP\5\b\5\2MP\5\n\6\2NP\5\f\7\2"+
		"OL\3\2\2\2OM\3\2\2\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2"+
		"SQ\3\2\2\2TX\7\30\2\2UW\5\16\b\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2"+
		"\2Y[\3\2\2\2ZX\3\2\2\2[\\\5\26\f\2\\]\5\6\4\2]\5\3\2\2\2^_\7\2\2\3_\7"+
		"\3\2\2\2`a\7\b\2\2ab\5B\"\2bc\7,\2\2cd\7%\2\2de\t\2\2\2ef\7\24\2\2f\t"+
		"\3\2\2\2gh\5B\"\2hm\7,\2\2ij\7\23\2\2jl\7,\2\2ki\3\2\2\2lo\3\2\2\2mk\3"+
		"\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\7\24\2\2q\13\3\2\2\2rs\7\7\2\2"+
		"st\7,\2\2tx\7\30\2\2uw\5\n\6\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2"+
		"y{\3\2\2\2zx\3\2\2\2{|\7\31\2\2|\r\3\2\2\2}\u0080\5B\"\2~\u0080\7\16\2"+
		"\2\177}\3\2\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\7,\2\2\u0082"+
		"\u0084\7\32\2\2\u0083\u0085\5\20\t\2\u0084\u0083\3\2\2\2\u0084\u0085\3"+
		"\2\2\2\u0085\u0086\3\2\2\2\u0086\u008a\7\33\2\2\u0087\u0089\5\n\6\2\u0088"+
		"\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\5\24\13\2\u008e"+
		"\17\3\2\2\2\u008f\u0094\5\22\n\2\u0090\u0091\7\23\2\2\u0091\u0093\5\22"+
		"\n\2\u0092\u0090\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\21\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\5B\"\2"+
		"\u0098\u0099\7,\2\2\u0099\23\3\2\2\2\u009a\u009e\7\30\2\2\u009b\u009d"+
		"\5\30\r\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2"+
		"\u009e\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2"+
		"\5\26\f\2\u00a2\25\3\2\2\2\u00a3\u00a4\7\31\2\2\u00a4\27\3\2\2\2\u00a5"+
		"\u00b9\5(\25\2\u00a6\u00aa\5\34\17\2\u00a7\u00a9\5 \21\2\u00a8\u00a7\3"+
		"\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00b9\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00b9\5$\23\2\u00ae\u00b9\5&"+
		"\24\2\u00af\u00b0\7\f\2\2\u00b0\u00b1\7\32\2\2\u00b1\u00b2\5:\36\2\u00b2"+
		"\u00b3\7\33\2\2\u00b3\u00b4\7\24\2\2\u00b4\u00b9\3\2\2\2\u00b5\u00b9\5"+
		"\32\16\2\u00b6\u00b9\5\24\13\2\u00b7\u00b9\7\24\2\2\u00b8\u00a5\3\2\2"+
		"\2\u00b8\u00a6\3\2\2\2\u00b8\u00ad\3\2\2\2\u00b8\u00ae\3\2\2\2\u00b8\u00af"+
		"\3\2\2\2\u00b8\u00b5\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9"+
		"\31\3\2\2\2\u00ba\u00bb\7\20\2\2\u00bb\u00bc\7\32\2\2\u00bc\u00bf\5\62"+
		"\32\2\u00bd\u00be\7\23\2\2\u00be\u00c0\7\6\2\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\7\33\2\2\u00c2\u00c3\7"+
		"\24\2\2\u00c3\33\3\2\2\2\u00c4\u00c5\7\n\2\2\u00c5\u00c6\7\32\2\2\u00c6"+
		"\u00c7\5.\30\2\u00c7\u00c9\7\33\2\2\u00c8\u00ca\7\30\2\2\u00c9\u00c8\3"+
		"\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00ce\3\2\2\2\u00cb\u00cd\5\30\r\2\u00cc"+
		"\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d3\5\36\20\2\u00d2"+
		"\u00d1\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\35\3\2\2\2\u00d4\u00d5\7\31\2"+
		"\2\u00d5\37\3\2\2\2\u00d6\u00d8\7\t\2\2\u00d7\u00d9\7\30\2\2\u00d8\u00d7"+
		"\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\5\30\r\2"+
		"\u00db\u00dd\5\"\22\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd!\3"+
		"\2\2\2\u00de\u00df\7\31\2\2\u00df#\3\2\2\2\u00e0\u00e1\7\17\2\2\u00e1"+
		"\u00e2\7\32\2\2\u00e2\u00e3\5.\30\2\u00e3\u00e4\7\33\2\2\u00e4\u00e5\5"+
		"\30\r\2\u00e5%\3\2\2\2\u00e6\u00e8\7\r\2\2\u00e7\u00e9\5\62\32\2\u00e8"+
		"\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\7\24"+
		"\2\2\u00eb\'\3\2\2\2\u00ec\u00ef\5:\36\2\u00ed\u00f0\5*\26\2\u00ee\u00f0"+
		"\5,\27\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f2\7\24\2\2\u00f2)\3\2\2\2\u00f3\u00f4\7%\2\2\u00f4\u00f5\5\62\32"+
		"\2\u00f5+\3\2\2\2\u00f6\u00ff\7\32\2\2\u00f7\u00fc\5\62\32\2\u00f8\u00f9"+
		"\7\23\2\2\u00f9\u00fb\5\62\32\2\u00fa\u00f8\3\2\2\2\u00fb\u00fe\3\2\2"+
		"\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc"+
		"\3\2\2\2\u00ff\u00f7\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0102\7\33\2\2\u0102-\3\2\2\2\u0103\u0104\5\62\32\2\u0104\u0105\5\60"+
		"\31\2\u0105\u0106\5\62\32\2\u0106/\3\2\2\2\u0107\u0108\7\34\2\2\u0108"+
		"\61\3\2\2\2\u0109\u010b\7\22\2\2\u010a\u0109\3\2\2\2\u010a\u010b\3\2\2"+
		"\2\u010b\u010c\3\2\2\2\u010c\u0111\5\64\33\2\u010d\u010e\7\35\2\2\u010e"+
		"\u0110\5\64\33\2\u010f\u010d\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3"+
		"\2\2\2\u0111\u0112\3\2\2\2\u0112\63\3\2\2\2\u0113\u0111\3\2\2\2\u0114"+
		"\u0119\5\66\34\2\u0115\u0116\7\36\2\2\u0116\u0118\5\66\34\2\u0117\u0115"+
		"\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\65\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u0126\58\35\2\u011d\u0126\7\6\2"+
		"\2\u011e\u0126\7.\2\2\u011f\u0120\7\13\2\2\u0120\u0126\5<\37\2\u0121\u0122"+
		"\7\32\2\2\u0122\u0123\5\62\32\2\u0123\u0124\7\33\2\2\u0124\u0126\3\2\2"+
		"\2\u0125\u011c\3\2\2\2\u0125\u011d\3\2\2\2\u0125\u011e\3\2\2\2\u0125\u011f"+
		"\3\2\2\2\u0125\u0121\3\2\2\2\u0126\67\3\2\2\2\u0127\u0129\5:\36\2\u0128"+
		"\u012a\5,\27\2\u0129\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a9\3\2\2\2"+
		"\u012b\u0134\7,\2\2\u012c\u012d\7\25\2\2\u012d\u0133\7,\2\2\u012e\u012f"+
		"\7\26\2\2\u012f\u0130\5D#\2\u0130\u0131\7\27\2\2\u0131\u0133\3\2\2\2\u0132"+
		"\u012c\3\2\2\2\u0132\u012e\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2"+
		"\2\2\u0134\u0135\3\2\2\2\u0135;\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u013a"+
		"\7,\2\2\u0138\u013b\5@!\2\u0139\u013b\5> \2\u013a\u0138\3\2\2\2\u013a"+
		"\u0139\3\2\2\2\u013b=\3\2\2\2\u013c\u013e\7\26\2\2\u013d\u013f\5D#\2\u013e"+
		"\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\7\27"+
		"\2\2\u0141\u013c\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143"+
		"\u0144\3\2\2\2\u0144?\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u0147\7\32\2\2"+
		"\u0147\u0148\5\62\32\2\u0148\u0149\7\33\2\2\u0149\u014b\3\2\2\2\u014a"+
		"\u0146\3\2\2\2\u014a\u014b\3\2\2\2\u014bA\3\2\2\2\u014c\u014d\5F$\2\u014d"+
		"C\3\2\2\2\u014e\u014f\5\62\32\2\u014fE\3\2\2\2\u0150\u0153\7,\2\2\u0151"+
		"\u0152\7\26\2\2\u0152\u0154\7\27\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3"+
		"\2\2\2\u0154G\3\2\2\2$OQXmx\177\u0084\u008a\u0094\u009e\u00aa\u00b8\u00bf"+
		"\u00c9\u00ce\u00d2\u00d8\u00dc\u00e8\u00ef\u00fc\u00ff\u010a\u0111\u0119"+
		"\u0125\u0129\u0132\u0134\u013a\u013e\u0143\u014a\u0153";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}