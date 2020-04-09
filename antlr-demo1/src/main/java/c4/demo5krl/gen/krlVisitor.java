// Generated from D:/lib/IDEA_space/mygithub-repository/data-structures/antlr-demo1/src/main/java/c4/demo5krl\krl.g4 by ANTLR 4.7.2
package c4.demo5krl.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link krlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface krlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link krlParser#module}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule(krlParser.ModuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#moduleRoutines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleRoutines(krlParser.ModuleRoutinesContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#mainRoutine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainRoutine(krlParser.MainRoutineContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#subRoutine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubRoutine(krlParser.SubRoutineContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#procedureDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDefinition(krlParser.ProcedureDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#procedureName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureName(krlParser.ProcedureNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(krlParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(krlParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#moduleData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleData(krlParser.ModuleDataContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#moduleName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleName(krlParser.ModuleNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#dataList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataList(krlParser.DataListContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#arrayInitialisation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitialisation(krlParser.ArrayInitialisationContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(krlParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#structureDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructureDefinition(krlParser.StructureDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#enumDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDefinition(krlParser.EnumDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#enumValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumValue(krlParser.EnumValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(krlParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#signalDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignalDeclaration(krlParser.SignalDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#variableDeclarationInDataList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationInDataList(krlParser.VariableDeclarationInDataListContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#variableListRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableListRest(krlParser.VariableListRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#variableInitialisation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitialisation(krlParser.VariableInitialisationContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#structLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructLiteral(krlParser.StructLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#structElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructElementList(krlParser.StructElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#structElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructElement(krlParser.StructElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(krlParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(krlParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#routineBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutineBody(krlParser.RoutineBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#routineDataSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutineDataSection(krlParser.RoutineDataSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#forwardDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForwardDeclaration(krlParser.ForwardDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#formalParametersWithType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParametersWithType(krlParser.FormalParametersWithTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#parameterWithType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterWithType(krlParser.ParameterWithTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#parameterCallType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterCallType(krlParser.ParameterCallTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(krlParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#variableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableName(krlParser.VariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#arrayVariableSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayVariableSuffix(krlParser.ArrayVariableSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#routineImplementationSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutineImplementationSection(krlParser.RoutineImplementationSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(krlParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(krlParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#analogOutputStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalogOutputStatement(krlParser.AnalogOutputStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#analogInputStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalogInputStatement(krlParser.AnalogInputStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#switchBlockStatementGroups}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroups(krlParser.SwitchBlockStatementGroupsContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#caseLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseLabel(krlParser.CaseLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#defaultLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultLabel(krlParser.DefaultLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(krlParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(krlParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(krlParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#relationalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalOp(krlParser.RelationalOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOrExpression(krlParser.ConditionalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(krlParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression(krlParser.ConditionalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(krlParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(krlParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#geometricExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeometricExpression(krlParser.GeometricExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#unaryNotExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryNotExpression(krlParser.UnaryNotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#unaryPlusMinuxExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryPlusMinuxExpression(krlParser.UnaryPlusMinuxExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(krlParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(krlParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(krlParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(krlParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(krlParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(krlParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(krlParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link krlParser#enumElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumElement(krlParser.EnumElementContext ctx);
}