package com.saxon.testdemo.pagerequest;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;

import com.saxon.testdemo.TestApplication;

@SpringBootTest(classes=TestApplication.class)
public class PageRequestDemo {

	@Test
	public void m() {
		PageRequest of = PageRequest.of(1, 500);
	}
	
}
