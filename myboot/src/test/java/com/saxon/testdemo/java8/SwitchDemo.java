package com.saxon.testdemo.java8;

import org.junit.Test;

public class SwitchDemo {
	
	private static final String A = "a";

	@Test
	public void m() {
		String a = "a";
		switch (a) {
		case A:
			System.out.println("a");
			break;
		case "B":
			System.out.println("b");
			break;
		default:
			System.out.println("c");
			break;
		}
	}
}
