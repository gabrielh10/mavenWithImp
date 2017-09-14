package mavenWithImp;
// Generated from imp.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link impParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface impVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link impParser#pgm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPgm(impParser.PgmContext ctx);
	/**
	 * Visit a parse tree produced by {@link impParser#modules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModules(impParser.ModulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link impParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(impParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link impParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(impParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link impParser#bexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBexpr(impParser.BexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link impParser#aexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexpr(impParser.AexprContext ctx);
}