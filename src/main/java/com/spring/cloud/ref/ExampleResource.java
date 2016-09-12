package com.spring.cloud.ref;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("example")
public class ExampleResource {
	@Autowired
	private Environment environment;
	
	@RequestMapping(method = RequestMethod.GET)
	
	public String getMessage(@Value("${x.message}") String message, @Value("${local.server.port}") long port) {
//		message = environment.getProperty("x.message");
		return message + " - from Port: " + port;
	}

}
