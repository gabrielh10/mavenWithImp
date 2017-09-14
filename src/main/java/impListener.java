// Generated from imp.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link impParser}.
 */
public interface impListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link impParser#pgm}.
	 * @param ctx the parse tree
	 */
	void enterPgm(impParser.PgmContext ctx);
	/**
	 * Exit a parse tree produced by {@link impParser#pgm}.
	 * @param ctx the parse tree
	 */
	void exitPgm(impParser.PgmContext ctx);
	/**
	 * Enter a parse tree produced by {@link impParser#modules}.
	 * @param ctx the parse tree
	 */
	void enterModules(impParser.ModulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link impParser#modules}.
	 * @param ctx the parse tree
	 */
	void exitModules(impParser.ModulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link impParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(impParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link impParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(impParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link impParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(impParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link impParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(impParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link impParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterBexpr(impParser.BexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link impParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitBexpr(impParser.BexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link impParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void enterAexpr(impParser.AexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link impParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void exitAexpr(impParser.AexprContext ctx);
}