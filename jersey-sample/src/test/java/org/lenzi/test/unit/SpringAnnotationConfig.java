package org.lenzi.test.unit;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @author sal
 *
 */
@Configuration
@ComponentScan(
		basePackages={
			"org.lenzi.model","org.lenzi.service.jersey"
		}
)
public class SpringAnnotationConfig {


}
