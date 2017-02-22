package de.tu_bs.cs.isf.mbse.website.graphiti;

import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;



public class WebsiteDiagramTypeProvider extends AbstractDiagramTypeProvider implements IDiagramTypeProvider {

	public WebsiteDiagramTypeProvider() {
		super();
		setFeatureProvider(new WebsiteFeatureProvider(this));
	}

}
