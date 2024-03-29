/*
 * generated by Xtext 2.19.0
 */
package org.xtext.projet_idm.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.projet_idm.mydsl.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.projet_idm.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MyDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MyDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getALGOAccess().getAlternatives(), "rule__ALGO__Alternatives");
			builder.put(grammarAccess.getSTRATAccess().getAlternatives(), "rule__STRAT__Alternatives");
			builder.put(grammarAccess.getOperationAccess().getGroup(), "rule__Operation__Group__0");
			builder.put(grammarAccess.getCSVFileAccess().getGroup(), "rule__CSVFile__Group__0");
			builder.put(grammarAccess.getSplitSetAccess().getGroup(), "rule__SplitSet__Group__0");
			builder.put(grammarAccess.getPredictAccess().getGroup(), "rule__Predict__Group__0");
			builder.put(grammarAccess.getMachineLearingGeneratorAccess().getOperationsAssignment(), "rule__MachineLearingGenerator__OperationsAssignment");
			builder.put(grammarAccess.getOperationAccess().getL2Assignment_1(), "rule__Operation__L2Assignment_1");
			builder.put(grammarAccess.getOperationAccess().getL3Assignment_2(), "rule__Operation__L3Assignment_2");
			builder.put(grammarAccess.getOperationAccess().getL4Assignment_3(), "rule__Operation__L4Assignment_3");
			builder.put(grammarAccess.getCSVFileAccess().getFileAssignment_1(), "rule__CSVFile__FileAssignment_1");
			builder.put(grammarAccess.getSplitSetAccess().getVarAssignment_1(), "rule__SplitSet__VarAssignment_1");
			builder.put(grammarAccess.getSplitSetAccess().getSizeAssignment_2(), "rule__SplitSet__SizeAssignment_2");
			builder.put(grammarAccess.getSplitSetAccess().getStratAssignment_3(), "rule__SplitSet__StratAssignment_3");
			builder.put(grammarAccess.getPredictAccess().getAlgoAssignment_1(), "rule__Predict__AlgoAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MyDslGrammarAccess grammarAccess;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
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

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
