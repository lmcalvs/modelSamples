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
 *   <li>{@link epo.Supplier#getOrders <em>Orders</em>}</li>
 *   <li>{@link epo.Supplier#getPriorityOrders <em>Priority Orders</em>}</li>
 *   <li>{@link epo.Supplier#getStandardOrders <em>Standard Orders</em>}</li>
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
	 * Returns the value of the '<em><b>Orders</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orders</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orders</em>' attribute list.
	 * @see epo.EpoPackage#getSupplier_Orders()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group'"
	 * @generated
	 */
	FeatureMap getOrders();

	/**
	 * Returns the value of the '<em><b>Priority Orders</b></em>' containment reference list.
	 * The list contents are of type {@link epo.PurchaseOrder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority Orders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority Orders</em>' containment reference list.
	 * @see epo.EpoPackage#getSupplier_PriorityOrders()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#orders'"
	 * @generated
	 */
	EList<PurchaseOrder> getPriorityOrders();

	/**
	 * Returns the value of the '<em><b>Standard Orders</b></em>' containment reference list.
	 * The list contents are of type {@link epo.PurchaseOrder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standard Orders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Orders</em>' containment reference list.
	 * @see epo.EpoPackage#getSupplier_StandardOrders()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#orders'"
	 * @generated
	 */
	EList<PurchaseOrder> getStandardOrders();

} // Supplier
