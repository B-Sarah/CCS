/**
 */
package ccsM2.impl;

import ccsM2.CCSPackage;
import ccsM2.Component;
import ccsM2.Configuration;

import ccsM2.IComponentElement;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsM2.impl.ComponentImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link ccsM2.impl.ComponentImpl#getIcomponentelement <em>Icomponentelement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends MinimalEObjectImpl.Container implements Component {
	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected Configuration configuration;

	/**
	 * The cached value of the '{@link #getIcomponentelement() <em>Icomponentelement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcomponentelement()
	 * @generated
	 * @ordered
	 */
	protected EList<IComponentElement> icomponentelement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration getConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfiguration(Configuration newConfiguration, NotificationChain msgs) {
		Configuration oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CCSPackage.COMPONENT__CONFIGURATION, oldConfiguration, newConfiguration);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration(Configuration newConfiguration) {
		if (newConfiguration != configuration) {
			NotificationChain msgs = null;
			if (configuration != null)
				msgs = ((InternalEObject) configuration).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CCSPackage.COMPONENT__CONFIGURATION, null, msgs);
			if (newConfiguration != null)
				msgs = ((InternalEObject) newConfiguration).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CCSPackage.COMPONENT__CONFIGURATION, null, msgs);
			msgs = basicSetConfiguration(newConfiguration, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.COMPONENT__CONFIGURATION, newConfiguration,
					newConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IComponentElement> getIcomponentelement() {
		if (icomponentelement == null) {
			icomponentelement = new EObjectContainmentEList<IComponentElement>(IComponentElement.class, this,
					CCSPackage.COMPONENT__ICOMPONENTELEMENT);
		}
		return icomponentelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CCSPackage.COMPONENT__CONFIGURATION:
			return basicSetConfiguration(null, msgs);
		case CCSPackage.COMPONENT__ICOMPONENTELEMENT:
			return ((InternalEList<?>) getIcomponentelement()).basicRemove(otherEnd, msgs);
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
		case CCSPackage.COMPONENT__CONFIGURATION:
			return getConfiguration();
		case CCSPackage.COMPONENT__ICOMPONENTELEMENT:
			return getIcomponentelement();
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
		case CCSPackage.COMPONENT__CONFIGURATION:
			setConfiguration((Configuration) newValue);
			return;
		case CCSPackage.COMPONENT__ICOMPONENTELEMENT:
			getIcomponentelement().clear();
			getIcomponentelement().addAll((Collection<? extends IComponentElement>) newValue);
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
		case CCSPackage.COMPONENT__CONFIGURATION:
			setConfiguration((Configuration) null);
			return;
		case CCSPackage.COMPONENT__ICOMPONENTELEMENT:
			getIcomponentelement().clear();
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
		case CCSPackage.COMPONENT__CONFIGURATION:
			return configuration != null;
		case CCSPackage.COMPONENT__ICOMPONENTELEMENT:
			return icomponentelement != null && !icomponentelement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentImpl
