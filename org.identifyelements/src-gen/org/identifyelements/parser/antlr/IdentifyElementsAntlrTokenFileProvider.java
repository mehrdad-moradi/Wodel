/*
 * generated by Xtext
 */
package org.identifyelements.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class IdentifyElementsAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/identifyelements/parser/antlr/internal/InternalIdentifyElements.tokens");
	}
}
