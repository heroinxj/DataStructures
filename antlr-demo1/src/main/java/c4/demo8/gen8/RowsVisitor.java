// Generated from D:/lib/IDEA_space/mygithub-repository/data-structures/antlr-c4.demo1/src/main/java/c4.demo8\Rows.g4 by ANTLR 4.7.2
package c4.demo8.gen8;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RowsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RowsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RowsParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(RowsParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link RowsParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(RowsParser.RowContext ctx);
}