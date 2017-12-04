/**
 */
package ccsM2;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsM2.Binding#getPort <em>Port</em>}</li>
 *   <li>{@link ccsM2.Binding#getPortconfiguration <em>Portconfiguration</em>}</li>
 * </ul>
 *
 * @see ccsM2.CCSPackage#getBinding()
 * @model
 * @generated
 */
public interface Binding extends ILink {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference.
	 * @see #setPort(Port)
	 * @see ccsM2.CCSPackage#getBinding_Port()
	 * @model required="true"
	 * @generated
	 */
	Port getPort();

	/**
	 * Sets the value of the '{@link ccsM2.Binding#getPort <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Port value);

	/**
	 * Returns the value of the '<em><b>Portconfiguration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portconfiguration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portconfiguration</em>' reference.
	 * @see #setPortconfiguration(PortConfiguration)
	 * @see ccsM2.CCSPackage#getBinding_Portconfiguration()
	 * @model required="true"
	 * @generated
	 */
	PortConfiguration getPortconfiguration();

	/**
	 * Sets the value of the '{@link ccsM2.Binding#getPortconfiguration <em>Portconfiguration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portconfiguration</em>' reference.
	 * @see #getPortconfiguration()
	 * @generated
	 */
	void setPortconfiguration(PortConfiguration value);

} // Binding
