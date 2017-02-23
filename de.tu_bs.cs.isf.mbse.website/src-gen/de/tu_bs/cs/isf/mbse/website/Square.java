/**
 */
package de.tu_bs.cs.isf.mbse.website;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Square</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.website.Square#getIndex <em>Index</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.website.Square#getFile <em>File</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.website.Square#getRank <em>Rank</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.website.Square#getColor <em>Color</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.website.Square#getWidget <em>Widget</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.mbse.website.WebsitePackage#getSquare()
 * @model
 * @generated
 */
public interface Square extends EObject {
	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(int)
	 * @see de.tu_bs.cs.isf.mbse.website.WebsitePackage#getSquare_Index()
	 * @model
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.website.Square#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(int value);

	/**
	 * Returns the value of the '<em><b>File</b></em>' attribute.
	 * The literals are from the enumeration {@link de.tu_bs.cs.isf.mbse.website.Files}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' attribute.
	 * @see de.tu_bs.cs.isf.mbse.website.Files
	 * @see #setFile(Files)
	 * @see de.tu_bs.cs.isf.mbse.website.WebsitePackage#getSquare_File()
	 * @model
	 * @generated
	 */
	Files getFile();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.website.Square#getFile <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' attribute.
	 * @see de.tu_bs.cs.isf.mbse.website.Files
	 * @see #getFile()
	 * @generated
	 */
	void setFile(Files value);

	/**
	 * Returns the value of the '<em><b>Rank</b></em>' attribute.
	 * The literals are from the enumeration {@link de.tu_bs.cs.isf.mbse.website.Ranks}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rank</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rank</em>' attribute.
	 * @see de.tu_bs.cs.isf.mbse.website.Ranks
	 * @see #setRank(Ranks)
	 * @see de.tu_bs.cs.isf.mbse.website.WebsitePackage#getSquare_Rank()
	 * @model
	 * @generated
	 */
	Ranks getRank();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.website.Square#getRank <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rank</em>' attribute.
	 * @see de.tu_bs.cs.isf.mbse.website.Ranks
	 * @see #getRank()
	 * @generated
	 */
	void setRank(Ranks value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * The literals are from the enumeration {@link de.tu_bs.cs.isf.mbse.website.Color}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see de.tu_bs.cs.isf.mbse.website.Color
	 * @see #setColor(Color)
	 * @see de.tu_bs.cs.isf.mbse.website.WebsitePackage#getSquare_Color()
	 * @model default="none"
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.website.Square#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see de.tu_bs.cs.isf.mbse.website.Color
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

	/**
	 * Returns the value of the '<em><b>Widget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widget</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Widget</em>' reference.
	 * @see #setWidget(Widget)
	 * @see de.tu_bs.cs.isf.mbse.website.WebsitePackage#getSquare_Widget()
	 * @model
	 * @generated
	 */
	Widget getWidget();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.website.Square#getWidget <em>Widget</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Widget</em>' reference.
	 * @see #getWidget()
	 * @generated
	 */
	void setWidget(Widget value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	int getOffsetX();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	int getOffsetY();

<<<<<<< HEAD
	Board getBoard();

=======
>>>>>>> d2e4768f87c9ce90ccfea2bdb3b29d87c4034556
} // Square
