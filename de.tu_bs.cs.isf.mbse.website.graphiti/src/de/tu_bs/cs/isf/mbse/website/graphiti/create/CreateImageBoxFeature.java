package de.tu_bs.cs.isf.mbse.website.graphiti.create;

import de.tu_bs.cs.isf.mbse.website.Square;

import de.tu_bs.cs.isf.mbse.website.Color;


import org.eclipse.graphiti.features.IFeatureProvider;

import org.eclipse.graphiti.features.context.ICreateContext;

import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.AnchorContainer;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;



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
		//if targetSquare is not black
		// Add new board only in case of an empty diagram
		AnchorContainer parent = context.getTargetContainer().getAnchors().get(0).getParent();
		Square targetSquare = (Square) getBusinessObjectForPictogramElement(parent);
		if(targetSquare.getColor() != Color.BLUE){
			return context.getTargetContainer() instanceof ContainerShape;
		}
		return false;
	}

	@Override
	public Object[] create(ICreateContext context) {


		// Get the target square
		//Object targetBO = getBusinessObjectForPictogramElement(context.getTargetContainer());		

		Anchor anchor = context.getTargetContainer().getAnchors().get(0);
		AnchorContainer parent = anchor.getParent();
        Square obj = (Square) getBusinessObjectForPictogramElement(parent);
	
		ImageBox newimage= WebsiteFactory.eINSTANCE.createImageBox();

		newimage.setColumn(obj.getOffsetX()+1);
		newimage.setRow(obj.getOffsetY()+1);

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
	

}
