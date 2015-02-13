package org.lenzi.test.unit;

import static org.junit.Assert.*;

import javax.ws.rs.core.Application;

import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Test our spring managed service bean.
 * 
 * @see https://github.com/jersey/jersey/tree/2.16/examples/helloworld-spring-annotations
 * 
 * @author sal
 *
 */
public class TestSampleService extends JerseyTest {

	public TestSampleService() { }

	/* (non-Javadoc)
	 * @see org.glassfish.jersey.test.JerseyTest#configure()
	 */
	@Override
	protected Application configure() {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringAnnotationConfig.class);
		return new JerseyConfig().property("contextConfig", context);		
		/*
		final MyApplication application = new MyApplication();
        application.property(ServletProperties.FILTER_FORWARD_ON_404, true);		
		return application;
		*/
	}
	
	@Test
	public void test(){
		
		String response = target("sample").request().get(String.class);
		assertNotNull("",response);
		
		System.out.println("Response = " + response);
		
		assertEquals("Hello Jersey + Spring", response);
		
		System.out.println("Test Complete");
	}
	
}
