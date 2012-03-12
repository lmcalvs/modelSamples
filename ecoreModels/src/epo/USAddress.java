/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package epo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>US Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link epo.USAddress#getStreet <em>Street</em>}</li>
 *   <li>{@link epo.USAddress#getCity <em>City</em>}</li>
 *   <li>{@link epo.USAddress#getState <em>State</em>}</li>
 *   <li>{@link epo.USAddress#getZip <em>Zip</em>}</li>
 * </ul>
 * </p>
 *
 * @see epo.EpoPackage#getUSAddress()
 * @model
 * @generated
 */
public interface USAddress extends Address {
	/**
	 * Returns the value of the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Street</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Street</em>' attribute.
	 * @see #setStreet(String)
	 * @see epo.EpoPackage#getUSAddress_Street()
	 * @model
	 * @generated
	 */
	String getStreet();

	/**
	 * Sets the value of the '{@link epo.USAddress#getStreet <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street</em>' attribute.
	 * @see #getStreet()
	 * @generated
	 */
	void setStreet(String value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see epo.EpoPackage#getUSAddress_City()
	 * @model
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link epo.USAddress#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see epo.EpoPackage#getUSAddress_State()
	 * @model
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link epo.USAddress#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

	/**
	 * Returns the value of the '<em><b>Zip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zip</em>' attribute.
	 * @see #setZip(int)
	 * @see epo.EpoPackage#getUSAddress_Zip()
	 * @model
	 * @generated
	 */
	int getZip();

	/**
	 * Sets the value of the '{@link epo.USAddress#getZip <em>Zip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zip</em>' attribute.
	 * @see #getZip()
	 * @generated
	 */
	void setZip(int value);

} // USAddress
