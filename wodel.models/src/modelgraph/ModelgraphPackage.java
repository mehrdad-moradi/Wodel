/**
 */
package modelgraph;

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
 * @see modelgraph.ModelgraphFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface ModelgraphPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modelgraph";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://modelgraph/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "modelgraph";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelgraphPackage eINSTANCE = modelgraph.impl.ModelgraphPackageImpl.init();

	/**
	 * The meta object id for the '{@link modelgraph.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelgraph.impl.ItemImpl
	 * @see modelgraph.impl.ModelgraphPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__NAME = 0;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modelgraph.impl.MutatorGraphImpl <em>Mutator Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelgraph.impl.MutatorGraphImpl
	 * @see modelgraph.impl.ModelgraphPackageImpl#getMutatorGraph()
	 * @generated
	 */
	int MUTATOR_GRAPH = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTATOR_GRAPH__NAME = ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTATOR_GRAPH__TYPE = ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTATOR_GRAPH__NODES = ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTATOR_GRAPH__RELATIONS = ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTATOR_GRAPH__CONTENTS = ITEM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTATOR_GRAPH__METAMODEL = ITEM_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Mutator Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTATOR_GRAPH_FEATURE_COUNT = ITEM_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Mutator Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTATOR_GRAPH_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modelgraph.impl.NamedItemImpl <em>Named Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelgraph.impl.NamedItemImpl
	 * @see modelgraph.impl.ModelgraphPackageImpl#getNamedItem()
	 * @generated
	 */
	int NAMED_ITEM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ITEM__NAME = ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Att Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ITEM__ATT_NAME = ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Named Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ITEM_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modelgraph.impl.BooleanAttributeImpl <em>Boolean Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelgraph.impl.BooleanAttributeImpl
	 * @see modelgraph.impl.ModelgraphPackageImpl#getBooleanAttribute()
	 * @generated
	 */
	int BOOLEAN_ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ATTRIBUTE__NAME = ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Negation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ATTRIBUTE__NEGATION = ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Att</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ATTRIBUTE__ATT = ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boolean Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ATTRIBUTE_FEATURE_COUNT = ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Boolean Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ATTRIBUTE_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modelgraph.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelgraph.impl.NodeImpl
	 * @see modelgraph.impl.ModelgraphPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = NAMED_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Att Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ATT_NAME = NAMED_ITEM__ATT_NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ATTRIBUTE = NAMED_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__REFERENCE = NAMED_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TYPE = NAMED_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SHAPE = NAMED_ITEM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__COLOR = NAMED_ITEM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__STYLE = NAMED_ITEM_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = NAMED_ITEM_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = NAMED_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modelgraph.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelgraph.impl.RelationImpl
	 * @see modelgraph.impl.ModelgraphPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NAME = NAMED_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Att Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__ATT_NAME = NAMED_ITEM__ATT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__REFERENCE = NAMED_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__LABEL = NAMED_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Src decoration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__SRC_DECORATION = NAMED_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Src label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__SRC_LABEL = NAMED_ITEM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tar decoration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TAR_DECORATION = NAMED_ITEM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Tar label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TAR_LABEL = NAMED_ITEM_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = NAMED_ITEM_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATION_COUNT = NAMED_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modelgraph.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelgraph.impl.EdgeImpl
	 * @see modelgraph.impl.ModelgraphPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__NAME = RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Att Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__ATT_NAME = RELATION__ATT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__REFERENCE = RELATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__LABEL = RELATION__LABEL;

	/**
	 * The feature id for the '<em><b>Src decoration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__SRC_DECORATION = RELATION__SRC_DECORATION;

	/**
	 * The feature id for the '<em><b>Src label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__SRC_LABEL = RELATION__SRC_LABEL;

	/**
	 * The feature id for the '<em><b>Tar decoration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__TAR_DECORATION = RELATION__TAR_DECORATION;

	/**
	 * The feature id for the '<em><b>Tar label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__TAR_LABEL = RELATION__TAR_LABEL;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__SOURCE = RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__TARGET = RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = RELATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modelgraph.impl.LevelImpl <em>Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelgraph.impl.LevelImpl
	 * @see modelgraph.impl.ModelgraphPackageImpl#getLevel()
	 * @generated
	 */
	int LEVEL = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__NAME = RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Att Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__ATT_NAME = RELATION__ATT_NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__REFERENCE = RELATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__LABEL = RELATION__LABEL;

	/**
	 * The feature id for the '<em><b>Src decoration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__SRC_DECORATION = RELATION__SRC_DECORATION;

	/**
	 * The feature id for the '<em><b>Src label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__SRC_LABEL = RELATION__SRC_LABEL;

	/**
	 * The feature id for the '<em><b>Tar decoration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__TAR_DECORATION = RELATION__TAR_DECORATION;

	/**
	 * The feature id for the '<em><b>Tar label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__TAR_LABEL = RELATION__TAR_LABEL;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__UPPER = RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_FEATURE_COUNT = RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modelgraph.impl.NodeEnumeratorImpl <em>Node Enumerator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelgraph.impl.NodeEnumeratorImpl
	 * @see modelgraph.impl.ModelgraphPackageImpl#getNodeEnumerator()
	 * @generated
	 */
	int NODE_ENUMERATOR = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ENUMERATOR__NAME = ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Att</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ENUMERATOR__ATT = ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enumerator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ENUMERATOR__ENUMERATOR = ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Node Enumerator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ENUMERATOR_FEATURE_COUNT = ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Node Enumerator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ENUMERATOR_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modelgraph.impl.EnumeratorImpl <em>Enumerator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelgraph.impl.EnumeratorImpl
	 * @see modelgraph.impl.ModelgraphPackageImpl#getEnumerator()
	 * @generated
	 */
	int ENUMERATOR = 9;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATOR__LITERAL = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATOR__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Enumerator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Enumerator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modelgraph.impl.InformationImpl <em>Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelgraph.impl.InformationImpl
	 * @see modelgraph.impl.ModelgraphPackageImpl#getInformation()
	 * @generated
	 */
	int INFORMATION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__NAME = ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__TYPE = ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Att</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__ATT = ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FEATURE_COUNT = ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modelgraph.impl.ContentImpl <em>Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelgraph.impl.ContentImpl
	 * @see modelgraph.impl.ModelgraphPackageImpl#getContent()
	 * @generated
	 */
	int CONTENT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__NAME = NAMED_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Att Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__ATT_NAME = NAMED_ITEM__ATT_NAME;

	/**
	 * The feature id for the '<em><b>Nodenum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__NODENUM = NAMED_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__INFO = NAMED_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__SYMBOL = NAMED_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FEATURE_COUNT = NAMED_ITEM_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_OPERATION_COUNT = NAMED_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modelgraph.GraphType <em>Graph Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelgraph.GraphType
	 * @see modelgraph.impl.ModelgraphPackageImpl#getGraphType()
	 * @generated
	 */
	int GRAPH_TYPE = 12;

	/**
	 * The meta object id for the '{@link modelgraph.NodeType <em>Node Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelgraph.NodeType
	 * @see modelgraph.impl.ModelgraphPackageImpl#getNodeType()
	 * @generated
	 */
	int NODE_TYPE = 13;

	/**
	 * The meta object id for the '{@link modelgraph.NodeShape <em>Node Shape</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelgraph.NodeShape
	 * @see modelgraph.impl.ModelgraphPackageImpl#getNodeShape()
	 * @generated
	 */
	int NODE_SHAPE = 14;

	/**
	 * The meta object id for the '{@link modelgraph.NodeColor <em>Node Color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelgraph.NodeColor
	 * @see modelgraph.impl.ModelgraphPackageImpl#getNodeColor()
	 * @generated
	 */
	int NODE_COLOR = 15;

	/**
	 * The meta object id for the '{@link modelgraph.Decoration <em>Decoration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelgraph.Decoration
	 * @see modelgraph.impl.ModelgraphPackageImpl#getDecoration()
	 * @generated
	 */
	int DECORATION = 16;

	/**
	 * The meta object id for the '{@link modelgraph.NodeStyle <em>Node Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelgraph.NodeStyle
	 * @see modelgraph.impl.ModelgraphPackageImpl#getNodeStyle()
	 * @generated
	 */
	int NODE_STYLE = 17;


	/**
	 * Returns the meta object for class '{@link modelgraph.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see modelgraph.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the reference '{@link modelgraph.Item#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name</em>'.
	 * @see modelgraph.Item#getName()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Name();

	/**
	 * Returns the meta object for class '{@link modelgraph.MutatorGraph <em>Mutator Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mutator Graph</em>'.
	 * @see modelgraph.MutatorGraph
	 * @generated
	 */
	EClass getMutatorGraph();

	/**
	 * Returns the meta object for the attribute '{@link modelgraph.MutatorGraph#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see modelgraph.MutatorGraph#getType()
	 * @see #getMutatorGraph()
	 * @generated
	 */
	EAttribute getMutatorGraph_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link modelgraph.MutatorGraph#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see modelgraph.MutatorGraph#getNodes()
	 * @see #getMutatorGraph()
	 * @generated
	 */
	EReference getMutatorGraph_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link modelgraph.MutatorGraph#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see modelgraph.MutatorGraph#getRelations()
	 * @see #getMutatorGraph()
	 * @generated
	 */
	EReference getMutatorGraph_Relations();

	/**
	 * Returns the meta object for the containment reference list '{@link modelgraph.MutatorGraph#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see modelgraph.MutatorGraph#getContents()
	 * @see #getMutatorGraph()
	 * @generated
	 */
	EReference getMutatorGraph_Contents();

	/**
	 * Returns the meta object for the attribute '{@link modelgraph.MutatorGraph#getMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metamodel</em>'.
	 * @see modelgraph.MutatorGraph#getMetamodel()
	 * @see #getMutatorGraph()
	 * @generated
	 */
	EAttribute getMutatorGraph_Metamodel();

	/**
	 * Returns the meta object for class '{@link modelgraph.NamedItem <em>Named Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Item</em>'.
	 * @see modelgraph.NamedItem
	 * @generated
	 */
	EClass getNamedItem();

	/**
	 * Returns the meta object for the reference '{@link modelgraph.NamedItem#getAttName <em>Att Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Att Name</em>'.
	 * @see modelgraph.NamedItem#getAttName()
	 * @see #getNamedItem()
	 * @generated
	 */
	EReference getNamedItem_AttName();

	/**
	 * Returns the meta object for class '{@link modelgraph.BooleanAttribute <em>Boolean Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Attribute</em>'.
	 * @see modelgraph.BooleanAttribute
	 * @generated
	 */
	EClass getBooleanAttribute();

	/**
	 * Returns the meta object for the attribute '{@link modelgraph.BooleanAttribute#isNegation <em>Negation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negation</em>'.
	 * @see modelgraph.BooleanAttribute#isNegation()
	 * @see #getBooleanAttribute()
	 * @generated
	 */
	EAttribute getBooleanAttribute_Negation();

	/**
	 * Returns the meta object for the reference '{@link modelgraph.BooleanAttribute#getAtt <em>Att</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Att</em>'.
	 * @see modelgraph.BooleanAttribute#getAtt()
	 * @see #getBooleanAttribute()
	 * @generated
	 */
	EReference getBooleanAttribute_Att();

	/**
	 * Returns the meta object for class '{@link modelgraph.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see modelgraph.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference list '{@link modelgraph.Node#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see modelgraph.Node#getAttribute()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Attribute();

	/**
	 * Returns the meta object for the reference list '{@link modelgraph.Node#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reference</em>'.
	 * @see modelgraph.Node#getReference()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Reference();

	/**
	 * Returns the meta object for the attribute '{@link modelgraph.Node#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see modelgraph.Node#getType()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Type();

	/**
	 * Returns the meta object for the attribute '{@link modelgraph.Node#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape</em>'.
	 * @see modelgraph.Node#getShape()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Shape();

	/**
	 * Returns the meta object for the attribute '{@link modelgraph.Node#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see modelgraph.Node#getColor()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Color();

	/**
	 * Returns the meta object for the attribute '{@link modelgraph.Node#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see modelgraph.Node#getStyle()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Style();

	/**
	 * Returns the meta object for class '{@link modelgraph.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see modelgraph.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the reference '{@link modelgraph.Relation#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see modelgraph.Relation#getReference()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Reference();

	/**
	 * Returns the meta object for the reference '{@link modelgraph.Relation#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Label</em>'.
	 * @see modelgraph.Relation#getLabel()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Label();

	/**
	 * Returns the meta object for the attribute '{@link modelgraph.Relation#getSrc_decoration <em>Src decoration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src decoration</em>'.
	 * @see modelgraph.Relation#getSrc_decoration()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Src_decoration();

	/**
	 * Returns the meta object for the reference '{@link modelgraph.Relation#getSrc_label <em>Src label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src label</em>'.
	 * @see modelgraph.Relation#getSrc_label()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Src_label();

	/**
	 * Returns the meta object for the attribute '{@link modelgraph.Relation#getTar_decoration <em>Tar decoration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tar decoration</em>'.
	 * @see modelgraph.Relation#getTar_decoration()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Tar_decoration();

	/**
	 * Returns the meta object for the reference '{@link modelgraph.Relation#getTar_label <em>Tar label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tar label</em>'.
	 * @see modelgraph.Relation#getTar_label()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Tar_label();

	/**
	 * Returns the meta object for class '{@link modelgraph.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see modelgraph.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the reference '{@link modelgraph.Edge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see modelgraph.Edge#getSource()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Source();

	/**
	 * Returns the meta object for the reference '{@link modelgraph.Edge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see modelgraph.Edge#getTarget()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Target();

	/**
	 * Returns the meta object for class '{@link modelgraph.Level <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Level</em>'.
	 * @see modelgraph.Level
	 * @generated
	 */
	EClass getLevel();

	/**
	 * Returns the meta object for the reference '{@link modelgraph.Level#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Upper</em>'.
	 * @see modelgraph.Level#getUpper()
	 * @see #getLevel()
	 * @generated
	 */
	EReference getLevel_Upper();

	/**
	 * Returns the meta object for class '{@link modelgraph.NodeEnumerator <em>Node Enumerator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Enumerator</em>'.
	 * @see modelgraph.NodeEnumerator
	 * @generated
	 */
	EClass getNodeEnumerator();

	/**
	 * Returns the meta object for the reference '{@link modelgraph.NodeEnumerator#getAtt <em>Att</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Att</em>'.
	 * @see modelgraph.NodeEnumerator#getAtt()
	 * @see #getNodeEnumerator()
	 * @generated
	 */
	EReference getNodeEnumerator_Att();

	/**
	 * Returns the meta object for the containment reference list '{@link modelgraph.NodeEnumerator#getEnumerator <em>Enumerator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumerator</em>'.
	 * @see modelgraph.NodeEnumerator#getEnumerator()
	 * @see #getNodeEnumerator()
	 * @generated
	 */
	EReference getNodeEnumerator_Enumerator();

	/**
	 * Returns the meta object for class '{@link modelgraph.Enumerator <em>Enumerator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumerator</em>'.
	 * @see modelgraph.Enumerator
	 * @generated
	 */
	EClass getEnumerator();

	/**
	 * Returns the meta object for the reference '{@link modelgraph.Enumerator#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Literal</em>'.
	 * @see modelgraph.Enumerator#getLiteral()
	 * @see #getEnumerator()
	 * @generated
	 */
	EReference getEnumerator_Literal();

	/**
	 * Returns the meta object for the attribute '{@link modelgraph.Enumerator#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see modelgraph.Enumerator#getValue()
	 * @see #getEnumerator()
	 * @generated
	 */
	EAttribute getEnumerator_Value();

	/**
	 * Returns the meta object for class '{@link modelgraph.Information <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information</em>'.
	 * @see modelgraph.Information
	 * @generated
	 */
	EClass getInformation();

	/**
	 * Returns the meta object for the reference '{@link modelgraph.Information#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see modelgraph.Information#getType()
	 * @see #getInformation()
	 * @generated
	 */
	EReference getInformation_Type();

	/**
	 * Returns the meta object for the reference '{@link modelgraph.Information#getAtt <em>Att</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Att</em>'.
	 * @see modelgraph.Information#getAtt()
	 * @see #getInformation()
	 * @generated
	 */
	EReference getInformation_Att();

	/**
	 * Returns the meta object for class '{@link modelgraph.Content <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content</em>'.
	 * @see modelgraph.Content
	 * @generated
	 */
	EClass getContent();

	/**
	 * Returns the meta object for the containment reference list '{@link modelgraph.Content#getNodenum <em>Nodenum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodenum</em>'.
	 * @see modelgraph.Content#getNodenum()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_Nodenum();

	/**
	 * Returns the meta object for the containment reference list '{@link modelgraph.Content#getInfo <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Info</em>'.
	 * @see modelgraph.Content#getInfo()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_Info();

	/**
	 * Returns the meta object for the attribute '{@link modelgraph.Content#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see modelgraph.Content#getSymbol()
	 * @see #getContent()
	 * @generated
	 */
	EAttribute getContent_Symbol();

	/**
	 * Returns the meta object for enum '{@link modelgraph.GraphType <em>Graph Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Graph Type</em>'.
	 * @see modelgraph.GraphType
	 * @generated
	 */
	EEnum getGraphType();

	/**
	 * Returns the meta object for enum '{@link modelgraph.NodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Node Type</em>'.
	 * @see modelgraph.NodeType
	 * @generated
	 */
	EEnum getNodeType();

	/**
	 * Returns the meta object for enum '{@link modelgraph.NodeShape <em>Node Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Node Shape</em>'.
	 * @see modelgraph.NodeShape
	 * @generated
	 */
	EEnum getNodeShape();

	/**
	 * Returns the meta object for enum '{@link modelgraph.NodeColor <em>Node Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Node Color</em>'.
	 * @see modelgraph.NodeColor
	 * @generated
	 */
	EEnum getNodeColor();

	/**
	 * Returns the meta object for enum '{@link modelgraph.Decoration <em>Decoration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Decoration</em>'.
	 * @see modelgraph.Decoration
	 * @generated
	 */
	EEnum getDecoration();

	/**
	 * Returns the meta object for enum '{@link modelgraph.NodeStyle <em>Node Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Node Style</em>'.
	 * @see modelgraph.NodeStyle
	 * @generated
	 */
	EEnum getNodeStyle();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelgraphFactory getModelgraphFactory();

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
		 * The meta object literal for the '{@link modelgraph.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelgraph.impl.ItemImpl
		 * @see modelgraph.impl.ModelgraphPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__NAME = eINSTANCE.getItem_Name();

		/**
		 * The meta object literal for the '{@link modelgraph.impl.MutatorGraphImpl <em>Mutator Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelgraph.impl.MutatorGraphImpl
		 * @see modelgraph.impl.ModelgraphPackageImpl#getMutatorGraph()
		 * @generated
		 */
		EClass MUTATOR_GRAPH = eINSTANCE.getMutatorGraph();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUTATOR_GRAPH__TYPE = eINSTANCE.getMutatorGraph_Type();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUTATOR_GRAPH__NODES = eINSTANCE.getMutatorGraph_Nodes();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUTATOR_GRAPH__RELATIONS = eINSTANCE.getMutatorGraph_Relations();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUTATOR_GRAPH__CONTENTS = eINSTANCE.getMutatorGraph_Contents();

		/**
		 * The meta object literal for the '<em><b>Metamodel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUTATOR_GRAPH__METAMODEL = eINSTANCE.getMutatorGraph_Metamodel();

		/**
		 * The meta object literal for the '{@link modelgraph.impl.NamedItemImpl <em>Named Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelgraph.impl.NamedItemImpl
		 * @see modelgraph.impl.ModelgraphPackageImpl#getNamedItem()
		 * @generated
		 */
		EClass NAMED_ITEM = eINSTANCE.getNamedItem();

		/**
		 * The meta object literal for the '<em><b>Att Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_ITEM__ATT_NAME = eINSTANCE.getNamedItem_AttName();

		/**
		 * The meta object literal for the '{@link modelgraph.impl.BooleanAttributeImpl <em>Boolean Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelgraph.impl.BooleanAttributeImpl
		 * @see modelgraph.impl.ModelgraphPackageImpl#getBooleanAttribute()
		 * @generated
		 */
		EClass BOOLEAN_ATTRIBUTE = eINSTANCE.getBooleanAttribute();

		/**
		 * The meta object literal for the '<em><b>Negation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_ATTRIBUTE__NEGATION = eINSTANCE.getBooleanAttribute_Negation();

		/**
		 * The meta object literal for the '<em><b>Att</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_ATTRIBUTE__ATT = eINSTANCE.getBooleanAttribute_Att();

		/**
		 * The meta object literal for the '{@link modelgraph.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelgraph.impl.NodeImpl
		 * @see modelgraph.impl.ModelgraphPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__ATTRIBUTE = eINSTANCE.getNode_Attribute();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__REFERENCE = eINSTANCE.getNode_Reference();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__TYPE = eINSTANCE.getNode_Type();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__SHAPE = eINSTANCE.getNode_Shape();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__COLOR = eINSTANCE.getNode_Color();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__STYLE = eINSTANCE.getNode_Style();

		/**
		 * The meta object literal for the '{@link modelgraph.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelgraph.impl.RelationImpl
		 * @see modelgraph.impl.ModelgraphPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__REFERENCE = eINSTANCE.getRelation_Reference();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__LABEL = eINSTANCE.getRelation_Label();

		/**
		 * The meta object literal for the '<em><b>Src decoration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__SRC_DECORATION = eINSTANCE.getRelation_Src_decoration();

		/**
		 * The meta object literal for the '<em><b>Src label</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__SRC_LABEL = eINSTANCE.getRelation_Src_label();

		/**
		 * The meta object literal for the '<em><b>Tar decoration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__TAR_DECORATION = eINSTANCE.getRelation_Tar_decoration();

		/**
		 * The meta object literal for the '<em><b>Tar label</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__TAR_LABEL = eINSTANCE.getRelation_Tar_label();

		/**
		 * The meta object literal for the '{@link modelgraph.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelgraph.impl.EdgeImpl
		 * @see modelgraph.impl.ModelgraphPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__SOURCE = eINSTANCE.getEdge_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__TARGET = eINSTANCE.getEdge_Target();

		/**
		 * The meta object literal for the '{@link modelgraph.impl.LevelImpl <em>Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelgraph.impl.LevelImpl
		 * @see modelgraph.impl.ModelgraphPackageImpl#getLevel()
		 * @generated
		 */
		EClass LEVEL = eINSTANCE.getLevel();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEVEL__UPPER = eINSTANCE.getLevel_Upper();

		/**
		 * The meta object literal for the '{@link modelgraph.impl.NodeEnumeratorImpl <em>Node Enumerator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelgraph.impl.NodeEnumeratorImpl
		 * @see modelgraph.impl.ModelgraphPackageImpl#getNodeEnumerator()
		 * @generated
		 */
		EClass NODE_ENUMERATOR = eINSTANCE.getNodeEnumerator();

		/**
		 * The meta object literal for the '<em><b>Att</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_ENUMERATOR__ATT = eINSTANCE.getNodeEnumerator_Att();

		/**
		 * The meta object literal for the '<em><b>Enumerator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_ENUMERATOR__ENUMERATOR = eINSTANCE.getNodeEnumerator_Enumerator();

		/**
		 * The meta object literal for the '{@link modelgraph.impl.EnumeratorImpl <em>Enumerator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelgraph.impl.EnumeratorImpl
		 * @see modelgraph.impl.ModelgraphPackageImpl#getEnumerator()
		 * @generated
		 */
		EClass ENUMERATOR = eINSTANCE.getEnumerator();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATOR__LITERAL = eINSTANCE.getEnumerator_Literal();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATOR__VALUE = eINSTANCE.getEnumerator_Value();

		/**
		 * The meta object literal for the '{@link modelgraph.impl.InformationImpl <em>Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelgraph.impl.InformationImpl
		 * @see modelgraph.impl.ModelgraphPackageImpl#getInformation()
		 * @generated
		 */
		EClass INFORMATION = eINSTANCE.getInformation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION__TYPE = eINSTANCE.getInformation_Type();

		/**
		 * The meta object literal for the '<em><b>Att</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION__ATT = eINSTANCE.getInformation_Att();

		/**
		 * The meta object literal for the '{@link modelgraph.impl.ContentImpl <em>Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelgraph.impl.ContentImpl
		 * @see modelgraph.impl.ModelgraphPackageImpl#getContent()
		 * @generated
		 */
		EClass CONTENT = eINSTANCE.getContent();

		/**
		 * The meta object literal for the '<em><b>Nodenum</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__NODENUM = eINSTANCE.getContent_Nodenum();

		/**
		 * The meta object literal for the '<em><b>Info</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__INFO = eINSTANCE.getContent_Info();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT__SYMBOL = eINSTANCE.getContent_Symbol();

		/**
		 * The meta object literal for the '{@link modelgraph.GraphType <em>Graph Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelgraph.GraphType
		 * @see modelgraph.impl.ModelgraphPackageImpl#getGraphType()
		 * @generated
		 */
		EEnum GRAPH_TYPE = eINSTANCE.getGraphType();

		/**
		 * The meta object literal for the '{@link modelgraph.NodeType <em>Node Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelgraph.NodeType
		 * @see modelgraph.impl.ModelgraphPackageImpl#getNodeType()
		 * @generated
		 */
		EEnum NODE_TYPE = eINSTANCE.getNodeType();

		/**
		 * The meta object literal for the '{@link modelgraph.NodeShape <em>Node Shape</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelgraph.NodeShape
		 * @see modelgraph.impl.ModelgraphPackageImpl#getNodeShape()
		 * @generated
		 */
		EEnum NODE_SHAPE = eINSTANCE.getNodeShape();

		/**
		 * The meta object literal for the '{@link modelgraph.NodeColor <em>Node Color</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelgraph.NodeColor
		 * @see modelgraph.impl.ModelgraphPackageImpl#getNodeColor()
		 * @generated
		 */
		EEnum NODE_COLOR = eINSTANCE.getNodeColor();

		/**
		 * The meta object literal for the '{@link modelgraph.Decoration <em>Decoration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelgraph.Decoration
		 * @see modelgraph.impl.ModelgraphPackageImpl#getDecoration()
		 * @generated
		 */
		EEnum DECORATION = eINSTANCE.getDecoration();

		/**
		 * The meta object literal for the '{@link modelgraph.NodeStyle <em>Node Style</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelgraph.NodeStyle
		 * @see modelgraph.impl.ModelgraphPackageImpl#getNodeStyle()
		 * @generated
		 */
		EEnum NODE_STYLE = eINSTANCE.getNodeStyle();

	}

} //ModelgraphPackage