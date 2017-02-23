package de.tu_bs.cs.isf.mbse.website.graphiti;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;

import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IDirectEditingFeature;
import org.eclipse.graphiti.features.IMoveShapeFeature;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.IDirectEditingContext;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.ui.features.DefaultFeatureProvider;

import de.tu_bs.cs.isf.mbse.website.graphiti.features.MyLayoutDiagramFeature;
import de.tu_bs.cs.isf.mbse.website.graphiti.features.MyOpenFileFeature;
import de.tu_bs.cs.isf.mbse.website.graphiti.features.MyRenameEClassFeature;

import de.tu_bs.cs.isf.mbse.website.graphiti.create.CreateBoardFeature;
import de.tu_bs.cs.isf.mbse.website.Board;
import de.tu_bs.cs.isf.mbse.website.graphiti.add.AddBoardFeature;
import de.tu_bs.cs.isf.mbse.website.ButtonBox;
import de.tu_bs.cs.isf.mbse.website.ImageBox;
import de.tu_bs.cs.isf.mbse.website.SearchBox;
import de.tu_bs.cs.isf.mbse.website.TextBox;
import de.tu_bs.cs.isf.mbse.website.Widget;
import de.tu_bs.cs.isf.mbse.website.graphiti.add.AddButtonBoxFeature;
import de.tu_bs.cs.isf.mbse.website.graphiti.add.AddImageBoxFeature;
import de.tu_bs.cs.isf.mbse.website.graphiti.add.AddSearchBoxFeature;
import de.tu_bs.cs.isf.mbse.website.graphiti.add.AddTextBoxFeature;
import de.tu_bs.cs.isf.mbse.website.graphiti.create.CreateButtonBoxFeature;
import de.tu_bs.cs.isf.mbse.website.graphiti.create.CreateImageBoxFeature;
import de.tu_bs.cs.isf.mbse.website.graphiti.create.CreateSearchBoxFeature;
import de.tu_bs.cs.isf.mbse.website.graphiti.create.CreateTextBoxFeature;
import de.tu_bs.cs.isf.mbse.website.graphiti.directediting.DirectEditingTextBoxFeature;
import de.tu_bs.cs.isf.mbse.website.graphiti.update.UpdateImageBoxFeature;
import de.tu_bs.cs.isf.mbse.website.graphiti.update.UpdateTextBoxFeature;

public class WebsiteFeatureProvider extends DefaultFeatureProvider {

	public WebsiteFeatureProvider(IDiagramTypeProvider dtp) {
		super(dtp);
	}
	
	@Override
	public IAddFeature getAddFeature(IAddContext context) {
		if(context.getNewObject() instanceof TextBox) {
			return new AddTextBoxFeature(this);
		}
		else if (context.getNewObject() instanceof SearchBox) {
			return new AddSearchBoxFeature(this);
		}
		else if (context.getNewObject() instanceof ButtonBox) {
			return new AddButtonBoxFeature(this);
		}
		else if (context.getNewObject() instanceof ImageBox) {
			return new AddImageBoxFeature(this);
		}
		else if (context.getNewObject() instanceof Board) {
			return new AddBoardFeature(this);
		}
		return super.getAddFeature(context);
	}


	public ICreateFeature[] getCreateFeatures() {
		
		return new ICreateFeature[] { new CreateTextBoxFeature(this),
				new CreateSearchBoxFeature(this),
				new CreateButtonBoxFeature(this),
				new CreateImageBoxFeature(this),new CreateBoardFeature(this)};
		
	}
	

	//@Override
	//public ICreateConnectionFeature[] getCreateConnectionFeatures() {
	//	return new ICreateConnectionFeature[] { new CreateTransitionFeature (this) };
	//}
	
	public IDirectEditingFeature getDirectEditingFeature(
		    IDirectEditingContext context) {
		    PictogramElement pe = context.getPictogramElement();
		    Object bo = getBusinessObjectForPictogramElement(pe);
		    if (bo instanceof TextBox) {
		        return new DirectEditingTextBoxFeature(this);
		    }
		    return super.getDirectEditingFeature(context);
		}
	
	@Override
	public IUpdateFeature getUpdateFeature(IUpdateContext context) {
	   PictogramElement pictogramElement = context.getPictogramElement();
	   if (pictogramElement instanceof ContainerShape) {
	       Object bo = getBusinessObjectForPictogramElement(pictogramElement);
	       if (bo instanceof TextBox) {
	           return new UpdateTextBoxFeature(this);
	       }
	       if (bo instanceof ImageBox) {
	           return new UpdateImageBoxFeature(this);
	       }
	   }
	   return super.getUpdateFeature(context);
	}
	
	@Override
	public ICustomFeature[] getCustomFeatures(ICustomContext context) {
	    return new ICustomFeature[] { new MyRenameEClassFeature(this),
	    							  new MyOpenFileFeature(this),
	    							  new MyLayoutDiagramFeature(this)};
	}
	
	//@Override
	//public IMoveShapeFeature getMoveShapeFeature(IMoveShapeContext context) {
	 //   Shape shape = context.getShape();
	//    Object bo = getBusinessObjectForPictogramElement(shape);
	//    if (bo instanceof Widget) {
	//        return new MoveWidgetFeature(this);
	  //  }
	  //  return super.getMoveShapeFeature(context);
	//}

}
