package com.saxon.openfeigndemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@Autowired
	MyService myService;
	
	@RequestMapping("/hello")
	public String getName() {
		return myService.getName();
	}
}
