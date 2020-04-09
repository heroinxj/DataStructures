// Generated from D:/lib/IDEA_space/mygithub-repository/data-structures/antlr-demo1/src/main/java/c4/demo5krl\krl.g4 by ANTLR 4.7.2
package c4.demo5krl.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class krlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, AND=24, ANIN=25, 
		ANOUT=26, B_AND=27, B_NOT=28, B_OR=29, B_EXOR=30, BOOL=31, BRAKE=32, C_DIS=33, 
		C_ORI=34, C_PTP=35, C_VEL=36, CASE=37, CAST_FROM=38, CAST_TO=39, CHAR=40, 
		CIRC_REL=41, CIRC=42, CONST=43, CONTINUE=44, DELAY=45, DECL=46, DEF=47, 
		DEFAULT=48, DEFDAT=49, DEFFCT=50, DO=51, ELSE=52, END=53, ENDDAT=54, ENDFCT=55, 
		ENDFOR=56, ENDIF=57, ENDLOOP=58, ENDSWITCH=59, ENDWHILE=60, ENUM=61, EXIT=62, 
		EXT=63, EXTFCT=64, FALSE=65, FOR=66, GLOBAL=67, GOTO=68, HALT=69, IF=70, 
		IMPORT=71, INTERRUPT=72, INT=73, IS=74, LIN_REL=75, LIN=76, LOOP=77, MAXIMUM=78, 
		MINIMUM=79, NOT=80, OR=81, PRIO=82, PTP_REL=83, PTP=84, PUBLIC=85, REAL=86, 
		REPEAT=87, RETURN=88, SEC=89, SIGNAL=90, STRUC=91, SWITCH=92, THEN=93, 
		TO=94, TRIGGER=95, TRUE=96, UNTIL=97, WAIT=98, WHEN=99, WHILE=100, EXOR=101, 
		HEADERLINE=102, WS=103, NEWLINE=104, LINE_COMMENT=105, CHARLITERAL=106, 
		STRINGLITERAL=107, FLOATLITERAL=108, INTLITERAL=109, IDENTIFIER=110;
	public static final int
		RULE_module = 0, RULE_moduleRoutines = 1, RULE_mainRoutine = 2, RULE_subRoutine = 3, 
		RULE_procedureDefinition = 4, RULE_procedureName = 5, RULE_functionDefinition = 6, 
		RULE_functionName = 7, RULE_moduleData = 8, RULE_moduleName = 9, RULE_dataList = 10, 
		RULE_arrayInitialisation = 11, RULE_typeDeclaration = 12, RULE_structureDefinition = 13, 
		RULE_enumDefinition = 14, RULE_enumValue = 15, RULE_variableDeclaration = 16, 
		RULE_signalDeclaration = 17, RULE_variableDeclarationInDataList = 18, 
		RULE_variableListRest = 19, RULE_variableInitialisation = 20, RULE_structLiteral = 21, 
		RULE_structElementList = 22, RULE_structElement = 23, RULE_formalParameters = 24, 
		RULE_parameter = 25, RULE_routineBody = 26, RULE_routineDataSection = 27, 
		RULE_forwardDeclaration = 28, RULE_formalParametersWithType = 29, RULE_parameterWithType = 30, 
		RULE_parameterCallType = 31, RULE_importStatement = 32, RULE_variableName = 33, 
		RULE_arrayVariableSuffix = 34, RULE_routineImplementationSection = 35, 
		RULE_statementList = 36, RULE_statement = 37, RULE_analogOutputStatement = 38, 
		RULE_analogInputStatement = 39, RULE_switchBlockStatementGroups = 40, 
		RULE_caseLabel = 41, RULE_defaultLabel = 42, RULE_expressionList = 43, 
		RULE_assignmentExpression = 44, RULE_expression = 45, RULE_relationalOp = 46, 
		RULE_conditionalOrExpression = 47, RULE_exclusiveOrExpression = 48, RULE_conditionalAndExpression = 49, 
		RULE_additiveExpression = 50, RULE_multiplicativeExpression = 51, RULE_geometricExpression = 52, 
		RULE_unaryNotExpression = 53, RULE_unaryPlusMinuxExpression = 54, RULE_primary = 55, 
		RULE_parExpression = 56, RULE_type = 57, RULE_typeName = 58, RULE_primitiveType = 59, 
		RULE_arguments = 60, RULE_literal = 61, RULE_enumElement = 62;
	private static String[] makeRuleNames() {
		return new String[] {
			"module", "moduleRoutines", "mainRoutine", "subRoutine", "procedureDefinition", 
			"procedureName", "functionDefinition", "functionName", "moduleData", 
			"moduleName", "dataList", "arrayInitialisation", "typeDeclaration", "structureDefinition", 
			"enumDefinition", "enumValue", "variableDeclaration", "signalDeclaration", 
			"variableDeclarationInDataList", "variableListRest", "variableInitialisation", 
			"structLiteral", "structElementList", "structElement", "formalParameters", 
			"parameter", "routineBody", "routineDataSection", "forwardDeclaration", 
			"formalParametersWithType", "parameterWithType", "parameterCallType", 
			"importStatement", "variableName", "arrayVariableSuffix", "routineImplementationSection", 
			"statementList", "statement", "analogOutputStatement", "analogInputStatement", 
			"switchBlockStatementGroups", "caseLabel", "defaultLabel", "expressionList", 
			"assignmentExpression", "expression", "relationalOp", "conditionalOrExpression", 
			"exclusiveOrExpression", "conditionalAndExpression", "additiveExpression", 
			"multiplicativeExpression", "geometricExpression", "unaryNotExpression", 
			"unaryPlusMinuxExpression", "primary", "parExpression", "type", "typeName", 
			"primitiveType", "arguments", "literal", "enumElement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "','", "'{'", "':'", "'}'", "'('", "')'", "'/R1/'", "'..'", 
			"'['", "']'", "'=='", "'<>'", "'<='", "'>='", "'<'", "'>'", "'+'", "'-'", 
			"'*'", "'/'", "'.'", "'#'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"AND", "ANIN", "ANOUT", "B_AND", "B_NOT", "B_OR", "B_EXOR", "BOOL", "BRAKE", 
			"C_DIS", "C_ORI", "C_PTP", "C_VEL", "CASE", "CAST_FROM", "CAST_TO", "CHAR", 
			"CIRC_REL", "CIRC", "CONST", "CONTINUE", "DELAY", "DECL", "DEF", "DEFAULT", 
			"DEFDAT", "DEFFCT", "DO", "ELSE", "END", "ENDDAT", "ENDFCT", "ENDFOR", 
			"ENDIF", "ENDLOOP", "ENDSWITCH", "ENDWHILE", "ENUM", "EXIT", "EXT", "EXTFCT", 
			"FALSE", "FOR", "GLOBAL", "GOTO", "HALT", "IF", "IMPORT", "INTERRUPT", 
			"INT", "IS", "LIN_REL", "LIN", "LOOP", "MAXIMUM", "MINIMUM", "NOT", "OR", 
			"PRIO", "PTP_REL", "PTP", "PUBLIC", "REAL", "REPEAT", "RETURN", "SEC", 
			"SIGNAL", "STRUC", "SWITCH", "THEN", "TO", "TRIGGER", "TRUE", "UNTIL", 
			"WAIT", "WHEN", "WHILE", "EXOR", "HEADERLINE", "WS", "NEWLINE", "LINE_COMMENT", 
			"CHARLITERAL", "STRINGLITERAL", "FLOATLITERAL", "INTLITERAL", "IDENTIFIER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "krl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public krlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ModuleContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(krlParser.EOF, 0); }
		public ModuleDataContext moduleData() {
			return getRuleContext(ModuleDataContext.class,0);
		}
		public ModuleRoutinesContext moduleRoutines() {
			return getRuleContext(ModuleRoutinesContext.class,0);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitModule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_module);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFDAT:
				{
				setState(126);
				moduleData();
				}
				break;
			case DEF:
			case DEFFCT:
			case GLOBAL:
				{
				setState(127);
				moduleRoutines();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(130);
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

	public static class ModuleRoutinesContext extends ParserRuleContext {
		public MainRoutineContext mainRoutine() {
			return getRuleContext(MainRoutineContext.class,0);
		}
		public List<SubRoutineContext> subRoutine() {
			return getRuleContexts(SubRoutineContext.class);
		}
		public SubRoutineContext subRoutine(int i) {
			return getRuleContext(SubRoutineContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(krlParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(krlParser.NEWLINE, i);
		}
		public ModuleRoutinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleRoutines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterModuleRoutines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitModuleRoutines(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitModuleRoutines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleRoutinesContext moduleRoutines() throws RecognitionException {
		ModuleRoutinesContext _localctx = new ModuleRoutinesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_moduleRoutines);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			mainRoutine();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (DEF - 47)) | (1L << (DEFFCT - 47)) | (1L << (GLOBAL - 47)) | (1L << (NEWLINE - 47)))) != 0)) {
				{
				setState(135);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DEF:
				case DEFFCT:
				case GLOBAL:
					{
					setState(133);
					subRoutine();
					}
					break;
				case NEWLINE:
					{
					setState(134);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(139);
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

	public static class MainRoutineContext extends ParserRuleContext {
		public ProcedureDefinitionContext procedureDefinition() {
			return getRuleContext(ProcedureDefinitionContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public MainRoutineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainRoutine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterMainRoutine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitMainRoutine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitMainRoutine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainRoutineContext mainRoutine() throws RecognitionException {
		MainRoutineContext _localctx = new MainRoutineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainRoutine);
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				procedureDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				functionDefinition();
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

	public static class SubRoutineContext extends ParserRuleContext {
		public ProcedureDefinitionContext procedureDefinition() {
			return getRuleContext(ProcedureDefinitionContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public SubRoutineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subRoutine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterSubRoutine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitSubRoutine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitSubRoutine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubRoutineContext subRoutine() throws RecognitionException {
		SubRoutineContext _localctx = new SubRoutineContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_subRoutine);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				procedureDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				functionDefinition();
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

	public static class ProcedureDefinitionContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(krlParser.DEF, 0); }
		public ProcedureNameContext procedureName() {
			return getRuleContext(ProcedureNameContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(krlParser.NEWLINE, 0); }
		public RoutineBodyContext routineBody() {
			return getRuleContext(RoutineBodyContext.class,0);
		}
		public TerminalNode END() { return getToken(krlParser.END, 0); }
		public TerminalNode GLOBAL() { return getToken(krlParser.GLOBAL, 0); }
		public ProcedureDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterProcedureDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitProcedureDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitProcedureDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureDefinitionContext procedureDefinition() throws RecognitionException {
		ProcedureDefinitionContext _localctx = new ProcedureDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_procedureDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GLOBAL) {
				{
				setState(148);
				match(GLOBAL);
				}
			}

			setState(151);
			match(DEF);
			setState(152);
			procedureName();
			setState(153);
			formalParameters();
			setState(154);
			match(NEWLINE);
			setState(155);
			routineBody();
			setState(156);
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

	public static class ProcedureNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(krlParser.IDENTIFIER, 0); }
		public ProcedureNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterProcedureName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitProcedureName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitProcedureName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureNameContext procedureName() throws RecognitionException {
		ProcedureNameContext _localctx = new ProcedureNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_procedureName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(IDENTIFIER);
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

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public TerminalNode DEFFCT() { return getToken(krlParser.DEFFCT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(krlParser.NEWLINE, 0); }
		public RoutineBodyContext routineBody() {
			return getRuleContext(RoutineBodyContext.class,0);
		}
		public TerminalNode ENDFCT() { return getToken(krlParser.ENDFCT, 0); }
		public TerminalNode GLOBAL() { return getToken(krlParser.GLOBAL, 0); }
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GLOBAL) {
				{
				setState(160);
				match(GLOBAL);
				}
			}

			setState(163);
			match(DEFFCT);
			setState(164);
			type();
			setState(165);
			functionName();
			setState(166);
			formalParameters();
			setState(167);
			match(NEWLINE);
			setState(168);
			routineBody();
			setState(169);
			match(ENDFCT);
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

	public static class FunctionNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(krlParser.IDENTIFIER, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(IDENTIFIER);
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

	public static class ModuleDataContext extends ParserRuleContext {
		public TerminalNode DEFDAT() { return getToken(krlParser.DEFDAT, 0); }
		public ModuleNameContext moduleName() {
			return getRuleContext(ModuleNameContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(krlParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(krlParser.NEWLINE, i);
		}
		public DataListContext dataList() {
			return getRuleContext(DataListContext.class,0);
		}
		public TerminalNode ENDDAT() { return getToken(krlParser.ENDDAT, 0); }
		public TerminalNode PUBLIC() { return getToken(krlParser.PUBLIC, 0); }
		public ModuleDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleData; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterModuleData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitModuleData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitModuleData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleDataContext moduleData() throws RecognitionException {
		ModuleDataContext _localctx = new ModuleDataContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_moduleData);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(DEFDAT);
			setState(174);
			moduleName();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUBLIC) {
				{
				setState(175);
				match(PUBLIC);
				}
			}

			setState(178);
			match(NEWLINE);
			setState(179);
			dataList();
			setState(180);
			match(ENDDAT);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(181);
				match(NEWLINE);
				}
				}
				setState(186);
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

	public static class ModuleNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(krlParser.IDENTIFIER, 0); }
		public ModuleNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterModuleName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitModuleName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitModuleName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleNameContext moduleName() throws RecognitionException {
		ModuleNameContext _localctx = new ModuleNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_moduleName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(IDENTIFIER);
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

	public static class DataListContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(krlParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(krlParser.NEWLINE, i);
		}
		public List<ForwardDeclarationContext> forwardDeclaration() {
			return getRuleContexts(ForwardDeclarationContext.class);
		}
		public ForwardDeclarationContext forwardDeclaration(int i) {
			return getRuleContext(ForwardDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public List<VariableDeclarationInDataListContext> variableDeclarationInDataList() {
			return getRuleContexts(VariableDeclarationInDataListContext.class);
		}
		public VariableDeclarationInDataListContext variableDeclarationInDataList(int i) {
			return getRuleContext(VariableDeclarationInDataListContext.class,i);
		}
		public List<ArrayInitialisationContext> arrayInitialisation() {
			return getRuleContexts(ArrayInitialisationContext.class);
		}
		public ArrayInitialisationContext arrayInitialisation(int i) {
			return getRuleContext(ArrayInitialisationContext.class,i);
		}
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public ImportStatementContext importStatement(int i) {
			return getRuleContext(ImportStatementContext.class,i);
		}
		public DataListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterDataList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitDataList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitDataList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataListContext dataList() throws RecognitionException {
		DataListContext _localctx = new DataListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dataList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << CHAR) | (1L << CONST) | (1L << DECL) | (1L << ENUM) | (1L << EXT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXTFCT - 64)) | (1L << (GLOBAL - 64)) | (1L << (IMPORT - 64)) | (1L << (INT - 64)) | (1L << (REAL - 64)) | (1L << (SIGNAL - 64)) | (1L << (STRUC - 64)) | (1L << (NEWLINE - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(205);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(189);
					match(NEWLINE);
					}
					break;
				case 2:
					{
					setState(190);
					forwardDeclaration();
					setState(191);
					match(NEWLINE);
					}
					break;
				case 3:
					{
					setState(193);
					typeDeclaration();
					setState(194);
					match(NEWLINE);
					}
					break;
				case 4:
					{
					setState(196);
					variableDeclarationInDataList();
					setState(197);
					match(NEWLINE);
					}
					break;
				case 5:
					{
					setState(199);
					arrayInitialisation();
					setState(200);
					match(NEWLINE);
					}
					break;
				case 6:
					{
					setState(202);
					importStatement();
					setState(203);
					match(NEWLINE);
					}
					break;
				}
				}
				setState(209);
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

	public static class ArrayInitialisationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(krlParser.IDENTIFIER, 0); }
		public ArrayVariableSuffixContext arrayVariableSuffix() {
			return getRuleContext(ArrayVariableSuffixContext.class,0);
		}
		public UnaryPlusMinuxExpressionContext unaryPlusMinuxExpression() {
			return getRuleContext(UnaryPlusMinuxExpressionContext.class,0);
		}
		public ArrayInitialisationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitialisation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterArrayInitialisation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitArrayInitialisation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitArrayInitialisation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitialisationContext arrayInitialisation() throws RecognitionException {
		ArrayInitialisationContext _localctx = new ArrayInitialisationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arrayInitialisation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(IDENTIFIER);
			setState(211);
			arrayVariableSuffix();
			setState(212);
			match(T__0);
			setState(213);
			unaryPlusMinuxExpression();
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

	public static class TypeDeclarationContext extends ParserRuleContext {
		public StructureDefinitionContext structureDefinition() {
			return getRuleContext(StructureDefinitionContext.class,0);
		}
		public EnumDefinitionContext enumDefinition() {
			return getRuleContext(EnumDefinitionContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_typeDeclaration);
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				structureDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				enumDefinition();
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

	public static class StructureDefinitionContext extends ParserRuleContext {
		public TerminalNode STRUC() { return getToken(krlParser.STRUC, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<VariableNameContext> variableName() {
			return getRuleContexts(VariableNameContext.class);
		}
		public VariableNameContext variableName(int i) {
			return getRuleContext(VariableNameContext.class,i);
		}
		public List<VariableListRestContext> variableListRest() {
			return getRuleContexts(VariableListRestContext.class);
		}
		public VariableListRestContext variableListRest(int i) {
			return getRuleContext(VariableListRestContext.class,i);
		}
		public TerminalNode GLOBAL() { return getToken(krlParser.GLOBAL, 0); }
		public StructureDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structureDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterStructureDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitStructureDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitStructureDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructureDefinitionContext structureDefinition() throws RecognitionException {
		StructureDefinitionContext _localctx = new StructureDefinitionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_structureDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GLOBAL) {
				{
				setState(219);
				match(GLOBAL);
				}
			}

			setState(222);
			match(STRUC);
			setState(223);
			typeName();
			setState(224);
			type();
			setState(225);
			variableName();
			setState(226);
			variableListRest();
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(227);
				match(T__1);
				setState(228);
				type();
				setState(229);
				variableName();
				setState(230);
				variableListRest();
				}
				}
				setState(236);
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

	public static class EnumDefinitionContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(krlParser.ENUM, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<EnumValueContext> enumValue() {
			return getRuleContexts(EnumValueContext.class);
		}
		public EnumValueContext enumValue(int i) {
			return getRuleContext(EnumValueContext.class,i);
		}
		public TerminalNode GLOBAL() { return getToken(krlParser.GLOBAL, 0); }
		public EnumDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterEnumDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitEnumDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitEnumDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDefinitionContext enumDefinition() throws RecognitionException {
		EnumDefinitionContext _localctx = new EnumDefinitionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_enumDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GLOBAL) {
				{
				setState(237);
				match(GLOBAL);
				}
			}

			setState(240);
			match(ENUM);
			setState(241);
			typeName();
			setState(242);
			enumValue();
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(243);
				match(T__1);
				setState(244);
				enumValue();
				}
				}
				setState(249);
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

	public static class EnumValueContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(krlParser.IDENTIFIER, 0); }
		public EnumValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterEnumValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitEnumValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitEnumValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumValueContext enumValue() throws RecognitionException {
		EnumValueContext _localctx = new EnumValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_enumValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(IDENTIFIER);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public VariableListRestContext variableListRest() {
			return getRuleContext(VariableListRestContext.class,0);
		}
		public SignalDeclarationContext signalDeclaration() {
			return getRuleContext(SignalDeclarationContext.class,0);
		}
		public TerminalNode DECL() { return getToken(krlParser.DECL, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECL) {
				{
				setState(252);
				match(DECL);
				}
			}

			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case CHAR:
			case INT:
			case REAL:
			case IDENTIFIER:
				{
				setState(255);
				type();
				setState(256);
				variableName();
				setState(257);
				variableListRest();
				}
				break;
			case SIGNAL:
				{
				setState(259);
				signalDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SignalDeclarationContext extends ParserRuleContext {
		public TerminalNode SIGNAL() { return getToken(krlParser.SIGNAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(krlParser.IDENTIFIER, 0); }
		public List<PrimaryContext> primary() {
			return getRuleContexts(PrimaryContext.class);
		}
		public PrimaryContext primary(int i) {
			return getRuleContext(PrimaryContext.class,i);
		}
		public TerminalNode TO() { return getToken(krlParser.TO, 0); }
		public SignalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signalDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterSignalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitSignalDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitSignalDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignalDeclarationContext signalDeclaration() throws RecognitionException {
		SignalDeclarationContext _localctx = new SignalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_signalDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(SIGNAL);
			setState(263);
			match(IDENTIFIER);
			setState(264);
			primary();
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(265);
				match(TO);
				setState(266);
				primary();
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

	public static class VariableDeclarationInDataListContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public SignalDeclarationContext signalDeclaration() {
			return getRuleContext(SignalDeclarationContext.class,0);
		}
		public TerminalNode DECL() { return getToken(krlParser.DECL, 0); }
		public TerminalNode GLOBAL() { return getToken(krlParser.GLOBAL, 0); }
		public TerminalNode CONST() { return getToken(krlParser.CONST, 0); }
		public VariableListRestContext variableListRest() {
			return getRuleContext(VariableListRestContext.class,0);
		}
		public VariableInitialisationContext variableInitialisation() {
			return getRuleContext(VariableInitialisationContext.class,0);
		}
		public VariableDeclarationInDataListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationInDataList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterVariableDeclarationInDataList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitVariableDeclarationInDataList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitVariableDeclarationInDataList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationInDataListContext variableDeclarationInDataList() throws RecognitionException {
		VariableDeclarationInDataListContext _localctx = new VariableDeclarationInDataListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_variableDeclarationInDataList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECL) {
				{
				setState(269);
				match(DECL);
				}
			}

			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GLOBAL) {
				{
				setState(272);
				match(GLOBAL);
				}
			}

			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(275);
				match(CONST);
				}
			}

			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case CHAR:
			case INT:
			case REAL:
			case IDENTIFIER:
				{
				setState(278);
				type();
				setState(279);
				variableName();
				setState(282);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
				case NEWLINE:
					{
					setState(280);
					variableListRest();
					}
					break;
				case T__0:
					{
					setState(281);
					variableInitialisation();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SIGNAL:
				{
				setState(284);
				signalDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class VariableListRestContext extends ParserRuleContext {
		public List<VariableNameContext> variableName() {
			return getRuleContexts(VariableNameContext.class);
		}
		public VariableNameContext variableName(int i) {
			return getRuleContext(VariableNameContext.class,i);
		}
		public VariableListRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableListRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterVariableListRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitVariableListRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitVariableListRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableListRestContext variableListRest() throws RecognitionException {
		VariableListRestContext _localctx = new VariableListRestContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_variableListRest);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(287);
					match(T__1);
					setState(288);
					variableName();
					}
					} 
				}
				setState(293);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class VariableInitialisationContext extends ParserRuleContext {
		public UnaryPlusMinuxExpressionContext unaryPlusMinuxExpression() {
			return getRuleContext(UnaryPlusMinuxExpressionContext.class,0);
		}
		public VariableInitialisationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitialisation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterVariableInitialisation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitVariableInitialisation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitVariableInitialisation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitialisationContext variableInitialisation() throws RecognitionException {
		VariableInitialisationContext _localctx = new VariableInitialisationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_variableInitialisation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(T__0);
			setState(295);
			unaryPlusMinuxExpression();
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

	public static class StructLiteralContext extends ParserRuleContext {
		public StructElementListContext structElementList() {
			return getRuleContext(StructElementListContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public StructLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterStructLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitStructLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitStructLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructLiteralContext structLiteral() throws RecognitionException {
		StructLiteralContext _localctx = new StructLiteralContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_structLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(T__2);
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(298);
				typeName();
				setState(299);
				match(T__3);
				}
				break;
			}
			setState(303);
			structElementList();
			setState(304);
			match(T__4);
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

	public static class StructElementListContext extends ParserRuleContext {
		public List<StructElementContext> structElement() {
			return getRuleContexts(StructElementContext.class);
		}
		public StructElementContext structElement(int i) {
			return getRuleContext(StructElementContext.class,i);
		}
		public StructElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structElementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterStructElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitStructElementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitStructElementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructElementListContext structElementList() throws RecognitionException {
		StructElementListContext _localctx = new StructElementListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_structElementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			structElement();
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(307);
				match(T__1);
				setState(308);
				structElement();
				}
				}
				setState(313);
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

	public static class StructElementContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public UnaryPlusMinuxExpressionContext unaryPlusMinuxExpression() {
			return getRuleContext(UnaryPlusMinuxExpressionContext.class,0);
		}
		public StructElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterStructElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitStructElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitStructElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructElementContext structElement() throws RecognitionException {
		StructElementContext _localctx = new StructElementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_structElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			variableName();
			setState(315);
			unaryPlusMinuxExpression();
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

	public static class FormalParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(T__5);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(318);
				parameter();
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(319);
					match(T__1);
					setState(320);
					parameter();
					}
					}
					setState(325);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(328);
			match(T__6);
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

	public static class ParameterContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public ParameterCallTypeContext parameterCallType() {
			return getRuleContext(ParameterCallTypeContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			variableName();
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(331);
				parameterCallType();
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

	public static class RoutineBodyContext extends ParserRuleContext {
		public RoutineDataSectionContext routineDataSection() {
			return getRuleContext(RoutineDataSectionContext.class,0);
		}
		public RoutineImplementationSectionContext routineImplementationSection() {
			return getRuleContext(RoutineImplementationSectionContext.class,0);
		}
		public RoutineBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routineBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterRoutineBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitRoutineBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitRoutineBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoutineBodyContext routineBody() throws RecognitionException {
		RoutineBodyContext _localctx = new RoutineBodyContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_routineBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			routineDataSection();
			setState(335);
			routineImplementationSection();
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

	public static class RoutineDataSectionContext extends ParserRuleContext {
		public List<ForwardDeclarationContext> forwardDeclaration() {
			return getRuleContexts(ForwardDeclarationContext.class);
		}
		public ForwardDeclarationContext forwardDeclaration(int i) {
			return getRuleContext(ForwardDeclarationContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(krlParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(krlParser.NEWLINE, i);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public ImportStatementContext importStatement(int i) {
			return getRuleContext(ImportStatementContext.class,i);
		}
		public RoutineDataSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routineDataSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterRoutineDataSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitRoutineDataSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitRoutineDataSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoutineDataSectionContext routineDataSection() throws RecognitionException {
		RoutineDataSectionContext _localctx = new RoutineDataSectionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_routineDataSection);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(348);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case EXT:
					case EXTFCT:
						{
						setState(337);
						forwardDeclaration();
						setState(338);
						match(NEWLINE);
						}
						break;
					case BOOL:
					case CHAR:
					case DECL:
					case INT:
					case REAL:
					case SIGNAL:
					case IDENTIFIER:
						{
						setState(340);
						variableDeclaration();
						setState(341);
						match(NEWLINE);
						}
						break;
					case NEWLINE:
						{
						{
						setState(343);
						match(NEWLINE);
						}
						setState(344);
						match(NEWLINE);
						}
						break;
					case IMPORT:
						{
						setState(345);
						importStatement();
						setState(346);
						match(NEWLINE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(352);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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

	public static class ForwardDeclarationContext extends ParserRuleContext {
		public TerminalNode EXT() { return getToken(krlParser.EXT, 0); }
		public ProcedureNameContext procedureName() {
			return getRuleContext(ProcedureNameContext.class,0);
		}
		public FormalParametersWithTypeContext formalParametersWithType() {
			return getRuleContext(FormalParametersWithTypeContext.class,0);
		}
		public TerminalNode EXTFCT() { return getToken(krlParser.EXTFCT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public ForwardDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forwardDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterForwardDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitForwardDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitForwardDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForwardDeclarationContext forwardDeclaration() throws RecognitionException {
		ForwardDeclarationContext _localctx = new ForwardDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_forwardDeclaration);
		try {
			setState(362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				match(EXT);
				setState(354);
				procedureName();
				setState(355);
				formalParametersWithType();
				}
				break;
			case EXTFCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
				match(EXTFCT);
				setState(358);
				type();
				setState(359);
				functionName();
				setState(360);
				formalParametersWithType();
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

	public static class FormalParametersWithTypeContext extends ParserRuleContext {
		public List<ParameterWithTypeContext> parameterWithType() {
			return getRuleContexts(ParameterWithTypeContext.class);
		}
		public ParameterWithTypeContext parameterWithType(int i) {
			return getRuleContext(ParameterWithTypeContext.class,i);
		}
		public FormalParametersWithTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParametersWithType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterFormalParametersWithType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitFormalParametersWithType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitFormalParametersWithType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersWithTypeContext formalParametersWithType() throws RecognitionException {
		FormalParametersWithTypeContext _localctx = new FormalParametersWithTypeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_formalParametersWithType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(T__5);
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BOOL || _la==CHAR || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (INT - 73)) | (1L << (REAL - 73)) | (1L << (IDENTIFIER - 73)))) != 0)) {
				{
				setState(365);
				parameterWithType();
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(366);
					match(T__1);
					setState(367);
					parameterWithType();
					}
					}
					setState(372);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(375);
			match(T__6);
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

	public static class ParameterWithTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParameterCallTypeContext parameterCallType() {
			return getRuleContext(ParameterCallTypeContext.class,0);
		}
		public ParameterWithTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterWithType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterParameterWithType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitParameterWithType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitParameterWithType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterWithTypeContext parameterWithType() throws RecognitionException {
		ParameterWithTypeContext _localctx = new ParameterWithTypeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_parameterWithType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			type();
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(378);
				parameterCallType();
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

	public static class ParameterCallTypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(krlParser.IDENTIFIER, 0); }
		public ParameterCallTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterCallType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterParameterCallType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitParameterCallType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitParameterCallType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterCallTypeContext parameterCallType() throws RecognitionException {
		ParameterCallTypeContext _localctx = new ParameterCallTypeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_parameterCallType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(T__3);
			setState(382);
			match(IDENTIFIER);
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

	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(krlParser.IMPORT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<VariableNameContext> variableName() {
			return getRuleContexts(VariableNameContext.class);
		}
		public VariableNameContext variableName(int i) {
			return getRuleContext(VariableNameContext.class,i);
		}
		public TerminalNode IS() { return getToken(krlParser.IS, 0); }
		public ModuleNameContext moduleName() {
			return getRuleContext(ModuleNameContext.class,0);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_importStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(IMPORT);
			setState(385);
			type();
			setState(386);
			variableName();
			setState(387);
			match(IS);
			setState(388);
			match(T__7);
			setState(389);
			moduleName();
			setState(390);
			match(T__8);
			setState(391);
			variableName();
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

	public static class VariableNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(krlParser.IDENTIFIER, 0); }
		public ArrayVariableSuffixContext arrayVariableSuffix() {
			return getRuleContext(ArrayVariableSuffixContext.class,0);
		}
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitVariableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_variableName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(IDENTIFIER);
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(394);
				arrayVariableSuffix();
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

	public static class ArrayVariableSuffixContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayVariableSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayVariableSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterArrayVariableSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitArrayVariableSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitArrayVariableSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayVariableSuffixContext arrayVariableSuffix() throws RecognitionException {
		ArrayVariableSuffixContext _localctx = new ArrayVariableSuffixContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_arrayVariableSuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(T__9);
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__17) | (1L << T__18) | (1L << T__22) | (1L << B_NOT))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (FALSE - 65)) | (1L << (NOT - 65)) | (1L << (TRUE - 65)) | (1L << (CHARLITERAL - 65)) | (1L << (STRINGLITERAL - 65)) | (1L << (FLOATLITERAL - 65)) | (1L << (INTLITERAL - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				setState(398);
				expression();
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(399);
					match(T__1);
					setState(407);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__17) | (1L << T__18) | (1L << T__22) | (1L << B_NOT))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (FALSE - 65)) | (1L << (NOT - 65)) | (1L << (TRUE - 65)) | (1L << (CHARLITERAL - 65)) | (1L << (STRINGLITERAL - 65)) | (1L << (FLOATLITERAL - 65)) | (1L << (INTLITERAL - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
						{
						setState(400);
						expression();
						setState(405);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__1) {
							{
							setState(401);
							match(T__1);
							setState(403);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__17) | (1L << T__18) | (1L << T__22) | (1L << B_NOT))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (FALSE - 65)) | (1L << (NOT - 65)) | (1L << (TRUE - 65)) | (1L << (CHARLITERAL - 65)) | (1L << (STRINGLITERAL - 65)) | (1L << (FLOATLITERAL - 65)) | (1L << (INTLITERAL - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
								{
								setState(402);
								expression();
								}
							}

							}
						}

						}
					}

					}
				}

				}
			}

			setState(413);
			match(T__10);
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

	public static class RoutineImplementationSectionContext extends ParserRuleContext {
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public RoutineImplementationSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routineImplementationSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterRoutineImplementationSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitRoutineImplementationSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitRoutineImplementationSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoutineImplementationSectionContext routineImplementationSection() throws RecognitionException {
		RoutineImplementationSectionContext _localctx = new RoutineImplementationSectionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_routineImplementationSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			statementList();
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

	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitStatementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__17) | (1L << T__18) | (1L << T__22) | (1L << ANIN) | (1L << ANOUT) | (1L << B_NOT) | (1L << BRAKE) | (1L << CIRC_REL) | (1L << CIRC) | (1L << CONTINUE) | (1L << EXIT))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (FALSE - 65)) | (1L << (FOR - 65)) | (1L << (GLOBAL - 65)) | (1L << (GOTO - 65)) | (1L << (HALT - 65)) | (1L << (IF - 65)) | (1L << (INTERRUPT - 65)) | (1L << (LIN_REL - 65)) | (1L << (LIN - 65)) | (1L << (LOOP - 65)) | (1L << (NOT - 65)) | (1L << (PTP_REL - 65)) | (1L << (PTP - 65)) | (1L << (REPEAT - 65)) | (1L << (RETURN - 65)) | (1L << (SWITCH - 65)) | (1L << (TRIGGER - 65)) | (1L << (TRUE - 65)) | (1L << (WAIT - 65)) | (1L << (WHILE - 65)) | (1L << (NEWLINE - 65)) | (1L << (CHARLITERAL - 65)) | (1L << (STRINGLITERAL - 65)) | (1L << (FLOATLITERAL - 65)) | (1L << (INTLITERAL - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				{
				setState(417);
				statement();
				}
				}
				setState(422);
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(krlParser.CONTINUE, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(krlParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(krlParser.NEWLINE, i);
		}
		public TerminalNode EXIT() { return getToken(krlParser.EXIT, 0); }
		public TerminalNode FOR() { return getToken(krlParser.FOR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(krlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(krlParser.IDENTIFIER, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TO() { return getToken(krlParser.TO, 0); }
		public List<StatementListContext> statementList() {
			return getRuleContexts(StatementListContext.class);
		}
		public StatementListContext statementList(int i) {
			return getRuleContext(StatementListContext.class,i);
		}
		public TerminalNode ENDFOR() { return getToken(krlParser.ENDFOR, 0); }
		public TerminalNode GOTO() { return getToken(krlParser.GOTO, 0); }
		public TerminalNode HALT() { return getToken(krlParser.HALT, 0); }
		public TerminalNode IF() { return getToken(krlParser.IF, 0); }
		public TerminalNode THEN() { return getToken(krlParser.THEN, 0); }
		public TerminalNode ENDIF() { return getToken(krlParser.ENDIF, 0); }
		public TerminalNode ELSE() { return getToken(krlParser.ELSE, 0); }
		public TerminalNode LOOP() { return getToken(krlParser.LOOP, 0); }
		public TerminalNode ENDLOOP() { return getToken(krlParser.ENDLOOP, 0); }
		public TerminalNode REPEAT() { return getToken(krlParser.REPEAT, 0); }
		public TerminalNode UNTIL() { return getToken(krlParser.UNTIL, 0); }
		public TerminalNode SWITCH() { return getToken(krlParser.SWITCH, 0); }
		public SwitchBlockStatementGroupsContext switchBlockStatementGroups() {
			return getRuleContext(SwitchBlockStatementGroupsContext.class,0);
		}
		public TerminalNode ENDSWITCH() { return getToken(krlParser.ENDSWITCH, 0); }
		public TerminalNode WAIT() { return getToken(krlParser.WAIT, 0); }
		public TerminalNode SEC() { return getToken(krlParser.SEC, 0); }
		public TerminalNode WHILE() { return getToken(krlParser.WHILE, 0); }
		public TerminalNode ENDWHILE() { return getToken(krlParser.ENDWHILE, 0); }
		public TerminalNode RETURN() { return getToken(krlParser.RETURN, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode BRAKE() { return getToken(krlParser.BRAKE, 0); }
		public TerminalNode INTERRUPT() { return getToken(krlParser.INTERRUPT, 0); }
		public TerminalNode DECL() { return getToken(krlParser.DECL, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode WHEN() { return getToken(krlParser.WHEN, 0); }
		public TerminalNode DO() { return getToken(krlParser.DO, 0); }
		public TerminalNode GLOBAL() { return getToken(krlParser.GLOBAL, 0); }
		public List<GeometricExpressionContext> geometricExpression() {
			return getRuleContexts(GeometricExpressionContext.class);
		}
		public GeometricExpressionContext geometricExpression(int i) {
			return getRuleContext(GeometricExpressionContext.class,i);
		}
		public TerminalNode PTP() { return getToken(krlParser.PTP, 0); }
		public TerminalNode PTP_REL() { return getToken(krlParser.PTP_REL, 0); }
		public TerminalNode C_PTP() { return getToken(krlParser.C_PTP, 0); }
		public TerminalNode C_DIS() { return getToken(krlParser.C_DIS, 0); }
		public TerminalNode C_ORI() { return getToken(krlParser.C_ORI, 0); }
		public TerminalNode C_VEL() { return getToken(krlParser.C_VEL, 0); }
		public TerminalNode LIN() { return getToken(krlParser.LIN, 0); }
		public TerminalNode LIN_REL() { return getToken(krlParser.LIN_REL, 0); }
		public EnumElementContext enumElement() {
			return getRuleContext(EnumElementContext.class,0);
		}
		public TerminalNode CIRC() { return getToken(krlParser.CIRC, 0); }
		public TerminalNode CIRC_REL() { return getToken(krlParser.CIRC_REL, 0); }
		public TerminalNode TRIGGER() { return getToken(krlParser.TRIGGER, 0); }
		public TerminalNode DELAY() { return getToken(krlParser.DELAY, 0); }
		public TerminalNode PRIO() { return getToken(krlParser.PRIO, 0); }
		public AnalogInputStatementContext analogInputStatement() {
			return getRuleContext(AnalogInputStatementContext.class,0);
		}
		public AnalogOutputStatementContext analogOutputStatement() {
			return getRuleContext(AnalogOutputStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_statement);
		int _la;
		try {
			setState(595);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(423);
				match(CONTINUE);
				setState(424);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				match(EXIT);
				setState(426);
				match(NEWLINE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(427);
				match(FOR);
				setState(428);
				match(IDENTIFIER);
				setState(429);
				match(T__0);
				setState(430);
				expression();
				setState(431);
				match(TO);
				setState(432);
				expression();
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(433);
					match(IDENTIFIER);
					setState(434);
					expression();
					}
				}

				setState(437);
				match(NEWLINE);
				setState(438);
				statementList();
				setState(439);
				match(ENDFOR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(441);
				match(GOTO);
				setState(442);
				match(IDENTIFIER);
				setState(443);
				match(NEWLINE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(444);
				match(HALT);
				setState(445);
				match(NEWLINE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(446);
				match(IF);
				setState(447);
				expression();
				setState(448);
				match(THEN);
				setState(449);
				match(NEWLINE);
				setState(450);
				statementList();
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(451);
					match(ELSE);
					setState(452);
					match(NEWLINE);
					setState(453);
					statementList();
					}
				}

				setState(456);
				match(ENDIF);
				setState(457);
				match(NEWLINE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(459);
				match(LOOP);
				setState(460);
				match(NEWLINE);
				setState(461);
				statementList();
				setState(462);
				match(ENDLOOP);
				setState(463);
				match(NEWLINE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(465);
				match(REPEAT);
				setState(466);
				match(NEWLINE);
				setState(467);
				statementList();
				setState(468);
				match(UNTIL);
				setState(469);
				expression();
				setState(470);
				match(NEWLINE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(472);
				match(SWITCH);
				setState(473);
				expression();
				setState(474);
				match(NEWLINE);
				setState(475);
				switchBlockStatementGroups();
				setState(476);
				match(ENDSWITCH);
				setState(477);
				match(NEWLINE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(479);
				match(WAIT);
				setState(480);
				match(FOR);
				setState(481);
				expression();
				setState(482);
				match(NEWLINE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(484);
				match(WAIT);
				setState(485);
				match(SEC);
				setState(486);
				expression();
				setState(487);
				match(NEWLINE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(489);
				match(WHILE);
				setState(490);
				expression();
				setState(491);
				match(NEWLINE);
				setState(492);
				statementList();
				setState(493);
				match(ENDWHILE);
				setState(494);
				match(NEWLINE);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(496);
				match(RETURN);
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__17) | (1L << T__18) | (1L << T__22) | (1L << B_NOT))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (FALSE - 65)) | (1L << (NOT - 65)) | (1L << (TRUE - 65)) | (1L << (CHARLITERAL - 65)) | (1L << (STRINGLITERAL - 65)) | (1L << (FLOATLITERAL - 65)) | (1L << (INTLITERAL - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					setState(497);
					assignmentExpression();
					}
				}

				setState(500);
				match(NEWLINE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(501);
				match(BRAKE);
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(502);
					match(IDENTIFIER);
					}
				}

				setState(505);
				match(NEWLINE);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(506);
				assignmentExpression();
				setState(507);
				match(NEWLINE);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(509);
				match(IDENTIFIER);
				setState(510);
				match(T__3);
				setState(511);
				match(NEWLINE);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(512);
				match(NEWLINE);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(513);
					match(GLOBAL);
					}
				}

				setState(516);
				match(INTERRUPT);
				setState(517);
				match(DECL);
				setState(518);
				primary();
				setState(519);
				match(WHEN);
				setState(520);
				expression();
				setState(521);
				match(DO);
				setState(522);
				assignmentExpression();
				setState(523);
				match(NEWLINE);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(525);
				match(INTERRUPT);
				setState(526);
				match(IDENTIFIER);
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__22))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (FALSE - 65)) | (1L << (TRUE - 65)) | (1L << (CHARLITERAL - 65)) | (1L << (STRINGLITERAL - 65)) | (1L << (FLOATLITERAL - 65)) | (1L << (INTLITERAL - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					setState(527);
					primary();
					}
				}

				setState(530);
				match(NEWLINE);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(531);
				_la = _input.LA(1);
				if ( !(_la==PTP_REL || _la==PTP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(532);
				geometricExpression();
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==C_PTP) {
					{
					setState(533);
					match(C_PTP);
					setState(535);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << C_DIS) | (1L << C_ORI) | (1L << C_VEL))) != 0)) {
						{
						setState(534);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << C_DIS) | (1L << C_ORI) | (1L << C_VEL))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					}
				}

				setState(539);
				match(NEWLINE);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(541);
				match(LIN);
				setState(542);
				geometricExpression();
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << C_DIS) | (1L << C_ORI) | (1L << C_VEL))) != 0)) {
					{
					setState(543);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << C_DIS) | (1L << C_ORI) | (1L << C_VEL))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(546);
				match(NEWLINE);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(548);
				match(LIN_REL);
				setState(549);
				geometricExpression();
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << C_DIS) | (1L << C_ORI) | (1L << C_VEL))) != 0)) {
					{
					setState(550);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << C_DIS) | (1L << C_ORI) | (1L << C_VEL))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__22) {
					{
					setState(553);
					enumElement();
					}
				}

				setState(556);
				match(NEWLINE);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(558);
				_la = _input.LA(1);
				if ( !(_la==CIRC_REL || _la==CIRC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(559);
				geometricExpression();
				setState(560);
				match(T__1);
				setState(561);
				geometricExpression();
				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(562);
					match(T__1);
					setState(563);
					match(IDENTIFIER);
					setState(564);
					primary();
					}
				}

				setState(568);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << C_DIS) | (1L << C_ORI) | (1L << C_VEL))) != 0)) {
					{
					setState(567);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << C_DIS) | (1L << C_ORI) | (1L << C_VEL))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(570);
				match(NEWLINE);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(572);
				match(TRIGGER);
				setState(573);
				match(WHEN);
				{
				setState(574);
				match(IDENTIFIER);
				}
				setState(575);
				match(T__0);
				setState(576);
				expression();
				setState(577);
				match(DELAY);
				setState(578);
				match(T__0);
				setState(579);
				expression();
				setState(580);
				match(DO);
				setState(581);
				assignmentExpression();
				setState(585);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRIO) {
					{
					setState(582);
					match(PRIO);
					setState(583);
					match(T__0);
					setState(584);
					expression();
					}
				}

				setState(587);
				match(NEWLINE);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(589);
				analogInputStatement();
				setState(590);
				match(NEWLINE);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(592);
				analogOutputStatement();
				setState(593);
				match(NEWLINE);
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

	public static class AnalogOutputStatementContext extends ParserRuleContext {
		public TerminalNode ANOUT() { return getToken(krlParser.ANOUT, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(krlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(krlParser.IDENTIFIER, i);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public AnalogOutputStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analogOutputStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterAnalogOutputStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitAnalogOutputStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitAnalogOutputStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnalogOutputStatementContext analogOutputStatement() throws RecognitionException {
		AnalogOutputStatementContext _localctx = new AnalogOutputStatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_analogOutputStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			match(ANOUT);
			setState(610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(598);
				match(IDENTIFIER);
				setState(599);
				assignmentExpression();
				setState(605);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(600);
					match(IDENTIFIER);
					setState(601);
					match(T__0);
					setState(602);
					literal();
					}
					}
					setState(607);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(608);
				match(IDENTIFIER);
				setState(609);
				match(IDENTIFIER);
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

	public static class AnalogInputStatementContext extends ParserRuleContext {
		public TerminalNode ANIN() { return getToken(krlParser.ANIN, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(krlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(krlParser.IDENTIFIER, i);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public AnalogInputStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analogInputStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterAnalogInputStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitAnalogInputStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitAnalogInputStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnalogInputStatementContext analogInputStatement() throws RecognitionException {
		AnalogInputStatementContext _localctx = new AnalogInputStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_analogInputStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			match(ANIN);
			setState(617);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(613);
				match(IDENTIFIER);
				setState(614);
				assignmentExpression();
				}
				break;
			case 2:
				{
				setState(615);
				match(IDENTIFIER);
				setState(616);
				match(IDENTIFIER);
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

	public static class SwitchBlockStatementGroupsContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(krlParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(krlParser.NEWLINE, i);
		}
		public List<CaseLabelContext> caseLabel() {
			return getRuleContexts(CaseLabelContext.class);
		}
		public CaseLabelContext caseLabel(int i) {
			return getRuleContext(CaseLabelContext.class,i);
		}
		public List<StatementListContext> statementList() {
			return getRuleContexts(StatementListContext.class);
		}
		public StatementListContext statementList(int i) {
			return getRuleContext(StatementListContext.class,i);
		}
		public DefaultLabelContext defaultLabel() {
			return getRuleContext(DefaultLabelContext.class,0);
		}
		public SwitchBlockStatementGroupsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroups; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterSwitchBlockStatementGroups(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitSwitchBlockStatementGroups(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitSwitchBlockStatementGroups(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupsContext switchBlockStatementGroups() throws RecognitionException {
		SwitchBlockStatementGroupsContext _localctx = new SwitchBlockStatementGroupsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_switchBlockStatementGroups);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(619);
				match(NEWLINE);
				}
				}
				setState(624);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(628); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(625);
				caseLabel();
				setState(626);
				statementList();
				}
				}
				setState(630); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE );
			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(632);
				defaultLabel();
				setState(633);
				statementList();
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

	public static class CaseLabelContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(krlParser.CASE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(krlParser.NEWLINE, 0); }
		public CaseLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterCaseLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitCaseLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitCaseLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseLabelContext caseLabel() throws RecognitionException {
		CaseLabelContext _localctx = new CaseLabelContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_caseLabel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			match(CASE);
			setState(638);
			expression();
			setState(643);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(639);
				match(T__1);
				setState(640);
				expression();
				}
				}
				setState(645);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(646);
			match(NEWLINE);
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

	public static class DefaultLabelContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(krlParser.DEFAULT, 0); }
		public TerminalNode NEWLINE() { return getToken(krlParser.NEWLINE, 0); }
		public DefaultLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterDefaultLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitDefaultLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitDefaultLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultLabelContext defaultLabel() throws RecognitionException {
		DefaultLabelContext _localctx = new DefaultLabelContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_defaultLabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			match(DEFAULT);
			setState(649);
			match(NEWLINE);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			assignmentExpression();
			setState(656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(652);
				match(T__1);
				setState(653);
				assignmentExpression();
				}
				}
				setState(658);
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

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_assignmentExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			expression();
			setState(664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(660);
				match(T__0);
				setState(661);
				expression();
				}
				}
				setState(666);
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<ConditionalOrExpressionContext> conditionalOrExpression() {
			return getRuleContexts(ConditionalOrExpressionContext.class);
		}
		public ConditionalOrExpressionContext conditionalOrExpression(int i) {
			return getRuleContext(ConditionalOrExpressionContext.class,i);
		}
		public List<RelationalOpContext> relationalOp() {
			return getRuleContexts(RelationalOpContext.class);
		}
		public RelationalOpContext relationalOp(int i) {
			return getRuleContext(RelationalOpContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			conditionalOrExpression();
			setState(673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) {
				{
				{
				setState(668);
				relationalOp();
				setState(669);
				conditionalOrExpression();
				}
				}
				setState(675);
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

	public static class RelationalOpContext extends ParserRuleContext {
		public RelationalOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterRelationalOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitRelationalOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitRelationalOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalOpContext relationalOp() throws RecognitionException {
		RelationalOpContext _localctx = new RelationalOpContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_relationalOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
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

	public static class ConditionalOrExpressionContext extends ParserRuleContext {
		public List<ExclusiveOrExpressionContext> exclusiveOrExpression() {
			return getRuleContexts(ExclusiveOrExpressionContext.class);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression(int i) {
			return getRuleContext(ExclusiveOrExpressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(krlParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(krlParser.OR, i);
		}
		public List<TerminalNode> B_OR() { return getTokens(krlParser.B_OR); }
		public TerminalNode B_OR(int i) {
			return getToken(krlParser.B_OR, i);
		}
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterConditionalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitConditionalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitConditionalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_conditionalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			exclusiveOrExpression();
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==B_OR || _la==OR) {
				{
				{
				setState(679);
				_la = _input.LA(1);
				if ( !(_la==B_OR || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(680);
				exclusiveOrExpression();
				}
				}
				setState(685);
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

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public List<ConditionalAndExpressionContext> conditionalAndExpression() {
			return getRuleContexts(ConditionalAndExpressionContext.class);
		}
		public ConditionalAndExpressionContext conditionalAndExpression(int i) {
			return getRuleContext(ConditionalAndExpressionContext.class,i);
		}
		public List<TerminalNode> EXOR() { return getTokens(krlParser.EXOR); }
		public TerminalNode EXOR(int i) {
			return getToken(krlParser.EXOR, i);
		}
		public List<TerminalNode> B_EXOR() { return getTokens(krlParser.B_EXOR); }
		public TerminalNode B_EXOR(int i) {
			return getToken(krlParser.B_EXOR, i);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitExclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitExclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_exclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			conditionalAndExpression();
			setState(691);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==B_EXOR || _la==EXOR) {
				{
				{
				setState(687);
				_la = _input.LA(1);
				if ( !(_la==B_EXOR || _la==EXOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(688);
				conditionalAndExpression();
				}
				}
				setState(693);
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

	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(krlParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(krlParser.AND, i);
		}
		public List<TerminalNode> B_AND() { return getTokens(krlParser.B_AND); }
		public TerminalNode B_AND(int i) {
			return getToken(krlParser.B_AND, i);
		}
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitConditionalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitConditionalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_conditionalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			additiveExpression();
			setState(699);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==B_AND) {
				{
				{
				setState(695);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==B_AND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(696);
				additiveExpression();
				}
				}
				setState(701);
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			multiplicativeExpression();
			setState(707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17 || _la==T__18) {
				{
				{
				setState(703);
				_la = _input.LA(1);
				if ( !(_la==T__17 || _la==T__18) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(704);
				multiplicativeExpression();
				}
				}
				setState(709);
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<GeometricExpressionContext> geometricExpression() {
			return getRuleContexts(GeometricExpressionContext.class);
		}
		public GeometricExpressionContext geometricExpression(int i) {
			return getRuleContext(GeometricExpressionContext.class,i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			geometricExpression();
			setState(715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19 || _la==T__20) {
				{
				{
				setState(711);
				_la = _input.LA(1);
				if ( !(_la==T__19 || _la==T__20) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(712);
				geometricExpression();
				}
				}
				setState(717);
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

	public static class GeometricExpressionContext extends ParserRuleContext {
		public List<UnaryNotExpressionContext> unaryNotExpression() {
			return getRuleContexts(UnaryNotExpressionContext.class);
		}
		public UnaryNotExpressionContext unaryNotExpression(int i) {
			return getRuleContext(UnaryNotExpressionContext.class,i);
		}
		public GeometricExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_geometricExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterGeometricExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitGeometricExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitGeometricExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeometricExpressionContext geometricExpression() throws RecognitionException {
		GeometricExpressionContext _localctx = new GeometricExpressionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_geometricExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			unaryNotExpression();
			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(719);
				match(T__3);
				setState(720);
				unaryNotExpression();
				}
				}
				setState(725);
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

	public static class UnaryNotExpressionContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(krlParser.NOT, 0); }
		public UnaryNotExpressionContext unaryNotExpression() {
			return getRuleContext(UnaryNotExpressionContext.class,0);
		}
		public TerminalNode B_NOT() { return getToken(krlParser.B_NOT, 0); }
		public UnaryPlusMinuxExpressionContext unaryPlusMinuxExpression() {
			return getRuleContext(UnaryPlusMinuxExpressionContext.class,0);
		}
		public UnaryNotExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryNotExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterUnaryNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitUnaryNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitUnaryNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryNotExpressionContext unaryNotExpression() throws RecognitionException {
		UnaryNotExpressionContext _localctx = new UnaryNotExpressionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_unaryNotExpression);
		try {
			setState(731);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(726);
				match(NOT);
				setState(727);
				unaryNotExpression();
				}
				break;
			case B_NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(728);
				match(B_NOT);
				setState(729);
				unaryNotExpression();
				}
				break;
			case T__2:
			case T__5:
			case T__17:
			case T__18:
			case T__22:
			case FALSE:
			case TRUE:
			case CHARLITERAL:
			case STRINGLITERAL:
			case FLOATLITERAL:
			case INTLITERAL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(730);
				unaryPlusMinuxExpression();
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

	public static class UnaryPlusMinuxExpressionContext extends ParserRuleContext {
		public UnaryPlusMinuxExpressionContext unaryPlusMinuxExpression() {
			return getRuleContext(UnaryPlusMinuxExpressionContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public UnaryPlusMinuxExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryPlusMinuxExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterUnaryPlusMinuxExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitUnaryPlusMinuxExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitUnaryPlusMinuxExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryPlusMinuxExpressionContext unaryPlusMinuxExpression() throws RecognitionException {
		UnaryPlusMinuxExpressionContext _localctx = new UnaryPlusMinuxExpressionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_unaryPlusMinuxExpression);
		try {
			setState(738);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(733);
				match(T__17);
				setState(734);
				unaryPlusMinuxExpression();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(735);
				match(T__18);
				setState(736);
				unaryPlusMinuxExpression();
				}
				break;
			case T__2:
			case T__5:
			case T__22:
			case FALSE:
			case TRUE:
			case CHARLITERAL:
			case STRINGLITERAL:
			case FLOATLITERAL:
			case INTLITERAL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(737);
				primary();
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

	public static class PrimaryContext extends ParserRuleContext {
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<VariableNameContext> variableName() {
			return getRuleContexts(VariableNameContext.class);
		}
		public VariableNameContext variableName(int i) {
			return getRuleContext(VariableNameContext.class,i);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_primary);
		int _la;
		try {
			setState(753);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(740);
				parExpression();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(741);
				variableName();
				setState(746);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(742);
					match(T__21);
					setState(743);
					variableName();
					}
					}
					setState(748);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(750);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(749);
					arguments();
					}
				}

				}
				break;
			case T__2:
			case T__22:
			case FALSE:
			case TRUE:
			case CHARLITERAL:
			case STRINGLITERAL:
			case FLOATLITERAL:
			case INTLITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(752);
				literal();
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

	public static class ParExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			match(T__5);
			setState(756);
			assignmentExpression();
			setState(757);
			match(T__6);
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
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode INTLITERAL() { return getToken(krlParser.INTLITERAL, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_type);
		int _la;
		try {
			setState(775);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case CHAR:
			case INT:
			case REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(759);
				primitiveType();
				setState(765);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(760);
					match(T__9);
					setState(762);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==INTLITERAL) {
						{
						setState(761);
						match(INTLITERAL);
						}
					}

					setState(764);
					match(T__10);
					}
				}

				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(767);
				typeName();
				setState(773);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(768);
					match(T__9);
					setState(770);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==INTLITERAL) {
						{
						setState(769);
						match(INTLITERAL);
						}
					}

					setState(772);
					match(T__10);
					}
				}

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

	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(krlParser.IDENTIFIER, 0); }
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			match(IDENTIFIER);
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(krlParser.BOOL, 0); }
		public TerminalNode CHAR() { return getToken(krlParser.CHAR, 0); }
		public TerminalNode INT() { return getToken(krlParser.INT, 0); }
		public TerminalNode REAL() { return getToken(krlParser.REAL, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			_la = _input.LA(1);
			if ( !(((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (BOOL - 31)) | (1L << (CHAR - 31)) | (1L << (INT - 31)) | (1L << (REAL - 31)))) != 0)) ) {
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

	public static class ArgumentsContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
			match(T__5);
			setState(783);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__17) | (1L << T__18) | (1L << T__22) | (1L << B_NOT))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (FALSE - 65)) | (1L << (NOT - 65)) | (1L << (TRUE - 65)) | (1L << (CHARLITERAL - 65)) | (1L << (STRINGLITERAL - 65)) | (1L << (FLOATLITERAL - 65)) | (1L << (INTLITERAL - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				setState(782);
				expressionList();
				}
			}

			setState(785);
			match(T__6);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INTLITERAL() { return getToken(krlParser.INTLITERAL, 0); }
		public TerminalNode FLOATLITERAL() { return getToken(krlParser.FLOATLITERAL, 0); }
		public TerminalNode CHARLITERAL() { return getToken(krlParser.CHARLITERAL, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(krlParser.STRINGLITERAL, 0); }
		public StructLiteralContext structLiteral() {
			return getRuleContext(StructLiteralContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(krlParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(krlParser.FALSE, 0); }
		public EnumElementContext enumElement() {
			return getRuleContext(EnumElementContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_literal);
		try {
			setState(795);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(787);
				match(INTLITERAL);
				}
				break;
			case FLOATLITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(788);
				match(FLOATLITERAL);
				}
				break;
			case CHARLITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(789);
				match(CHARLITERAL);
				}
				break;
			case STRINGLITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(790);
				match(STRINGLITERAL);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 5);
				{
				setState(791);
				structLiteral();
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(792);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 7);
				{
				setState(793);
				match(FALSE);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 8);
				{
				setState(794);
				enumElement();
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

	public static class EnumElementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(krlParser.IDENTIFIER, 0); }
		public EnumElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).enterEnumElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof krlListener ) ((krlListener)listener).exitEnumElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof krlVisitor ) return ((krlVisitor<? extends T>)visitor).visitEnumElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumElementContext enumElement() throws RecognitionException {
		EnumElementContext _localctx = new EnumElementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_enumElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			match(T__22);
			setState(798);
			match(IDENTIFIER);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3p\u0323\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\3\2\5\2\u0083\n\2\3\2\3\2\3\3\3\3\3\3\7\3\u008a"+
		"\n\3\f\3\16\3\u008d\13\3\3\4\3\4\5\4\u0091\n\4\3\5\3\5\5\5\u0095\n\5\3"+
		"\6\5\6\u0098\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\5\b\u00a4\n\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\5\n\u00b3\n\n\3\n"+
		"\3\n\3\n\3\n\7\n\u00b9\n\n\f\n\16\n\u00bc\13\n\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00d0\n\f\f\f\16"+
		"\f\u00d3\13\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\5\16\u00dc\n\16\3\17\5\17"+
		"\u00df\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00eb"+
		"\n\17\f\17\16\17\u00ee\13\17\3\20\5\20\u00f1\n\20\3\20\3\20\3\20\3\20"+
		"\3\20\7\20\u00f8\n\20\f\20\16\20\u00fb\13\20\3\21\3\21\3\22\5\22\u0100"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\5\22\u0107\n\22\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u010e\n\23\3\24\5\24\u0111\n\24\3\24\5\24\u0114\n\24\3\24\5\24\u0117"+
		"\n\24\3\24\3\24\3\24\3\24\5\24\u011d\n\24\3\24\5\24\u0120\n\24\3\25\3"+
		"\25\7\25\u0124\n\25\f\25\16\25\u0127\13\25\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\5\27\u0130\n\27\3\27\3\27\3\27\3\30\3\30\3\30\7\30\u0138\n\30"+
		"\f\30\16\30\u013b\13\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u0144"+
		"\n\32\f\32\16\32\u0147\13\32\5\32\u0149\n\32\3\32\3\32\3\33\3\33\5\33"+
		"\u014f\n\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\7\35\u015f\n\35\f\35\16\35\u0162\13\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\5\36\u016d\n\36\3\37\3\37\3\37\3\37\7\37\u0173"+
		"\n\37\f\37\16\37\u0176\13\37\5\37\u0178\n\37\3\37\3\37\3 \3 \5 \u017e"+
		"\n \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\5#\u018e\n#\3$"+
		"\3$\3$\3$\3$\3$\5$\u0196\n$\5$\u0198\n$\5$\u019a\n$\5$\u019c\n$\5$\u019e"+
		"\n$\3$\3$\3%\3%\3&\7&\u01a5\n&\f&\16&\u01a8\13&\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01b6\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01c9\n\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\5\'\u01f5\n\'\3\'\3\'\3\'\5\'\u01fa\n\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\5\'\u0205\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\5\'\u0213\n\'\3\'\3\'\3\'\3\'\3\'\5\'\u021a\n\'\5\'\u021c\n\'"+
		"\3\'\3\'\3\'\3\'\3\'\5\'\u0223\n\'\3\'\3\'\3\'\3\'\3\'\5\'\u022a\n\'\3"+
		"\'\5\'\u022d\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0238\n\'\3\'"+
		"\5\'\u023b\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\5\'\u024c\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0256\n\'\3(\3"+
		"(\3(\3(\3(\3(\7(\u025e\n(\f(\16(\u0261\13(\3(\3(\5(\u0265\n(\3)\3)\3)"+
		"\3)\3)\5)\u026c\n)\3*\7*\u026f\n*\f*\16*\u0272\13*\3*\3*\3*\6*\u0277\n"+
		"*\r*\16*\u0278\3*\3*\3*\5*\u027e\n*\3+\3+\3+\3+\7+\u0284\n+\f+\16+\u0287"+
		"\13+\3+\3+\3,\3,\3,\3-\3-\3-\7-\u0291\n-\f-\16-\u0294\13-\3.\3.\3.\7."+
		"\u0299\n.\f.\16.\u029c\13.\3/\3/\3/\3/\7/\u02a2\n/\f/\16/\u02a5\13/\3"+
		"\60\3\60\3\61\3\61\3\61\7\61\u02ac\n\61\f\61\16\61\u02af\13\61\3\62\3"+
		"\62\3\62\7\62\u02b4\n\62\f\62\16\62\u02b7\13\62\3\63\3\63\3\63\7\63\u02bc"+
		"\n\63\f\63\16\63\u02bf\13\63\3\64\3\64\3\64\7\64\u02c4\n\64\f\64\16\64"+
		"\u02c7\13\64\3\65\3\65\3\65\7\65\u02cc\n\65\f\65\16\65\u02cf\13\65\3\66"+
		"\3\66\3\66\7\66\u02d4\n\66\f\66\16\66\u02d7\13\66\3\67\3\67\3\67\3\67"+
		"\3\67\5\67\u02de\n\67\38\38\38\38\38\58\u02e5\n8\39\39\39\39\79\u02eb"+
		"\n9\f9\169\u02ee\139\39\59\u02f1\n9\39\59\u02f4\n9\3:\3:\3:\3:\3;\3;\3"+
		";\5;\u02fd\n;\3;\5;\u0300\n;\3;\3;\3;\5;\u0305\n;\3;\5;\u0308\n;\5;\u030a"+
		"\n;\3<\3<\3=\3=\3>\3>\5>\u0312\n>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\5?\u031e"+
		"\n?\3@\3@\3@\3@\2\2A\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\2\f\3\2UV\4\2#$&&\3\2+"+
		",\3\2\16\23\4\2\37\37SS\4\2  gg\4\2\32\32\35\35\3\2\24\25\3\2\26\27\6"+
		"\2!!**KKXX\2\u0360\2\u0082\3\2\2\2\4\u0086\3\2\2\2\6\u0090\3\2\2\2\b\u0094"+
		"\3\2\2\2\n\u0097\3\2\2\2\f\u00a0\3\2\2\2\16\u00a3\3\2\2\2\20\u00ad\3\2"+
		"\2\2\22\u00af\3\2\2\2\24\u00bd\3\2\2\2\26\u00d1\3\2\2\2\30\u00d4\3\2\2"+
		"\2\32\u00db\3\2\2\2\34\u00de\3\2\2\2\36\u00f0\3\2\2\2 \u00fc\3\2\2\2\""+
		"\u00ff\3\2\2\2$\u0108\3\2\2\2&\u0110\3\2\2\2(\u0125\3\2\2\2*\u0128\3\2"+
		"\2\2,\u012b\3\2\2\2.\u0134\3\2\2\2\60\u013c\3\2\2\2\62\u013f\3\2\2\2\64"+
		"\u014c\3\2\2\2\66\u0150\3\2\2\28\u0160\3\2\2\2:\u016c\3\2\2\2<\u016e\3"+
		"\2\2\2>\u017b\3\2\2\2@\u017f\3\2\2\2B\u0182\3\2\2\2D\u018b\3\2\2\2F\u018f"+
		"\3\2\2\2H\u01a1\3\2\2\2J\u01a6\3\2\2\2L\u0255\3\2\2\2N\u0257\3\2\2\2P"+
		"\u0266\3\2\2\2R\u0270\3\2\2\2T\u027f\3\2\2\2V\u028a\3\2\2\2X\u028d\3\2"+
		"\2\2Z\u0295\3\2\2\2\\\u029d\3\2\2\2^\u02a6\3\2\2\2`\u02a8\3\2\2\2b\u02b0"+
		"\3\2\2\2d\u02b8\3\2\2\2f\u02c0\3\2\2\2h\u02c8\3\2\2\2j\u02d0\3\2\2\2l"+
		"\u02dd\3\2\2\2n\u02e4\3\2\2\2p\u02f3\3\2\2\2r\u02f5\3\2\2\2t\u0309\3\2"+
		"\2\2v\u030b\3\2\2\2x\u030d\3\2\2\2z\u030f\3\2\2\2|\u031d\3\2\2\2~\u031f"+
		"\3\2\2\2\u0080\u0083\5\22\n\2\u0081\u0083\5\4\3\2\u0082\u0080\3\2\2\2"+
		"\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\7\2\2\3\u0085\3\3"+
		"\2\2\2\u0086\u008b\5\6\4\2\u0087\u008a\5\b\5\2\u0088\u008a\7j\2\2\u0089"+
		"\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008b\u008c\3\2\2\2\u008c\5\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u0091"+
		"\5\n\6\2\u008f\u0091\5\16\b\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2\2"+
		"\u0091\7\3\2\2\2\u0092\u0095\5\n\6\2\u0093\u0095\5\16\b\2\u0094\u0092"+
		"\3\2\2\2\u0094\u0093\3\2\2\2\u0095\t\3\2\2\2\u0096\u0098\7E\2\2\u0097"+
		"\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7\61"+
		"\2\2\u009a\u009b\5\f\7\2\u009b\u009c\5\62\32\2\u009c\u009d\7j\2\2\u009d"+
		"\u009e\5\66\34\2\u009e\u009f\7\67\2\2\u009f\13\3\2\2\2\u00a0\u00a1\7p"+
		"\2\2\u00a1\r\3\2\2\2\u00a2\u00a4\7E\2\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4"+
		"\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\7\64\2\2\u00a6\u00a7\5t;\2\u00a7"+
		"\u00a8\5\20\t\2\u00a8\u00a9\5\62\32\2\u00a9\u00aa\7j\2\2\u00aa\u00ab\5"+
		"\66\34\2\u00ab\u00ac\79\2\2\u00ac\17\3\2\2\2\u00ad\u00ae\7p\2\2\u00ae"+
		"\21\3\2\2\2\u00af\u00b0\7\63\2\2\u00b0\u00b2\5\24\13\2\u00b1\u00b3\7W"+
		"\2\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b5\7j\2\2\u00b5\u00b6\5\26\f\2\u00b6\u00ba\78\2\2\u00b7\u00b9\7j\2"+
		"\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb"+
		"\3\2\2\2\u00bb\23\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\7p\2\2\u00be"+
		"\25\3\2\2\2\u00bf\u00d0\7j\2\2\u00c0\u00c1\5:\36\2\u00c1\u00c2\7j\2\2"+
		"\u00c2\u00d0\3\2\2\2\u00c3\u00c4\5\32\16\2\u00c4\u00c5\7j\2\2\u00c5\u00d0"+
		"\3\2\2\2\u00c6\u00c7\5&\24\2\u00c7\u00c8\7j\2\2\u00c8\u00d0\3\2\2\2\u00c9"+
		"\u00ca\5\30\r\2\u00ca\u00cb\7j\2\2\u00cb\u00d0\3\2\2\2\u00cc\u00cd\5B"+
		"\"\2\u00cd\u00ce\7j\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00bf\3\2\2\2\u00cf"+
		"\u00c0\3\2\2\2\u00cf\u00c3\3\2\2\2\u00cf\u00c6\3\2\2\2\u00cf\u00c9\3\2"+
		"\2\2\u00cf\u00cc\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\27\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\7p\2\2"+
		"\u00d5\u00d6\5F$\2\u00d6\u00d7\7\3\2\2\u00d7\u00d8\5n8\2\u00d8\31\3\2"+
		"\2\2\u00d9\u00dc\5\34\17\2\u00da\u00dc\5\36\20\2\u00db\u00d9\3\2\2\2\u00db"+
		"\u00da\3\2\2\2\u00dc\33\3\2\2\2\u00dd\u00df\7E\2\2\u00de\u00dd\3\2\2\2"+
		"\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\7]\2\2\u00e1\u00e2"+
		"\5v<\2\u00e2\u00e3\5t;\2\u00e3\u00e4\5D#\2\u00e4\u00ec\5(\25\2\u00e5\u00e6"+
		"\7\4\2\2\u00e6\u00e7\5t;\2\u00e7\u00e8\5D#\2\u00e8\u00e9\5(\25\2\u00e9"+
		"\u00eb\3\2\2\2\u00ea\u00e5\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2"+
		"\2\2\u00ec\u00ed\3\2\2\2\u00ed\35\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f1"+
		"\7E\2\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u00f3\7?\2\2\u00f3\u00f4\5v<\2\u00f4\u00f9\5 \21\2\u00f5\u00f6\7\4\2"+
		"\2\u00f6\u00f8\5 \21\2\u00f7\u00f5\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7"+
		"\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\37\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc"+
		"\u00fd\7p\2\2\u00fd!\3\2\2\2\u00fe\u0100\7\60\2\2\u00ff\u00fe\3\2\2\2"+
		"\u00ff\u0100\3\2\2\2\u0100\u0106\3\2\2\2\u0101\u0102\5t;\2\u0102\u0103"+
		"\5D#\2\u0103\u0104\5(\25\2\u0104\u0107\3\2\2\2\u0105\u0107\5$\23\2\u0106"+
		"\u0101\3\2\2\2\u0106\u0105\3\2\2\2\u0107#\3\2\2\2\u0108\u0109\7\\\2\2"+
		"\u0109\u010a\7p\2\2\u010a\u010d\5p9\2\u010b\u010c\7`\2\2\u010c\u010e\5"+
		"p9\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e%\3\2\2\2\u010f\u0111"+
		"\7\60\2\2\u0110\u010f\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0113\3\2\2\2"+
		"\u0112\u0114\7E\2\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116"+
		"\3\2\2\2\u0115\u0117\7-\2\2\u0116\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u011f\3\2\2\2\u0118\u0119\5t;\2\u0119\u011c\5D#\2\u011a\u011d\5(\25\2"+
		"\u011b\u011d\5*\26\2\u011c\u011a\3\2\2\2\u011c\u011b\3\2\2\2\u011d\u0120"+
		"\3\2\2\2\u011e\u0120\5$\23\2\u011f\u0118\3\2\2\2\u011f\u011e\3\2\2\2\u0120"+
		"\'\3\2\2\2\u0121\u0122\7\4\2\2\u0122\u0124\5D#\2\u0123\u0121\3\2\2\2\u0124"+
		"\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126)\3\2\2\2"+
		"\u0127\u0125\3\2\2\2\u0128\u0129\7\3\2\2\u0129\u012a\5n8\2\u012a+\3\2"+
		"\2\2\u012b\u012f\7\5\2\2\u012c\u012d\5v<\2\u012d\u012e\7\6\2\2\u012e\u0130"+
		"\3\2\2\2\u012f\u012c\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"\u0132\5.\30\2\u0132\u0133\7\7\2\2\u0133-\3\2\2\2\u0134\u0139\5\60\31"+
		"\2\u0135\u0136\7\4\2\2\u0136\u0138\5\60\31\2\u0137\u0135\3\2\2\2\u0138"+
		"\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a/\3\2\2\2"+
		"\u013b\u0139\3\2\2\2\u013c\u013d\5D#\2\u013d\u013e\5n8\2\u013e\61\3\2"+
		"\2\2\u013f\u0148\7\b\2\2\u0140\u0145\5\64\33\2\u0141\u0142\7\4\2\2\u0142"+
		"\u0144\5\64\33\2\u0143\u0141\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3"+
		"\2\2\2\u0145\u0146\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0148"+
		"\u0140\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\7\t"+
		"\2\2\u014b\63\3\2\2\2\u014c\u014e\5D#\2\u014d\u014f\5@!\2\u014e\u014d"+
		"\3\2\2\2\u014e\u014f\3\2\2\2\u014f\65\3\2\2\2\u0150\u0151\58\35\2\u0151"+
		"\u0152\5H%\2\u0152\67\3\2\2\2\u0153\u0154\5:\36\2\u0154\u0155\7j\2\2\u0155"+
		"\u015f\3\2\2\2\u0156\u0157\5\"\22\2\u0157\u0158\7j\2\2\u0158\u015f\3\2"+
		"\2\2\u0159\u015a\7j\2\2\u015a\u015f\7j\2\2\u015b\u015c\5B\"\2\u015c\u015d"+
		"\7j\2\2\u015d\u015f\3\2\2\2\u015e\u0153\3\2\2\2\u015e\u0156\3\2\2\2\u015e"+
		"\u0159\3\2\2\2\u015e\u015b\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2"+
		"\2\2\u0160\u0161\3\2\2\2\u01619\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0164"+
		"\7A\2\2\u0164\u0165\5\f\7\2\u0165\u0166\5<\37\2\u0166\u016d\3\2\2\2\u0167"+
		"\u0168\7B\2\2\u0168\u0169\5t;\2\u0169\u016a\5\20\t\2\u016a\u016b\5<\37"+
		"\2\u016b\u016d\3\2\2\2\u016c\u0163\3\2\2\2\u016c\u0167\3\2\2\2\u016d;"+
		"\3\2\2\2\u016e\u0177\7\b\2\2\u016f\u0174\5> \2\u0170\u0171\7\4\2\2\u0171"+
		"\u0173\5> \2\u0172\u0170\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172\3\2\2"+
		"\2\u0174\u0175\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0177\u016f"+
		"\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\7\t\2\2\u017a"+
		"=\3\2\2\2\u017b\u017d\5t;\2\u017c\u017e\5@!\2\u017d\u017c\3\2\2\2\u017d"+
		"\u017e\3\2\2\2\u017e?\3\2\2\2\u017f\u0180\7\6\2\2\u0180\u0181\7p\2\2\u0181"+
		"A\3\2\2\2\u0182\u0183\7I\2\2\u0183\u0184\5t;\2\u0184\u0185\5D#\2\u0185"+
		"\u0186\7L\2\2\u0186\u0187\7\n\2\2\u0187\u0188\5\24\13\2\u0188\u0189\7"+
		"\13\2\2\u0189\u018a\5D#\2\u018aC\3\2\2\2\u018b\u018d\7p\2\2\u018c\u018e"+
		"\5F$\2\u018d\u018c\3\2\2\2\u018d\u018e\3\2\2\2\u018eE\3\2\2\2\u018f\u019d"+
		"\7\f\2\2\u0190\u019b\5\\/\2\u0191\u0199\7\4\2\2\u0192\u0197\5\\/\2\u0193"+
		"\u0195\7\4\2\2\u0194\u0196\5\\/\2\u0195\u0194\3\2\2\2\u0195\u0196\3\2"+
		"\2\2\u0196\u0198\3\2\2\2\u0197\u0193\3\2\2\2\u0197\u0198\3\2\2\2\u0198"+
		"\u019a\3\2\2\2\u0199\u0192\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019c\3\2"+
		"\2\2\u019b\u0191\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019e\3\2\2\2\u019d"+
		"\u0190\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\7\r"+
		"\2\2\u01a0G\3\2\2\2\u01a1\u01a2\5J&\2\u01a2I\3\2\2\2\u01a3\u01a5\5L\'"+
		"\2\u01a4\u01a3\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7"+
		"\3\2\2\2\u01a7K\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01aa\7.\2\2\u01aa\u0256"+
		"\7j\2\2\u01ab\u01ac\7@\2\2\u01ac\u0256\7j\2\2\u01ad\u01ae\7D\2\2\u01ae"+
		"\u01af\7p\2\2\u01af\u01b0\7\3\2\2\u01b0\u01b1\5\\/\2\u01b1\u01b2\7`\2"+
		"\2\u01b2\u01b5\5\\/\2\u01b3\u01b4\7p\2\2\u01b4\u01b6\5\\/\2\u01b5\u01b3"+
		"\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b8\7j\2\2\u01b8"+
		"\u01b9\5J&\2\u01b9\u01ba\7:\2\2\u01ba\u0256\3\2\2\2\u01bb\u01bc\7F\2\2"+
		"\u01bc\u01bd\7p\2\2\u01bd\u0256\7j\2\2\u01be\u01bf\7G\2\2\u01bf\u0256"+
		"\7j\2\2\u01c0\u01c1\7H\2\2\u01c1\u01c2\5\\/\2\u01c2\u01c3\7_\2\2\u01c3"+
		"\u01c4\7j\2\2\u01c4\u01c8\5J&\2\u01c5\u01c6\7\66\2\2\u01c6\u01c7\7j\2"+
		"\2\u01c7\u01c9\5J&\2\u01c8\u01c5\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ca"+
		"\3\2\2\2\u01ca\u01cb\7;\2\2\u01cb\u01cc\7j\2\2\u01cc\u0256\3\2\2\2\u01cd"+
		"\u01ce\7O\2\2\u01ce\u01cf\7j\2\2\u01cf\u01d0\5J&\2\u01d0\u01d1\7<\2\2"+
		"\u01d1\u01d2\7j\2\2\u01d2\u0256\3\2\2\2\u01d3\u01d4\7Y\2\2\u01d4\u01d5"+
		"\7j\2\2\u01d5\u01d6\5J&\2\u01d6\u01d7\7c\2\2\u01d7\u01d8\5\\/\2\u01d8"+
		"\u01d9\7j\2\2\u01d9\u0256\3\2\2\2\u01da\u01db\7^\2\2\u01db\u01dc\5\\/"+
		"\2\u01dc\u01dd\7j\2\2\u01dd\u01de\5R*\2\u01de\u01df\7=\2\2\u01df\u01e0"+
		"\7j\2\2\u01e0\u0256\3\2\2\2\u01e1\u01e2\7d\2\2\u01e2\u01e3\7D\2\2\u01e3"+
		"\u01e4\5\\/\2\u01e4\u01e5\7j\2\2\u01e5\u0256\3\2\2\2\u01e6\u01e7\7d\2"+
		"\2\u01e7\u01e8\7[\2\2\u01e8\u01e9\5\\/\2\u01e9\u01ea\7j\2\2\u01ea\u0256"+
		"\3\2\2\2\u01eb\u01ec\7f\2\2\u01ec\u01ed\5\\/\2\u01ed\u01ee\7j\2\2\u01ee"+
		"\u01ef\5J&\2\u01ef\u01f0\7>\2\2\u01f0\u01f1\7j\2\2\u01f1\u0256\3\2\2\2"+
		"\u01f2\u01f4\7Z\2\2\u01f3\u01f5\5Z.\2\u01f4\u01f3\3\2\2\2\u01f4\u01f5"+
		"\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u0256\7j\2\2\u01f7\u01f9\7\"\2\2\u01f8"+
		"\u01fa\7p\2\2\u01f9\u01f8\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fb\3\2"+
		"\2\2\u01fb\u0256\7j\2\2\u01fc\u01fd\5Z.\2\u01fd\u01fe\7j\2\2\u01fe\u0256"+
		"\3\2\2\2\u01ff\u0200\7p\2\2\u0200\u0201\7\6\2\2\u0201\u0256\7j\2\2\u0202"+
		"\u0256\7j\2\2\u0203\u0205\7E\2\2\u0204\u0203\3\2\2\2\u0204\u0205\3\2\2"+
		"\2\u0205\u0206\3\2\2\2\u0206\u0207\7J\2\2\u0207\u0208\7\60\2\2\u0208\u0209"+
		"\5p9\2\u0209\u020a\7e\2\2\u020a\u020b\5\\/\2\u020b\u020c\7\65\2\2\u020c"+
		"\u020d\5Z.\2\u020d\u020e\7j\2\2\u020e\u0256\3\2\2\2\u020f\u0210\7J\2\2"+
		"\u0210\u0212\7p\2\2\u0211\u0213\5p9\2\u0212\u0211\3\2\2\2\u0212\u0213"+
		"\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0256\7j\2\2\u0215\u0216\t\2\2\2\u0216"+
		"\u021b\5j\66\2\u0217\u0219\7%\2\2\u0218\u021a\t\3\2\2\u0219\u0218\3\2"+
		"\2\2\u0219\u021a\3\2\2\2\u021a\u021c\3\2\2\2\u021b\u0217\3\2\2\2\u021b"+
		"\u021c\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021e\7j\2\2\u021e\u0256\3\2"+
		"\2\2\u021f\u0220\7N\2\2\u0220\u0222\5j\66\2\u0221\u0223\t\3\2\2\u0222"+
		"\u0221\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0225\7j"+
		"\2\2\u0225\u0256\3\2\2\2\u0226\u0227\7M\2\2\u0227\u0229\5j\66\2\u0228"+
		"\u022a\t\3\2\2\u0229\u0228\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022c\3\2"+
		"\2\2\u022b\u022d\5~@\2\u022c\u022b\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022e"+
		"\3\2\2\2\u022e\u022f\7j\2\2\u022f\u0256\3\2\2\2\u0230\u0231\t\4\2\2\u0231"+
		"\u0232\5j\66\2\u0232\u0233\7\4\2\2\u0233\u0237\5j\66\2\u0234\u0235\7\4"+
		"\2\2\u0235\u0236\7p\2\2\u0236\u0238\5p9\2\u0237\u0234\3\2\2\2\u0237\u0238"+
		"\3\2\2\2\u0238\u023a\3\2\2\2\u0239\u023b\t\3\2\2\u023a\u0239\3\2\2\2\u023a"+
		"\u023b\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023d\7j\2\2\u023d\u0256\3\2"+
		"\2\2\u023e\u023f\7a\2\2\u023f\u0240\7e\2\2\u0240\u0241\7p\2\2\u0241\u0242"+
		"\7\3\2\2\u0242\u0243\5\\/\2\u0243\u0244\7/\2\2\u0244\u0245\7\3\2\2\u0245"+
		"\u0246\5\\/\2\u0246\u0247\7\65\2\2\u0247\u024b\5Z.\2\u0248\u0249\7T\2"+
		"\2\u0249\u024a\7\3\2\2\u024a\u024c\5\\/\2\u024b\u0248\3\2\2\2\u024b\u024c"+
		"\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024e\7j\2\2\u024e\u0256\3\2\2\2\u024f"+
		"\u0250\5P)\2\u0250\u0251\7j\2\2\u0251\u0256\3\2\2\2\u0252\u0253\5N(\2"+
		"\u0253\u0254\7j\2\2\u0254\u0256\3\2\2\2\u0255\u01a9\3\2\2\2\u0255\u01ab"+
		"\3\2\2\2\u0255\u01ad\3\2\2\2\u0255\u01bb\3\2\2\2\u0255\u01be\3\2\2\2\u0255"+
		"\u01c0\3\2\2\2\u0255\u01cd\3\2\2\2\u0255\u01d3\3\2\2\2\u0255\u01da\3\2"+
		"\2\2\u0255\u01e1\3\2\2\2\u0255\u01e6\3\2\2\2\u0255\u01eb\3\2\2\2\u0255"+
		"\u01f2\3\2\2\2\u0255\u01f7\3\2\2\2\u0255\u01fc\3\2\2\2\u0255\u01ff\3\2"+
		"\2\2\u0255\u0202\3\2\2\2\u0255\u0204\3\2\2\2\u0255\u020f\3\2\2\2\u0255"+
		"\u0215\3\2\2\2\u0255\u021f\3\2\2\2\u0255\u0226\3\2\2\2\u0255\u0230\3\2"+
		"\2\2\u0255\u023e\3\2\2\2\u0255\u024f\3\2\2\2\u0255\u0252\3\2\2\2\u0256"+
		"M\3\2\2\2\u0257\u0264\7\34\2\2\u0258\u0259\7p\2\2\u0259\u025f\5Z.\2\u025a"+
		"\u025b\7p\2\2\u025b\u025c\7\3\2\2\u025c\u025e\5|?\2\u025d\u025a\3\2\2"+
		"\2\u025e\u0261\3\2\2\2\u025f\u025d\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0265"+
		"\3\2\2\2\u0261\u025f\3\2\2\2\u0262\u0263\7p\2\2\u0263\u0265\7p\2\2\u0264"+
		"\u0258\3\2\2\2\u0264\u0262\3\2\2\2\u0265O\3\2\2\2\u0266\u026b\7\33\2\2"+
		"\u0267\u0268\7p\2\2\u0268\u026c\5Z.\2\u0269\u026a\7p\2\2\u026a\u026c\7"+
		"p\2\2\u026b\u0267\3\2\2\2\u026b\u0269\3\2\2\2\u026cQ\3\2\2\2\u026d\u026f"+
		"\7j\2\2\u026e\u026d\3\2\2\2\u026f\u0272\3\2\2\2\u0270\u026e\3\2\2\2\u0270"+
		"\u0271\3\2\2\2\u0271\u0276\3\2\2\2\u0272\u0270\3\2\2\2\u0273\u0274\5T"+
		"+\2\u0274\u0275\5J&\2\u0275\u0277\3\2\2\2\u0276\u0273\3\2\2\2\u0277\u0278"+
		"\3\2\2\2\u0278\u0276\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027d\3\2\2\2\u027a"+
		"\u027b\5V,\2\u027b\u027c\5J&\2\u027c\u027e\3\2\2\2\u027d\u027a\3\2\2\2"+
		"\u027d\u027e\3\2\2\2\u027eS\3\2\2\2\u027f\u0280\7\'\2\2\u0280\u0285\5"+
		"\\/\2\u0281\u0282\7\4\2\2\u0282\u0284\5\\/\2\u0283\u0281\3\2\2\2\u0284"+
		"\u0287\3\2\2\2\u0285\u0283\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0288\3\2"+
		"\2\2\u0287\u0285\3\2\2\2\u0288\u0289\7j\2\2\u0289U\3\2\2\2\u028a\u028b"+
		"\7\62\2\2\u028b\u028c\7j\2\2\u028cW\3\2\2\2\u028d\u0292\5Z.\2\u028e\u028f"+
		"\7\4\2\2\u028f\u0291\5Z.\2\u0290\u028e\3\2\2\2\u0291\u0294\3\2\2\2\u0292"+
		"\u0290\3\2\2\2\u0292\u0293\3\2\2\2\u0293Y\3\2\2\2\u0294\u0292\3\2\2\2"+
		"\u0295\u029a\5\\/\2\u0296\u0297\7\3\2\2\u0297\u0299\5\\/\2\u0298\u0296"+
		"\3\2\2\2\u0299\u029c\3\2\2\2\u029a\u0298\3\2\2\2\u029a\u029b\3\2\2\2\u029b"+
		"[\3\2\2\2\u029c\u029a\3\2\2\2\u029d\u02a3\5`\61\2\u029e\u029f\5^\60\2"+
		"\u029f\u02a0\5`\61\2\u02a0\u02a2\3\2\2\2\u02a1\u029e\3\2\2\2\u02a2\u02a5"+
		"\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4]\3\2\2\2\u02a5"+
		"\u02a3\3\2\2\2\u02a6\u02a7\t\5\2\2\u02a7_\3\2\2\2\u02a8\u02ad\5b\62\2"+
		"\u02a9\u02aa\t\6\2\2\u02aa\u02ac\5b\62\2\u02ab\u02a9\3\2\2\2\u02ac\u02af"+
		"\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ad\u02ae\3\2\2\2\u02aea\3\2\2\2\u02af"+
		"\u02ad\3\2\2\2\u02b0\u02b5\5d\63\2\u02b1\u02b2\t\7\2\2\u02b2\u02b4\5d"+
		"\63\2\u02b3\u02b1\3\2\2\2\u02b4\u02b7\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b5"+
		"\u02b6\3\2\2\2\u02b6c\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b8\u02bd\5f\64\2"+
		"\u02b9\u02ba\t\b\2\2\u02ba\u02bc\5f\64\2\u02bb\u02b9\3\2\2\2\u02bc\u02bf"+
		"\3\2\2\2\u02bd\u02bb\3\2\2\2\u02bd\u02be\3\2\2\2\u02bee\3\2\2\2\u02bf"+
		"\u02bd\3\2\2\2\u02c0\u02c5\5h\65\2\u02c1\u02c2\t\t\2\2\u02c2\u02c4\5h"+
		"\65\2\u02c3\u02c1\3\2\2\2\u02c4\u02c7\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c5"+
		"\u02c6\3\2\2\2\u02c6g\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c8\u02cd\5j\66\2"+
		"\u02c9\u02ca\t\n\2\2\u02ca\u02cc\5j\66\2\u02cb\u02c9\3\2\2\2\u02cc\u02cf"+
		"\3\2\2\2\u02cd\u02cb\3\2\2\2\u02cd\u02ce\3\2\2\2\u02cei\3\2\2\2\u02cf"+
		"\u02cd\3\2\2\2\u02d0\u02d5\5l\67\2\u02d1\u02d2\7\6\2\2\u02d2\u02d4\5l"+
		"\67\2\u02d3\u02d1\3\2\2\2\u02d4\u02d7\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d5"+
		"\u02d6\3\2\2\2\u02d6k\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d8\u02d9\7R\2\2\u02d9"+
		"\u02de\5l\67\2\u02da\u02db\7\36\2\2\u02db\u02de\5l\67\2\u02dc\u02de\5"+
		"n8\2\u02dd\u02d8\3\2\2\2\u02dd\u02da\3\2\2\2\u02dd\u02dc\3\2\2\2\u02de"+
		"m\3\2\2\2\u02df\u02e0\7\24\2\2\u02e0\u02e5\5n8\2\u02e1\u02e2\7\25\2\2"+
		"\u02e2\u02e5\5n8\2\u02e3\u02e5\5p9\2\u02e4\u02df\3\2\2\2\u02e4\u02e1\3"+
		"\2\2\2\u02e4\u02e3\3\2\2\2\u02e5o\3\2\2\2\u02e6\u02f4\5r:\2\u02e7\u02ec"+
		"\5D#\2\u02e8\u02e9\7\30\2\2\u02e9\u02eb\5D#\2\u02ea\u02e8\3\2\2\2\u02eb"+
		"\u02ee\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02f0\3\2"+
		"\2\2\u02ee\u02ec\3\2\2\2\u02ef\u02f1\5z>\2\u02f0\u02ef\3\2\2\2\u02f0\u02f1"+
		"\3\2\2\2\u02f1\u02f4\3\2\2\2\u02f2\u02f4\5|?\2\u02f3\u02e6\3\2\2\2\u02f3"+
		"\u02e7\3\2\2\2\u02f3\u02f2\3\2\2\2\u02f4q\3\2\2\2\u02f5\u02f6\7\b\2\2"+
		"\u02f6\u02f7\5Z.\2\u02f7\u02f8\7\t\2\2\u02f8s\3\2\2\2\u02f9\u02ff\5x="+
		"\2\u02fa\u02fc\7\f\2\2\u02fb\u02fd\7o\2\2\u02fc\u02fb\3\2\2\2\u02fc\u02fd"+
		"\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u0300\7\r\2\2\u02ff\u02fa\3\2\2\2\u02ff"+
		"\u0300\3\2\2\2\u0300\u030a\3\2\2\2\u0301\u0307\5v<\2\u0302\u0304\7\f\2"+
		"\2\u0303\u0305\7o\2\2\u0304\u0303\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0306"+
		"\3\2\2\2\u0306\u0308\7\r\2\2\u0307\u0302\3\2\2\2\u0307\u0308\3\2\2\2\u0308"+
		"\u030a\3\2\2\2\u0309\u02f9\3\2\2\2\u0309\u0301\3\2\2\2\u030au\3\2\2\2"+
		"\u030b\u030c\7p\2\2\u030cw\3\2\2\2\u030d\u030e\t\13\2\2\u030ey\3\2\2\2"+
		"\u030f\u0311\7\b\2\2\u0310\u0312\5X-\2\u0311\u0310\3\2\2\2\u0311\u0312"+
		"\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0314\7\t\2\2\u0314{\3\2\2\2\u0315"+
		"\u031e\7o\2\2\u0316\u031e\7n\2\2\u0317\u031e\7l\2\2\u0318\u031e\7m\2\2"+
		"\u0319\u031e\5,\27\2\u031a\u031e\7b\2\2\u031b\u031e\7C\2\2\u031c\u031e"+
		"\5~@\2\u031d\u0315\3\2\2\2\u031d\u0316\3\2\2\2\u031d\u0317\3\2\2\2\u031d"+
		"\u0318\3\2\2\2\u031d\u0319\3\2\2\2\u031d\u031a\3\2\2\2\u031d\u031b\3\2"+
		"\2\2\u031d\u031c\3\2\2\2\u031e}\3\2\2\2\u031f\u0320\7\31\2\2\u0320\u0321"+
		"\7p\2\2\u0321\177\3\2\2\2X\u0082\u0089\u008b\u0090\u0094\u0097\u00a3\u00b2"+
		"\u00ba\u00cf\u00d1\u00db\u00de\u00ec\u00f0\u00f9\u00ff\u0106\u010d\u0110"+
		"\u0113\u0116\u011c\u011f\u0125\u012f\u0139\u0145\u0148\u014e\u015e\u0160"+
		"\u016c\u0174\u0177\u017d\u018d\u0195\u0197\u0199\u019b\u019d\u01a6\u01b5"+
		"\u01c8\u01f4\u01f9\u0204\u0212\u0219\u021b\u0222\u0229\u022c\u0237\u023a"+
		"\u024b\u0255\u025f\u0264\u026b\u0270\u0278\u027d\u0285\u0292\u029a\u02a3"+
		"\u02ad\u02b5\u02bd\u02c5\u02cd\u02d5\u02dd\u02e4\u02ec\u02f0\u02f3\u02fc"+
		"\u02ff\u0304\u0307\u0309\u0311\u031d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}