/**
 */
package de.tu_bs.cs.isf.mbse.website.impl;

import de.tu_bs.cs.isf.mbse.website.Color;
import de.tu_bs.cs.isf.mbse.website.Files;
import de.tu_bs.cs.isf.mbse.website.Ranks;
import de.tu_bs.cs.isf.mbse.website.Square;
import de.tu_bs.cs.isf.mbse.website.WebsitePackage;
import de.tu_bs.cs.isf.mbse.website.Widget;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Square</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.website.impl.SquareImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.website.impl.SquareImpl#getFile <em>File</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.website.impl.SquareImpl#getRank <em>Rank</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.website.impl.SquareImpl#getColor <em>Color</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.website.impl.SquareImpl#getWidget <em>Widget</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SquareImpl extends MinimalEObjectImpl.Container implements Square {
	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected int index = INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected static final Files FILE_EDEFAULT = Files.NONE;

	/**
	 * The cached value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected Files file = FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRank() <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRank()
	 * @generated
	 * @ordered
	 */
	protected static final Ranks RANK_EDEFAULT = Ranks.NONE;

	/**
	 * The cached value of the '{@link #getRank() <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRank()
	 * @generated
	 * @ordered
	 */
	protected Ranks rank = RANK_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color COLOR_EDEFAULT = Color.NONE;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected Color color = COLOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWidget() <em>Widget</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidget()
	 * @generated
	 * @ordered
	 */
	protected Widget widget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SquareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.SQUARE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(int newIndex) {
		int oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.SQUARE__INDEX, oldIndex, index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Files getFile() {
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFile(Files newFile) {
		Files oldFile = file;
		file = newFile == null ? FILE_EDEFAULT : newFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.SQUARE__FILE, oldFile, file));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ranks getRank() {
		return rank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRank(Ranks newRank) {
		Ranks oldRank = rank;
		rank = newRank == null ? RANK_EDEFAULT : newRank;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.SQUARE__RANK, oldRank, rank));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(Color newColor) {
		Color oldColor = color;
		color = newColor == null ? COLOR_EDEFAULT : newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.SQUARE__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Widget getWidget() {
		if (widget != null && widget.eIsProxy()) {
			InternalEObject oldWidget = (InternalEObject)widget;
			widget = (Widget)eResolveProxy(oldWidget);
			if (widget != oldWidget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.SQUARE__WIDGET, oldWidget, widget));
			}
		}
		return widget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Widget basicGetWidget() {
		return widget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWidget(Widget newWidget, NotificationChain msgs) {
		Widget oldWidget = widget;
		widget = newWidget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebsitePackage.SQUARE__WIDGET, oldWidget, newWidget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidget(Widget newWidget) {
		if (newWidget != widget) {
			NotificationChain msgs = null;
			if (widget != null)
				msgs = ((InternalEObject)widget).eInverseRemove(this, WebsitePackage.WIDGET__SQUARE, Widget.class, msgs);
			if (newWidget != null)
				msgs = ((InternalEObject)newWidget).eInverseAdd(this, WebsitePackage.WIDGET__SQUARE, Widget.class, msgs);
			msgs = basicSetWidget(newWidget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.SQUARE__WIDGET, newWidget, newWidget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOffsetX() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOffsetY() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebsitePackage.SQUARE__WIDGET:
				if (widget != null)
					msgs = ((InternalEObject)widget).eInverseRemove(this, WebsitePackage.WIDGET__SQUARE, Widget.class, msgs);
				return basicSetWidget((Widget)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebsitePackage.SQUARE__WIDGET:
				return basicSetWidget(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebsitePackage.SQUARE__INDEX:
				return getIndex();
			case WebsitePackage.SQUARE__FILE:
				return getFile();
			case WebsitePackage.SQUARE__RANK:
				return getRank();
			case WebsitePackage.SQUARE__COLOR:
				return getColor();
			case WebsitePackage.SQUARE__WIDGET:
				if (resolve) return getWidget();
				return basicGetWidget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WebsitePackage.SQUARE__INDEX:
				setIndex((Integer)newValue);
				return;
			case WebsitePackage.SQUARE__FILE:
				setFile((Files)newValue);
				return;
			case WebsitePackage.SQUARE__RANK:
				setRank((Ranks)newValue);
				return;
			case WebsitePackage.SQUARE__COLOR:
				setColor((Color)newValue);
				return;
			case WebsitePackage.SQUARE__WIDGET:
				setWidget((Widget)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WebsitePackage.SQUARE__INDEX:
				setIndex(INDEX_EDEFAULT);
				return;
			case WebsitePackage.SQUARE__FILE:
				setFile(FILE_EDEFAULT);
				return;
			case WebsitePackage.SQUARE__RANK:
				setRank(RANK_EDEFAULT);
				return;
			case WebsitePackage.SQUARE__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case WebsitePackage.SQUARE__WIDGET:
				setWidget((Widget)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WebsitePackage.SQUARE__INDEX:
				return index != INDEX_EDEFAULT;
			case WebsitePackage.SQUARE__FILE:
				return file != FILE_EDEFAULT;
			case WebsitePackage.SQUARE__RANK:
				return rank != RANK_EDEFAULT;
			case WebsitePackage.SQUARE__COLOR:
				return color != COLOR_EDEFAULT;
			case WebsitePackage.SQUARE__WIDGET:
				return widget != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case WebsitePackage.SQUARE___GET_OFFSET_X:
				return getOffsetX();
			case WebsitePackage.SQUARE___GET_OFFSET_Y:
				return getOffsetY();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (index: ");
		result.append(index);
		result.append(", file: ");
		result.append(file);
		result.append(", rank: ");
		result.append(rank);
		result.append(", color: ");
		result.append(color);
		result.append(')');
		return result.toString();
	}



	

	

} //SquareImpl
