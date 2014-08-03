/**
 * 
 */
package org.lenzi.service.jersey;

import java.util.Set;

import org.glassfish.jersey.server.ResourceConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author sal
 *
 * Jersey application configuration.
 */
public class MyApplication extends ResourceConfig {

	private Logger logger = LoggerFactory.getLogger(SampleService.class);
	
	/**
	 * 
	 */
	public MyApplication() {
		
		logger.info("Registering Spring resource " + SampleService.class.getName() + " with Jersey.");
		
		register(SampleService.class);
	}

	/**
	 * @param classes
	 */
	public MyApplication(Set<Class<?>> classes) {
		super(classes);
	}

	/**
	 * @param classes
	 */
	public MyApplication(Class<?>... classes) {
		super(classes);
	}

	/**
	 * @param original
	 */
	public MyApplication(ResourceConfig original) {
		super(original);
	}

}
