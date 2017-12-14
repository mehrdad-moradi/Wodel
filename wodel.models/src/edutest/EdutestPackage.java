/**
 */
package edutest;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edutest.EdutestFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore' mutatorenvironment='MutatorEnvironment.ecore#/'"
 * @generated
 */
public interface EdutestPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "edutest";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://edutest/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "edutest";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EdutestPackage eINSTANCE = edutest.impl.EdutestPackageImpl.init();

	/**
	 * The meta object id for the '{@link edutest.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edutest.impl.ProgramImpl
	 * @see edutest.impl.EdutestPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Exercises</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__EXERCISES = 1;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edutest.impl.MutatorTestsImpl <em>Mutator Tests</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edutest.impl.MutatorTestsImpl
	 * @see edutest.impl.EdutestPackageImpl#getMutatorTests()
	 * @generated
	 */
	int MUTATOR_TESTS = 1;

	/**
	 * The feature id for the '<em><b>Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTATOR_TESTS__BLOCK = 0;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTATOR_TESTS__TESTS = 1;

	/**
	 * The number of structural features of the '<em>Mutator Tests</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTATOR_TESTS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Mutator Tests</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTATOR_TESTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edutest.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edutest.impl.ConfigurationImpl
	 * @see edutest.impl.EdutestPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 2;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edutest.impl.ProgramConfigurationImpl <em>Program Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edutest.impl.ProgramConfigurationImpl
	 * @see edutest.impl.EdutestPackageImpl#getProgramConfiguration()
	 * @generated
	 */
	int PROGRAM_CONFIGURATION = 3;

	/**
	 * The feature id for the '<em><b>Navigation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_CONFIGURATION__NAVIGATION = CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Program Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_CONFIGURATION_FEATURE_COUNT = CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Program Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_CONFIGURATION_OPERATION_COUNT = CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edutest.impl.TestConfigurationImpl <em>Test Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edutest.impl.TestConfigurationImpl
	 * @see edutest.impl.EdutestPackageImpl#getTestConfiguration()
	 * @generated
	 */
	int TEST_CONFIGURATION = 4;

	/**
	 * The feature id for the '<em><b>Retry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CONFIGURATION__RETRY = CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Test Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CONFIGURATION_FEATURE_COUNT = CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Test Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CONFIGURATION_OPERATION_COUNT = CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edutest.impl.MultiChoiceEmConfigImpl <em>Multi Choice Em Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edutest.impl.MultiChoiceEmConfigImpl
	 * @see edutest.impl.EdutestPackageImpl#getMultiChoiceEmConfig()
	 * @generated
	 */
	int MULTI_CHOICE_EM_CONFIG = 5;

	/**
	 * The feature id for the '<em><b>Retry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE_EM_CONFIG__RETRY = TEST_CONFIGURATION__RETRY;

	/**
	 * The feature id for the '<em><b>Weighted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE_EM_CONFIG__WEIGHTED = TEST_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Penalty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE_EM_CONFIG__PENALTY = TEST_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE_EM_CONFIG__ORDER = TEST_CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE_EM_CONFIG__MODE = TEST_CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Multi Choice Em Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE_EM_CONFIG_FEATURE_COUNT = TEST_CONFIGURATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Multi Choice Em Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE_EM_CONFIG_OPERATION_COUNT = TEST_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edutest.impl.AlternativeResponseImpl <em>Alternative Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edutest.impl.AlternativeResponseImpl
	 * @see edutest.impl.EdutestPackageImpl#getAlternativeResponse()
	 * @generated
	 */
	int ALTERNATIVE_RESPONSE = 6;

	/**
	 * The feature id for the '<em><b>Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_RESPONSE__BLOCK = MUTATOR_TESTS__BLOCK;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_RESPONSE__TESTS = MUTATOR_TESTS__TESTS;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_RESPONSE__CONFIG = MUTATOR_TESTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Alternative Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_RESPONSE_FEATURE_COUNT = MUTATOR_TESTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Alternative Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_RESPONSE_OPERATION_COUNT = MUTATOR_TESTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edutest.impl.MultiChoiceDiagramImpl <em>Multi Choice Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edutest.impl.MultiChoiceDiagramImpl
	 * @see edutest.impl.EdutestPackageImpl#getMultiChoiceDiagram()
	 * @generated
	 */
	int MULTI_CHOICE_DIAGRAM = 7;

	/**
	 * The feature id for the '<em><b>Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE_DIAGRAM__BLOCK = MUTATOR_TESTS__BLOCK;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE_DIAGRAM__TESTS = MUTATOR_TESTS__TESTS;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE_DIAGRAM__CONFIG = MUTATOR_TESTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multi Choice Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE_DIAGRAM_FEATURE_COUNT = MUTATOR_TESTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Multi Choice Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE_DIAGRAM_OPERATION_COUNT = MUTATOR_TESTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edutest.impl.MultiChoiceEmendationImpl <em>Multi Choice Emendation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edutest.impl.MultiChoiceEmendationImpl
	 * @see edutest.impl.EdutestPackageImpl#getMultiChoiceEmendation()
	 * @generated
	 */
	int MULTI_CHOICE_EMENDATION = 8;

	/**
	 * The feature id for the '<em><b>Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE_EMENDATION__BLOCK = MUTATOR_TESTS__BLOCK;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE_EMENDATION__TESTS = MUTATOR_TESTS__TESTS;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE_EMENDATION__CONFIG = MUTATOR_TESTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multi Choice Emendation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE_EMENDATION_FEATURE_COUNT = MUTATOR_TESTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Multi Choice Emendation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE_EMENDATION_OPERATION_COUNT = MUTATOR_TESTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edutest.impl.TestImpl <em>Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edutest.impl.TestImpl
	 * @see edutest.impl.EdutestPackageImpl#getTest()
	 * @generated
	 */
	int TEST = 9;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__QUESTION = 1;

	/**
	 * The number of structural features of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edutest.Order <em>Order</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edutest.Order
	 * @see edutest.impl.EdutestPackageImpl#getOrder()
	 * @generated
	 */
	int ORDER = 10;

	/**
	 * The meta object id for the '{@link edutest.Navigation <em>Navigation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edutest.Navigation
	 * @see edutest.impl.EdutestPackageImpl#getNavigation()
	 * @generated
	 */
	int NAVIGATION = 11;

	/**
	 * The meta object id for the '{@link edutest.Mode <em>Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edutest.Mode
	 * @see edutest.impl.EdutestPackageImpl#getMode()
	 * @generated
	 */
	int MODE = 12;


	/**
	 * Returns the meta object for class '{@link edutest.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see edutest.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the containment reference '{@link edutest.Program#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config</em>'.
	 * @see edutest.Program#getConfig()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Config();

	/**
	 * Returns the meta object for the containment reference list '{@link edutest.Program#getExercises <em>Exercises</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exercises</em>'.
	 * @see edutest.Program#getExercises()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Exercises();

	/**
	 * Returns the meta object for class '{@link edutest.MutatorTests <em>Mutator Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mutator Tests</em>'.
	 * @see edutest.MutatorTests
	 * @generated
	 */
	EClass getMutatorTests();

	/**
	 * Returns the meta object for the reference '{@link edutest.MutatorTests#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Block</em>'.
	 * @see edutest.MutatorTests#getBlock()
	 * @see #getMutatorTests()
	 * @generated
	 */
	EReference getMutatorTests_Block();

	/**
	 * Returns the meta object for the containment reference list '{@link edutest.MutatorTests#getTests <em>Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tests</em>'.
	 * @see edutest.MutatorTests#getTests()
	 * @see #getMutatorTests()
	 * @generated
	 */
	EReference getMutatorTests_Tests();

	/**
	 * Returns the meta object for class '{@link edutest.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see edutest.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for class '{@link edutest.ProgramConfiguration <em>Program Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Configuration</em>'.
	 * @see edutest.ProgramConfiguration
	 * @generated
	 */
	EClass getProgramConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link edutest.ProgramConfiguration#getNavigation <em>Navigation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navigation</em>'.
	 * @see edutest.ProgramConfiguration#getNavigation()
	 * @see #getProgramConfiguration()
	 * @generated
	 */
	EAttribute getProgramConfiguration_Navigation();

	/**
	 * Returns the meta object for class '{@link edutest.TestConfiguration <em>Test Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Configuration</em>'.
	 * @see edutest.TestConfiguration
	 * @generated
	 */
	EClass getTestConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link edutest.TestConfiguration#isRetry <em>Retry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retry</em>'.
	 * @see edutest.TestConfiguration#isRetry()
	 * @see #getTestConfiguration()
	 * @generated
	 */
	EAttribute getTestConfiguration_Retry();

	/**
	 * Returns the meta object for class '{@link edutest.MultiChoiceEmConfig <em>Multi Choice Em Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Choice Em Config</em>'.
	 * @see edutest.MultiChoiceEmConfig
	 * @generated
	 */
	EClass getMultiChoiceEmConfig();

	/**
	 * Returns the meta object for the attribute '{@link edutest.MultiChoiceEmConfig#isWeighted <em>Weighted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weighted</em>'.
	 * @see edutest.MultiChoiceEmConfig#isWeighted()
	 * @see #getMultiChoiceEmConfig()
	 * @generated
	 */
	EAttribute getMultiChoiceEmConfig_Weighted();

	/**
	 * Returns the meta object for the attribute '{@link edutest.MultiChoiceEmConfig#getPenalty <em>Penalty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Penalty</em>'.
	 * @see edutest.MultiChoiceEmConfig#getPenalty()
	 * @see #getMultiChoiceEmConfig()
	 * @generated
	 */
	EAttribute getMultiChoiceEmConfig_Penalty();

	/**
	 * Returns the meta object for the attribute '{@link edutest.MultiChoiceEmConfig#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see edutest.MultiChoiceEmConfig#getOrder()
	 * @see #getMultiChoiceEmConfig()
	 * @generated
	 */
	EAttribute getMultiChoiceEmConfig_Order();

	/**
	 * Returns the meta object for the attribute '{@link edutest.MultiChoiceEmConfig#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see edutest.MultiChoiceEmConfig#getMode()
	 * @see #getMultiChoiceEmConfig()
	 * @generated
	 */
	EAttribute getMultiChoiceEmConfig_Mode();

	/**
	 * Returns the meta object for class '{@link edutest.AlternativeResponse <em>Alternative Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternative Response</em>'.
	 * @see edutest.AlternativeResponse
	 * @generated
	 */
	EClass getAlternativeResponse();

	/**
	 * Returns the meta object for the containment reference '{@link edutest.AlternativeResponse#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config</em>'.
	 * @see edutest.AlternativeResponse#getConfig()
	 * @see #getAlternativeResponse()
	 * @generated
	 */
	EReference getAlternativeResponse_Config();

	/**
	 * Returns the meta object for class '{@link edutest.MultiChoiceDiagram <em>Multi Choice Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Choice Diagram</em>'.
	 * @see edutest.MultiChoiceDiagram
	 * @generated
	 */
	EClass getMultiChoiceDiagram();

	/**
	 * Returns the meta object for the containment reference '{@link edutest.MultiChoiceDiagram#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config</em>'.
	 * @see edutest.MultiChoiceDiagram#getConfig()
	 * @see #getMultiChoiceDiagram()
	 * @generated
	 */
	EReference getMultiChoiceDiagram_Config();

	/**
	 * Returns the meta object for class '{@link edutest.MultiChoiceEmendation <em>Multi Choice Emendation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Choice Emendation</em>'.
	 * @see edutest.MultiChoiceEmendation
	 * @generated
	 */
	EClass getMultiChoiceEmendation();

	/**
	 * Returns the meta object for the containment reference '{@link edutest.MultiChoiceEmendation#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config</em>'.
	 * @see edutest.MultiChoiceEmendation#getConfig()
	 * @see #getMultiChoiceEmendation()
	 * @generated
	 */
	EReference getMultiChoiceEmendation_Config();

	/**
	 * Returns the meta object for class '{@link edutest.Test <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test</em>'.
	 * @see edutest.Test
	 * @generated
	 */
	EClass getTest();

	/**
	 * Returns the meta object for the attribute '{@link edutest.Test#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see edutest.Test#getSource()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_Source();

	/**
	 * Returns the meta object for the attribute '{@link edutest.Test#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Question</em>'.
	 * @see edutest.Test#getQuestion()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_Question();

	/**
	 * Returns the meta object for enum '{@link edutest.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Order</em>'.
	 * @see edutest.Order
	 * @generated
	 */
	EEnum getOrder();

	/**
	 * Returns the meta object for enum '{@link edutest.Navigation <em>Navigation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Navigation</em>'.
	 * @see edutest.Navigation
	 * @generated
	 */
	EEnum getNavigation();

	/**
	 * Returns the meta object for enum '{@link edutest.Mode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mode</em>'.
	 * @see edutest.Mode
	 * @generated
	 */
	EEnum getMode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EdutestFactory getEdutestFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edutest.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edutest.impl.ProgramImpl
		 * @see edutest.impl.EdutestPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__CONFIG = eINSTANCE.getProgram_Config();

		/**
		 * The meta object literal for the '<em><b>Exercises</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__EXERCISES = eINSTANCE.getProgram_Exercises();

		/**
		 * The meta object literal for the '{@link edutest.impl.MutatorTestsImpl <em>Mutator Tests</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edutest.impl.MutatorTestsImpl
		 * @see edutest.impl.EdutestPackageImpl#getMutatorTests()
		 * @generated
		 */
		EClass MUTATOR_TESTS = eINSTANCE.getMutatorTests();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUTATOR_TESTS__BLOCK = eINSTANCE.getMutatorTests_Block();

		/**
		 * The meta object literal for the '<em><b>Tests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUTATOR_TESTS__TESTS = eINSTANCE.getMutatorTests_Tests();

		/**
		 * The meta object literal for the '{@link edutest.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edutest.impl.ConfigurationImpl
		 * @see edutest.impl.EdutestPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '{@link edutest.impl.ProgramConfigurationImpl <em>Program Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edutest.impl.ProgramConfigurationImpl
		 * @see edutest.impl.EdutestPackageImpl#getProgramConfiguration()
		 * @generated
		 */
		EClass PROGRAM_CONFIGURATION = eINSTANCE.getProgramConfiguration();

		/**
		 * The meta object literal for the '<em><b>Navigation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_CONFIGURATION__NAVIGATION = eINSTANCE.getProgramConfiguration_Navigation();

		/**
		 * The meta object literal for the '{@link edutest.impl.TestConfigurationImpl <em>Test Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edutest.impl.TestConfigurationImpl
		 * @see edutest.impl.EdutestPackageImpl#getTestConfiguration()
		 * @generated
		 */
		EClass TEST_CONFIGURATION = eINSTANCE.getTestConfiguration();

		/**
		 * The meta object literal for the '<em><b>Retry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CONFIGURATION__RETRY = eINSTANCE.getTestConfiguration_Retry();

		/**
		 * The meta object literal for the '{@link edutest.impl.MultiChoiceEmConfigImpl <em>Multi Choice Em Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edutest.impl.MultiChoiceEmConfigImpl
		 * @see edutest.impl.EdutestPackageImpl#getMultiChoiceEmConfig()
		 * @generated
		 */
		EClass MULTI_CHOICE_EM_CONFIG = eINSTANCE.getMultiChoiceEmConfig();

		/**
		 * The meta object literal for the '<em><b>Weighted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_CHOICE_EM_CONFIG__WEIGHTED = eINSTANCE.getMultiChoiceEmConfig_Weighted();

		/**
		 * The meta object literal for the '<em><b>Penalty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_CHOICE_EM_CONFIG__PENALTY = eINSTANCE.getMultiChoiceEmConfig_Penalty();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_CHOICE_EM_CONFIG__ORDER = eINSTANCE.getMultiChoiceEmConfig_Order();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_CHOICE_EM_CONFIG__MODE = eINSTANCE.getMultiChoiceEmConfig_Mode();

		/**
		 * The meta object literal for the '{@link edutest.impl.AlternativeResponseImpl <em>Alternative Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edutest.impl.AlternativeResponseImpl
		 * @see edutest.impl.EdutestPackageImpl#getAlternativeResponse()
		 * @generated
		 */
		EClass ALTERNATIVE_RESPONSE = eINSTANCE.getAlternativeResponse();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVE_RESPONSE__CONFIG = eINSTANCE.getAlternativeResponse_Config();

		/**
		 * The meta object literal for the '{@link edutest.impl.MultiChoiceDiagramImpl <em>Multi Choice Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edutest.impl.MultiChoiceDiagramImpl
		 * @see edutest.impl.EdutestPackageImpl#getMultiChoiceDiagram()
		 * @generated
		 */
		EClass MULTI_CHOICE_DIAGRAM = eINSTANCE.getMultiChoiceDiagram();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_CHOICE_DIAGRAM__CONFIG = eINSTANCE.getMultiChoiceDiagram_Config();

		/**
		 * The meta object literal for the '{@link edutest.impl.MultiChoiceEmendationImpl <em>Multi Choice Emendation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edutest.impl.MultiChoiceEmendationImpl
		 * @see edutest.impl.EdutestPackageImpl#getMultiChoiceEmendation()
		 * @generated
		 */
		EClass MULTI_CHOICE_EMENDATION = eINSTANCE.getMultiChoiceEmendation();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_CHOICE_EMENDATION__CONFIG = eINSTANCE.getMultiChoiceEmendation_Config();

		/**
		 * The meta object literal for the '{@link edutest.impl.TestImpl <em>Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edutest.impl.TestImpl
		 * @see edutest.impl.EdutestPackageImpl#getTest()
		 * @generated
		 */
		EClass TEST = eINSTANCE.getTest();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__SOURCE = eINSTANCE.getTest_Source();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__QUESTION = eINSTANCE.getTest_Question();

		/**
		 * The meta object literal for the '{@link edutest.Order <em>Order</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edutest.Order
		 * @see edutest.impl.EdutestPackageImpl#getOrder()
		 * @generated
		 */
		EEnum ORDER = eINSTANCE.getOrder();

		/**
		 * The meta object literal for the '{@link edutest.Navigation <em>Navigation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edutest.Navigation
		 * @see edutest.impl.EdutestPackageImpl#getNavigation()
		 * @generated
		 */
		EEnum NAVIGATION = eINSTANCE.getNavigation();

		/**
		 * The meta object literal for the '{@link edutest.Mode <em>Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edutest.Mode
		 * @see edutest.impl.EdutestPackageImpl#getMode()
		 * @generated
		 */
		EEnum MODE = eINSTANCE.getMode();

	}

} //EdutestPackage