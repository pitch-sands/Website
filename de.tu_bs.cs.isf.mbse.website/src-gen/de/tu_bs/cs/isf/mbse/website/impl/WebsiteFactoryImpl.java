/**
 */
package de.tu_bs.cs.isf.mbse.website.impl;

import de.tu_bs.cs.isf.mbse.website.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebsiteFactoryImpl extends EFactoryImpl implements WebsiteFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WebsiteFactory init() {
		try {
			WebsiteFactory theWebsiteFactory = (WebsiteFactory)EPackage.Registry.INSTANCE.getEFactory(WebsitePackage.eNS_URI);
			if (theWebsiteFactory != null) {
				return theWebsiteFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WebsiteFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebsiteFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WebsitePackage.WEBSITE: return createWebsite();
			case WebsitePackage.WIDGET: return createWidget();
			case WebsitePackage.TEXT_BOX: return createTextBox();
			case WebsitePackage.IMAGE_BOX: return createImageBox();
			case WebsitePackage.BUTTON_BOX: return createButtonBox();
			case WebsitePackage.SEARCH_BOX: return createSearchBox();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Website createWebsite() {
		WebsiteImpl website = new WebsiteImpl();
		return website;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Widget createWidget() {
		WidgetImpl widget = new WidgetImpl();
		return widget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextBox createTextBox() {
		TextBoxImpl textBox = new TextBoxImpl();
		return textBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageBox createImageBox() {
		ImageBoxImpl imageBox = new ImageBoxImpl();
		return imageBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonBox createButtonBox() {
		ButtonBoxImpl buttonBox = new ButtonBoxImpl();
		return buttonBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchBox createSearchBox() {
		SearchBoxImpl searchBox = new SearchBoxImpl();
		return searchBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebsitePackage getWebsitePackage() {
		return (WebsitePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WebsitePackage getPackage() {
		return WebsitePackage.eINSTANCE;
	}

} //WebsiteFactoryImpl
