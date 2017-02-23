/**
 */
package de.tu_bs.cs.isf.mbse.website.impl;

import de.tu_bs.cs.isf.mbse.website.Color;
import de.tu_bs.cs.isf.mbse.website.WebsiteFactory;
import de.tu_bs.cs.isf.mbse.website.Board;
import de.tu_bs.cs.isf.mbse.website.Files;
import de.tu_bs.cs.isf.mbse.website.Ranks;
import de.tu_bs.cs.isf.mbse.website.Square;
import de.tu_bs.cs.isf.mbse.website.WebsitePackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Board</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.website.impl.BoardImpl#getSquares <em>Squares</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoardImpl extends MinimalEObjectImpl.Container implements Board {
	/**
	 * The cached value of the '{@link #getSquares() <em>Squares</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSquares()
	 * @generated
	 * @ordered
	 */
	protected EList<Square> squares;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoardImpl() {
		super();
		// Add squares
		for (int i = 0; i < 64; i++) {
			Square square = WebsiteFactory.eINSTANCE.createSquare();

			// Index
			square.setIndex(i);

			// Compute rank
			int rank = (63 - square.getIndex()) / 8 + 1;
			square.setRank(Ranks.get(rank));

			// Compute file
			int file = (square.getIndex()) % 8 + 1;
			square.setFile(Files.get(file));

			// Compute color
			Color color;
			/*
			if (file % 2 == 0) {
				if (rank % 2 == 0) {
					color = Colors.LIGHT;
				} else {
					color = Colors.DARK;
				}
			} else {
				if (rank % 2 == 0) {
					color = Colors.DARK;
				} else {
					color = Colors.LIGHT;
				}
			}
			*/
			if(rank == 8)
			{
				color = Color.BLUE;
			}
			else {
				color = Color.WHITE;
			}
			square.setColor(color);

			getSquares().add(square);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.BOARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Square> getSquares() {
		if (squares == null) {
			squares = new EObjectContainmentEList<Square>(Square.class, this, WebsitePackage.BOARD__SQUARES);
		}
		return squares;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square getSquare(Ranks rank, Files file) {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebsitePackage.BOARD__SQUARES:
				return ((InternalEList<?>)getSquares()).basicRemove(otherEnd, msgs);
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
			case WebsitePackage.BOARD__SQUARES:
				return getSquares();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WebsitePackage.BOARD__SQUARES:
				getSquares().clear();
				getSquares().addAll((Collection<? extends Square>)newValue);
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
			case WebsitePackage.BOARD__SQUARES:
				getSquares().clear();
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
			case WebsitePackage.BOARD__SQUARES:
				return squares != null && !squares.isEmpty();
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
			case WebsitePackage.BOARD___GET_SQUARE__RANKS_FILES:
				return getSquare((Ranks)arguments.get(0), (Files)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //BoardImpl
