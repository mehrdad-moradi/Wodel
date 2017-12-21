/**
 */
package mutatorenvironment;

import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Evaluation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mutatorenvironment.ReferenceEvaluation#getName <em>Name</em>}</li>
 *   <li>{@link mutatorenvironment.ReferenceEvaluation#getRefName <em>Ref Name</em>}</li>
 *   <li>{@link mutatorenvironment.ReferenceEvaluation#getOperator <em>Operator</em>}</li>
 *   <li>{@link mutatorenvironment.ReferenceEvaluation#getValue <em>Value</em>}</li>
 *   <li>{@link mutatorenvironment.ReferenceEvaluation#getRefType <em>Ref Type</em>}</li>
 * </ul>
 *
 * @see mutatorenvironment.MutatorenvironmentPackage#getReferenceEvaluation()
 * @model
 * @generated
 */
public interface ReferenceEvaluation extends Evaluation {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' reference.
	 * @see #setName(EReference)
	 * @see mutatorenvironment.MutatorenvironmentPackage#getReferenceEvaluation_Name()
	 * @model
	 * @generated
	 */
	EReference getName();

	/**
	 * Sets the value of the '{@link mutatorenvironment.ReferenceEvaluation#getName <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(EReference value);

	/**
	 * Returns the value of the '<em><b>Ref Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Name</em>' reference.
	 * @see #setRefName(EReference)
	 * @see mutatorenvironment.MutatorenvironmentPackage#getReferenceEvaluation_RefName()
	 * @model
	 * @generated
	 */
	EReference getRefName();

	/**
	 * Sets the value of the '{@link mutatorenvironment.ReferenceEvaluation#getRefName <em>Ref Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Name</em>' reference.
	 * @see #getRefName()
	 * @generated
	 */
	void setRefName(EReference value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link mutatorenvironment.Operator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see mutatorenvironment.Operator
	 * @see #setOperator(Operator)
	 * @see mutatorenvironment.MutatorenvironmentPackage#getReferenceEvaluation_Operator()
	 * @model
	 * @generated
	 */
	Operator getOperator();

	/**
	 * Sets the value of the '{@link mutatorenvironment.ReferenceEvaluation#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see mutatorenvironment.Operator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Operator value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(ObSelectionStrategy)
	 * @see mutatorenvironment.MutatorenvironmentPackage#getReferenceEvaluation_Value()
	 * @model containment="true"
	 * @generated
	 */
	ObSelectionStrategy getValue();

	/**
	 * Sets the value of the '{@link mutatorenvironment.ReferenceEvaluation#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ObSelectionStrategy value);

	/**
	 * Returns the value of the '<em><b>Ref Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Type</em>' reference.
	 * @see #setRefType(EReference)
	 * @see mutatorenvironment.MutatorenvironmentPackage#getReferenceEvaluation_RefType()
	 * @model
	 * @generated
	 */
	EReference getRefType();

	/**
	 * Sets the value of the '{@link mutatorenvironment.ReferenceEvaluation#getRefType <em>Ref Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Type</em>' reference.
	 * @see #getRefType()
	 * @generated
	 */
	void setRefType(EReference value);

} // ReferenceEvaluation