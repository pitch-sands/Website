package de.tu_bs.cs.isf.mbse.website.graphiti.add;

import org.eclipse.graphiti.features.IDirectEditingInfo;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;


import de.tu_bs.cs.isf.mbse.website.TextBox;
import de.tu_bs.cs.isf.mbse.website.graphiti.model.WebsiteModelUtil;

public class AddTextBoxFeature extends AbstractAddFeature {

	private static final IColorConstant STATE_TEXT_FOREGROUND = IColorConstant.BLACK;
	private static final IColorConstant STATE_FOREGROUND = IColorConstant.GREEN;
	private static final IColorConstant STATE_BACKGROUND = IColorConstant.ORANGE;

	public AddTextBoxFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canAdd(IAddContext context) {
		return context.getNewObject() instanceof TextBox
				&& context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public PictogramElement add(IAddContext context) {
		TextBox addedState = (TextBox) context.getNewObject();
		Diagram targetDiagram = (Diagram) context.getTargetContainer();

		// CONTAINER SHAPE WITH ROUNDED RECTANGLE
		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		ContainerShape containerShape = 
				peCreateService.createContainerShape(targetDiagram, true);

		// define a default size for the shape
		int width = 100;
		int height = 50; 
		IGaService gaService = Graphiti.getGaService();
		RoundedRectangle roundedRectangle; // need to access it later

		{
			// create and set graphics algorithm
			roundedRectangle = gaService.createRoundedRectangle(containerShape, 5, 5);
			roundedRectangle.setForeground(manageColor(STATE_FOREGROUND));
			roundedRectangle.setBackground(manageColor(STATE_BACKGROUND));
			roundedRectangle.setLineWidth(2);
			gaService.setLocationAndSize(roundedRectangle, 
					context.getX(), context.getY(), width, height);
			
			
			link(containerShape, addedState);
		}

		// SHAPE WITH TEXT
		{
			// create shape for text
			Shape shape = peCreateService.createShape(containerShape, true);

			// create and set text graphics algorithm
			Text text = gaService.createText(shape,addedState.getContent());
			System.out.println("addedState.getName:"+ addedState.getName());
			//addedState.getName()
			text.setForeground(manageColor(STATE_TEXT_FOREGROUND));
			text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER ); 
			// vertical alignment has as default value "center"
			text.setFont(gaService.manageDefaultFont(getDiagram(), false, true));
			gaService.setLocationAndSize(text, 0, 0, width, 20);

			// create link and wire it
			link(shape, addedState);
			
			// provide information to support direct-editing directly 
	        // after object creation (must be activated additionally)
	        IDirectEditingInfo directEditingInfo =
	            getFeatureProvider().getDirectEditingInfo();
	        // set container shape for direct editing after object creation
	        directEditingInfo.setMainPictogramElement(containerShape);
	        // set shape and graphics algorithm where the editor for
	        // direct editing shall be opened after object creation
	        directEditingInfo.setPictogramElement(shape);
	        directEditingInfo.setGraphicsAlgorithm(text);
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
