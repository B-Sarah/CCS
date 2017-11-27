/**
 */
package cCS.impl;

import cCS.Binding;
import cCS.CCSPackage;
import cCS.Port;
import cCS.PortConfiguration;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.BindingImpl#getPort <em>Port</em>}</li>
 *   <li>{@link cCS.impl.BindingImpl#getPortconfiguration <em>Portconfiguration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindingImpl extends MinimalEObjectImpl.Container implements Binding {
	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected Port port;

	/**
	 * The cached value of the '{@link #getPortconfiguration() <em>Portconfiguration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortconfiguration()
	 * @generated
	 * @ordered
	 */
	protected PortConfiguration portconfiguration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getPort() {
		if (port != null && port.eIsProxy()) {
			InternalEObject oldPort = (InternalEObject) port;
			port = (Port) eResolveProxy(oldPort);
			if (port != oldPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CCSPackage.BINDING__PORT, oldPort, port));
			}
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(Port newPort) {
		Port oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.BINDING__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortConfiguration getPortconfiguration() {
		if (portconfiguration != null && portconfiguration.eIsProxy()) {
			InternalEObject oldPortconfiguration = (InternalEObject) portconfiguration;
			portconfiguration = (PortConfiguration) eResolveProxy(oldPortconfiguration);
			if (portconfiguration != oldPortconfiguration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CCSPackage.BINDING__PORTCONFIGURATION,
							oldPortconfiguration, portconfiguration));
			}
		}
		return portconfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortConfiguration basicGetPortconfiguration() {
		return portconfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortconfiguration(PortConfiguration newPortconfiguration) {
		PortConfiguration oldPortconfiguration = portconfiguration;
		portconfiguration = newPortconfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.BINDING__PORTCONFIGURATION,
					oldPortconfiguration, portconfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CCSPackage.BINDING__PORT:
			if (resolve)
				return getPort();
			return basicGetPort();
		case CCSPackage.BINDING__PORTCONFIGURATION:
			if (resolve)
				return getPortconfiguration();
			return basicGetPortconfiguration();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CCSPackage.BINDING__PORT:
			setPort((Port) newValue);
			return;
		case CCSPackage.BINDING__PORTCONFIGURATION:
			setPortconfiguration((PortConfiguration) newValue);
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
		case CCSPackage.BINDING__PORT:
			setPort((Port) null);
			return;
		case CCSPackage.BINDING__PORTCONFIGURATION:
			setPortconfiguration((PortConfiguration) null);
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
		case CCSPackage.BINDING__PORT:
			return port != null;
		case CCSPackage.BINDING__PORTCONFIGURATION:
			return portconfiguration != null;
		}
		return super.eIsSet(featureID);
	}

} //BindingImpl
