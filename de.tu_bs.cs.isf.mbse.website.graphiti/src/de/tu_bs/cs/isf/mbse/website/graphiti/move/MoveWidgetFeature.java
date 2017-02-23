package de.tu_bs.cs.isf.mbse.website.graphiti.move;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IDirectEditingContext;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.DefaultMoveShapeFeature;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;

import de.tu_bs.cs.isf.mbse.website.Widget;
import de.tu_bs.cs.isf.mbse.website.TextBox;
import de.tu_bs.cs.isf.mbse.website.Widget;
import de.tu_bs.cs.isf.mbse.website.graphiti.model.WebsiteModelUtil;

public class MoveWidgetFeature extends DefaultMoveShapeFeature{
	public MoveWidgetFeature(IFeatureProvider fp) {
        super(fp);
    }
 
	protected boolean avoidNegativeCoordinates() {
		return true;
	}
	
    @Override
    public boolean canMoveShape(IMoveShapeContext context) {
        boolean canMove = super.canMoveShape(context);        
        
        GraphicsAlgorithm thisGa = context.getShape().getGraphicsAlgorithm();
        
        // perform further check only if move allowed by default feature
        if (canMove) {
            Shape shape = context.getShape();
            Object bo = getBusinessObjectForPictogramElement(shape);
          if(bo instanceof Widget){
        	  canMove = true;
          }
        }
        
    	for(Shape shape_1 : context.getTargetContainer().getChildren()){
    		if (shape_1 instanceof ContainerShape && ! shape_1.equals(context.getShape())){
    			GraphicsAlgorithm ga = shape_1.getGraphicsAlgorithm();
    			
    			int x = ga.getX();
    			int x_1 = ga.getX() + ga.getWidth();
    			int y = ga.getY();
    			int y_1 = ga.getY() + ga.getHeight();
    			
    			System.out.println("x-coordinate:"+context.getX());
    			if( (context.getX()-50) % 150 != 0 || (context.getY()-50) % 100 != 0){
    				canMove = false;
    			}
    			if((context.getX() + thisGa.getWidth()) > x &&
    				context.getX() <x_1 && (context.getY() + thisGa.getHeight()) 
    				> y && context.getY() <y_1 ){
    				
    					canMove = false;
    				}
    			
    		}
    	}
          
        
        return canMove;
    }
    
    
    @Override
    public void postMoveShape(IMoveShapeContext context) {
        String businessName = null;
        PictogramElement pictogramElement = context.getPictogramElement();
        Object bo = getBusinessObjectForPictogramElement(pictogramElement);
        if (bo instanceof Widget) {
        	Widget eClass = (Widget) bo;
        	
        	eClass.setRow(context.getY());
        	eClass.setColumn(context.getX());
            WebsiteModelUtil.INSTANCE.updateWidget();
        }
        
    	
    	}
 }

