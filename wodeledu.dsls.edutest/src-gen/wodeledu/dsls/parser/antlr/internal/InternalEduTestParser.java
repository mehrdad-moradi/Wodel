package wodeledu.dsls.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import wodeledu.dsls.services.EduTestGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEduTestParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AlternativeResponse'", "','", "'{'", "'}'", "'MultiChoiceDiagram'", "'MultiChoiceEmendation'", "'MatchPairs'", "'navigation'", "'='", "'retry'", "'yes'", "'no'", "'weighted'", "'penalty'", "'order'", "'mode'", "'description'", "'for'", "'%text'", "'-'", "'.'", "'E'", "'e'", "'fixed'", "'random'", "'options-ascending'", "'options-descending'", "'radiobutton'", "'checkbox'", "'free'", "'locked'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=4;
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

        public InternalEduTestParser(TokenStream input, EduTestGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected EduTestGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalEduTest.g:65:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalEduTest.g:65:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalEduTest.g:66:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalEduTest.g:72:1: ruleProgram returns [EObject current=null] : ( () ( (lv_config_1_0= ruleProgramConfiguration ) )? ( (lv_exercises_2_0= ruleMutatorTests ) )+ ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_config_1_0 = null;

        EObject lv_exercises_2_0 = null;



        	enterRule();

        try {
            // InternalEduTest.g:78:2: ( ( () ( (lv_config_1_0= ruleProgramConfiguration ) )? ( (lv_exercises_2_0= ruleMutatorTests ) )+ ) )
            // InternalEduTest.g:79:2: ( () ( (lv_config_1_0= ruleProgramConfiguration ) )? ( (lv_exercises_2_0= ruleMutatorTests ) )+ )
            {
            // InternalEduTest.g:79:2: ( () ( (lv_config_1_0= ruleProgramConfiguration ) )? ( (lv_exercises_2_0= ruleMutatorTests ) )+ )
            // InternalEduTest.g:80:3: () ( (lv_config_1_0= ruleProgramConfiguration ) )? ( (lv_exercises_2_0= ruleMutatorTests ) )+
            {
            // InternalEduTest.g:80:3: ()
            // InternalEduTest.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProgramAccess().getProgramAction_0(),
            					current);
            			

            }

            // InternalEduTest.g:87:3: ( (lv_config_1_0= ruleProgramConfiguration ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==18) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalEduTest.g:88:4: (lv_config_1_0= ruleProgramConfiguration )
                    {
                    // InternalEduTest.g:88:4: (lv_config_1_0= ruleProgramConfiguration )
                    // InternalEduTest.g:89:5: lv_config_1_0= ruleProgramConfiguration
                    {

                    					newCompositeNode(grammarAccess.getProgramAccess().getConfigProgramConfigurationParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_config_1_0=ruleProgramConfiguration();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProgramRule());
                    					}
                    					set(
                    						current,
                    						"config",
                    						lv_config_1_0,
                    						"wodeledu.dsls.EduTest.ProgramConfiguration");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalEduTest.g:106:3: ( (lv_exercises_2_0= ruleMutatorTests ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11||(LA2_0>=15 && LA2_0<=17)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalEduTest.g:107:4: (lv_exercises_2_0= ruleMutatorTests )
            	    {
            	    // InternalEduTest.g:107:4: (lv_exercises_2_0= ruleMutatorTests )
            	    // InternalEduTest.g:108:5: lv_exercises_2_0= ruleMutatorTests
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getExercisesMutatorTestsParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_exercises_2_0=ruleMutatorTests();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"exercises",
            	    						lv_exercises_2_0,
            	    						"wodeledu.dsls.EduTest.MutatorTests");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleMutatorTests"
    // InternalEduTest.g:129:1: entryRuleMutatorTests returns [EObject current=null] : iv_ruleMutatorTests= ruleMutatorTests EOF ;
    public final EObject entryRuleMutatorTests() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMutatorTests = null;


        try {
            // InternalEduTest.g:129:53: (iv_ruleMutatorTests= ruleMutatorTests EOF )
            // InternalEduTest.g:130:2: iv_ruleMutatorTests= ruleMutatorTests EOF
            {
             newCompositeNode(grammarAccess.getMutatorTestsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMutatorTests=ruleMutatorTests();

            state._fsp--;

             current =iv_ruleMutatorTests; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMutatorTests"


    // $ANTLR start "ruleMutatorTests"
    // InternalEduTest.g:136:1: ruleMutatorTests returns [EObject current=null] : (this_AlternativeResponse_0= ruleAlternativeResponse | this_MultiChoiceDiagram_1= ruleMultiChoiceDiagram | this_MultiChoiceEmendation_2= ruleMultiChoiceEmendation | this_MatchPairs_3= ruleMatchPairs ) ;
    public final EObject ruleMutatorTests() throws RecognitionException {
        EObject current = null;

        EObject this_AlternativeResponse_0 = null;

        EObject this_MultiChoiceDiagram_1 = null;

        EObject this_MultiChoiceEmendation_2 = null;

        EObject this_MatchPairs_3 = null;



        	enterRule();

        try {
            // InternalEduTest.g:142:2: ( (this_AlternativeResponse_0= ruleAlternativeResponse | this_MultiChoiceDiagram_1= ruleMultiChoiceDiagram | this_MultiChoiceEmendation_2= ruleMultiChoiceEmendation | this_MatchPairs_3= ruleMatchPairs ) )
            // InternalEduTest.g:143:2: (this_AlternativeResponse_0= ruleAlternativeResponse | this_MultiChoiceDiagram_1= ruleMultiChoiceDiagram | this_MultiChoiceEmendation_2= ruleMultiChoiceEmendation | this_MatchPairs_3= ruleMatchPairs )
            {
            // InternalEduTest.g:143:2: (this_AlternativeResponse_0= ruleAlternativeResponse | this_MultiChoiceDiagram_1= ruleMultiChoiceDiagram | this_MultiChoiceEmendation_2= ruleMultiChoiceEmendation | this_MatchPairs_3= ruleMatchPairs )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            case 17:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalEduTest.g:144:3: this_AlternativeResponse_0= ruleAlternativeResponse
                    {

                    			newCompositeNode(grammarAccess.getMutatorTestsAccess().getAlternativeResponseParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AlternativeResponse_0=ruleAlternativeResponse();

                    state._fsp--;


                    			current = this_AlternativeResponse_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEduTest.g:153:3: this_MultiChoiceDiagram_1= ruleMultiChoiceDiagram
                    {

                    			newCompositeNode(grammarAccess.getMutatorTestsAccess().getMultiChoiceDiagramParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MultiChoiceDiagram_1=ruleMultiChoiceDiagram();

                    state._fsp--;


                    			current = this_MultiChoiceDiagram_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalEduTest.g:162:3: this_MultiChoiceEmendation_2= ruleMultiChoiceEmendation
                    {

                    			newCompositeNode(grammarAccess.getMutatorTestsAccess().getMultiChoiceEmendationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MultiChoiceEmendation_2=ruleMultiChoiceEmendation();

                    state._fsp--;


                    			current = this_MultiChoiceEmendation_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalEduTest.g:171:3: this_MatchPairs_3= ruleMatchPairs
                    {

                    			newCompositeNode(grammarAccess.getMutatorTestsAccess().getMatchPairsParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_MatchPairs_3=ruleMatchPairs();

                    state._fsp--;


                    			current = this_MatchPairs_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMutatorTests"


    // $ANTLR start "entryRuleAlternativeResponse"
    // InternalEduTest.g:183:1: entryRuleAlternativeResponse returns [EObject current=null] : iv_ruleAlternativeResponse= ruleAlternativeResponse EOF ;
    public final EObject entryRuleAlternativeResponse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternativeResponse = null;


        try {
            // InternalEduTest.g:183:60: (iv_ruleAlternativeResponse= ruleAlternativeResponse EOF )
            // InternalEduTest.g:184:2: iv_ruleAlternativeResponse= ruleAlternativeResponse EOF
            {
             newCompositeNode(grammarAccess.getAlternativeResponseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlternativeResponse=ruleAlternativeResponse();

            state._fsp--;

             current =iv_ruleAlternativeResponse; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlternativeResponse"


    // $ANTLR start "ruleAlternativeResponse"
    // InternalEduTest.g:190:1: ruleAlternativeResponse returns [EObject current=null] : (otherlv_0= 'AlternativeResponse' ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )? otherlv_4= '{' ( (lv_config_5_0= ruleTestConfiguration ) ) ( (lv_tests_6_0= ruleTest ) )* otherlv_7= '}' ) ;
    public final EObject ruleAlternativeResponse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_config_5_0 = null;

        EObject lv_tests_6_0 = null;



        	enterRule();

        try {
            // InternalEduTest.g:196:2: ( (otherlv_0= 'AlternativeResponse' ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )? otherlv_4= '{' ( (lv_config_5_0= ruleTestConfiguration ) ) ( (lv_tests_6_0= ruleTest ) )* otherlv_7= '}' ) )
            // InternalEduTest.g:197:2: (otherlv_0= 'AlternativeResponse' ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )? otherlv_4= '{' ( (lv_config_5_0= ruleTestConfiguration ) ) ( (lv_tests_6_0= ruleTest ) )* otherlv_7= '}' )
            {
            // InternalEduTest.g:197:2: (otherlv_0= 'AlternativeResponse' ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )? otherlv_4= '{' ( (lv_config_5_0= ruleTestConfiguration ) ) ( (lv_tests_6_0= ruleTest ) )* otherlv_7= '}' )
            // InternalEduTest.g:198:3: otherlv_0= 'AlternativeResponse' ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )? otherlv_4= '{' ( (lv_config_5_0= ruleTestConfiguration ) ) ( (lv_tests_6_0= ruleTest ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAlternativeResponseAccess().getAlternativeResponseKeyword_0());
            		
            // InternalEduTest.g:202:3: ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEduTest.g:203:4: ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
                    {
                    // InternalEduTest.g:203:4: ( (otherlv_1= RULE_ID ) )
                    // InternalEduTest.g:204:5: (otherlv_1= RULE_ID )
                    {
                    // InternalEduTest.g:204:5: (otherlv_1= RULE_ID )
                    // InternalEduTest.g:205:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAlternativeResponseRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(otherlv_1, grammarAccess.getAlternativeResponseAccess().getBlocksBlockCrossReference_1_0_0());
                    					

                    }


                    }

                    // InternalEduTest.g:216:4: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==12) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalEduTest.g:217:5: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )
                    	    {
                    	    otherlv_2=(Token)match(input,12,FOLLOW_7); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getAlternativeResponseAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalEduTest.g:221:5: ( (otherlv_3= RULE_ID ) )
                    	    // InternalEduTest.g:222:6: (otherlv_3= RULE_ID )
                    	    {
                    	    // InternalEduTest.g:222:6: (otherlv_3= RULE_ID )
                    	    // InternalEduTest.g:223:7: otherlv_3= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAlternativeResponseRule());
                    	    							}
                    	    						
                    	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

                    	    							newLeafNode(otherlv_3, grammarAccess.getAlternativeResponseAccess().getBlocksBlockCrossReference_1_1_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getAlternativeResponseAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEduTest.g:240:3: ( (lv_config_5_0= ruleTestConfiguration ) )
            // InternalEduTest.g:241:4: (lv_config_5_0= ruleTestConfiguration )
            {
            // InternalEduTest.g:241:4: (lv_config_5_0= ruleTestConfiguration )
            // InternalEduTest.g:242:5: lv_config_5_0= ruleTestConfiguration
            {

            					newCompositeNode(grammarAccess.getAlternativeResponseAccess().getConfigTestConfigurationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_config_5_0=ruleTestConfiguration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlternativeResponseRule());
            					}
            					set(
            						current,
            						"config",
            						lv_config_5_0,
            						"wodeledu.dsls.EduTest.TestConfiguration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEduTest.g:259:3: ( (lv_tests_6_0= ruleTest ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==27) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEduTest.g:260:4: (lv_tests_6_0= ruleTest )
            	    {
            	    // InternalEduTest.g:260:4: (lv_tests_6_0= ruleTest )
            	    // InternalEduTest.g:261:5: lv_tests_6_0= ruleTest
            	    {

            	    					newCompositeNode(grammarAccess.getAlternativeResponseAccess().getTestsTestParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_tests_6_0=ruleTest();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAlternativeResponseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tests",
            	    						lv_tests_6_0,
            	    						"wodeledu.dsls.EduTest.Test");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAlternativeResponseAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlternativeResponse"


    // $ANTLR start "entryRuleMultiChoiceDiagram"
    // InternalEduTest.g:286:1: entryRuleMultiChoiceDiagram returns [EObject current=null] : iv_ruleMultiChoiceDiagram= ruleMultiChoiceDiagram EOF ;
    public final EObject entryRuleMultiChoiceDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiChoiceDiagram = null;


        try {
            // InternalEduTest.g:286:59: (iv_ruleMultiChoiceDiagram= ruleMultiChoiceDiagram EOF )
            // InternalEduTest.g:287:2: iv_ruleMultiChoiceDiagram= ruleMultiChoiceDiagram EOF
            {
             newCompositeNode(grammarAccess.getMultiChoiceDiagramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiChoiceDiagram=ruleMultiChoiceDiagram();

            state._fsp--;

             current =iv_ruleMultiChoiceDiagram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiChoiceDiagram"


    // $ANTLR start "ruleMultiChoiceDiagram"
    // InternalEduTest.g:293:1: ruleMultiChoiceDiagram returns [EObject current=null] : (otherlv_0= 'MultiChoiceDiagram' ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )? otherlv_4= '{' ( (lv_config_5_0= ruleTestConfiguration ) ) ( (lv_tests_6_0= ruleTest ) )* otherlv_7= '}' ) ;
    public final EObject ruleMultiChoiceDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_config_5_0 = null;

        EObject lv_tests_6_0 = null;



        	enterRule();

        try {
            // InternalEduTest.g:299:2: ( (otherlv_0= 'MultiChoiceDiagram' ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )? otherlv_4= '{' ( (lv_config_5_0= ruleTestConfiguration ) ) ( (lv_tests_6_0= ruleTest ) )* otherlv_7= '}' ) )
            // InternalEduTest.g:300:2: (otherlv_0= 'MultiChoiceDiagram' ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )? otherlv_4= '{' ( (lv_config_5_0= ruleTestConfiguration ) ) ( (lv_tests_6_0= ruleTest ) )* otherlv_7= '}' )
            {
            // InternalEduTest.g:300:2: (otherlv_0= 'MultiChoiceDiagram' ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )? otherlv_4= '{' ( (lv_config_5_0= ruleTestConfiguration ) ) ( (lv_tests_6_0= ruleTest ) )* otherlv_7= '}' )
            // InternalEduTest.g:301:3: otherlv_0= 'MultiChoiceDiagram' ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )? otherlv_4= '{' ( (lv_config_5_0= ruleTestConfiguration ) ) ( (lv_tests_6_0= ruleTest ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiChoiceDiagramAccess().getMultiChoiceDiagramKeyword_0());
            		
            // InternalEduTest.g:305:3: ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalEduTest.g:306:4: ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
                    {
                    // InternalEduTest.g:306:4: ( (otherlv_1= RULE_ID ) )
                    // InternalEduTest.g:307:5: (otherlv_1= RULE_ID )
                    {
                    // InternalEduTest.g:307:5: (otherlv_1= RULE_ID )
                    // InternalEduTest.g:308:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMultiChoiceDiagramRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(otherlv_1, grammarAccess.getMultiChoiceDiagramAccess().getBlocksBlockCrossReference_1_0_0());
                    					

                    }


                    }

                    // InternalEduTest.g:319:4: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==12) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalEduTest.g:320:5: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )
                    	    {
                    	    otherlv_2=(Token)match(input,12,FOLLOW_7); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getMultiChoiceDiagramAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalEduTest.g:324:5: ( (otherlv_3= RULE_ID ) )
                    	    // InternalEduTest.g:325:6: (otherlv_3= RULE_ID )
                    	    {
                    	    // InternalEduTest.g:325:6: (otherlv_3= RULE_ID )
                    	    // InternalEduTest.g:326:7: otherlv_3= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getMultiChoiceDiagramRule());
                    	    							}
                    	    						
                    	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

                    	    							newLeafNode(otherlv_3, grammarAccess.getMultiChoiceDiagramAccess().getBlocksBlockCrossReference_1_1_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getMultiChoiceDiagramAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEduTest.g:343:3: ( (lv_config_5_0= ruleTestConfiguration ) )
            // InternalEduTest.g:344:4: (lv_config_5_0= ruleTestConfiguration )
            {
            // InternalEduTest.g:344:4: (lv_config_5_0= ruleTestConfiguration )
            // InternalEduTest.g:345:5: lv_config_5_0= ruleTestConfiguration
            {

            					newCompositeNode(grammarAccess.getMultiChoiceDiagramAccess().getConfigTestConfigurationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_config_5_0=ruleTestConfiguration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiChoiceDiagramRule());
            					}
            					set(
            						current,
            						"config",
            						lv_config_5_0,
            						"wodeledu.dsls.EduTest.TestConfiguration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEduTest.g:362:3: ( (lv_tests_6_0= ruleTest ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalEduTest.g:363:4: (lv_tests_6_0= ruleTest )
            	    {
            	    // InternalEduTest.g:363:4: (lv_tests_6_0= ruleTest )
            	    // InternalEduTest.g:364:5: lv_tests_6_0= ruleTest
            	    {

            	    					newCompositeNode(grammarAccess.getMultiChoiceDiagramAccess().getTestsTestParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_tests_6_0=ruleTest();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMultiChoiceDiagramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tests",
            	    						lv_tests_6_0,
            	    						"wodeledu.dsls.EduTest.Test");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getMultiChoiceDiagramAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiChoiceDiagram"


    // $ANTLR start "entryRuleMultiChoiceEmendation"
    // InternalEduTest.g:389:1: entryRuleMultiChoiceEmendation returns [EObject current=null] : iv_ruleMultiChoiceEmendation= ruleMultiChoiceEmendation EOF ;
    public final EObject entryRuleMultiChoiceEmendation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiChoiceEmendation = null;


        try {
            // InternalEduTest.g:389:62: (iv_ruleMultiChoiceEmendation= ruleMultiChoiceEmendation EOF )
            // InternalEduTest.g:390:2: iv_ruleMultiChoiceEmendation= ruleMultiChoiceEmendation EOF
            {
             newCompositeNode(grammarAccess.getMultiChoiceEmendationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiChoiceEmendation=ruleMultiChoiceEmendation();

            state._fsp--;

             current =iv_ruleMultiChoiceEmendation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiChoiceEmendation"


    // $ANTLR start "ruleMultiChoiceEmendation"
    // InternalEduTest.g:396:1: ruleMultiChoiceEmendation returns [EObject current=null] : (otherlv_0= 'MultiChoiceEmendation' ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )? otherlv_4= '{' ( (lv_config_5_0= ruleMultiChoiceEmConfig ) ) ( (lv_tests_6_0= ruleTest ) )* otherlv_7= '}' ) ;
    public final EObject ruleMultiChoiceEmendation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_config_5_0 = null;

        EObject lv_tests_6_0 = null;



        	enterRule();

        try {
            // InternalEduTest.g:402:2: ( (otherlv_0= 'MultiChoiceEmendation' ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )? otherlv_4= '{' ( (lv_config_5_0= ruleMultiChoiceEmConfig ) ) ( (lv_tests_6_0= ruleTest ) )* otherlv_7= '}' ) )
            // InternalEduTest.g:403:2: (otherlv_0= 'MultiChoiceEmendation' ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )? otherlv_4= '{' ( (lv_config_5_0= ruleMultiChoiceEmConfig ) ) ( (lv_tests_6_0= ruleTest ) )* otherlv_7= '}' )
            {
            // InternalEduTest.g:403:2: (otherlv_0= 'MultiChoiceEmendation' ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )? otherlv_4= '{' ( (lv_config_5_0= ruleMultiChoiceEmConfig ) ) ( (lv_tests_6_0= ruleTest ) )* otherlv_7= '}' )
            // InternalEduTest.g:404:3: otherlv_0= 'MultiChoiceEmendation' ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )? otherlv_4= '{' ( (lv_config_5_0= ruleMultiChoiceEmConfig ) ) ( (lv_tests_6_0= ruleTest ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiChoiceEmendationAccess().getMultiChoiceEmendationKeyword_0());
            		
            // InternalEduTest.g:408:3: ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalEduTest.g:409:4: ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
                    {
                    // InternalEduTest.g:409:4: ( (otherlv_1= RULE_ID ) )
                    // InternalEduTest.g:410:5: (otherlv_1= RULE_ID )
                    {
                    // InternalEduTest.g:410:5: (otherlv_1= RULE_ID )
                    // InternalEduTest.g:411:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMultiChoiceEmendationRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(otherlv_1, grammarAccess.getMultiChoiceEmendationAccess().getBlocksBlockCrossReference_1_0_0());
                    					

                    }


                    }

                    // InternalEduTest.g:422:4: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==12) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalEduTest.g:423:5: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )
                    	    {
                    	    otherlv_2=(Token)match(input,12,FOLLOW_7); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getMultiChoiceEmendationAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalEduTest.g:427:5: ( (otherlv_3= RULE_ID ) )
                    	    // InternalEduTest.g:428:6: (otherlv_3= RULE_ID )
                    	    {
                    	    // InternalEduTest.g:428:6: (otherlv_3= RULE_ID )
                    	    // InternalEduTest.g:429:7: otherlv_3= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getMultiChoiceEmendationRule());
                    	    							}
                    	    						
                    	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

                    	    							newLeafNode(otherlv_3, grammarAccess.getMultiChoiceEmendationAccess().getBlocksBlockCrossReference_1_1_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getMultiChoiceEmendationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEduTest.g:446:3: ( (lv_config_5_0= ruleMultiChoiceEmConfig ) )
            // InternalEduTest.g:447:4: (lv_config_5_0= ruleMultiChoiceEmConfig )
            {
            // InternalEduTest.g:447:4: (lv_config_5_0= ruleMultiChoiceEmConfig )
            // InternalEduTest.g:448:5: lv_config_5_0= ruleMultiChoiceEmConfig
            {

            					newCompositeNode(grammarAccess.getMultiChoiceEmendationAccess().getConfigMultiChoiceEmConfigParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_config_5_0=ruleMultiChoiceEmConfig();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiChoiceEmendationRule());
            					}
            					set(
            						current,
            						"config",
            						lv_config_5_0,
            						"wodeledu.dsls.EduTest.MultiChoiceEmConfig");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEduTest.g:465:3: ( (lv_tests_6_0= ruleTest ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalEduTest.g:466:4: (lv_tests_6_0= ruleTest )
            	    {
            	    // InternalEduTest.g:466:4: (lv_tests_6_0= ruleTest )
            	    // InternalEduTest.g:467:5: lv_tests_6_0= ruleTest
            	    {

            	    					newCompositeNode(grammarAccess.getMultiChoiceEmendationAccess().getTestsTestParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_tests_6_0=ruleTest();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMultiChoiceEmendationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tests",
            	    						lv_tests_6_0,
            	    						"wodeledu.dsls.EduTest.Test");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getMultiChoiceEmendationAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiChoiceEmendation"


    // $ANTLR start "entryRuleMatchPairs"
    // InternalEduTest.g:492:1: entryRuleMatchPairs returns [EObject current=null] : iv_ruleMatchPairs= ruleMatchPairs EOF ;
    public final EObject entryRuleMatchPairs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchPairs = null;


        try {
            // InternalEduTest.g:492:51: (iv_ruleMatchPairs= ruleMatchPairs EOF )
            // InternalEduTest.g:493:2: iv_ruleMatchPairs= ruleMatchPairs EOF
            {
             newCompositeNode(grammarAccess.getMatchPairsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMatchPairs=ruleMatchPairs();

            state._fsp--;

             current =iv_ruleMatchPairs; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMatchPairs"


    // $ANTLR start "ruleMatchPairs"
    // InternalEduTest.g:499:1: ruleMatchPairs returns [EObject current=null] : (otherlv_0= 'MatchPairs' ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )? otherlv_4= '{' ( (lv_config_5_0= ruleTestConfiguration ) ) ( (lv_tests_6_0= ruleTest ) )* otherlv_7= '}' ) ;
    public final EObject ruleMatchPairs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_config_5_0 = null;

        EObject lv_tests_6_0 = null;



        	enterRule();

        try {
            // InternalEduTest.g:505:2: ( (otherlv_0= 'MatchPairs' ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )? otherlv_4= '{' ( (lv_config_5_0= ruleTestConfiguration ) ) ( (lv_tests_6_0= ruleTest ) )* otherlv_7= '}' ) )
            // InternalEduTest.g:506:2: (otherlv_0= 'MatchPairs' ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )? otherlv_4= '{' ( (lv_config_5_0= ruleTestConfiguration ) ) ( (lv_tests_6_0= ruleTest ) )* otherlv_7= '}' )
            {
            // InternalEduTest.g:506:2: (otherlv_0= 'MatchPairs' ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )? otherlv_4= '{' ( (lv_config_5_0= ruleTestConfiguration ) ) ( (lv_tests_6_0= ruleTest ) )* otherlv_7= '}' )
            // InternalEduTest.g:507:3: otherlv_0= 'MatchPairs' ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )? otherlv_4= '{' ( (lv_config_5_0= ruleTestConfiguration ) ) ( (lv_tests_6_0= ruleTest ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMatchPairsAccess().getMatchPairsKeyword_0());
            		
            // InternalEduTest.g:511:3: ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalEduTest.g:512:4: ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
                    {
                    // InternalEduTest.g:512:4: ( (otherlv_1= RULE_ID ) )
                    // InternalEduTest.g:513:5: (otherlv_1= RULE_ID )
                    {
                    // InternalEduTest.g:513:5: (otherlv_1= RULE_ID )
                    // InternalEduTest.g:514:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMatchPairsRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(otherlv_1, grammarAccess.getMatchPairsAccess().getBlocksBlockCrossReference_1_0_0());
                    					

                    }


                    }

                    // InternalEduTest.g:525:4: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==12) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalEduTest.g:526:5: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )
                    	    {
                    	    otherlv_2=(Token)match(input,12,FOLLOW_7); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getMatchPairsAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalEduTest.g:530:5: ( (otherlv_3= RULE_ID ) )
                    	    // InternalEduTest.g:531:6: (otherlv_3= RULE_ID )
                    	    {
                    	    // InternalEduTest.g:531:6: (otherlv_3= RULE_ID )
                    	    // InternalEduTest.g:532:7: otherlv_3= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getMatchPairsRule());
                    	    							}
                    	    						
                    	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

                    	    							newLeafNode(otherlv_3, grammarAccess.getMatchPairsAccess().getBlocksBlockCrossReference_1_1_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getMatchPairsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEduTest.g:549:3: ( (lv_config_5_0= ruleTestConfiguration ) )
            // InternalEduTest.g:550:4: (lv_config_5_0= ruleTestConfiguration )
            {
            // InternalEduTest.g:550:4: (lv_config_5_0= ruleTestConfiguration )
            // InternalEduTest.g:551:5: lv_config_5_0= ruleTestConfiguration
            {

            					newCompositeNode(grammarAccess.getMatchPairsAccess().getConfigTestConfigurationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_config_5_0=ruleTestConfiguration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMatchPairsRule());
            					}
            					set(
            						current,
            						"config",
            						lv_config_5_0,
            						"wodeledu.dsls.EduTest.TestConfiguration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEduTest.g:568:3: ( (lv_tests_6_0= ruleTest ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==27) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalEduTest.g:569:4: (lv_tests_6_0= ruleTest )
            	    {
            	    // InternalEduTest.g:569:4: (lv_tests_6_0= ruleTest )
            	    // InternalEduTest.g:570:5: lv_tests_6_0= ruleTest
            	    {

            	    					newCompositeNode(grammarAccess.getMatchPairsAccess().getTestsTestParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_tests_6_0=ruleTest();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMatchPairsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tests",
            	    						lv_tests_6_0,
            	    						"wodeledu.dsls.EduTest.Test");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getMatchPairsAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMatchPairs"


    // $ANTLR start "entryRuleProgramConfiguration"
    // InternalEduTest.g:595:1: entryRuleProgramConfiguration returns [EObject current=null] : iv_ruleProgramConfiguration= ruleProgramConfiguration EOF ;
    public final EObject entryRuleProgramConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgramConfiguration = null;


        try {
            // InternalEduTest.g:595:61: (iv_ruleProgramConfiguration= ruleProgramConfiguration EOF )
            // InternalEduTest.g:596:2: iv_ruleProgramConfiguration= ruleProgramConfiguration EOF
            {
             newCompositeNode(grammarAccess.getProgramConfigurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgramConfiguration=ruleProgramConfiguration();

            state._fsp--;

             current =iv_ruleProgramConfiguration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgramConfiguration"


    // $ANTLR start "ruleProgramConfiguration"
    // InternalEduTest.g:602:1: ruleProgramConfiguration returns [EObject current=null] : (otherlv_0= 'navigation' otherlv_1= '=' ( (lv_navigation_2_0= ruleNavigation ) ) ) ;
    public final EObject ruleProgramConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_navigation_2_0 = null;



        	enterRule();

        try {
            // InternalEduTest.g:608:2: ( (otherlv_0= 'navigation' otherlv_1= '=' ( (lv_navigation_2_0= ruleNavigation ) ) ) )
            // InternalEduTest.g:609:2: (otherlv_0= 'navigation' otherlv_1= '=' ( (lv_navigation_2_0= ruleNavigation ) ) )
            {
            // InternalEduTest.g:609:2: (otherlv_0= 'navigation' otherlv_1= '=' ( (lv_navigation_2_0= ruleNavigation ) ) )
            // InternalEduTest.g:610:3: otherlv_0= 'navigation' otherlv_1= '=' ( (lv_navigation_2_0= ruleNavigation ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getProgramConfigurationAccess().getNavigationKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getProgramConfigurationAccess().getEqualsSignKeyword_1());
            		
            // InternalEduTest.g:618:3: ( (lv_navigation_2_0= ruleNavigation ) )
            // InternalEduTest.g:619:4: (lv_navigation_2_0= ruleNavigation )
            {
            // InternalEduTest.g:619:4: (lv_navigation_2_0= ruleNavigation )
            // InternalEduTest.g:620:5: lv_navigation_2_0= ruleNavigation
            {

            					newCompositeNode(grammarAccess.getProgramConfigurationAccess().getNavigationNavigationEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_navigation_2_0=ruleNavigation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramConfigurationRule());
            					}
            					set(
            						current,
            						"navigation",
            						lv_navigation_2_0,
            						"wodeledu.dsls.EduTest.Navigation");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgramConfiguration"


    // $ANTLR start "entryRuleTestConfiguration"
    // InternalEduTest.g:641:1: entryRuleTestConfiguration returns [EObject current=null] : iv_ruleTestConfiguration= ruleTestConfiguration EOF ;
    public final EObject entryRuleTestConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestConfiguration = null;


        try {
            // InternalEduTest.g:641:58: (iv_ruleTestConfiguration= ruleTestConfiguration EOF )
            // InternalEduTest.g:642:2: iv_ruleTestConfiguration= ruleTestConfiguration EOF
            {
             newCompositeNode(grammarAccess.getTestConfigurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestConfiguration=ruleTestConfiguration();

            state._fsp--;

             current =iv_ruleTestConfiguration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTestConfiguration"


    // $ANTLR start "ruleTestConfiguration"
    // InternalEduTest.g:648:1: ruleTestConfiguration returns [EObject current=null] : ( () otherlv_1= 'retry' otherlv_2= '=' ( ( (lv_retry_3_1= 'yes' | lv_retry_3_2= 'no' ) ) ) ) ;
    public final EObject ruleTestConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_retry_3_1=null;
        Token lv_retry_3_2=null;


        	enterRule();

        try {
            // InternalEduTest.g:654:2: ( ( () otherlv_1= 'retry' otherlv_2= '=' ( ( (lv_retry_3_1= 'yes' | lv_retry_3_2= 'no' ) ) ) ) )
            // InternalEduTest.g:655:2: ( () otherlv_1= 'retry' otherlv_2= '=' ( ( (lv_retry_3_1= 'yes' | lv_retry_3_2= 'no' ) ) ) )
            {
            // InternalEduTest.g:655:2: ( () otherlv_1= 'retry' otherlv_2= '=' ( ( (lv_retry_3_1= 'yes' | lv_retry_3_2= 'no' ) ) ) )
            // InternalEduTest.g:656:3: () otherlv_1= 'retry' otherlv_2= '=' ( ( (lv_retry_3_1= 'yes' | lv_retry_3_2= 'no' ) ) )
            {
            // InternalEduTest.g:656:3: ()
            // InternalEduTest.g:657:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTestConfigurationAccess().getTestConfigurationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getTestConfigurationAccess().getRetryKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getTestConfigurationAccess().getEqualsSignKeyword_2());
            		
            // InternalEduTest.g:671:3: ( ( (lv_retry_3_1= 'yes' | lv_retry_3_2= 'no' ) ) )
            // InternalEduTest.g:672:4: ( (lv_retry_3_1= 'yes' | lv_retry_3_2= 'no' ) )
            {
            // InternalEduTest.g:672:4: ( (lv_retry_3_1= 'yes' | lv_retry_3_2= 'no' ) )
            // InternalEduTest.g:673:5: (lv_retry_3_1= 'yes' | lv_retry_3_2= 'no' )
            {
            // InternalEduTest.g:673:5: (lv_retry_3_1= 'yes' | lv_retry_3_2= 'no' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            else if ( (LA16_0==22) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalEduTest.g:674:6: lv_retry_3_1= 'yes'
                    {
                    lv_retry_3_1=(Token)match(input,21,FOLLOW_2); 

                    						newLeafNode(lv_retry_3_1, grammarAccess.getTestConfigurationAccess().getRetryYesKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTestConfigurationRule());
                    						}
                    						setWithLastConsumed(current, "retry", true, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalEduTest.g:685:6: lv_retry_3_2= 'no'
                    {
                    lv_retry_3_2=(Token)match(input,22,FOLLOW_2); 

                    						newLeafNode(lv_retry_3_2, grammarAccess.getTestConfigurationAccess().getRetryNoKeyword_3_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTestConfigurationRule());
                    						}
                    						setWithLastConsumed(current, "retry", true, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTestConfiguration"


    // $ANTLR start "entryRuleMultiChoiceEmConfig"
    // InternalEduTest.g:702:1: entryRuleMultiChoiceEmConfig returns [EObject current=null] : iv_ruleMultiChoiceEmConfig= ruleMultiChoiceEmConfig EOF ;
    public final EObject entryRuleMultiChoiceEmConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiChoiceEmConfig = null;


        try {
            // InternalEduTest.g:702:60: (iv_ruleMultiChoiceEmConfig= ruleMultiChoiceEmConfig EOF )
            // InternalEduTest.g:703:2: iv_ruleMultiChoiceEmConfig= ruleMultiChoiceEmConfig EOF
            {
             newCompositeNode(grammarAccess.getMultiChoiceEmConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiChoiceEmConfig=ruleMultiChoiceEmConfig();

            state._fsp--;

             current =iv_ruleMultiChoiceEmConfig; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiChoiceEmConfig"


    // $ANTLR start "ruleMultiChoiceEmConfig"
    // InternalEduTest.g:709:1: ruleMultiChoiceEmConfig returns [EObject current=null] : ( () otherlv_1= 'retry' otherlv_2= '=' ( ( (lv_retry_3_1= 'yes' | lv_retry_3_2= 'no' ) ) ) otherlv_4= ',' otherlv_5= 'weighted' otherlv_6= '=' ( ( (lv_weighted_7_1= 'yes' | lv_weighted_7_2= 'no' ) ) ) otherlv_8= ',' otherlv_9= 'penalty' otherlv_10= '=' ( (lv_penalty_11_0= ruleEDouble ) ) otherlv_12= ',' otherlv_13= 'order' otherlv_14= '=' ( (lv_order_15_0= ruleOrder ) ) otherlv_16= ',' otherlv_17= 'mode' otherlv_18= '=' ( (lv_mode_19_0= ruleMode ) ) ) ;
    public final EObject ruleMultiChoiceEmConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_retry_3_1=null;
        Token lv_retry_3_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_weighted_7_1=null;
        Token lv_weighted_7_2=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_penalty_11_0 = null;

        Enumerator lv_order_15_0 = null;

        Enumerator lv_mode_19_0 = null;



        	enterRule();

        try {
            // InternalEduTest.g:715:2: ( ( () otherlv_1= 'retry' otherlv_2= '=' ( ( (lv_retry_3_1= 'yes' | lv_retry_3_2= 'no' ) ) ) otherlv_4= ',' otherlv_5= 'weighted' otherlv_6= '=' ( ( (lv_weighted_7_1= 'yes' | lv_weighted_7_2= 'no' ) ) ) otherlv_8= ',' otherlv_9= 'penalty' otherlv_10= '=' ( (lv_penalty_11_0= ruleEDouble ) ) otherlv_12= ',' otherlv_13= 'order' otherlv_14= '=' ( (lv_order_15_0= ruleOrder ) ) otherlv_16= ',' otherlv_17= 'mode' otherlv_18= '=' ( (lv_mode_19_0= ruleMode ) ) ) )
            // InternalEduTest.g:716:2: ( () otherlv_1= 'retry' otherlv_2= '=' ( ( (lv_retry_3_1= 'yes' | lv_retry_3_2= 'no' ) ) ) otherlv_4= ',' otherlv_5= 'weighted' otherlv_6= '=' ( ( (lv_weighted_7_1= 'yes' | lv_weighted_7_2= 'no' ) ) ) otherlv_8= ',' otherlv_9= 'penalty' otherlv_10= '=' ( (lv_penalty_11_0= ruleEDouble ) ) otherlv_12= ',' otherlv_13= 'order' otherlv_14= '=' ( (lv_order_15_0= ruleOrder ) ) otherlv_16= ',' otherlv_17= 'mode' otherlv_18= '=' ( (lv_mode_19_0= ruleMode ) ) )
            {
            // InternalEduTest.g:716:2: ( () otherlv_1= 'retry' otherlv_2= '=' ( ( (lv_retry_3_1= 'yes' | lv_retry_3_2= 'no' ) ) ) otherlv_4= ',' otherlv_5= 'weighted' otherlv_6= '=' ( ( (lv_weighted_7_1= 'yes' | lv_weighted_7_2= 'no' ) ) ) otherlv_8= ',' otherlv_9= 'penalty' otherlv_10= '=' ( (lv_penalty_11_0= ruleEDouble ) ) otherlv_12= ',' otherlv_13= 'order' otherlv_14= '=' ( (lv_order_15_0= ruleOrder ) ) otherlv_16= ',' otherlv_17= 'mode' otherlv_18= '=' ( (lv_mode_19_0= ruleMode ) ) )
            // InternalEduTest.g:717:3: () otherlv_1= 'retry' otherlv_2= '=' ( ( (lv_retry_3_1= 'yes' | lv_retry_3_2= 'no' ) ) ) otherlv_4= ',' otherlv_5= 'weighted' otherlv_6= '=' ( ( (lv_weighted_7_1= 'yes' | lv_weighted_7_2= 'no' ) ) ) otherlv_8= ',' otherlv_9= 'penalty' otherlv_10= '=' ( (lv_penalty_11_0= ruleEDouble ) ) otherlv_12= ',' otherlv_13= 'order' otherlv_14= '=' ( (lv_order_15_0= ruleOrder ) ) otherlv_16= ',' otherlv_17= 'mode' otherlv_18= '=' ( (lv_mode_19_0= ruleMode ) )
            {
            // InternalEduTest.g:717:3: ()
            // InternalEduTest.g:718:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMultiChoiceEmConfigAccess().getMultiChoiceEmConfigAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getMultiChoiceEmConfigAccess().getRetryKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getMultiChoiceEmConfigAccess().getEqualsSignKeyword_2());
            		
            // InternalEduTest.g:732:3: ( ( (lv_retry_3_1= 'yes' | lv_retry_3_2= 'no' ) ) )
            // InternalEduTest.g:733:4: ( (lv_retry_3_1= 'yes' | lv_retry_3_2= 'no' ) )
            {
            // InternalEduTest.g:733:4: ( (lv_retry_3_1= 'yes' | lv_retry_3_2= 'no' ) )
            // InternalEduTest.g:734:5: (lv_retry_3_1= 'yes' | lv_retry_3_2= 'no' )
            {
            // InternalEduTest.g:734:5: (lv_retry_3_1= 'yes' | lv_retry_3_2= 'no' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            else if ( (LA17_0==22) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalEduTest.g:735:6: lv_retry_3_1= 'yes'
                    {
                    lv_retry_3_1=(Token)match(input,21,FOLLOW_13); 

                    						newLeafNode(lv_retry_3_1, grammarAccess.getMultiChoiceEmConfigAccess().getRetryYesKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMultiChoiceEmConfigRule());
                    						}
                    						setWithLastConsumed(current, "retry", true, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalEduTest.g:746:6: lv_retry_3_2= 'no'
                    {
                    lv_retry_3_2=(Token)match(input,22,FOLLOW_13); 

                    						newLeafNode(lv_retry_3_2, grammarAccess.getMultiChoiceEmConfigAccess().getRetryNoKeyword_3_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMultiChoiceEmConfigRule());
                    						}
                    						setWithLastConsumed(current, "retry", true, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getMultiChoiceEmConfigAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getMultiChoiceEmConfigAccess().getWeightedKeyword_5());
            		
            otherlv_6=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getMultiChoiceEmConfigAccess().getEqualsSignKeyword_6());
            		
            // InternalEduTest.g:771:3: ( ( (lv_weighted_7_1= 'yes' | lv_weighted_7_2= 'no' ) ) )
            // InternalEduTest.g:772:4: ( (lv_weighted_7_1= 'yes' | lv_weighted_7_2= 'no' ) )
            {
            // InternalEduTest.g:772:4: ( (lv_weighted_7_1= 'yes' | lv_weighted_7_2= 'no' ) )
            // InternalEduTest.g:773:5: (lv_weighted_7_1= 'yes' | lv_weighted_7_2= 'no' )
            {
            // InternalEduTest.g:773:5: (lv_weighted_7_1= 'yes' | lv_weighted_7_2= 'no' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==21) ) {
                alt18=1;
            }
            else if ( (LA18_0==22) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalEduTest.g:774:6: lv_weighted_7_1= 'yes'
                    {
                    lv_weighted_7_1=(Token)match(input,21,FOLLOW_13); 

                    						newLeafNode(lv_weighted_7_1, grammarAccess.getMultiChoiceEmConfigAccess().getWeightedYesKeyword_7_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMultiChoiceEmConfigRule());
                    						}
                    						setWithLastConsumed(current, "weighted", true, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalEduTest.g:785:6: lv_weighted_7_2= 'no'
                    {
                    lv_weighted_7_2=(Token)match(input,22,FOLLOW_13); 

                    						newLeafNode(lv_weighted_7_2, grammarAccess.getMultiChoiceEmConfigAccess().getWeightedNoKeyword_7_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMultiChoiceEmConfigRule());
                    						}
                    						setWithLastConsumed(current, "weighted", true, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_8=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_8, grammarAccess.getMultiChoiceEmConfigAccess().getCommaKeyword_8());
            		
            otherlv_9=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getMultiChoiceEmConfigAccess().getPenaltyKeyword_9());
            		
            otherlv_10=(Token)match(input,19,FOLLOW_16); 

            			newLeafNode(otherlv_10, grammarAccess.getMultiChoiceEmConfigAccess().getEqualsSignKeyword_10());
            		
            // InternalEduTest.g:810:3: ( (lv_penalty_11_0= ruleEDouble ) )
            // InternalEduTest.g:811:4: (lv_penalty_11_0= ruleEDouble )
            {
            // InternalEduTest.g:811:4: (lv_penalty_11_0= ruleEDouble )
            // InternalEduTest.g:812:5: lv_penalty_11_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getMultiChoiceEmConfigAccess().getPenaltyEDoubleParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_13);
            lv_penalty_11_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiChoiceEmConfigRule());
            					}
            					set(
            						current,
            						"penalty",
            						lv_penalty_11_0,
            						"wodeledu.dsls.EduTest.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_12, grammarAccess.getMultiChoiceEmConfigAccess().getCommaKeyword_12());
            		
            otherlv_13=(Token)match(input,25,FOLLOW_10); 

            			newLeafNode(otherlv_13, grammarAccess.getMultiChoiceEmConfigAccess().getOrderKeyword_13());
            		
            otherlv_14=(Token)match(input,19,FOLLOW_18); 

            			newLeafNode(otherlv_14, grammarAccess.getMultiChoiceEmConfigAccess().getEqualsSignKeyword_14());
            		
            // InternalEduTest.g:841:3: ( (lv_order_15_0= ruleOrder ) )
            // InternalEduTest.g:842:4: (lv_order_15_0= ruleOrder )
            {
            // InternalEduTest.g:842:4: (lv_order_15_0= ruleOrder )
            // InternalEduTest.g:843:5: lv_order_15_0= ruleOrder
            {

            					newCompositeNode(grammarAccess.getMultiChoiceEmConfigAccess().getOrderOrderEnumRuleCall_15_0());
            				
            pushFollow(FOLLOW_13);
            lv_order_15_0=ruleOrder();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiChoiceEmConfigRule());
            					}
            					set(
            						current,
            						"order",
            						lv_order_15_0,
            						"wodeledu.dsls.EduTest.Order");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_16=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_16, grammarAccess.getMultiChoiceEmConfigAccess().getCommaKeyword_16());
            		
            otherlv_17=(Token)match(input,26,FOLLOW_10); 

            			newLeafNode(otherlv_17, grammarAccess.getMultiChoiceEmConfigAccess().getModeKeyword_17());
            		
            otherlv_18=(Token)match(input,19,FOLLOW_20); 

            			newLeafNode(otherlv_18, grammarAccess.getMultiChoiceEmConfigAccess().getEqualsSignKeyword_18());
            		
            // InternalEduTest.g:872:3: ( (lv_mode_19_0= ruleMode ) )
            // InternalEduTest.g:873:4: (lv_mode_19_0= ruleMode )
            {
            // InternalEduTest.g:873:4: (lv_mode_19_0= ruleMode )
            // InternalEduTest.g:874:5: lv_mode_19_0= ruleMode
            {

            					newCompositeNode(grammarAccess.getMultiChoiceEmConfigAccess().getModeModeEnumRuleCall_19_0());
            				
            pushFollow(FOLLOW_2);
            lv_mode_19_0=ruleMode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiChoiceEmConfigRule());
            					}
            					set(
            						current,
            						"mode",
            						lv_mode_19_0,
            						"wodeledu.dsls.EduTest.Mode");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiChoiceEmConfig"


    // $ANTLR start "entryRuleTest"
    // InternalEduTest.g:895:1: entryRuleTest returns [EObject current=null] : iv_ruleTest= ruleTest EOF ;
    public final EObject entryRuleTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTest = null;


        try {
            // InternalEduTest.g:895:45: (iv_ruleTest= ruleTest EOF )
            // InternalEduTest.g:896:2: iv_ruleTest= ruleTest EOF
            {
             newCompositeNode(grammarAccess.getTestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTest=ruleTest();

            state._fsp--;

             current =iv_ruleTest; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTest"


    // $ANTLR start "ruleTest"
    // InternalEduTest.g:902:1: ruleTest returns [EObject current=null] : (otherlv_0= 'description' otherlv_1= 'for' ( (lv_source_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_question_4_0= ruleEString ) ) ( (lv_expression_5_0= '%text' ) )? ) ;
    public final EObject ruleTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_expression_5_0=null;
        AntlrDatatypeRuleToken lv_source_2_0 = null;

        AntlrDatatypeRuleToken lv_question_4_0 = null;



        	enterRule();

        try {
            // InternalEduTest.g:908:2: ( (otherlv_0= 'description' otherlv_1= 'for' ( (lv_source_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_question_4_0= ruleEString ) ) ( (lv_expression_5_0= '%text' ) )? ) )
            // InternalEduTest.g:909:2: (otherlv_0= 'description' otherlv_1= 'for' ( (lv_source_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_question_4_0= ruleEString ) ) ( (lv_expression_5_0= '%text' ) )? )
            {
            // InternalEduTest.g:909:2: (otherlv_0= 'description' otherlv_1= 'for' ( (lv_source_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_question_4_0= ruleEString ) ) ( (lv_expression_5_0= '%text' ) )? )
            // InternalEduTest.g:910:3: otherlv_0= 'description' otherlv_1= 'for' ( (lv_source_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_question_4_0= ruleEString ) ) ( (lv_expression_5_0= '%text' ) )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getTestAccess().getDescriptionKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getTestAccess().getForKeyword_1());
            		
            // InternalEduTest.g:918:3: ( (lv_source_2_0= ruleEString ) )
            // InternalEduTest.g:919:4: (lv_source_2_0= ruleEString )
            {
            // InternalEduTest.g:919:4: (lv_source_2_0= ruleEString )
            // InternalEduTest.g:920:5: lv_source_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTestAccess().getSourceEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_source_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestRule());
            					}
            					set(
            						current,
            						"source",
            						lv_source_2_0,
            						"wodeledu.dsls.EduTest.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getTestAccess().getEqualsSignKeyword_3());
            		
            // InternalEduTest.g:941:3: ( (lv_question_4_0= ruleEString ) )
            // InternalEduTest.g:942:4: (lv_question_4_0= ruleEString )
            {
            // InternalEduTest.g:942:4: (lv_question_4_0= ruleEString )
            // InternalEduTest.g:943:5: lv_question_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTestAccess().getQuestionEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_23);
            lv_question_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestRule());
            					}
            					set(
            						current,
            						"question",
            						lv_question_4_0,
            						"wodeledu.dsls.EduTest.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEduTest.g:960:3: ( (lv_expression_5_0= '%text' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalEduTest.g:961:4: (lv_expression_5_0= '%text' )
                    {
                    // InternalEduTest.g:961:4: (lv_expression_5_0= '%text' )
                    // InternalEduTest.g:962:5: lv_expression_5_0= '%text'
                    {
                    lv_expression_5_0=(Token)match(input,29,FOLLOW_2); 

                    					newLeafNode(lv_expression_5_0, grammarAccess.getTestAccess().getExpressionTextKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTestRule());
                    					}
                    					setWithLastConsumed(current, "expression", true, "%text");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTest"


    // $ANTLR start "entryRuleEString"
    // InternalEduTest.g:978:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalEduTest.g:978:47: (iv_ruleEString= ruleEString EOF )
            // InternalEduTest.g:979:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalEduTest.g:985:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalEduTest.g:991:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalEduTest.g:992:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalEduTest.g:992:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_ID) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalEduTest.g:993:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEduTest.g:1001:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEDouble"
    // InternalEduTest.g:1012:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalEduTest.g:1012:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalEduTest.g:1013:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalEduTest.g:1019:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalEduTest.g:1025:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalEduTest.g:1026:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalEduTest.g:1026:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalEduTest.g:1027:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalEduTest.g:1027:3: (kw= '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalEduTest.g:1028:4: kw= '-'
                    {
                    kw=(Token)match(input,30,FOLLOW_24); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalEduTest.g:1034:3: (this_INT_1= RULE_INT )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_INT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalEduTest.g:1035:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_25); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,31,FOLLOW_26); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_27); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalEduTest.g:1055:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=32 && LA25_0<=33)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalEduTest.g:1056:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalEduTest.g:1056:4: (kw= 'E' | kw= 'e' )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==32) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==33) ) {
                        alt23=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalEduTest.g:1057:5: kw= 'E'
                            {
                            kw=(Token)match(input,32,FOLLOW_28); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalEduTest.g:1063:5: kw= 'e'
                            {
                            kw=(Token)match(input,33,FOLLOW_28); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalEduTest.g:1069:4: (kw= '-' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==30) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalEduTest.g:1070:5: kw= '-'
                            {
                            kw=(Token)match(input,30,FOLLOW_26); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "ruleOrder"
    // InternalEduTest.g:1088:1: ruleOrder returns [Enumerator current=null] : ( (enumLiteral_0= 'fixed' ) | (enumLiteral_1= 'random' ) | (enumLiteral_2= 'options-ascending' ) | (enumLiteral_3= 'options-descending' ) ) ;
    public final Enumerator ruleOrder() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalEduTest.g:1094:2: ( ( (enumLiteral_0= 'fixed' ) | (enumLiteral_1= 'random' ) | (enumLiteral_2= 'options-ascending' ) | (enumLiteral_3= 'options-descending' ) ) )
            // InternalEduTest.g:1095:2: ( (enumLiteral_0= 'fixed' ) | (enumLiteral_1= 'random' ) | (enumLiteral_2= 'options-ascending' ) | (enumLiteral_3= 'options-descending' ) )
            {
            // InternalEduTest.g:1095:2: ( (enumLiteral_0= 'fixed' ) | (enumLiteral_1= 'random' ) | (enumLiteral_2= 'options-ascending' ) | (enumLiteral_3= 'options-descending' ) )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt26=1;
                }
                break;
            case 35:
                {
                alt26=2;
                }
                break;
            case 36:
                {
                alt26=3;
                }
                break;
            case 37:
                {
                alt26=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalEduTest.g:1096:3: (enumLiteral_0= 'fixed' )
                    {
                    // InternalEduTest.g:1096:3: (enumLiteral_0= 'fixed' )
                    // InternalEduTest.g:1097:4: enumLiteral_0= 'fixed'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getOrderAccess().getFixedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOrderAccess().getFixedEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEduTest.g:1104:3: (enumLiteral_1= 'random' )
                    {
                    // InternalEduTest.g:1104:3: (enumLiteral_1= 'random' )
                    // InternalEduTest.g:1105:4: enumLiteral_1= 'random'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getOrderAccess().getRandomEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOrderAccess().getRandomEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEduTest.g:1112:3: (enumLiteral_2= 'options-ascending' )
                    {
                    // InternalEduTest.g:1112:3: (enumLiteral_2= 'options-ascending' )
                    // InternalEduTest.g:1113:4: enumLiteral_2= 'options-ascending'
                    {
                    enumLiteral_2=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getOrderAccess().getAscendingEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOrderAccess().getAscendingEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalEduTest.g:1120:3: (enumLiteral_3= 'options-descending' )
                    {
                    // InternalEduTest.g:1120:3: (enumLiteral_3= 'options-descending' )
                    // InternalEduTest.g:1121:4: enumLiteral_3= 'options-descending'
                    {
                    enumLiteral_3=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getOrderAccess().getDescendingEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOrderAccess().getDescendingEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrder"


    // $ANTLR start "ruleMode"
    // InternalEduTest.g:1131:1: ruleMode returns [Enumerator current=null] : ( (enumLiteral_0= 'radiobutton' ) | (enumLiteral_1= 'checkbox' ) ) ;
    public final Enumerator ruleMode() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalEduTest.g:1137:2: ( ( (enumLiteral_0= 'radiobutton' ) | (enumLiteral_1= 'checkbox' ) ) )
            // InternalEduTest.g:1138:2: ( (enumLiteral_0= 'radiobutton' ) | (enumLiteral_1= 'checkbox' ) )
            {
            // InternalEduTest.g:1138:2: ( (enumLiteral_0= 'radiobutton' ) | (enumLiteral_1= 'checkbox' ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==38) ) {
                alt27=1;
            }
            else if ( (LA27_0==39) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalEduTest.g:1139:3: (enumLiteral_0= 'radiobutton' )
                    {
                    // InternalEduTest.g:1139:3: (enumLiteral_0= 'radiobutton' )
                    // InternalEduTest.g:1140:4: enumLiteral_0= 'radiobutton'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getModeAccess().getRadiobuttonEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getModeAccess().getRadiobuttonEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEduTest.g:1147:3: (enumLiteral_1= 'checkbox' )
                    {
                    // InternalEduTest.g:1147:3: (enumLiteral_1= 'checkbox' )
                    // InternalEduTest.g:1148:4: enumLiteral_1= 'checkbox'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getModeAccess().getCheckboxEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getModeAccess().getCheckboxEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMode"


    // $ANTLR start "ruleNavigation"
    // InternalEduTest.g:1158:1: ruleNavigation returns [Enumerator current=null] : ( (enumLiteral_0= 'free' ) | (enumLiteral_1= 'locked' ) ) ;
    public final Enumerator ruleNavigation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalEduTest.g:1164:2: ( ( (enumLiteral_0= 'free' ) | (enumLiteral_1= 'locked' ) ) )
            // InternalEduTest.g:1165:2: ( (enumLiteral_0= 'free' ) | (enumLiteral_1= 'locked' ) )
            {
            // InternalEduTest.g:1165:2: ( (enumLiteral_0= 'free' ) | (enumLiteral_1= 'locked' ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==40) ) {
                alt28=1;
            }
            else if ( (LA28_0==41) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalEduTest.g:1166:3: (enumLiteral_0= 'free' )
                    {
                    // InternalEduTest.g:1166:3: (enumLiteral_0= 'free' )
                    // InternalEduTest.g:1167:4: enumLiteral_0= 'free'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getNavigationAccess().getFreeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNavigationAccess().getFreeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEduTest.g:1174:3: (enumLiteral_1= 'locked' )
                    {
                    // InternalEduTest.g:1174:3: (enumLiteral_1= 'locked' )
                    // InternalEduTest.g:1175:4: enumLiteral_1= 'locked'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getNavigationAccess().getLockedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNavigationAccess().getLockedEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNavigation"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000038800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000038802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000C0000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000003C00000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000040L});

}