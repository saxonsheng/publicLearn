package com.saxon.testdemo.innerclass;

class Outter {
	
	public Outter() {
		System.out.println("Outter constructor");
	}

	class Inner {
		private int i1 = 1;
		public int i2 = 2;
		
		public Inner() {
			System.out.println("Inner constructor");
		}
	}
}

public class Sample extends Outter.Inner {
	
	public Sample(Outter outter) {
		outter.super();
		System.out.println("Sample constructor");
	}
	
	public static void main(String[] args) {
		Outter o1 = new Outter();
		Sample s1 = new Sample(o1);
	}
	
}