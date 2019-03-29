/*
 * generated by Xtext 2.15.0
 */
package org.xtext.t2.lisp.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.t2.lisp.ide.contentassist.antlr.internal.InternalLispParser;
import org.xtext.t2.lisp.services.LispGrammarAccess;

public class LispParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(LispGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, LispGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getModelAccess().getAlternatives(), "rule__Model__Alternatives");
			builder.put(grammarAccess.getOperacoesAccess().getAlternatives(), "rule__Operacoes__Alternatives");
			builder.put(grammarAccess.getBeginAccess().getGroup(), "rule__Begin__Group__0");
			builder.put(grammarAccess.getDefineAccess().getGroup(), "rule__Define__Group__0");
			builder.put(grammarAccess.getExpressionAccess().getGroup(), "rule__Expression__Group__0");
			builder.put(grammarAccess.getDecimalAccess().getGroup(), "rule__Decimal__Group__0");
			builder.put(grammarAccess.getModelAccess().getDecimalAssignment_0(), "rule__Model__DecimalAssignment_0");
			builder.put(grammarAccess.getModelAccess().getInteirosAssignment_1(), "rule__Model__InteirosAssignment_1");
			builder.put(grammarAccess.getModelAccess().getBeginAssignment_2(), "rule__Model__BeginAssignment_2");
			builder.put(grammarAccess.getModelAccess().getDefineAssignment_3(), "rule__Model__DefineAssignment_3");
			builder.put(grammarAccess.getBeginAccess().getNameAssignment_1(), "rule__Begin__NameAssignment_1");
			builder.put(grammarAccess.getDefineAccess().getNameAssignment_1(), "rule__Define__NameAssignment_1");
			builder.put(grammarAccess.getDefineAccess().getExpressionAssignment_3(), "rule__Define__ExpressionAssignment_3");
			builder.put(grammarAccess.getExpressionAccess().getOperacoesAssignment_1(), "rule__Expression__OperacoesAssignment_1");
			builder.put(grammarAccess.getExpressionAccess().getInteirosAssignment_3(), "rule__Expression__InteirosAssignment_3");
			builder.put(grammarAccess.getExpressionAccess().getInteirosAssignment_5(), "rule__Expression__InteirosAssignment_5");
			builder.put(grammarAccess.getInteirosAccess().getValueAssignment(), "rule__Inteiros__ValueAssignment");
			builder.put(grammarAccess.getDecimalAccess().getValueAssignment_0(), "rule__Decimal__ValueAssignment_0");
			builder.put(grammarAccess.getDecimalAccess().getValueAssignment_2(), "rule__Decimal__ValueAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private LispGrammarAccess grammarAccess;

	@Override
	protected InternalLispParser createParser() {
		InternalLispParser result = new InternalLispParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public LispGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(LispGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
