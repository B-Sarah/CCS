/**
 */
package ccsM2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsM2.Connector#getGlue <em>Glue</em>}</li>
 *   <li>{@link ccsM2.Connector#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see ccsM2.CCSPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends EObject {
	/**
	 * Returns the value of the '<em><b>Glue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glue</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glue</em>' reference.
	 * @see #setGlue(Glue)
	 * @see ccsM2.CCSPackage#getConnector_Glue()
	 * @model
	 * @generated
	 */
	Glue getGlue();

	/**
	 * Sets the value of the '{@link ccsM2.Connector#getGlue <em>Glue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glue</em>' reference.
	 * @see #getGlue()
	 * @generated
	 */
	void setGlue(Glue value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference list.
	 * The list contents are of type {@link ccsM2.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' containment reference list.
	 * @see ccsM2.CCSPackage#getConnector_Role()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getRole();

} // Connector
