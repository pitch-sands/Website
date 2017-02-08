package de.tu_bs.cs.isf.mbse.website.graphiti.features;


import org.eclipse.graphiti.ui.platform.AbstractImageProvider;

public class MyImageProvider extends AbstractImageProvider {
 
    // The prefix for all identifiers of this image provider
    protected static final String PREFIX = 
              "de.tu_bs.cs.isf.mbse.webseite.graphiti.";
 
    // The image identifier for an EReference.
    public static final String IMG_EREFERENCE= PREFIX + "ereference";
 
    @Override
    protected void addAvailableImages() {
        // register the path for each image identifier
        addImageFilePath(IMG_EREFERENCE, "/icons/folder.gif");
        System.out.println(IMG_EREFERENCE);
    }
}