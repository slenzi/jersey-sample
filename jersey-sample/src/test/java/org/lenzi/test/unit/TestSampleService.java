package org.lenzi.test.unit;

import com.sun.jersey.test.framework.AppDescriptor;
import com.sun.jersey.test.framework.JerseyTest;
import com.sun.jersey.test.framework.spi.container.TestContainerException;
import com.sun.jersey.test.framework.spi.container.TestContainerFactory;

public class TestSampleService extends JerseyTest {

	public TestSampleService() throws TestContainerException {
		// TODO Auto-generated constructor stub
	}

	public TestSampleService(TestContainerFactory testContainerFactory) {
		super(testContainerFactory);
		// TODO Auto-generated constructor stub
	}

	public TestSampleService(AppDescriptor ad) throws TestContainerException {
		super(ad);
		// TODO Auto-generated constructor stub
	}

	public TestSampleService(String... packages) throws TestContainerException {
		super(packages);
		// TODO Auto-generated constructor stub
	}

}
