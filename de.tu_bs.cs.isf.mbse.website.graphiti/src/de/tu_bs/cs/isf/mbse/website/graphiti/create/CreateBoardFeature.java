package de.tu_bs.cs.isf.mbse.website.graphiti.create;

import org.eclipse.emf.ecore.resource.Resource;
import de.tu_bs.cs.isf.mbse.website.Board;
import de.tu_bs.cs.isf.mbse.website.ImageBox;
import de.tu_bs.cs.isf.mbse.website.WebsiteFactory;
import de.tu_bs.cs.isf.mbse.website.graphiti.model.WebsiteModelUtil;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;


public class CreateBoardFeature extends AbstractCreateFeature {

	public CreateBoardFeature(IFeatureProvider fp) {
		super(fp, "Board", "Create Board");
	}

	public boolean canCreate(ICreateContext context) {
		if (context.getTargetContainer() instanceof Diagram) {
			// Add new board only in case of an empty diagram
			return context.getTargetContainer().getChildren().size() == 0;
		}
		return false;
	}

	@Override
	public Object[] create(ICreateContext context) {
		Resource resource = context.getTargetContainer().eResource();

		// Create a new chess board and add it to an EMF resource
	    Board board = WebsiteFactory.eINSTANCE.createBoard();
		resource.getContents().add(board);

		// Delegate to the add feature
		addGraphicalRepresentation(context, board);
		return new Object[] { board };
		
	}
}
