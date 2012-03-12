/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package epo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supplier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link epo.Supplier#getName <em>Name</em>}</li>
 *   <li>{@link epo.Supplier#getCustomers <em>Customers</em>}</li>
 *   <li>{@link epo.Supplier#getOrders <em>Orders</em>}</li>
 *   <li>{@link epo.Supplier#getPendingOrders <em>Pending Orders</em>}</li>
 *   <li>{@link epo.Supplier#getShippedOrders <em>Shipped Orders</em>}</li>
 * </ul>
 * </p>
 *
 * @see epo.EpoPackage#getSupplier()
 * @model
 * @generated
 */
public interface Supplier extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see epo.EpoPackage#getSupplier_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link epo.Supplier#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Customers</b></em>' containment reference list.
	 * The list contents are of type {@link epo.Customer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customers</em>' containment reference list.
	 * @see epo.EpoPackage#getSupplier_Customers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Customer> getCustomers();

	/**
	 * Returns the value of the '<em><b>Orders</b></em>' containment reference list.
	 * The list contents are of type {@link epo.PurchaseOrder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orders</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orders</em>' containment reference list.
	 * @see epo.EpoPackage#getSupplier_Orders()
	 * @model containment="true"
	 * @generated
	 */
	EList<PurchaseOrder> getOrders();

	/**
	 * Returns the value of the '<em><b>Pending Orders</b></em>' reference list.
	 * The list contents are of type {@link epo.PurchaseOrder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pending Orders</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pending Orders</em>' reference list.
	 * @see epo.EpoPackage#getSupplier_PendingOrders()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<PurchaseOrder> getPendingOrders();

	/**
	 * Returns the value of the '<em><b>Shipped Orders</b></em>' reference list.
	 * The list contents are of type {@link epo.PurchaseOrder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipped Orders</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipped Orders</em>' reference list.
	 * @see epo.EpoPackage#getSupplier_ShippedOrders()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<PurchaseOrder> getShippedOrders();

} // Supplier
