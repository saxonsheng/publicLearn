package com.saxon.testdemo.innerclass;

public class InnerClassDemo {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			Demo name = new Demo() {
				public void m1() {
					System.out.println("demo");
				}
			};
			System.out.println(name.getClass());
			name.m1();
		}
		
		Demo name = new Demo() {
			public void m1() {
				System.out.println("m3");
			}
		};
		System.out.println(name.getClass());
	}
}

class Demo {

	public void m1() {
		System.out.println("m1");
	}
}
