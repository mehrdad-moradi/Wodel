/*
 * generated by Xtext
 */
package org.configureoptions.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.configureoptions.services.ConfigureOptionsGrammarAccess;

public class ConfigureOptionsParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private ConfigureOptionsGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.configureoptions.parser.antlr.internal.InternalConfigureOptionsParser createParser(XtextTokenStream stream) {
		return new org.configureoptions.parser.antlr.internal.InternalConfigureOptionsParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Configuration";
	}
	
	public ConfigureOptionsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ConfigureOptionsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
