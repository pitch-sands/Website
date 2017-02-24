package de.tu_bs.cs.isf.mbse.website.graphiti.create;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.AnchorContainer;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;


import de.tu_bs.cs.isf.mbse.website.Color;
import de.tu_bs.cs.isf.mbse.website.SearchBox;
import de.tu_bs.cs.isf.mbse.website.Square;
import de.tu_bs.cs.isf.mbse.website.WebsiteFactory;
import de.tu_bs.cs.isf.mbse.website.graphiti.model.WebsiteModelUtil;

public class CreateSearchBoxFeature extends AbstractCreateFeature{

	public CreateSearchBoxFeature(IFeatureProvider fp) {
		super(fp, "SearchBox", "Create SearchBox");
	}
	
	public boolean canCreate(ICreateContext context) {
		//if targetSquare is not black
				// Add new board only in case of an empty diagram
				AnchorContainer parent = context.getTargetContainer().getAnchors().get(0).getParent();
		    	Square targetSquare = (Square) getBusinessObjectForPictogramElement(parent);
				if(targetSquare.getColor() != Color.BLUE){
					return context.getTargetContainer() instanceof ContainerShape;
				}
				return false;
    }
 
  
    public Object[] create(ICreateContext context) {

    	// Get the target square
		//Object targetBO = getBusinessObjectForPictogramElement(context.getTargetContainer());		

		Anchor anchor = context.getTargetContainer().getAnchors().get(0);
		AnchorContainer parent = anchor.getParent();
        Square obj = (Square) getBusinessObjectForPictogramElement(parent);
    	
    	SearchBox newState= WebsiteFactory.eINSTANCE.createSearchBox();
        newState.setColumn(obj.getOffsetX()+1);
        newState.setRow(obj.getOffsetY()+1);
    	
        getDiagram().eResource().getContents().add(newState);
        
        
 
        // do the add
        addGraphicalRepresentation(context, newState);
        getFeatureProvider().getDirectEditingInfo().setActive(true);
        
         //return newly created business object(s)
        WebsiteModelUtil.INSTANCE.addWidget(newState);
        return new Object[] { newState };
    }

}
