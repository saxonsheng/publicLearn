package com.saxon.openfeigndemo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="myServiceName",url="localhost:8888")
public interface MyService {
	
	@RequestMapping("/")
	public String getName();

}
