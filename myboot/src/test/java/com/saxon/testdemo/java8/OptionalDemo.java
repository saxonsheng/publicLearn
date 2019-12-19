package com.saxon.testdemo.java8;

import java.util.Optional;

import org.junit.Test;

public class OptionalDemo {

	@Test
	public void m() {
		Optional<String> optional = Optional.ofNullable(null);
		String a = optional.orElse("haha");
		System.out.println(a);
	}
}
