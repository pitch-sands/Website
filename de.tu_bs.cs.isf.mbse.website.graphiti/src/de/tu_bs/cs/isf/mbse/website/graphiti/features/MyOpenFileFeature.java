package de.tu_bs.cs.isf.mbse.website.graphiti.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;

import de.tu_bs.cs.isf.mbse.website.ImageBox;

public class MyOpenFileFeature extends AbstractCustomFeature {

    private boolean hasDoneChanges = false;
    
    public MyOpenFileFeature(IFeatureProvider fp) {
    	super(fp);
    }
    @Override
    public String getName() {
        return "Open File";
    }
 
    @Override
    public String getDescription() {
        return "Input the Image Path";
    }
    
 
    @Override
    public boolean canExecute(ICustomContext context) {
        // allow rename if exactly one pictogram element
        // representing a EClass is selected
        boolean ret = false;
        PictogramElement[] pes = context.getPictogramElements();
        if (pes != null && pes.length == 1) {
            Object bo = getBusinessObjectForPictogramElement(pes[0]);
            if (bo instanceof ImageBox) {
                ret = true;
            }
        }
        return ret;
    }
 
    @Override
    public void execute(ICustomContext context) { 	
  	
    	// Ask for the file to open
    	FileDialog dialog = new FileDialog(Display.getCurrent().getActiveShell(), SWT.OPEN);
    	dialog.setFilterExtensions(new String[] { "*.jpg", "*.*" }); //$NON-NLS-1$ //$NON-NLS-2$
    	dialog.setFilterIndex(0);
    	dialog.setText("Open an Image");
    	String fileName = dialog.open();
    	String newRoute = fileName;
    	PictogramElement[] pes = context.getPictogramElements();
    	if (pes != null && pes.length == 1) {    
    		Object bo = getBusinessObjectForPictogramElement(pes[0]);
    		if (bo instanceof ImageBox) {
    			ImageBox eClass = (ImageBox) bo;
    			String currentRoute = eClass.getSource();
    			if (newRoute != null && !newRoute.equals(currentRoute)) {
    				this.hasDoneChanges = true;
    				eClass.setSource(newRoute);
    				updatePictogramElement(pes[0]);
    			}
    		}
    	}     
    }
 
    @Override
    public boolean hasDoneChanges() {
    	return this.hasDoneChanges;
    }
    
    @Override
    public boolean isAvailable(IContext context) {
    	return true;
    }
    
}
