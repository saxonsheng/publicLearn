package com.saxon.testdemo.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import org.junit.Test;

public class IteratorArrayListDemo {

	@Test
	public void testAdd () {
		@SuppressWarnings("serial")
		List<String> list = new ArrayList<String>() {
			{
				add("1");
				add("2");
				add("3");
				add("4");
				add("5");
			}
		};
		for (String string : list) {
			if ("1".equals(string)) {
				list.add("1.5");
			}
		}
	}
	
	@Test
	public void testRemove () {
		@SuppressWarnings("serial")
		List<String> list = new ArrayList<String>() {
			{
				add("1");
				add("2");
				add("3");
				add("4");
				add("5");
			}
		};
		for (String string : list) {
			if ("1".equals(string)) {
				list.remove(string);
			}
		}
	}
	
	@Test
	public void testUpdate () {
		@SuppressWarnings("serial")
		List<String> list = new ArrayList<String>() {
			{
				add("1");
				add("2");
				add("3");
				add("4");
				add("5");
			}
		};
		for (String string : list) {
			if ("1".equals(string)) {
				list.set(0, "11");
			}
		}
		list.forEach(System.out :: println);
	}
	
	@Test
	public void testFormalFor () {
		@SuppressWarnings("serial")
		List<String> list = new ArrayList<String>() {
			{
				add("1");
				add("2");
				add("3");
				add("4");
				add("5");
			}
		};
		for (int i = 0; i < list.size(); i++) {
			if ("2".equals(list.get(i))) {
				list.remove(i);
			}
			if ("3".equals(list.get(i))) {
				list.add(3, "3.5");
			}
		}
		list.forEach(System.out :: println);
	}
	
	@Test
	public void testIterator () {
		@SuppressWarnings("serial")
		List<String> list = new ArrayList<String>() {
			{
				add("1");
				add("2");
				add("3");
				add("4");
				add("5");
			}
		};
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
			if ("1".equals(next)) {
				iterator.remove();
			}
		}
		list.forEach(System.out :: println);
	}
	
	@Test
	public void testAddBigIndex () {
		@SuppressWarnings("serial")
		List<String> list = new ArrayList<String>() {
			{
				add("1");
				add("2");
				add("3");
				add("4");
				add("5");
			}
		};
		// 最多只能在size()除添加一个元素
		list.add(5, "6"); // index = 6会报错，数组下标越界
		list.forEach(System.out :: println);
	}
	
	@Test
	public void testListIterator () {
		@SuppressWarnings("serial")
		List<String> list = new LinkedList<String>() {
			{
				add("1");
				add("2");
				add("3");
				add("4");
				add("5");
			}
		};
		ListIterator<String> listIterator = list.listIterator();
//		listIterator.set("6"); // 报错
		while(listIterator.hasNext()) {
			String next = listIterator.next();
			if ("3".equals(next)) {
				listIterator.set("6");
			}
		}
		
		list.forEach(System.out :: println);
	}
}
