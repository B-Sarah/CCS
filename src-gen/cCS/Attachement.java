/**
 */
package cCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.Attachement#getIcomponentelement <em>Icomponentelement</em>}</li>
 *   <li>{@link cCS.Attachement#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see cCS.CCSPackage#getAttachement()
 * @model
 * @generated
 */
public interface Attachement extends ILink {
	/**
	 * Returns the value of the '<em><b>Icomponentelement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icomponentelement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icomponentelement</em>' reference.
	 * @see #setIcomponentelement(IComponentElement)
	 * @see cCS.CCSPackage#getAttachement_Icomponentelement()
	 * @model required="true"
	 * @generated
	 */
	IComponentElement getIcomponentelement();

	/**
	 * Sets the value of the '{@link cCS.Attachement#getIcomponentelement <em>Icomponentelement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icomponentelement</em>' reference.
	 * @see #getIcomponentelement()
	 * @generated
	 */
	void setIcomponentelement(IComponentElement value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(Role)
	 * @see cCS.CCSPackage#getAttachement_Role()
	 * @model required="true"
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link cCS.Attachement#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

} // Attachement
