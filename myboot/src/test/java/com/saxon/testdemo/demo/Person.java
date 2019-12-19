package com.saxon.testdemo.demo;

public class Person {

	private String name;
	private int age;
	private String gender;
	private int salary;
	
	public Person(String name, int age, String gender, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getString() {
		return new StringBuilder(this.name + "，" + this.age + "，" + this.gender + "，" + this.salary).toString();
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", salary=" + salary + "]";
	}
	
}
