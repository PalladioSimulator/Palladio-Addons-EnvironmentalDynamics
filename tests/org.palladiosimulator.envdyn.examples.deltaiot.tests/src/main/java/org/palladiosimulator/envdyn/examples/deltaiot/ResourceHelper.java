package org.palladiosimulator.envdyn.examples.deltaiot;

import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

public class ResourceHelper {

    public URI getTransaformationUri(String resourceName) throws URISyntaxException {
        return getResourceUri("reconfigurations/" + resourceName);
    }

    public URI getResourceUri(String resourceName) throws URISyntaxException {
        ClassLoader classLoader = getClass().getClassLoader();
        String resourcePath = getClass().getPackageName()
            .replace(".", "/") + "/" + resourceName;
        URL resourceURL = classLoader.getResource(resourcePath);
        java.net.URI javaURI = resourceURL.toURI(); // Java URI
        URI systemURI = URI.createURI(javaURI.toString()); // EMF URI
        return systemURI;
    }

    public Resource loadResource(ResourceSet rs, URI uri) {
        Resource resource = rs.getResource(uri, true);
        if (resource == null) {
            throw new RuntimeException("unable to load: " + uri);
        }
        return resource;
    }

}
