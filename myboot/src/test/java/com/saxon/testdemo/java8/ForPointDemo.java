package com.saxon.testdemo.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

import org.junit.Test;

public class ForPointDemo {
	
	public ForPointDemo() {
		System.out.println("father: "+this);
	}

	@Test
	public void m() {
		List<String> names = Arrays.asList("a","b","c","d");
		names.forEach(name -> System.out.println(name));
		System.out.println("=================：：+++++++++++++++");
		names.forEach(System.out::println);
	}
	
	@Test
	public void m2() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("son: "+this);//匿名内部类中ForPointDemo.this表示外部实例，
			}
			
		}).start();;
	}
	
	@Test
	public void m3() {
		new Thread(() -> System.out.println("son: "+this)).start();
	}
	
	@Test
	public void m4() {
		Consumer<String> consumer = System.out::println; 
	}
	
	@Test
	public void m5() {
		Person p1 = new Person(1,"zhangsan");
		Person p2 = new Person(2,"lisi");
		
		List<Person> list = new ArrayList<Person>();
		list.add(p1);
		list.add(p2);
		
		Stream<String> map = list.stream().map(Person::getName);
	}
}
