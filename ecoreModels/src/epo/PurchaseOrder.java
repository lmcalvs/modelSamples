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
 *   <li>{@link epo.PurchaseOrder#getComment <em>Comment</em>}</li>
 *   <li>{@link epo.PurchaseOrder#getOrderDate <em>Order Date</em>}</li>
 *   <li>{@link epo.PurchaseOrder#getShipTo <em>Ship To</em>}</li>
 *   <li>{@link epo.PurchaseOrder#getBillTo <em>Bill To</em>}</li>
 *   <li>{@link epo.PurchaseOrder#getItems <em>Items</em>}</li>
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
	 * Returns the value of the '<em><b>Ship To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ship To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ship To</em>' containment reference.
	 * @see #setShipTo(USAddress)
	 * @see epo.EpoPackage#getPurchaseOrder_ShipTo()
	 * @model containment="true" required="true"
	 * @generated
	 */
	USAddress getShipTo();

	/**
	 * Sets the value of the '{@link epo.PurchaseOrder#getShipTo <em>Ship To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ship To</em>' containment reference.
	 * @see #getShipTo()
	 * @generated
	 */
	void setShipTo(USAddress value);

	/**
	 * Returns the value of the '<em><b>Bill To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bill To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bill To</em>' containment reference.
	 * @see #setBillTo(USAddress)
	 * @see epo.EpoPackage#getPurchaseOrder_BillTo()
	 * @model containment="true" required="true"
	 * @generated
	 */
	USAddress getBillTo();

	/**
	 * Sets the value of the '{@link epo.PurchaseOrder#getBillTo <em>Bill To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bill To</em>' containment reference.
	 * @see #getBillTo()
	 * @generated
	 */
	void setBillTo(USAddress value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link epo.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see epo.EpoPackage#getPurchaseOrder_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getItems();

} // PurchaseOrder
