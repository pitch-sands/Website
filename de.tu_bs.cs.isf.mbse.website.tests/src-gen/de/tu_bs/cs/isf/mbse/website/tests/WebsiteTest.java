/**
 */
package de.tu_bs.cs.isf.mbse.website.tests;

import de.tu_bs.cs.isf.mbse.website.Website;
import de.tu_bs.cs.isf.mbse.website.WebsiteFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Website</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebsiteTest extends TestCase {

	/**
	 * The fixture for this Website test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Website fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WebsiteTest.class);
	}

	/**
	 * Constructs a new Website test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebsiteTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Website test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Website fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Website test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Website getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WebsiteFactory.eINSTANCE.createWebsite());
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

} //WebsiteTest
