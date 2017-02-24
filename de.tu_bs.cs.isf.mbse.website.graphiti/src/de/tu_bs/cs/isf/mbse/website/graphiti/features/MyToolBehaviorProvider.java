package de.tu_bs.cs.isf.mbse.website.graphiti.features;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.context.IPictogramElementContext;
import org.eclipse.graphiti.features.context.impl.CustomContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.tb.ContextButtonEntry;
import org.eclipse.graphiti.tb.DefaultToolBehaviorProvider;
import org.eclipse.graphiti.tb.IContextButtonPadData;


import de.tu_bs.cs.isf.mbse.website.graphiti.features.MyImageProvider;
import de.tu_bs.cs.isf.mbse.website.graphiti.features.MyOpenFileFeature;

public class MyToolBehaviorProvider extends DefaultToolBehaviorProvider{

    public MyToolBehaviorProvider(IDiagramTypeProvider dtp) {
        super(dtp);
    }
    @Override
    public IContextButtonPadData getContextButtonPad(
                                       IPictogramElementContext context) {
        IContextButtonPadData data = super.getContextButtonPad(context);

        PictogramElement pe = context.getPictogramElement();
     
        // 1. set the generic context buttons
        // note, that we do not add 'remove' (just as an example)
        setGenericContextButtons(data, pe, CONTEXT_BUTTON_DELETE | 
                                                   CONTEXT_BUTTON_UPDATE);
        
        // 2. set the collapse button 
        // simply use a dummy custom feature (senseless example)
      
        // 3. add one domain specific context-button, which offers all 
        // available connection-features as drag&drop features...
     
        // 3.a. create new CreateConnectionContext
        
        // 3.b. create context button and add all applicable features
        CustomContext cc = new CustomContext(new PictogramElement[] { pe });
        ICustomFeature[] cf = getFeatureProvider().getCustomFeatures(cc);
        ICustomFeature fileFeature = cf[1];
       
        ContextButtonEntry button = new ContextButtonEntry(fileFeature, cc);
      	for (int i = 0; i < cf.length; i++) {
       		ICustomFeature iCustomFeature = cf[i];
       		if (iCustomFeature instanceof MyOpenFileFeature) {
       			button.setText("Open Image File");
       			button.setIconId(MyImageProvider.IMG_EREFERENCE);
       			button.canExecute();
       			data.getDomainSpecificContextButtons().add(button);        		
       		}
      	}
        
        // 3.c. add context button, if it contains at least one feature
       
        if (button.getDragAndDropFeatures().size() > 0) {
        		data.getDomainSpecificContextButtons().add(button); 
        }     
      

    	return data;
    }
}