package de.tu_bs.cs.isf.mbse.website.graphiti.model;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;


import de.tu_bs.cs.isf.mbse.website.Website;
import de.tu_bs.cs.isf.mbse.website.WebsiteFactory;
import de.tu_bs.cs.isf.mbse.website.Widget;

public class WebsiteModelUtil {
	public ResourceSet rs = new ResourceSetImpl();
	public Resource r;

	// FIXME: DO NOT HARD-CODE THIS!
	private final String PATH = "/Users/cwp/Desktop/ws3.website";
	
	public static WebsiteModelUtil INSTANCE = new WebsiteModelUtil();
	
	private WebsiteModelUtil() {
		if(new File(PATH).exists()) {
			r = rs.getResource(URI.createFileURI(PATH), true);
		} else {
			r = rs.createResource(URI.createFileURI(PATH));
		}
		r.getContents().add(WebsiteFactory.eINSTANCE.createWebsite());
	}
	
	public void removeWidget(WebsiteModelUtil s) {
		((Website) r.getContents().get(0)).getWidgets().remove(s);
		save();
	}
	
	//..
	public void addWidget(Widget s) {
		((Website) r.getContents().get(0)).getWidgets().add(s);
		save();
	}

	private void save() {
		try {
			r.save(Collections.emptyMap());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}