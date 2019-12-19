package com.saxon.testdemo.nullPointer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class NullPointerDemo {

	@Test
	public void testEnhanceFor() {
		List<String> list = null;
		for (String string : list) {
			System.out.println(string);
		}
	}
	
	@Test
	public void testParseBoolean() {
		String a = "abc";
		boolean b = Boolean.parseBoolean(a);
		System.out.println(b);
	}
	
	@Test
	public void testStrongFor() {
		List<Person> list = new ArrayList<>();
		Person p1 = new Person();
		p1.setId(1);
		p1.setName("n1");
		Person p2 = new Person();
		p2.setId(2);
		p2.setName("n2");
		Person p3 = new Person();
		p3.setId(3);
		p3.setName("n3");
		list.add(p1);
		list.add(p2);
		list.add(p3);
		for (Person per : list) {
			System.out.println(per.getName());
			per.name = "123123";
			System.out.println(per);
		}
		System.out.println("+++++++++++++++++++++++++");
		list.forEach(System.out::println);
	}
	
	@Test
	public void testStrongFor2() {
		List<Person> list = new ArrayList<>();
		Person p1 = new Person();
		p1.setId(1);
		p1.setName("n1");
		Person p2 = new Person();
		p2.setId(2);
		p2.setName("n2");
		Person p3 = new Person();
		p3.setId(3);
		p3.setName("n3");
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		Person p4 = new Person();
		p4.setName("p4");
		
		for (Person per : list) {
			if(per.getId() == 1) {
				list.set(0, p4);
			}
		}
		System.out.println("+++++++++++++++++++++++++");
		for (Person person : list) {
			System.out.println(person);
		}
	}
	
	@Test
	public void testStrongFor3() {
		LinkedList<Integer> list2 = new LinkedList<>();
		list2.addFirst(1);
		list2.addFirst(2);

		for (Integer s : list2) {
			s = 111;
			System.out.println(s);
		}
		// 增强for循环不能改变元素的值；
		for (Integer s : list2) {
			System.out.println(s);
		}
	}
	
	@Test
	public void testMap() {
		Map map = new HashMap();
	}
}


class Person {
	
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
}
