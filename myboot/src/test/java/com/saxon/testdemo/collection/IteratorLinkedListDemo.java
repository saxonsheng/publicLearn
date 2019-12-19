package com.saxon.testdemo.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class IteratorLinkedListDemo {

	@Test
	public void addValueIterator() {
		@SuppressWarnings("serial")
		List<String> list = new LinkedList<String>() {
			{
				add("1");
				add("2");
				add("3");
				add("4");
			}
		};
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String next = iterator.next();
			if ("2".equals(next)) {
				iterator.remove();
				iterator.remove();
			}
		}
		list.forEach(System.out :: println);
	}
	
	@Test
	public void addValueFor() {
		@SuppressWarnings("serial")
		List<String> list = new LinkedList<String>() {
			{
				add("1");
				add("2");
				add("3");
				add("4");
			}
		};
		for (String string : list) {
			if ("2".equals(string)) {
				list.remove(string);
			}
		}
		list.forEach(System.out :: println);
	}
}
