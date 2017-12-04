/**
 */
package ccsM2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsM2.Configuration#getConnector <em>Connector</em>}</li>
 *   <li>{@link ccsM2.Configuration#getComponent <em>Component</em>}</li>
 *   <li>{@link ccsM2.Configuration#getPortconfiguration <em>Portconfiguration</em>}</li>
 *   <li>{@link ccsM2.Configuration#getIlink <em>Ilink</em>}</li>
 * </ul>
 *
 * @see ccsM2.CCSPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends EObject {
	/**
	 * Returns the value of the '<em><b>Connector</b></em>' containment reference list.
	 * The list contents are of type {@link ccsM2.Connector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' containment reference list.
	 * @see ccsM2.CCSPackage#getConfiguration_Connector()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connector> getConnector();

	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link ccsM2.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see ccsM2.CCSPackage#getConfiguration_Component()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Component> getComponent();

	/**
	 * Returns the value of the '<em><b>Portconfiguration</b></em>' containment reference list.
	 * The list contents are of type {@link ccsM2.PortConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portconfiguration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portconfiguration</em>' containment reference list.
	 * @see ccsM2.CCSPackage#getConfiguration_Portconfiguration()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortConfiguration> getPortconfiguration();

	/**
	 * Returns the value of the '<em><b>Ilink</b></em>' containment reference list.
	 * The list contents are of type {@link ccsM2.ILink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ilink</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ilink</em>' containment reference list.
	 * @see ccsM2.CCSPackage#getConfiguration_Ilink()
	 * @model containment="true"
	 * @generated
	 */
	EList<ILink> getIlink();

} // Configuration
