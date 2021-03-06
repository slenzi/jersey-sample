/**
 * 
 */
package org.lenzi.service.jersey;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.lenzi.model.Sample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sal
 *
 * Spring managed JAX-RS resource.
 */
@Singleton
@Path("/sample")
@Service
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
	 * @return sample hello message
	 */
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getHelloMsg() {
		logger.debug("SampleService getHelloMsg called. Have sample = " + ((sample != null) ? true : false));
		return sample.hello();
	}
	
	/**
	 * @return Number of samples in our sample object.
	 */
	@GET
	@Path("/count")
	@Produces(MediaType.TEXT_PLAIN)
	public String getSampleCount(){
		return String.valueOf(sample.getSamples().size());
	}
	
	/**
	 * @param id the sample id
	 * @return the sample with the specified id.
	 */
	@GET
	@Path("{sid}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getSample(@PathParam("sid") String id) {
		return sample.getSample(id);
	}
	
	/**
	 * Fetch sample, test JSON marshalling.
	 * 
	 * @return Sample object in JSON format.
	 */
	@GET
	@Path("/samplejson")
	@Produces(MediaType.APPLICATION_JSON)
	public Sample getSampleJson() {
		return sample;
	}	

}
