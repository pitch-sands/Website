package de.tu_bs.cs.isf.mbse.website.graphiti.add;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;

import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.BoxRelativeAnchor;


import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;

import org.eclipse.graphiti.services.ICreateService;

import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;

import de.tu_bs.cs.isf.mbse.website.graphiti.model.WebsiteModelUtil;
import de.tu_bs.cs.isf.mbse.website.ButtonBox;
import de.tu_bs.cs.isf.mbse.website.ImageBox;

public class AddImageBoxFeature extends AbstractAddFeature {

	private static final IColorConstant STATE_TEXT_FOREGROUND = IColorConstant.BLACK;
	private static final IColorConstant STATE_FOREGROUND = new ColorConstant(98,131,167);
	private static final IColorConstant STATE_BACKGROUND = new ColorConstant(187,218,247); 
	
	
	public AddImageBoxFeature(IFeatureProvider fp){
		super(fp);
	}
	
	@Override
	public boolean canAdd(IAddContext context) {
		// TODO Auto-generated method stub
		//return false;

		if (context.getNewObject() instanceof ImageBox) {
			return true;
		}
		return false;
		
		
		


	}

	@Override
	public PictogramElement add(IAddContext context) {
		// TODO Auto-generated method stub
		//return null
		ImageBox addedImage = (ImageBox) context.getNewObject();
		Diagram targetDiagram = (Diagram) context.getTargetContainer();
		

		// Get the piece to add
		ImageBox imagebox = (ImageBox) context.getNewObject();
		
		//Container shape with rounded rectangle
		ICreateService createService = Graphiti.getCreateService();

		//Container shape with rounded rectangle

		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		ContainerShape containerShape = 
					peCreateService.createContainerShape(targetDiagram, true);
		
		//define a default size for the shape
		int width = 100;
		int height = 50;
		IGaService gaService = Graphiti.getGaService();
		RoundedRectangle roundedRectangle;
		

		{
			// create and set graphics algorithm
			roundedRectangle = gaService.createRoundedRectangle(containerShape, 5, 5);
			roundedRectangle.setForeground(manageColor(STATE_FOREGROUND));
			roundedRectangle.setBackground(manageColor(STATE_BACKGROUND));
			roundedRectangle.setLineWidth(2);
			gaService.setLocationAndSize(roundedRectangle, 
					context.getX(), context.getY(), width, height);
			
			link(containerShape, addedImage);
		}

		// SHAPE WITH TEXT
		{
			// create shape for text
			Shape shape = peCreateService.createShape(containerShape, false);

			// create and set text graphics algorithm
			Text text = gaService.createText(shape, addedImage.getName());
			text.setForeground(manageColor(STATE_TEXT_FOREGROUND));
			text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER ); 
			// vertical alignment has as default value "center"
			text.setFont(gaService.manageDefaultFont(getDiagram(), false, true));
			gaService.setLocationAndSize(text, 0, 0, width, 40);

			// create link and wire it
			link(shape, addedImage);
			

			peCreateService.createChopboxAnchor(shape);
			BoxRelativeAnchor relativeAnchor = peCreateService.createBoxRelativeAnchor(shape);
			relativeAnchor.setRelativeHeight(0.5d);
			relativeAnchor.setRelativeWidth(0.5d);
			relativeAnchor.setReferencedGraphicsAlgorithm(roundedRectangle);
			relativeAnchor.setUseAnchorLocationAsConnectionEndpoint(true);
			Ellipse anchorEllipse = createService.createEllipse(relativeAnchor);
			gaService.setLocationAndSize(anchorEllipse, 25, 25, 0, 0);
			
		}
		


			
		


		return containerShape;
	}
}

