package de.tu_bs.cs.isf.mbse.website.graphiti.create;

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
        return context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public Object[] create(ICreateContext context) {
		// TODO Auto-generated method stub
		//return null;
		ImageBox newImage = WebsiteFactory.eINSTANCE.createImageBox();
		newImage.setName("Image");
		//newImage.setRoute("Input Route..");
		
		WebsiteModelUtil.INSTANCE.addWidget(newImage);
		//getDiagram().eResource().getContents().add(newImage);
		
		//do the add
		addGraphicalRepresentation(context, newImage);
		
		getFeatureProvider().getDirectEditingInfo().setActive(true);
		
		//return newly created business object
		return new Object[] { newImage };
	}

	
}
