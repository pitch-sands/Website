package de.tu_bs.cs.isf.mbse.website.graphiti.directediting;


import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IDirectEditingContext;
import org.eclipse.graphiti.features.impl.AbstractDirectEditingFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;

import de.tu_bs.cs.isf.mbse.website.TextBox;



public class DirectEditingTextBoxFeature extends
	AbstractDirectEditingFeature {
	 
	public DirectEditingTextBoxFeature(IFeatureProvider fp) {
	        super(fp);
	    }
	
	public int getEditingType() {
        // there are several possible editor-types supported:
        // text-field, checkbox, color-chooser, combobox, ...
        return TYPE_TEXT;
    }
	
	@Override
    public boolean canDirectEdit(IDirectEditingContext context) {
		
        PictogramElement pe = context.getPictogramElement();
        Object bo = getBusinessObjectForPictogramElement(pe);
        GraphicsAlgorithm ga = context.getGraphicsAlgorithm();
        // support direct editing, if it is a EClass, and the user clicked
        // directly on the text and not somewhere else in the rectangle
        if (bo instanceof TextBox && ga instanceof Text) {
            return true;
        }
        // direct editing not supported in all other cases
        return false;
    }
	
	public String getInitialValue(IDirectEditingContext context) {
        // return the current name of the EClass
        PictogramElement pe = context.getPictogramElement();
        TextBox eClass = (TextBox) getBusinessObjectForPictogramElement(pe);
        return eClass.getContent();
    }
 
    @Override
    public String checkValueValid(String value, IDirectEditingContext context) {
        if (value.length() < 1)
            return "Please enter any text as content.";
       // if (value.contains(" "))
          //  return "Spaces are not allowed in class names.";
        //if (value.contains("\n"))
            //return "Line breakes are not allowed in class names.";
        System.out.println(value+"checkedValue");
        // null means, that the value is valid
        return null;
    }
    
    public void setValue(String value, IDirectEditingContext context) {
        // set the new name for the EClass
    	
        PictogramElement pe = context.getPictogramElement();
        TextBox eClass = (TextBox) getBusinessObjectForPictogramElement(pe);
        eClass.setContent(value);
        
        System.out.println("SetValue:"+value);
        System.out.println("eClass.getContent():"+eClass.getContent());
 
        // Explicitly update the shape to display the new value in the diagram
        // Note, that this might not be necessary in future versions of Graphiti
        // (currently in discussion)
 
        // we know, that pe is the Shape of the Text, so its container is the
        // main shape of the EClass
        updatePictogramElement(((Shape) pe).getContainer());
    }
}


