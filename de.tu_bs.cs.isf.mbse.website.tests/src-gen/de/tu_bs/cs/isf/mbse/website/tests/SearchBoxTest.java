/**
 */
package de.tu_bs.cs.isf.mbse.website.tests;

import de.tu_bs.cs.isf.mbse.website.SearchBox;
import de.tu_bs.cs.isf.mbse.website.WebsiteFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Search Box</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SearchBoxTest extends WidgetTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SearchBoxTest.class);
	}

	/**
	 * Constructs a new Search Box test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchBoxTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Search Box test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SearchBox getFixture() {
		return (SearchBox)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WebsiteFactory.eINSTANCE.createSearchBox());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //SearchBoxTest
