/**
 */
package de.tu_bs.cs.isf.mbse.website;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Board</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.website.Board#getSquares <em>Squares</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.website.Board#getWidgets <em>Widgets</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.mbse.website.WebsitePackage#getBoard()
 * @model
 * @generated
 */
public interface Board extends EObject {
	/**
	 * Returns the value of the '<em><b>Squares</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.mbse.website.Square}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Squares</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Squares</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.mbse.website.WebsitePackage#getBoard_Squares()
	 * @model containment="true" lower="64" upper="64"
	 * @generated
	 */
	EList<Square> getSquares();

	/**
	 * Returns the value of the '<em><b>Widgets</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.mbse.website.Widget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widgets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Widgets</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.mbse.website.WebsitePackage#getBoard_Widgets()
	 * @model containment="true" upper="64"
	 * @generated
	 */
	EList<Widget> getWidgets();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Square getSquare(Ranks rank, Files file);

} // Board
