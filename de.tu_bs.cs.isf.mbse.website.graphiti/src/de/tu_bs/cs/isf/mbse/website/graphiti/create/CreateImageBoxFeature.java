package de.tu_bs.cs.isf.mbse.website.graphiti.create;

import de.tu_bs.cs.isf.mbse.website.Square;
import de.tu_bs.cs.isf.mbse.website.Board;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IMoveShapeFeature;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;

import de.tu_bs.cs.isf.mbse.website.WebsiteFactory;
import de.tu_bs.cs.isf.mbse.website.graphiti.model.WebsiteModelUtil;
import de.tu_bs.cs.isf.mbse.website.ImageBox;

public class CreateImageBoxFeature extends AbstractCreateFeature {

	public CreateImageBoxFeature(IFeatureProvider fp) {
        // set name and description of the creation feature
        super(fp, "ImageBox", "Create Image Widget");
    }
	
	@Override
	public boolean canCreate(ICreateContext context) {
		// TODO Auto-generated method stub
		//return false;
		Board board = getBoard(context);
		if (board != null) {
			// Allow the creation of the initial set of pieces in case a
			// board exists...
				return true;
			
		}
		return false;
	}

	@Override
	public Object[] create(ICreateContext context) {
		// Get the chess board
		Board board = getBoard(context);
		Object targetBO = getBusinessObjectForPictogramElement(context.getTargetContainer());
		Square targetSquare = (Square) targetBO;
		
		
		
		ImageBox imagebox = WebsiteFactory.eINSTANCE.createImageBox();
		imagebox.eResource().getContents().add(imagebox);
		imagebox.setBoard(board);
		imagebox.setSquare(targetSquare);
		
		
		
		// TODO Auto-generated method stub
		//return null;
		imagebox.setName("Image");
		imagebox.setColumn(targetSquare.getFile().getValue());
		imagebox.setRow(targetSquare.getRank().getValue());
		//newImage.setRoute("Input Route..");
		
		WebsiteModelUtil.INSTANCE.addWidget(imagebox);
		//getDiagram().eResource().getContents().add(newImage);

		// Delegate to the add feature
		AddContext addContext = new AddContext(context, imagebox);
		addContext.setTargetContainer(getDiagram());
		getFeatureProvider().getDirectEditingInfo().setActive(true);
		addGraphicalRepresentation(addContext, imagebox);
		
		//return newly created business object
		return new Object[] { imagebox };
	}

	private Board getBoard(ICreateContext context) {
		ContainerShape targetContainer = context.getTargetContainer();
		Object bo = getBusinessObjectForPictogramElement(targetContainer);
		if (bo instanceof Board) {
			return (Board) bo;
		} else if (bo instanceof Square) {
			return ((Square) bo).getBoard();
		}
		return null;
	}
}
