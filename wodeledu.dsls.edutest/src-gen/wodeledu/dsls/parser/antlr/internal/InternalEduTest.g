/*
 * generated by Xtext 2.12.0
 */
grammar InternalEduTest;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package wodeledu.dsls.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleProgram
entryRuleProgram returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProgramRule()); }
	iv_ruleProgram=ruleProgram
	{ $current=$iv_ruleProgram.current; }
	EOF;

// Rule Program
ruleProgram returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getProgramAccess().getProgramAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getProgramAccess().getConfigProgramConfigurationParserRuleCall_1_0());
				}
				lv_config_1_0=ruleProgramConfiguration
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramRule());
					}
					set(
						$current,
						"config",
						lv_config_1_0,
						"wodeledu.dsls.EduTest.ProgramConfiguration");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getProgramAccess().getExercisesMutatorTestsParserRuleCall_2_0());
				}
				lv_exercises_2_0=ruleMutatorTests
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramRule());
					}
					add(
						$current,
						"exercises",
						lv_exercises_2_0,
						"wodeledu.dsls.EduTest.MutatorTests");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleMutatorTests
entryRuleMutatorTests returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMutatorTestsRule()); }
	iv_ruleMutatorTests=ruleMutatorTests
	{ $current=$iv_ruleMutatorTests.current; }
	EOF;

// Rule MutatorTests
ruleMutatorTests returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getMutatorTestsAccess().getAlternativeResponseParserRuleCall_0());
		}
		this_AlternativeResponse_0=ruleAlternativeResponse
		{
			$current = $this_AlternativeResponse_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getMutatorTestsAccess().getMultiChoiceDiagramParserRuleCall_1());
		}
		this_MultiChoiceDiagram_1=ruleMultiChoiceDiagram
		{
			$current = $this_MultiChoiceDiagram_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getMutatorTestsAccess().getMultiChoiceEmendationParserRuleCall_2());
		}
		this_MultiChoiceEmendation_2=ruleMultiChoiceEmendation
		{
			$current = $this_MultiChoiceEmendation_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getMutatorTestsAccess().getMatchPairsParserRuleCall_3());
		}
		this_MatchPairs_3=ruleMatchPairs
		{
			$current = $this_MatchPairs_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAlternativeResponse
entryRuleAlternativeResponse returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAlternativeResponseRule()); }
	iv_ruleAlternativeResponse=ruleAlternativeResponse
	{ $current=$iv_ruleAlternativeResponse.current; }
	EOF;

// Rule AlternativeResponse
ruleAlternativeResponse returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='AlternativeResponse'
		{
			newLeafNode(otherlv_0, grammarAccess.getAlternativeResponseAccess().getAlternativeResponseKeyword_0());
		}
		(
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAlternativeResponseRule());
						}
					}
					otherlv_1=RULE_ID
					{
						newLeafNode(otherlv_1, grammarAccess.getAlternativeResponseAccess().getBlocksBlockCrossReference_1_0_0());
					}
				)
			)
			(
				otherlv_2=','
				{
					newLeafNode(otherlv_2, grammarAccess.getAlternativeResponseAccess().getCommaKeyword_1_1_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getAlternativeResponseRule());
							}
						}
						otherlv_3=RULE_ID
						{
							newLeafNode(otherlv_3, grammarAccess.getAlternativeResponseAccess().getBlocksBlockCrossReference_1_1_1_0());
						}
					)
				)
			)*
		)?
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getAlternativeResponseAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAlternativeResponseAccess().getConfigTestConfigurationParserRuleCall_3_0());
				}
				lv_config_5_0=ruleTestConfiguration
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAlternativeResponseRule());
					}
					set(
						$current,
						"config",
						lv_config_5_0,
						"wodeledu.dsls.EduTest.TestConfiguration");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getAlternativeResponseAccess().getTestsTestParserRuleCall_4_0());
				}
				lv_tests_6_0=ruleTest
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAlternativeResponseRule());
					}
					add(
						$current,
						"tests",
						lv_tests_6_0,
						"wodeledu.dsls.EduTest.Test");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getAlternativeResponseAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleMultiChoiceDiagram
entryRuleMultiChoiceDiagram returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMultiChoiceDiagramRule()); }
	iv_ruleMultiChoiceDiagram=ruleMultiChoiceDiagram
	{ $current=$iv_ruleMultiChoiceDiagram.current; }
	EOF;

// Rule MultiChoiceDiagram
ruleMultiChoiceDiagram returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='MultiChoiceDiagram'
		{
			newLeafNode(otherlv_0, grammarAccess.getMultiChoiceDiagramAccess().getMultiChoiceDiagramKeyword_0());
		}
		(
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getMultiChoiceDiagramRule());
						}
					}
					otherlv_1=RULE_ID
					{
						newLeafNode(otherlv_1, grammarAccess.getMultiChoiceDiagramAccess().getBlocksBlockCrossReference_1_0_0());
					}
				)
			)
			(
				otherlv_2=','
				{
					newLeafNode(otherlv_2, grammarAccess.getMultiChoiceDiagramAccess().getCommaKeyword_1_1_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getMultiChoiceDiagramRule());
							}
						}
						otherlv_3=RULE_ID
						{
							newLeafNode(otherlv_3, grammarAccess.getMultiChoiceDiagramAccess().getBlocksBlockCrossReference_1_1_1_0());
						}
					)
				)
			)*
		)?
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getMultiChoiceDiagramAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMultiChoiceDiagramAccess().getConfigTestConfigurationParserRuleCall_3_0());
				}
				lv_config_5_0=ruleTestConfiguration
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMultiChoiceDiagramRule());
					}
					set(
						$current,
						"config",
						lv_config_5_0,
						"wodeledu.dsls.EduTest.TestConfiguration");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getMultiChoiceDiagramAccess().getTestsTestParserRuleCall_4_0());
				}
				lv_tests_6_0=ruleTest
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMultiChoiceDiagramRule());
					}
					add(
						$current,
						"tests",
						lv_tests_6_0,
						"wodeledu.dsls.EduTest.Test");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getMultiChoiceDiagramAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleMultiChoiceEmendation
entryRuleMultiChoiceEmendation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMultiChoiceEmendationRule()); }
	iv_ruleMultiChoiceEmendation=ruleMultiChoiceEmendation
	{ $current=$iv_ruleMultiChoiceEmendation.current; }
	EOF;

// Rule MultiChoiceEmendation
ruleMultiChoiceEmendation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='MultiChoiceEmendation'
		{
			newLeafNode(otherlv_0, grammarAccess.getMultiChoiceEmendationAccess().getMultiChoiceEmendationKeyword_0());
		}
		(
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getMultiChoiceEmendationRule());
						}
					}
					otherlv_1=RULE_ID
					{
						newLeafNode(otherlv_1, grammarAccess.getMultiChoiceEmendationAccess().getBlocksBlockCrossReference_1_0_0());
					}
				)
			)
			(
				otherlv_2=','
				{
					newLeafNode(otherlv_2, grammarAccess.getMultiChoiceEmendationAccess().getCommaKeyword_1_1_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getMultiChoiceEmendationRule());
							}
						}
						otherlv_3=RULE_ID
						{
							newLeafNode(otherlv_3, grammarAccess.getMultiChoiceEmendationAccess().getBlocksBlockCrossReference_1_1_1_0());
						}
					)
				)
			)*
		)?
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getMultiChoiceEmendationAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMultiChoiceEmendationAccess().getConfigMultiChoiceEmConfigParserRuleCall_3_0());
				}
				lv_config_5_0=ruleMultiChoiceEmConfig
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMultiChoiceEmendationRule());
					}
					set(
						$current,
						"config",
						lv_config_5_0,
						"wodeledu.dsls.EduTest.MultiChoiceEmConfig");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getMultiChoiceEmendationAccess().getTestsTestParserRuleCall_4_0());
				}
				lv_tests_6_0=ruleTest
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMultiChoiceEmendationRule());
					}
					add(
						$current,
						"tests",
						lv_tests_6_0,
						"wodeledu.dsls.EduTest.Test");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getMultiChoiceEmendationAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleMatchPairs
entryRuleMatchPairs returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMatchPairsRule()); }
	iv_ruleMatchPairs=ruleMatchPairs
	{ $current=$iv_ruleMatchPairs.current; }
	EOF;

// Rule MatchPairs
ruleMatchPairs returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='MatchPairs'
		{
			newLeafNode(otherlv_0, grammarAccess.getMatchPairsAccess().getMatchPairsKeyword_0());
		}
		(
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getMatchPairsRule());
						}
					}
					otherlv_1=RULE_ID
					{
						newLeafNode(otherlv_1, grammarAccess.getMatchPairsAccess().getBlocksBlockCrossReference_1_0_0());
					}
				)
			)
			(
				otherlv_2=','
				{
					newLeafNode(otherlv_2, grammarAccess.getMatchPairsAccess().getCommaKeyword_1_1_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getMatchPairsRule());
							}
						}
						otherlv_3=RULE_ID
						{
							newLeafNode(otherlv_3, grammarAccess.getMatchPairsAccess().getBlocksBlockCrossReference_1_1_1_0());
						}
					)
				)
			)*
		)?
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getMatchPairsAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMatchPairsAccess().getConfigTestConfigurationParserRuleCall_3_0());
				}
				lv_config_5_0=ruleTestConfiguration
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMatchPairsRule());
					}
					set(
						$current,
						"config",
						lv_config_5_0,
						"wodeledu.dsls.EduTest.TestConfiguration");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getMatchPairsAccess().getTestsTestParserRuleCall_4_0());
				}
				lv_tests_6_0=ruleTest
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMatchPairsRule());
					}
					add(
						$current,
						"tests",
						lv_tests_6_0,
						"wodeledu.dsls.EduTest.Test");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getMatchPairsAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleProgramConfiguration
entryRuleProgramConfiguration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProgramConfigurationRule()); }
	iv_ruleProgramConfiguration=ruleProgramConfiguration
	{ $current=$iv_ruleProgramConfiguration.current; }
	EOF;

// Rule ProgramConfiguration
ruleProgramConfiguration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='navigation'
		{
			newLeafNode(otherlv_0, grammarAccess.getProgramConfigurationAccess().getNavigationKeyword_0());
		}
		otherlv_1='='
		{
			newLeafNode(otherlv_1, grammarAccess.getProgramConfigurationAccess().getEqualsSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getProgramConfigurationAccess().getNavigationNavigationEnumRuleCall_2_0());
				}
				lv_navigation_2_0=ruleNavigation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramConfigurationRule());
					}
					set(
						$current,
						"navigation",
						lv_navigation_2_0,
						"wodeledu.dsls.EduTest.Navigation");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleTestConfiguration
entryRuleTestConfiguration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTestConfigurationRule()); }
	iv_ruleTestConfiguration=ruleTestConfiguration
	{ $current=$iv_ruleTestConfiguration.current; }
	EOF;

// Rule TestConfiguration
ruleTestConfiguration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getTestConfigurationAccess().getTestConfigurationAction_0(),
					$current);
			}
		)
		otherlv_1='retry'
		{
			newLeafNode(otherlv_1, grammarAccess.getTestConfigurationAccess().getRetryKeyword_1());
		}
		otherlv_2='='
		{
			newLeafNode(otherlv_2, grammarAccess.getTestConfigurationAccess().getEqualsSignKeyword_2());
		}
		(
			(
				(
					lv_retry_3_1='yes'
					{
						newLeafNode(lv_retry_3_1, grammarAccess.getTestConfigurationAccess().getRetryYesKeyword_3_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTestConfigurationRule());
						}
						setWithLastConsumed($current, "retry", true, null);
					}
					    |
					lv_retry_3_2='no'
					{
						newLeafNode(lv_retry_3_2, grammarAccess.getTestConfigurationAccess().getRetryNoKeyword_3_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTestConfigurationRule());
						}
						setWithLastConsumed($current, "retry", true, null);
					}
				)
			)
		)
	)
;

// Entry rule entryRuleMultiChoiceEmConfig
entryRuleMultiChoiceEmConfig returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMultiChoiceEmConfigRule()); }
	iv_ruleMultiChoiceEmConfig=ruleMultiChoiceEmConfig
	{ $current=$iv_ruleMultiChoiceEmConfig.current; }
	EOF;

// Rule MultiChoiceEmConfig
ruleMultiChoiceEmConfig returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getMultiChoiceEmConfigAccess().getMultiChoiceEmConfigAction_0(),
					$current);
			}
		)
		otherlv_1='retry'
		{
			newLeafNode(otherlv_1, grammarAccess.getMultiChoiceEmConfigAccess().getRetryKeyword_1());
		}
		otherlv_2='='
		{
			newLeafNode(otherlv_2, grammarAccess.getMultiChoiceEmConfigAccess().getEqualsSignKeyword_2());
		}
		(
			(
				(
					lv_retry_3_1='yes'
					{
						newLeafNode(lv_retry_3_1, grammarAccess.getMultiChoiceEmConfigAccess().getRetryYesKeyword_3_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getMultiChoiceEmConfigRule());
						}
						setWithLastConsumed($current, "retry", true, null);
					}
					    |
					lv_retry_3_2='no'
					{
						newLeafNode(lv_retry_3_2, grammarAccess.getMultiChoiceEmConfigAccess().getRetryNoKeyword_3_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getMultiChoiceEmConfigRule());
						}
						setWithLastConsumed($current, "retry", true, null);
					}
				)
			)
		)
		otherlv_4=','
		{
			newLeafNode(otherlv_4, grammarAccess.getMultiChoiceEmConfigAccess().getCommaKeyword_4());
		}
		otherlv_5='weighted'
		{
			newLeafNode(otherlv_5, grammarAccess.getMultiChoiceEmConfigAccess().getWeightedKeyword_5());
		}
		otherlv_6='='
		{
			newLeafNode(otherlv_6, grammarAccess.getMultiChoiceEmConfigAccess().getEqualsSignKeyword_6());
		}
		(
			(
				(
					lv_weighted_7_1='yes'
					{
						newLeafNode(lv_weighted_7_1, grammarAccess.getMultiChoiceEmConfigAccess().getWeightedYesKeyword_7_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getMultiChoiceEmConfigRule());
						}
						setWithLastConsumed($current, "weighted", true, null);
					}
					    |
					lv_weighted_7_2='no'
					{
						newLeafNode(lv_weighted_7_2, grammarAccess.getMultiChoiceEmConfigAccess().getWeightedNoKeyword_7_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getMultiChoiceEmConfigRule());
						}
						setWithLastConsumed($current, "weighted", true, null);
					}
				)
			)
		)
		otherlv_8=','
		{
			newLeafNode(otherlv_8, grammarAccess.getMultiChoiceEmConfigAccess().getCommaKeyword_8());
		}
		otherlv_9='penalty'
		{
			newLeafNode(otherlv_9, grammarAccess.getMultiChoiceEmConfigAccess().getPenaltyKeyword_9());
		}
		otherlv_10='='
		{
			newLeafNode(otherlv_10, grammarAccess.getMultiChoiceEmConfigAccess().getEqualsSignKeyword_10());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMultiChoiceEmConfigAccess().getPenaltyEDoubleParserRuleCall_11_0());
				}
				lv_penalty_11_0=ruleEDouble
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMultiChoiceEmConfigRule());
					}
					set(
						$current,
						"penalty",
						lv_penalty_11_0,
						"wodeledu.dsls.EduTest.EDouble");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_12=','
		{
			newLeafNode(otherlv_12, grammarAccess.getMultiChoiceEmConfigAccess().getCommaKeyword_12());
		}
		otherlv_13='order'
		{
			newLeafNode(otherlv_13, grammarAccess.getMultiChoiceEmConfigAccess().getOrderKeyword_13());
		}
		otherlv_14='='
		{
			newLeafNode(otherlv_14, grammarAccess.getMultiChoiceEmConfigAccess().getEqualsSignKeyword_14());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMultiChoiceEmConfigAccess().getOrderOrderEnumRuleCall_15_0());
				}
				lv_order_15_0=ruleOrder
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMultiChoiceEmConfigRule());
					}
					set(
						$current,
						"order",
						lv_order_15_0,
						"wodeledu.dsls.EduTest.Order");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_16=','
		{
			newLeafNode(otherlv_16, grammarAccess.getMultiChoiceEmConfigAccess().getCommaKeyword_16());
		}
		otherlv_17='mode'
		{
			newLeafNode(otherlv_17, grammarAccess.getMultiChoiceEmConfigAccess().getModeKeyword_17());
		}
		otherlv_18='='
		{
			newLeafNode(otherlv_18, grammarAccess.getMultiChoiceEmConfigAccess().getEqualsSignKeyword_18());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMultiChoiceEmConfigAccess().getModeModeEnumRuleCall_19_0());
				}
				lv_mode_19_0=ruleMode
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMultiChoiceEmConfigRule());
					}
					set(
						$current,
						"mode",
						lv_mode_19_0,
						"wodeledu.dsls.EduTest.Mode");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleTest
entryRuleTest returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTestRule()); }
	iv_ruleTest=ruleTest
	{ $current=$iv_ruleTest.current; }
	EOF;

// Rule Test
ruleTest returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='description'
		{
			newLeafNode(otherlv_0, grammarAccess.getTestAccess().getDescriptionKeyword_0());
		}
		otherlv_1='for'
		{
			newLeafNode(otherlv_1, grammarAccess.getTestAccess().getForKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTestAccess().getSourceEStringParserRuleCall_2_0());
				}
				lv_source_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTestRule());
					}
					set(
						$current,
						"source",
						lv_source_2_0,
						"wodeledu.dsls.EduTest.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='='
		{
			newLeafNode(otherlv_3, grammarAccess.getTestAccess().getEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTestAccess().getQuestionEStringParserRuleCall_4_0());
				}
				lv_question_4_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTestRule());
					}
					set(
						$current,
						"question",
						lv_question_4_0,
						"wodeledu.dsls.EduTest.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_expression_5_0='%text'
				{
					newLeafNode(lv_expression_5_0, grammarAccess.getTestAccess().getExpressionTextKeyword_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTestRule());
					}
					setWithLastConsumed($current, "expression", true, "\%text");
				}
			)
		)?
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleEDouble
entryRuleEDouble returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEDoubleRule()); }
	iv_ruleEDouble=ruleEDouble
	{ $current=$iv_ruleEDouble.current.getText(); }
	EOF;

// Rule EDouble
ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
			}
		)?
		(
			this_INT_1=RULE_INT
			{
				$current.merge(this_INT_1);
			}
			{
				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
			}
		)?
		kw='.'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
		}
		this_INT_3=RULE_INT
		{
			$current.merge(this_INT_3);
		}
		{
			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
		}
		(
			(
				kw='E'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
				}
				    |
				kw='e'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
				}
			)
			(
				kw='-'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
				}
			)?
			this_INT_7=RULE_INT
			{
				$current.merge(this_INT_7);
			}
			{
				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
			}
		)?
	)
;

// Rule Order
ruleOrder returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='fixed'
			{
				$current = grammarAccess.getOrderAccess().getFixedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getOrderAccess().getFixedEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='random'
			{
				$current = grammarAccess.getOrderAccess().getRandomEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getOrderAccess().getRandomEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='options-ascending'
			{
				$current = grammarAccess.getOrderAccess().getAscendingEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getOrderAccess().getAscendingEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='options-descending'
			{
				$current = grammarAccess.getOrderAccess().getDescendingEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getOrderAccess().getDescendingEnumLiteralDeclaration_3());
			}
		)
	)
;

// Rule Mode
ruleMode returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='radiobutton'
			{
				$current = grammarAccess.getModeAccess().getRadiobuttonEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getModeAccess().getRadiobuttonEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='checkbox'
			{
				$current = grammarAccess.getModeAccess().getCheckboxEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getModeAccess().getCheckboxEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule Navigation
ruleNavigation returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='free'
			{
				$current = grammarAccess.getNavigationAccess().getFreeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getNavigationAccess().getFreeEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='locked'
			{
				$current = grammarAccess.getNavigationAccess().getLockedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getNavigationAccess().getLockedEnumLiteralDeclaration_1());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
