package de.tu_bs.cs.isf.mbse.website.graphiti.create;

import de.tu_bs.cs.isf.mbse.website.Square;
import de.tu_bs.cs.isf.mbse.website.TextBox;
import de.tu_bs.cs.isf.mbse.website.Board;

import java.util.List;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IMoveShapeFeature;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.AnchorContainer;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;

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
<<<<<<< HEAD
    	System.out.println("canCreate:"+ context.getTargetContainer().toString());
=======

>>>>>>> ae328cab1f9642e5b28336b999f856219880c974
		return context.getTargetContainer() instanceof ContainerShape;
	}

	@Override
	public Object[] create(ICreateContext context) {
<<<<<<< HEAD
=======

		// Get the chess board
		//Board board = getBoard(context);
		Object targetBO = getBusinessObjectForPictogramElement(context.getTargetContainer());
		Square targetSquare = (Square) targetBO;
		
		
		
		ImageBox imagebox = WebsiteFactory.eINSTANCE.createImageBox();
		imagebox.eResource().getContents().add(imagebox);
		//imagebox.setBoard(board);
		imagebox.setSquare(targetSquare);
		
		
>>>>>>> ae328cab1f9642e5b28336b999f856219880c974
		
		//Square square = (Square) context.getTargetContainer();
		ImageBox newimage= WebsiteFactory.eINSTANCE.createImageBox();
        
		/*
		*/

        Square targetSquare = getSquare(context.getTargetContainer().getAnchors().get(0));

<<<<<<< HEAD
		newimage.setColumn(targetSquare.getOffsetX());
		newimage.setRow(targetSquare.getOffsetY());

		newimage.setName("Image");
		/*
		newimage.setColumn(context.getX());
		newimage.setRow(context.getY());
		*/
        getDiagram().eResource().getContents().add(newimage);
        
        
 
        // do the add
        addGraphicalRepresentation(context, newimage);
        getFeatureProvider().getDirectEditingInfo().setActive(true);
        
         //return newly created business object(s)
        WebsiteModelUtil.INSTANCE.addWidget(newimage);
        return new Object[] { newimage };
	}
	
	private Square getSquare(Anchor anchor) {
		// Try to find a square for the given anchor
		if (anchor != null) {
			AnchorContainer parent = anchor.getParent();
			Object obj = getBusinessObjectForPictogramElement(parent);
			if (obj instanceof Square) {
				// The shape of the anchor represents a square
				return (Square) obj;
			} 
		}
		return null;
	}
=======
	//private Board getBoard(ICreateContext context) {
	//	ContainerShape targetContainer = context.getTargetContainer();
	//	Object bo = getBusinessObjectForPictogramElement(targetContainer);
	//	if (bo instanceof Board) {
	//	return (Board) bo;
	//	} else if (bo instanceof Square) {
	//		return ((Square) bo).getBoard();
	//	}
	//	return null;
	//}
>>>>>>> ae328cab1f9642e5b28336b999f856219880c974

}
