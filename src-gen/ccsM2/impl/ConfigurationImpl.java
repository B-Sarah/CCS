/**
 */
package ccsM2.impl;

import ccsM2.CCSPackage;
import ccsM2.Component;
import ccsM2.Configuration;
import ccsM2.Connector;
import ccsM2.ILink;
import ccsM2.PortConfiguration;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsM2.impl.ConfigurationImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link ccsM2.impl.ConfigurationImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link ccsM2.impl.ConfigurationImpl#getPortconfiguration <em>Portconfiguration</em>}</li>
 *   <li>{@link ccsM2.impl.ConfigurationImpl#getIlink <em>Ilink</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationImpl extends MinimalEObjectImpl.Container implements Configuration {
	/**
	 * The cached value of the '{@link #getConnector() <em>Connector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnector()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> connector;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> component;

	/**
	 * The cached value of the '{@link #getPortconfiguration() <em>Portconfiguration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortconfiguration()
	 * @generated
	 * @ordered
	 */
	protected EList<PortConfiguration> portconfiguration;

	/**
	 * The cached value of the '{@link #getIlink() <em>Ilink</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIlink()
	 * @generated
	 * @ordered
	 */
	protected EList<ILink> ilink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getConnector() {
		if (connector == null) {
			connector = new EObjectContainmentEList<Connector>(Connector.class, this,
					CCSPackage.CONFIGURATION__CONNECTOR);
		}
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponent() {
		if (component == null) {
			component = new EObjectContainmentEList<Component>(Component.class, this,
					CCSPackage.CONFIGURATION__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortConfiguration> getPortconfiguration() {
		if (portconfiguration == null) {
			portconfiguration = new EObjectContainmentEList<PortConfiguration>(PortConfiguration.class, this,
					CCSPackage.CONFIGURATION__PORTCONFIGURATION);
		}
		return portconfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ILink> getIlink() {
		if (ilink == null) {
			ilink = new EObjectContainmentEList<ILink>(ILink.class, this, CCSPackage.CONFIGURATION__ILINK);
		}
		return ilink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CCSPackage.CONFIGURATION__CONNECTOR:
			return ((InternalEList<?>) getConnector()).basicRemove(otherEnd, msgs);
		case CCSPackage.CONFIGURATION__COMPONENT:
			return ((InternalEList<?>) getComponent()).basicRemove(otherEnd, msgs);
		case CCSPackage.CONFIGURATION__PORTCONFIGURATION:
			return ((InternalEList<?>) getPortconfiguration()).basicRemove(otherEnd, msgs);
		case CCSPackage.CONFIGURATION__ILINK:
			return ((InternalEList<?>) getIlink()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CCSPackage.CONFIGURATION__CONNECTOR:
			return getConnector();
		case CCSPackage.CONFIGURATION__COMPONENT:
			return getComponent();
		case CCSPackage.CONFIGURATION__PORTCONFIGURATION:
			return getPortconfiguration();
		case CCSPackage.CONFIGURATION__ILINK:
			return getIlink();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CCSPackage.CONFIGURATION__CONNECTOR:
			getConnector().clear();
			getConnector().addAll((Collection<? extends Connector>) newValue);
			return;
		case CCSPackage.CONFIGURATION__COMPONENT:
			getComponent().clear();
			getComponent().addAll((Collection<? extends Component>) newValue);
			return;
		case CCSPackage.CONFIGURATION__PORTCONFIGURATION:
			getPortconfiguration().clear();
			getPortconfiguration().addAll((Collection<? extends PortConfiguration>) newValue);
			return;
		case CCSPackage.CONFIGURATION__ILINK:
			getIlink().clear();
			getIlink().addAll((Collection<? extends ILink>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CCSPackage.CONFIGURATION__CONNECTOR:
			getConnector().clear();
			return;
		case CCSPackage.CONFIGURATION__COMPONENT:
			getComponent().clear();
			return;
		case CCSPackage.CONFIGURATION__PORTCONFIGURATION:
			getPortconfiguration().clear();
			return;
		case CCSPackage.CONFIGURATION__ILINK:
			getIlink().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CCSPackage.CONFIGURATION__CONNECTOR:
			return connector != null && !connector.isEmpty();
		case CCSPackage.CONFIGURATION__COMPONENT:
			return component != null && !component.isEmpty();
		case CCSPackage.CONFIGURATION__PORTCONFIGURATION:
			return portconfiguration != null && !portconfiguration.isEmpty();
		case CCSPackage.CONFIGURATION__ILINK:
			return ilink != null && !ilink.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationImpl
