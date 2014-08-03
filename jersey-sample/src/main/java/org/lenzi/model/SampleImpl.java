/**
 * 
 */
package org.lenzi.model;

import org.lenzi.service.jersey.SampleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author sal
 *
 */
@Component
public class SampleImpl implements Sample {

	private Logger logger = LoggerFactory.getLogger(SampleService.class);

	/**
	 * 
	 */
	public SampleImpl() {
		logger.debug(SampleImpl.class.getName() + " instance created");
	}

	@Override
	public String hello() {
		return "Hello Jersey + Spring";
	}
	
}
