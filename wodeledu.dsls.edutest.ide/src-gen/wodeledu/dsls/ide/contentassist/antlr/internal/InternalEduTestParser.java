package wodeledu.dsls.ide.contentassist.antlr.internal;

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
import wodeledu.dsls.services.EduTestGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEduTestParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'yes'", "'no'", "'E'", "'e'", "'fixed'", "'random'", "'options-ascending'", "'options-descending'", "'radiobutton'", "'checkbox'", "'free'", "'locked'", "'AlternativeResponse'", "'{'", "'}'", "','", "'MultiChoiceDiagram'", "'MultiChoiceEmendation'", "'MatchPairs'", "'navigation'", "'='", "'retry'", "'weighted'", "'penalty'", "'order'", "'mode'", "'description'", "'for'", "'-'", "'.'", "'%text'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalEduTestParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEduTestParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEduTestParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEduTest.g"; }


    	private EduTestGrammarAccess grammarAccess;

    	public void setGrammarAccess(EduTestGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProgram"
    // InternalEduTest.g:53:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalEduTest.g:54:1: ( ruleProgram EOF )
            // InternalEduTest.g:55:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalEduTest.g:62:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:66:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalEduTest.g:67:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalEduTest.g:67:2: ( ( rule__Program__Group__0 ) )
            // InternalEduTest.g:68:3: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // InternalEduTest.g:69:3: ( rule__Program__Group__0 )
            // InternalEduTest.g:69:4: rule__Program__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleMutatorTests"
    // InternalEduTest.g:78:1: entryRuleMutatorTests : ruleMutatorTests EOF ;
    public final void entryRuleMutatorTests() throws RecognitionException {
        try {
            // InternalEduTest.g:79:1: ( ruleMutatorTests EOF )
            // InternalEduTest.g:80:1: ruleMutatorTests EOF
            {
             before(grammarAccess.getMutatorTestsRule()); 
            pushFollow(FOLLOW_1);
            ruleMutatorTests();

            state._fsp--;

             after(grammarAccess.getMutatorTestsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMutatorTests"


    // $ANTLR start "ruleMutatorTests"
    // InternalEduTest.g:87:1: ruleMutatorTests : ( ( rule__MutatorTests__Alternatives ) ) ;
    public final void ruleMutatorTests() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:91:2: ( ( ( rule__MutatorTests__Alternatives ) ) )
            // InternalEduTest.g:92:2: ( ( rule__MutatorTests__Alternatives ) )
            {
            // InternalEduTest.g:92:2: ( ( rule__MutatorTests__Alternatives ) )
            // InternalEduTest.g:93:3: ( rule__MutatorTests__Alternatives )
            {
             before(grammarAccess.getMutatorTestsAccess().getAlternatives()); 
            // InternalEduTest.g:94:3: ( rule__MutatorTests__Alternatives )
            // InternalEduTest.g:94:4: rule__MutatorTests__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MutatorTests__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMutatorTestsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMutatorTests"


    // $ANTLR start "entryRuleAlternativeResponse"
    // InternalEduTest.g:103:1: entryRuleAlternativeResponse : ruleAlternativeResponse EOF ;
    public final void entryRuleAlternativeResponse() throws RecognitionException {
        try {
            // InternalEduTest.g:104:1: ( ruleAlternativeResponse EOF )
            // InternalEduTest.g:105:1: ruleAlternativeResponse EOF
            {
             before(grammarAccess.getAlternativeResponseRule()); 
            pushFollow(FOLLOW_1);
            ruleAlternativeResponse();

            state._fsp--;

             after(grammarAccess.getAlternativeResponseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAlternativeResponse"


    // $ANTLR start "ruleAlternativeResponse"
    // InternalEduTest.g:112:1: ruleAlternativeResponse : ( ( rule__AlternativeResponse__Group__0 ) ) ;
    public final void ruleAlternativeResponse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:116:2: ( ( ( rule__AlternativeResponse__Group__0 ) ) )
            // InternalEduTest.g:117:2: ( ( rule__AlternativeResponse__Group__0 ) )
            {
            // InternalEduTest.g:117:2: ( ( rule__AlternativeResponse__Group__0 ) )
            // InternalEduTest.g:118:3: ( rule__AlternativeResponse__Group__0 )
            {
             before(grammarAccess.getAlternativeResponseAccess().getGroup()); 
            // InternalEduTest.g:119:3: ( rule__AlternativeResponse__Group__0 )
            // InternalEduTest.g:119:4: rule__AlternativeResponse__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AlternativeResponse__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlternativeResponseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlternativeResponse"


    // $ANTLR start "entryRuleMultiChoiceDiagram"
    // InternalEduTest.g:128:1: entryRuleMultiChoiceDiagram : ruleMultiChoiceDiagram EOF ;
    public final void entryRuleMultiChoiceDiagram() throws RecognitionException {
        try {
            // InternalEduTest.g:129:1: ( ruleMultiChoiceDiagram EOF )
            // InternalEduTest.g:130:1: ruleMultiChoiceDiagram EOF
            {
             before(grammarAccess.getMultiChoiceDiagramRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiChoiceDiagram();

            state._fsp--;

             after(grammarAccess.getMultiChoiceDiagramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiChoiceDiagram"


    // $ANTLR start "ruleMultiChoiceDiagram"
    // InternalEduTest.g:137:1: ruleMultiChoiceDiagram : ( ( rule__MultiChoiceDiagram__Group__0 ) ) ;
    public final void ruleMultiChoiceDiagram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:141:2: ( ( ( rule__MultiChoiceDiagram__Group__0 ) ) )
            // InternalEduTest.g:142:2: ( ( rule__MultiChoiceDiagram__Group__0 ) )
            {
            // InternalEduTest.g:142:2: ( ( rule__MultiChoiceDiagram__Group__0 ) )
            // InternalEduTest.g:143:3: ( rule__MultiChoiceDiagram__Group__0 )
            {
             before(grammarAccess.getMultiChoiceDiagramAccess().getGroup()); 
            // InternalEduTest.g:144:3: ( rule__MultiChoiceDiagram__Group__0 )
            // InternalEduTest.g:144:4: rule__MultiChoiceDiagram__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiChoiceDiagram__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiChoiceDiagramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiChoiceDiagram"


    // $ANTLR start "entryRuleMultiChoiceEmendation"
    // InternalEduTest.g:153:1: entryRuleMultiChoiceEmendation : ruleMultiChoiceEmendation EOF ;
    public final void entryRuleMultiChoiceEmendation() throws RecognitionException {
        try {
            // InternalEduTest.g:154:1: ( ruleMultiChoiceEmendation EOF )
            // InternalEduTest.g:155:1: ruleMultiChoiceEmendation EOF
            {
             before(grammarAccess.getMultiChoiceEmendationRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiChoiceEmendation();

            state._fsp--;

             after(grammarAccess.getMultiChoiceEmendationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiChoiceEmendation"


    // $ANTLR start "ruleMultiChoiceEmendation"
    // InternalEduTest.g:162:1: ruleMultiChoiceEmendation : ( ( rule__MultiChoiceEmendation__Group__0 ) ) ;
    public final void ruleMultiChoiceEmendation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:166:2: ( ( ( rule__MultiChoiceEmendation__Group__0 ) ) )
            // InternalEduTest.g:167:2: ( ( rule__MultiChoiceEmendation__Group__0 ) )
            {
            // InternalEduTest.g:167:2: ( ( rule__MultiChoiceEmendation__Group__0 ) )
            // InternalEduTest.g:168:3: ( rule__MultiChoiceEmendation__Group__0 )
            {
             before(grammarAccess.getMultiChoiceEmendationAccess().getGroup()); 
            // InternalEduTest.g:169:3: ( rule__MultiChoiceEmendation__Group__0 )
            // InternalEduTest.g:169:4: rule__MultiChoiceEmendation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiChoiceEmendation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiChoiceEmendationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiChoiceEmendation"


    // $ANTLR start "entryRuleMatchPairs"
    // InternalEduTest.g:178:1: entryRuleMatchPairs : ruleMatchPairs EOF ;
    public final void entryRuleMatchPairs() throws RecognitionException {
        try {
            // InternalEduTest.g:179:1: ( ruleMatchPairs EOF )
            // InternalEduTest.g:180:1: ruleMatchPairs EOF
            {
             before(grammarAccess.getMatchPairsRule()); 
            pushFollow(FOLLOW_1);
            ruleMatchPairs();

            state._fsp--;

             after(grammarAccess.getMatchPairsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMatchPairs"


    // $ANTLR start "ruleMatchPairs"
    // InternalEduTest.g:187:1: ruleMatchPairs : ( ( rule__MatchPairs__Group__0 ) ) ;
    public final void ruleMatchPairs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:191:2: ( ( ( rule__MatchPairs__Group__0 ) ) )
            // InternalEduTest.g:192:2: ( ( rule__MatchPairs__Group__0 ) )
            {
            // InternalEduTest.g:192:2: ( ( rule__MatchPairs__Group__0 ) )
            // InternalEduTest.g:193:3: ( rule__MatchPairs__Group__0 )
            {
             before(grammarAccess.getMatchPairsAccess().getGroup()); 
            // InternalEduTest.g:194:3: ( rule__MatchPairs__Group__0 )
            // InternalEduTest.g:194:4: rule__MatchPairs__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MatchPairs__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMatchPairsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMatchPairs"


    // $ANTLR start "entryRuleProgramConfiguration"
    // InternalEduTest.g:203:1: entryRuleProgramConfiguration : ruleProgramConfiguration EOF ;
    public final void entryRuleProgramConfiguration() throws RecognitionException {
        try {
            // InternalEduTest.g:204:1: ( ruleProgramConfiguration EOF )
            // InternalEduTest.g:205:1: ruleProgramConfiguration EOF
            {
             before(grammarAccess.getProgramConfigurationRule()); 
            pushFollow(FOLLOW_1);
            ruleProgramConfiguration();

            state._fsp--;

             after(grammarAccess.getProgramConfigurationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgramConfiguration"


    // $ANTLR start "ruleProgramConfiguration"
    // InternalEduTest.g:212:1: ruleProgramConfiguration : ( ( rule__ProgramConfiguration__Group__0 ) ) ;
    public final void ruleProgramConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:216:2: ( ( ( rule__ProgramConfiguration__Group__0 ) ) )
            // InternalEduTest.g:217:2: ( ( rule__ProgramConfiguration__Group__0 ) )
            {
            // InternalEduTest.g:217:2: ( ( rule__ProgramConfiguration__Group__0 ) )
            // InternalEduTest.g:218:3: ( rule__ProgramConfiguration__Group__0 )
            {
             before(grammarAccess.getProgramConfigurationAccess().getGroup()); 
            // InternalEduTest.g:219:3: ( rule__ProgramConfiguration__Group__0 )
            // InternalEduTest.g:219:4: rule__ProgramConfiguration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProgramConfiguration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramConfigurationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgramConfiguration"


    // $ANTLR start "entryRuleTestConfiguration"
    // InternalEduTest.g:228:1: entryRuleTestConfiguration : ruleTestConfiguration EOF ;
    public final void entryRuleTestConfiguration() throws RecognitionException {
        try {
            // InternalEduTest.g:229:1: ( ruleTestConfiguration EOF )
            // InternalEduTest.g:230:1: ruleTestConfiguration EOF
            {
             before(grammarAccess.getTestConfigurationRule()); 
            pushFollow(FOLLOW_1);
            ruleTestConfiguration();

            state._fsp--;

             after(grammarAccess.getTestConfigurationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTestConfiguration"


    // $ANTLR start "ruleTestConfiguration"
    // InternalEduTest.g:237:1: ruleTestConfiguration : ( ( rule__TestConfiguration__Group__0 ) ) ;
    public final void ruleTestConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:241:2: ( ( ( rule__TestConfiguration__Group__0 ) ) )
            // InternalEduTest.g:242:2: ( ( rule__TestConfiguration__Group__0 ) )
            {
            // InternalEduTest.g:242:2: ( ( rule__TestConfiguration__Group__0 ) )
            // InternalEduTest.g:243:3: ( rule__TestConfiguration__Group__0 )
            {
             before(grammarAccess.getTestConfigurationAccess().getGroup()); 
            // InternalEduTest.g:244:3: ( rule__TestConfiguration__Group__0 )
            // InternalEduTest.g:244:4: rule__TestConfiguration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TestConfiguration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTestConfigurationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTestConfiguration"


    // $ANTLR start "entryRuleMultiChoiceEmConfig"
    // InternalEduTest.g:253:1: entryRuleMultiChoiceEmConfig : ruleMultiChoiceEmConfig EOF ;
    public final void entryRuleMultiChoiceEmConfig() throws RecognitionException {
        try {
            // InternalEduTest.g:254:1: ( ruleMultiChoiceEmConfig EOF )
            // InternalEduTest.g:255:1: ruleMultiChoiceEmConfig EOF
            {
             before(grammarAccess.getMultiChoiceEmConfigRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiChoiceEmConfig();

            state._fsp--;

             after(grammarAccess.getMultiChoiceEmConfigRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiChoiceEmConfig"


    // $ANTLR start "ruleMultiChoiceEmConfig"
    // InternalEduTest.g:262:1: ruleMultiChoiceEmConfig : ( ( rule__MultiChoiceEmConfig__Group__0 ) ) ;
    public final void ruleMultiChoiceEmConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:266:2: ( ( ( rule__MultiChoiceEmConfig__Group__0 ) ) )
            // InternalEduTest.g:267:2: ( ( rule__MultiChoiceEmConfig__Group__0 ) )
            {
            // InternalEduTest.g:267:2: ( ( rule__MultiChoiceEmConfig__Group__0 ) )
            // InternalEduTest.g:268:3: ( rule__MultiChoiceEmConfig__Group__0 )
            {
             before(grammarAccess.getMultiChoiceEmConfigAccess().getGroup()); 
            // InternalEduTest.g:269:3: ( rule__MultiChoiceEmConfig__Group__0 )
            // InternalEduTest.g:269:4: rule__MultiChoiceEmConfig__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiChoiceEmConfig__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiChoiceEmConfigAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiChoiceEmConfig"


    // $ANTLR start "entryRuleTest"
    // InternalEduTest.g:278:1: entryRuleTest : ruleTest EOF ;
    public final void entryRuleTest() throws RecognitionException {
        try {
            // InternalEduTest.g:279:1: ( ruleTest EOF )
            // InternalEduTest.g:280:1: ruleTest EOF
            {
             before(grammarAccess.getTestRule()); 
            pushFollow(FOLLOW_1);
            ruleTest();

            state._fsp--;

             after(grammarAccess.getTestRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTest"


    // $ANTLR start "ruleTest"
    // InternalEduTest.g:287:1: ruleTest : ( ( rule__Test__Group__0 ) ) ;
    public final void ruleTest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:291:2: ( ( ( rule__Test__Group__0 ) ) )
            // InternalEduTest.g:292:2: ( ( rule__Test__Group__0 ) )
            {
            // InternalEduTest.g:292:2: ( ( rule__Test__Group__0 ) )
            // InternalEduTest.g:293:3: ( rule__Test__Group__0 )
            {
             before(grammarAccess.getTestAccess().getGroup()); 
            // InternalEduTest.g:294:3: ( rule__Test__Group__0 )
            // InternalEduTest.g:294:4: rule__Test__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTest"


    // $ANTLR start "entryRuleEString"
    // InternalEduTest.g:303:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalEduTest.g:304:1: ( ruleEString EOF )
            // InternalEduTest.g:305:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalEduTest.g:312:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:316:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalEduTest.g:317:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalEduTest.g:317:2: ( ( rule__EString__Alternatives ) )
            // InternalEduTest.g:318:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalEduTest.g:319:3: ( rule__EString__Alternatives )
            // InternalEduTest.g:319:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEDouble"
    // InternalEduTest.g:328:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalEduTest.g:329:1: ( ruleEDouble EOF )
            // InternalEduTest.g:330:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalEduTest.g:337:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:341:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalEduTest.g:342:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalEduTest.g:342:2: ( ( rule__EDouble__Group__0 ) )
            // InternalEduTest.g:343:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalEduTest.g:344:3: ( rule__EDouble__Group__0 )
            // InternalEduTest.g:344:4: rule__EDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "ruleOrder"
    // InternalEduTest.g:353:1: ruleOrder : ( ( rule__Order__Alternatives ) ) ;
    public final void ruleOrder() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:357:1: ( ( ( rule__Order__Alternatives ) ) )
            // InternalEduTest.g:358:2: ( ( rule__Order__Alternatives ) )
            {
            // InternalEduTest.g:358:2: ( ( rule__Order__Alternatives ) )
            // InternalEduTest.g:359:3: ( rule__Order__Alternatives )
            {
             before(grammarAccess.getOrderAccess().getAlternatives()); 
            // InternalEduTest.g:360:3: ( rule__Order__Alternatives )
            // InternalEduTest.g:360:4: rule__Order__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Order__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOrderAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrder"


    // $ANTLR start "ruleMode"
    // InternalEduTest.g:369:1: ruleMode : ( ( rule__Mode__Alternatives ) ) ;
    public final void ruleMode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:373:1: ( ( ( rule__Mode__Alternatives ) ) )
            // InternalEduTest.g:374:2: ( ( rule__Mode__Alternatives ) )
            {
            // InternalEduTest.g:374:2: ( ( rule__Mode__Alternatives ) )
            // InternalEduTest.g:375:3: ( rule__Mode__Alternatives )
            {
             before(grammarAccess.getModeAccess().getAlternatives()); 
            // InternalEduTest.g:376:3: ( rule__Mode__Alternatives )
            // InternalEduTest.g:376:4: rule__Mode__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Mode__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMode"


    // $ANTLR start "ruleNavigation"
    // InternalEduTest.g:385:1: ruleNavigation : ( ( rule__Navigation__Alternatives ) ) ;
    public final void ruleNavigation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:389:1: ( ( ( rule__Navigation__Alternatives ) ) )
            // InternalEduTest.g:390:2: ( ( rule__Navigation__Alternatives ) )
            {
            // InternalEduTest.g:390:2: ( ( rule__Navigation__Alternatives ) )
            // InternalEduTest.g:391:3: ( rule__Navigation__Alternatives )
            {
             before(grammarAccess.getNavigationAccess().getAlternatives()); 
            // InternalEduTest.g:392:3: ( rule__Navigation__Alternatives )
            // InternalEduTest.g:392:4: rule__Navigation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Navigation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNavigationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNavigation"


    // $ANTLR start "rule__MutatorTests__Alternatives"
    // InternalEduTest.g:400:1: rule__MutatorTests__Alternatives : ( ( ruleAlternativeResponse ) | ( ruleMultiChoiceDiagram ) | ( ruleMultiChoiceEmendation ) | ( ruleMatchPairs ) );
    public final void rule__MutatorTests__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:404:1: ( ( ruleAlternativeResponse ) | ( ruleMultiChoiceDiagram ) | ( ruleMultiChoiceEmendation ) | ( ruleMatchPairs ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt1=1;
                }
                break;
            case 27:
                {
                alt1=2;
                }
                break;
            case 28:
                {
                alt1=3;
                }
                break;
            case 29:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalEduTest.g:405:2: ( ruleAlternativeResponse )
                    {
                    // InternalEduTest.g:405:2: ( ruleAlternativeResponse )
                    // InternalEduTest.g:406:3: ruleAlternativeResponse
                    {
                     before(grammarAccess.getMutatorTestsAccess().getAlternativeResponseParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAlternativeResponse();

                    state._fsp--;

                     after(grammarAccess.getMutatorTestsAccess().getAlternativeResponseParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEduTest.g:411:2: ( ruleMultiChoiceDiagram )
                    {
                    // InternalEduTest.g:411:2: ( ruleMultiChoiceDiagram )
                    // InternalEduTest.g:412:3: ruleMultiChoiceDiagram
                    {
                     before(grammarAccess.getMutatorTestsAccess().getMultiChoiceDiagramParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMultiChoiceDiagram();

                    state._fsp--;

                     after(grammarAccess.getMutatorTestsAccess().getMultiChoiceDiagramParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEduTest.g:417:2: ( ruleMultiChoiceEmendation )
                    {
                    // InternalEduTest.g:417:2: ( ruleMultiChoiceEmendation )
                    // InternalEduTest.g:418:3: ruleMultiChoiceEmendation
                    {
                     before(grammarAccess.getMutatorTestsAccess().getMultiChoiceEmendationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMultiChoiceEmendation();

                    state._fsp--;

                     after(grammarAccess.getMutatorTestsAccess().getMultiChoiceEmendationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalEduTest.g:423:2: ( ruleMatchPairs )
                    {
                    // InternalEduTest.g:423:2: ( ruleMatchPairs )
                    // InternalEduTest.g:424:3: ruleMatchPairs
                    {
                     before(grammarAccess.getMutatorTestsAccess().getMatchPairsParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleMatchPairs();

                    state._fsp--;

                     after(grammarAccess.getMutatorTestsAccess().getMatchPairsParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MutatorTests__Alternatives"


    // $ANTLR start "rule__TestConfiguration__RetryAlternatives_3_0"
    // InternalEduTest.g:433:1: rule__TestConfiguration__RetryAlternatives_3_0 : ( ( 'yes' ) | ( 'no' ) );
    public final void rule__TestConfiguration__RetryAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:437:1: ( ( 'yes' ) | ( 'no' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalEduTest.g:438:2: ( 'yes' )
                    {
                    // InternalEduTest.g:438:2: ( 'yes' )
                    // InternalEduTest.g:439:3: 'yes'
                    {
                     before(grammarAccess.getTestConfigurationAccess().getRetryYesKeyword_3_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getTestConfigurationAccess().getRetryYesKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEduTest.g:444:2: ( 'no' )
                    {
                    // InternalEduTest.g:444:2: ( 'no' )
                    // InternalEduTest.g:445:3: 'no'
                    {
                     before(grammarAccess.getTestConfigurationAccess().getRetryNoKeyword_3_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getTestConfigurationAccess().getRetryNoKeyword_3_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestConfiguration__RetryAlternatives_3_0"


    // $ANTLR start "rule__MultiChoiceEmConfig__RetryAlternatives_3_0"
    // InternalEduTest.g:454:1: rule__MultiChoiceEmConfig__RetryAlternatives_3_0 : ( ( 'yes' ) | ( 'no' ) );
    public final void rule__MultiChoiceEmConfig__RetryAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:458:1: ( ( 'yes' ) | ( 'no' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalEduTest.g:459:2: ( 'yes' )
                    {
                    // InternalEduTest.g:459:2: ( 'yes' )
                    // InternalEduTest.g:460:3: 'yes'
                    {
                     before(grammarAccess.getMultiChoiceEmConfigAccess().getRetryYesKeyword_3_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getMultiChoiceEmConfigAccess().getRetryYesKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEduTest.g:465:2: ( 'no' )
                    {
                    // InternalEduTest.g:465:2: ( 'no' )
                    // InternalEduTest.g:466:3: 'no'
                    {
                     before(grammarAccess.getMultiChoiceEmConfigAccess().getRetryNoKeyword_3_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getMultiChoiceEmConfigAccess().getRetryNoKeyword_3_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmConfig__RetryAlternatives_3_0"


    // $ANTLR start "rule__MultiChoiceEmConfig__WeightedAlternatives_7_0"
    // InternalEduTest.g:475:1: rule__MultiChoiceEmConfig__WeightedAlternatives_7_0 : ( ( 'yes' ) | ( 'no' ) );
    public final void rule__MultiChoiceEmConfig__WeightedAlternatives_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:479:1: ( ( 'yes' ) | ( 'no' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalEduTest.g:480:2: ( 'yes' )
                    {
                    // InternalEduTest.g:480:2: ( 'yes' )
                    // InternalEduTest.g:481:3: 'yes'
                    {
                     before(grammarAccess.getMultiChoiceEmConfigAccess().getWeightedYesKeyword_7_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getMultiChoiceEmConfigAccess().getWeightedYesKeyword_7_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEduTest.g:486:2: ( 'no' )
                    {
                    // InternalEduTest.g:486:2: ( 'no' )
                    // InternalEduTest.g:487:3: 'no'
                    {
                     before(grammarAccess.getMultiChoiceEmConfigAccess().getWeightedNoKeyword_7_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getMultiChoiceEmConfigAccess().getWeightedNoKeyword_7_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmConfig__WeightedAlternatives_7_0"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalEduTest.g:496:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:500:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalEduTest.g:501:2: ( RULE_STRING )
                    {
                    // InternalEduTest.g:501:2: ( RULE_STRING )
                    // InternalEduTest.g:502:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEduTest.g:507:2: ( RULE_ID )
                    {
                    // InternalEduTest.g:507:2: ( RULE_ID )
                    // InternalEduTest.g:508:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // InternalEduTest.g:517:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:521:1: ( ( 'E' ) | ( 'e' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            else if ( (LA6_0==14) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalEduTest.g:522:2: ( 'E' )
                    {
                    // InternalEduTest.g:522:2: ( 'E' )
                    // InternalEduTest.g:523:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEduTest.g:528:2: ( 'e' )
                    {
                    // InternalEduTest.g:528:2: ( 'e' )
                    // InternalEduTest.g:529:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Alternatives_4_0"


    // $ANTLR start "rule__Order__Alternatives"
    // InternalEduTest.g:538:1: rule__Order__Alternatives : ( ( ( 'fixed' ) ) | ( ( 'random' ) ) | ( ( 'options-ascending' ) ) | ( ( 'options-descending' ) ) );
    public final void rule__Order__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:542:1: ( ( ( 'fixed' ) ) | ( ( 'random' ) ) | ( ( 'options-ascending' ) ) | ( ( 'options-descending' ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt7=1;
                }
                break;
            case 16:
                {
                alt7=2;
                }
                break;
            case 17:
                {
                alt7=3;
                }
                break;
            case 18:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalEduTest.g:543:2: ( ( 'fixed' ) )
                    {
                    // InternalEduTest.g:543:2: ( ( 'fixed' ) )
                    // InternalEduTest.g:544:3: ( 'fixed' )
                    {
                     before(grammarAccess.getOrderAccess().getFixedEnumLiteralDeclaration_0()); 
                    // InternalEduTest.g:545:3: ( 'fixed' )
                    // InternalEduTest.g:545:4: 'fixed'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrderAccess().getFixedEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEduTest.g:549:2: ( ( 'random' ) )
                    {
                    // InternalEduTest.g:549:2: ( ( 'random' ) )
                    // InternalEduTest.g:550:3: ( 'random' )
                    {
                     before(grammarAccess.getOrderAccess().getRandomEnumLiteralDeclaration_1()); 
                    // InternalEduTest.g:551:3: ( 'random' )
                    // InternalEduTest.g:551:4: 'random'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrderAccess().getRandomEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEduTest.g:555:2: ( ( 'options-ascending' ) )
                    {
                    // InternalEduTest.g:555:2: ( ( 'options-ascending' ) )
                    // InternalEduTest.g:556:3: ( 'options-ascending' )
                    {
                     before(grammarAccess.getOrderAccess().getAscendingEnumLiteralDeclaration_2()); 
                    // InternalEduTest.g:557:3: ( 'options-ascending' )
                    // InternalEduTest.g:557:4: 'options-ascending'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrderAccess().getAscendingEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalEduTest.g:561:2: ( ( 'options-descending' ) )
                    {
                    // InternalEduTest.g:561:2: ( ( 'options-descending' ) )
                    // InternalEduTest.g:562:3: ( 'options-descending' )
                    {
                     before(grammarAccess.getOrderAccess().getDescendingEnumLiteralDeclaration_3()); 
                    // InternalEduTest.g:563:3: ( 'options-descending' )
                    // InternalEduTest.g:563:4: 'options-descending'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrderAccess().getDescendingEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Alternatives"


    // $ANTLR start "rule__Mode__Alternatives"
    // InternalEduTest.g:571:1: rule__Mode__Alternatives : ( ( ( 'radiobutton' ) ) | ( ( 'checkbox' ) ) );
    public final void rule__Mode__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:575:1: ( ( ( 'radiobutton' ) ) | ( ( 'checkbox' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            else if ( (LA8_0==20) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalEduTest.g:576:2: ( ( 'radiobutton' ) )
                    {
                    // InternalEduTest.g:576:2: ( ( 'radiobutton' ) )
                    // InternalEduTest.g:577:3: ( 'radiobutton' )
                    {
                     before(grammarAccess.getModeAccess().getRadiobuttonEnumLiteralDeclaration_0()); 
                    // InternalEduTest.g:578:3: ( 'radiobutton' )
                    // InternalEduTest.g:578:4: 'radiobutton'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getModeAccess().getRadiobuttonEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEduTest.g:582:2: ( ( 'checkbox' ) )
                    {
                    // InternalEduTest.g:582:2: ( ( 'checkbox' ) )
                    // InternalEduTest.g:583:3: ( 'checkbox' )
                    {
                     before(grammarAccess.getModeAccess().getCheckboxEnumLiteralDeclaration_1()); 
                    // InternalEduTest.g:584:3: ( 'checkbox' )
                    // InternalEduTest.g:584:4: 'checkbox'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getModeAccess().getCheckboxEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Alternatives"


    // $ANTLR start "rule__Navigation__Alternatives"
    // InternalEduTest.g:592:1: rule__Navigation__Alternatives : ( ( ( 'free' ) ) | ( ( 'locked' ) ) );
    public final void rule__Navigation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:596:1: ( ( ( 'free' ) ) | ( ( 'locked' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            else if ( (LA9_0==22) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalEduTest.g:597:2: ( ( 'free' ) )
                    {
                    // InternalEduTest.g:597:2: ( ( 'free' ) )
                    // InternalEduTest.g:598:3: ( 'free' )
                    {
                     before(grammarAccess.getNavigationAccess().getFreeEnumLiteralDeclaration_0()); 
                    // InternalEduTest.g:599:3: ( 'free' )
                    // InternalEduTest.g:599:4: 'free'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getNavigationAccess().getFreeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEduTest.g:603:2: ( ( 'locked' ) )
                    {
                    // InternalEduTest.g:603:2: ( ( 'locked' ) )
                    // InternalEduTest.g:604:3: ( 'locked' )
                    {
                     before(grammarAccess.getNavigationAccess().getLockedEnumLiteralDeclaration_1()); 
                    // InternalEduTest.g:605:3: ( 'locked' )
                    // InternalEduTest.g:605:4: 'locked'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getNavigationAccess().getLockedEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navigation__Alternatives"


    // $ANTLR start "rule__Program__Group__0"
    // InternalEduTest.g:613:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:617:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalEduTest.g:618:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // InternalEduTest.g:625:1: rule__Program__Group__0__Impl : ( () ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:629:1: ( ( () ) )
            // InternalEduTest.g:630:1: ( () )
            {
            // InternalEduTest.g:630:1: ( () )
            // InternalEduTest.g:631:2: ()
            {
             before(grammarAccess.getProgramAccess().getProgramAction_0()); 
            // InternalEduTest.g:632:2: ()
            // InternalEduTest.g:632:3: 
            {
            }

             after(grammarAccess.getProgramAccess().getProgramAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // InternalEduTest.g:640:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:644:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalEduTest.g:645:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // InternalEduTest.g:652:1: rule__Program__Group__1__Impl : ( ( rule__Program__ConfigAssignment_1 )? ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:656:1: ( ( ( rule__Program__ConfigAssignment_1 )? ) )
            // InternalEduTest.g:657:1: ( ( rule__Program__ConfigAssignment_1 )? )
            {
            // InternalEduTest.g:657:1: ( ( rule__Program__ConfigAssignment_1 )? )
            // InternalEduTest.g:658:2: ( rule__Program__ConfigAssignment_1 )?
            {
             before(grammarAccess.getProgramAccess().getConfigAssignment_1()); 
            // InternalEduTest.g:659:2: ( rule__Program__ConfigAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalEduTest.g:659:3: rule__Program__ConfigAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Program__ConfigAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProgramAccess().getConfigAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Program__Group__2"
    // InternalEduTest.g:667:1: rule__Program__Group__2 : rule__Program__Group__2__Impl ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:671:1: ( rule__Program__Group__2__Impl )
            // InternalEduTest.g:672:2: rule__Program__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2"


    // $ANTLR start "rule__Program__Group__2__Impl"
    // InternalEduTest.g:678:1: rule__Program__Group__2__Impl : ( ( ( rule__Program__ExercisesAssignment_2 ) ) ( ( rule__Program__ExercisesAssignment_2 )* ) ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:682:1: ( ( ( ( rule__Program__ExercisesAssignment_2 ) ) ( ( rule__Program__ExercisesAssignment_2 )* ) ) )
            // InternalEduTest.g:683:1: ( ( ( rule__Program__ExercisesAssignment_2 ) ) ( ( rule__Program__ExercisesAssignment_2 )* ) )
            {
            // InternalEduTest.g:683:1: ( ( ( rule__Program__ExercisesAssignment_2 ) ) ( ( rule__Program__ExercisesAssignment_2 )* ) )
            // InternalEduTest.g:684:2: ( ( rule__Program__ExercisesAssignment_2 ) ) ( ( rule__Program__ExercisesAssignment_2 )* )
            {
            // InternalEduTest.g:684:2: ( ( rule__Program__ExercisesAssignment_2 ) )
            // InternalEduTest.g:685:3: ( rule__Program__ExercisesAssignment_2 )
            {
             before(grammarAccess.getProgramAccess().getExercisesAssignment_2()); 
            // InternalEduTest.g:686:3: ( rule__Program__ExercisesAssignment_2 )
            // InternalEduTest.g:686:4: rule__Program__ExercisesAssignment_2
            {
            pushFollow(FOLLOW_4);
            rule__Program__ExercisesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getExercisesAssignment_2()); 

            }

            // InternalEduTest.g:689:2: ( ( rule__Program__ExercisesAssignment_2 )* )
            // InternalEduTest.g:690:3: ( rule__Program__ExercisesAssignment_2 )*
            {
             before(grammarAccess.getProgramAccess().getExercisesAssignment_2()); 
            // InternalEduTest.g:691:3: ( rule__Program__ExercisesAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23||(LA11_0>=27 && LA11_0<=29)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalEduTest.g:691:4: rule__Program__ExercisesAssignment_2
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Program__ExercisesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getExercisesAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2__Impl"


    // $ANTLR start "rule__AlternativeResponse__Group__0"
    // InternalEduTest.g:701:1: rule__AlternativeResponse__Group__0 : rule__AlternativeResponse__Group__0__Impl rule__AlternativeResponse__Group__1 ;
    public final void rule__AlternativeResponse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:705:1: ( rule__AlternativeResponse__Group__0__Impl rule__AlternativeResponse__Group__1 )
            // InternalEduTest.g:706:2: rule__AlternativeResponse__Group__0__Impl rule__AlternativeResponse__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__AlternativeResponse__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlternativeResponse__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeResponse__Group__0"


    // $ANTLR start "rule__AlternativeResponse__Group__0__Impl"
    // InternalEduTest.g:713:1: rule__AlternativeResponse__Group__0__Impl : ( 'AlternativeResponse' ) ;
    public final void rule__AlternativeResponse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:717:1: ( ( 'AlternativeResponse' ) )
            // InternalEduTest.g:718:1: ( 'AlternativeResponse' )
            {
            // InternalEduTest.g:718:1: ( 'AlternativeResponse' )
            // InternalEduTest.g:719:2: 'AlternativeResponse'
            {
             before(grammarAccess.getAlternativeResponseAccess().getAlternativeResponseKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAlternativeResponseAccess().getAlternativeResponseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeResponse__Group__0__Impl"


    // $ANTLR start "rule__AlternativeResponse__Group__1"
    // InternalEduTest.g:728:1: rule__AlternativeResponse__Group__1 : rule__AlternativeResponse__Group__1__Impl rule__AlternativeResponse__Group__2 ;
    public final void rule__AlternativeResponse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:732:1: ( rule__AlternativeResponse__Group__1__Impl rule__AlternativeResponse__Group__2 )
            // InternalEduTest.g:733:2: rule__AlternativeResponse__Group__1__Impl rule__AlternativeResponse__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__AlternativeResponse__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlternativeResponse__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeResponse__Group__1"


    // $ANTLR start "rule__AlternativeResponse__Group__1__Impl"
    // InternalEduTest.g:740:1: rule__AlternativeResponse__Group__1__Impl : ( ( rule__AlternativeResponse__Group_1__0 )? ) ;
    public final void rule__AlternativeResponse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:744:1: ( ( ( rule__AlternativeResponse__Group_1__0 )? ) )
            // InternalEduTest.g:745:1: ( ( rule__AlternativeResponse__Group_1__0 )? )
            {
            // InternalEduTest.g:745:1: ( ( rule__AlternativeResponse__Group_1__0 )? )
            // InternalEduTest.g:746:2: ( rule__AlternativeResponse__Group_1__0 )?
            {
             before(grammarAccess.getAlternativeResponseAccess().getGroup_1()); 
            // InternalEduTest.g:747:2: ( rule__AlternativeResponse__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalEduTest.g:747:3: rule__AlternativeResponse__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AlternativeResponse__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAlternativeResponseAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeResponse__Group__1__Impl"


    // $ANTLR start "rule__AlternativeResponse__Group__2"
    // InternalEduTest.g:755:1: rule__AlternativeResponse__Group__2 : rule__AlternativeResponse__Group__2__Impl rule__AlternativeResponse__Group__3 ;
    public final void rule__AlternativeResponse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:759:1: ( rule__AlternativeResponse__Group__2__Impl rule__AlternativeResponse__Group__3 )
            // InternalEduTest.g:760:2: rule__AlternativeResponse__Group__2__Impl rule__AlternativeResponse__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__AlternativeResponse__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlternativeResponse__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeResponse__Group__2"


    // $ANTLR start "rule__AlternativeResponse__Group__2__Impl"
    // InternalEduTest.g:767:1: rule__AlternativeResponse__Group__2__Impl : ( '{' ) ;
    public final void rule__AlternativeResponse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:771:1: ( ( '{' ) )
            // InternalEduTest.g:772:1: ( '{' )
            {
            // InternalEduTest.g:772:1: ( '{' )
            // InternalEduTest.g:773:2: '{'
            {
             before(grammarAccess.getAlternativeResponseAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAlternativeResponseAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeResponse__Group__2__Impl"


    // $ANTLR start "rule__AlternativeResponse__Group__3"
    // InternalEduTest.g:782:1: rule__AlternativeResponse__Group__3 : rule__AlternativeResponse__Group__3__Impl rule__AlternativeResponse__Group__4 ;
    public final void rule__AlternativeResponse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:786:1: ( rule__AlternativeResponse__Group__3__Impl rule__AlternativeResponse__Group__4 )
            // InternalEduTest.g:787:2: rule__AlternativeResponse__Group__3__Impl rule__AlternativeResponse__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__AlternativeResponse__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlternativeResponse__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeResponse__Group__3"


    // $ANTLR start "rule__AlternativeResponse__Group__3__Impl"
    // InternalEduTest.g:794:1: rule__AlternativeResponse__Group__3__Impl : ( ( rule__AlternativeResponse__ConfigAssignment_3 ) ) ;
    public final void rule__AlternativeResponse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:798:1: ( ( ( rule__AlternativeResponse__ConfigAssignment_3 ) ) )
            // InternalEduTest.g:799:1: ( ( rule__AlternativeResponse__ConfigAssignment_3 ) )
            {
            // InternalEduTest.g:799:1: ( ( rule__AlternativeResponse__ConfigAssignment_3 ) )
            // InternalEduTest.g:800:2: ( rule__AlternativeResponse__ConfigAssignment_3 )
            {
             before(grammarAccess.getAlternativeResponseAccess().getConfigAssignment_3()); 
            // InternalEduTest.g:801:2: ( rule__AlternativeResponse__ConfigAssignment_3 )
            // InternalEduTest.g:801:3: rule__AlternativeResponse__ConfigAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AlternativeResponse__ConfigAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAlternativeResponseAccess().getConfigAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeResponse__Group__3__Impl"


    // $ANTLR start "rule__AlternativeResponse__Group__4"
    // InternalEduTest.g:809:1: rule__AlternativeResponse__Group__4 : rule__AlternativeResponse__Group__4__Impl rule__AlternativeResponse__Group__5 ;
    public final void rule__AlternativeResponse__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:813:1: ( rule__AlternativeResponse__Group__4__Impl rule__AlternativeResponse__Group__5 )
            // InternalEduTest.g:814:2: rule__AlternativeResponse__Group__4__Impl rule__AlternativeResponse__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__AlternativeResponse__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlternativeResponse__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeResponse__Group__4"


    // $ANTLR start "rule__AlternativeResponse__Group__4__Impl"
    // InternalEduTest.g:821:1: rule__AlternativeResponse__Group__4__Impl : ( ( rule__AlternativeResponse__TestsAssignment_4 )* ) ;
    public final void rule__AlternativeResponse__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:825:1: ( ( ( rule__AlternativeResponse__TestsAssignment_4 )* ) )
            // InternalEduTest.g:826:1: ( ( rule__AlternativeResponse__TestsAssignment_4 )* )
            {
            // InternalEduTest.g:826:1: ( ( rule__AlternativeResponse__TestsAssignment_4 )* )
            // InternalEduTest.g:827:2: ( rule__AlternativeResponse__TestsAssignment_4 )*
            {
             before(grammarAccess.getAlternativeResponseAccess().getTestsAssignment_4()); 
            // InternalEduTest.g:828:2: ( rule__AlternativeResponse__TestsAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==37) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalEduTest.g:828:3: rule__AlternativeResponse__TestsAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__AlternativeResponse__TestsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getAlternativeResponseAccess().getTestsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeResponse__Group__4__Impl"


    // $ANTLR start "rule__AlternativeResponse__Group__5"
    // InternalEduTest.g:836:1: rule__AlternativeResponse__Group__5 : rule__AlternativeResponse__Group__5__Impl ;
    public final void rule__AlternativeResponse__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:840:1: ( rule__AlternativeResponse__Group__5__Impl )
            // InternalEduTest.g:841:2: rule__AlternativeResponse__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AlternativeResponse__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeResponse__Group__5"


    // $ANTLR start "rule__AlternativeResponse__Group__5__Impl"
    // InternalEduTest.g:847:1: rule__AlternativeResponse__Group__5__Impl : ( '}' ) ;
    public final void rule__AlternativeResponse__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:851:1: ( ( '}' ) )
            // InternalEduTest.g:852:1: ( '}' )
            {
            // InternalEduTest.g:852:1: ( '}' )
            // InternalEduTest.g:853:2: '}'
            {
             before(grammarAccess.getAlternativeResponseAccess().getRightCurlyBracketKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAlternativeResponseAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeResponse__Group__5__Impl"


    // $ANTLR start "rule__AlternativeResponse__Group_1__0"
    // InternalEduTest.g:863:1: rule__AlternativeResponse__Group_1__0 : rule__AlternativeResponse__Group_1__0__Impl rule__AlternativeResponse__Group_1__1 ;
    public final void rule__AlternativeResponse__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:867:1: ( rule__AlternativeResponse__Group_1__0__Impl rule__AlternativeResponse__Group_1__1 )
            // InternalEduTest.g:868:2: rule__AlternativeResponse__Group_1__0__Impl rule__AlternativeResponse__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__AlternativeResponse__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlternativeResponse__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeResponse__Group_1__0"


    // $ANTLR start "rule__AlternativeResponse__Group_1__0__Impl"
    // InternalEduTest.g:875:1: rule__AlternativeResponse__Group_1__0__Impl : ( ( rule__AlternativeResponse__BlocksAssignment_1_0 ) ) ;
    public final void rule__AlternativeResponse__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:879:1: ( ( ( rule__AlternativeResponse__BlocksAssignment_1_0 ) ) )
            // InternalEduTest.g:880:1: ( ( rule__AlternativeResponse__BlocksAssignment_1_0 ) )
            {
            // InternalEduTest.g:880:1: ( ( rule__AlternativeResponse__BlocksAssignment_1_0 ) )
            // InternalEduTest.g:881:2: ( rule__AlternativeResponse__BlocksAssignment_1_0 )
            {
             before(grammarAccess.getAlternativeResponseAccess().getBlocksAssignment_1_0()); 
            // InternalEduTest.g:882:2: ( rule__AlternativeResponse__BlocksAssignment_1_0 )
            // InternalEduTest.g:882:3: rule__AlternativeResponse__BlocksAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__AlternativeResponse__BlocksAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAlternativeResponseAccess().getBlocksAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeResponse__Group_1__0__Impl"


    // $ANTLR start "rule__AlternativeResponse__Group_1__1"
    // InternalEduTest.g:890:1: rule__AlternativeResponse__Group_1__1 : rule__AlternativeResponse__Group_1__1__Impl ;
    public final void rule__AlternativeResponse__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:894:1: ( rule__AlternativeResponse__Group_1__1__Impl )
            // InternalEduTest.g:895:2: rule__AlternativeResponse__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AlternativeResponse__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeResponse__Group_1__1"


    // $ANTLR start "rule__AlternativeResponse__Group_1__1__Impl"
    // InternalEduTest.g:901:1: rule__AlternativeResponse__Group_1__1__Impl : ( ( rule__AlternativeResponse__Group_1_1__0 )* ) ;
    public final void rule__AlternativeResponse__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:905:1: ( ( ( rule__AlternativeResponse__Group_1_1__0 )* ) )
            // InternalEduTest.g:906:1: ( ( rule__AlternativeResponse__Group_1_1__0 )* )
            {
            // InternalEduTest.g:906:1: ( ( rule__AlternativeResponse__Group_1_1__0 )* )
            // InternalEduTest.g:907:2: ( rule__AlternativeResponse__Group_1_1__0 )*
            {
             before(grammarAccess.getAlternativeResponseAccess().getGroup_1_1()); 
            // InternalEduTest.g:908:2: ( rule__AlternativeResponse__Group_1_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalEduTest.g:908:3: rule__AlternativeResponse__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__AlternativeResponse__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getAlternativeResponseAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeResponse__Group_1__1__Impl"


    // $ANTLR start "rule__AlternativeResponse__Group_1_1__0"
    // InternalEduTest.g:917:1: rule__AlternativeResponse__Group_1_1__0 : rule__AlternativeResponse__Group_1_1__0__Impl rule__AlternativeResponse__Group_1_1__1 ;
    public final void rule__AlternativeResponse__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:921:1: ( rule__AlternativeResponse__Group_1_1__0__Impl rule__AlternativeResponse__Group_1_1__1 )
            // InternalEduTest.g:922:2: rule__AlternativeResponse__Group_1_1__0__Impl rule__AlternativeResponse__Group_1_1__1
            {
            pushFollow(FOLLOW_11);
            rule__AlternativeResponse__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlternativeResponse__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeResponse__Group_1_1__0"


    // $ANTLR start "rule__AlternativeResponse__Group_1_1__0__Impl"
    // InternalEduTest.g:929:1: rule__AlternativeResponse__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__AlternativeResponse__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:933:1: ( ( ',' ) )
            // InternalEduTest.g:934:1: ( ',' )
            {
            // InternalEduTest.g:934:1: ( ',' )
            // InternalEduTest.g:935:2: ','
            {
             before(grammarAccess.getAlternativeResponseAccess().getCommaKeyword_1_1_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAlternativeResponseAccess().getCommaKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeResponse__Group_1_1__0__Impl"


    // $ANTLR start "rule__AlternativeResponse__Group_1_1__1"
    // InternalEduTest.g:944:1: rule__AlternativeResponse__Group_1_1__1 : rule__AlternativeResponse__Group_1_1__1__Impl ;
    public final void rule__AlternativeResponse__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:948:1: ( rule__AlternativeResponse__Group_1_1__1__Impl )
            // InternalEduTest.g:949:2: rule__AlternativeResponse__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AlternativeResponse__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeResponse__Group_1_1__1"


    // $ANTLR start "rule__AlternativeResponse__Group_1_1__1__Impl"
    // InternalEduTest.g:955:1: rule__AlternativeResponse__Group_1_1__1__Impl : ( ( rule__AlternativeResponse__BlocksAssignment_1_1_1 ) ) ;
    public final void rule__AlternativeResponse__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:959:1: ( ( ( rule__AlternativeResponse__BlocksAssignment_1_1_1 ) ) )
            // InternalEduTest.g:960:1: ( ( rule__AlternativeResponse__BlocksAssignment_1_1_1 ) )
            {
            // InternalEduTest.g:960:1: ( ( rule__AlternativeResponse__BlocksAssignment_1_1_1 ) )
            // InternalEduTest.g:961:2: ( rule__AlternativeResponse__BlocksAssignment_1_1_1 )
            {
             before(grammarAccess.getAlternativeResponseAccess().getBlocksAssignment_1_1_1()); 
            // InternalEduTest.g:962:2: ( rule__AlternativeResponse__BlocksAssignment_1_1_1 )
            // InternalEduTest.g:962:3: rule__AlternativeResponse__BlocksAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AlternativeResponse__BlocksAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAlternativeResponseAccess().getBlocksAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeResponse__Group_1_1__1__Impl"


    // $ANTLR start "rule__MultiChoiceDiagram__Group__0"
    // InternalEduTest.g:971:1: rule__MultiChoiceDiagram__Group__0 : rule__MultiChoiceDiagram__Group__0__Impl rule__MultiChoiceDiagram__Group__1 ;
    public final void rule__MultiChoiceDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:975:1: ( rule__MultiChoiceDiagram__Group__0__Impl rule__MultiChoiceDiagram__Group__1 )
            // InternalEduTest.g:976:2: rule__MultiChoiceDiagram__Group__0__Impl rule__MultiChoiceDiagram__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__MultiChoiceDiagram__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoiceDiagram__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceDiagram__Group__0"


    // $ANTLR start "rule__MultiChoiceDiagram__Group__0__Impl"
    // InternalEduTest.g:983:1: rule__MultiChoiceDiagram__Group__0__Impl : ( 'MultiChoiceDiagram' ) ;
    public final void rule__MultiChoiceDiagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:987:1: ( ( 'MultiChoiceDiagram' ) )
            // InternalEduTest.g:988:1: ( 'MultiChoiceDiagram' )
            {
            // InternalEduTest.g:988:1: ( 'MultiChoiceDiagram' )
            // InternalEduTest.g:989:2: 'MultiChoiceDiagram'
            {
             before(grammarAccess.getMultiChoiceDiagramAccess().getMultiChoiceDiagramKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMultiChoiceDiagramAccess().getMultiChoiceDiagramKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceDiagram__Group__0__Impl"


    // $ANTLR start "rule__MultiChoiceDiagram__Group__1"
    // InternalEduTest.g:998:1: rule__MultiChoiceDiagram__Group__1 : rule__MultiChoiceDiagram__Group__1__Impl rule__MultiChoiceDiagram__Group__2 ;
    public final void rule__MultiChoiceDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1002:1: ( rule__MultiChoiceDiagram__Group__1__Impl rule__MultiChoiceDiagram__Group__2 )
            // InternalEduTest.g:1003:2: rule__MultiChoiceDiagram__Group__1__Impl rule__MultiChoiceDiagram__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__MultiChoiceDiagram__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoiceDiagram__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceDiagram__Group__1"


    // $ANTLR start "rule__MultiChoiceDiagram__Group__1__Impl"
    // InternalEduTest.g:1010:1: rule__MultiChoiceDiagram__Group__1__Impl : ( ( rule__MultiChoiceDiagram__Group_1__0 )? ) ;
    public final void rule__MultiChoiceDiagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1014:1: ( ( ( rule__MultiChoiceDiagram__Group_1__0 )? ) )
            // InternalEduTest.g:1015:1: ( ( rule__MultiChoiceDiagram__Group_1__0 )? )
            {
            // InternalEduTest.g:1015:1: ( ( rule__MultiChoiceDiagram__Group_1__0 )? )
            // InternalEduTest.g:1016:2: ( rule__MultiChoiceDiagram__Group_1__0 )?
            {
             before(grammarAccess.getMultiChoiceDiagramAccess().getGroup_1()); 
            // InternalEduTest.g:1017:2: ( rule__MultiChoiceDiagram__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalEduTest.g:1017:3: rule__MultiChoiceDiagram__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultiChoiceDiagram__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultiChoiceDiagramAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceDiagram__Group__1__Impl"


    // $ANTLR start "rule__MultiChoiceDiagram__Group__2"
    // InternalEduTest.g:1025:1: rule__MultiChoiceDiagram__Group__2 : rule__MultiChoiceDiagram__Group__2__Impl rule__MultiChoiceDiagram__Group__3 ;
    public final void rule__MultiChoiceDiagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1029:1: ( rule__MultiChoiceDiagram__Group__2__Impl rule__MultiChoiceDiagram__Group__3 )
            // InternalEduTest.g:1030:2: rule__MultiChoiceDiagram__Group__2__Impl rule__MultiChoiceDiagram__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__MultiChoiceDiagram__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoiceDiagram__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceDiagram__Group__2"


    // $ANTLR start "rule__MultiChoiceDiagram__Group__2__Impl"
    // InternalEduTest.g:1037:1: rule__MultiChoiceDiagram__Group__2__Impl : ( '{' ) ;
    public final void rule__MultiChoiceDiagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1041:1: ( ( '{' ) )
            // InternalEduTest.g:1042:1: ( '{' )
            {
            // InternalEduTest.g:1042:1: ( '{' )
            // InternalEduTest.g:1043:2: '{'
            {
             before(grammarAccess.getMultiChoiceDiagramAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMultiChoiceDiagramAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceDiagram__Group__2__Impl"


    // $ANTLR start "rule__MultiChoiceDiagram__Group__3"
    // InternalEduTest.g:1052:1: rule__MultiChoiceDiagram__Group__3 : rule__MultiChoiceDiagram__Group__3__Impl rule__MultiChoiceDiagram__Group__4 ;
    public final void rule__MultiChoiceDiagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1056:1: ( rule__MultiChoiceDiagram__Group__3__Impl rule__MultiChoiceDiagram__Group__4 )
            // InternalEduTest.g:1057:2: rule__MultiChoiceDiagram__Group__3__Impl rule__MultiChoiceDiagram__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__MultiChoiceDiagram__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoiceDiagram__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceDiagram__Group__3"


    // $ANTLR start "rule__MultiChoiceDiagram__Group__3__Impl"
    // InternalEduTest.g:1064:1: rule__MultiChoiceDiagram__Group__3__Impl : ( ( rule__MultiChoiceDiagram__ConfigAssignment_3 ) ) ;
    public final void rule__MultiChoiceDiagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1068:1: ( ( ( rule__MultiChoiceDiagram__ConfigAssignment_3 ) ) )
            // InternalEduTest.g:1069:1: ( ( rule__MultiChoiceDiagram__ConfigAssignment_3 ) )
            {
            // InternalEduTest.g:1069:1: ( ( rule__MultiChoiceDiagram__ConfigAssignment_3 ) )
            // InternalEduTest.g:1070:2: ( rule__MultiChoiceDiagram__ConfigAssignment_3 )
            {
             before(grammarAccess.getMultiChoiceDiagramAccess().getConfigAssignment_3()); 
            // InternalEduTest.g:1071:2: ( rule__MultiChoiceDiagram__ConfigAssignment_3 )
            // InternalEduTest.g:1071:3: rule__MultiChoiceDiagram__ConfigAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MultiChoiceDiagram__ConfigAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMultiChoiceDiagramAccess().getConfigAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceDiagram__Group__3__Impl"


    // $ANTLR start "rule__MultiChoiceDiagram__Group__4"
    // InternalEduTest.g:1079:1: rule__MultiChoiceDiagram__Group__4 : rule__MultiChoiceDiagram__Group__4__Impl rule__MultiChoiceDiagram__Group__5 ;
    public final void rule__MultiChoiceDiagram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1083:1: ( rule__MultiChoiceDiagram__Group__4__Impl rule__MultiChoiceDiagram__Group__5 )
            // InternalEduTest.g:1084:2: rule__MultiChoiceDiagram__Group__4__Impl rule__MultiChoiceDiagram__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__MultiChoiceDiagram__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoiceDiagram__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceDiagram__Group__4"


    // $ANTLR start "rule__MultiChoiceDiagram__Group__4__Impl"
    // InternalEduTest.g:1091:1: rule__MultiChoiceDiagram__Group__4__Impl : ( ( rule__MultiChoiceDiagram__TestsAssignment_4 )* ) ;
    public final void rule__MultiChoiceDiagram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1095:1: ( ( ( rule__MultiChoiceDiagram__TestsAssignment_4 )* ) )
            // InternalEduTest.g:1096:1: ( ( rule__MultiChoiceDiagram__TestsAssignment_4 )* )
            {
            // InternalEduTest.g:1096:1: ( ( rule__MultiChoiceDiagram__TestsAssignment_4 )* )
            // InternalEduTest.g:1097:2: ( rule__MultiChoiceDiagram__TestsAssignment_4 )*
            {
             before(grammarAccess.getMultiChoiceDiagramAccess().getTestsAssignment_4()); 
            // InternalEduTest.g:1098:2: ( rule__MultiChoiceDiagram__TestsAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==37) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalEduTest.g:1098:3: rule__MultiChoiceDiagram__TestsAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__MultiChoiceDiagram__TestsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getMultiChoiceDiagramAccess().getTestsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceDiagram__Group__4__Impl"


    // $ANTLR start "rule__MultiChoiceDiagram__Group__5"
    // InternalEduTest.g:1106:1: rule__MultiChoiceDiagram__Group__5 : rule__MultiChoiceDiagram__Group__5__Impl ;
    public final void rule__MultiChoiceDiagram__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1110:1: ( rule__MultiChoiceDiagram__Group__5__Impl )
            // InternalEduTest.g:1111:2: rule__MultiChoiceDiagram__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiChoiceDiagram__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceDiagram__Group__5"


    // $ANTLR start "rule__MultiChoiceDiagram__Group__5__Impl"
    // InternalEduTest.g:1117:1: rule__MultiChoiceDiagram__Group__5__Impl : ( '}' ) ;
    public final void rule__MultiChoiceDiagram__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1121:1: ( ( '}' ) )
            // InternalEduTest.g:1122:1: ( '}' )
            {
            // InternalEduTest.g:1122:1: ( '}' )
            // InternalEduTest.g:1123:2: '}'
            {
             before(grammarAccess.getMultiChoiceDiagramAccess().getRightCurlyBracketKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMultiChoiceDiagramAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceDiagram__Group__5__Impl"


    // $ANTLR start "rule__MultiChoiceDiagram__Group_1__0"
    // InternalEduTest.g:1133:1: rule__MultiChoiceDiagram__Group_1__0 : rule__MultiChoiceDiagram__Group_1__0__Impl rule__MultiChoiceDiagram__Group_1__1 ;
    public final void rule__MultiChoiceDiagram__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1137:1: ( rule__MultiChoiceDiagram__Group_1__0__Impl rule__MultiChoiceDiagram__Group_1__1 )
            // InternalEduTest.g:1138:2: rule__MultiChoiceDiagram__Group_1__0__Impl rule__MultiChoiceDiagram__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__MultiChoiceDiagram__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoiceDiagram__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceDiagram__Group_1__0"


    // $ANTLR start "rule__MultiChoiceDiagram__Group_1__0__Impl"
    // InternalEduTest.g:1145:1: rule__MultiChoiceDiagram__Group_1__0__Impl : ( ( rule__MultiChoiceDiagram__BlocksAssignment_1_0 ) ) ;
    public final void rule__MultiChoiceDiagram__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1149:1: ( ( ( rule__MultiChoiceDiagram__BlocksAssignment_1_0 ) ) )
            // InternalEduTest.g:1150:1: ( ( rule__MultiChoiceDiagram__BlocksAssignment_1_0 ) )
            {
            // InternalEduTest.g:1150:1: ( ( rule__MultiChoiceDiagram__BlocksAssignment_1_0 ) )
            // InternalEduTest.g:1151:2: ( rule__MultiChoiceDiagram__BlocksAssignment_1_0 )
            {
             before(grammarAccess.getMultiChoiceDiagramAccess().getBlocksAssignment_1_0()); 
            // InternalEduTest.g:1152:2: ( rule__MultiChoiceDiagram__BlocksAssignment_1_0 )
            // InternalEduTest.g:1152:3: rule__MultiChoiceDiagram__BlocksAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MultiChoiceDiagram__BlocksAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiChoiceDiagramAccess().getBlocksAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceDiagram__Group_1__0__Impl"


    // $ANTLR start "rule__MultiChoiceDiagram__Group_1__1"
    // InternalEduTest.g:1160:1: rule__MultiChoiceDiagram__Group_1__1 : rule__MultiChoiceDiagram__Group_1__1__Impl ;
    public final void rule__MultiChoiceDiagram__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1164:1: ( rule__MultiChoiceDiagram__Group_1__1__Impl )
            // InternalEduTest.g:1165:2: rule__MultiChoiceDiagram__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiChoiceDiagram__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceDiagram__Group_1__1"


    // $ANTLR start "rule__MultiChoiceDiagram__Group_1__1__Impl"
    // InternalEduTest.g:1171:1: rule__MultiChoiceDiagram__Group_1__1__Impl : ( ( rule__MultiChoiceDiagram__Group_1_1__0 )* ) ;
    public final void rule__MultiChoiceDiagram__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1175:1: ( ( ( rule__MultiChoiceDiagram__Group_1_1__0 )* ) )
            // InternalEduTest.g:1176:1: ( ( rule__MultiChoiceDiagram__Group_1_1__0 )* )
            {
            // InternalEduTest.g:1176:1: ( ( rule__MultiChoiceDiagram__Group_1_1__0 )* )
            // InternalEduTest.g:1177:2: ( rule__MultiChoiceDiagram__Group_1_1__0 )*
            {
             before(grammarAccess.getMultiChoiceDiagramAccess().getGroup_1_1()); 
            // InternalEduTest.g:1178:2: ( rule__MultiChoiceDiagram__Group_1_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==26) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalEduTest.g:1178:3: rule__MultiChoiceDiagram__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__MultiChoiceDiagram__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getMultiChoiceDiagramAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceDiagram__Group_1__1__Impl"


    // $ANTLR start "rule__MultiChoiceDiagram__Group_1_1__0"
    // InternalEduTest.g:1187:1: rule__MultiChoiceDiagram__Group_1_1__0 : rule__MultiChoiceDiagram__Group_1_1__0__Impl rule__MultiChoiceDiagram__Group_1_1__1 ;
    public final void rule__MultiChoiceDiagram__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1191:1: ( rule__MultiChoiceDiagram__Group_1_1__0__Impl rule__MultiChoiceDiagram__Group_1_1__1 )
            // InternalEduTest.g:1192:2: rule__MultiChoiceDiagram__Group_1_1__0__Impl rule__MultiChoiceDiagram__Group_1_1__1
            {
            pushFollow(FOLLOW_11);
            rule__MultiChoiceDiagram__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoiceDiagram__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceDiagram__Group_1_1__0"


    // $ANTLR start "rule__MultiChoiceDiagram__Group_1_1__0__Impl"
    // InternalEduTest.g:1199:1: rule__MultiChoiceDiagram__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__MultiChoiceDiagram__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1203:1: ( ( ',' ) )
            // InternalEduTest.g:1204:1: ( ',' )
            {
            // InternalEduTest.g:1204:1: ( ',' )
            // InternalEduTest.g:1205:2: ','
            {
             before(grammarAccess.getMultiChoiceDiagramAccess().getCommaKeyword_1_1_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMultiChoiceDiagramAccess().getCommaKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceDiagram__Group_1_1__0__Impl"


    // $ANTLR start "rule__MultiChoiceDiagram__Group_1_1__1"
    // InternalEduTest.g:1214:1: rule__MultiChoiceDiagram__Group_1_1__1 : rule__MultiChoiceDiagram__Group_1_1__1__Impl ;
    public final void rule__MultiChoiceDiagram__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1218:1: ( rule__MultiChoiceDiagram__Group_1_1__1__Impl )
            // InternalEduTest.g:1219:2: rule__MultiChoiceDiagram__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiChoiceDiagram__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceDiagram__Group_1_1__1"


    // $ANTLR start "rule__MultiChoiceDiagram__Group_1_1__1__Impl"
    // InternalEduTest.g:1225:1: rule__MultiChoiceDiagram__Group_1_1__1__Impl : ( ( rule__MultiChoiceDiagram__BlocksAssignment_1_1_1 ) ) ;
    public final void rule__MultiChoiceDiagram__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1229:1: ( ( ( rule__MultiChoiceDiagram__BlocksAssignment_1_1_1 ) ) )
            // InternalEduTest.g:1230:1: ( ( rule__MultiChoiceDiagram__BlocksAssignment_1_1_1 ) )
            {
            // InternalEduTest.g:1230:1: ( ( rule__MultiChoiceDiagram__BlocksAssignment_1_1_1 ) )
            // InternalEduTest.g:1231:2: ( rule__MultiChoiceDiagram__BlocksAssignment_1_1_1 )
            {
             before(grammarAccess.getMultiChoiceDiagramAccess().getBlocksAssignment_1_1_1()); 
            // InternalEduTest.g:1232:2: ( rule__MultiChoiceDiagram__BlocksAssignment_1_1_1 )
            // InternalEduTest.g:1232:3: rule__MultiChoiceDiagram__BlocksAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MultiChoiceDiagram__BlocksAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiChoiceDiagramAccess().getBlocksAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceDiagram__Group_1_1__1__Impl"


    // $ANTLR start "rule__MultiChoiceEmendation__Group__0"
    // InternalEduTest.g:1241:1: rule__MultiChoiceEmendation__Group__0 : rule__MultiChoiceEmendation__Group__0__Impl rule__MultiChoiceEmendation__Group__1 ;
    public final void rule__MultiChoiceEmendation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1245:1: ( rule__MultiChoiceEmendation__Group__0__Impl rule__MultiChoiceEmendation__Group__1 )
            // InternalEduTest.g:1246:2: rule__MultiChoiceEmendation__Group__0__Impl rule__MultiChoiceEmendation__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__MultiChoiceEmendation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoiceEmendation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmendation__Group__0"


    // $ANTLR start "rule__MultiChoiceEmendation__Group__0__Impl"
    // InternalEduTest.g:1253:1: rule__MultiChoiceEmendation__Group__0__Impl : ( 'MultiChoiceEmendation' ) ;
    public final void rule__MultiChoiceEmendation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1257:1: ( ( 'MultiChoiceEmendation' ) )
            // InternalEduTest.g:1258:1: ( 'MultiChoiceEmendation' )
            {
            // InternalEduTest.g:1258:1: ( 'MultiChoiceEmendation' )
            // InternalEduTest.g:1259:2: 'MultiChoiceEmendation'
            {
             before(grammarAccess.getMultiChoiceEmendationAccess().getMultiChoiceEmendationKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMultiChoiceEmendationAccess().getMultiChoiceEmendationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmendation__Group__0__Impl"


    // $ANTLR start "rule__MultiChoiceEmendation__Group__1"
    // InternalEduTest.g:1268:1: rule__MultiChoiceEmendation__Group__1 : rule__MultiChoiceEmendation__Group__1__Impl rule__MultiChoiceEmendation__Group__2 ;
    public final void rule__MultiChoiceEmendation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1272:1: ( rule__MultiChoiceEmendation__Group__1__Impl rule__MultiChoiceEmendation__Group__2 )
            // InternalEduTest.g:1273:2: rule__MultiChoiceEmendation__Group__1__Impl rule__MultiChoiceEmendation__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__MultiChoiceEmendation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoiceEmendation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmendation__Group__1"


    // $ANTLR start "rule__MultiChoiceEmendation__Group__1__Impl"
    // InternalEduTest.g:1280:1: rule__MultiChoiceEmendation__Group__1__Impl : ( ( rule__MultiChoiceEmendation__Group_1__0 )? ) ;
    public final void rule__MultiChoiceEmendation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1284:1: ( ( ( rule__MultiChoiceEmendation__Group_1__0 )? ) )
            // InternalEduTest.g:1285:1: ( ( rule__MultiChoiceEmendation__Group_1__0 )? )
            {
            // InternalEduTest.g:1285:1: ( ( rule__MultiChoiceEmendation__Group_1__0 )? )
            // InternalEduTest.g:1286:2: ( rule__MultiChoiceEmendation__Group_1__0 )?
            {
             before(grammarAccess.getMultiChoiceEmendationAccess().getGroup_1()); 
            // InternalEduTest.g:1287:2: ( rule__MultiChoiceEmendation__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalEduTest.g:1287:3: rule__MultiChoiceEmendation__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultiChoiceEmendation__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultiChoiceEmendationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmendation__Group__1__Impl"


    // $ANTLR start "rule__MultiChoiceEmendation__Group__2"
    // InternalEduTest.g:1295:1: rule__MultiChoiceEmendation__Group__2 : rule__MultiChoiceEmendation__Group__2__Impl rule__MultiChoiceEmendation__Group__3 ;
    public final void rule__MultiChoiceEmendation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1299:1: ( rule__MultiChoiceEmendation__Group__2__Impl rule__MultiChoiceEmendation__Group__3 )
            // InternalEduTest.g:1300:2: rule__MultiChoiceEmendation__Group__2__Impl rule__MultiChoiceEmendation__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__MultiChoiceEmendation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoiceEmendation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmendation__Group__2"


    // $ANTLR start "rule__MultiChoiceEmendation__Group__2__Impl"
    // InternalEduTest.g:1307:1: rule__MultiChoiceEmendation__Group__2__Impl : ( '{' ) ;
    public final void rule__MultiChoiceEmendation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1311:1: ( ( '{' ) )
            // InternalEduTest.g:1312:1: ( '{' )
            {
            // InternalEduTest.g:1312:1: ( '{' )
            // InternalEduTest.g:1313:2: '{'
            {
             before(grammarAccess.getMultiChoiceEmendationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMultiChoiceEmendationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmendation__Group__2__Impl"


    // $ANTLR start "rule__MultiChoiceEmendation__Group__3"
    // InternalEduTest.g:1322:1: rule__MultiChoiceEmendation__Group__3 : rule__MultiChoiceEmendation__Group__3__Impl rule__MultiChoiceEmendation__Group__4 ;
    public final void rule__MultiChoiceEmendation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1326:1: ( rule__MultiChoiceEmendation__Group__3__Impl rule__MultiChoiceEmendation__Group__4 )
            // InternalEduTest.g:1327:2: rule__MultiChoiceEmendation__Group__3__Impl rule__MultiChoiceEmendation__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__MultiChoiceEmendation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoiceEmendation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmendation__Group__3"


    // $ANTLR start "rule__MultiChoiceEmendation__Group__3__Impl"
    // InternalEduTest.g:1334:1: rule__MultiChoiceEmendation__Group__3__Impl : ( ( rule__MultiChoiceEmendation__ConfigAssignment_3 ) ) ;
    public final void rule__MultiChoiceEmendation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1338:1: ( ( ( rule__MultiChoiceEmendation__ConfigAssignment_3 ) ) )
            // InternalEduTest.g:1339:1: ( ( rule__MultiChoiceEmendation__ConfigAssignment_3 ) )
            {
            // InternalEduTest.g:1339:1: ( ( rule__MultiChoiceEmendation__ConfigAssignment_3 ) )
            // InternalEduTest.g:1340:2: ( rule__MultiChoiceEmendation__ConfigAssignment_3 )
            {
             before(grammarAccess.getMultiChoiceEmendationAccess().getConfigAssignment_3()); 
            // InternalEduTest.g:1341:2: ( rule__MultiChoiceEmendation__ConfigAssignment_3 )
            // InternalEduTest.g:1341:3: rule__MultiChoiceEmendation__ConfigAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MultiChoiceEmendation__ConfigAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMultiChoiceEmendationAccess().getConfigAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmendation__Group__3__Impl"


    // $ANTLR start "rule__MultiChoiceEmendation__Group__4"
    // InternalEduTest.g:1349:1: rule__MultiChoiceEmendation__Group__4 : rule__MultiChoiceEmendation__Group__4__Impl rule__MultiChoiceEmendation__Group__5 ;
    public final void rule__MultiChoiceEmendation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1353:1: ( rule__MultiChoiceEmendation__Group__4__Impl rule__MultiChoiceEmendation__Group__5 )
            // InternalEduTest.g:1354:2: rule__MultiChoiceEmendation__Group__4__Impl rule__MultiChoiceEmendation__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__MultiChoiceEmendation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoiceEmendation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmendation__Group__4"


    // $ANTLR start "rule__MultiChoiceEmendation__Group__4__Impl"
    // InternalEduTest.g:1361:1: rule__MultiChoiceEmendation__Group__4__Impl : ( ( rule__MultiChoiceEmendation__TestsAssignment_4 )* ) ;
    public final void rule__MultiChoiceEmendation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1365:1: ( ( ( rule__MultiChoiceEmendation__TestsAssignment_4 )* ) )
            // InternalEduTest.g:1366:1: ( ( rule__MultiChoiceEmendation__TestsAssignment_4 )* )
            {
            // InternalEduTest.g:1366:1: ( ( rule__MultiChoiceEmendation__TestsAssignment_4 )* )
            // InternalEduTest.g:1367:2: ( rule__MultiChoiceEmendation__TestsAssignment_4 )*
            {
             before(grammarAccess.getMultiChoiceEmendationAccess().getTestsAssignment_4()); 
            // InternalEduTest.g:1368:2: ( rule__MultiChoiceEmendation__TestsAssignment_4 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==37) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalEduTest.g:1368:3: rule__MultiChoiceEmendation__TestsAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__MultiChoiceEmendation__TestsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getMultiChoiceEmendationAccess().getTestsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmendation__Group__4__Impl"


    // $ANTLR start "rule__MultiChoiceEmendation__Group__5"
    // InternalEduTest.g:1376:1: rule__MultiChoiceEmendation__Group__5 : rule__MultiChoiceEmendation__Group__5__Impl ;
    public final void rule__MultiChoiceEmendation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1380:1: ( rule__MultiChoiceEmendation__Group__5__Impl )
            // InternalEduTest.g:1381:2: rule__MultiChoiceEmendation__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiChoiceEmendation__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmendation__Group__5"


    // $ANTLR start "rule__MultiChoiceEmendation__Group__5__Impl"
    // InternalEduTest.g:1387:1: rule__MultiChoiceEmendation__Group__5__Impl : ( '}' ) ;
    public final void rule__MultiChoiceEmendation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1391:1: ( ( '}' ) )
            // InternalEduTest.g:1392:1: ( '}' )
            {
            // InternalEduTest.g:1392:1: ( '}' )
            // InternalEduTest.g:1393:2: '}'
            {
             before(grammarAccess.getMultiChoiceEmendationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMultiChoiceEmendationAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmendation__Group__5__Impl"


    // $ANTLR start "rule__MultiChoiceEmendation__Group_1__0"
    // InternalEduTest.g:1403:1: rule__MultiChoiceEmendation__Group_1__0 : rule__MultiChoiceEmendation__Group_1__0__Impl rule__MultiChoiceEmendation__Group_1__1 ;
    public final void rule__MultiChoiceEmendation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1407:1: ( rule__MultiChoiceEmendation__Group_1__0__Impl rule__MultiChoiceEmendation__Group_1__1 )
            // InternalEduTest.g:1408:2: rule__MultiChoiceEmendation__Group_1__0__Impl rule__MultiChoiceEmendation__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__MultiChoiceEmendation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoiceEmendation__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmendation__Group_1__0"


    // $ANTLR start "rule__MultiChoiceEmendation__Group_1__0__Impl"
    // InternalEduTest.g:1415:1: rule__MultiChoiceEmendation__Group_1__0__Impl : ( ( rule__MultiChoiceEmendation__BlocksAssignment_1_0 ) ) ;
    public final void rule__MultiChoiceEmendation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1419:1: ( ( ( rule__MultiChoiceEmendation__BlocksAssignment_1_0 ) ) )
            // InternalEduTest.g:1420:1: ( ( rule__MultiChoiceEmendation__BlocksAssignment_1_0 ) )
            {
            // InternalEduTest.g:1420:1: ( ( rule__MultiChoiceEmendation__BlocksAssignment_1_0 ) )
            // InternalEduTest.g:1421:2: ( rule__MultiChoiceEmendation__BlocksAssignment_1_0 )
            {
             before(grammarAccess.getMultiChoiceEmendationAccess().getBlocksAssignment_1_0()); 
            // InternalEduTest.g:1422:2: ( rule__MultiChoiceEmendation__BlocksAssignment_1_0 )
            // InternalEduTest.g:1422:3: rule__MultiChoiceEmendation__BlocksAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MultiChoiceEmendation__BlocksAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiChoiceEmendationAccess().getBlocksAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmendation__Group_1__0__Impl"


    // $ANTLR start "rule__MultiChoiceEmendation__Group_1__1"
    // InternalEduTest.g:1430:1: rule__MultiChoiceEmendation__Group_1__1 : rule__MultiChoiceEmendation__Group_1__1__Impl ;
    public final void rule__MultiChoiceEmendation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1434:1: ( rule__MultiChoiceEmendation__Group_1__1__Impl )
            // InternalEduTest.g:1435:2: rule__MultiChoiceEmendation__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiChoiceEmendation__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmendation__Group_1__1"


    // $ANTLR start "rule__MultiChoiceEmendation__Group_1__1__Impl"
    // InternalEduTest.g:1441:1: rule__MultiChoiceEmendation__Group_1__1__Impl : ( ( rule__MultiChoiceEmendation__Group_1_1__0 )* ) ;
    public final void rule__MultiChoiceEmendation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1445:1: ( ( ( rule__MultiChoiceEmendation__Group_1_1__0 )* ) )
            // InternalEduTest.g:1446:1: ( ( rule__MultiChoiceEmendation__Group_1_1__0 )* )
            {
            // InternalEduTest.g:1446:1: ( ( rule__MultiChoiceEmendation__Group_1_1__0 )* )
            // InternalEduTest.g:1447:2: ( rule__MultiChoiceEmendation__Group_1_1__0 )*
            {
             before(grammarAccess.getMultiChoiceEmendationAccess().getGroup_1_1()); 
            // InternalEduTest.g:1448:2: ( rule__MultiChoiceEmendation__Group_1_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==26) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalEduTest.g:1448:3: rule__MultiChoiceEmendation__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__MultiChoiceEmendation__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getMultiChoiceEmendationAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmendation__Group_1__1__Impl"


    // $ANTLR start "rule__MultiChoiceEmendation__Group_1_1__0"
    // InternalEduTest.g:1457:1: rule__MultiChoiceEmendation__Group_1_1__0 : rule__MultiChoiceEmendation__Group_1_1__0__Impl rule__MultiChoiceEmendation__Group_1_1__1 ;
    public final void rule__MultiChoiceEmendation__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1461:1: ( rule__MultiChoiceEmendation__Group_1_1__0__Impl rule__MultiChoiceEmendation__Group_1_1__1 )
            // InternalEduTest.g:1462:2: rule__MultiChoiceEmendation__Group_1_1__0__Impl rule__MultiChoiceEmendation__Group_1_1__1
            {
            pushFollow(FOLLOW_11);
            rule__MultiChoiceEmendation__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoiceEmendation__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmendation__Group_1_1__0"


    // $ANTLR start "rule__MultiChoiceEmendation__Group_1_1__0__Impl"
    // InternalEduTest.g:1469:1: rule__MultiChoiceEmendation__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__MultiChoiceEmendation__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1473:1: ( ( ',' ) )
            // InternalEduTest.g:1474:1: ( ',' )
            {
            // InternalEduTest.g:1474:1: ( ',' )
            // InternalEduTest.g:1475:2: ','
            {
             before(grammarAccess.getMultiChoiceEmendationAccess().getCommaKeyword_1_1_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMultiChoiceEmendationAccess().getCommaKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmendation__Group_1_1__0__Impl"


    // $ANTLR start "rule__MultiChoiceEmendation__Group_1_1__1"
    // InternalEduTest.g:1484:1: rule__MultiChoiceEmendation__Group_1_1__1 : rule__MultiChoiceEmendation__Group_1_1__1__Impl ;
    public final void rule__MultiChoiceEmendation__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1488:1: ( rule__MultiChoiceEmendation__Group_1_1__1__Impl )
            // InternalEduTest.g:1489:2: rule__MultiChoiceEmendation__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiChoiceEmendation__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmendation__Group_1_1__1"


    // $ANTLR start "rule__MultiChoiceEmendation__Group_1_1__1__Impl"
    // InternalEduTest.g:1495:1: rule__MultiChoiceEmendation__Group_1_1__1__Impl : ( ( rule__MultiChoiceEmendation__BlocksAssignment_1_1_1 ) ) ;
    public final void rule__MultiChoiceEmendation__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1499:1: ( ( ( rule__MultiChoiceEmendation__BlocksAssignment_1_1_1 ) ) )
            // InternalEduTest.g:1500:1: ( ( rule__MultiChoiceEmendation__BlocksAssignment_1_1_1 ) )
            {
            // InternalEduTest.g:1500:1: ( ( rule__MultiChoiceEmendation__BlocksAssignment_1_1_1 ) )
            // InternalEduTest.g:1501:2: ( rule__MultiChoiceEmendation__BlocksAssignment_1_1_1 )
            {
             before(grammarAccess.getMultiChoiceEmendationAccess().getBlocksAssignment_1_1_1()); 
            // InternalEduTest.g:1502:2: ( rule__MultiChoiceEmendation__BlocksAssignment_1_1_1 )
            // InternalEduTest.g:1502:3: rule__MultiChoiceEmendation__BlocksAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MultiChoiceEmendation__BlocksAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiChoiceEmendationAccess().getBlocksAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmendation__Group_1_1__1__Impl"


    // $ANTLR start "rule__MatchPairs__Group__0"
    // InternalEduTest.g:1511:1: rule__MatchPairs__Group__0 : rule__MatchPairs__Group__0__Impl rule__MatchPairs__Group__1 ;
    public final void rule__MatchPairs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1515:1: ( rule__MatchPairs__Group__0__Impl rule__MatchPairs__Group__1 )
            // InternalEduTest.g:1516:2: rule__MatchPairs__Group__0__Impl rule__MatchPairs__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__MatchPairs__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchPairs__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchPairs__Group__0"


    // $ANTLR start "rule__MatchPairs__Group__0__Impl"
    // InternalEduTest.g:1523:1: rule__MatchPairs__Group__0__Impl : ( 'MatchPairs' ) ;
    public final void rule__MatchPairs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1527:1: ( ( 'MatchPairs' ) )
            // InternalEduTest.g:1528:1: ( 'MatchPairs' )
            {
            // InternalEduTest.g:1528:1: ( 'MatchPairs' )
            // InternalEduTest.g:1529:2: 'MatchPairs'
            {
             before(grammarAccess.getMatchPairsAccess().getMatchPairsKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMatchPairsAccess().getMatchPairsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchPairs__Group__0__Impl"


    // $ANTLR start "rule__MatchPairs__Group__1"
    // InternalEduTest.g:1538:1: rule__MatchPairs__Group__1 : rule__MatchPairs__Group__1__Impl rule__MatchPairs__Group__2 ;
    public final void rule__MatchPairs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1542:1: ( rule__MatchPairs__Group__1__Impl rule__MatchPairs__Group__2 )
            // InternalEduTest.g:1543:2: rule__MatchPairs__Group__1__Impl rule__MatchPairs__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__MatchPairs__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchPairs__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchPairs__Group__1"


    // $ANTLR start "rule__MatchPairs__Group__1__Impl"
    // InternalEduTest.g:1550:1: rule__MatchPairs__Group__1__Impl : ( ( rule__MatchPairs__Group_1__0 )? ) ;
    public final void rule__MatchPairs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1554:1: ( ( ( rule__MatchPairs__Group_1__0 )? ) )
            // InternalEduTest.g:1555:1: ( ( rule__MatchPairs__Group_1__0 )? )
            {
            // InternalEduTest.g:1555:1: ( ( rule__MatchPairs__Group_1__0 )? )
            // InternalEduTest.g:1556:2: ( rule__MatchPairs__Group_1__0 )?
            {
             before(grammarAccess.getMatchPairsAccess().getGroup_1()); 
            // InternalEduTest.g:1557:2: ( rule__MatchPairs__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalEduTest.g:1557:3: rule__MatchPairs__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MatchPairs__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMatchPairsAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchPairs__Group__1__Impl"


    // $ANTLR start "rule__MatchPairs__Group__2"
    // InternalEduTest.g:1565:1: rule__MatchPairs__Group__2 : rule__MatchPairs__Group__2__Impl rule__MatchPairs__Group__3 ;
    public final void rule__MatchPairs__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1569:1: ( rule__MatchPairs__Group__2__Impl rule__MatchPairs__Group__3 )
            // InternalEduTest.g:1570:2: rule__MatchPairs__Group__2__Impl rule__MatchPairs__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__MatchPairs__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchPairs__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchPairs__Group__2"


    // $ANTLR start "rule__MatchPairs__Group__2__Impl"
    // InternalEduTest.g:1577:1: rule__MatchPairs__Group__2__Impl : ( '{' ) ;
    public final void rule__MatchPairs__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1581:1: ( ( '{' ) )
            // InternalEduTest.g:1582:1: ( '{' )
            {
            // InternalEduTest.g:1582:1: ( '{' )
            // InternalEduTest.g:1583:2: '{'
            {
             before(grammarAccess.getMatchPairsAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMatchPairsAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchPairs__Group__2__Impl"


    // $ANTLR start "rule__MatchPairs__Group__3"
    // InternalEduTest.g:1592:1: rule__MatchPairs__Group__3 : rule__MatchPairs__Group__3__Impl rule__MatchPairs__Group__4 ;
    public final void rule__MatchPairs__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1596:1: ( rule__MatchPairs__Group__3__Impl rule__MatchPairs__Group__4 )
            // InternalEduTest.g:1597:2: rule__MatchPairs__Group__3__Impl rule__MatchPairs__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__MatchPairs__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchPairs__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchPairs__Group__3"


    // $ANTLR start "rule__MatchPairs__Group__3__Impl"
    // InternalEduTest.g:1604:1: rule__MatchPairs__Group__3__Impl : ( ( rule__MatchPairs__ConfigAssignment_3 ) ) ;
    public final void rule__MatchPairs__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1608:1: ( ( ( rule__MatchPairs__ConfigAssignment_3 ) ) )
            // InternalEduTest.g:1609:1: ( ( rule__MatchPairs__ConfigAssignment_3 ) )
            {
            // InternalEduTest.g:1609:1: ( ( rule__MatchPairs__ConfigAssignment_3 ) )
            // InternalEduTest.g:1610:2: ( rule__MatchPairs__ConfigAssignment_3 )
            {
             before(grammarAccess.getMatchPairsAccess().getConfigAssignment_3()); 
            // InternalEduTest.g:1611:2: ( rule__MatchPairs__ConfigAssignment_3 )
            // InternalEduTest.g:1611:3: rule__MatchPairs__ConfigAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MatchPairs__ConfigAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMatchPairsAccess().getConfigAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchPairs__Group__3__Impl"


    // $ANTLR start "rule__MatchPairs__Group__4"
    // InternalEduTest.g:1619:1: rule__MatchPairs__Group__4 : rule__MatchPairs__Group__4__Impl rule__MatchPairs__Group__5 ;
    public final void rule__MatchPairs__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1623:1: ( rule__MatchPairs__Group__4__Impl rule__MatchPairs__Group__5 )
            // InternalEduTest.g:1624:2: rule__MatchPairs__Group__4__Impl rule__MatchPairs__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__MatchPairs__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchPairs__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchPairs__Group__4"


    // $ANTLR start "rule__MatchPairs__Group__4__Impl"
    // InternalEduTest.g:1631:1: rule__MatchPairs__Group__4__Impl : ( ( rule__MatchPairs__TestsAssignment_4 )* ) ;
    public final void rule__MatchPairs__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1635:1: ( ( ( rule__MatchPairs__TestsAssignment_4 )* ) )
            // InternalEduTest.g:1636:1: ( ( rule__MatchPairs__TestsAssignment_4 )* )
            {
            // InternalEduTest.g:1636:1: ( ( rule__MatchPairs__TestsAssignment_4 )* )
            // InternalEduTest.g:1637:2: ( rule__MatchPairs__TestsAssignment_4 )*
            {
             before(grammarAccess.getMatchPairsAccess().getTestsAssignment_4()); 
            // InternalEduTest.g:1638:2: ( rule__MatchPairs__TestsAssignment_4 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==37) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalEduTest.g:1638:3: rule__MatchPairs__TestsAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__MatchPairs__TestsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getMatchPairsAccess().getTestsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchPairs__Group__4__Impl"


    // $ANTLR start "rule__MatchPairs__Group__5"
    // InternalEduTest.g:1646:1: rule__MatchPairs__Group__5 : rule__MatchPairs__Group__5__Impl ;
    public final void rule__MatchPairs__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1650:1: ( rule__MatchPairs__Group__5__Impl )
            // InternalEduTest.g:1651:2: rule__MatchPairs__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MatchPairs__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchPairs__Group__5"


    // $ANTLR start "rule__MatchPairs__Group__5__Impl"
    // InternalEduTest.g:1657:1: rule__MatchPairs__Group__5__Impl : ( '}' ) ;
    public final void rule__MatchPairs__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1661:1: ( ( '}' ) )
            // InternalEduTest.g:1662:1: ( '}' )
            {
            // InternalEduTest.g:1662:1: ( '}' )
            // InternalEduTest.g:1663:2: '}'
            {
             before(grammarAccess.getMatchPairsAccess().getRightCurlyBracketKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMatchPairsAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchPairs__Group__5__Impl"


    // $ANTLR start "rule__MatchPairs__Group_1__0"
    // InternalEduTest.g:1673:1: rule__MatchPairs__Group_1__0 : rule__MatchPairs__Group_1__0__Impl rule__MatchPairs__Group_1__1 ;
    public final void rule__MatchPairs__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1677:1: ( rule__MatchPairs__Group_1__0__Impl rule__MatchPairs__Group_1__1 )
            // InternalEduTest.g:1678:2: rule__MatchPairs__Group_1__0__Impl rule__MatchPairs__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__MatchPairs__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchPairs__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchPairs__Group_1__0"


    // $ANTLR start "rule__MatchPairs__Group_1__0__Impl"
    // InternalEduTest.g:1685:1: rule__MatchPairs__Group_1__0__Impl : ( ( rule__MatchPairs__BlocksAssignment_1_0 ) ) ;
    public final void rule__MatchPairs__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1689:1: ( ( ( rule__MatchPairs__BlocksAssignment_1_0 ) ) )
            // InternalEduTest.g:1690:1: ( ( rule__MatchPairs__BlocksAssignment_1_0 ) )
            {
            // InternalEduTest.g:1690:1: ( ( rule__MatchPairs__BlocksAssignment_1_0 ) )
            // InternalEduTest.g:1691:2: ( rule__MatchPairs__BlocksAssignment_1_0 )
            {
             before(grammarAccess.getMatchPairsAccess().getBlocksAssignment_1_0()); 
            // InternalEduTest.g:1692:2: ( rule__MatchPairs__BlocksAssignment_1_0 )
            // InternalEduTest.g:1692:3: rule__MatchPairs__BlocksAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MatchPairs__BlocksAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMatchPairsAccess().getBlocksAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchPairs__Group_1__0__Impl"


    // $ANTLR start "rule__MatchPairs__Group_1__1"
    // InternalEduTest.g:1700:1: rule__MatchPairs__Group_1__1 : rule__MatchPairs__Group_1__1__Impl ;
    public final void rule__MatchPairs__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1704:1: ( rule__MatchPairs__Group_1__1__Impl )
            // InternalEduTest.g:1705:2: rule__MatchPairs__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MatchPairs__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchPairs__Group_1__1"


    // $ANTLR start "rule__MatchPairs__Group_1__1__Impl"
    // InternalEduTest.g:1711:1: rule__MatchPairs__Group_1__1__Impl : ( ( rule__MatchPairs__Group_1_1__0 )* ) ;
    public final void rule__MatchPairs__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1715:1: ( ( ( rule__MatchPairs__Group_1_1__0 )* ) )
            // InternalEduTest.g:1716:1: ( ( rule__MatchPairs__Group_1_1__0 )* )
            {
            // InternalEduTest.g:1716:1: ( ( rule__MatchPairs__Group_1_1__0 )* )
            // InternalEduTest.g:1717:2: ( rule__MatchPairs__Group_1_1__0 )*
            {
             before(grammarAccess.getMatchPairsAccess().getGroup_1_1()); 
            // InternalEduTest.g:1718:2: ( rule__MatchPairs__Group_1_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==26) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalEduTest.g:1718:3: rule__MatchPairs__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__MatchPairs__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getMatchPairsAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchPairs__Group_1__1__Impl"


    // $ANTLR start "rule__MatchPairs__Group_1_1__0"
    // InternalEduTest.g:1727:1: rule__MatchPairs__Group_1_1__0 : rule__MatchPairs__Group_1_1__0__Impl rule__MatchPairs__Group_1_1__1 ;
    public final void rule__MatchPairs__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1731:1: ( rule__MatchPairs__Group_1_1__0__Impl rule__MatchPairs__Group_1_1__1 )
            // InternalEduTest.g:1732:2: rule__MatchPairs__Group_1_1__0__Impl rule__MatchPairs__Group_1_1__1
            {
            pushFollow(FOLLOW_11);
            rule__MatchPairs__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchPairs__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchPairs__Group_1_1__0"


    // $ANTLR start "rule__MatchPairs__Group_1_1__0__Impl"
    // InternalEduTest.g:1739:1: rule__MatchPairs__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__MatchPairs__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1743:1: ( ( ',' ) )
            // InternalEduTest.g:1744:1: ( ',' )
            {
            // InternalEduTest.g:1744:1: ( ',' )
            // InternalEduTest.g:1745:2: ','
            {
             before(grammarAccess.getMatchPairsAccess().getCommaKeyword_1_1_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMatchPairsAccess().getCommaKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchPairs__Group_1_1__0__Impl"


    // $ANTLR start "rule__MatchPairs__Group_1_1__1"
    // InternalEduTest.g:1754:1: rule__MatchPairs__Group_1_1__1 : rule__MatchPairs__Group_1_1__1__Impl ;
    public final void rule__MatchPairs__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1758:1: ( rule__MatchPairs__Group_1_1__1__Impl )
            // InternalEduTest.g:1759:2: rule__MatchPairs__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MatchPairs__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchPairs__Group_1_1__1"


    // $ANTLR start "rule__MatchPairs__Group_1_1__1__Impl"
    // InternalEduTest.g:1765:1: rule__MatchPairs__Group_1_1__1__Impl : ( ( rule__MatchPairs__BlocksAssignment_1_1_1 ) ) ;
    public final void rule__MatchPairs__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1769:1: ( ( ( rule__MatchPairs__BlocksAssignment_1_1_1 ) ) )
            // InternalEduTest.g:1770:1: ( ( rule__MatchPairs__BlocksAssignment_1_1_1 ) )
            {
            // InternalEduTest.g:1770:1: ( ( rule__MatchPairs__BlocksAssignment_1_1_1 ) )
            // InternalEduTest.g:1771:2: ( rule__MatchPairs__BlocksAssignment_1_1_1 )
            {
             before(grammarAccess.getMatchPairsAccess().getBlocksAssignment_1_1_1()); 
            // InternalEduTest.g:1772:2: ( rule__MatchPairs__BlocksAssignment_1_1_1 )
            // InternalEduTest.g:1772:3: rule__MatchPairs__BlocksAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MatchPairs__BlocksAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMatchPairsAccess().getBlocksAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchPairs__Group_1_1__1__Impl"


    // $ANTLR start "rule__ProgramConfiguration__Group__0"
    // InternalEduTest.g:1781:1: rule__ProgramConfiguration__Group__0 : rule__ProgramConfiguration__Group__0__Impl rule__ProgramConfiguration__Group__1 ;
    public final void rule__ProgramConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1785:1: ( rule__ProgramConfiguration__Group__0__Impl rule__ProgramConfiguration__Group__1 )
            // InternalEduTest.g:1786:2: rule__ProgramConfiguration__Group__0__Impl rule__ProgramConfiguration__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__ProgramConfiguration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProgramConfiguration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgramConfiguration__Group__0"


    // $ANTLR start "rule__ProgramConfiguration__Group__0__Impl"
    // InternalEduTest.g:1793:1: rule__ProgramConfiguration__Group__0__Impl : ( 'navigation' ) ;
    public final void rule__ProgramConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1797:1: ( ( 'navigation' ) )
            // InternalEduTest.g:1798:1: ( 'navigation' )
            {
            // InternalEduTest.g:1798:1: ( 'navigation' )
            // InternalEduTest.g:1799:2: 'navigation'
            {
             before(grammarAccess.getProgramConfigurationAccess().getNavigationKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getProgramConfigurationAccess().getNavigationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgramConfiguration__Group__0__Impl"


    // $ANTLR start "rule__ProgramConfiguration__Group__1"
    // InternalEduTest.g:1808:1: rule__ProgramConfiguration__Group__1 : rule__ProgramConfiguration__Group__1__Impl rule__ProgramConfiguration__Group__2 ;
    public final void rule__ProgramConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1812:1: ( rule__ProgramConfiguration__Group__1__Impl rule__ProgramConfiguration__Group__2 )
            // InternalEduTest.g:1813:2: rule__ProgramConfiguration__Group__1__Impl rule__ProgramConfiguration__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__ProgramConfiguration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProgramConfiguration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgramConfiguration__Group__1"


    // $ANTLR start "rule__ProgramConfiguration__Group__1__Impl"
    // InternalEduTest.g:1820:1: rule__ProgramConfiguration__Group__1__Impl : ( '=' ) ;
    public final void rule__ProgramConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1824:1: ( ( '=' ) )
            // InternalEduTest.g:1825:1: ( '=' )
            {
            // InternalEduTest.g:1825:1: ( '=' )
            // InternalEduTest.g:1826:2: '='
            {
             before(grammarAccess.getProgramConfigurationAccess().getEqualsSignKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getProgramConfigurationAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgramConfiguration__Group__1__Impl"


    // $ANTLR start "rule__ProgramConfiguration__Group__2"
    // InternalEduTest.g:1835:1: rule__ProgramConfiguration__Group__2 : rule__ProgramConfiguration__Group__2__Impl ;
    public final void rule__ProgramConfiguration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1839:1: ( rule__ProgramConfiguration__Group__2__Impl )
            // InternalEduTest.g:1840:2: rule__ProgramConfiguration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProgramConfiguration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgramConfiguration__Group__2"


    // $ANTLR start "rule__ProgramConfiguration__Group__2__Impl"
    // InternalEduTest.g:1846:1: rule__ProgramConfiguration__Group__2__Impl : ( ( rule__ProgramConfiguration__NavigationAssignment_2 ) ) ;
    public final void rule__ProgramConfiguration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1850:1: ( ( ( rule__ProgramConfiguration__NavigationAssignment_2 ) ) )
            // InternalEduTest.g:1851:1: ( ( rule__ProgramConfiguration__NavigationAssignment_2 ) )
            {
            // InternalEduTest.g:1851:1: ( ( rule__ProgramConfiguration__NavigationAssignment_2 ) )
            // InternalEduTest.g:1852:2: ( rule__ProgramConfiguration__NavigationAssignment_2 )
            {
             before(grammarAccess.getProgramConfigurationAccess().getNavigationAssignment_2()); 
            // InternalEduTest.g:1853:2: ( rule__ProgramConfiguration__NavigationAssignment_2 )
            // InternalEduTest.g:1853:3: rule__ProgramConfiguration__NavigationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ProgramConfiguration__NavigationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProgramConfigurationAccess().getNavigationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgramConfiguration__Group__2__Impl"


    // $ANTLR start "rule__TestConfiguration__Group__0"
    // InternalEduTest.g:1862:1: rule__TestConfiguration__Group__0 : rule__TestConfiguration__Group__0__Impl rule__TestConfiguration__Group__1 ;
    public final void rule__TestConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1866:1: ( rule__TestConfiguration__Group__0__Impl rule__TestConfiguration__Group__1 )
            // InternalEduTest.g:1867:2: rule__TestConfiguration__Group__0__Impl rule__TestConfiguration__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__TestConfiguration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TestConfiguration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestConfiguration__Group__0"


    // $ANTLR start "rule__TestConfiguration__Group__0__Impl"
    // InternalEduTest.g:1874:1: rule__TestConfiguration__Group__0__Impl : ( () ) ;
    public final void rule__TestConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1878:1: ( ( () ) )
            // InternalEduTest.g:1879:1: ( () )
            {
            // InternalEduTest.g:1879:1: ( () )
            // InternalEduTest.g:1880:2: ()
            {
             before(grammarAccess.getTestConfigurationAccess().getTestConfigurationAction_0()); 
            // InternalEduTest.g:1881:2: ()
            // InternalEduTest.g:1881:3: 
            {
            }

             after(grammarAccess.getTestConfigurationAccess().getTestConfigurationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestConfiguration__Group__0__Impl"


    // $ANTLR start "rule__TestConfiguration__Group__1"
    // InternalEduTest.g:1889:1: rule__TestConfiguration__Group__1 : rule__TestConfiguration__Group__1__Impl rule__TestConfiguration__Group__2 ;
    public final void rule__TestConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1893:1: ( rule__TestConfiguration__Group__1__Impl rule__TestConfiguration__Group__2 )
            // InternalEduTest.g:1894:2: rule__TestConfiguration__Group__1__Impl rule__TestConfiguration__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__TestConfiguration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TestConfiguration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestConfiguration__Group__1"


    // $ANTLR start "rule__TestConfiguration__Group__1__Impl"
    // InternalEduTest.g:1901:1: rule__TestConfiguration__Group__1__Impl : ( 'retry' ) ;
    public final void rule__TestConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1905:1: ( ( 'retry' ) )
            // InternalEduTest.g:1906:1: ( 'retry' )
            {
            // InternalEduTest.g:1906:1: ( 'retry' )
            // InternalEduTest.g:1907:2: 'retry'
            {
             before(grammarAccess.getTestConfigurationAccess().getRetryKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTestConfigurationAccess().getRetryKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestConfiguration__Group__1__Impl"


    // $ANTLR start "rule__TestConfiguration__Group__2"
    // InternalEduTest.g:1916:1: rule__TestConfiguration__Group__2 : rule__TestConfiguration__Group__2__Impl rule__TestConfiguration__Group__3 ;
    public final void rule__TestConfiguration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1920:1: ( rule__TestConfiguration__Group__2__Impl rule__TestConfiguration__Group__3 )
            // InternalEduTest.g:1921:2: rule__TestConfiguration__Group__2__Impl rule__TestConfiguration__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__TestConfiguration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TestConfiguration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestConfiguration__Group__2"


    // $ANTLR start "rule__TestConfiguration__Group__2__Impl"
    // InternalEduTest.g:1928:1: rule__TestConfiguration__Group__2__Impl : ( '=' ) ;
    public final void rule__TestConfiguration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1932:1: ( ( '=' ) )
            // InternalEduTest.g:1933:1: ( '=' )
            {
            // InternalEduTest.g:1933:1: ( '=' )
            // InternalEduTest.g:1934:2: '='
            {
             before(grammarAccess.getTestConfigurationAccess().getEqualsSignKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTestConfigurationAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestConfiguration__Group__2__Impl"


    // $ANTLR start "rule__TestConfiguration__Group__3"
    // InternalEduTest.g:1943:1: rule__TestConfiguration__Group__3 : rule__TestConfiguration__Group__3__Impl ;
    public final void rule__TestConfiguration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1947:1: ( rule__TestConfiguration__Group__3__Impl )
            // InternalEduTest.g:1948:2: rule__TestConfiguration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TestConfiguration__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestConfiguration__Group__3"


    // $ANTLR start "rule__TestConfiguration__Group__3__Impl"
    // InternalEduTest.g:1954:1: rule__TestConfiguration__Group__3__Impl : ( ( rule__TestConfiguration__RetryAssignment_3 ) ) ;
    public final void rule__TestConfiguration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1958:1: ( ( ( rule__TestConfiguration__RetryAssignment_3 ) ) )
            // InternalEduTest.g:1959:1: ( ( rule__TestConfiguration__RetryAssignment_3 ) )
            {
            // InternalEduTest.g:1959:1: ( ( rule__TestConfiguration__RetryAssignment_3 ) )
            // InternalEduTest.g:1960:2: ( rule__TestConfiguration__RetryAssignment_3 )
            {
             before(grammarAccess.getTestConfigurationAccess().getRetryAssignment_3()); 
            // InternalEduTest.g:1961:2: ( rule__TestConfiguration__RetryAssignment_3 )
            // InternalEduTest.g:1961:3: rule__TestConfiguration__RetryAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TestConfiguration__RetryAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTestConfigurationAccess().getRetryAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestConfiguration__Group__3__Impl"


    // $ANTLR start "rule__MultiChoiceEmConfig__Group__0"
    // InternalEduTest.g:1970:1: rule__MultiChoiceEmConfig__Group__0 : rule__MultiChoiceEmConfig__Group__0__Impl rule__MultiChoiceEmConfig__Group__1 ;
    public final void rule__MultiChoiceEmConfig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1974:1: ( rule__MultiChoiceEmConfig__Group__0__Impl rule__MultiChoiceEmConfig__Group__1 )
            // InternalEduTest.g:1975:2: rule__MultiChoiceEmConfig__Group__0__Impl rule__MultiChoiceEmConfig__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__MultiChoiceEmConfig__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoiceEmConfig__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmConfig__Group__0"


    // $ANTLR start "rule__MultiChoiceEmConfig__Group__0__Impl"
    // InternalEduTest.g:1982:1: rule__MultiChoiceEmConfig__Group__0__Impl : ( () ) ;
    public final void rule__MultiChoiceEmConfig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:1986:1: ( ( () ) )
            // InternalEduTest.g:1987:1: ( () )
            {
            // InternalEduTest.g:1987:1: ( () )
            // InternalEduTest.g:1988:2: ()
            {
             before(grammarAccess.getMultiChoiceEmConfigAccess().getMultiChoiceEmConfigAction_0()); 
            // InternalEduTest.g:1989:2: ()
            // InternalEduTest.g:1989:3: 
            {
            }

             after(grammarAccess.getMultiChoiceEmConfigAccess().getMultiChoiceEmConfigAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmConfig__Group__0__Impl"


    // $ANTLR start "rule__MultiChoiceEmConfig__Group__1"
    // InternalEduTest.g:1997:1: rule__MultiChoiceEmConfig__Group__1 : rule__MultiChoiceEmConfig__Group__1__Impl rule__MultiChoiceEmConfig__Group__2 ;
    public final void rule__MultiChoiceEmConfig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2001:1: ( rule__MultiChoiceEmConfig__Group__1__Impl rule__MultiChoiceEmConfig__Group__2 )
            // InternalEduTest.g:2002:2: rule__MultiChoiceEmConfig__Group__1__Impl rule__MultiChoiceEmConfig__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__MultiChoiceEmConfig__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoiceEmConfig__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmConfig__Group__1"


    // $ANTLR start "rule__MultiChoiceEmConfig__Group__1__Impl"
    // InternalEduTest.g:2009:1: rule__MultiChoiceEmConfig__Group__1__Impl : ( 'retry' ) ;
    public final void rule__MultiChoiceEmConfig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2013:1: ( ( 'retry' ) )
            // InternalEduTest.g:2014:1: ( 'retry' )
            {
            // InternalEduTest.g:2014:1: ( 'retry' )
            // InternalEduTest.g:2015:2: 'retry'
            {
             before(grammarAccess.getMultiChoiceEmConfigAccess().getRetryKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMultiChoiceEmConfigAccess().getRetryKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmConfig__Group__1__Impl"


    // $ANTLR start "rule__MultiChoiceEmConfig__Group__2"
    // InternalEduTest.g:2024:1: rule__MultiChoiceEmConfig__Group__2 : rule__MultiChoiceEmConfig__Group__2__Impl rule__MultiChoiceEmConfig__Group__3 ;
    public final void rule__MultiChoiceEmConfig__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2028:1: ( rule__MultiChoiceEmConfig__Group__2__Impl rule__MultiChoiceEmConfig__Group__3 )
            // InternalEduTest.g:2029:2: rule__MultiChoiceEmConfig__Group__2__Impl rule__MultiChoiceEmConfig__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__MultiChoiceEmConfig__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoiceEmConfig__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmConfig__Group__2"


    // $ANTLR start "rule__MultiChoiceEmConfig__Group__2__Impl"
    // InternalEduTest.g:2036:1: rule__MultiChoiceEmConfig__Group__2__Impl : ( '=' ) ;
    public final void rule__MultiChoiceEmConfig__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2040:1: ( ( '=' ) )
            // InternalEduTest.g:2041:1: ( '=' )
            {
            // InternalEduTest.g:2041:1: ( '=' )
            // InternalEduTest.g:2042:2: '='
            {
             before(grammarAccess.getMultiChoiceEmConfigAccess().getEqualsSignKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMultiChoiceEmConfigAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmConfig__Group__2__Impl"


    // $ANTLR start "rule__MultiChoiceEmConfig__Group__3"
    // InternalEduTest.g:2051:1: rule__MultiChoiceEmConfig__Group__3 : rule__MultiChoiceEmConfig__Group__3__Impl rule__MultiChoiceEmConfig__Group__4 ;
    public final void rule__MultiChoiceEmConfig__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2055:1: ( rule__MultiChoiceEmConfig__Group__3__Impl rule__MultiChoiceEmConfig__Group__4 )
            // InternalEduTest.g:2056:2: rule__MultiChoiceEmConfig__Group__3__Impl rule__MultiChoiceEmConfig__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__MultiChoiceEmConfig__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoiceEmConfig__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmConfig__Group__3"


    // $ANTLR start "rule__MultiChoiceEmConfig__Group__3__Impl"
    // InternalEduTest.g:2063:1: rule__MultiChoiceEmConfig__Group__3__Impl : ( ( rule__MultiChoiceEmConfig__RetryAssignment_3 ) ) ;
    public final void rule__MultiChoiceEmConfig__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2067:1: ( ( ( rule__MultiChoiceEmConfig__RetryAssignment_3 ) ) )
            // InternalEduTest.g:2068:1: ( ( rule__MultiChoiceEmConfig__RetryAssignment_3 ) )
            {
            // InternalEduTest.g:2068:1: ( ( rule__MultiChoiceEmConfig__RetryAssignment_3 ) )
            // InternalEduTest.g:2069:2: ( rule__MultiChoiceEmConfig__RetryAssignment_3 )
            {
             before(grammarAccess.getMultiChoiceEmConfigAccess().getRetryAssignment_3()); 
            // InternalEduTest.g:2070:2: ( rule__MultiChoiceEmConfig__RetryAssignment_3 )
            // InternalEduTest.g:2070:3: rule__MultiChoiceEmConfig__RetryAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MultiChoiceEmConfig__RetryAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMultiChoiceEmConfigAccess().getRetryAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmConfig__Group__3__Impl"


    // $ANTLR start "rule__MultiChoiceEmConfig__Group__4"
    // InternalEduTest.g:2078:1: rule__MultiChoiceEmConfig__Group__4 : rule__MultiChoiceEmConfig__Group__4__Impl rule__MultiChoiceEmConfig__Group__5 ;
    public final void rule__MultiChoiceEmConfig__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2082:1: ( rule__MultiChoiceEmConfig__Group__4__Impl rule__MultiChoiceEmConfig__Group__5 )
            // InternalEduTest.g:2083:2: rule__MultiChoiceEmConfig__Group__4__Impl rule__MultiChoiceEmConfig__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__MultiChoiceEmConfig__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoiceEmConfig__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmConfig__Group__4"


    // $ANTLR start "rule__MultiChoiceEmConfig__Group__4__Impl"
    // InternalEduTest.g:2090:1: rule__MultiChoiceEmConfig__Group__4__Impl : ( ',' ) ;
    public final void rule__MultiChoiceEmConfig__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2094:1: ( ( ',' ) )
            // InternalEduTest.g:2095:1: ( ',' )
            {
            // InternalEduTest.g:2095:1: ( ',' )
            // InternalEduTest.g:2096:2: ','
            {
             before(grammarAccess.getMultiChoiceEmConfigAccess().getCommaKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMultiChoiceEmConfigAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmConfig__Group__4__Impl"


    // $ANTLR start "rule__MultiChoiceEmConfig__Group__5"
    // InternalEduTest.g:2105:1: rule__MultiChoiceEmConfig__Group__5 : rule__MultiChoiceEmConfig__Group__5__Impl rule__MultiChoiceEmConfig__Group__6 ;
    public final void rule__MultiChoiceEmConfig__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2109:1: ( rule__MultiChoiceEmConfig__Group__5__Impl rule__MultiChoiceEmConfig__Group__6 )
            // InternalEduTest.g:2110:2: rule__MultiChoiceEmConfig__Group__5__Impl rule__MultiChoiceEmConfig__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__MultiChoiceEmConfig__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoiceEmConfig__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmConfig__Group__5"


    // $ANTLR start "rule__MultiChoiceEmConfig__Group__5__Impl"
    // InternalEduTest.g:2117:1: rule__MultiChoiceEmConfig__Group__5__Impl : ( 'weighted' ) ;
    public final void rule__MultiChoiceEmConfig__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2121:1: ( ( 'weighted' ) )
            // InternalEduTest.g:2122:1: ( 'weighted' )
            {
            // InternalEduTest.g:2122:1: ( 'weighted' )
            // InternalEduTest.g:2123:2: 'weighted'
            {
             before(grammarAccess.getMultiChoiceEmConfigAccess().getWeightedKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getMultiChoiceEmConfigAccess().getWeightedKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmConfig__Group__5__Impl"


    // $ANTLR start "rule__MultiChoiceEmConfig__Group__6"
    // InternalEduTest.g:2132:1: rule__MultiChoiceEmConfig__Group__6 : rule__MultiChoiceEmConfig__Group__6__Impl rule__MultiChoiceEmConfig__Group__7 ;
    public final void rule__MultiChoiceEmConfig__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2136:1: ( rule__MultiChoiceEmConfig__Group__6__Impl rule__MultiChoiceEmConfig__Group__7 )
            // InternalEduTest.g:2137:2: rule__MultiChoiceEmConfig__Group__6__Impl rule__MultiChoiceEmConfig__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__MultiChoiceEmConfig__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoiceEmConfig__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmConfig__Group__6"


    // $ANTLR start "rule__MultiChoiceEmConfig__Group__6__Impl"
    // InternalEduTest.g:2144:1: rule__MultiChoiceEmConfig__Group__6__Impl : ( '=' ) ;
    public final void rule__MultiChoiceEmConfig__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2148:1: ( ( '=' ) )
            // InternalEduTest.g:2149:1: ( '=' )
            {
            // InternalEduTest.g:2149:1: ( '=' )
            // InternalEduTest.g:2150:2: '='
            {
             before(grammarAccess.getMultiChoiceEmConfigAccess().getEqualsSignKeyword_6()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMultiChoiceEmConfigAccess().getEqualsSignKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmConfig__Group__6__Impl"


    // $ANTLR start "rule__MultiChoiceEmConfig__Group__7"
    // InternalEduTest.g:2159:1: rule__MultiChoiceEmConfig__Group__7 : rule__MultiChoiceEmConfig__Group__7__Impl rule__MultiChoiceEmConfig__Group__8 ;
    public final void rule__MultiChoiceEmConfig__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2163:1: ( rule__MultiChoiceEmConfig__Group__7__Impl rule__MultiChoiceEmConfig__Group__8 )
            // InternalEduTest.g:2164:2: rule__MultiChoiceEmConfig__Group__7__Impl rule__MultiChoiceEmConfig__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__MultiChoiceEmConfig__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoiceEmConfig__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmConfig__Group__7"


    // $ANTLR start "rule__MultiChoiceEmConfig__Group__7__Impl"
    // InternalEduTest.g:2171:1: rule__MultiChoiceEmConfig__Group__7__Impl : ( ( rule__MultiChoiceEmConfig__WeightedAssignment_7 ) ) ;
    public final void rule__MultiChoiceEmConfig__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2175:1: ( ( ( rule__MultiChoiceEmConfig__WeightedAssignment_7 ) ) )
            // InternalEduTest.g:2176:1: ( ( rule__MultiChoiceEmConfig__WeightedAssignment_7 ) )
            {
            // InternalEduTest.g:2176:1: ( ( rule__MultiChoiceEmConfig__WeightedAssignment_7 ) )
            // InternalEduTest.g:2177:2: ( rule__MultiChoiceEmConfig__WeightedAssignment_7 )
            {
             before(grammarAccess.getMultiChoiceEmConfigAccess().getWeightedAssignment_7()); 
            // InternalEduTest.g:2178:2: ( rule__MultiChoiceEmConfig__WeightedAssignment_7 )
            // InternalEduTest.g:2178:3: rule__MultiChoiceEmConfig__WeightedAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__MultiChoiceEmConfig__WeightedAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getMultiChoiceEmConfigAccess().getWeightedAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmConfig__Group__7__Impl"


    // $ANTLR start "rule__MultiChoiceEmConfig__Group__8"
    // InternalEduTest.g:2186:1: rule__MultiChoiceEmConfig__Group__8 : rule__MultiChoiceEmConfig__Group__8__Impl rule__MultiChoiceEmConfig__Group__9 ;
    public final void rule__MultiChoiceEmConfig__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2190:1: ( rule__MultiChoiceEmConfig__Group__8__Impl rule__MultiChoiceEmConfig__Group__9 )
            // InternalEduTest.g:2191:2: rule__MultiChoiceEmConfig__Group__8__Impl rule__MultiChoiceEmConfig__Group__9
            {
            pushFollow(FOLLOW_16);
            rule__MultiChoiceEmConfig__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoiceEmConfig__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmConfig__Group__8"


    // $ANTLR start "rule__MultiChoiceEmConfig__Group__8__Impl"
    // InternalEduTest.g:2198:1: rule__MultiChoiceEmConfig__Group__8__Impl : ( ',' ) ;
    public final void rule__MultiChoiceEmConfig__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2202:1: ( ( ',' ) )
            // InternalEduTest.g:2203:1: ( ',' )
            {
            // InternalEduTest.g:2203:1: ( ',' )
            // InternalEduTest.g:2204:2: ','
            {
             before(grammarAccess.getMultiChoiceEmConfigAccess().getCommaKeyword_8()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMultiChoiceEmConfigAccess().getCommaKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmConfig__Group__8__Impl"


    // $ANTLR start "rule__MultiChoiceEmConfig__Group__9"
    // InternalEduTest.g:2213:1: rule__MultiChoiceEmConfig__Group__9 : rule__MultiChoiceEmConfig__Group__9__Impl rule__MultiChoiceEmConfig__Group__10 ;
    public final void rule__MultiChoiceEmConfig__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2217:1: ( rule__MultiChoiceEmConfig__Group__9__Impl rule__MultiChoiceEmConfig__Group__10 )
            // InternalEduTest.g:2218:2: rule__MultiChoiceEmConfig__Group__9__Impl rule__MultiChoiceEmConfig__Group__10
            {
            pushFollow(FOLLOW_12);
            rule__MultiChoiceEmConfig__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoiceEmConfig__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmConfig__Group__9"


    // $ANTLR start "rule__MultiChoiceEmConfig__Group__9__Impl"
    // InternalEduTest.g:2225:1: rule__MultiChoiceEmConfig__Group__9__Impl : ( 'penalty' ) ;
    public final void rule__MultiChoiceEmConfig__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2229:1: ( ( 'penalty' ) )
            // InternalEduTest.g:2230:1: ( 'penalty' )
            {
            // InternalEduTest.g:2230:1: ( 'penalty' )
            // InternalEduTest.g:2231:2: 'penalty'
            {
             before(grammarAccess.getMultiChoiceEmConfigAccess().getPenaltyKeyword_9()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMultiChoiceEmConfigAccess().getPenaltyKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmConfig__Group__9__Impl"


    // $ANTLR start "rule__MultiChoiceEmConfig__Group__10"
    // InternalEduTest.g:2240:1: rule__MultiChoiceEmConfig__Group__10 : rule__MultiChoiceEmConfig__Group__10__Impl rule__MultiChoiceEmConfig__Group__11 ;
    public final void rule__MultiChoiceEmConfig__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2244:1: ( rule__MultiChoiceEmConfig__Group__10__Impl rule__MultiChoiceEmConfig__Group__11 )
            // InternalEduTest.g:2245:2: rule__MultiChoiceEmConfig__Group__10__Impl rule__MultiChoiceEmConfig__Group__11
            {
            pushFollow(FOLLOW_17);
            rule__MultiChoiceEmConfig__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoiceEmConfig__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmConfig__Group__10"


    // $ANTLR start "rule__MultiChoiceEmConfig__Group__10__Impl"
    // InternalEduTest.g:2252:1: rule__MultiChoiceEmConfig__Group__10__Impl : ( '=' ) ;
    public final void rule__MultiChoiceEmConfig__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2256:1: ( ( '=' ) )
            // InternalEduTest.g:2257:1: ( '=' )
            {
            // InternalEduTest.g:2257:1: ( '=' )
            // InternalEduTest.g:2258:2: '='
            {
             before(grammarAccess.getMultiChoiceEmConfigAccess().getEqualsSignKeyword_10()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMultiChoiceEmConfigAccess().getEqualsSignKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmConfig__Group__10__Impl"


    // $ANTLR start "rule__MultiChoiceEmConfig__Group__11"
    // InternalEduTest.g:2267:1: rule__MultiChoiceEmConfig__Group__11 : rule__MultiChoiceEmConfig__Group__11__Impl rule__MultiChoiceEmConfig__Group__12 ;
    public final void rule__MultiChoiceEmConfig__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2271:1: ( rule__MultiChoiceEmConfig__Group__11__Impl rule__MultiChoiceEmConfig__Group__12 )
            // InternalEduTest.g:2272:2: rule__MultiChoiceEmConfig__Group__11__Impl rule__MultiChoiceEmConfig__Group__12
            {
            pushFollow(FOLLOW_9);
            rule__MultiChoiceEmConfig__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoiceEmConfig__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmConfig__Group__11"


    // $ANTLR start "rule__MultiChoiceEmConfig__Group__11__Impl"
    // InternalEduTest.g:2279:1: rule__MultiChoiceEmConfig__Group__11__Impl : ( ( rule__MultiChoiceEmConfig__PenaltyAssignment_11 ) ) ;
    public final void rule__MultiChoiceEmConfig__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2283:1: ( ( ( rule__MultiChoiceEmConfig__PenaltyAssignment_11 ) ) )
            // InternalEduTest.g:2284:1: ( ( rule__MultiChoiceEmConfig__PenaltyAssignment_11 ) )
            {
            // InternalEduTest.g:2284:1: ( ( rule__MultiChoiceEmConfig__PenaltyAssignment_11 ) )
            // InternalEduTest.g:2285:2: ( rule__MultiChoiceEmConfig__PenaltyAssignment_11 )
            {
             before(grammarAccess.getMultiChoiceEmConfigAccess().getPenaltyAssignment_11()); 
            // InternalEduTest.g:2286:2: ( rule__MultiChoiceEmConfig__PenaltyAssignment_11 )
            // InternalEduTest.g:2286:3: rule__MultiChoiceEmConfig__PenaltyAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__MultiChoiceEmConfig__PenaltyAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getMultiChoiceEmConfigAccess().getPenaltyAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmConfig__Group__11__Impl"


    // $ANTLR start "rule__MultiChoiceEmConfig__Group__12"
    // InternalEduTest.g:2294:1: rule__MultiChoiceEmConfig__Group__12 : rule__MultiChoiceEmConfig__Group__12__Impl rule__MultiChoiceEmConfig__Group__13 ;
    public final void rule__MultiChoiceEmConfig__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2298:1: ( rule__MultiChoiceEmConfig__Group__12__Impl rule__MultiChoiceEmConfig__Group__13 )
            // InternalEduTest.g:2299:2: rule__MultiChoiceEmConfig__Group__12__Impl rule__MultiChoiceEmConfig__Group__13
            {
            pushFollow(FOLLOW_18);
            rule__MultiChoiceEmConfig__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoiceEmConfig__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmConfig__Group__12"


    // $ANTLR start "rule__MultiChoiceEmConfig__Group__12__Impl"
    // InternalEduTest.g:2306:1: rule__MultiChoiceEmConfig__Group__12__Impl : ( ',' ) ;
    public final void rule__MultiChoiceEmConfig__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2310:1: ( ( ',' ) )
            // InternalEduTest.g:2311:1: ( ',' )
            {
            // InternalEduTest.g:2311:1: ( ',' )
            // InternalEduTest.g:2312:2: ','
            {
             before(grammarAccess.getMultiChoiceEmConfigAccess().getCommaKeyword_12()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMultiChoiceEmConfigAccess().getCommaKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmConfig__Group__12__Impl"


    // $ANTLR start "rule__MultiChoiceEmConfig__Group__13"
    // InternalEduTest.g:2321:1: rule__MultiChoiceEmConfig__Group__13 : rule__MultiChoiceEmConfig__Group__13__Impl rule__MultiChoiceEmConfig__Group__14 ;
    public final void rule__MultiChoiceEmConfig__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2325:1: ( rule__MultiChoiceEmConfig__Group__13__Impl rule__MultiChoiceEmConfig__Group__14 )
            // InternalEduTest.g:2326:2: rule__MultiChoiceEmConfig__Group__13__Impl rule__MultiChoiceEmConfig__Group__14
            {
            pushFollow(FOLLOW_12);
            rule__MultiChoiceEmConfig__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoiceEmConfig__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmConfig__Group__13"


    // $ANTLR start "rule__MultiChoiceEmConfig__Group__13__Impl"
    // InternalEduTest.g:2333:1: rule__MultiChoiceEmConfig__Group__13__Impl : ( 'order' ) ;
    public final void rule__MultiChoiceEmConfig__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2337:1: ( ( 'order' ) )
            // InternalEduTest.g:2338:1: ( 'order' )
            {
            // InternalEduTest.g:2338:1: ( 'order' )
            // InternalEduTest.g:2339:2: 'order'
            {
             before(grammarAccess.getMultiChoiceEmConfigAccess().getOrderKeyword_13()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getMultiChoiceEmConfigAccess().getOrderKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmConfig__Group__13__Impl"


    // $ANTLR start "rule__MultiChoiceEmConfig__Group__14"
    // InternalEduTest.g:2348:1: rule__MultiChoiceEmConfig__Group__14 : rule__MultiChoiceEmConfig__Group__14__Impl rule__MultiChoiceEmConfig__Group__15 ;
    public final void rule__MultiChoiceEmConfig__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2352:1: ( rule__MultiChoiceEmConfig__Group__14__Impl rule__MultiChoiceEmConfig__Group__15 )
            // InternalEduTest.g:2353:2: rule__MultiChoiceEmConfig__Group__14__Impl rule__MultiChoiceEmConfig__Group__15
            {
            pushFollow(FOLLOW_19);
            rule__MultiChoiceEmConfig__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoiceEmConfig__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmConfig__Group__14"


    // $ANTLR start "rule__MultiChoiceEmConfig__Group__14__Impl"
    // InternalEduTest.g:2360:1: rule__MultiChoiceEmConfig__Group__14__Impl : ( '=' ) ;
    public final void rule__MultiChoiceEmConfig__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2364:1: ( ( '=' ) )
            // InternalEduTest.g:2365:1: ( '=' )
            {
            // InternalEduTest.g:2365:1: ( '=' )
            // InternalEduTest.g:2366:2: '='
            {
             before(grammarAccess.getMultiChoiceEmConfigAccess().getEqualsSignKeyword_14()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMultiChoiceEmConfigAccess().getEqualsSignKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmConfig__Group__14__Impl"


    // $ANTLR start "rule__MultiChoiceEmConfig__Group__15"
    // InternalEduTest.g:2375:1: rule__MultiChoiceEmConfig__Group__15 : rule__MultiChoiceEmConfig__Group__15__Impl rule__MultiChoiceEmConfig__Group__16 ;
    public final void rule__MultiChoiceEmConfig__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2379:1: ( rule__MultiChoiceEmConfig__Group__15__Impl rule__MultiChoiceEmConfig__Group__16 )
            // InternalEduTest.g:2380:2: rule__MultiChoiceEmConfig__Group__15__Impl rule__MultiChoiceEmConfig__Group__16
            {
            pushFollow(FOLLOW_9);
            rule__MultiChoiceEmConfig__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoiceEmConfig__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmConfig__Group__15"


    // $ANTLR start "rule__MultiChoiceEmConfig__Group__15__Impl"
    // InternalEduTest.g:2387:1: rule__MultiChoiceEmConfig__Group__15__Impl : ( ( rule__MultiChoiceEmConfig__OrderAssignment_15 ) ) ;
    public final void rule__MultiChoiceEmConfig__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2391:1: ( ( ( rule__MultiChoiceEmConfig__OrderAssignment_15 ) ) )
            // InternalEduTest.g:2392:1: ( ( rule__MultiChoiceEmConfig__OrderAssignment_15 ) )
            {
            // InternalEduTest.g:2392:1: ( ( rule__MultiChoiceEmConfig__OrderAssignment_15 ) )
            // InternalEduTest.g:2393:2: ( rule__MultiChoiceEmConfig__OrderAssignment_15 )
            {
             before(grammarAccess.getMultiChoiceEmConfigAccess().getOrderAssignment_15()); 
            // InternalEduTest.g:2394:2: ( rule__MultiChoiceEmConfig__OrderAssignment_15 )
            // InternalEduTest.g:2394:3: rule__MultiChoiceEmConfig__OrderAssignment_15
            {
            pushFollow(FOLLOW_2);
            rule__MultiChoiceEmConfig__OrderAssignment_15();

            state._fsp--;


            }

             after(grammarAccess.getMultiChoiceEmConfigAccess().getOrderAssignment_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmConfig__Group__15__Impl"


    // $ANTLR start "rule__MultiChoiceEmConfig__Group__16"
    // InternalEduTest.g:2402:1: rule__MultiChoiceEmConfig__Group__16 : rule__MultiChoiceEmConfig__Group__16__Impl rule__MultiChoiceEmConfig__Group__17 ;
    public final void rule__MultiChoiceEmConfig__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2406:1: ( rule__MultiChoiceEmConfig__Group__16__Impl rule__MultiChoiceEmConfig__Group__17 )
            // InternalEduTest.g:2407:2: rule__MultiChoiceEmConfig__Group__16__Impl rule__MultiChoiceEmConfig__Group__17
            {
            pushFollow(FOLLOW_20);
            rule__MultiChoiceEmConfig__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoiceEmConfig__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmConfig__Group__16"


    // $ANTLR start "rule__MultiChoiceEmConfig__Group__16__Impl"
    // InternalEduTest.g:2414:1: rule__MultiChoiceEmConfig__Group__16__Impl : ( ',' ) ;
    public final void rule__MultiChoiceEmConfig__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2418:1: ( ( ',' ) )
            // InternalEduTest.g:2419:1: ( ',' )
            {
            // InternalEduTest.g:2419:1: ( ',' )
            // InternalEduTest.g:2420:2: ','
            {
             before(grammarAccess.getMultiChoiceEmConfigAccess().getCommaKeyword_16()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMultiChoiceEmConfigAccess().getCommaKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmConfig__Group__16__Impl"


    // $ANTLR start "rule__MultiChoiceEmConfig__Group__17"
    // InternalEduTest.g:2429:1: rule__MultiChoiceEmConfig__Group__17 : rule__MultiChoiceEmConfig__Group__17__Impl rule__MultiChoiceEmConfig__Group__18 ;
    public final void rule__MultiChoiceEmConfig__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2433:1: ( rule__MultiChoiceEmConfig__Group__17__Impl rule__MultiChoiceEmConfig__Group__18 )
            // InternalEduTest.g:2434:2: rule__MultiChoiceEmConfig__Group__17__Impl rule__MultiChoiceEmConfig__Group__18
            {
            pushFollow(FOLLOW_12);
            rule__MultiChoiceEmConfig__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoiceEmConfig__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmConfig__Group__17"


    // $ANTLR start "rule__MultiChoiceEmConfig__Group__17__Impl"
    // InternalEduTest.g:2441:1: rule__MultiChoiceEmConfig__Group__17__Impl : ( 'mode' ) ;
    public final void rule__MultiChoiceEmConfig__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2445:1: ( ( 'mode' ) )
            // InternalEduTest.g:2446:1: ( 'mode' )
            {
            // InternalEduTest.g:2446:1: ( 'mode' )
            // InternalEduTest.g:2447:2: 'mode'
            {
             before(grammarAccess.getMultiChoiceEmConfigAccess().getModeKeyword_17()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getMultiChoiceEmConfigAccess().getModeKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmConfig__Group__17__Impl"


    // $ANTLR start "rule__MultiChoiceEmConfig__Group__18"
    // InternalEduTest.g:2456:1: rule__MultiChoiceEmConfig__Group__18 : rule__MultiChoiceEmConfig__Group__18__Impl rule__MultiChoiceEmConfig__Group__19 ;
    public final void rule__MultiChoiceEmConfig__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2460:1: ( rule__MultiChoiceEmConfig__Group__18__Impl rule__MultiChoiceEmConfig__Group__19 )
            // InternalEduTest.g:2461:2: rule__MultiChoiceEmConfig__Group__18__Impl rule__MultiChoiceEmConfig__Group__19
            {
            pushFollow(FOLLOW_21);
            rule__MultiChoiceEmConfig__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoiceEmConfig__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmConfig__Group__18"


    // $ANTLR start "rule__MultiChoiceEmConfig__Group__18__Impl"
    // InternalEduTest.g:2468:1: rule__MultiChoiceEmConfig__Group__18__Impl : ( '=' ) ;
    public final void rule__MultiChoiceEmConfig__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2472:1: ( ( '=' ) )
            // InternalEduTest.g:2473:1: ( '=' )
            {
            // InternalEduTest.g:2473:1: ( '=' )
            // InternalEduTest.g:2474:2: '='
            {
             before(grammarAccess.getMultiChoiceEmConfigAccess().getEqualsSignKeyword_18()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMultiChoiceEmConfigAccess().getEqualsSignKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmConfig__Group__18__Impl"


    // $ANTLR start "rule__MultiChoiceEmConfig__Group__19"
    // InternalEduTest.g:2483:1: rule__MultiChoiceEmConfig__Group__19 : rule__MultiChoiceEmConfig__Group__19__Impl ;
    public final void rule__MultiChoiceEmConfig__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2487:1: ( rule__MultiChoiceEmConfig__Group__19__Impl )
            // InternalEduTest.g:2488:2: rule__MultiChoiceEmConfig__Group__19__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiChoiceEmConfig__Group__19__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmConfig__Group__19"


    // $ANTLR start "rule__MultiChoiceEmConfig__Group__19__Impl"
    // InternalEduTest.g:2494:1: rule__MultiChoiceEmConfig__Group__19__Impl : ( ( rule__MultiChoiceEmConfig__ModeAssignment_19 ) ) ;
    public final void rule__MultiChoiceEmConfig__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2498:1: ( ( ( rule__MultiChoiceEmConfig__ModeAssignment_19 ) ) )
            // InternalEduTest.g:2499:1: ( ( rule__MultiChoiceEmConfig__ModeAssignment_19 ) )
            {
            // InternalEduTest.g:2499:1: ( ( rule__MultiChoiceEmConfig__ModeAssignment_19 ) )
            // InternalEduTest.g:2500:2: ( rule__MultiChoiceEmConfig__ModeAssignment_19 )
            {
             before(grammarAccess.getMultiChoiceEmConfigAccess().getModeAssignment_19()); 
            // InternalEduTest.g:2501:2: ( rule__MultiChoiceEmConfig__ModeAssignment_19 )
            // InternalEduTest.g:2501:3: rule__MultiChoiceEmConfig__ModeAssignment_19
            {
            pushFollow(FOLLOW_2);
            rule__MultiChoiceEmConfig__ModeAssignment_19();

            state._fsp--;


            }

             after(grammarAccess.getMultiChoiceEmConfigAccess().getModeAssignment_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmConfig__Group__19__Impl"


    // $ANTLR start "rule__Test__Group__0"
    // InternalEduTest.g:2510:1: rule__Test__Group__0 : rule__Test__Group__0__Impl rule__Test__Group__1 ;
    public final void rule__Test__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2514:1: ( rule__Test__Group__0__Impl rule__Test__Group__1 )
            // InternalEduTest.g:2515:2: rule__Test__Group__0__Impl rule__Test__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Test__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__0"


    // $ANTLR start "rule__Test__Group__0__Impl"
    // InternalEduTest.g:2522:1: rule__Test__Group__0__Impl : ( 'description' ) ;
    public final void rule__Test__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2526:1: ( ( 'description' ) )
            // InternalEduTest.g:2527:1: ( 'description' )
            {
            // InternalEduTest.g:2527:1: ( 'description' )
            // InternalEduTest.g:2528:2: 'description'
            {
             before(grammarAccess.getTestAccess().getDescriptionKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getDescriptionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__0__Impl"


    // $ANTLR start "rule__Test__Group__1"
    // InternalEduTest.g:2537:1: rule__Test__Group__1 : rule__Test__Group__1__Impl rule__Test__Group__2 ;
    public final void rule__Test__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2541:1: ( rule__Test__Group__1__Impl rule__Test__Group__2 )
            // InternalEduTest.g:2542:2: rule__Test__Group__1__Impl rule__Test__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Test__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__1"


    // $ANTLR start "rule__Test__Group__1__Impl"
    // InternalEduTest.g:2549:1: rule__Test__Group__1__Impl : ( 'for' ) ;
    public final void rule__Test__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2553:1: ( ( 'for' ) )
            // InternalEduTest.g:2554:1: ( 'for' )
            {
            // InternalEduTest.g:2554:1: ( 'for' )
            // InternalEduTest.g:2555:2: 'for'
            {
             before(grammarAccess.getTestAccess().getForKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getForKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__1__Impl"


    // $ANTLR start "rule__Test__Group__2"
    // InternalEduTest.g:2564:1: rule__Test__Group__2 : rule__Test__Group__2__Impl rule__Test__Group__3 ;
    public final void rule__Test__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2568:1: ( rule__Test__Group__2__Impl rule__Test__Group__3 )
            // InternalEduTest.g:2569:2: rule__Test__Group__2__Impl rule__Test__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Test__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__2"


    // $ANTLR start "rule__Test__Group__2__Impl"
    // InternalEduTest.g:2576:1: rule__Test__Group__2__Impl : ( ( rule__Test__SourceAssignment_2 ) ) ;
    public final void rule__Test__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2580:1: ( ( ( rule__Test__SourceAssignment_2 ) ) )
            // InternalEduTest.g:2581:1: ( ( rule__Test__SourceAssignment_2 ) )
            {
            // InternalEduTest.g:2581:1: ( ( rule__Test__SourceAssignment_2 ) )
            // InternalEduTest.g:2582:2: ( rule__Test__SourceAssignment_2 )
            {
             before(grammarAccess.getTestAccess().getSourceAssignment_2()); 
            // InternalEduTest.g:2583:2: ( rule__Test__SourceAssignment_2 )
            // InternalEduTest.g:2583:3: rule__Test__SourceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Test__SourceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getSourceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__2__Impl"


    // $ANTLR start "rule__Test__Group__3"
    // InternalEduTest.g:2591:1: rule__Test__Group__3 : rule__Test__Group__3__Impl rule__Test__Group__4 ;
    public final void rule__Test__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2595:1: ( rule__Test__Group__3__Impl rule__Test__Group__4 )
            // InternalEduTest.g:2596:2: rule__Test__Group__3__Impl rule__Test__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Test__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__3"


    // $ANTLR start "rule__Test__Group__3__Impl"
    // InternalEduTest.g:2603:1: rule__Test__Group__3__Impl : ( '=' ) ;
    public final void rule__Test__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2607:1: ( ( '=' ) )
            // InternalEduTest.g:2608:1: ( '=' )
            {
            // InternalEduTest.g:2608:1: ( '=' )
            // InternalEduTest.g:2609:2: '='
            {
             before(grammarAccess.getTestAccess().getEqualsSignKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__3__Impl"


    // $ANTLR start "rule__Test__Group__4"
    // InternalEduTest.g:2618:1: rule__Test__Group__4 : rule__Test__Group__4__Impl rule__Test__Group__5 ;
    public final void rule__Test__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2622:1: ( rule__Test__Group__4__Impl rule__Test__Group__5 )
            // InternalEduTest.g:2623:2: rule__Test__Group__4__Impl rule__Test__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__Test__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__4"


    // $ANTLR start "rule__Test__Group__4__Impl"
    // InternalEduTest.g:2630:1: rule__Test__Group__4__Impl : ( ( rule__Test__QuestionAssignment_4 ) ) ;
    public final void rule__Test__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2634:1: ( ( ( rule__Test__QuestionAssignment_4 ) ) )
            // InternalEduTest.g:2635:1: ( ( rule__Test__QuestionAssignment_4 ) )
            {
            // InternalEduTest.g:2635:1: ( ( rule__Test__QuestionAssignment_4 ) )
            // InternalEduTest.g:2636:2: ( rule__Test__QuestionAssignment_4 )
            {
             before(grammarAccess.getTestAccess().getQuestionAssignment_4()); 
            // InternalEduTest.g:2637:2: ( rule__Test__QuestionAssignment_4 )
            // InternalEduTest.g:2637:3: rule__Test__QuestionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Test__QuestionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getQuestionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__4__Impl"


    // $ANTLR start "rule__Test__Group__5"
    // InternalEduTest.g:2645:1: rule__Test__Group__5 : rule__Test__Group__5__Impl ;
    public final void rule__Test__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2649:1: ( rule__Test__Group__5__Impl )
            // InternalEduTest.g:2650:2: rule__Test__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__5"


    // $ANTLR start "rule__Test__Group__5__Impl"
    // InternalEduTest.g:2656:1: rule__Test__Group__5__Impl : ( ( rule__Test__ExpressionAssignment_5 )? ) ;
    public final void rule__Test__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2660:1: ( ( ( rule__Test__ExpressionAssignment_5 )? ) )
            // InternalEduTest.g:2661:1: ( ( rule__Test__ExpressionAssignment_5 )? )
            {
            // InternalEduTest.g:2661:1: ( ( rule__Test__ExpressionAssignment_5 )? )
            // InternalEduTest.g:2662:2: ( rule__Test__ExpressionAssignment_5 )?
            {
             before(grammarAccess.getTestAccess().getExpressionAssignment_5()); 
            // InternalEduTest.g:2663:2: ( rule__Test__ExpressionAssignment_5 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==41) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalEduTest.g:2663:3: rule__Test__ExpressionAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Test__ExpressionAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTestAccess().getExpressionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__5__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalEduTest.g:2672:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2676:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalEduTest.g:2677:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // InternalEduTest.g:2684:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2688:1: ( ( ( '-' )? ) )
            // InternalEduTest.g:2689:1: ( ( '-' )? )
            {
            // InternalEduTest.g:2689:1: ( ( '-' )? )
            // InternalEduTest.g:2690:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalEduTest.g:2691:2: ( '-' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==39) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalEduTest.g:2691:3: '-'
                    {
                    match(input,39,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // InternalEduTest.g:2699:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2703:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalEduTest.g:2704:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // InternalEduTest.g:2711:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2715:1: ( ( ( RULE_INT )? ) )
            // InternalEduTest.g:2716:1: ( ( RULE_INT )? )
            {
            // InternalEduTest.g:2716:1: ( ( RULE_INT )? )
            // InternalEduTest.g:2717:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalEduTest.g:2718:2: ( RULE_INT )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_INT) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalEduTest.g:2718:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // InternalEduTest.g:2726:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2730:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalEduTest.g:2731:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // InternalEduTest.g:2738:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2742:1: ( ( '.' ) )
            // InternalEduTest.g:2743:1: ( '.' )
            {
            // InternalEduTest.g:2743:1: ( '.' )
            // InternalEduTest.g:2744:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // InternalEduTest.g:2753:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2757:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalEduTest.g:2758:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // InternalEduTest.g:2765:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2769:1: ( ( RULE_INT ) )
            // InternalEduTest.g:2770:1: ( RULE_INT )
            {
            // InternalEduTest.g:2770:1: ( RULE_INT )
            // InternalEduTest.g:2771:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__4"
    // InternalEduTest.g:2780:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2784:1: ( rule__EDouble__Group__4__Impl )
            // InternalEduTest.g:2785:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4"


    // $ANTLR start "rule__EDouble__Group__4__Impl"
    // InternalEduTest.g:2791:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2795:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalEduTest.g:2796:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalEduTest.g:2796:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalEduTest.g:2797:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalEduTest.g:2798:2: ( rule__EDouble__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=13 && LA27_0<=14)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalEduTest.g:2798:3: rule__EDouble__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDouble__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group_4__0"
    // InternalEduTest.g:2807:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2811:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalEduTest.g:2812:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_27);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0"


    // $ANTLR start "rule__EDouble__Group_4__0__Impl"
    // InternalEduTest.g:2819:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2823:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalEduTest.g:2824:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalEduTest.g:2824:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalEduTest.g:2825:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalEduTest.g:2826:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalEduTest.g:2826:3: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0__Impl"


    // $ANTLR start "rule__EDouble__Group_4__1"
    // InternalEduTest.g:2834:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2838:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalEduTest.g:2839:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_27);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1"


    // $ANTLR start "rule__EDouble__Group_4__1__Impl"
    // InternalEduTest.g:2846:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2850:1: ( ( ( '-' )? ) )
            // InternalEduTest.g:2851:1: ( ( '-' )? )
            {
            // InternalEduTest.g:2851:1: ( ( '-' )? )
            // InternalEduTest.g:2852:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalEduTest.g:2853:2: ( '-' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==39) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalEduTest.g:2853:3: '-'
                    {
                    match(input,39,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group_4__2"
    // InternalEduTest.g:2861:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2865:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalEduTest.g:2866:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2"


    // $ANTLR start "rule__EDouble__Group_4__2__Impl"
    // InternalEduTest.g:2872:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2876:1: ( ( RULE_INT ) )
            // InternalEduTest.g:2877:1: ( RULE_INT )
            {
            // InternalEduTest.g:2877:1: ( RULE_INT )
            // InternalEduTest.g:2878:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2__Impl"


    // $ANTLR start "rule__Program__ConfigAssignment_1"
    // InternalEduTest.g:2888:1: rule__Program__ConfigAssignment_1 : ( ruleProgramConfiguration ) ;
    public final void rule__Program__ConfigAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2892:1: ( ( ruleProgramConfiguration ) )
            // InternalEduTest.g:2893:2: ( ruleProgramConfiguration )
            {
            // InternalEduTest.g:2893:2: ( ruleProgramConfiguration )
            // InternalEduTest.g:2894:3: ruleProgramConfiguration
            {
             before(grammarAccess.getProgramAccess().getConfigProgramConfigurationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProgramConfiguration();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getConfigProgramConfigurationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__ConfigAssignment_1"


    // $ANTLR start "rule__Program__ExercisesAssignment_2"
    // InternalEduTest.g:2903:1: rule__Program__ExercisesAssignment_2 : ( ruleMutatorTests ) ;
    public final void rule__Program__ExercisesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2907:1: ( ( ruleMutatorTests ) )
            // InternalEduTest.g:2908:2: ( ruleMutatorTests )
            {
            // InternalEduTest.g:2908:2: ( ruleMutatorTests )
            // InternalEduTest.g:2909:3: ruleMutatorTests
            {
             before(grammarAccess.getProgramAccess().getExercisesMutatorTestsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMutatorTests();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getExercisesMutatorTestsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__ExercisesAssignment_2"


    // $ANTLR start "rule__AlternativeResponse__BlocksAssignment_1_0"
    // InternalEduTest.g:2918:1: rule__AlternativeResponse__BlocksAssignment_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__AlternativeResponse__BlocksAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2922:1: ( ( ( RULE_ID ) ) )
            // InternalEduTest.g:2923:2: ( ( RULE_ID ) )
            {
            // InternalEduTest.g:2923:2: ( ( RULE_ID ) )
            // InternalEduTest.g:2924:3: ( RULE_ID )
            {
             before(grammarAccess.getAlternativeResponseAccess().getBlocksBlockCrossReference_1_0_0()); 
            // InternalEduTest.g:2925:3: ( RULE_ID )
            // InternalEduTest.g:2926:4: RULE_ID
            {
             before(grammarAccess.getAlternativeResponseAccess().getBlocksBlockIDTerminalRuleCall_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAlternativeResponseAccess().getBlocksBlockIDTerminalRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getAlternativeResponseAccess().getBlocksBlockCrossReference_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeResponse__BlocksAssignment_1_0"


    // $ANTLR start "rule__AlternativeResponse__BlocksAssignment_1_1_1"
    // InternalEduTest.g:2937:1: rule__AlternativeResponse__BlocksAssignment_1_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__AlternativeResponse__BlocksAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2941:1: ( ( ( RULE_ID ) ) )
            // InternalEduTest.g:2942:2: ( ( RULE_ID ) )
            {
            // InternalEduTest.g:2942:2: ( ( RULE_ID ) )
            // InternalEduTest.g:2943:3: ( RULE_ID )
            {
             before(grammarAccess.getAlternativeResponseAccess().getBlocksBlockCrossReference_1_1_1_0()); 
            // InternalEduTest.g:2944:3: ( RULE_ID )
            // InternalEduTest.g:2945:4: RULE_ID
            {
             before(grammarAccess.getAlternativeResponseAccess().getBlocksBlockIDTerminalRuleCall_1_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAlternativeResponseAccess().getBlocksBlockIDTerminalRuleCall_1_1_1_0_1()); 

            }

             after(grammarAccess.getAlternativeResponseAccess().getBlocksBlockCrossReference_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeResponse__BlocksAssignment_1_1_1"


    // $ANTLR start "rule__AlternativeResponse__ConfigAssignment_3"
    // InternalEduTest.g:2956:1: rule__AlternativeResponse__ConfigAssignment_3 : ( ruleTestConfiguration ) ;
    public final void rule__AlternativeResponse__ConfigAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2960:1: ( ( ruleTestConfiguration ) )
            // InternalEduTest.g:2961:2: ( ruleTestConfiguration )
            {
            // InternalEduTest.g:2961:2: ( ruleTestConfiguration )
            // InternalEduTest.g:2962:3: ruleTestConfiguration
            {
             before(grammarAccess.getAlternativeResponseAccess().getConfigTestConfigurationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTestConfiguration();

            state._fsp--;

             after(grammarAccess.getAlternativeResponseAccess().getConfigTestConfigurationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeResponse__ConfigAssignment_3"


    // $ANTLR start "rule__AlternativeResponse__TestsAssignment_4"
    // InternalEduTest.g:2971:1: rule__AlternativeResponse__TestsAssignment_4 : ( ruleTest ) ;
    public final void rule__AlternativeResponse__TestsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2975:1: ( ( ruleTest ) )
            // InternalEduTest.g:2976:2: ( ruleTest )
            {
            // InternalEduTest.g:2976:2: ( ruleTest )
            // InternalEduTest.g:2977:3: ruleTest
            {
             before(grammarAccess.getAlternativeResponseAccess().getTestsTestParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTest();

            state._fsp--;

             after(grammarAccess.getAlternativeResponseAccess().getTestsTestParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeResponse__TestsAssignment_4"


    // $ANTLR start "rule__MultiChoiceDiagram__BlocksAssignment_1_0"
    // InternalEduTest.g:2986:1: rule__MultiChoiceDiagram__BlocksAssignment_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__MultiChoiceDiagram__BlocksAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:2990:1: ( ( ( RULE_ID ) ) )
            // InternalEduTest.g:2991:2: ( ( RULE_ID ) )
            {
            // InternalEduTest.g:2991:2: ( ( RULE_ID ) )
            // InternalEduTest.g:2992:3: ( RULE_ID )
            {
             before(grammarAccess.getMultiChoiceDiagramAccess().getBlocksBlockCrossReference_1_0_0()); 
            // InternalEduTest.g:2993:3: ( RULE_ID )
            // InternalEduTest.g:2994:4: RULE_ID
            {
             before(grammarAccess.getMultiChoiceDiagramAccess().getBlocksBlockIDTerminalRuleCall_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMultiChoiceDiagramAccess().getBlocksBlockIDTerminalRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getMultiChoiceDiagramAccess().getBlocksBlockCrossReference_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceDiagram__BlocksAssignment_1_0"


    // $ANTLR start "rule__MultiChoiceDiagram__BlocksAssignment_1_1_1"
    // InternalEduTest.g:3005:1: rule__MultiChoiceDiagram__BlocksAssignment_1_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__MultiChoiceDiagram__BlocksAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:3009:1: ( ( ( RULE_ID ) ) )
            // InternalEduTest.g:3010:2: ( ( RULE_ID ) )
            {
            // InternalEduTest.g:3010:2: ( ( RULE_ID ) )
            // InternalEduTest.g:3011:3: ( RULE_ID )
            {
             before(grammarAccess.getMultiChoiceDiagramAccess().getBlocksBlockCrossReference_1_1_1_0()); 
            // InternalEduTest.g:3012:3: ( RULE_ID )
            // InternalEduTest.g:3013:4: RULE_ID
            {
             before(grammarAccess.getMultiChoiceDiagramAccess().getBlocksBlockIDTerminalRuleCall_1_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMultiChoiceDiagramAccess().getBlocksBlockIDTerminalRuleCall_1_1_1_0_1()); 

            }

             after(grammarAccess.getMultiChoiceDiagramAccess().getBlocksBlockCrossReference_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceDiagram__BlocksAssignment_1_1_1"


    // $ANTLR start "rule__MultiChoiceDiagram__ConfigAssignment_3"
    // InternalEduTest.g:3024:1: rule__MultiChoiceDiagram__ConfigAssignment_3 : ( ruleTestConfiguration ) ;
    public final void rule__MultiChoiceDiagram__ConfigAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:3028:1: ( ( ruleTestConfiguration ) )
            // InternalEduTest.g:3029:2: ( ruleTestConfiguration )
            {
            // InternalEduTest.g:3029:2: ( ruleTestConfiguration )
            // InternalEduTest.g:3030:3: ruleTestConfiguration
            {
             before(grammarAccess.getMultiChoiceDiagramAccess().getConfigTestConfigurationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTestConfiguration();

            state._fsp--;

             after(grammarAccess.getMultiChoiceDiagramAccess().getConfigTestConfigurationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceDiagram__ConfigAssignment_3"


    // $ANTLR start "rule__MultiChoiceDiagram__TestsAssignment_4"
    // InternalEduTest.g:3039:1: rule__MultiChoiceDiagram__TestsAssignment_4 : ( ruleTest ) ;
    public final void rule__MultiChoiceDiagram__TestsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:3043:1: ( ( ruleTest ) )
            // InternalEduTest.g:3044:2: ( ruleTest )
            {
            // InternalEduTest.g:3044:2: ( ruleTest )
            // InternalEduTest.g:3045:3: ruleTest
            {
             before(grammarAccess.getMultiChoiceDiagramAccess().getTestsTestParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTest();

            state._fsp--;

             after(grammarAccess.getMultiChoiceDiagramAccess().getTestsTestParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceDiagram__TestsAssignment_4"


    // $ANTLR start "rule__MultiChoiceEmendation__BlocksAssignment_1_0"
    // InternalEduTest.g:3054:1: rule__MultiChoiceEmendation__BlocksAssignment_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__MultiChoiceEmendation__BlocksAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:3058:1: ( ( ( RULE_ID ) ) )
            // InternalEduTest.g:3059:2: ( ( RULE_ID ) )
            {
            // InternalEduTest.g:3059:2: ( ( RULE_ID ) )
            // InternalEduTest.g:3060:3: ( RULE_ID )
            {
             before(grammarAccess.getMultiChoiceEmendationAccess().getBlocksBlockCrossReference_1_0_0()); 
            // InternalEduTest.g:3061:3: ( RULE_ID )
            // InternalEduTest.g:3062:4: RULE_ID
            {
             before(grammarAccess.getMultiChoiceEmendationAccess().getBlocksBlockIDTerminalRuleCall_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMultiChoiceEmendationAccess().getBlocksBlockIDTerminalRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getMultiChoiceEmendationAccess().getBlocksBlockCrossReference_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmendation__BlocksAssignment_1_0"


    // $ANTLR start "rule__MultiChoiceEmendation__BlocksAssignment_1_1_1"
    // InternalEduTest.g:3073:1: rule__MultiChoiceEmendation__BlocksAssignment_1_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__MultiChoiceEmendation__BlocksAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:3077:1: ( ( ( RULE_ID ) ) )
            // InternalEduTest.g:3078:2: ( ( RULE_ID ) )
            {
            // InternalEduTest.g:3078:2: ( ( RULE_ID ) )
            // InternalEduTest.g:3079:3: ( RULE_ID )
            {
             before(grammarAccess.getMultiChoiceEmendationAccess().getBlocksBlockCrossReference_1_1_1_0()); 
            // InternalEduTest.g:3080:3: ( RULE_ID )
            // InternalEduTest.g:3081:4: RULE_ID
            {
             before(grammarAccess.getMultiChoiceEmendationAccess().getBlocksBlockIDTerminalRuleCall_1_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMultiChoiceEmendationAccess().getBlocksBlockIDTerminalRuleCall_1_1_1_0_1()); 

            }

             after(grammarAccess.getMultiChoiceEmendationAccess().getBlocksBlockCrossReference_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmendation__BlocksAssignment_1_1_1"


    // $ANTLR start "rule__MultiChoiceEmendation__ConfigAssignment_3"
    // InternalEduTest.g:3092:1: rule__MultiChoiceEmendation__ConfigAssignment_3 : ( ruleMultiChoiceEmConfig ) ;
    public final void rule__MultiChoiceEmendation__ConfigAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:3096:1: ( ( ruleMultiChoiceEmConfig ) )
            // InternalEduTest.g:3097:2: ( ruleMultiChoiceEmConfig )
            {
            // InternalEduTest.g:3097:2: ( ruleMultiChoiceEmConfig )
            // InternalEduTest.g:3098:3: ruleMultiChoiceEmConfig
            {
             before(grammarAccess.getMultiChoiceEmendationAccess().getConfigMultiChoiceEmConfigParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiChoiceEmConfig();

            state._fsp--;

             after(grammarAccess.getMultiChoiceEmendationAccess().getConfigMultiChoiceEmConfigParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmendation__ConfigAssignment_3"


    // $ANTLR start "rule__MultiChoiceEmendation__TestsAssignment_4"
    // InternalEduTest.g:3107:1: rule__MultiChoiceEmendation__TestsAssignment_4 : ( ruleTest ) ;
    public final void rule__MultiChoiceEmendation__TestsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:3111:1: ( ( ruleTest ) )
            // InternalEduTest.g:3112:2: ( ruleTest )
            {
            // InternalEduTest.g:3112:2: ( ruleTest )
            // InternalEduTest.g:3113:3: ruleTest
            {
             before(grammarAccess.getMultiChoiceEmendationAccess().getTestsTestParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTest();

            state._fsp--;

             after(grammarAccess.getMultiChoiceEmendationAccess().getTestsTestParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmendation__TestsAssignment_4"


    // $ANTLR start "rule__MatchPairs__BlocksAssignment_1_0"
    // InternalEduTest.g:3122:1: rule__MatchPairs__BlocksAssignment_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__MatchPairs__BlocksAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:3126:1: ( ( ( RULE_ID ) ) )
            // InternalEduTest.g:3127:2: ( ( RULE_ID ) )
            {
            // InternalEduTest.g:3127:2: ( ( RULE_ID ) )
            // InternalEduTest.g:3128:3: ( RULE_ID )
            {
             before(grammarAccess.getMatchPairsAccess().getBlocksBlockCrossReference_1_0_0()); 
            // InternalEduTest.g:3129:3: ( RULE_ID )
            // InternalEduTest.g:3130:4: RULE_ID
            {
             before(grammarAccess.getMatchPairsAccess().getBlocksBlockIDTerminalRuleCall_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMatchPairsAccess().getBlocksBlockIDTerminalRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getMatchPairsAccess().getBlocksBlockCrossReference_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchPairs__BlocksAssignment_1_0"


    // $ANTLR start "rule__MatchPairs__BlocksAssignment_1_1_1"
    // InternalEduTest.g:3141:1: rule__MatchPairs__BlocksAssignment_1_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__MatchPairs__BlocksAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:3145:1: ( ( ( RULE_ID ) ) )
            // InternalEduTest.g:3146:2: ( ( RULE_ID ) )
            {
            // InternalEduTest.g:3146:2: ( ( RULE_ID ) )
            // InternalEduTest.g:3147:3: ( RULE_ID )
            {
             before(grammarAccess.getMatchPairsAccess().getBlocksBlockCrossReference_1_1_1_0()); 
            // InternalEduTest.g:3148:3: ( RULE_ID )
            // InternalEduTest.g:3149:4: RULE_ID
            {
             before(grammarAccess.getMatchPairsAccess().getBlocksBlockIDTerminalRuleCall_1_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMatchPairsAccess().getBlocksBlockIDTerminalRuleCall_1_1_1_0_1()); 

            }

             after(grammarAccess.getMatchPairsAccess().getBlocksBlockCrossReference_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchPairs__BlocksAssignment_1_1_1"


    // $ANTLR start "rule__MatchPairs__ConfigAssignment_3"
    // InternalEduTest.g:3160:1: rule__MatchPairs__ConfigAssignment_3 : ( ruleTestConfiguration ) ;
    public final void rule__MatchPairs__ConfigAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:3164:1: ( ( ruleTestConfiguration ) )
            // InternalEduTest.g:3165:2: ( ruleTestConfiguration )
            {
            // InternalEduTest.g:3165:2: ( ruleTestConfiguration )
            // InternalEduTest.g:3166:3: ruleTestConfiguration
            {
             before(grammarAccess.getMatchPairsAccess().getConfigTestConfigurationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTestConfiguration();

            state._fsp--;

             after(grammarAccess.getMatchPairsAccess().getConfigTestConfigurationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchPairs__ConfigAssignment_3"


    // $ANTLR start "rule__MatchPairs__TestsAssignment_4"
    // InternalEduTest.g:3175:1: rule__MatchPairs__TestsAssignment_4 : ( ruleTest ) ;
    public final void rule__MatchPairs__TestsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:3179:1: ( ( ruleTest ) )
            // InternalEduTest.g:3180:2: ( ruleTest )
            {
            // InternalEduTest.g:3180:2: ( ruleTest )
            // InternalEduTest.g:3181:3: ruleTest
            {
             before(grammarAccess.getMatchPairsAccess().getTestsTestParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTest();

            state._fsp--;

             after(grammarAccess.getMatchPairsAccess().getTestsTestParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchPairs__TestsAssignment_4"


    // $ANTLR start "rule__ProgramConfiguration__NavigationAssignment_2"
    // InternalEduTest.g:3190:1: rule__ProgramConfiguration__NavigationAssignment_2 : ( ruleNavigation ) ;
    public final void rule__ProgramConfiguration__NavigationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:3194:1: ( ( ruleNavigation ) )
            // InternalEduTest.g:3195:2: ( ruleNavigation )
            {
            // InternalEduTest.g:3195:2: ( ruleNavigation )
            // InternalEduTest.g:3196:3: ruleNavigation
            {
             before(grammarAccess.getProgramConfigurationAccess().getNavigationNavigationEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNavigation();

            state._fsp--;

             after(grammarAccess.getProgramConfigurationAccess().getNavigationNavigationEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgramConfiguration__NavigationAssignment_2"


    // $ANTLR start "rule__TestConfiguration__RetryAssignment_3"
    // InternalEduTest.g:3205:1: rule__TestConfiguration__RetryAssignment_3 : ( ( rule__TestConfiguration__RetryAlternatives_3_0 ) ) ;
    public final void rule__TestConfiguration__RetryAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:3209:1: ( ( ( rule__TestConfiguration__RetryAlternatives_3_0 ) ) )
            // InternalEduTest.g:3210:2: ( ( rule__TestConfiguration__RetryAlternatives_3_0 ) )
            {
            // InternalEduTest.g:3210:2: ( ( rule__TestConfiguration__RetryAlternatives_3_0 ) )
            // InternalEduTest.g:3211:3: ( rule__TestConfiguration__RetryAlternatives_3_0 )
            {
             before(grammarAccess.getTestConfigurationAccess().getRetryAlternatives_3_0()); 
            // InternalEduTest.g:3212:3: ( rule__TestConfiguration__RetryAlternatives_3_0 )
            // InternalEduTest.g:3212:4: rule__TestConfiguration__RetryAlternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__TestConfiguration__RetryAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getTestConfigurationAccess().getRetryAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestConfiguration__RetryAssignment_3"


    // $ANTLR start "rule__MultiChoiceEmConfig__RetryAssignment_3"
    // InternalEduTest.g:3220:1: rule__MultiChoiceEmConfig__RetryAssignment_3 : ( ( rule__MultiChoiceEmConfig__RetryAlternatives_3_0 ) ) ;
    public final void rule__MultiChoiceEmConfig__RetryAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:3224:1: ( ( ( rule__MultiChoiceEmConfig__RetryAlternatives_3_0 ) ) )
            // InternalEduTest.g:3225:2: ( ( rule__MultiChoiceEmConfig__RetryAlternatives_3_0 ) )
            {
            // InternalEduTest.g:3225:2: ( ( rule__MultiChoiceEmConfig__RetryAlternatives_3_0 ) )
            // InternalEduTest.g:3226:3: ( rule__MultiChoiceEmConfig__RetryAlternatives_3_0 )
            {
             before(grammarAccess.getMultiChoiceEmConfigAccess().getRetryAlternatives_3_0()); 
            // InternalEduTest.g:3227:3: ( rule__MultiChoiceEmConfig__RetryAlternatives_3_0 )
            // InternalEduTest.g:3227:4: rule__MultiChoiceEmConfig__RetryAlternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__MultiChoiceEmConfig__RetryAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiChoiceEmConfigAccess().getRetryAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmConfig__RetryAssignment_3"


    // $ANTLR start "rule__MultiChoiceEmConfig__WeightedAssignment_7"
    // InternalEduTest.g:3235:1: rule__MultiChoiceEmConfig__WeightedAssignment_7 : ( ( rule__MultiChoiceEmConfig__WeightedAlternatives_7_0 ) ) ;
    public final void rule__MultiChoiceEmConfig__WeightedAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:3239:1: ( ( ( rule__MultiChoiceEmConfig__WeightedAlternatives_7_0 ) ) )
            // InternalEduTest.g:3240:2: ( ( rule__MultiChoiceEmConfig__WeightedAlternatives_7_0 ) )
            {
            // InternalEduTest.g:3240:2: ( ( rule__MultiChoiceEmConfig__WeightedAlternatives_7_0 ) )
            // InternalEduTest.g:3241:3: ( rule__MultiChoiceEmConfig__WeightedAlternatives_7_0 )
            {
             before(grammarAccess.getMultiChoiceEmConfigAccess().getWeightedAlternatives_7_0()); 
            // InternalEduTest.g:3242:3: ( rule__MultiChoiceEmConfig__WeightedAlternatives_7_0 )
            // InternalEduTest.g:3242:4: rule__MultiChoiceEmConfig__WeightedAlternatives_7_0
            {
            pushFollow(FOLLOW_2);
            rule__MultiChoiceEmConfig__WeightedAlternatives_7_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiChoiceEmConfigAccess().getWeightedAlternatives_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmConfig__WeightedAssignment_7"


    // $ANTLR start "rule__MultiChoiceEmConfig__PenaltyAssignment_11"
    // InternalEduTest.g:3250:1: rule__MultiChoiceEmConfig__PenaltyAssignment_11 : ( ruleEDouble ) ;
    public final void rule__MultiChoiceEmConfig__PenaltyAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:3254:1: ( ( ruleEDouble ) )
            // InternalEduTest.g:3255:2: ( ruleEDouble )
            {
            // InternalEduTest.g:3255:2: ( ruleEDouble )
            // InternalEduTest.g:3256:3: ruleEDouble
            {
             before(grammarAccess.getMultiChoiceEmConfigAccess().getPenaltyEDoubleParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getMultiChoiceEmConfigAccess().getPenaltyEDoubleParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmConfig__PenaltyAssignment_11"


    // $ANTLR start "rule__MultiChoiceEmConfig__OrderAssignment_15"
    // InternalEduTest.g:3265:1: rule__MultiChoiceEmConfig__OrderAssignment_15 : ( ruleOrder ) ;
    public final void rule__MultiChoiceEmConfig__OrderAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:3269:1: ( ( ruleOrder ) )
            // InternalEduTest.g:3270:2: ( ruleOrder )
            {
            // InternalEduTest.g:3270:2: ( ruleOrder )
            // InternalEduTest.g:3271:3: ruleOrder
            {
             before(grammarAccess.getMultiChoiceEmConfigAccess().getOrderOrderEnumRuleCall_15_0()); 
            pushFollow(FOLLOW_2);
            ruleOrder();

            state._fsp--;

             after(grammarAccess.getMultiChoiceEmConfigAccess().getOrderOrderEnumRuleCall_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmConfig__OrderAssignment_15"


    // $ANTLR start "rule__MultiChoiceEmConfig__ModeAssignment_19"
    // InternalEduTest.g:3280:1: rule__MultiChoiceEmConfig__ModeAssignment_19 : ( ruleMode ) ;
    public final void rule__MultiChoiceEmConfig__ModeAssignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:3284:1: ( ( ruleMode ) )
            // InternalEduTest.g:3285:2: ( ruleMode )
            {
            // InternalEduTest.g:3285:2: ( ruleMode )
            // InternalEduTest.g:3286:3: ruleMode
            {
             before(grammarAccess.getMultiChoiceEmConfigAccess().getModeModeEnumRuleCall_19_0()); 
            pushFollow(FOLLOW_2);
            ruleMode();

            state._fsp--;

             after(grammarAccess.getMultiChoiceEmConfigAccess().getModeModeEnumRuleCall_19_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceEmConfig__ModeAssignment_19"


    // $ANTLR start "rule__Test__SourceAssignment_2"
    // InternalEduTest.g:3295:1: rule__Test__SourceAssignment_2 : ( ruleEString ) ;
    public final void rule__Test__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:3299:1: ( ( ruleEString ) )
            // InternalEduTest.g:3300:2: ( ruleEString )
            {
            // InternalEduTest.g:3300:2: ( ruleEString )
            // InternalEduTest.g:3301:3: ruleEString
            {
             before(grammarAccess.getTestAccess().getSourceEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTestAccess().getSourceEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__SourceAssignment_2"


    // $ANTLR start "rule__Test__QuestionAssignment_4"
    // InternalEduTest.g:3310:1: rule__Test__QuestionAssignment_4 : ( ruleEString ) ;
    public final void rule__Test__QuestionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:3314:1: ( ( ruleEString ) )
            // InternalEduTest.g:3315:2: ( ruleEString )
            {
            // InternalEduTest.g:3315:2: ( ruleEString )
            // InternalEduTest.g:3316:3: ruleEString
            {
             before(grammarAccess.getTestAccess().getQuestionEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTestAccess().getQuestionEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__QuestionAssignment_4"


    // $ANTLR start "rule__Test__ExpressionAssignment_5"
    // InternalEduTest.g:3325:1: rule__Test__ExpressionAssignment_5 : ( ( '%text' ) ) ;
    public final void rule__Test__ExpressionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduTest.g:3329:1: ( ( ( '%text' ) ) )
            // InternalEduTest.g:3330:2: ( ( '%text' ) )
            {
            // InternalEduTest.g:3330:2: ( ( '%text' ) )
            // InternalEduTest.g:3331:3: ( '%text' )
            {
             before(grammarAccess.getTestAccess().getExpressionTextKeyword_5_0()); 
            // InternalEduTest.g:3332:3: ( '%text' )
            // InternalEduTest.g:3333:4: '%text'
            {
             before(grammarAccess.getTestAccess().getExpressionTextKeyword_5_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getExpressionTextKeyword_5_0()); 

            }

             after(grammarAccess.getTestAccess().getExpressionTextKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__ExpressionAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000078800000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000078800002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000002002000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000018000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000000040L});

}