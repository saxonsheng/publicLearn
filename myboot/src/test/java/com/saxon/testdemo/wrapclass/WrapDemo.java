package com.saxon.testdemo.wrapclass;

import org.junit.Test;

public class WrapDemo {

	@Test
	public void m() {
		Long a = Long.parseLong("23");
		long b = Long.valueOf("39");
		System.out.println(a);
		System.out.println(b);
	}
	
	@Test
	public void m1() {
		Long a = null;
		long b = a;
		System.out.println(b);
	}
	
	@Test
	public void integerTest() {
		int a = Integer.parseInt("2222");
		System.out.println(a);
	}
	
	@Test
	public void integerCache() {
		Integer a = new Integer(0);
		int b = 0;
		System.out.println(a == b);
		System.out.println(a);
	}
}
