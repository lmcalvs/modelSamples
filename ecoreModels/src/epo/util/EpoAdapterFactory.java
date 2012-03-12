/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package epo.util;

import epo.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see epo.EpoPackage
 * @generated
 */
public class EpoAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EpoPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpoAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EpoPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EpoSwitch<Adapter> modelSwitch =
		new EpoSwitch<Adapter>() {
			@Override
			public Adapter caseItem(Item object) {
				return createItemAdapter();
			}
			@Override
			public Adapter caseUSAddress(USAddress object) {
				return createUSAddressAdapter();
			}
			@Override
			public Adapter casePurchaseOrder(PurchaseOrder object) {
				return createPurchaseOrderAdapter();
			}
			@Override
			public Adapter caseAddress(Address object) {
				return createAddressAdapter();
			}
			@Override
			public Adapter caseSupplier(Supplier object) {
				return createSupplierAdapter();
			}
			@Override
			public Adapter caseCustomer(Customer object) {
				return createCustomerAdapter();
			}
			@Override
			public Adapter caseGlobalAddress(GlobalAddress object) {
				return createGlobalAddressAdapter();
			}
			@Override
			public Adapter caseGlobalLocation(GlobalLocation object) {
				return createGlobalLocationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link epo.PurchaseOrder <em>Purchase Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see epo.PurchaseOrder
	 * @generated
	 */
	public Adapter createPurchaseOrderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link epo.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see epo.Address
	 * @generated
	 */
	public Adapter createAddressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link epo.USAddress <em>US Address</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see epo.USAddress
	 * @generated
	 */
	public Adapter createUSAddressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link epo.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see epo.Item
	 * @generated
	 */
	public Adapter createItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link epo.Supplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see epo.Supplier
	 * @generated
	 */
	public Adapter createSupplierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link epo.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see epo.Customer
	 * @generated
	 */
	public Adapter createCustomerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link epo.GlobalAddress <em>Global Address</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see epo.GlobalAddress
	 * @generated
	 */
	public Adapter createGlobalAddressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link epo.GlobalLocation <em>Global Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see epo.GlobalLocation
	 * @generated
	 */
	public Adapter createGlobalLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EpoAdapterFactory
