/**
 */
package de.tu_bs.cs.isf.mbse.website.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>website</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebsiteTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new WebsiteTests("website Tests");
		suite.addTestSuite(WidgetTest.class);
		suite.addTestSuite(TextBoxTest.class);
		suite.addTestSuite(ImageBoxTest.class);
		suite.addTestSuite(ButtonBoxTest.class);
		suite.addTestSuite(SearchBoxTest.class);
		suite.addTestSuite(MenuitemBoxTest.class);
		suite.addTestSuite(BoardTest.class);
		suite.addTestSuite(SquareTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebsiteTests(String name) {
		super(name);
	}

} //WebsiteTests
