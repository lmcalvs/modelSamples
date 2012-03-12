/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package epo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link epo.GlobalAddress#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see epo.EpoPackage#getGlobalAddress()
 * @model
 * @generated
 */
public interface GlobalAddress extends Address, GlobalLocation {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute list.
	 * @see epo.EpoPackage#getGlobalAddress_Location()
	 * @model
	 * @generated
	 */
	EList<String> getLocation();

} // GlobalAddress
