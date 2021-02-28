// Generated from cal.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class calParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WRITE=1, READ=2, MAIN=3, BEGIN=4, END=5, VAR=6, CONST=7, RETURN=8, WHILE=9, 
		SKIP_STATEMENT=10, VOID=11, IS=12, INTEGER=13, BOOLEAN=14, LBR=15, RBR=16, 
		SEMI=17, COLON=18, COMMA=19, IF=20, ELSE=21, ASSIGN=22, ADD=23, MINUS=24, 
		NEG=25, OR=26, AND=27, EQUAL=28, NOTEQUAL=29, LT=30, LTE=31, GT=32, GTE=33, 
		NUMBER=34, BV=35, ID=36, WS=37, COMMENT=38, LINE_COMMENT=39;
	public static final int
		RULE_program = 0, RULE_dec_list = 1, RULE_decl = 2, RULE_var_decl = 3, 
		RULE_const_decl = 4, RULE_function_list = 5, RULE_function = 6, RULE_type = 7, 
		RULE_parameter_list = 8, RULE_nemp_parameter_list = 9, RULE_main = 10, 
		RULE_statement_block = 11, RULE_statement = 12, RULE_expression = 13, 
		RULE_binary_arith_op = 14, RULE_frag = 15, RULE_condition = 16, RULE_comp_op = 17, 
		RULE_arg_list = 18, RULE_nemp_arg_list = 19;
	public static final String[] ruleNames = {
		"program", "dec_list", "decl", "var_decl", "const_decl", "function_list", 
		"function", "type", "parameter_list", "nemp_parameter_list", "main", "statement_block", 
		"statement", "expression", "binary_arith_op", "frag", "condition", "comp_op", 
		"arg_list", "nemp_arg_list"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "'('", "')'", "';'", "':'", "','", null, null, "':='", 
		"'+'", "'-'", "'~'", "'|'", "'&'", "'='", "'!='", "'<'", "'<='", "'>'", 
		"'>='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WRITE", "READ", "MAIN", "BEGIN", "END", "VAR", "CONST", "RETURN", 
		"WHILE", "SKIP_STATEMENT", "VOID", "IS", "INTEGER", "BOOLEAN", "LBR", 
		"RBR", "SEMI", "COLON", "COMMA", "IF", "ELSE", "ASSIGN", "ADD", "MINUS", 
		"NEG", "OR", "AND", "EQUAL", "NOTEQUAL", "LT", "LTE", "GT", "GTE", "NUMBER", 
		"BV", "ID", "WS", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "cal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public calParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Dec_listContext dec_list() {
			return getRuleContext(Dec_listContext.class,0);
		}
		public Function_listContext function_list() {
			return getRuleContext(Function_listContext.class,0);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calVisitor ) return ((calVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			dec_list();
			setState(41);
			function_list();
			setState(42);
			main();
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

	public static class Dec_listContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(calParser.SEMI, 0); }
		public Dec_listContext dec_list() {
			return getRuleContext(Dec_listContext.class,0);
		}
		public Dec_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calVisitor ) return ((calVisitor<? extends T>)visitor).visitDec_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dec_listContext dec_list() throws RecognitionException {
		Dec_listContext _localctx = new Dec_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dec_list);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				decl();
				setState(45);
				match(SEMI);
				setState(46);
				dec_list();
				}
				break;
			case EOF:
			case MAIN:
			case BEGIN:
			case END:
			case WHILE:
			case SKIP_STATEMENT:
			case VOID:
			case INTEGER:
			case BOOLEAN:
			case IF:
			case ELSE:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class DeclContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Const_declContext const_decl() {
			return getRuleContext(Const_declContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calVisitor ) return ((calVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				var_decl();
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				const_decl();
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

	public static class Var_declContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(calParser.VAR, 0); }
		public TerminalNode ID() { return getToken(calParser.ID, 0); }
		public TerminalNode COLON() { return getToken(calParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calVisitor ) return ((calVisitor<? extends T>)visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(VAR);
			setState(56);
			match(ID);
			setState(57);
			match(COLON);
			setState(58);
			type();
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

	public static class Const_declContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(calParser.CONST, 0); }
		public TerminalNode ID() { return getToken(calParser.ID, 0); }
		public TerminalNode COLON() { return getToken(calParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(calParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Const_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calVisitor ) return ((calVisitor<? extends T>)visitor).visitConst_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_declContext const_decl() throws RecognitionException {
		Const_declContext _localctx = new Const_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_const_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(CONST);
			setState(61);
			match(ID);
			setState(62);
			match(COLON);
			setState(63);
			type();
			setState(64);
			match(ASSIGN);
			setState(65);
			expression();
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

	public static class Function_listContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public Function_listContext function_list() {
			return getRuleContext(Function_listContext.class,0);
		}
		public Function_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calVisitor ) return ((calVisitor<? extends T>)visitor).visitFunction_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_listContext function_list() throws RecognitionException {
		Function_listContext _localctx = new Function_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function_list);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
			case INTEGER:
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				function();
				setState(68);
				function_list();
				}
				break;
			case EOF:
			case MAIN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class FunctionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(calParser.ID, 0); }
		public List<TerminalNode> LBR() { return getTokens(calParser.LBR); }
		public TerminalNode LBR(int i) {
			return getToken(calParser.LBR, i);
		}
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public List<TerminalNode> RBR() { return getTokens(calParser.RBR); }
		public TerminalNode RBR(int i) {
			return getToken(calParser.RBR, i);
		}
		public TerminalNode IS() { return getToken(calParser.IS, 0); }
		public Dec_listContext dec_list() {
			return getRuleContext(Dec_listContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(calParser.BEGIN, 0); }
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(calParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(calParser.SEMI, 0); }
		public TerminalNode END() { return getToken(calParser.END, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calVisitor ) return ((calVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			type();
			setState(74);
			match(ID);
			setState(75);
			match(LBR);
			setState(76);
			parameter_list();
			setState(77);
			match(RBR);
			setState(78);
			match(IS);
			setState(79);
			dec_list();
			setState(80);
			match(BEGIN);
			setState(81);
			statement_block();
			setState(82);
			match(RETURN);
			setState(83);
			match(LBR);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBR) | (1L << MINUS) | (1L << NUMBER) | (1L << BV) | (1L << ID))) != 0)) {
				{
				setState(84);
				expression();
				}
			}

			setState(87);
			match(RBR);
			setState(88);
			match(SEMI);
			setState(89);
			match(END);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(calParser.INTEGER, 0); }
		public TerminalNode BOOLEAN() { return getToken(calParser.BOOLEAN, 0); }
		public TerminalNode VOID() { return getToken(calParser.VOID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calVisitor ) return ((calVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INTEGER) | (1L << BOOLEAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Parameter_listContext extends ParserRuleContext {
		public Nemp_parameter_listContext nemp_parameter_list() {
			return getRuleContext(Nemp_parameter_listContext.class,0);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calVisitor ) return ((calVisitor<? extends T>)visitor).visitParameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameter_list);
		try {
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				nemp_parameter_list();
				}
				break;
			case RBR:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Nemp_parameter_listContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(calParser.ID, 0); }
		public TerminalNode COLON() { return getToken(calParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(calParser.COMMA, 0); }
		public Nemp_parameter_listContext nemp_parameter_list() {
			return getRuleContext(Nemp_parameter_listContext.class,0);
		}
		public Nemp_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nemp_parameter_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calVisitor ) return ((calVisitor<? extends T>)visitor).visitNemp_parameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nemp_parameter_listContext nemp_parameter_list() throws RecognitionException {
		Nemp_parameter_listContext _localctx = new Nemp_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_nemp_parameter_list);
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(ID);
				setState(98);
				match(COLON);
				setState(99);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(ID);
				setState(101);
				match(COLON);
				setState(102);
				type();
				setState(103);
				match(COMMA);
				setState(104);
				nemp_parameter_list();
				}
				break;
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

	public static class MainContext extends ParserRuleContext {
		public List<TerminalNode> MAIN() { return getTokens(calParser.MAIN); }
		public TerminalNode MAIN(int i) {
			return getToken(calParser.MAIN, i);
		}
		public List<TerminalNode> BEGIN() { return getTokens(calParser.BEGIN); }
		public TerminalNode BEGIN(int i) {
			return getToken(calParser.BEGIN, i);
		}
		public List<Dec_listContext> dec_list() {
			return getRuleContexts(Dec_listContext.class);
		}
		public Dec_listContext dec_list(int i) {
			return getRuleContext(Dec_listContext.class,i);
		}
		public List<Statement_blockContext> statement_block() {
			return getRuleContexts(Statement_blockContext.class);
		}
		public Statement_blockContext statement_block(int i) {
			return getRuleContext(Statement_blockContext.class,i);
		}
		public List<TerminalNode> END() { return getTokens(calParser.END); }
		public TerminalNode END(int i) {
			return getToken(calParser.END, i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calVisitor ) return ((calVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MAIN) {
				{
				{
				setState(108);
				match(MAIN);
				setState(109);
				match(BEGIN);
				setState(110);
				dec_list();
				setState(111);
				statement_block();
				setState(112);
				match(END);
				}
				}
				setState(118);
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

	public static class Statement_blockContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public Statement_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calVisitor ) return ((calVisitor<? extends T>)visitor).visitStatement_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_blockContext statement_block() throws RecognitionException {
		Statement_blockContext _localctx = new Statement_blockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement_block);
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
			case WHILE:
			case SKIP_STATEMENT:
			case IF:
			case ELSE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				statement();
				setState(120);
				statement_block();
				}
				break;
			case END:
			case RETURN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(calParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(calParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(calParser.SEMI, 0); }
		public TerminalNode LBR() { return getToken(calParser.LBR, 0); }
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public TerminalNode RBR() { return getToken(calParser.RBR, 0); }
		public TerminalNode BEGIN() { return getToken(calParser.BEGIN, 0); }
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public TerminalNode END() { return getToken(calParser.END, 0); }
		public TerminalNode IF() { return getToken(calParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(calParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(calParser.WHILE, 0); }
		public TerminalNode SKIP_STATEMENT() { return getToken(calParser.SKIP_STATEMENT, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calVisitor ) return ((calVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statement);
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(ID);
				setState(126);
				match(ASSIGN);
				setState(127);
				expression();
				setState(128);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(ID);
				setState(131);
				match(LBR);
				setState(132);
				arg_list();
				setState(133);
				match(RBR);
				setState(134);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				match(BEGIN);
				setState(137);
				statement_block();
				setState(138);
				match(END);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				match(IF);
				setState(141);
				condition(0);
				setState(142);
				match(BEGIN);
				setState(143);
				statement_block();
				setState(144);
				match(END);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(146);
				match(ELSE);
				setState(147);
				match(BEGIN);
				setState(148);
				statement_block();
				setState(149);
				match(END);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(151);
				match(WHILE);
				setState(152);
				condition(0);
				setState(153);
				match(BEGIN);
				setState(154);
				statement_block();
				setState(155);
				match(END);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(157);
				match(SKIP_STATEMENT);
				setState(158);
				match(SEMI);
				}
				break;
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<FragContext> frag() {
			return getRuleContexts(FragContext.class);
		}
		public FragContext frag(int i) {
			return getRuleContext(FragContext.class,i);
		}
		public Binary_arith_opContext binary_arith_op() {
			return getRuleContext(Binary_arith_opContext.class,0);
		}
		public TerminalNode LBR() { return getToken(calParser.LBR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBR() { return getToken(calParser.RBR, 0); }
		public TerminalNode ID() { return getToken(calParser.ID, 0); }
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calVisitor ) return ((calVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expression);
		try {
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				frag();
				setState(162);
				binary_arith_op();
				setState(163);
				frag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(LBR);
				setState(166);
				expression();
				setState(167);
				match(RBR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				match(ID);
				setState(170);
				match(LBR);
				setState(171);
				arg_list();
				setState(172);
				match(RBR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(174);
				frag();
				}
				break;
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

	public static class Binary_arith_opContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(calParser.ADD, 0); }
		public TerminalNode MINUS() { return getToken(calParser.MINUS, 0); }
		public Binary_arith_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_arith_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calVisitor ) return ((calVisitor<? extends T>)visitor).visitBinary_arith_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_arith_opContext binary_arith_op() throws RecognitionException {
		Binary_arith_opContext _localctx = new Binary_arith_opContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_binary_arith_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_la = _input.LA(1);
			if ( !(_la==ADD || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class FragContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(calParser.ID, 0); }
		public TerminalNode MINUS() { return getToken(calParser.MINUS, 0); }
		public TerminalNode NUMBER() { return getToken(calParser.NUMBER, 0); }
		public TerminalNode BV() { return getToken(calParser.BV, 0); }
		public FragContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frag; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calVisitor ) return ((calVisitor<? extends T>)visitor).visitFrag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FragContext frag() throws RecognitionException {
		FragContext _localctx = new FragContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_frag);
		try {
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(ID);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				match(MINUS);
				setState(181);
				match(ID);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				match(NUMBER);
				}
				break;
			case BV:
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
				match(BV);
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

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode NEG() { return getToken(calParser.NEG, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode LBR() { return getToken(calParser.LBR, 0); }
		public TerminalNode RBR() { return getToken(calParser.RBR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Comp_opContext comp_op() {
			return getRuleContext(Comp_opContext.class,0);
		}
		public TerminalNode OR() { return getToken(calParser.OR, 0); }
		public TerminalNode AND() { return getToken(calParser.AND, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calVisitor ) return ((calVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_condition, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(187);
				match(NEG);
				setState(188);
				condition(4);
				}
				break;
			case 2:
				{
				setState(189);
				match(LBR);
				setState(190);
				condition(0);
				setState(191);
				match(RBR);
				}
				break;
			case 3:
				{
				setState(193);
				expression();
				setState(194);
				comp_op();
				setState(195);
				expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_condition);
					setState(199);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(200);
					_la = _input.LA(1);
					if ( !(_la==OR || _la==AND) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(201);
					condition(2);
					}
					} 
				}
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Comp_opContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(calParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(calParser.NOTEQUAL, 0); }
		public TerminalNode LT() { return getToken(calParser.LT, 0); }
		public TerminalNode LTE() { return getToken(calParser.LTE, 0); }
		public TerminalNode GT() { return getToken(calParser.GT, 0); }
		public TerminalNode GTE() { return getToken(calParser.GTE, 0); }
		public Comp_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calVisitor ) return ((calVisitor<? extends T>)visitor).visitComp_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_opContext comp_op() throws RecognitionException {
		Comp_opContext _localctx = new Comp_opContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comp_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOTEQUAL) | (1L << LT) | (1L << LTE) | (1L << GT) | (1L << GTE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Arg_listContext extends ParserRuleContext {
		public List<Nemp_arg_listContext> nemp_arg_list() {
			return getRuleContexts(Nemp_arg_listContext.class);
		}
		public Nemp_arg_listContext nemp_arg_list(int i) {
			return getRuleContext(Nemp_arg_listContext.class,i);
		}
		public Arg_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calVisitor ) return ((calVisitor<? extends T>)visitor).visitArg_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg_listContext arg_list() throws RecognitionException {
		Arg_listContext _localctx = new Arg_listContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arg_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(209);
				nemp_arg_list();
				}
				}
				setState(214);
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

	public static class Nemp_arg_listContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(calParser.ID, 0); }
		public TerminalNode COMMA() { return getToken(calParser.COMMA, 0); }
		public Nemp_arg_listContext nemp_arg_list() {
			return getRuleContext(Nemp_arg_listContext.class,0);
		}
		public Nemp_arg_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nemp_arg_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calVisitor ) return ((calVisitor<? extends T>)visitor).visitNemp_arg_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nemp_arg_listContext nemp_arg_list() throws RecognitionException {
		Nemp_arg_listContext _localctx = new Nemp_arg_listContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_nemp_arg_list);
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(ID);
				setState(217);
				match(COMMA);
				setState(218);
				nemp_arg_list();
				}
				break;
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u00e0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3"+
		"\64\n\3\3\4\3\4\5\48\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\5\7J\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\bX\n\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\5\nb\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13m\n\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f"+
		"u\n\f\f\f\16\fx\13\f\3\r\3\r\3\r\3\r\5\r~\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u00a2\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u00b2\n\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u00bb\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u00c8\n\22\3\22\3\22\3\22\7\22\u00cd\n\22\f\22\16\22\u00d0\13\22"+
		"\3\23\3\23\3\24\7\24\u00d5\n\24\f\24\16\24\u00d8\13\24\3\25\3\25\3\25"+
		"\3\25\5\25\u00de\n\25\3\25\2\3\"\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(\2\6\4\2\r\r\17\20\3\2\31\32\3\2\34\35\3\2\36#\2\u00e4\2*\3\2"+
		"\2\2\4\63\3\2\2\2\6\67\3\2\2\2\b9\3\2\2\2\n>\3\2\2\2\fI\3\2\2\2\16K\3"+
		"\2\2\2\20]\3\2\2\2\22a\3\2\2\2\24l\3\2\2\2\26v\3\2\2\2\30}\3\2\2\2\32"+
		"\u00a1\3\2\2\2\34\u00b1\3\2\2\2\36\u00b3\3\2\2\2 \u00ba\3\2\2\2\"\u00c7"+
		"\3\2\2\2$\u00d1\3\2\2\2&\u00d6\3\2\2\2(\u00dd\3\2\2\2*+\5\4\3\2+,\5\f"+
		"\7\2,-\5\26\f\2-\3\3\2\2\2./\5\6\4\2/\60\7\23\2\2\60\61\5\4\3\2\61\64"+
		"\3\2\2\2\62\64\3\2\2\2\63.\3\2\2\2\63\62\3\2\2\2\64\5\3\2\2\2\658\5\b"+
		"\5\2\668\5\n\6\2\67\65\3\2\2\2\67\66\3\2\2\28\7\3\2\2\29:\7\b\2\2:;\7"+
		"&\2\2;<\7\24\2\2<=\5\20\t\2=\t\3\2\2\2>?\7\t\2\2?@\7&\2\2@A\7\24\2\2A"+
		"B\5\20\t\2BC\7\30\2\2CD\5\34\17\2D\13\3\2\2\2EF\5\16\b\2FG\5\f\7\2GJ\3"+
		"\2\2\2HJ\3\2\2\2IE\3\2\2\2IH\3\2\2\2J\r\3\2\2\2KL\5\20\t\2LM\7&\2\2MN"+
		"\7\21\2\2NO\5\22\n\2OP\7\22\2\2PQ\7\16\2\2QR\5\4\3\2RS\7\6\2\2ST\5\30"+
		"\r\2TU\7\n\2\2UW\7\21\2\2VX\5\34\17\2WV\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ"+
		"\7\22\2\2Z[\7\23\2\2[\\\7\7\2\2\\\17\3\2\2\2]^\t\2\2\2^\21\3\2\2\2_b\5"+
		"\24\13\2`b\3\2\2\2a_\3\2\2\2a`\3\2\2\2b\23\3\2\2\2cd\7&\2\2de\7\24\2\2"+
		"em\5\20\t\2fg\7&\2\2gh\7\24\2\2hi\5\20\t\2ij\7\25\2\2jk\5\24\13\2km\3"+
		"\2\2\2lc\3\2\2\2lf\3\2\2\2m\25\3\2\2\2no\7\5\2\2op\7\6\2\2pq\5\4\3\2q"+
		"r\5\30\r\2rs\7\7\2\2su\3\2\2\2tn\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2"+
		"w\27\3\2\2\2xv\3\2\2\2yz\5\32\16\2z{\5\30\r\2{~\3\2\2\2|~\3\2\2\2}y\3"+
		"\2\2\2}|\3\2\2\2~\31\3\2\2\2\177\u0080\7&\2\2\u0080\u0081\7\30\2\2\u0081"+
		"\u0082\5\34\17\2\u0082\u0083\7\23\2\2\u0083\u00a2\3\2\2\2\u0084\u0085"+
		"\7&\2\2\u0085\u0086\7\21\2\2\u0086\u0087\5&\24\2\u0087\u0088\7\22\2\2"+
		"\u0088\u0089\7\23\2\2\u0089\u00a2\3\2\2\2\u008a\u008b\7\6\2\2\u008b\u008c"+
		"\5\30\r\2\u008c\u008d\7\7\2\2\u008d\u00a2\3\2\2\2\u008e\u008f\7\26\2\2"+
		"\u008f\u0090\5\"\22\2\u0090\u0091\7\6\2\2\u0091\u0092\5\30\r\2\u0092\u0093"+
		"\7\7\2\2\u0093\u00a2\3\2\2\2\u0094\u0095\7\27\2\2\u0095\u0096\7\6\2\2"+
		"\u0096\u0097\5\30\r\2\u0097\u0098\7\7\2\2\u0098\u00a2\3\2\2\2\u0099\u009a"+
		"\7\13\2\2\u009a\u009b\5\"\22\2\u009b\u009c\7\6\2\2\u009c\u009d\5\30\r"+
		"\2\u009d\u009e\7\7\2\2\u009e\u00a2\3\2\2\2\u009f\u00a0\7\f\2\2\u00a0\u00a2"+
		"\7\23\2\2\u00a1\177\3\2\2\2\u00a1\u0084\3\2\2\2\u00a1\u008a\3\2\2\2\u00a1"+
		"\u008e\3\2\2\2\u00a1\u0094\3\2\2\2\u00a1\u0099\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a2\33\3\2\2\2\u00a3\u00a4\5 \21\2\u00a4\u00a5\5\36\20\2\u00a5"+
		"\u00a6\5 \21\2\u00a6\u00b2\3\2\2\2\u00a7\u00a8\7\21\2\2\u00a8\u00a9\5"+
		"\34\17\2\u00a9\u00aa\7\22\2\2\u00aa\u00b2\3\2\2\2\u00ab\u00ac\7&\2\2\u00ac"+
		"\u00ad\7\21\2\2\u00ad\u00ae\5&\24\2\u00ae\u00af\7\22\2\2\u00af\u00b2\3"+
		"\2\2\2\u00b0\u00b2\5 \21\2\u00b1\u00a3\3\2\2\2\u00b1\u00a7\3\2\2\2\u00b1"+
		"\u00ab\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\35\3\2\2\2\u00b3\u00b4\t\3\2"+
		"\2\u00b4\37\3\2\2\2\u00b5\u00bb\7&\2\2\u00b6\u00b7\7\32\2\2\u00b7\u00bb"+
		"\7&\2\2\u00b8\u00bb\7$\2\2\u00b9\u00bb\7%\2\2\u00ba\u00b5\3\2\2\2\u00ba"+
		"\u00b6\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb!\3\2\2\2"+
		"\u00bc\u00bd\b\22\1\2\u00bd\u00be\7\33\2\2\u00be\u00c8\5\"\22\6\u00bf"+
		"\u00c0\7\21\2\2\u00c0\u00c1\5\"\22\2\u00c1\u00c2\7\22\2\2\u00c2\u00c8"+
		"\3\2\2\2\u00c3\u00c4\5\34\17\2\u00c4\u00c5\5$\23\2\u00c5\u00c6\5\34\17"+
		"\2\u00c6\u00c8\3\2\2\2\u00c7\u00bc\3\2\2\2\u00c7\u00bf\3\2\2\2\u00c7\u00c3"+
		"\3\2\2\2\u00c8\u00ce\3\2\2\2\u00c9\u00ca\f\3\2\2\u00ca\u00cb\t\4\2\2\u00cb"+
		"\u00cd\5\"\22\4\u00cc\u00c9\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3"+
		"\2\2\2\u00ce\u00cf\3\2\2\2\u00cf#\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2"+
		"\t\5\2\2\u00d2%\3\2\2\2\u00d3\u00d5\5(\25\2\u00d4\u00d3\3\2\2\2\u00d5"+
		"\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\'\3\2\2\2"+
		"\u00d8\u00d6\3\2\2\2\u00d9\u00de\7&\2\2\u00da\u00db\7&\2\2\u00db\u00dc"+
		"\7\25\2\2\u00dc\u00de\5(\25\2\u00dd\u00d9\3\2\2\2\u00dd\u00da\3\2\2\2"+
		"\u00de)\3\2\2\2\21\63\67IWalv}\u00a1\u00b1\u00ba\u00c7\u00ce\u00d6\u00dd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}