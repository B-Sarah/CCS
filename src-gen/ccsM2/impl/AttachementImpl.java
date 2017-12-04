/**
 */
package ccsM2.impl;

import ccsM2.Attachement;
import ccsM2.CCSPackage;
import ccsM2.IComponentElement;
import ccsM2.Role;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsM2.impl.AttachementImpl#getIcomponentelement <em>Icomponentelement</em>}</li>
 *   <li>{@link ccsM2.impl.AttachementImpl#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttachementImpl extends MinimalEObjectImpl.Container implements Attachement {
	/**
	 * The cached value of the '{@link #getIcomponentelement() <em>Icomponentelement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcomponentelement()
	 * @generated
	 * @ordered
	 */
	protected IComponentElement icomponentelement;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected Role role;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttachementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.ATTACHEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IComponentElement getIcomponentelement() {
		if (icomponentelement != null && icomponentelement.eIsProxy()) {
			InternalEObject oldIcomponentelement = (InternalEObject) icomponentelement;
			icomponentelement = (IComponentElement) eResolveProxy(oldIcomponentelement);
			if (icomponentelement != oldIcomponentelement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CCSPackage.ATTACHEMENT__ICOMPONENTELEMENT,
							oldIcomponentelement, icomponentelement));
			}
		}
		return icomponentelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IComponentElement basicGetIcomponentelement() {
		return icomponentelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIcomponentelement(IComponentElement newIcomponentelement) {
		IComponentElement oldIcomponentelement = icomponentelement;
		icomponentelement = newIcomponentelement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.ATTACHEMENT__ICOMPONENTELEMENT,
					oldIcomponentelement, icomponentelement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRole() {
		if (role != null && role.eIsProxy()) {
			InternalEObject oldRole = (InternalEObject) role;
			role = (Role) eResolveProxy(oldRole);
			if (role != oldRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CCSPackage.ATTACHEMENT__ROLE, oldRole,
							role));
			}
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(Role newRole) {
		Role oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.ATTACHEMENT__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CCSPackage.ATTACHEMENT__ICOMPONENTELEMENT:
			if (resolve)
				return getIcomponentelement();
			return basicGetIcomponentelement();
		case CCSPackage.ATTACHEMENT__ROLE:
			if (resolve)
				return getRole();
			return basicGetRole();
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
		case CCSPackage.ATTACHEMENT__ICOMPONENTELEMENT:
			setIcomponentelement((IComponentElement) newValue);
			return;
		case CCSPackage.ATTACHEMENT__ROLE:
			setRole((Role) newValue);
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
		case CCSPackage.ATTACHEMENT__ICOMPONENTELEMENT:
			setIcomponentelement((IComponentElement) null);
			return;
		case CCSPackage.ATTACHEMENT__ROLE:
			setRole((Role) null);
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
		case CCSPackage.ATTACHEMENT__ICOMPONENTELEMENT:
			return icomponentelement != null;
		case CCSPackage.ATTACHEMENT__ROLE:
			return role != null;
		}
		return super.eIsSet(featureID);
	}

} //AttachementImpl
