/**
 * 
 */
package org.lenzi.model;

import java.io.Serializable;

/**
 * @author eDoggie
 *
 */
public class SampleImpl implements Sample, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 484949419551840372L;

	/**
	 * 
	 */
	public SampleImpl() {

	}

	/* (non-Javadoc)
	 * @see org.lenzi.model.Sample#hello()
	 */
	@Override
	public String hello() {
		
		return "Hello Jersey + Spring sample!";
		
	}

}
