/*
 * generated by Xtext 2.15.0
 */
grammar InternalLisp;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.t2.lisp.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.t2.lisp.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.t2.lisp.services.LispGrammarAccess;

}
@parser::members {
	private LispGrammarAccess grammarAccess;

	public void setGrammarAccess(LispGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getAlternatives()); }
		(rule__Model__Alternatives)
		{ after(grammarAccess.getModelAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDefinition
entryRuleDefinition
:
{ before(grammarAccess.getDefinitionRule()); }
	 ruleDefinition
{ after(grammarAccess.getDefinitionRule()); } 
	 EOF 
;

// Rule Definition
ruleDefinition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDefinitionAccess().getAlternatives()); }
		(rule__Definition__Alternatives)
		{ after(grammarAccess.getDefinitionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBegin
entryRuleBegin
:
{ before(grammarAccess.getBeginRule()); }
	 ruleBegin
{ after(grammarAccess.getBeginRule()); } 
	 EOF 
;

// Rule Begin
ruleBegin 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBeginAccess().getGroup()); }
		(rule__Begin__Group__0)
		{ after(grammarAccess.getBeginAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDefine
entryRuleDefine
:
{ before(grammarAccess.getDefineRule()); }
	 ruleDefine
{ after(grammarAccess.getDefineRule()); } 
	 EOF 
;

// Rule Define
ruleDefine 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDefineAccess().getGroup()); }
		(rule__Define__Group__0)
		{ after(grammarAccess.getDefineAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleList
entryRuleList
:
{ before(grammarAccess.getListRule()); }
	 ruleList
{ after(grammarAccess.getListRule()); } 
	 EOF 
;

// Rule List
ruleList 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getListAccess().getGroup()); }
		(rule__List__Group__0)
		{ after(grammarAccess.getListAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExpression
entryRuleExpression
:
{ before(grammarAccess.getExpressionRule()); }
	 ruleExpression
{ after(grammarAccess.getExpressionRule()); } 
	 EOF 
;

// Rule Expression
ruleExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExpressionAccess().getAlternatives()); }
		(rule__Expression__Alternatives)
		{ after(grammarAccess.getExpressionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNumeros
entryRuleNumeros
:
{ before(grammarAccess.getNumerosRule()); }
	 ruleNumeros
{ after(grammarAccess.getNumerosRule()); } 
	 EOF 
;

// Rule Numeros
ruleNumeros 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNumerosAccess().getAlternatives()); }
		(rule__Numeros__Alternatives)
		{ after(grammarAccess.getNumerosAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOperacoes
entryRuleOperacoes
:
{ before(grammarAccess.getOperacoesRule()); }
	 ruleOperacoes
{ after(grammarAccess.getOperacoesRule()); } 
	 EOF 
;

// Rule Operacoes
ruleOperacoes 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOperacoesAccess().getAlternatives()); }
		(rule__Operacoes__Alternatives)
		{ after(grammarAccess.getOperacoesAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInteiros
entryRuleInteiros
:
{ before(grammarAccess.getInteirosRule()); }
	 ruleInteiros
{ after(grammarAccess.getInteirosRule()); } 
	 EOF 
;

// Rule Inteiros
ruleInteiros 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInteirosAccess().getValueAssignment()); }
		(rule__Inteiros__ValueAssignment)
		{ after(grammarAccess.getInteirosAccess().getValueAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDecimal
entryRuleDecimal
:
{ before(grammarAccess.getDecimalRule()); }
	 ruleDecimal
{ after(grammarAccess.getDecimalRule()); } 
	 EOF 
;

// Rule Decimal
ruleDecimal 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDecimalAccess().getGroup()); }
		(rule__Decimal__Group__0)
		{ after(grammarAccess.getDecimalAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRecursion
entryRuleRecursion
:
{ before(grammarAccess.getRecursionRule()); }
	 ruleRecursion
{ after(grammarAccess.getRecursionRule()); } 
	 EOF 
;

// Rule Recursion
ruleRecursion 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRecursionAccess().getAlternatives()); }
		(rule__Recursion__Alternatives)
		{ after(grammarAccess.getRecursionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getBeginAssignment_0()); }
		(rule__Model__BeginAssignment_0)
		{ after(grammarAccess.getModelAccess().getBeginAssignment_0()); }
	)
	|
	(
		{ before(grammarAccess.getModelAccess().getDefinitionAssignment_1()); }
		(rule__Model__DefinitionAssignment_1)*
		{ after(grammarAccess.getModelAccess().getDefinitionAssignment_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefinitionAccess().getNumerosParserRuleCall_0()); }
		ruleNumeros
		{ after(grammarAccess.getDefinitionAccess().getNumerosParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getDefinitionAccess().getExpressionParserRuleCall_1()); }
		ruleExpression
		{ after(grammarAccess.getDefinitionAccess().getExpressionParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getDefinitionAccess().getDefineParserRuleCall_2()); }
		ruleDefine
		{ after(grammarAccess.getDefinitionAccess().getDefineParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getDefinitionAccess().getListParserRuleCall_3()); }
		ruleList
		{ after(grammarAccess.getDefinitionAccess().getListParserRuleCall_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Define__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefineAccess().getExpressionAssignment_1_0()); }
		(rule__Define__ExpressionAssignment_1_0)
		{ after(grammarAccess.getDefineAccess().getExpressionAssignment_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getDefineAccess().getListAssignment_1_1()); }
		(rule__Define__ListAssignment_1_1)
		{ after(grammarAccess.getDefineAccess().getListAssignment_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpressionAccess().getGroup_0()); }
		(rule__Expression__Group_0__0)
		{ after(grammarAccess.getExpressionAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getExpressionAccess().getGroup_1()); }
		(rule__Expression__Group_1__0)
		{ after(grammarAccess.getExpressionAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Numeros__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNumerosAccess().getInteirosParserRuleCall_0()); }
		ruleInteiros
		{ after(grammarAccess.getNumerosAccess().getInteirosParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getNumerosAccess().getDecimalParserRuleCall_1()); }
		ruleDecimal
		{ after(grammarAccess.getNumerosAccess().getDecimalParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Operacoes__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOperacoesAccess().getValueAssignment_0()); }
		(rule__Operacoes__ValueAssignment_0)
		{ after(grammarAccess.getOperacoesAccess().getValueAssignment_0()); }
	)
	|
	(
		{ before(grammarAccess.getOperacoesAccess().getHyphenMinusKeyword_1()); }
		'-'
		{ after(grammarAccess.getOperacoesAccess().getHyphenMinusKeyword_1()); }
	)
	|
	(
		{ before(grammarAccess.getOperacoesAccess().getAsteriskKeyword_2()); }
		'*'
		{ after(grammarAccess.getOperacoesAccess().getAsteriskKeyword_2()); }
	)
	|
	(
		{ before(grammarAccess.getOperacoesAccess().getSolidusKeyword_3()); }
		'/'
		{ after(grammarAccess.getOperacoesAccess().getSolidusKeyword_3()); }
	)
	|
	(
		{ before(grammarAccess.getOperacoesAccess().getSquareKeyword_4()); }
		'square'
		{ after(grammarAccess.getOperacoesAccess().getSquareKeyword_4()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Recursion__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRecursionAccess().getRecursionIDAssignment_0()); }
		(rule__Recursion__RecursionIDAssignment_0)
		{ after(grammarAccess.getRecursionAccess().getRecursionIDAssignment_0()); }
	)
	|
	(
		{ before(grammarAccess.getRecursionAccess().getRecursionIntAssignment_1()); }
		(rule__Recursion__RecursionIntAssignment_1)
		{ after(grammarAccess.getRecursionAccess().getRecursionIntAssignment_1()); }
	)
	|
	(
		{ before(grammarAccess.getRecursionAccess().getRecursionStringAssignment_2()); }
		(rule__Recursion__RecursionStringAssignment_2)
		{ after(grammarAccess.getRecursionAccess().getRecursionStringAssignment_2()); }
	)
	|
	(
		{ before(grammarAccess.getRecursionAccess().getRecursionExpressionAssignment_3()); }
		(rule__Recursion__RecursionExpressionAssignment_3)
		{ after(grammarAccess.getRecursionAccess().getRecursionExpressionAssignment_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Begin__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Begin__Group__0__Impl
	rule__Begin__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Begin__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBeginAccess().getBeginKeyword_0()); }
	'begin'
	{ after(grammarAccess.getBeginAccess().getBeginKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Begin__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Begin__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Begin__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBeginAccess().getDefinitionAssignment_1()); }
	(rule__Begin__DefinitionAssignment_1)*
	{ after(grammarAccess.getBeginAccess().getDefinitionAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Define__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Define__Group__0__Impl
	rule__Define__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Define__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefineAccess().getDefineKeyword_0()); }
	'define'
	{ after(grammarAccess.getDefineAccess().getDefineKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Define__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Define__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Define__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefineAccess().getAlternatives_1()); }
	(rule__Define__Alternatives_1)
	{ after(grammarAccess.getDefineAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__List__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__List__Group__0__Impl
	rule__List__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__List__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getListAccess().getLeftParenthesisKeyword_0()); }
	'('
	{ after(grammarAccess.getListAccess().getLeftParenthesisKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__List__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__List__Group__1__Impl
	rule__List__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__List__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getListAccess().getListKeyword_1()); }
	'list'
	{ after(grammarAccess.getListAccess().getListKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__List__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__List__Group__2__Impl
	rule__List__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__List__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getListAccess().getNumerosAssignment_2()); }
	(rule__List__NumerosAssignment_2)*
	{ after(grammarAccess.getListAccess().getNumerosAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__List__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__List__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__List__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getListAccess().getRightParenthesisKeyword_3()); }
	')'
	{ after(grammarAccess.getListAccess().getRightParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Expression__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_0__0__Impl
	rule__Expression__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_0_0()); }
	'('
	{ after(grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_0__1__Impl
	rule__Expression__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getOperacoesAssignment_0_1()); }
	(rule__Expression__OperacoesAssignment_0_1)
	{ after(grammarAccess.getExpressionAccess().getOperacoesAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_0__2__Impl
	rule__Expression__Group_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getPrimeiroAssignment_0_2()); }
	(rule__Expression__PrimeiroAssignment_0_2)*
	{ after(grammarAccess.getExpressionAccess().getPrimeiroAssignment_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getRightParenthesisKeyword_0_3()); }
	')'
	{ after(grammarAccess.getExpressionAccess().getRightParenthesisKeyword_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Expression__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_1__0__Impl
	rule__Expression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_1_0()); }
	'('
	{ after(grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getRightParenthesisKeyword_1_1()); }
	')'
	{ after(grammarAccess.getExpressionAccess().getRightParenthesisKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Decimal__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Decimal__Group__0__Impl
	rule__Decimal__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Decimal__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalAccess().getValueAssignment_0()); }
	(rule__Decimal__ValueAssignment_0)
	{ after(grammarAccess.getDecimalAccess().getValueAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Decimal__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Decimal__Group__1__Impl
	rule__Decimal__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Decimal__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalAccess().getFullStopKeyword_1()); }
	'.'
	{ after(grammarAccess.getDecimalAccess().getFullStopKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Decimal__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Decimal__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Decimal__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalAccess().getValueAssignment_2()); }
	(rule__Decimal__ValueAssignment_2)
	{ after(grammarAccess.getDecimalAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__BeginAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getBeginBeginParserRuleCall_0_0()); }
		ruleBegin
		{ after(grammarAccess.getModelAccess().getBeginBeginParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__DefinitionAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getDefinitionDefinitionParserRuleCall_1_0()); }
		ruleDefinition
		{ after(grammarAccess.getModelAccess().getDefinitionDefinitionParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Begin__DefinitionAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBeginAccess().getDefinitionDefinitionParserRuleCall_1_0()); }
		ruleDefinition
		{ after(grammarAccess.getBeginAccess().getDefinitionDefinitionParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Define__ExpressionAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefineAccess().getExpressionExpressionParserRuleCall_1_0_0()); }
		ruleExpression
		{ after(grammarAccess.getDefineAccess().getExpressionExpressionParserRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Define__ListAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefineAccess().getListListParserRuleCall_1_1_0()); }
		ruleList
		{ after(grammarAccess.getDefineAccess().getListListParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__List__NumerosAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getListAccess().getNumerosNumerosParserRuleCall_2_0()); }
		ruleNumeros
		{ after(grammarAccess.getListAccess().getNumerosNumerosParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__OperacoesAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpressionAccess().getOperacoesOperacoesParserRuleCall_0_1_0()); }
		ruleOperacoes
		{ after(grammarAccess.getExpressionAccess().getOperacoesOperacoesParserRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__PrimeiroAssignment_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpressionAccess().getPrimeiroRecursionParserRuleCall_0_2_0()); }
		ruleRecursion
		{ after(grammarAccess.getExpressionAccess().getPrimeiroRecursionParserRuleCall_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Operacoes__ValueAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOperacoesAccess().getValuePlusSignKeyword_0_0()); }
		(
			{ before(grammarAccess.getOperacoesAccess().getValuePlusSignKeyword_0_0()); }
			'+'
			{ after(grammarAccess.getOperacoesAccess().getValuePlusSignKeyword_0_0()); }
		)
		{ after(grammarAccess.getOperacoesAccess().getValuePlusSignKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Inteiros__ValueAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInteirosAccess().getValueINTTerminalRuleCall_0()); }
		RULE_INT
		{ after(grammarAccess.getInteirosAccess().getValueINTTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Decimal__ValueAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDecimalAccess().getValueINTTerminalRuleCall_0_0()); }
		RULE_INT
		{ after(grammarAccess.getDecimalAccess().getValueINTTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Decimal__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDecimalAccess().getValueINTTerminalRuleCall_2_0()); }
		RULE_INT
		{ after(grammarAccess.getDecimalAccess().getValueINTTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Recursion__RecursionIDAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRecursionAccess().getRecursionIDIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getRecursionAccess().getRecursionIDIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Recursion__RecursionIntAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRecursionAccess().getRecursionIntNumerosParserRuleCall_1_0()); }
		ruleNumeros
		{ after(grammarAccess.getRecursionAccess().getRecursionIntNumerosParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Recursion__RecursionStringAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRecursionAccess().getRecursionStringSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getRecursionAccess().getRecursionStringSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Recursion__RecursionExpressionAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRecursionAccess().getRecursionExpressionDefinitionParserRuleCall_3_0()); }
		ruleDefinition
		{ after(grammarAccess.getRecursionAccess().getRecursionExpressionDefinitionParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
