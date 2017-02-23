/**
 */
package de.tu_bs.cs.isf.mbse.website;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.mbse.website.WebsiteFactory
 * @model kind="package"
 * @generated
 */
public interface WebsitePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "website";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://tu-bs.de/isf/website";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "website";

	

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WebsitePackage eINSTANCE = de.tu_bs.cs.isf.mbse.website.impl.WebsitePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.website.impl.WebsiteImpl <em>Website</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.website.impl.WebsiteImpl
	 * @see de.tu_bs.cs.isf.mbse.website.impl.WebsitePackageImpl#getWebsite()
	 * @generated
	 */
	int WEBSITE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE__WIDGETS = 1;

	/**
	 * The number of structural features of the '<em>Website</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Website</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.website.impl.WidgetImpl <em>Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.website.impl.WidgetImpl
	 * @see de.tu_bs.cs.isf.mbse.website.impl.WebsitePackageImpl#getWidget()
	 * @generated
	 */
	int WIDGET = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__ROW = 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__WIDTH = 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__HEIGHT = 3;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__COLUMN = 4;

	/**
	 * The feature id for the '<em><b>Square</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__SQUARE = 5;

	/**
	 * The number of structural features of the '<em>Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Get Rank</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET___GET_RANK = 0;

	/**
	 * The operation id for the '<em>Get File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET___GET_FILE = 1;

	/**
	 * The number of operations of the '<em>Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.website.impl.TextBoxImpl <em>Text Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.website.impl.TextBoxImpl
	 * @see de.tu_bs.cs.isf.mbse.website.impl.WebsitePackageImpl#getTextBox()
	 * @generated
	 */
	int TEXT_BOX = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX__ROW = WIDGET__ROW;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX__COLUMN = WIDGET__COLUMN;

	/**
	 * The feature id for the '<em><b>Square</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX__SQUARE = WIDGET__SQUARE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX__CONTENT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Rank</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX___GET_RANK = WIDGET___GET_RANK;

	/**
	 * The operation id for the '<em>Get File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX___GET_FILE = WIDGET___GET_FILE;

	/**
	 * The number of operations of the '<em>Text Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_OPERATION_COUNT = WIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.website.impl.ImageBoxImpl <em>Image Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.website.impl.ImageBoxImpl
	 * @see de.tu_bs.cs.isf.mbse.website.impl.WebsitePackageImpl#getImageBox()
	 * @generated
	 */
	int IMAGE_BOX = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BOX__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BOX__ROW = WIDGET__ROW;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BOX__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BOX__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BOX__COLUMN = WIDGET__COLUMN;

	/**
	 * The feature id for the '<em><b>Square</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BOX__SQUARE = WIDGET__SQUARE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BOX__SOURCE = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Image Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BOX_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Rank</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BOX___GET_RANK = WIDGET___GET_RANK;

	/**
	 * The operation id for the '<em>Get File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BOX___GET_FILE = WIDGET___GET_FILE;

	/**
	 * The number of operations of the '<em>Image Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BOX_OPERATION_COUNT = WIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.website.impl.ButtonBoxImpl <em>Button Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.website.impl.ButtonBoxImpl
	 * @see de.tu_bs.cs.isf.mbse.website.impl.WebsitePackageImpl#getButtonBox()
	 * @generated
	 */
	int BUTTON_BOX = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BOX__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BOX__ROW = WIDGET__ROW;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BOX__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BOX__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BOX__COLUMN = WIDGET__COLUMN;

	/**
	 * The feature id for the '<em><b>Square</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BOX__SQUARE = WIDGET__SQUARE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BOX__CONTENT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BOX__LINK = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Button Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BOX_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Rank</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BOX___GET_RANK = WIDGET___GET_RANK;

	/**
	 * The operation id for the '<em>Get File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BOX___GET_FILE = WIDGET___GET_FILE;

	/**
	 * The number of operations of the '<em>Button Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BOX_OPERATION_COUNT = WIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.website.impl.SearchBoxImpl <em>Search Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.website.impl.SearchBoxImpl
	 * @see de.tu_bs.cs.isf.mbse.website.impl.WebsitePackageImpl#getSearchBox()
	 * @generated
	 */
	int SEARCH_BOX = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_BOX__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_BOX__ROW = WIDGET__ROW;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_BOX__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_BOX__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_BOX__COLUMN = WIDGET__COLUMN;

	/**
	 * The feature id for the '<em><b>Square</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_BOX__SQUARE = WIDGET__SQUARE;

	/**
	 * The number of structural features of the '<em>Search Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_BOX_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Rank</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_BOX___GET_RANK = WIDGET___GET_RANK;

	/**
	 * The operation id for the '<em>Get File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_BOX___GET_FILE = WIDGET___GET_FILE;

	/**
	 * The number of operations of the '<em>Search Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_BOX_OPERATION_COUNT = WIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.website.impl.MenuitemBoxImpl <em>Menuitem Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.website.impl.MenuitemBoxImpl
	 * @see de.tu_bs.cs.isf.mbse.website.impl.WebsitePackageImpl#getMenuitemBox()
	 * @generated
	 */
	int MENUITEM_BOX = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENUITEM_BOX__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENUITEM_BOX__ROW = WIDGET__ROW;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENUITEM_BOX__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENUITEM_BOX__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENUITEM_BOX__COLUMN = WIDGET__COLUMN;

	/**
	 * The feature id for the '<em><b>Square</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENUITEM_BOX__SQUARE = WIDGET__SQUARE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENUITEM_BOX__CONTENT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENUITEM_BOX__LINK = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Menuitem Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENUITEM_BOX_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Rank</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENUITEM_BOX___GET_RANK = WIDGET___GET_RANK;

	/**
	 * The operation id for the '<em>Get File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENUITEM_BOX___GET_FILE = WIDGET___GET_FILE;

	/**
	 * The number of operations of the '<em>Menuitem Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENUITEM_BOX_OPERATION_COUNT = WIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.website.impl.BoardImpl <em>Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.website.impl.BoardImpl
	 * @see de.tu_bs.cs.isf.mbse.website.impl.WebsitePackageImpl#getBoard()
	 * @generated
	 */
	int BOARD = 7;

	/**
	 * The feature id for the '<em><b>Squares</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__SQUARES = 0;
	
	

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__WIDGETS = 1;

	/**
	 * The number of structural features of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Square</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD___GET_SQUARE__RANKS_FILES = 0;

	/**
	 * The number of operations of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.website.impl.SquareImpl <em>Square</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.website.impl.SquareImpl
	 * @see de.tu_bs.cs.isf.mbse.website.impl.WebsitePackageImpl#getSquare()
	 * @generated
	 */
	int SQUARE = 8;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__INDEX = 0;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__FILE = 1;

	/**
	 * The feature id for the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__RANK = 2;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__COLOR = 3;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__WIDGET = 4;

	/**
	 * The number of structural features of the '<em>Square</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Get Offset X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE___GET_OFFSET_X = 0;

	/**
	 * The operation id for the '<em>Get Offset Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE___GET_OFFSET_Y = 1;

	/**
	 * The number of operations of the '<em>Square</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.website.Files <em>Files</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.website.Files
	 * @see de.tu_bs.cs.isf.mbse.website.impl.WebsitePackageImpl#getFiles()
	 * @generated
	 */
	int FILES = 9;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.website.Ranks <em>Ranks</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.website.Ranks
	 * @see de.tu_bs.cs.isf.mbse.website.impl.WebsitePackageImpl#getRanks()
	 * @generated
	 */
	int RANKS = 10;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.website.Color <em>Color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.website.Color
	 * @see de.tu_bs.cs.isf.mbse.website.impl.WebsitePackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 11;

	int PIECE__BOARD = 0;

	int PIECE__SQUARE = 0;

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.website.Website <em>Website</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Website</em>'.
	 * @see de.tu_bs.cs.isf.mbse.website.Website
	 * @generated
	 */
	EClass getWebsite();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.website.Website#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.tu_bs.cs.isf.mbse.website.Website#getName()
	 * @see #getWebsite()
	 * @generated
	 */
	EAttribute getWebsite_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.website.Website#getWidgets <em>Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Widgets</em>'.
	 * @see de.tu_bs.cs.isf.mbse.website.Website#getWidgets()
	 * @see #getWebsite()
	 * @generated
	 */
	EReference getWebsite_Widgets();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.website.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget</em>'.
	 * @see de.tu_bs.cs.isf.mbse.website.Widget
	 * @generated
	 */
	EClass getWidget();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.website.Widget#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.tu_bs.cs.isf.mbse.website.Widget#getName()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.website.Widget#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see de.tu_bs.cs.isf.mbse.website.Widget#getRow()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Row();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.website.Widget#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see de.tu_bs.cs.isf.mbse.website.Widget#getWidth()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Width();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.website.Widget#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see de.tu_bs.cs.isf.mbse.website.Widget#getHeight()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Height();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.website.Widget#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see de.tu_bs.cs.isf.mbse.website.Widget#getColumn()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Column();

	/**
	 * Returns the meta object for the reference '{@link de.tu_bs.cs.isf.mbse.website.Widget#getSquare <em>Square</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Square</em>'.
	 * @see de.tu_bs.cs.isf.mbse.website.Widget#getSquare()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Square();

	/**
	 * Returns the meta object for the '{@link de.tu_bs.cs.isf.mbse.website.Widget#getRank() <em>Get Rank</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Rank</em>' operation.
	 * @see de.tu_bs.cs.isf.mbse.website.Widget#getRank()
	 * @generated
	 */
	EOperation getWidget__GetRank();

	/**
	 * Returns the meta object for the '{@link de.tu_bs.cs.isf.mbse.website.Widget#getFile() <em>Get File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get File</em>' operation.
	 * @see de.tu_bs.cs.isf.mbse.website.Widget#getFile()
	 * @generated
	 */
	EOperation getWidget__GetFile();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.website.TextBox <em>Text Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Box</em>'.
	 * @see de.tu_bs.cs.isf.mbse.website.TextBox
	 * @generated
	 */
	EClass getTextBox();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.website.TextBox#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see de.tu_bs.cs.isf.mbse.website.TextBox#getContent()
	 * @see #getTextBox()
	 * @generated
	 */
	EAttribute getTextBox_Content();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.website.ImageBox <em>Image Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Box</em>'.
	 * @see de.tu_bs.cs.isf.mbse.website.ImageBox
	 * @generated
	 */
	EClass getImageBox();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.website.ImageBox#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see de.tu_bs.cs.isf.mbse.website.ImageBox#getSource()
	 * @see #getImageBox()
	 * @generated
	 */
	EAttribute getImageBox_Source();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.website.ButtonBox <em>Button Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Box</em>'.
	 * @see de.tu_bs.cs.isf.mbse.website.ButtonBox
	 * @generated
	 */
	EClass getButtonBox();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.website.ButtonBox#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see de.tu_bs.cs.isf.mbse.website.ButtonBox#getContent()
	 * @see #getButtonBox()
	 * @generated
	 */
	EAttribute getButtonBox_Content();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.website.ButtonBox#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link</em>'.
	 * @see de.tu_bs.cs.isf.mbse.website.ButtonBox#getLink()
	 * @see #getButtonBox()
	 * @generated
	 */
	EAttribute getButtonBox_Link();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.website.SearchBox <em>Search Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search Box</em>'.
	 * @see de.tu_bs.cs.isf.mbse.website.SearchBox
	 * @generated
	 */
	EClass getSearchBox();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.website.MenuitemBox <em>Menuitem Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menuitem Box</em>'.
	 * @see de.tu_bs.cs.isf.mbse.website.MenuitemBox
	 * @generated
	 */
	EClass getMenuitemBox();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.website.MenuitemBox#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see de.tu_bs.cs.isf.mbse.website.MenuitemBox#getContent()
	 * @see #getMenuitemBox()
	 * @generated
	 */
	EAttribute getMenuitemBox_Content();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.website.MenuitemBox#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link</em>'.
	 * @see de.tu_bs.cs.isf.mbse.website.MenuitemBox#getLink()
	 * @see #getMenuitemBox()
	 * @generated
	 */
	EAttribute getMenuitemBox_Link();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.website.Board <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Board</em>'.
	 * @see de.tu_bs.cs.isf.mbse.website.Board
	 * @generated
	 */
	EClass getBoard();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.website.Board#getSquares <em>Squares</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Squares</em>'.
	 * @see de.tu_bs.cs.isf.mbse.website.Board#getSquares()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_Squares();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.website.Board#getWidgets <em>Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Widgets</em>'.
	 * @see de.tu_bs.cs.isf.mbse.website.Board#getWidgets()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_Widgets();

	/**
	 * Returns the meta object for the '{@link de.tu_bs.cs.isf.mbse.website.Board#getSquare(de.tu_bs.cs.isf.mbse.website.Ranks, de.tu_bs.cs.isf.mbse.website.Files) <em>Get Square</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Square</em>' operation.
	 * @see de.tu_bs.cs.isf.mbse.website.Board#getSquare(de.tu_bs.cs.isf.mbse.website.Ranks, de.tu_bs.cs.isf.mbse.website.Files)
	 * @generated
	 */
	EOperation getBoard__GetSquare__Ranks_Files();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.website.Square <em>Square</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Square</em>'.
	 * @see de.tu_bs.cs.isf.mbse.website.Square
	 * @generated
	 */
	EClass getSquare();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.website.Square#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see de.tu_bs.cs.isf.mbse.website.Square#getIndex()
	 * @see #getSquare()
	 * @generated
	 */
	EAttribute getSquare_Index();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.website.Square#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see de.tu_bs.cs.isf.mbse.website.Square#getFile()
	 * @see #getSquare()
	 * @generated
	 */
	EAttribute getSquare_File();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.website.Square#getRank <em>Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rank</em>'.
	 * @see de.tu_bs.cs.isf.mbse.website.Square#getRank()
	 * @see #getSquare()
	 * @generated
	 */
	EAttribute getSquare_Rank();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.website.Square#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see de.tu_bs.cs.isf.mbse.website.Square#getColor()
	 * @see #getSquare()
	 * @generated
	 */
	EAttribute getSquare_Color();

	/**
	 * Returns the meta object for the reference '{@link de.tu_bs.cs.isf.mbse.website.Square#getWidget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Widget</em>'.
	 * @see de.tu_bs.cs.isf.mbse.website.Square#getWidget()
	 * @see #getSquare()
	 * @generated
	 */
	EReference getSquare_Widget();

	/**
	 * Returns the meta object for the '{@link de.tu_bs.cs.isf.mbse.website.Square#getOffsetX() <em>Get Offset X</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Offset X</em>' operation.
	 * @see de.tu_bs.cs.isf.mbse.website.Square#getOffsetX()
	 * @generated
	 */
	EOperation getSquare__GetOffsetX();

	/**
	 * Returns the meta object for the '{@link de.tu_bs.cs.isf.mbse.website.Square#getOffsetY() <em>Get Offset Y</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Offset Y</em>' operation.
	 * @see de.tu_bs.cs.isf.mbse.website.Square#getOffsetY()
	 * @generated
	 */
	EOperation getSquare__GetOffsetY();

	/**
	 * Returns the meta object for enum '{@link de.tu_bs.cs.isf.mbse.website.Files <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Files</em>'.
	 * @see de.tu_bs.cs.isf.mbse.website.Files
	 * @generated
	 */
	EEnum getFiles();

	/**
	 * Returns the meta object for enum '{@link de.tu_bs.cs.isf.mbse.website.Ranks <em>Ranks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ranks</em>'.
	 * @see de.tu_bs.cs.isf.mbse.website.Ranks
	 * @generated
	 */
	EEnum getRanks();

	/**
	 * Returns the meta object for enum '{@link de.tu_bs.cs.isf.mbse.website.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color</em>'.
	 * @see de.tu_bs.cs.isf.mbse.website.Color
	 * @generated
	 */
	EEnum getColor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WebsiteFactory getWebsiteFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.website.impl.WebsiteImpl <em>Website</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.website.impl.WebsiteImpl
		 * @see de.tu_bs.cs.isf.mbse.website.impl.WebsitePackageImpl#getWebsite()
		 * @generated
		 */
		EClass WEBSITE = eINSTANCE.getWebsite();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEBSITE__NAME = eINSTANCE.getWebsite_Name();

		/**
		 * The meta object literal for the '<em><b>Widgets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEBSITE__WIDGETS = eINSTANCE.getWebsite_Widgets();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.website.impl.WidgetImpl <em>Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.website.impl.WidgetImpl
		 * @see de.tu_bs.cs.isf.mbse.website.impl.WebsitePackageImpl#getWidget()
		 * @generated
		 */
		EClass WIDGET = eINSTANCE.getWidget();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__NAME = eINSTANCE.getWidget_Name();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__ROW = eINSTANCE.getWidget_Row();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__WIDTH = eINSTANCE.getWidget_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__HEIGHT = eINSTANCE.getWidget_Height();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__COLUMN = eINSTANCE.getWidget_Column();

		/**
		 * The meta object literal for the '<em><b>Square</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__SQUARE = eINSTANCE.getWidget_Square();

		/**
		 * The meta object literal for the '<em><b>Get Rank</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WIDGET___GET_RANK = eINSTANCE.getWidget__GetRank();

		/**
		 * The meta object literal for the '<em><b>Get File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WIDGET___GET_FILE = eINSTANCE.getWidget__GetFile();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.website.impl.TextBoxImpl <em>Text Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.website.impl.TextBoxImpl
		 * @see de.tu_bs.cs.isf.mbse.website.impl.WebsitePackageImpl#getTextBox()
		 * @generated
		 */
		EClass TEXT_BOX = eINSTANCE.getTextBox();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_BOX__CONTENT = eINSTANCE.getTextBox_Content();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.website.impl.ImageBoxImpl <em>Image Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.website.impl.ImageBoxImpl
		 * @see de.tu_bs.cs.isf.mbse.website.impl.WebsitePackageImpl#getImageBox()
		 * @generated
		 */
		EClass IMAGE_BOX = eINSTANCE.getImageBox();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_BOX__SOURCE = eINSTANCE.getImageBox_Source();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.website.impl.ButtonBoxImpl <em>Button Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.website.impl.ButtonBoxImpl
		 * @see de.tu_bs.cs.isf.mbse.website.impl.WebsitePackageImpl#getButtonBox()
		 * @generated
		 */
		EClass BUTTON_BOX = eINSTANCE.getButtonBox();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON_BOX__CONTENT = eINSTANCE.getButtonBox_Content();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON_BOX__LINK = eINSTANCE.getButtonBox_Link();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.website.impl.SearchBoxImpl <em>Search Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.website.impl.SearchBoxImpl
		 * @see de.tu_bs.cs.isf.mbse.website.impl.WebsitePackageImpl#getSearchBox()
		 * @generated
		 */
		EClass SEARCH_BOX = eINSTANCE.getSearchBox();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.website.impl.MenuitemBoxImpl <em>Menuitem Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.website.impl.MenuitemBoxImpl
		 * @see de.tu_bs.cs.isf.mbse.website.impl.WebsitePackageImpl#getMenuitemBox()
		 * @generated
		 */
		EClass MENUITEM_BOX = eINSTANCE.getMenuitemBox();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENUITEM_BOX__CONTENT = eINSTANCE.getMenuitemBox_Content();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENUITEM_BOX__LINK = eINSTANCE.getMenuitemBox_Link();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.website.impl.BoardImpl <em>Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.website.impl.BoardImpl
		 * @see de.tu_bs.cs.isf.mbse.website.impl.WebsitePackageImpl#getBoard()
		 * @generated
		 */
		EClass BOARD = eINSTANCE.getBoard();

		/**
		 * The meta object literal for the '<em><b>Squares</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD__SQUARES = eINSTANCE.getBoard_Squares();

		/**
		 * The meta object literal for the '<em><b>Widgets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD__WIDGETS = eINSTANCE.getBoard_Widgets();

		/**
		 * The meta object literal for the '<em><b>Get Square</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOARD___GET_SQUARE__RANKS_FILES = eINSTANCE.getBoard__GetSquare__Ranks_Files();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.website.impl.SquareImpl <em>Square</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.website.impl.SquareImpl
		 * @see de.tu_bs.cs.isf.mbse.website.impl.WebsitePackageImpl#getSquare()
		 * @generated
		 */
		EClass SQUARE = eINSTANCE.getSquare();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQUARE__INDEX = eINSTANCE.getSquare_Index();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQUARE__FILE = eINSTANCE.getSquare_File();

		/**
		 * The meta object literal for the '<em><b>Rank</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQUARE__RANK = eINSTANCE.getSquare_Rank();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQUARE__COLOR = eINSTANCE.getSquare_Color();

		/**
		 * The meta object literal for the '<em><b>Widget</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQUARE__WIDGET = eINSTANCE.getSquare_Widget();

		/**
		 * The meta object literal for the '<em><b>Get Offset X</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SQUARE___GET_OFFSET_X = eINSTANCE.getSquare__GetOffsetX();

		/**
		 * The meta object literal for the '<em><b>Get Offset Y</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SQUARE___GET_OFFSET_Y = eINSTANCE.getSquare__GetOffsetY();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.website.Files <em>Files</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.website.Files
		 * @see de.tu_bs.cs.isf.mbse.website.impl.WebsitePackageImpl#getFiles()
		 * @generated
		 */
		EEnum FILES = eINSTANCE.getFiles();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.website.Ranks <em>Ranks</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.website.Ranks
		 * @see de.tu_bs.cs.isf.mbse.website.impl.WebsitePackageImpl#getRanks()
		 * @generated
		 */
		EEnum RANKS = eINSTANCE.getRanks();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.website.Color <em>Color</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.website.Color
		 * @see de.tu_bs.cs.isf.mbse.website.impl.WebsitePackageImpl#getColor()
		 * @generated
		 */
		EEnum COLOR = eINSTANCE.getColor();

	}

} //WebsitePackage
