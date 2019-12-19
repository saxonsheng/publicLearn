package com.saxon.testdemo.algorithem;

import org.junit.Test;

public class GcdDemo {

	@Test
	public void m() {
		System.out.println(1.0 / 20);
	}
	@Test
	public void m1() {
		System.out.println(gce(15, 21));
	}
	
	public static long gce(long m, long n) {
		while(n != 0) {
			long rem = m % n;
			System.out.println(rem);
			m = n;
			n = rem;
		}
		return m;
	}
}
