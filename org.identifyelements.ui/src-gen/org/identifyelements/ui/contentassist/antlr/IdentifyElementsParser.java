/*
 * generated by Xtext
 */
package org.identifyelements.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.identifyelements.services.IdentifyElementsGrammarAccess;

public class IdentifyElementsParser extends AbstractContentAssistParser {
	
	@Inject
	private IdentifyElementsGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.identifyelements.ui.contentassist.antlr.internal.InternalIdentifyElementsParser createParser() {
		org.identifyelements.ui.contentassist.antlr.internal.InternalIdentifyElementsParser result = new org.identifyelements.ui.contentassist.antlr.internal.InternalIdentifyElementsParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getAttributeAccess().getAlternatives_1(), "rule__Attribute__Alternatives_1");
					put(grammarAccess.getWordAccess().getAlternatives(), "rule__Word__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getIdentifyElementsAccess().getGroup(), "rule__IdentifyElements__Group__0");
					put(grammarAccess.getIdentifyElementsAccess().getGroup_3(), "rule__IdentifyElements__Group_3__0");
					put(grammarAccess.getElementAccess().getGroup(), "rule__Element__Group__0");
					put(grammarAccess.getElementAccess().getGroup_3(), "rule__Element__Group_3__0");
					put(grammarAccess.getElementAccess().getGroup_4(), "rule__Element__Group_4__0");
					put(grammarAccess.getElementAccess().getGroup_6(), "rule__Element__Group_6__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getConstantAccess().getGroup(), "rule__Constant__Group__0");
					put(grammarAccess.getVariableAccess().getGroup(), "rule__Variable__Group__0");
					put(grammarAccess.getVariableAccess().getGroup_2(), "rule__Variable__Group_2__0");
					put(grammarAccess.getIdentifyElementsAccess().getMetamodelAssignment_2(), "rule__IdentifyElements__MetamodelAssignment_2");
					put(grammarAccess.getIdentifyElementsAccess().getElementsAssignment_3_0(), "rule__IdentifyElements__ElementsAssignment_3_0");
					put(grammarAccess.getIdentifyElementsAccess().getElementsAssignment_3_1(), "rule__IdentifyElements__ElementsAssignment_3_1");
					put(grammarAccess.getElementAccess().getTypeAssignment_2(), "rule__Element__TypeAssignment_2");
					put(grammarAccess.getElementAccess().getRefAssignment_3_1(), "rule__Element__RefAssignment_3_1");
					put(grammarAccess.getElementAccess().getAttAssignment_4_1(), "rule__Element__AttAssignment_4_1");
					put(grammarAccess.getElementAccess().getWordsAssignment_6_0(), "rule__Element__WordsAssignment_6_0");
					put(grammarAccess.getElementAccess().getWordsAssignment_6_1(), "rule__Element__WordsAssignment_6_1");
					put(grammarAccess.getAttributeAccess().getNegationAssignment_1_0(), "rule__Attribute__NegationAssignment_1_0");
					put(grammarAccess.getAttributeAccess().getAttAssignment_2(), "rule__Attribute__AttAssignment_2");
					put(grammarAccess.getConstantAccess().getValueAssignment_1(), "rule__Constant__ValueAssignment_1");
					put(grammarAccess.getVariableAccess().getRefAssignment_2_0(), "rule__Variable__RefAssignment_2_0");
					put(grammarAccess.getVariableAccess().getIdAssignment_3(), "rule__Variable__IdAssignment_3");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.identifyelements.ui.contentassist.antlr.internal.InternalIdentifyElementsParser typedParser = (org.identifyelements.ui.contentassist.antlr.internal.InternalIdentifyElementsParser) parser;
			typedParser.entryRuleIdentifyElements();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public IdentifyElementsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(IdentifyElementsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
