package com.saxon.testdemo.generic;

public class Person implements Comparable<Person> {

	private String name;
	
	@Override
	public int compareTo(Person o) {
		return this.name.compareTo(o.name);
	}

}
