/**
 */
package de.tu_bs.cs.isf.mbse.website;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.website.ImageBox#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.mbse.website.WebsitePackage#getImageBox()
 * @model
 * @generated
 */
public interface ImageBox extends Widget {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see de.tu_bs.cs.isf.mbse.website.WebsitePackage#getImageBox_Source()
	 * @model
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.website.ImageBox#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	void setBoard(Board board);

	void setSquare(Square targetSquare);

} // ImageBox
