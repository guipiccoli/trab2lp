/*
 * generated by Xtext 2.15.0
 */
package org.xtext.t2.lisp.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.t2.lisp.services.LispGrammarAccess;

@SuppressWarnings("all")
public class LispSyntacticSequencer extends AbstractSyntacticSequencer {

	protected LispGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Expression_List___LeftParenthesisKeyword_0_ListKeyword_1_RightParenthesisKeyword_3___or___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_1__;
	protected AbstractElementAlias match_Operacoes_AsteriskKeyword_2_or_HyphenMinusKeyword_1_or_SolidusKeyword_3_or_SquareKeyword_4;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (LispGrammarAccess) access;
		match_Expression_List___LeftParenthesisKeyword_0_ListKeyword_1_RightParenthesisKeyword_3___or___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_1__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getExpressionAccess().getRightParenthesisKeyword_1_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getListAccess().getLeftParenthesisKeyword_0()), new TokenAlias(false, false, grammarAccess.getListAccess().getListKeyword_1()), new TokenAlias(false, false, grammarAccess.getListAccess().getRightParenthesisKeyword_3())));
		match_Operacoes_AsteriskKeyword_2_or_HyphenMinusKeyword_1_or_SolidusKeyword_3_or_SquareKeyword_4 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getOperacoesAccess().getAsteriskKeyword_2()), new TokenAlias(false, false, grammarAccess.getOperacoesAccess().getHyphenMinusKeyword_1()), new TokenAlias(false, false, grammarAccess.getOperacoesAccess().getSolidusKeyword_3()), new TokenAlias(false, false, grammarAccess.getOperacoesAccess().getSquareKeyword_4()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Expression_List___LeftParenthesisKeyword_0_ListKeyword_1_RightParenthesisKeyword_3___or___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_1__.equals(syntax))
				emit_Expression_List___LeftParenthesisKeyword_0_ListKeyword_1_RightParenthesisKeyword_3___or___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_1__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Operacoes_AsteriskKeyword_2_or_HyphenMinusKeyword_1_or_SolidusKeyword_3_or_SquareKeyword_4.equals(syntax))
				emit_Operacoes_AsteriskKeyword_2_or_HyphenMinusKeyword_1_or_SolidusKeyword_3_or_SquareKeyword_4(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('(' 'list' ')') | ('(' ')')
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_Expression_List___LeftParenthesisKeyword_0_ListKeyword_1_RightParenthesisKeyword_3___or___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_1__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '-' | '*' | '/' | 'square'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_Operacoes_AsteriskKeyword_2_or_HyphenMinusKeyword_1_or_SolidusKeyword_3_or_SquareKeyword_4(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
