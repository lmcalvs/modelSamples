/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package epo.impl;

import epo.EpoPackage;
import epo.PurchaseOrder;
import epo.Supplier;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supplier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link epo.impl.SupplierImpl#getName <em>Name</em>}</li>
 *   <li>{@link epo.impl.SupplierImpl#getOrders <em>Orders</em>}</li>
 *   <li>{@link epo.impl.SupplierImpl#getPriorityOrders <em>Priority Orders</em>}</li>
 *   <li>{@link epo.impl.SupplierImpl#getStandardOrders <em>Standard Orders</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SupplierImpl extends EObjectImpl implements Supplier {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrders() <em>Orders</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrders()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap orders;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupplierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EpoPackage.Literals.SUPPLIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EpoPackage.SUPPLIER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getOrders() {
		if (orders == null) {
			orders = new BasicFeatureMap(this, EpoPackage.SUPPLIER__ORDERS);
		}
		return orders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PurchaseOrder> getPriorityOrders() {
		return getOrders().list(EpoPackage.Literals.SUPPLIER__PRIORITY_ORDERS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PurchaseOrder> getStandardOrders() {
		return getOrders().list(EpoPackage.Literals.SUPPLIER__STANDARD_ORDERS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EpoPackage.SUPPLIER__ORDERS:
				return ((InternalEList<?>)getOrders()).basicRemove(otherEnd, msgs);
			case EpoPackage.SUPPLIER__PRIORITY_ORDERS:
				return ((InternalEList<?>)getPriorityOrders()).basicRemove(otherEnd, msgs);
			case EpoPackage.SUPPLIER__STANDARD_ORDERS:
				return ((InternalEList<?>)getStandardOrders()).basicRemove(otherEnd, msgs);
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
			case EpoPackage.SUPPLIER__NAME:
				return getName();
			case EpoPackage.SUPPLIER__ORDERS:
				if (coreType) return getOrders();
				return ((FeatureMap.Internal)getOrders()).getWrapper();
			case EpoPackage.SUPPLIER__PRIORITY_ORDERS:
				return getPriorityOrders();
			case EpoPackage.SUPPLIER__STANDARD_ORDERS:
				return getStandardOrders();
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
			case EpoPackage.SUPPLIER__NAME:
				setName((String)newValue);
				return;
			case EpoPackage.SUPPLIER__ORDERS:
				((FeatureMap.Internal)getOrders()).set(newValue);
				return;
			case EpoPackage.SUPPLIER__PRIORITY_ORDERS:
				getPriorityOrders().clear();
				getPriorityOrders().addAll((Collection<? extends PurchaseOrder>)newValue);
				return;
			case EpoPackage.SUPPLIER__STANDARD_ORDERS:
				getStandardOrders().clear();
				getStandardOrders().addAll((Collection<? extends PurchaseOrder>)newValue);
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
			case EpoPackage.SUPPLIER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EpoPackage.SUPPLIER__ORDERS:
				getOrders().clear();
				return;
			case EpoPackage.SUPPLIER__PRIORITY_ORDERS:
				getPriorityOrders().clear();
				return;
			case EpoPackage.SUPPLIER__STANDARD_ORDERS:
				getStandardOrders().clear();
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
			case EpoPackage.SUPPLIER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EpoPackage.SUPPLIER__ORDERS:
				return orders != null && !orders.isEmpty();
			case EpoPackage.SUPPLIER__PRIORITY_ORDERS:
				return !getPriorityOrders().isEmpty();
			case EpoPackage.SUPPLIER__STANDARD_ORDERS:
				return !getStandardOrders().isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", orders: ");
		result.append(orders);
		result.append(')');
		return result.toString();
	}

} //SupplierImpl
