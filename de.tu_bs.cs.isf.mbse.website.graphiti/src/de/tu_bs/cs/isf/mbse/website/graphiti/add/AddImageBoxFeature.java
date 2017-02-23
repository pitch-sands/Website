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

import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.AnchorContainer;

import org.eclipse.graphiti.services.ICreateService;
import org.eclipse.graphiti.services.IGaLayoutService;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;

import de.tu_bs.cs.isf.mbse.website.graphiti.model.WebsiteModelUtil;
import de.tu_bs.cs.isf.mbse.website.ImageBox;
import de.tu_bs.cs.isf.mbse.website.TextBox;

public class AddImageBoxFeature extends AbstractAddFeature {

	private static final IColorConstant STATE_TEXT_FOREGROUND = IColorConstant.BLACK;
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
			if (context.getTargetContainer() instanceof Diagram == false) {
				System.out.println(context.getTargetContainer());
				System.out.println("lalatrue"+(context.getTargetContainer() instanceof Diagram) +"can add:"+ context.getTargetContainer().getChildren().size());
				// Add new board only in case of an empty diagram
				return context.getTargetContainer().getChildren().size() == 0;
			}
		}
		System.out.println("lalafalse"+(context.getTargetContainer() instanceof Diagram) +"can add:"+ context.getTargetContainer().getChildren().size());
		return false;
		
	}

	@Override
	public PictogramElement add(IAddContext context) {
		// Get the Graphiti services
		ICreateService createService = Graphiti.getCreateService();
		IGaLayoutService layoutService = Graphiti.getGaLayoutService();

		// The end square for the current move
		System.out.println(context.getTargetContainer().getAnchors());
		Square targetSquare = getSquare(context.getTargetContainer().getAnchors().get(0));

		System.out.println("look "+targetSquare.getRank().getValue()+" and " + targetSquare.getFile().getValue());
		
		// Get the piece to add
		ImageBox addedImage = (ImageBox) context.getNewObject();
		
		
		// Create the visualisation of the board as a square
		ContainerShape outerContainerShape = createService.createContainerShape(getDiagram(), true);
				
		//Container shape with rounded rectangle
		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		ContainerShape containerShape = 
					peCreateService.createContainerShape(outerContainerShape, true);
		
		//define a default size for the shape
		int width = 100;
		int height = 100;
		
		IGaService gaService = Graphiti.getGaService();
		RoundedRectangle roundedRectangle;
		
		// create and set graphics algorithm
		roundedRectangle = createService.createRoundedRectangle(containerShape,5,5);
		roundedRectangle.setForeground(manageColor(STATE_FOREGROUND));
		roundedRectangle.setBackground(manageColor(STATE_BACKGROUND));
		roundedRectangle.setLineWidth(2);
		layoutService.setLocationAndSize(roundedRectangle, 
				FRAME_WIDTH + targetSquare.getOffsetX() * width, 
				FRAME_HEIGHT + targetSquare.getOffsetY()* height, width, height);
		
		link(containerShape, addedImage);
	

		// SHAPE WITH TEXT
	
		// create shape for text
		Shape shape = peCreateService.createShape(containerShape, false);

		// create and set text graphics algorithm
		Text text = gaService.createText(shape, addedImage.getName());
		text.setForeground(manageColor(STATE_TEXT_FOREGROUND));
		text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER ); 
		// vertical alignment has as default value "center"
		text.setFont(gaService.manageDefaultFont(getDiagram(), false, true));
		layoutService.setLocationAndSize(text, 0, 0, width, 40);

		// create link and wire it
		link(shape, addedImage);
		
		createService.createChopboxAnchor(containerShape);
		BoxRelativeAnchor relativeAnchor = peCreateService.createBoxRelativeAnchor(containerShape);
		relativeAnchor.setRelativeHeight(0.5d);
		relativeAnchor.setRelativeWidth(0.5d);
		relativeAnchor.setReferencedGraphicsAlgorithm(roundedRectangle);
		relativeAnchor.setUseAnchorLocationAsConnectionEndpoint(true);
		Ellipse anchorEllipse = createService.createEllipse(relativeAnchor);
		gaService.setLocationAndSize(anchorEllipse, 25, 25, 0, 0);
			
		
		if (addedImage.eResource() == null) {
			WebsiteModelUtil.INSTANCE.addWidget(addedImage);
		}
		

		return containerShape;
	}
	
	private Square getSquare(Anchor anchor) {
		// Try to find a square for the given anchor
		if (anchor != null) {
			AnchorContainer parent = anchor.getParent();
			Object obj = getBusinessObjectForPictogramElement(parent);
			if (obj instanceof Square) {
				// The shape of the anchor represents a square
				return (Square) obj;
			} 
		}
		return null;
	}
}

