package de.tu_bs.cs.isf.mbse.website.graphiti;

import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.tb.IToolBehaviorProvider;

import de.tu_bs.cs.isf.mbse.website.graphiti.features.MyToolBehaviorProvider;



public class WebsiteDiagramTypeProvider extends AbstractDiagramTypeProvider implements IDiagramTypeProvider {

	private IToolBehaviorProvider[] toolBehaviorProviders;
	
	public WebsiteDiagramTypeProvider() {
		super();
		setFeatureProvider(new WebsiteFeatureProvider(this));
	}
	
	@Override
    public IToolBehaviorProvider[] getAvailableToolBehaviorProviders() {
        if (toolBehaviorProviders == null) {
            toolBehaviorProviders =
                new IToolBehaviorProvider[] { new MyToolBehaviorProvider(
                    this) };
        }
        return toolBehaviorProviders;
    }

}
