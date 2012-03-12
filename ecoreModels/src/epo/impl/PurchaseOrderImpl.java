/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package epo.impl;

import epo.Address;
import epo.Customer;
import epo.EpoPackage;
import epo.Item;
import epo.OrderStatus;
import epo.PurchaseOrder;
import epo.USAddress;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Purchase Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link epo.impl.PurchaseOrderImpl#getItems <em>Items</em>}</li>
 *   <li>{@link epo.impl.PurchaseOrderImpl#getBillTo <em>Bill To</em>}</li>
 *   <li>{@link epo.impl.PurchaseOrderImpl#getShipTo <em>Ship To</em>}</li>
 *   <li>{@link epo.impl.PurchaseOrderImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link epo.impl.PurchaseOrderImpl#getOrderDate <em>Order Date</em>}</li>
 *   <li>{@link epo.impl.PurchaseOrderImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link epo.impl.PurchaseOrderImpl#getTotalAmount <em>Total Amount</em>}</li>
 *   <li>{@link epo.impl.PurchaseOrderImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link epo.impl.PurchaseOrderImpl#getPreviousOrder <em>Previous Order</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PurchaseOrderImpl extends EObjectImpl implements PurchaseOrder {
	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> items;

	/**
	 * The cached value of the '{@link #getBillTo() <em>Bill To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillTo()
	 * @generated
	 * @ordered
	 */
	protected Address billTo;

	/**
	 * The cached value of the '{@link #getShipTo() <em>Ship To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipTo()
	 * @generated
	 * @ordered
	 */
	protected Address shipTo;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrderDate() <em>Order Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ORDER_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderDate() <em>Order Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderDate()
	 * @generated
	 * @ordered
	 */
	protected Date orderDate = ORDER_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final OrderStatus STATUS_EDEFAULT = OrderStatus.PENDING;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected OrderStatus status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalAmount() <em>Total Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalAmount()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_AMOUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected Customer customer;

	/**
	 * The cached value of the '{@link #getPreviousOrder() <em>Previous Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousOrder()
	 * @generated
	 * @ordered
	 */
	protected PurchaseOrder previousOrder;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PurchaseOrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EpoPackage.Literals.PURCHASE_ORDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EpoPackage.PURCHASE_ORDER__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getOrderDate() {
		return orderDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderDate(Date newOrderDate) {
		Date oldOrderDate = orderDate;
		orderDate = newOrderDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EpoPackage.PURCHASE_ORDER__ORDER_DATE, oldOrderDate, orderDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(OrderStatus newStatus) {
		OrderStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EpoPackage.PURCHASE_ORDER__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotalAmount() {
		// TODO: implement this method to return the 'Total Amount' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomer(Customer newCustomer, NotificationChain msgs) {
		Customer oldCustomer = customer;
		customer = newCustomer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EpoPackage.PURCHASE_ORDER__CUSTOMER, oldCustomer, newCustomer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomer(Customer newCustomer) {
		if (newCustomer != customer) {
			NotificationChain msgs = null;
			if (customer != null)
				msgs = ((InternalEObject)customer).eInverseRemove(this, EpoPackage.CUSTOMER__ORDERS, Customer.class, msgs);
			if (newCustomer != null)
				msgs = ((InternalEObject)newCustomer).eInverseAdd(this, EpoPackage.CUSTOMER__ORDERS, Customer.class, msgs);
			msgs = basicSetCustomer(newCustomer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EpoPackage.PURCHASE_ORDER__CUSTOMER, newCustomer, newCustomer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PurchaseOrder getPreviousOrder() {
		return previousOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviousOrder(PurchaseOrder newPreviousOrder) {
		PurchaseOrder oldPreviousOrder = previousOrder;
		previousOrder = newPreviousOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EpoPackage.PURCHASE_ORDER__PREVIOUS_ORDER, oldPreviousOrder, previousOrder));
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
			case EpoPackage.PURCHASE_ORDER__ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getItems()).basicAdd(otherEnd, msgs);
			case EpoPackage.PURCHASE_ORDER__CUSTOMER:
				if (customer != null)
					msgs = ((InternalEObject)customer).eInverseRemove(this, EpoPackage.CUSTOMER__ORDERS, Customer.class, msgs);
				return basicSetCustomer((Customer)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address getShipTo() {
		return shipTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShipTo(Address newShipTo, NotificationChain msgs) {
		Address oldShipTo = shipTo;
		shipTo = newShipTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EpoPackage.PURCHASE_ORDER__SHIP_TO, oldShipTo, newShipTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShipTo(Address newShipTo) {
		if (newShipTo != shipTo) {
			NotificationChain msgs = null;
			if (shipTo != null)
				msgs = ((InternalEObject)shipTo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EpoPackage.PURCHASE_ORDER__SHIP_TO, null, msgs);
			if (newShipTo != null)
				msgs = ((InternalEObject)newShipTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EpoPackage.PURCHASE_ORDER__SHIP_TO, null, msgs);
			msgs = basicSetShipTo(newShipTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EpoPackage.PURCHASE_ORDER__SHIP_TO, newShipTo, newShipTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address getBillTo() {
		return billTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBillTo(Address newBillTo, NotificationChain msgs) {
		Address oldBillTo = billTo;
		billTo = newBillTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EpoPackage.PURCHASE_ORDER__BILL_TO, oldBillTo, newBillTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBillTo(Address newBillTo) {
		if (newBillTo != billTo) {
			NotificationChain msgs = null;
			if (billTo != null)
				msgs = ((InternalEObject)billTo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EpoPackage.PURCHASE_ORDER__BILL_TO, null, msgs);
			if (newBillTo != null)
				msgs = ((InternalEObject)newBillTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EpoPackage.PURCHASE_ORDER__BILL_TO, null, msgs);
			msgs = basicSetBillTo(newBillTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EpoPackage.PURCHASE_ORDER__BILL_TO, newBillTo, newBillTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getItems() {
		if (items == null) {
			items = new EObjectContainmentWithInverseEList<Item>(Item.class, this, EpoPackage.PURCHASE_ORDER__ITEMS, EpoPackage.ITEM__ORDER);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EpoPackage.PURCHASE_ORDER__ITEMS:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
			case EpoPackage.PURCHASE_ORDER__BILL_TO:
				return basicSetBillTo(null, msgs);
			case EpoPackage.PURCHASE_ORDER__SHIP_TO:
				return basicSetShipTo(null, msgs);
			case EpoPackage.PURCHASE_ORDER__CUSTOMER:
				return basicSetCustomer(null, msgs);
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
			case EpoPackage.PURCHASE_ORDER__ITEMS:
				return getItems();
			case EpoPackage.PURCHASE_ORDER__BILL_TO:
				return getBillTo();
			case EpoPackage.PURCHASE_ORDER__SHIP_TO:
				return getShipTo();
			case EpoPackage.PURCHASE_ORDER__COMMENT:
				return getComment();
			case EpoPackage.PURCHASE_ORDER__ORDER_DATE:
				return getOrderDate();
			case EpoPackage.PURCHASE_ORDER__STATUS:
				return getStatus();
			case EpoPackage.PURCHASE_ORDER__TOTAL_AMOUNT:
				return getTotalAmount();
			case EpoPackage.PURCHASE_ORDER__CUSTOMER:
				return getCustomer();
			case EpoPackage.PURCHASE_ORDER__PREVIOUS_ORDER:
				return getPreviousOrder();
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
			case EpoPackage.PURCHASE_ORDER__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends Item>)newValue);
				return;
			case EpoPackage.PURCHASE_ORDER__BILL_TO:
				setBillTo((Address)newValue);
				return;
			case EpoPackage.PURCHASE_ORDER__SHIP_TO:
				setShipTo((Address)newValue);
				return;
			case EpoPackage.PURCHASE_ORDER__COMMENT:
				setComment((String)newValue);
				return;
			case EpoPackage.PURCHASE_ORDER__ORDER_DATE:
				setOrderDate((Date)newValue);
				return;
			case EpoPackage.PURCHASE_ORDER__STATUS:
				setStatus((OrderStatus)newValue);
				return;
			case EpoPackage.PURCHASE_ORDER__CUSTOMER:
				setCustomer((Customer)newValue);
				return;
			case EpoPackage.PURCHASE_ORDER__PREVIOUS_ORDER:
				setPreviousOrder((PurchaseOrder)newValue);
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
			case EpoPackage.PURCHASE_ORDER__ITEMS:
				getItems().clear();
				return;
			case EpoPackage.PURCHASE_ORDER__BILL_TO:
				setBillTo((Address)null);
				return;
			case EpoPackage.PURCHASE_ORDER__SHIP_TO:
				setShipTo((Address)null);
				return;
			case EpoPackage.PURCHASE_ORDER__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case EpoPackage.PURCHASE_ORDER__ORDER_DATE:
				setOrderDate(ORDER_DATE_EDEFAULT);
				return;
			case EpoPackage.PURCHASE_ORDER__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case EpoPackage.PURCHASE_ORDER__CUSTOMER:
				setCustomer((Customer)null);
				return;
			case EpoPackage.PURCHASE_ORDER__PREVIOUS_ORDER:
				setPreviousOrder((PurchaseOrder)null);
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
			case EpoPackage.PURCHASE_ORDER__ITEMS:
				return items != null && !items.isEmpty();
			case EpoPackage.PURCHASE_ORDER__BILL_TO:
				return billTo != null;
			case EpoPackage.PURCHASE_ORDER__SHIP_TO:
				return shipTo != null;
			case EpoPackage.PURCHASE_ORDER__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case EpoPackage.PURCHASE_ORDER__ORDER_DATE:
				return ORDER_DATE_EDEFAULT == null ? orderDate != null : !ORDER_DATE_EDEFAULT.equals(orderDate);
			case EpoPackage.PURCHASE_ORDER__STATUS:
				return status != STATUS_EDEFAULT;
			case EpoPackage.PURCHASE_ORDER__TOTAL_AMOUNT:
				return getTotalAmount() != TOTAL_AMOUNT_EDEFAULT;
			case EpoPackage.PURCHASE_ORDER__CUSTOMER:
				return customer != null;
			case EpoPackage.PURCHASE_ORDER__PREVIOUS_ORDER:
				return previousOrder != null;
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
		result.append(" (comment: ");
		result.append(comment);
		result.append(", orderDate: ");
		result.append(orderDate);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //PurchaseOrderImpl
