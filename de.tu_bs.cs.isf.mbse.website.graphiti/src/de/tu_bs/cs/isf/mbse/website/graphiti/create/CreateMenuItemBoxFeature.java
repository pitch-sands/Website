package de.tu_bs.cs.isf.mbse.website.graphiti.create;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.AnchorContainer;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;



import de.tu_bs.cs.isf.mbse.website.Color;
import de.tu_bs.cs.isf.mbse.website.MenuitemBox;
import de.tu_bs.cs.isf.mbse.website.Square;
import de.tu_bs.cs.isf.mbse.website.WebsiteFactory;
import de.tu_bs.cs.isf.mbse.website.graphiti.model.WebsiteModelUtil;

public class CreateMenuItemBoxFeature extends AbstractCreateFeature{

	public CreateMenuItemBoxFeature(IFeatureProvider fp) {
		super(fp, "MenuitemBox", "Create MenuitemBox");
	}
	
	public boolean canCreate(ICreateContext context) {
		//if targetSquare is not black
				// Add new board only in case of an empty diagram
		Square targetSquare = (Square) getBusinessObjectForPictogramElement(context.getTargetContainer());
				if(targetSquare.getColor() == Color.BLUE){
					return context.getTargetContainer() instanceof ContainerShape;
				}
				return false;
    }
 
  
    public Object[] create(ICreateContext context) {
    	// Get the target square
		//Object targetBO = getBusinessObjectForPictogramElement(context.getTargetContainer());		

    	Square obj = (Square) getBusinessObjectForPictogramElement(context.getTargetContainer());
    	
        MenuitemBox newState= WebsiteFactory.eINSTANCE.createMenuitemBox();
    	newState.setContent("Write your Menuitem name here.");
        newState.setColumn(obj.getOffsetX()+1);
        newState.setRow(obj.getOffsetY()+1);
        System.out.println("menu column: " + newState.getColumn() + " and row: " + newState.getRow());
        getDiagram().eResource().getContents().add(newState);
        
        
 
        // do the add
        addGraphicalRepresentation(context, newState);
        getFeatureProvider().getDirectEditingInfo().setActive(true);
        
         //return newly created business object(s)
        WebsiteModelUtil.INSTANCE.addWidget(newState);
        return new Object[] { newState };
    }

}
