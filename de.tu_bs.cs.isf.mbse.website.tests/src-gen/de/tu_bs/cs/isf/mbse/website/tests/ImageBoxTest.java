/**
 */
package de.tu_bs.cs.isf.mbse.website.tests;

import de.tu_bs.cs.isf.mbse.website.ImageBox;
import de.tu_bs.cs.isf.mbse.website.WebsiteFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Image Box</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImageBoxTest extends WidgetTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ImageBoxTest.class);
	}

	/**
	 * Constructs a new Image Box test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageBoxTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Image Box test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ImageBox getFixture() {
		return (ImageBox)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WebsiteFactory.eINSTANCE.createImageBox());
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

} //ImageBoxTest
