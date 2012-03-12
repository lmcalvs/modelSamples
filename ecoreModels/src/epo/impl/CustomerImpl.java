/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package epo.impl;

import epo.Customer;
import epo.EpoPackage;
import epo.PurchaseOrder;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link epo.impl.CustomerImpl#getCustomerID <em>Customer ID</em>}</li>
 *   <li>{@link epo.impl.CustomerImpl#getOrders <em>Orders</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomerImpl extends EObjectImpl implements Customer {
	/**
	 * The default value of the '{@link #getCustomerID() <em>Customer ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerID()
	 * @generated
	 * @ordered
	 */
	protected static final int CUSTOMER_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCustomerID() <em>Customer ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerID()
	 * @generated
	 * @ordered
	 */
	protected int customerID = CUSTOMER_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrders() <em>Orders</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrders()
	 * @generated
	 * @ordered
	 */
	protected EList<PurchaseOrder> orders;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EpoPackage.Literals.CUSTOMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCustomerID() {
		return customerID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerID(int newCustomerID) {
		int oldCustomerID = customerID;
		customerID = newCustomerID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EpoPackage.CUSTOMER__CUSTOMER_ID, oldCustomerID, customerID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PurchaseOrder> getOrders() {
		if (orders == null) {
			orders = new EObjectWithInverseEList<PurchaseOrder>(PurchaseOrder.class, this, EpoPackage.CUSTOMER__ORDERS, EpoPackage.PURCHASE_ORDER__CUSTOMER);
		}
		return orders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EpoPackage.CUSTOMER__ORDERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOrders()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EpoPackage.CUSTOMER__ORDERS:
				return ((InternalEList<?>)getOrders()).basicRemove(otherEnd, msgs);
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
			case EpoPackage.CUSTOMER__CUSTOMER_ID:
				return getCustomerID();
			case EpoPackage.CUSTOMER__ORDERS:
				return getOrders();
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
			case EpoPackage.CUSTOMER__CUSTOMER_ID:
				setCustomerID((Integer)newValue);
				return;
			case EpoPackage.CUSTOMER__ORDERS:
				getOrders().clear();
				getOrders().addAll((Collection<? extends PurchaseOrder>)newValue);
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
			case EpoPackage.CUSTOMER__CUSTOMER_ID:
				setCustomerID(CUSTOMER_ID_EDEFAULT);
				return;
			case EpoPackage.CUSTOMER__ORDERS:
				getOrders().clear();
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
			case EpoPackage.CUSTOMER__CUSTOMER_ID:
				return customerID != CUSTOMER_ID_EDEFAULT;
			case EpoPackage.CUSTOMER__ORDERS:
				return orders != null && !orders.isEmpty();
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
		result.append(" (customerID: ");
		result.append(customerID);
		result.append(')');
		return result.toString();
	}

} //CustomerImpl
