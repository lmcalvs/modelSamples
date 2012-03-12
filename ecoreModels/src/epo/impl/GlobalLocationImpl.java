/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package epo.impl;

import epo.EpoPackage;
import epo.GlobalLocation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link epo.impl.GlobalLocationImpl#getCountryCode <em>Country Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlobalLocationImpl extends EObjectImpl implements GlobalLocation {
	/**
	 * The default value of the '{@link #getCountryCode() <em>Country Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryCode()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNTRY_CODE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCountryCode() <em>Country Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryCode()
	 * @generated
	 * @ordered
	 */
	protected int countryCode = COUNTRY_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EpoPackage.Literals.GLOBAL_LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCountryCode() {
		return countryCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountryCode(int newCountryCode) {
		int oldCountryCode = countryCode;
		countryCode = newCountryCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EpoPackage.GLOBAL_LOCATION__COUNTRY_CODE, oldCountryCode, countryCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EpoPackage.GLOBAL_LOCATION__COUNTRY_CODE:
				return getCountryCode();
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
			case EpoPackage.GLOBAL_LOCATION__COUNTRY_CODE:
				setCountryCode((Integer)newValue);
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
			case EpoPackage.GLOBAL_LOCATION__COUNTRY_CODE:
				setCountryCode(COUNTRY_CODE_EDEFAULT);
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
			case EpoPackage.GLOBAL_LOCATION__COUNTRY_CODE:
				return countryCode != COUNTRY_CODE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (countryCode: ");
		result.append(countryCode);
		result.append(')');
		return result.toString();
	}

} //GlobalLocationImpl
