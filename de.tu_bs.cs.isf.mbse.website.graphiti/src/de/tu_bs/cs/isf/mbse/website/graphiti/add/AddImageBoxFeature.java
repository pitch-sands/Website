package de.tu_bs.cs.isf.mbse.website.graphiti.add;

import de.tu_bs.cs.isf.mbse.website.Square;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.AnchorContainer;
import org.eclipse.graphiti.mm.pictograms.BoxRelativeAnchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;

import org.eclipse.graphiti.services.ICreateService;
import org.eclipse.graphiti.services.IGaLayoutService;

import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;

import de.tu_bs.cs.isf.mbse.website.graphiti.model.WebsiteModelUtil;
import de.tu_bs.cs.isf.mbse.website.Color;
import de.tu_bs.cs.isf.mbse.website.ImageBox;
import de.tu_bs.cs.isf.mbse.website.TextBox;

public class AddImageBoxFeature extends AbstractAddFeature {

	private static final IColorConstant STATE_TEXT_FOREGROUND = IColorConstant.ORANGE;
	private static final IColorConstant STATE_FOREGROUND = new ColorConstant(98,131,167);
	private static final IColorConstant STATE_BACKGROUND = new ColorConstant(187,218,247); 

	private static final int FRAME_WIDTH = 20;
	private static final int FRAME_HEIGHT = 20;
	
	public AddImageBoxFeature(IFeatureProvider fp){
		super(fp);
	}
	
	@Override
	public boolean canAdd(IAddContext context) {
		if (context.getNewObject() instanceof ImageBox) {
			if (context.getTargetContainer() instanceof ContainerShape) {	
				return true;
			}
		}
		return false;

	}

	@Override
	public PictogramElement add(IAddContext context) {

		
		// Get the image to add
		ImageBox addedImage = (ImageBox) context.getNewObject();
		ContainerShape targetDiagram = (ContainerShape) context.getTargetContainer();

		//Container shape with rounded rectangle
		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		IGaLayoutService layoutService = Graphiti.getGaLayoutService();
		ContainerShape containerShape = 
					peCreateService.createContainerShape(targetDiagram, true);
		
		//define a default size for the shape
		int width = 100;
		int height = 100;
		
		IGaService gaService = Graphiti.getGaService();
		RoundedRectangle roundedRectangle;
		
		{

			// create and set graphics algorithm
			roundedRectangle = gaService.createRoundedRectangle(containerShape,5,5);
			roundedRectangle.setForeground(manageColor(STATE_FOREGROUND));
			roundedRectangle.setBackground(manageColor(STATE_BACKGROUND));
			roundedRectangle.setLineWidth(2);
			/*
			gaService.setLocationAndSize(roundedRectangle, 
					targetSquare.getOffsetX() * width, 
					targetSquare.getOffsetY()* height, width, height);
					*/
			gaService.setLocationAndSize(roundedRectangle, 
					0, 0, width, height);
			System.out.println("rectangle x: "+roundedRectangle.getX()+" and y" + roundedRectangle.getY());
			link(containerShape, addedImage);
		}

		// SHAPE WITH TEXT
	
		
		// create shape for text
		Shape shape = peCreateService.createShape(containerShape, false);

		// create and set text graphics algorithm
		Text text = gaService.createText(shape, addedImage.getName());
		text.setForeground(manageColor(STATE_TEXT_FOREGROUND));
		text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER ); 
		// vertical alignment has as default value "center"
		text.setFont(gaService.manageDefaultFont(getDiagram(), false, true));
		layoutService.setLocationAndSize(text, 0, 0, width, 20);


		// create link and wire it
		link(shape, addedImage);
		
		/*
		createService.createChopboxAnchor(containerShape);
		BoxRelativeAnchor relativeAnchor = peCreateService.createBoxRelativeAnchor(containerShape);
		relativeAnchor.setRelativeHeight(0.5d);
		relativeAnchor.setRelativeWidth(0.5d);
		relativeAnchor.setReferencedGraphicsAlgorithm(roundedRectangle);
		relativeAnchor.setUseAnchorLocationAsConnectionEndpoint(true);
		Ellipse anchorEllipse = createService.createEllipse(relativeAnchor);
		gaService.setLocationAndSize(anchorEllipse, 25, 25, 0, 0);
		*/
		
		if (addedImage.eResource() == null) {
			WebsiteModelUtil.INSTANCE.addWidget(addedImage);
		}
		// add a chopbox anchor to the shape 
        peCreateService.createChopboxAnchor(containerShape);
  
        // call the layout feature
        layoutPictogramElement(containerShape);
			
		

		return containerShape;
	}
	
}

