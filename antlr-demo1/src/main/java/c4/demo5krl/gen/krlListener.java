// Generated from D:/lib/IDEA_space/mygithub-repository/data-structures/antlr-demo1/src/main/java/c4/demo5krl\krl.g4 by ANTLR 4.7.2
package c4.demo5krl.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link krlParser}.
 */
public interface krlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link krlParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(krlParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(krlParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#moduleRoutines}.
	 * @param ctx the parse tree
	 */
	void enterModuleRoutines(krlParser.ModuleRoutinesContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#moduleRoutines}.
	 * @param ctx the parse tree
	 */
	void exitModuleRoutines(krlParser.ModuleRoutinesContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#mainRoutine}.
	 * @param ctx the parse tree
	 */
	void enterMainRoutine(krlParser.MainRoutineContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#mainRoutine}.
	 * @param ctx the parse tree
	 */
	void exitMainRoutine(krlParser.MainRoutineContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#subRoutine}.
	 * @param ctx the parse tree
	 */
	void enterSubRoutine(krlParser.SubRoutineContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#subRoutine}.
	 * @param ctx the parse tree
	 */
	void exitSubRoutine(krlParser.SubRoutineContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#procedureDefinition}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDefinition(krlParser.ProcedureDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#procedureDefinition}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDefinition(krlParser.ProcedureDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#procedureName}.
	 * @param ctx the parse tree
	 */
	void enterProcedureName(krlParser.ProcedureNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#procedureName}.
	 * @param ctx the parse tree
	 */
	void exitProcedureName(krlParser.ProcedureNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(krlParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(krlParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(krlParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(krlParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#moduleData}.
	 * @param ctx the parse tree
	 */
	void enterModuleData(krlParser.ModuleDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#moduleData}.
	 * @param ctx the parse tree
	 */
	void exitModuleData(krlParser.ModuleDataContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#moduleName}.
	 * @param ctx the parse tree
	 */
	void enterModuleName(krlParser.ModuleNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#moduleName}.
	 * @param ctx the parse tree
	 */
	void exitModuleName(krlParser.ModuleNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#dataList}.
	 * @param ctx the parse tree
	 */
	void enterDataList(krlParser.DataListContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#dataList}.
	 * @param ctx the parse tree
	 */
	void exitDataList(krlParser.DataListContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#arrayInitialisation}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitialisation(krlParser.ArrayInitialisationContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#arrayInitialisation}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitialisation(krlParser.ArrayInitialisationContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(krlParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(krlParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#structureDefinition}.
	 * @param ctx the parse tree
	 */
	void enterStructureDefinition(krlParser.StructureDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#structureDefinition}.
	 * @param ctx the parse tree
	 */
	void exitStructureDefinition(krlParser.StructureDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#enumDefinition}.
	 * @param ctx the parse tree
	 */
	void enterEnumDefinition(krlParser.EnumDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#enumDefinition}.
	 * @param ctx the parse tree
	 */
	void exitEnumDefinition(krlParser.EnumDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#enumValue}.
	 * @param ctx the parse tree
	 */
	void enterEnumValue(krlParser.EnumValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#enumValue}.
	 * @param ctx the parse tree
	 */
	void exitEnumValue(krlParser.EnumValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(krlParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(krlParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#signalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSignalDeclaration(krlParser.SignalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#signalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSignalDeclaration(krlParser.SignalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#variableDeclarationInDataList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationInDataList(krlParser.VariableDeclarationInDataListContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#variableDeclarationInDataList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationInDataList(krlParser.VariableDeclarationInDataListContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#variableListRest}.
	 * @param ctx the parse tree
	 */
	void enterVariableListRest(krlParser.VariableListRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#variableListRest}.
	 * @param ctx the parse tree
	 */
	void exitVariableListRest(krlParser.VariableListRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#variableInitialisation}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitialisation(krlParser.VariableInitialisationContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#variableInitialisation}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitialisation(krlParser.VariableInitialisationContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#structLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStructLiteral(krlParser.StructLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#structLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStructLiteral(krlParser.StructLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#structElementList}.
	 * @param ctx the parse tree
	 */
	void enterStructElementList(krlParser.StructElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#structElementList}.
	 * @param ctx the parse tree
	 */
	void exitStructElementList(krlParser.StructElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#structElement}.
	 * @param ctx the parse tree
	 */
	void enterStructElement(krlParser.StructElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#structElement}.
	 * @param ctx the parse tree
	 */
	void exitStructElement(krlParser.StructElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(krlParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(krlParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(krlParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(krlParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#routineBody}.
	 * @param ctx the parse tree
	 */
	void enterRoutineBody(krlParser.RoutineBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#routineBody}.
	 * @param ctx the parse tree
	 */
	void exitRoutineBody(krlParser.RoutineBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#routineDataSection}.
	 * @param ctx the parse tree
	 */
	void enterRoutineDataSection(krlParser.RoutineDataSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#routineDataSection}.
	 * @param ctx the parse tree
	 */
	void exitRoutineDataSection(krlParser.RoutineDataSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#forwardDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterForwardDeclaration(krlParser.ForwardDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#forwardDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitForwardDeclaration(krlParser.ForwardDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#formalParametersWithType}.
	 * @param ctx the parse tree
	 */
	void enterFormalParametersWithType(krlParser.FormalParametersWithTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#formalParametersWithType}.
	 * @param ctx the parse tree
	 */
	void exitFormalParametersWithType(krlParser.FormalParametersWithTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#parameterWithType}.
	 * @param ctx the parse tree
	 */
	void enterParameterWithType(krlParser.ParameterWithTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#parameterWithType}.
	 * @param ctx the parse tree
	 */
	void exitParameterWithType(krlParser.ParameterWithTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#parameterCallType}.
	 * @param ctx the parse tree
	 */
	void enterParameterCallType(krlParser.ParameterCallTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#parameterCallType}.
	 * @param ctx the parse tree
	 */
	void exitParameterCallType(krlParser.ParameterCallTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(krlParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(krlParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(krlParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(krlParser.VariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#arrayVariableSuffix}.
	 * @param ctx the parse tree
	 */
	void enterArrayVariableSuffix(krlParser.ArrayVariableSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#arrayVariableSuffix}.
	 * @param ctx the parse tree
	 */
	void exitArrayVariableSuffix(krlParser.ArrayVariableSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#routineImplementationSection}.
	 * @param ctx the parse tree
	 */
	void enterRoutineImplementationSection(krlParser.RoutineImplementationSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#routineImplementationSection}.
	 * @param ctx the parse tree
	 */
	void exitRoutineImplementationSection(krlParser.RoutineImplementationSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(krlParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(krlParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(krlParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(krlParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#analogOutputStatement}.
	 * @param ctx the parse tree
	 */
	void enterAnalogOutputStatement(krlParser.AnalogOutputStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#analogOutputStatement}.
	 * @param ctx the parse tree
	 */
	void exitAnalogOutputStatement(krlParser.AnalogOutputStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#analogInputStatement}.
	 * @param ctx the parse tree
	 */
	void enterAnalogInputStatement(krlParser.AnalogInputStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#analogInputStatement}.
	 * @param ctx the parse tree
	 */
	void exitAnalogInputStatement(krlParser.AnalogInputStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#switchBlockStatementGroups}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroups(krlParser.SwitchBlockStatementGroupsContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#switchBlockStatementGroups}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroups(krlParser.SwitchBlockStatementGroupsContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#caseLabel}.
	 * @param ctx the parse tree
	 */
	void enterCaseLabel(krlParser.CaseLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#caseLabel}.
	 * @param ctx the parse tree
	 */
	void exitCaseLabel(krlParser.CaseLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#defaultLabel}.
	 * @param ctx the parse tree
	 */
	void enterDefaultLabel(krlParser.DefaultLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#defaultLabel}.
	 * @param ctx the parse tree
	 */
	void exitDefaultLabel(krlParser.DefaultLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(krlParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(krlParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(krlParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(krlParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(krlParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(krlParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOp(krlParser.RelationalOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOp(krlParser.RelationalOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(krlParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(krlParser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(krlParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(krlParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(krlParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(krlParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(krlParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(krlParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(krlParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(krlParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#geometricExpression}.
	 * @param ctx the parse tree
	 */
	void enterGeometricExpression(krlParser.GeometricExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#geometricExpression}.
	 * @param ctx the parse tree
	 */
	void exitGeometricExpression(krlParser.GeometricExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#unaryNotExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryNotExpression(krlParser.UnaryNotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#unaryNotExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryNotExpression(krlParser.UnaryNotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#unaryPlusMinuxExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPlusMinuxExpression(krlParser.UnaryPlusMinuxExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#unaryPlusMinuxExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPlusMinuxExpression(krlParser.UnaryPlusMinuxExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(krlParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(krlParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(krlParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(krlParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(krlParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(krlParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(krlParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(krlParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(krlParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(krlParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(krlParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(krlParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(krlParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(krlParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link krlParser#enumElement}.
	 * @param ctx the parse tree
	 */
	void enterEnumElement(krlParser.EnumElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link krlParser#enumElement}.
	 * @param ctx the parse tree
	 */
	void exitEnumElement(krlParser.EnumElementContext ctx);
}