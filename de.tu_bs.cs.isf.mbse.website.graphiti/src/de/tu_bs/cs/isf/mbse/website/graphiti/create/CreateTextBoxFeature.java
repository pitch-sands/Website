package de.tu_bs.cs.isf.mbse.website.graphiti.create;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;

import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;


import de.tu_bs.cs.isf.mbse.website.TextBox;
import de.tu_bs.cs.isf.mbse.website.WebsiteFactory;
import de.tu_bs.cs.isf.mbse.website.graphiti.model.WebsiteModelUtil;

public class CreateTextBoxFeature extends AbstractCreateFeature {

    public CreateTextBoxFeature(IFeatureProvider fp) {
        // set name and description of the creation feature
        super(fp, "TextBox", "Create TextBox");
    }
 
    public boolean canCreate(ICreateContext context) {
        return context.getTargetContainer() instanceof Diagram;
    }
 
  
    public Object[] create(ICreateContext context) {
    	TextBox newState= WebsiteFactory.eINSTANCE.createTextBox();
        
        newState.setContent("Write your content here.");
        getDiagram().eResource().getContents().add(newState);
        
        
 
        // do the add
        addGraphicalRepresentation(context, newState);
        getFeatureProvider().getDirectEditingInfo().setActive(true);
        
         //return newly created business object(s)
        WebsiteModelUtil.INSTANCE.addWidget(newState);
        return new Object[] { newState };
    }
}
