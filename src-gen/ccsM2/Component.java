/**
 */
package ccsM2;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsM2.Component#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link ccsM2.Component#getIcomponentelement <em>Icomponentelement</em>}</li>
 * </ul>
 *
 * @see ccsM2.CCSPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject {
	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference.
	 * @see #setConfiguration(Configuration)
	 * @see ccsM2.CCSPackage#getComponent_Configuration()
	 * @model containment="true"
	 * @generated
	 */
	Configuration getConfiguration();

	/**
	 * Sets the value of the '{@link ccsM2.Component#getConfiguration <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' containment reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(Configuration value);

	/**
	 * Returns the value of the '<em><b>Icomponentelement</b></em>' containment reference list.
	 * The list contents are of type {@link ccsM2.IComponentElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icomponentelement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icomponentelement</em>' containment reference list.
	 * @see ccsM2.CCSPackage#getComponent_Icomponentelement()
	 * @model containment="true"
	 * @generated
	 */
	EList<IComponentElement> getIcomponentelement();
	
	public void SetInterfaceValue(IComponentElement element, Object value);

} // Component
