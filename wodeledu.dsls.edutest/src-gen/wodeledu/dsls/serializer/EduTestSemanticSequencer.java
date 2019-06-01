/*
 * generated by Xtext 2.13.0
 */
package wodeledu.dsls.serializer;

import com.google.inject.Inject;
import edutest.AlternativeResponse;
import edutest.EdutestPackage;
import edutest.MultiChoiceDiagram;
import edutest.MultiChoiceEmConfig;
import edutest.MultiChoiceEmendation;
import edutest.Program;
import edutest.ProgramConfiguration;
import edutest.Test;
import edutest.TestConfiguration;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import wodeledu.dsls.services.EduTestGrammarAccess;

@SuppressWarnings("all")
public class EduTestSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private EduTestGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == EdutestPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case EdutestPackage.ALTERNATIVE_RESPONSE:
				sequence_AlternativeResponse(context, (AlternativeResponse) semanticObject); 
				return; 
			case EdutestPackage.MULTI_CHOICE_DIAGRAM:
				sequence_MultiChoiceDiagram(context, (MultiChoiceDiagram) semanticObject); 
				return; 
			case EdutestPackage.MULTI_CHOICE_EM_CONFIG:
				sequence_MultiChoiceEmConfig(context, (MultiChoiceEmConfig) semanticObject); 
				return; 
			case EdutestPackage.MULTI_CHOICE_EMENDATION:
				sequence_MultiChoiceEmendation(context, (MultiChoiceEmendation) semanticObject); 
				return; 
			case EdutestPackage.PROGRAM:
				sequence_Program(context, (Program) semanticObject); 
				return; 
			case EdutestPackage.PROGRAM_CONFIGURATION:
				sequence_ProgramConfiguration(context, (ProgramConfiguration) semanticObject); 
				return; 
			case EdutestPackage.TEST:
				sequence_Test(context, (Test) semanticObject); 
				return; 
			case EdutestPackage.TEST_CONFIGURATION:
				sequence_TestConfiguration(context, (TestConfiguration) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     MutatorTests returns AlternativeResponse
	 *     AlternativeResponse returns AlternativeResponse
	 *
	 * Constraint:
	 *     (block=[Block|ID]? config=TestConfiguration tests+=Test*)
	 */
	protected void sequence_AlternativeResponse(ISerializationContext context, AlternativeResponse semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MutatorTests returns MultiChoiceDiagram
	 *     MultiChoiceDiagram returns MultiChoiceDiagram
	 *
	 * Constraint:
	 *     (block=[Block|ID]? config=TestConfiguration tests+=Test*)
	 */
	protected void sequence_MultiChoiceDiagram(ISerializationContext context, MultiChoiceDiagram semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MultiChoiceEmConfig returns MultiChoiceEmConfig
	 *
	 * Constraint:
	 *     ((retry?='yes' | retry?='no') (weighted?='yes' | weighted?='no') penalty=EDouble order=Order mode=Mode)
	 */
	protected void sequence_MultiChoiceEmConfig(ISerializationContext context, MultiChoiceEmConfig semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MutatorTests returns MultiChoiceEmendation
	 *     MultiChoiceEmendation returns MultiChoiceEmendation
	 *
	 * Constraint:
	 *     (block=[Block|ID]? config=MultiChoiceEmConfig tests+=Test*)
	 */
	protected void sequence_MultiChoiceEmendation(ISerializationContext context, MultiChoiceEmendation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ProgramConfiguration returns ProgramConfiguration
	 *
	 * Constraint:
	 *     navigation=Navigation
	 */
	protected void sequence_ProgramConfiguration(ISerializationContext context, ProgramConfiguration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EdutestPackage.Literals.PROGRAM_CONFIGURATION__NAVIGATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EdutestPackage.Literals.PROGRAM_CONFIGURATION__NAVIGATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProgramConfigurationAccess().getNavigationNavigationEnumRuleCall_2_0(), semanticObject.getNavigation());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Program returns Program
	 *
	 * Constraint:
	 *     (config=ProgramConfiguration? exercises+=MutatorTests+)
	 */
	protected void sequence_Program(ISerializationContext context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TestConfiguration returns TestConfiguration
	 *
	 * Constraint:
	 *     (retry?='yes' | retry?='no')
	 */
	protected void sequence_TestConfiguration(ISerializationContext context, TestConfiguration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Test returns Test
	 *
	 * Constraint:
	 *     (source=EString question=EString)
	 */
	protected void sequence_Test(ISerializationContext context, Test semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EdutestPackage.Literals.TEST__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EdutestPackage.Literals.TEST__SOURCE));
			if (transientValues.isValueTransient(semanticObject, EdutestPackage.Literals.TEST__QUESTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EdutestPackage.Literals.TEST__QUESTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTestAccess().getSourceEStringParserRuleCall_2_0(), semanticObject.getSource());
		feeder.accept(grammarAccess.getTestAccess().getQuestionEStringParserRuleCall_4_0(), semanticObject.getQuestion());
		feeder.finish();
	}
	
	
}