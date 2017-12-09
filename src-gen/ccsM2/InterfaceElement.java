/**
 */
package ccsM2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsM2.InterfaceElement#getMode <em>Mode</em>}</li>
 *   <li>{@link ccsM2.InterfaceElement#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link ccsM2.InterfaceElement#getContainedValue <em>Contained Value</em>}</li>
 * </ul>
 *
 * @see ccsM2.CCSPackage#getInterfaceElement()
 * @model
 * @generated
 */
public interface InterfaceElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link ccsM2.Mode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see ccsM2.Mode
	 * @see #setMode(Mode)
	 * @see ccsM2.CCSPackage#getInterfaceElement_Mode()
	 * @model
	 * @generated
	 */
	Mode getMode();

	/**
	 * Sets the value of the '{@link ccsM2.InterfaceElement#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see ccsM2.Mode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(Mode value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link ccsM2.Visibility}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see ccsM2.Visibility
	 * @see #setVisibility(Visibility)
	 * @see ccsM2.CCSPackage#getInterfaceElement_Visibility()
	 * @model
	 * @generated
	 */
	Visibility getVisibility();

	/**
	 * Sets the value of the '{@link ccsM2.InterfaceElement#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see ccsM2.Visibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(Visibility value);

	/**
	 * Returns the value of the '<em><b>Contained Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Value</em>' attribute.
	 * @see #setContainedValue(Object)
	 * @see ccsM2.CCSPackage#getInterfaceElement_ContainedValue()
	 * @model dataType="ccsM2.ElementValue"
	 * @generated
	 */
	Object getContainedValue();

	/**
	 * Sets the value of the '{@link ccsM2.InterfaceElement#getContainedValue <em>Contained Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained Value</em>' attribute.
	 * @see #getContainedValue()
	 * @generated
	 */
	void setContainedValue(Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void SetMode(Mode mode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void SetVisibility(Visibility visibility);

} // InterfaceElement
