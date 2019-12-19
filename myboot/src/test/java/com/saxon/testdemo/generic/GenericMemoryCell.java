package com.saxon.testdemo.generic;

public class GenericMemoryCell<T> {

	private T storeValue;
	
	public T read() {
		return storeValue;
	}
	
	public void write(T t) {
		storeValue = t;
	}
}
