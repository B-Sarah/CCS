/**
 */
package ccsM2.impl;

import ccsM2.CCSPackage;
import ccsM2.InterfaceElement;
import ccsM2.Mode;
import ccsM2.Visibility;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsM2.impl.InterfaceElementImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link ccsM2.impl.InterfaceElementImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link ccsM2.impl.InterfaceElementImpl#getContainedValue <em>Contained Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceElementImpl extends MinimalEObjectImpl.Container implements InterfaceElement {
	
	protected String name = "";
	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final Mode MODE_EDEFAULT = Mode.REQUIRED;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected Mode mode = MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final Visibility VISIBILITY_EDEFAULT = Visibility.PRIVATE;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected Visibility visibility = VISIBILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainedValue() <em>Contained Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedValue()
	 * @generated
	 * @ordered
	 */
	protected Object containedValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.INTERFACE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(Mode newMode) {
		Mode oldMode = mode;
		mode = newMode == null ? MODE_EDEFAULT : newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.INTERFACE_ELEMENT__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibility getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(Visibility newVisibility) {
		Visibility oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.INTERFACE_ELEMENT__VISIBILITY,
					oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getContainedValue() {
		return containedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainedValue(Object newContainedValue) {
		Object oldContainedValue = containedValue;
		containedValue = newContainedValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.INTERFACE_ELEMENT__CONTAINED_VALUE,
					oldContainedValue, containedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void SetMode(Mode mode) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void SetVisibility(Visibility visibility) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CCSPackage.INTERFACE_ELEMENT__MODE:
			return getMode();
		case CCSPackage.INTERFACE_ELEMENT__VISIBILITY:
			return getVisibility();
		case CCSPackage.INTERFACE_ELEMENT__CONTAINED_VALUE:
			return getContainedValue();
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
		case CCSPackage.INTERFACE_ELEMENT__MODE:
			setMode((Mode) newValue);
			return;
		case CCSPackage.INTERFACE_ELEMENT__VISIBILITY:
			setVisibility((Visibility) newValue);
			return;
		case CCSPackage.INTERFACE_ELEMENT__CONTAINED_VALUE:
			setContainedValue(newValue);
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
		case CCSPackage.INTERFACE_ELEMENT__MODE:
			setMode(MODE_EDEFAULT);
			return;
		case CCSPackage.INTERFACE_ELEMENT__VISIBILITY:
			setVisibility(VISIBILITY_EDEFAULT);
			return;
		case CCSPackage.INTERFACE_ELEMENT__CONTAINED_VALUE:
			setContainedValue((Object) null);
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
		case CCSPackage.INTERFACE_ELEMENT__MODE:
			return mode != MODE_EDEFAULT;
		case CCSPackage.INTERFACE_ELEMENT__VISIBILITY:
			return visibility != VISIBILITY_EDEFAULT;
		case CCSPackage.INTERFACE_ELEMENT__CONTAINED_VALUE:
			return containedValue != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case CCSPackage.INTERFACE_ELEMENT___SET_MODE__MODE:
			SetMode((Mode) arguments.get(0));
			return null;
		case CCSPackage.INTERFACE_ELEMENT___SET_VISIBILITY__VISIBILITY:
			SetVisibility((Visibility) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mode: ");
		result.append(mode);
		result.append(", visibility: ");
		result.append(visibility);
		result.append(", containedValue: ");
		result.append(containedValue);
		result.append(')');
		return result.toString();
	}
	
	public String GetName() {
		return this.name;
	}
	
	public void SetName(String name) {
		this.name = name;
	}

} //InterfaceElementImpl
