/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package epo;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Purchase Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link epo.PurchaseOrder#getItems <em>Items</em>}</li>
 *   <li>{@link epo.PurchaseOrder#getBillTo <em>Bill To</em>}</li>
 *   <li>{@link epo.PurchaseOrder#getShipTo <em>Ship To</em>}</li>
 *   <li>{@link epo.PurchaseOrder#getComment <em>Comment</em>}</li>
 *   <li>{@link epo.PurchaseOrder#getOrderDate <em>Order Date</em>}</li>
 *   <li>{@link epo.PurchaseOrder#getStatus <em>Status</em>}</li>
 *   <li>{@link epo.PurchaseOrder#getTotalAmount <em>Total Amount</em>}</li>
 *   <li>{@link epo.PurchaseOrder#getCustomer <em>Customer</em>}</li>
 *   <li>{@link epo.PurchaseOrder#getPreviousOrder <em>Previous Order</em>}</li>
 * </ul>
 * </p>
 *
 * @see epo.EpoPackage#getPurchaseOrder()
 * @model
 * @generated
 */
public interface PurchaseOrder extends EObject {
	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see epo.EpoPackage#getPurchaseOrder_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link epo.PurchaseOrder#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Order Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Date</em>' attribute.
	 * @see #setOrderDate(Date)
	 * @see epo.EpoPackage#getPurchaseOrder_OrderDate()
	 * @model dataType="epo.Date"
	 * @generated
	 */
	Date getOrderDate();

	/**
	 * Sets the value of the '{@link epo.PurchaseOrder#getOrderDate <em>Order Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Date</em>' attribute.
	 * @see #getOrderDate()
	 * @generated
	 */
	void setOrderDate(Date value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link epo.OrderStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see epo.OrderStatus
	 * @see #setStatus(OrderStatus)
	 * @see epo.EpoPackage#getPurchaseOrder_Status()
	 * @model
	 * @generated
	 */
	OrderStatus getStatus();

	/**
	 * Sets the value of the '{@link epo.PurchaseOrder#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see epo.OrderStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(OrderStatus value);

	/**
	 * Returns the value of the '<em><b>Total Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Amount</em>' attribute.
	 * @see epo.EpoPackage#getPurchaseOrder_TotalAmount()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getTotalAmount();

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link epo.Customer#getOrders <em>Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' reference.
	 * @see #setCustomer(Customer)
	 * @see epo.EpoPackage#getPurchaseOrder_Customer()
	 * @see epo.Customer#getOrders
	 * @model opposite="orders" resolveProxies="false" required="true"
	 * @generated
	 */
	Customer getCustomer();

	/**
	 * Sets the value of the '{@link epo.PurchaseOrder#getCustomer <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' reference.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(Customer value);

	/**
	 * Returns the value of the '<em><b>Previous Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Order</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Order</em>' reference.
	 * @see #setPreviousOrder(PurchaseOrder)
	 * @see epo.EpoPackage#getPurchaseOrder_PreviousOrder()
	 * @model resolveProxies="false"
	 * @generated
	 */
	PurchaseOrder getPreviousOrder();

	/**
	 * Sets the value of the '{@link epo.PurchaseOrder#getPreviousOrder <em>Previous Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Order</em>' reference.
	 * @see #getPreviousOrder()
	 * @generated
	 */
	void setPreviousOrder(PurchaseOrder value);

	/**
	 * Returns the value of the '<em><b>Ship To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ship To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ship To</em>' containment reference.
	 * @see #setShipTo(Address)
	 * @see epo.EpoPackage#getPurchaseOrder_ShipTo()
	 * @model containment="true"
	 * @generated
	 */
	Address getShipTo();

	/**
	 * Sets the value of the '{@link epo.PurchaseOrder#getShipTo <em>Ship To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ship To</em>' containment reference.
	 * @see #getShipTo()
	 * @generated
	 */
	void setShipTo(Address value);

	/**
	 * Returns the value of the '<em><b>Bill To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bill To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bill To</em>' containment reference.
	 * @see #setBillTo(Address)
	 * @see epo.EpoPackage#getPurchaseOrder_BillTo()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Address getBillTo();

	/**
	 * Sets the value of the '{@link epo.PurchaseOrder#getBillTo <em>Bill To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bill To</em>' containment reference.
	 * @see #getBillTo()
	 * @generated
	 */
	void setBillTo(Address value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link epo.Item}.
	 * It is bidirectional and its opposite is '{@link epo.Item#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see epo.EpoPackage#getPurchaseOrder_Items()
	 * @see epo.Item#getOrder
	 * @model opposite="order" containment="true"
	 * @generated
	 */
	EList<Item> getItems();

} // PurchaseOrder
