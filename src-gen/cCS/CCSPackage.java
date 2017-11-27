/**
 */
package cCS;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see cCS.CCSFactory
 * @model kind="package"
 * @generated
 */
public interface CCSPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cCS";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/cCS";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cCS";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CCSPackage eINSTANCE = cCS.impl.CCSPackageImpl.init();

	/**
	 * The meta object id for the '{@link cCS.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.ConfigurationImpl
	 * @see cCS.impl.CCSPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__CONNECTOR = 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Portconfiguration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__PORTCONFIGURATION = 2;

	/**
	 * The feature id for the '<em><b>Ilink</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ILINK = 3;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cCS.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.ConnectorImpl
	 * @see cCS.impl.CCSPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 1;

	/**
	 * The feature id for the '<em><b>Glue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__GLUE = 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__ROLE = 1;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cCS.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.ComponentImpl
	 * @see cCS.impl.CCSPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CONFIGURATION = 0;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cCS.impl.InterfaceElementImpl <em>Interface Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.InterfaceElementImpl
	 * @see cCS.impl.CCSPackageImpl#getInterfaceElement()
	 * @generated
	 */
	int INTERFACE_ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ELEMENT__MODE = 0;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ELEMENT__VISIBILITY = 1;

	/**
	 * The number of structural features of the '<em>Interface Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Set Mode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ELEMENT___SET_MODE__MODE = 0;

	/**
	 * The operation id for the '<em>Set Visibility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ELEMENT___SET_VISIBILITY__VISIBILITY = 1;

	/**
	 * The number of operations of the '<em>Interface Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ELEMENT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link cCS.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.RoleImpl
	 * @see cCS.impl.CCSPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 3;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__MODE = INTERFACE_ELEMENT__MODE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__VISIBILITY = INTERFACE_ELEMENT__VISIBILITY;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = INTERFACE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Mode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___SET_MODE__MODE = INTERFACE_ELEMENT___SET_MODE__MODE;

	/**
	 * The operation id for the '<em>Set Visibility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___SET_VISIBILITY__VISIBILITY = INTERFACE_ELEMENT___SET_VISIBILITY__VISIBILITY;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = INTERFACE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.IComponentElement <em>IComponent Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.IComponentElement
	 * @see cCS.impl.CCSPackageImpl#getIComponentElement()
	 * @generated
	 */
	int ICOMPONENT_ELEMENT = 8;

	/**
	 * The number of structural features of the '<em>IComponent Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICOMPONENT_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>IComponent Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICOMPONENT_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cCS.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.PortImpl
	 * @see cCS.impl.CCSPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 4;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__MODE = ICOMPONENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__VISIBILITY = ICOMPONENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = ICOMPONENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Mode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT___SET_MODE__MODE = ICOMPONENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Visibility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT___SET_VISIBILITY__VISIBILITY = ICOMPONENT_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = ICOMPONENT_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link cCS.ILink <em>ILink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.ILink
	 * @see cCS.impl.CCSPackageImpl#getILink()
	 * @generated
	 */
	int ILINK = 9;

	/**
	 * The number of structural features of the '<em>ILink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILINK_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>ILink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cCS.impl.AttachementImpl <em>Attachement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.AttachementImpl
	 * @see cCS.impl.CCSPackageImpl#getAttachement()
	 * @generated
	 */
	int ATTACHEMENT = 5;

	/**
	 * The feature id for the '<em><b>Icomponentelement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT__ICOMPONENTELEMENT = ILINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT__ROLE = ILINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attachement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_FEATURE_COUNT = ILINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attachement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_OPERATION_COUNT = ILINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.BindingImpl
	 * @see cCS.impl.CCSPackageImpl#getBinding()
	 * @generated
	 */
	int BINDING = 6;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__PORT = ILINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Portconfiguration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__PORTCONFIGURATION = ILINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FEATURE_COUNT = ILINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION_COUNT = ILINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.ServiceImpl
	 * @see cCS.impl.CCSPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 7;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__MODE = ICOMPONENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__VISIBILITY = ICOMPONENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = ICOMPONENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Mode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___SET_MODE__MODE = ICOMPONENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Visibility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___SET_VISIBILITY__VISIBILITY = ICOMPONENT_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = ICOMPONENT_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link cCS.impl.GlueImpl <em>Glue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.GlueImpl
	 * @see cCS.impl.CCSPackageImpl#getGlue()
	 * @generated
	 */
	int GLUE = 10;

	/**
	 * The number of structural features of the '<em>Glue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Glue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cCS.impl.PortConfigurationImpl <em>Port Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.PortConfigurationImpl
	 * @see cCS.impl.CCSPackageImpl#getPortConfiguration()
	 * @generated
	 */
	int PORT_CONFIGURATION = 12;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONFIGURATION__MODE = INTERFACE_ELEMENT__MODE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONFIGURATION__VISIBILITY = INTERFACE_ELEMENT__VISIBILITY;

	/**
	 * The number of structural features of the '<em>Port Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONFIGURATION_FEATURE_COUNT = INTERFACE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Mode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONFIGURATION___SET_MODE__MODE = INTERFACE_ELEMENT___SET_MODE__MODE;

	/**
	 * The operation id for the '<em>Set Visibility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONFIGURATION___SET_VISIBILITY__VISIBILITY = INTERFACE_ELEMENT___SET_VISIBILITY__VISIBILITY;

	/**
	 * The number of operations of the '<em>Port Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONFIGURATION_OPERATION_COUNT = INTERFACE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.Mode <em>Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.Mode
	 * @see cCS.impl.CCSPackageImpl#getMode()
	 * @generated
	 */
	int MODE = 13;

	/**
	 * The meta object id for the '{@link cCS.Visibility <em>Visibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.Visibility
	 * @see cCS.impl.CCSPackageImpl#getVisibility()
	 * @generated
	 */
	int VISIBILITY = 14;

	/**
	 * Returns the meta object for class '{@link cCS.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see cCS.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.Configuration#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connector</em>'.
	 * @see cCS.Configuration#getConnector()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Connector();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.Configuration#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see cCS.Configuration#getComponent()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.Configuration#getPortconfiguration <em>Portconfiguration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Portconfiguration</em>'.
	 * @see cCS.Configuration#getPortconfiguration()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Portconfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.Configuration#getIlink <em>Ilink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ilink</em>'.
	 * @see cCS.Configuration#getIlink()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Ilink();

	/**
	 * Returns the meta object for class '{@link cCS.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see cCS.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the reference '{@link cCS.Connector#getGlue <em>Glue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Glue</em>'.
	 * @see cCS.Connector#getGlue()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Glue();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.Connector#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role</em>'.
	 * @see cCS.Connector#getRole()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Role();

	/**
	 * Returns the meta object for class '{@link cCS.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see cCS.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference '{@link cCS.Component#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration</em>'.
	 * @see cCS.Component#getConfiguration()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Configuration();

	/**
	 * Returns the meta object for class '{@link cCS.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see cCS.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for class '{@link cCS.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see cCS.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for class '{@link cCS.Attachement <em>Attachement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachement</em>'.
	 * @see cCS.Attachement
	 * @generated
	 */
	EClass getAttachement();

	/**
	 * Returns the meta object for the reference '{@link cCS.Attachement#getIcomponentelement <em>Icomponentelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Icomponentelement</em>'.
	 * @see cCS.Attachement#getIcomponentelement()
	 * @see #getAttachement()
	 * @generated
	 */
	EReference getAttachement_Icomponentelement();

	/**
	 * Returns the meta object for the reference '{@link cCS.Attachement#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see cCS.Attachement#getRole()
	 * @see #getAttachement()
	 * @generated
	 */
	EReference getAttachement_Role();

	/**
	 * Returns the meta object for class '{@link cCS.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see cCS.Binding
	 * @generated
	 */
	EClass getBinding();

	/**
	 * Returns the meta object for the reference '{@link cCS.Binding#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see cCS.Binding#getPort()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Port();

	/**
	 * Returns the meta object for the reference '{@link cCS.Binding#getPortconfiguration <em>Portconfiguration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portconfiguration</em>'.
	 * @see cCS.Binding#getPortconfiguration()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Portconfiguration();

	/**
	 * Returns the meta object for class '{@link cCS.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see cCS.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for class '{@link cCS.IComponentElement <em>IComponent Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IComponent Element</em>'.
	 * @see cCS.IComponentElement
	 * @generated
	 */
	EClass getIComponentElement();

	/**
	 * Returns the meta object for class '{@link cCS.ILink <em>ILink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ILink</em>'.
	 * @see cCS.ILink
	 * @generated
	 */
	EClass getILink();

	/**
	 * Returns the meta object for class '{@link cCS.Glue <em>Glue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Glue</em>'.
	 * @see cCS.Glue
	 * @generated
	 */
	EClass getGlue();

	/**
	 * Returns the meta object for class '{@link cCS.InterfaceElement <em>Interface Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Element</em>'.
	 * @see cCS.InterfaceElement
	 * @generated
	 */
	EClass getInterfaceElement();

	/**
	 * Returns the meta object for the attribute '{@link cCS.InterfaceElement#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see cCS.InterfaceElement#getMode()
	 * @see #getInterfaceElement()
	 * @generated
	 */
	EAttribute getInterfaceElement_Mode();

	/**
	 * Returns the meta object for the attribute '{@link cCS.InterfaceElement#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see cCS.InterfaceElement#getVisibility()
	 * @see #getInterfaceElement()
	 * @generated
	 */
	EAttribute getInterfaceElement_Visibility();

	/**
	 * Returns the meta object for the '{@link cCS.InterfaceElement#SetMode(cCS.Mode) <em>Set Mode</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Mode</em>' operation.
	 * @see cCS.InterfaceElement#SetMode(cCS.Mode)
	 * @generated
	 */
	EOperation getInterfaceElement__SetMode__Mode();

	/**
	 * Returns the meta object for the '{@link cCS.InterfaceElement#SetVisibility(cCS.Visibility) <em>Set Visibility</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Visibility</em>' operation.
	 * @see cCS.InterfaceElement#SetVisibility(cCS.Visibility)
	 * @generated
	 */
	EOperation getInterfaceElement__SetVisibility__Visibility();

	/**
	 * Returns the meta object for class '{@link cCS.PortConfiguration <em>Port Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Configuration</em>'.
	 * @see cCS.PortConfiguration
	 * @generated
	 */
	EClass getPortConfiguration();

	/**
	 * Returns the meta object for enum '{@link cCS.Mode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mode</em>'.
	 * @see cCS.Mode
	 * @generated
	 */
	EEnum getMode();

	/**
	 * Returns the meta object for enum '{@link cCS.Visibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility</em>'.
	 * @see cCS.Visibility
	 * @generated
	 */
	EEnum getVisibility();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CCSFactory getCCSFactory();

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
		 * The meta object literal for the '{@link cCS.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.ConfigurationImpl
		 * @see cCS.impl.CCSPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__CONNECTOR = eINSTANCE.getConfiguration_Connector();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__COMPONENT = eINSTANCE.getConfiguration_Component();

		/**
		 * The meta object literal for the '<em><b>Portconfiguration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__PORTCONFIGURATION = eINSTANCE.getConfiguration_Portconfiguration();

		/**
		 * The meta object literal for the '<em><b>Ilink</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__ILINK = eINSTANCE.getConfiguration_Ilink();

		/**
		 * The meta object literal for the '{@link cCS.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.ConnectorImpl
		 * @see cCS.impl.CCSPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Glue</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__GLUE = eINSTANCE.getConnector_Glue();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__ROLE = eINSTANCE.getConnector_Role();

		/**
		 * The meta object literal for the '{@link cCS.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.ComponentImpl
		 * @see cCS.impl.CCSPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__CONFIGURATION = eINSTANCE.getComponent_Configuration();

		/**
		 * The meta object literal for the '{@link cCS.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.RoleImpl
		 * @see cCS.impl.CCSPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '{@link cCS.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.PortImpl
		 * @see cCS.impl.CCSPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '{@link cCS.impl.AttachementImpl <em>Attachement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.AttachementImpl
		 * @see cCS.impl.CCSPackageImpl#getAttachement()
		 * @generated
		 */
		EClass ATTACHEMENT = eINSTANCE.getAttachement();

		/**
		 * The meta object literal for the '<em><b>Icomponentelement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHEMENT__ICOMPONENTELEMENT = eINSTANCE.getAttachement_Icomponentelement();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHEMENT__ROLE = eINSTANCE.getAttachement_Role();

		/**
		 * The meta object literal for the '{@link cCS.impl.BindingImpl <em>Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.BindingImpl
		 * @see cCS.impl.CCSPackageImpl#getBinding()
		 * @generated
		 */
		EClass BINDING = eINSTANCE.getBinding();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__PORT = eINSTANCE.getBinding_Port();

		/**
		 * The meta object literal for the '<em><b>Portconfiguration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__PORTCONFIGURATION = eINSTANCE.getBinding_Portconfiguration();

		/**
		 * The meta object literal for the '{@link cCS.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.ServiceImpl
		 * @see cCS.impl.CCSPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '{@link cCS.IComponentElement <em>IComponent Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.IComponentElement
		 * @see cCS.impl.CCSPackageImpl#getIComponentElement()
		 * @generated
		 */
		EClass ICOMPONENT_ELEMENT = eINSTANCE.getIComponentElement();

		/**
		 * The meta object literal for the '{@link cCS.ILink <em>ILink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.ILink
		 * @see cCS.impl.CCSPackageImpl#getILink()
		 * @generated
		 */
		EClass ILINK = eINSTANCE.getILink();

		/**
		 * The meta object literal for the '{@link cCS.impl.GlueImpl <em>Glue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.GlueImpl
		 * @see cCS.impl.CCSPackageImpl#getGlue()
		 * @generated
		 */
		EClass GLUE = eINSTANCE.getGlue();

		/**
		 * The meta object literal for the '{@link cCS.impl.InterfaceElementImpl <em>Interface Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.InterfaceElementImpl
		 * @see cCS.impl.CCSPackageImpl#getInterfaceElement()
		 * @generated
		 */
		EClass INTERFACE_ELEMENT = eINSTANCE.getInterfaceElement();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_ELEMENT__MODE = eINSTANCE.getInterfaceElement_Mode();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_ELEMENT__VISIBILITY = eINSTANCE.getInterfaceElement_Visibility();

		/**
		 * The meta object literal for the '<em><b>Set Mode</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERFACE_ELEMENT___SET_MODE__MODE = eINSTANCE.getInterfaceElement__SetMode__Mode();

		/**
		 * The meta object literal for the '<em><b>Set Visibility</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERFACE_ELEMENT___SET_VISIBILITY__VISIBILITY = eINSTANCE
				.getInterfaceElement__SetVisibility__Visibility();

		/**
		 * The meta object literal for the '{@link cCS.impl.PortConfigurationImpl <em>Port Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.PortConfigurationImpl
		 * @see cCS.impl.CCSPackageImpl#getPortConfiguration()
		 * @generated
		 */
		EClass PORT_CONFIGURATION = eINSTANCE.getPortConfiguration();

		/**
		 * The meta object literal for the '{@link cCS.Mode <em>Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.Mode
		 * @see cCS.impl.CCSPackageImpl#getMode()
		 * @generated
		 */
		EEnum MODE = eINSTANCE.getMode();

		/**
		 * The meta object literal for the '{@link cCS.Visibility <em>Visibility</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.Visibility
		 * @see cCS.impl.CCSPackageImpl#getVisibility()
		 * @generated
		 */
		EEnum VISIBILITY = eINSTANCE.getVisibility();

	}

} //CCSPackage
