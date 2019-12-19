package com.saxon.testdemo.generic;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

public class GenericDemo {

	@Test
	public void m() {
		Person[] arr = new Employee[5];
		arr[0] = new Student();//运行时异常ArrayStoreException
	}
	
	@Test
	public void m2() {
		Collection<Person> stus = new ArrayList<>();
		Student stu = new Student();
		stus.add(stu);
		Employee emp = new Employee();
		stus.add(emp);
		stus.forEach(System.out::println);
	}
	
	@Test
	public void m3() {
		Collection<Student> stus = new ArrayList<>();
		testM1(stus);
	}
	
	@Test
	public void m4() {
		Person[] stuArray = new Person[5];
		stuArray[0] = new Student();
		Person s = testM2(stuArray);
		System.out.println(s);
	}
	
	private static void testM1(Collection<? extends Person> pc) {//?：通配符的作用
		System.out.println(1);
	}
	
	private static <T extends Comparable<? super T> > T testM2(T[] arr) {
		return arr[0];
	}
	
	@Test
	public void m5() {
		GenericMemoryCell<Integer> cell1 = new GenericMemoryCell<Integer>();
		cell1.write(4);
		Object cell = cell1;
		GenericMemoryCell<String> cell2 = (GenericMemoryCell<String>) cell;
		String s = cell2.read();
	}
	
}
