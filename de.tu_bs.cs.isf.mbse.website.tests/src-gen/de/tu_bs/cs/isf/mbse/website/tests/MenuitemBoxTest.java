/**
 */
package de.tu_bs.cs.isf.mbse.website.tests;

import de.tu_bs.cs.isf.mbse.website.MenuitemBox;
import de.tu_bs.cs.isf.mbse.website.WebsiteFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Menuitem Box</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MenuitemBoxTest extends WidgetTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MenuitemBoxTest.class);
	}

	/**
	 * Constructs a new Menuitem Box test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuitemBoxTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Menuitem Box test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MenuitemBox getFixture() {
		return (MenuitemBox)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WebsiteFactory.eINSTANCE.createMenuitemBox());
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

} //MenuitemBoxTest
