/*
 * generated by Xtext 2.15.0
 */
package org.xtext.t2.lisp.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class LispGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.t2.lisp.Lisp.Model");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cBeginAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cBeginBeginParserRuleCall_0_0 = (RuleCall)cBeginAssignment_0.eContents().get(0);
		private final Assignment cDefinitionAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cDefinitionDefinitionParserRuleCall_1_0 = (RuleCall)cDefinitionAssignment_1.eContents().get(0);
		
		//Model:
		//	begin=Begin | definition=Definition*;
		@Override public ParserRule getRule() { return rule; }
		
		//begin=Begin | definition=Definition*
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//begin=Begin
		public Assignment getBeginAssignment_0() { return cBeginAssignment_0; }
		
		//Begin
		public RuleCall getBeginBeginParserRuleCall_0_0() { return cBeginBeginParserRuleCall_0_0; }
		
		//definition=Definition*
		public Assignment getDefinitionAssignment_1() { return cDefinitionAssignment_1; }
		
		//Definition
		public RuleCall getDefinitionDefinitionParserRuleCall_1_0() { return cDefinitionDefinitionParserRuleCall_1_0; }
	}
	public class DefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.t2.lisp.Lisp.Definition");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cNumerosParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cExpressionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cDefineParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cListParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//Definition:
		//	Numeros | Expression | Define | List;
		@Override public ParserRule getRule() { return rule; }
		
		//Numeros | Expression | Define | List
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Numeros
		public RuleCall getNumerosParserRuleCall_0() { return cNumerosParserRuleCall_0; }
		
		//Expression
		public RuleCall getExpressionParserRuleCall_1() { return cExpressionParserRuleCall_1; }
		
		//Define
		public RuleCall getDefineParserRuleCall_2() { return cDefineParserRuleCall_2; }
		
		//List
		public RuleCall getListParserRuleCall_3() { return cListParserRuleCall_3; }
	}
	public class BeginElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.t2.lisp.Lisp.Begin");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cBeginKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cDefinitionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDefinitionDefinitionParserRuleCall_1_0 = (RuleCall)cDefinitionAssignment_1.eContents().get(0);
		
		//Begin:
		//	'begin' definition=Definition*;
		@Override public ParserRule getRule() { return rule; }
		
		//'begin' definition=Definition*
		public Group getGroup() { return cGroup; }
		
		//'begin'
		public Keyword getBeginKeyword_0() { return cBeginKeyword_0; }
		
		//definition=Definition*
		public Assignment getDefinitionAssignment_1() { return cDefinitionAssignment_1; }
		
		//Definition
		public RuleCall getDefinitionDefinitionParserRuleCall_1_0() { return cDefinitionDefinitionParserRuleCall_1_0; }
	}
	public class DefineElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.t2.lisp.Lisp.Define");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDefineKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cExpressionAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final RuleCall cExpressionExpressionParserRuleCall_1_0_0 = (RuleCall)cExpressionAssignment_1_0.eContents().get(0);
		private final Assignment cListAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final RuleCall cListListParserRuleCall_1_1_0 = (RuleCall)cListAssignment_1_1.eContents().get(0);
		
		//Define:
		//	'define' (expression=Expression | list=List);
		@Override public ParserRule getRule() { return rule; }
		
		//'define' (expression=Expression | list=List)
		public Group getGroup() { return cGroup; }
		
		//'define'
		public Keyword getDefineKeyword_0() { return cDefineKeyword_0; }
		
		//expression=Expression | list=List
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//expression=Expression
		public Assignment getExpressionAssignment_1_0() { return cExpressionAssignment_1_0; }
		
		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_1_0_0() { return cExpressionExpressionParserRuleCall_1_0_0; }
		
		//list=List
		public Assignment getListAssignment_1_1() { return cListAssignment_1_1; }
		
		//List
		public RuleCall getListListParserRuleCall_1_1_0() { return cListListParserRuleCall_1_1_0; }
	}
	public class ListElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.t2.lisp.Lisp.List");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cListKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNumerosAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNumerosNumerosParserRuleCall_2_0 = (RuleCall)cNumerosAssignment_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//List:
		//	'(' 'list' numeros+=Numeros* ')';
		@Override public ParserRule getRule() { return rule; }
		
		//'(' 'list' numeros+=Numeros* ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//'list'
		public Keyword getListKeyword_1() { return cListKeyword_1; }
		
		//numeros+=Numeros*
		public Assignment getNumerosAssignment_2() { return cNumerosAssignment_2; }
		
		//Numeros
		public RuleCall getNumerosNumerosParserRuleCall_2_0() { return cNumerosNumerosParserRuleCall_2_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class ExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.t2.lisp.Lisp.Expression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cOperacoesAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cOperacoesOperacoesParserRuleCall_0_1_0 = (RuleCall)cOperacoesAssignment_0_1.eContents().get(0);
		private final Assignment cPrimeiroAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final RuleCall cPrimeiroRecursionParserRuleCall_0_2_0 = (RuleCall)cPrimeiroAssignment_0_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_0_3 = (Keyword)cGroup_0.eContents().get(3);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		
		//Expression:
		//	'(' operacoes=Operacoes primeiro+=Recursion* ')' |
		//	'(' ')';
		@Override public ParserRule getRule() { return rule; }
		
		//'(' operacoes=Operacoes primeiro+=Recursion* ')' | '(' ')'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'(' operacoes=Operacoes primeiro+=Recursion* ')'
		public Group getGroup_0() { return cGroup_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0_0() { return cLeftParenthesisKeyword_0_0; }
		
		//operacoes=Operacoes
		public Assignment getOperacoesAssignment_0_1() { return cOperacoesAssignment_0_1; }
		
		//Operacoes
		public RuleCall getOperacoesOperacoesParserRuleCall_0_1_0() { return cOperacoesOperacoesParserRuleCall_0_1_0; }
		
		//primeiro+=Recursion*
		public Assignment getPrimeiroAssignment_0_2() { return cPrimeiroAssignment_0_2; }
		
		//Recursion
		public RuleCall getPrimeiroRecursionParserRuleCall_0_2_0() { return cPrimeiroRecursionParserRuleCall_0_2_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_0_3() { return cRightParenthesisKeyword_0_3; }
		
		//'(' ')'
		public Group getGroup_1() { return cGroup_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1_0() { return cLeftParenthesisKeyword_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_1_1() { return cRightParenthesisKeyword_1_1; }
	}
	public class NumerosElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.t2.lisp.Lisp.Numeros");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cInteirosParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cDecimalParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Numeros:
		//	Inteiros | Decimal;
		@Override public ParserRule getRule() { return rule; }
		
		//Inteiros | Decimal
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Inteiros
		public RuleCall getInteirosParserRuleCall_0() { return cInteirosParserRuleCall_0; }
		
		//Decimal
		public RuleCall getDecimalParserRuleCall_1() { return cDecimalParserRuleCall_1; }
	}
	public class OperacoesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.t2.lisp.Lisp.Operacoes");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cValueAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final Keyword cValuePlusSignKeyword_0_0 = (Keyword)cValueAssignment_0.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cAsteriskKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cSolidusKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		private final Keyword cSquareKeyword_4 = (Keyword)cAlternatives.eContents().get(4);
		
		//Operacoes:
		//	value='+' | '-' | '*' | '/' | 'square';
		@Override public ParserRule getRule() { return rule; }
		
		//value='+' | '-' | '*' | '/' | 'square'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//value='+'
		public Assignment getValueAssignment_0() { return cValueAssignment_0; }
		
		//'+'
		public Keyword getValuePlusSignKeyword_0_0() { return cValuePlusSignKeyword_0_0; }
		
		//'-'
		public Keyword getHyphenMinusKeyword_1() { return cHyphenMinusKeyword_1; }
		
		//'*'
		public Keyword getAsteriskKeyword_2() { return cAsteriskKeyword_2; }
		
		//'/'
		public Keyword getSolidusKeyword_3() { return cSolidusKeyword_3; }
		
		//'square'
		public Keyword getSquareKeyword_4() { return cSquareKeyword_4; }
	}
	public class CondicaoElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.t2.lisp.Lisp.Condicao");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cIfKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cCondicaoAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cCondicaoRecursionParserRuleCall_2_0 = (RuleCall)cCondicaoAssignment_2.eContents().get(0);
		private final Assignment cTrueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTrueRecursionParserRuleCall_3_0 = (RuleCall)cTrueAssignment_3.eContents().get(0);
		private final Assignment cFalsoAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFalsoRecursionParserRuleCall_4_0 = (RuleCall)cFalsoAssignment_4.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Condicao:
		//	'(' 'if' condicao=Recursion true=Recursion falso=Recursion ')';
		@Override public ParserRule getRule() { return rule; }
		
		//'(' 'if' condicao=Recursion true=Recursion falso=Recursion ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//'if'
		public Keyword getIfKeyword_1() { return cIfKeyword_1; }
		
		//condicao=Recursion
		public Assignment getCondicaoAssignment_2() { return cCondicaoAssignment_2; }
		
		//Recursion
		public RuleCall getCondicaoRecursionParserRuleCall_2_0() { return cCondicaoRecursionParserRuleCall_2_0; }
		
		//true=Recursion
		public Assignment getTrueAssignment_3() { return cTrueAssignment_3; }
		
		//Recursion
		public RuleCall getTrueRecursionParserRuleCall_3_0() { return cTrueRecursionParserRuleCall_3_0; }
		
		//falso=Recursion
		public Assignment getFalsoAssignment_4() { return cFalsoAssignment_4; }
		
		//Recursion
		public RuleCall getFalsoRecursionParserRuleCall_4_0() { return cFalsoRecursionParserRuleCall_4_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }
	}
	public class InteirosElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.t2.lisp.Lisp.Inteiros");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//Inteiros:
		//	value=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//value=INT
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_0() { return cValueINTTerminalRuleCall_0; }
	}
	public class DecimalElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.t2.lisp.Lisp.Decimal");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cValueAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cValueINTTerminalRuleCall_0_0 = (RuleCall)cValueAssignment_0.eContents().get(0);
		private final Keyword cFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueINTTerminalRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//Decimal:
		//	value=INT '.' value=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//value=INT '.' value=INT
		public Group getGroup() { return cGroup; }
		
		//value=INT
		public Assignment getValueAssignment_0() { return cValueAssignment_0; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_0_0() { return cValueINTTerminalRuleCall_0_0; }
		
		//'.'
		public Keyword getFullStopKeyword_1() { return cFullStopKeyword_1; }
		
		//value=INT
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_2_0() { return cValueINTTerminalRuleCall_2_0; }
	}
	public class RecursionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.t2.lisp.Lisp.Recursion");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cRecursionIDAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cRecursionIDIDTerminalRuleCall_0_0 = (RuleCall)cRecursionIDAssignment_0.eContents().get(0);
		private final Assignment cRecursionIntAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cRecursionIntNumerosParserRuleCall_1_0 = (RuleCall)cRecursionIntAssignment_1.eContents().get(0);
		private final Assignment cRecursionStringAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final RuleCall cRecursionStringSTRINGTerminalRuleCall_2_0 = (RuleCall)cRecursionStringAssignment_2.eContents().get(0);
		private final Assignment cRecursionDefinitionAssignment_3 = (Assignment)cAlternatives.eContents().get(3);
		private final RuleCall cRecursionDefinitionDefinitionParserRuleCall_3_0 = (RuleCall)cRecursionDefinitionAssignment_3.eContents().get(0);
		
		//Recursion:
		//	recursionID=ID | recursionInt=Numeros | recursionString=STRING | recursionDefinition=Definition;
		@Override public ParserRule getRule() { return rule; }
		
		//recursionID=ID | recursionInt=Numeros | recursionString=STRING | recursionDefinition=Definition
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//recursionID=ID
		public Assignment getRecursionIDAssignment_0() { return cRecursionIDAssignment_0; }
		
		//ID
		public RuleCall getRecursionIDIDTerminalRuleCall_0_0() { return cRecursionIDIDTerminalRuleCall_0_0; }
		
		//recursionInt=Numeros
		public Assignment getRecursionIntAssignment_1() { return cRecursionIntAssignment_1; }
		
		//Numeros
		public RuleCall getRecursionIntNumerosParserRuleCall_1_0() { return cRecursionIntNumerosParserRuleCall_1_0; }
		
		//recursionString=STRING
		public Assignment getRecursionStringAssignment_2() { return cRecursionStringAssignment_2; }
		
		//STRING
		public RuleCall getRecursionStringSTRINGTerminalRuleCall_2_0() { return cRecursionStringSTRINGTerminalRuleCall_2_0; }
		
		//recursionDefinition=Definition
		public Assignment getRecursionDefinitionAssignment_3() { return cRecursionDefinitionAssignment_3; }
		
		//Definition
		public RuleCall getRecursionDefinitionDefinitionParserRuleCall_3_0() { return cRecursionDefinitionDefinitionParserRuleCall_3_0; }
	}
	
	
	private final ModelElements pModel;
	private final DefinitionElements pDefinition;
	private final BeginElements pBegin;
	private final DefineElements pDefine;
	private final ListElements pList;
	private final ExpressionElements pExpression;
	private final NumerosElements pNumeros;
	private final OperacoesElements pOperacoes;
	private final CondicaoElements pCondicao;
	private final InteirosElements pInteiros;
	private final DecimalElements pDecimal;
	private final RecursionElements pRecursion;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public LispGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pDefinition = new DefinitionElements();
		this.pBegin = new BeginElements();
		this.pDefine = new DefineElements();
		this.pList = new ListElements();
		this.pExpression = new ExpressionElements();
		this.pNumeros = new NumerosElements();
		this.pOperacoes = new OperacoesElements();
		this.pCondicao = new CondicaoElements();
		this.pInteiros = new InteirosElements();
		this.pDecimal = new DecimalElements();
		this.pRecursion = new RecursionElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.t2.lisp.Lisp".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	begin=Begin | definition=Definition*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Definition:
	//	Numeros | Expression | Define | List;
	public DefinitionElements getDefinitionAccess() {
		return pDefinition;
	}
	
	public ParserRule getDefinitionRule() {
		return getDefinitionAccess().getRule();
	}
	
	//Begin:
	//	'begin' definition=Definition*;
	public BeginElements getBeginAccess() {
		return pBegin;
	}
	
	public ParserRule getBeginRule() {
		return getBeginAccess().getRule();
	}
	
	//Define:
	//	'define' (expression=Expression | list=List);
	public DefineElements getDefineAccess() {
		return pDefine;
	}
	
	public ParserRule getDefineRule() {
		return getDefineAccess().getRule();
	}
	
	//List:
	//	'(' 'list' numeros+=Numeros* ')';
	public ListElements getListAccess() {
		return pList;
	}
	
	public ParserRule getListRule() {
		return getListAccess().getRule();
	}
	
	//Expression:
	//	'(' operacoes=Operacoes primeiro+=Recursion* ')' |
	//	'(' ')';
	public ExpressionElements getExpressionAccess() {
		return pExpression;
	}
	
	public ParserRule getExpressionRule() {
		return getExpressionAccess().getRule();
	}
	
	//Numeros:
	//	Inteiros | Decimal;
	public NumerosElements getNumerosAccess() {
		return pNumeros;
	}
	
	public ParserRule getNumerosRule() {
		return getNumerosAccess().getRule();
	}
	
	//Operacoes:
	//	value='+' | '-' | '*' | '/' | 'square';
	public OperacoesElements getOperacoesAccess() {
		return pOperacoes;
	}
	
	public ParserRule getOperacoesRule() {
		return getOperacoesAccess().getRule();
	}
	
	//Condicao:
	//	'(' 'if' condicao=Recursion true=Recursion falso=Recursion ')';
	public CondicaoElements getCondicaoAccess() {
		return pCondicao;
	}
	
	public ParserRule getCondicaoRule() {
		return getCondicaoAccess().getRule();
	}
	
	//Inteiros:
	//	value=INT;
	public InteirosElements getInteirosAccess() {
		return pInteiros;
	}
	
	public ParserRule getInteirosRule() {
		return getInteirosAccess().getRule();
	}
	
	//Decimal:
	//	value=INT '.' value=INT;
	public DecimalElements getDecimalAccess() {
		return pDecimal;
	}
	
	public ParserRule getDecimalRule() {
		return getDecimalAccess().getRule();
	}
	
	//Recursion:
	//	recursionID=ID | recursionInt=Numeros | recursionString=STRING | recursionDefinition=Definition;
	public RecursionElements getRecursionAccess() {
		return pRecursion;
	}
	
	public ParserRule getRecursionRule() {
		return getRecursionAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
