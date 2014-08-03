/**
 * 
 */
package org.lenzi.service.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.lenzi.model.Sample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author sal
 *
 * Spring managed JAX-RS resource.
 */
@Component
@Path("/sample")
public class SampleService {

	private Logger logger = LoggerFactory.getLogger(SampleService.class);
	
	@Autowired
	Sample sample = null;
	
	public SampleService() {
		super();
		logger.debug(SampleService.class.getName() + " instance created.");
		logger.debug("Have sample bean: " + ((sample != null) ? true : false));
	}

	/**
	 * @return 
	 */
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getHelloMsg() {
		logger.debug("SampleService getHelloMsg called.");
		return sample.hello();
	}

}
