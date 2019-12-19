package com.saxon.testdemo.thread;

import org.junit.Test;

public class ThreadTest implements Runnable {

	public ThreadTest() {
		System.out.println(1);
		new Thread(this).start();
		System.out.println(3);
	}
	
	@Override
	public void run() {
		System.out.println(4);
		System.out.println("kai shi jie shu!");
		System.out.println(5);
	}

	@Test
	public void m() {
		new ThreadTest();
		System.out.println(2);
	}
	
	@Test
	public void m2() {
		new ThreadInheritTest();
	}
	
}
class ThreadInheritTest extends Thread {
	
	public ThreadInheritTest() {
		start();
	}
	
	@Override
	public void run() {
		System.out.println("start and end!");
	}
	
}
