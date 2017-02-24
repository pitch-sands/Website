package de.tu_bs.cs.isf.mbse.website.graphiti.move;


import de.tu_bs.cs.isf.mbse.website.Square;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.context.impl.MoveShapeContext;
import org.eclipse.graphiti.features.impl.DefaultMoveShapeFeature;

import de.tu_bs.cs.isf.mbse.website.Widget;
import de.tu_bs.cs.isf.mbse.website.graphiti.model.WebsiteModelUtil;

public class WidgetMoveFeature extends DefaultMoveShapeFeature{

	public WidgetMoveFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	@Override
	public boolean canMoveShape(IMoveShapeContext context) {
		Object bo = getBusinessObjectForPictogramElement(context.getShape());

		// We can only move pieces
		if (!(bo instanceof Widget)) {
			return false;
		}
		
		
		// Find the source and target squares
				//Square sourceSquare = (Square) getBusinessObjectForPictogramElement(context.getSourceContainer());
				Object targetBO = getBusinessObjectForPictogramElement(context.getTargetContainer());
				//Square targetSquare;
				if (targetBO instanceof Square) {
					((Widget)bo).setColumn(((Square) targetBO).getOffsetX()+1);
					((Widget)bo).setRow(((Square) targetBO).getOffsetY()+1);
					WebsiteModelUtil.INSTANCE.updateWidget();
					return true;
				}else {
					// Not allowed to drop onto anything else than squares and pieces
					return false;
				}
		}	
	
	protected void preMoveShape(IMoveShapeContext context) {
		// We need an instance of MoveShapeContext (and can be sure to have it)
		// to be able to modify the X and Y coordinates
		MoveShapeContext moveContext = (MoveShapeContext) context;

		// Set the X and Y coordinates to 0; they are set to the location the
		// user dropped the shape but pieces always need a location of 0 because
		// the visible polygon already has the offset from the source of the
		// containing shape
		moveContext.setX(0);
		moveContext.setY(0);

		Object targetContainerBO = getBusinessObjectForPictogramElement(context.getTargetContainer());
		if (targetContainerBO instanceof Widget) {
			// Dropped onto piece --> correct the target shape to the shape of
			// the square
			moveContext.setTargetContainer(context.getTargetContainer().getContainer());
		}
	}
}
