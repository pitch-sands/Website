package de.tu_bs.cs.isf.mbse.website.graphiti.add;


import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;

import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;

import de.tu_bs.cs.isf.mbse.website.SearchBox;
import de.tu_bs.cs.isf.mbse.website.TextBox;
import de.tu_bs.cs.isf.mbse.website.Widget;
import de.tu_bs.cs.isf.mbse.website.graphiti.model.WebsiteModelUtil;

public class AddSearchBoxFeature extends AbstractAddFeature {
	
	private static final IColorConstant STATE_TEXT_FOREGROUND = IColorConstant.BLACK;
	private static final IColorConstant STATE_FOREGROUND = IColorConstant.GREEN;
	private static final IColorConstant STATE_BACKGROUND = IColorConstant.YELLOW;
	
	public AddSearchBoxFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	@Override
	public boolean canAdd(IAddContext context) {
		if (context.getNewObject() instanceof SearchBox) {
			//Widget widget = (Widget)context.getNewObject();
			if (context.getTargetContainer() instanceof ContainerShape) {
				//System.out.println("square: "+widget.getSquare());
				// Add new board only in case of an empty diagram
				//return context.getTargetContainer().getChildren().size() == 0;
				return true;
			}
		}
		
		return false;
	}

	@Override
	public PictogramElement add(IAddContext context) {
		SearchBox addedState = (SearchBox) context.getNewObject();
		ContainerShape targetDiagram = (ContainerShape) context.getTargetContainer();

		// CONTAINER SHAPE WITH ROUNDED RECTANGLE
		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		ContainerShape containerShape = 
				peCreateService.createContainerShape(targetDiagram, true);

		// define a default size for the shape
		int width = 100;
		int height = 100; 
		IGaService gaService = Graphiti.getGaService();
		RoundedRectangle roundedRectangle; // need to access it later

		{
			// create and set graphics algorithm
			roundedRectangle = gaService.createRoundedRectangle(containerShape, 5, 5);
			roundedRectangle.setForeground(manageColor(STATE_FOREGROUND));
			roundedRectangle.setBackground(manageColor(STATE_BACKGROUND));
			roundedRectangle.setLineWidth(2);
			gaService.setLocationAndSize(roundedRectangle, 0, 0, width, height);
			
			link(containerShape, addedState);
		}

		
		
		if (addedState.eResource() == null) {
			WebsiteModelUtil.INSTANCE.addWidget(addedState);
		}
		
		// add a chopbox anchor to the shape 
        peCreateService.createChopboxAnchor(containerShape);
  
        // call the layout feature
        layoutPictogramElement(containerShape);

		return containerShape;
	}

}
