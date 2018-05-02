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
		RULE_program = 0, RULE_prog = 1, RULE_constDecl = 2, RULE_varDecl = 3, 
		RULE_classDecl = 4, RULE_methodDecl = 5, RULE_formPars = 6, RULE_parsTemp = 7, 
		RULE_block = 8, RULE_statement = 9, RULE_returnStatement = 10, RULE_assignment = 11, 
		RULE_assign_helper = 12, RULE_actPars = 13, RULE_condition = 14, RULE_relop = 15, 
		RULE_expr = 16, RULE_term = 17, RULE_factor = 18, RULE_designator = 19, 
		RULE_x = 20, RULE_array_call = 21, RULE_object_call = 22, RULE_varType = 23, 
		RULE_ex = 24, RULE_ident = 25;
	public static final String[] ruleNames = {
		"program", "prog", "constDecl", "varDecl", "classDecl", "methodDecl", 
		"formPars", "parsTemp", "block", "statement", "returnStatement", "assignment", 
		"assign_helper", "actPars", "condition", "relop", "expr", "term", "factor", 
		"designator", "x", "array_call", "object_call", "varType", "ex", "ident"
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
			setState(52);
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
			setState(54);
			match(TOK_PROGRAM);
			setState(55);
			match(TOK_IDENTIFIER);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOK_CLASS) | (1L << TOK_FINAL) | (1L << TOK_IDENTIFIER))) != 0)) {
				{
				setState(59);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TOK_FINAL:
					{
					setState(56);
					constDecl();
					}
					break;
				case TOK_IDENTIFIER:
					{
					setState(57);
					varDecl();
					}
					break;
				case TOK_CLASS:
					{
					setState(58);
					classDecl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			match(TOK_LCB);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_VOID || _la==TOK_IDENTIFIER) {
				{
				{
				setState(65);
				methodDecl();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			match(TOK_RCB);
			setState(72);
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
		enterRule(_localctx, 4, RULE_constDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(TOK_FINAL);
			setState(75);
			varType();
			setState(76);
			match(TOK_IDENTIFIER);
			setState(77);
			match(TOK_OP_ASSIGN);
			setState(78);
			_la = _input.LA(1);
			if ( !(_la==TOK_INTLIT || _la==TOK_CHARLIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(79);
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
		enterRule(_localctx, 6, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			varType();
			setState(82);
			match(TOK_IDENTIFIER);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_COMMA) {
				{
				{
				setState(83);
				match(TOK_COMMA);
				setState(84);
				match(TOK_IDENTIFIER);
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
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
			setState(92);
			match(TOK_CLASS);
			setState(93);
			match(TOK_IDENTIFIER);
			setState(94);
			match(TOK_LCB);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_IDENTIFIER) {
				{
				{
				setState(95);
				varDecl();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
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
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOK_IDENTIFIER:
				{
				setState(103);
				varType();
				}
				break;
			case TOK_VOID:
				{
				setState(104);
				match(TOK_VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(107);
			match(TOK_IDENTIFIER);
			setState(108);
			match(TOK_LP);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOK_IDENTIFIER) {
				{
				setState(109);
				formPars();
				}
			}

			setState(112);
			match(TOK_RP);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_IDENTIFIER) {
				{
				{
				setState(113);
				varDecl();
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
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
		enterRule(_localctx, 12, RULE_formPars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			parsTemp();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_COMMA) {
				{
				{
				setState(122);
				match(TOK_COMMA);
				setState(123);
				parsTemp();
				}
				}
				setState(128);
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
		enterRule(_localctx, 14, RULE_parsTemp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			varType();
			setState(130);
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
		enterRule(_localctx, 16, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(TOK_LCB);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOK_IF) | (1L << TOK_READ) | (1L << TOK_RETURN) | (1L << TOK_WHILE) | (1L << TOK_PRINT) | (1L << TOK_SEMI) | (1L << TOK_LCB) | (1L << TOK_IDENTIFIER))) != 0)) {
				{
				{
				setState(133);
				statement();
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
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
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public TerminalNode TOK_READ() { return getToken(grmParser.TOK_READ, 0); }
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public TerminalNode TOK_SEMI() { return getToken(grmParser.TOK_SEMI, 0); }
		public TerminalNode TOK_PRINT() { return getToken(grmParser.TOK_PRINT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
		enterRule(_localctx, 18, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOK_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				assignment();
				}
				break;
			case TOK_IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(TOK_IF);
				setState(143);
				match(TOK_LP);
				setState(144);
				condition();
				setState(145);
				match(TOK_RP);
				setState(147);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(146);
					match(TOK_LCB);
					}
					break;
				}
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(149);
						statement();
						}
						} 
					}
					setState(154);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(156);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(155);
					match(TOK_RCB);
					}
					break;
				}
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(158);
						match(TOK_ELSE);
						setState(160);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
						case 1:
							{
							setState(159);
							match(TOK_LCB);
							}
							break;
						}
						setState(162);
						statement();
						setState(164);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
						case 1:
							{
							setState(163);
							match(TOK_RCB);
							}
							break;
						}
						}
						} 
					}
					setState(170);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				}
				break;
			case TOK_WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				match(TOK_WHILE);
				setState(172);
				match(TOK_LP);
				setState(173);
				condition();
				setState(174);
				match(TOK_RP);
				setState(175);
				statement();
				}
				break;
			case TOK_RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				returnStatement();
				}
				break;
			case TOK_READ:
				enterOuterAlt(_localctx, 5);
				{
				setState(178);
				match(TOK_READ);
				setState(179);
				match(TOK_LP);
				setState(180);
				designator();
				setState(181);
				match(TOK_RP);
				setState(182);
				match(TOK_SEMI);
				}
				break;
			case TOK_PRINT:
				enterOuterAlt(_localctx, 6);
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
				break;
			case TOK_LCB:
				enterOuterAlt(_localctx, 7);
				{
				setState(194);
				block();
				}
				break;
			case TOK_SEMI:
				enterOuterAlt(_localctx, 8);
				{
				setState(195);
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
		enterRule(_localctx, 20, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(TOK_RETURN);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOK_INTLIT) | (1L << TOK_NEW) | (1L << Minus) | (1L << TOK_LP) | (1L << TOK_IDENTIFIER) | (1L << TOK_CHARLIT))) != 0)) {
				{
				setState(199);
				expr();
				}
			}

			setState(202);
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
		enterRule(_localctx, 22, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			designator();
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOK_OP_ASSIGN:
				{
				setState(205);
				assign_helper();
				}
				break;
			case TOK_LP:
				{
				setState(206);
				actPars();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(209);
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
		enterRule(_localctx, 24, RULE_assign_helper);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(TOK_OP_ASSIGN);
			setState(212);
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
		enterRule(_localctx, 26, RULE_actPars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(TOK_LP);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOK_INTLIT) | (1L << TOK_NEW) | (1L << Minus) | (1L << TOK_LP) | (1L << TOK_IDENTIFIER) | (1L << TOK_CHARLIT))) != 0)) {
				{
				setState(215);
				expr();
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TOK_COMMA) {
					{
					{
					setState(216);
					match(TOK_COMMA);
					setState(217);
					expr();
					}
					}
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(225);
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
		enterRule(_localctx, 28, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			expr();
			setState(228);
			relop();
			setState(229);
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
		enterRule(_localctx, 30, RULE_relop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
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
		enterRule(_localctx, 32, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Minus) {
				{
				setState(233);
				match(Minus);
				}
			}

			setState(236);
			term();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_OP_ADD) {
				{
				{
				setState(237);
				match(TOK_OP_ADD);
				setState(238);
				term();
				}
				}
				setState(243);
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
		enterRule(_localctx, 34, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			factor();
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_OP_TIMES) {
				{
				{
				setState(245);
				match(TOK_OP_TIMES);
				setState(246);
				factor();
				}
				}
				setState(251);
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
		enterRule(_localctx, 36, RULE_factor);
		int _la;
		try {
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOK_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				designator();
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TOK_LP) {
					{
					setState(253);
					actPars();
					}
				}

				}
				break;
			case TOK_INTLIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				match(TOK_INTLIT);
				}
				break;
			case TOK_CHARLIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(257);
				match(TOK_CHARLIT);
				}
				break;
			case TOK_NEW:
				enterOuterAlt(_localctx, 4);
				{
				setState(258);
				match(TOK_NEW);
				setState(259);
				x();
				}
				break;
			case TOK_LP:
				enterOuterAlt(_localctx, 5);
				{
				setState(260);
				match(TOK_LP);
				setState(261);
				expr();
				setState(262);
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
		enterRule(_localctx, 38, RULE_designator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(TOK_IDENTIFIER);
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_DOT || _la==TOK_LB) {
				{
				setState(273);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TOK_DOT:
					{
					setState(267);
					match(TOK_DOT);
					setState(268);
					match(TOK_IDENTIFIER);
					}
					break;
				case TOK_LB:
					{
					setState(269);
					match(TOK_LB);
					setState(270);
					ex();
					setState(271);
					match(TOK_RB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(277);
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
		enterRule(_localctx, 40, RULE_x);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(TOK_IDENTIFIER);
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(279);
				object_call();
				}
				break;
			case 2:
				{
				setState(280);
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
		enterRule(_localctx, 42, RULE_array_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOK_LB) {
				{
				{
				setState(283);
				match(TOK_LB);
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOK_INTLIT) | (1L << TOK_NEW) | (1L << Minus) | (1L << TOK_LP) | (1L << TOK_IDENTIFIER) | (1L << TOK_CHARLIT))) != 0)) {
					{
					setState(284);
					ex();
					}
				}

				setState(287);
				match(TOK_RB);
				}
				}
				setState(292);
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
		enterRule(_localctx, 44, RULE_object_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOK_LP) {
				{
				setState(293);
				match(TOK_LP);
				setState(294);
				expr();
				setState(295);
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
		enterRule(_localctx, 46, RULE_varType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
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
		enterRule(_localctx, 48, RULE_ex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
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
		enterRule(_localctx, 50, RULE_ident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(TOK_IDENTIFIER);
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOK_LB) {
				{
				setState(304);
				match(TOK_LB);
				setState(305);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u0137\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3>\n\3\f\3\16\3A\13"+
		"\3\3\3\3\3\7\3E\n\3\f\3\16\3H\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\7\5X\n\5\f\5\16\5[\13\5\3\5\3\5\3\6\3\6\3\6\3\6\7"+
		"\6c\n\6\f\6\16\6f\13\6\3\6\3\6\3\7\3\7\5\7l\n\7\3\7\3\7\3\7\5\7q\n\7\3"+
		"\7\3\7\7\7u\n\7\f\7\16\7x\13\7\3\7\3\7\3\b\3\b\3\b\7\b\177\n\b\f\b\16"+
		"\b\u0082\13\b\3\t\3\t\3\t\3\n\3\n\7\n\u0089\n\n\f\n\16\n\u008c\13\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0096\n\13\3\13\7\13\u0099\n"+
		"\13\f\13\16\13\u009c\13\13\3\13\5\13\u009f\n\13\3\13\3\13\5\13\u00a3\n"+
		"\13\3\13\3\13\5\13\u00a7\n\13\7\13\u00a9\n\13\f\13\16\13\u00ac\13\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u00c0\n\13\3\13\3\13\3\13\3\13\3\13\5\13\u00c7"+
		"\n\13\3\f\3\f\5\f\u00cb\n\f\3\f\3\f\3\r\3\r\3\r\5\r\u00d2\n\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u00dd\n\17\f\17\16\17\u00e0\13"+
		"\17\5\17\u00e2\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22\5\22"+
		"\u00ed\n\22\3\22\3\22\3\22\7\22\u00f2\n\22\f\22\16\22\u00f5\13\22\3\23"+
		"\3\23\3\23\7\23\u00fa\n\23\f\23\16\23\u00fd\13\23\3\24\3\24\5\24\u0101"+
		"\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u010b\n\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\7\25\u0114\n\25\f\25\16\25\u0117\13\25\3\26"+
		"\3\26\3\26\5\26\u011c\n\26\3\27\3\27\5\27\u0120\n\27\3\27\7\27\u0123\n"+
		"\27\f\27\16\27\u0126\13\27\3\30\3\30\3\30\3\30\5\30\u012c\n\30\3\31\3"+
		"\31\3\32\3\32\3\33\3\33\3\33\5\33\u0135\n\33\3\33\2\2\34\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\3\4\2\6\6..\2\u0148\2\66"+
		"\3\2\2\2\48\3\2\2\2\6L\3\2\2\2\bS\3\2\2\2\n^\3\2\2\2\fk\3\2\2\2\16{\3"+
		"\2\2\2\20\u0083\3\2\2\2\22\u0086\3\2\2\2\24\u00c6\3\2\2\2\26\u00c8\3\2"+
		"\2\2\30\u00ce\3\2\2\2\32\u00d5\3\2\2\2\34\u00d8\3\2\2\2\36\u00e5\3\2\2"+
		"\2 \u00e9\3\2\2\2\"\u00ec\3\2\2\2$\u00f6\3\2\2\2&\u010a\3\2\2\2(\u010c"+
		"\3\2\2\2*\u0118\3\2\2\2,\u0124\3\2\2\2.\u012b\3\2\2\2\60\u012d\3\2\2\2"+
		"\62\u012f\3\2\2\2\64\u0131\3\2\2\2\66\67\5\4\3\2\67\3\3\2\2\289\7\21\2"+
		"\29?\7,\2\2:>\5\6\4\2;>\5\b\5\2<>\5\n\6\2=:\3\2\2\2=;\3\2\2\2=<\3\2\2"+
		"\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BF\7\30\2\2CE\5\f"+
		"\7\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\7\31"+
		"\2\2JK\7\2\2\3K\5\3\2\2\2LM\7\b\2\2MN\5\60\31\2NO\7,\2\2OP\7%\2\2PQ\t"+
		"\2\2\2QR\7\24\2\2R\7\3\2\2\2ST\5\60\31\2TY\7,\2\2UV\7\23\2\2VX\7,\2\2"+
		"WU\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\7\24"+
		"\2\2]\t\3\2\2\2^_\7\7\2\2_`\7,\2\2`d\7\30\2\2ac\5\b\5\2ba\3\2\2\2cf\3"+
		"\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh\7\31\2\2h\13\3\2\2\2"+
		"il\5\60\31\2jl\7\16\2\2ki\3\2\2\2kj\3\2\2\2lm\3\2\2\2mn\7,\2\2np\7\32"+
		"\2\2oq\5\16\b\2po\3\2\2\2pq\3\2\2\2qr\3\2\2\2rv\7\33\2\2su\5\b\5\2ts\3"+
		"\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2\2\2yz\5\22\n\2z\r"+
		"\3\2\2\2{\u0080\5\20\t\2|}\7\23\2\2}\177\5\20\t\2~|\3\2\2\2\177\u0082"+
		"\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\17\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0083\u0084\5\60\31\2\u0084\u0085\7,\2\2\u0085\21\3\2\2\2\u0086"+
		"\u008a\7\30\2\2\u0087\u0089\5\24\13\2\u0088\u0087\3\2\2\2\u0089\u008c"+
		"\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008d\u008e\7\31\2\2\u008e\23\3\2\2\2\u008f\u00c7\5\30"+
		"\r\2\u0090\u0091\7\n\2\2\u0091\u0092\7\32\2\2\u0092\u0093\5\36\20\2\u0093"+
		"\u0095\7\33\2\2\u0094\u0096\7\30\2\2\u0095\u0094\3\2\2\2\u0095\u0096\3"+
		"\2\2\2\u0096\u009a\3\2\2\2\u0097\u0099\5\24\13\2\u0098\u0097\3\2\2\2\u0099"+
		"\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009e\3\2"+
		"\2\2\u009c\u009a\3\2\2\2\u009d\u009f\7\31\2\2\u009e\u009d\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00aa\3\2\2\2\u00a0\u00a2\7\t\2\2\u00a1\u00a3\7\30"+
		"\2\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a6\5\24\13\2\u00a5\u00a7\7\31\2\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7"+
		"\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a0\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00c7\3\2\2\2\u00ac\u00aa\3\2"+
		"\2\2\u00ad\u00ae\7\17\2\2\u00ae\u00af\7\32\2\2\u00af\u00b0\5\36\20\2\u00b0"+
		"\u00b1\7\33\2\2\u00b1\u00b2\5\24\13\2\u00b2\u00c7\3\2\2\2\u00b3\u00c7"+
		"\5\26\f\2\u00b4\u00b5\7\f\2\2\u00b5\u00b6\7\32\2\2\u00b6\u00b7\5(\25\2"+
		"\u00b7\u00b8\7\33\2\2\u00b8\u00b9\7\24\2\2\u00b9\u00c7\3\2\2\2\u00ba\u00bb"+
		"\7\20\2\2\u00bb\u00bc\7\32\2\2\u00bc\u00bf\5\"\22\2\u00bd\u00be\7\23\2"+
		"\2\u00be\u00c0\7\6\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1"+
		"\3\2\2\2\u00c1\u00c2\7\33\2\2\u00c2\u00c3\7\24\2\2\u00c3\u00c7\3\2\2\2"+
		"\u00c4\u00c7\5\22\n\2\u00c5\u00c7\7\24\2\2\u00c6\u008f\3\2\2\2\u00c6\u0090"+
		"\3\2\2\2\u00c6\u00ad\3\2\2\2\u00c6\u00b3\3\2\2\2\u00c6\u00b4\3\2\2\2\u00c6"+
		"\u00ba\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\25\3\2\2"+
		"\2\u00c8\u00ca\7\r\2\2\u00c9\u00cb\5\"\22\2\u00ca\u00c9\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\7\24\2\2\u00cd\27\3\2\2"+
		"\2\u00ce\u00d1\5(\25\2\u00cf\u00d2\5\32\16\2\u00d0\u00d2\5\34\17\2\u00d1"+
		"\u00cf\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\7\24"+
		"\2\2\u00d4\31\3\2\2\2\u00d5\u00d6\7%\2\2\u00d6\u00d7\5\"\22\2\u00d7\33"+
		"\3\2\2\2\u00d8\u00e1\7\32\2\2\u00d9\u00de\5\"\22\2\u00da\u00db\7\23\2"+
		"\2\u00db\u00dd\5\"\22\2\u00dc\u00da\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2"+
		"\2\2\u00e1\u00d9\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u00e4\7\33\2\2\u00e4\35\3\2\2\2\u00e5\u00e6\5\"\22\2\u00e6\u00e7\5 \21"+
		"\2\u00e7\u00e8\5\"\22\2\u00e8\37\3\2\2\2\u00e9\u00ea\7\34\2\2\u00ea!\3"+
		"\2\2\2\u00eb\u00ed\7\22\2\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00f3\5$\23\2\u00ef\u00f0\7\35\2\2\u00f0\u00f2\5"+
		"$\23\2\u00f1\u00ef\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4#\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00fb\5&\24\2"+
		"\u00f7\u00f8\7\36\2\2\u00f8\u00fa\5&\24\2\u00f9\u00f7\3\2\2\2\u00fa\u00fd"+
		"\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc%\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fe\u0100\5(\25\2\u00ff\u0101\5\34\17\2\u0100\u00ff\3"+
		"\2\2\2\u0100\u0101\3\2\2\2\u0101\u010b\3\2\2\2\u0102\u010b\7\6\2\2\u0103"+
		"\u010b\7.\2\2\u0104\u0105\7\13\2\2\u0105\u010b\5*\26\2\u0106\u0107\7\32"+
		"\2\2\u0107\u0108\5\"\22\2\u0108\u0109\7\33\2\2\u0109\u010b\3\2\2\2\u010a"+
		"\u00fe\3\2\2\2\u010a\u0102\3\2\2\2\u010a\u0103\3\2\2\2\u010a\u0104\3\2"+
		"\2\2\u010a\u0106\3\2\2\2\u010b\'\3\2\2\2\u010c\u0115\7,\2\2\u010d\u010e"+
		"\7\25\2\2\u010e\u0114\7,\2\2\u010f\u0110\7\26\2\2\u0110\u0111\5\62\32"+
		"\2\u0111\u0112\7\27\2\2\u0112\u0114\3\2\2\2\u0113\u010d\3\2\2\2\u0113"+
		"\u010f\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2"+
		"\2\2\u0116)\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u011b\7,\2\2\u0119\u011c"+
		"\5.\30\2\u011a\u011c\5,\27\2\u011b\u0119\3\2\2\2\u011b\u011a\3\2\2\2\u011c"+
		"+\3\2\2\2\u011d\u011f\7\26\2\2\u011e\u0120\5\62\32\2\u011f\u011e\3\2\2"+
		"\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\7\27\2\2\u0122"+
		"\u011d\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2"+
		"\2\2\u0125-\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0128\7\32\2\2\u0128\u0129"+
		"\5\"\22\2\u0129\u012a\7\33\2\2\u012a\u012c\3\2\2\2\u012b\u0127\3\2\2\2"+
		"\u012b\u012c\3\2\2\2\u012c/\3\2\2\2\u012d\u012e\5\64\33\2\u012e\61\3\2"+
		"\2\2\u012f\u0130\5\"\22\2\u0130\63\3\2\2\2\u0131\u0134\7,\2\2\u0132\u0133"+
		"\7\26\2\2\u0133\u0135\7\27\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2"+
		"\u0135\65\3\2\2\2$=?FYdkpv\u0080\u008a\u0095\u009a\u009e\u00a2\u00a6\u00aa"+
		"\u00bf\u00c6\u00ca\u00d1\u00de\u00e1\u00ec\u00f3\u00fb\u0100\u010a\u0113"+
		"\u0115\u011b\u011f\u0124\u012b\u0134";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}