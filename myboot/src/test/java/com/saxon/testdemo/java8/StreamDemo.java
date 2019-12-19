package com.saxon.testdemo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class StreamDemo {

	@Test
    public void testReduce1() {
        List<Integer> list = Arrays.asList(3, 2, 4, 1);
        System.out.println(list.stream().reduce((acc, tmp) -> acc + tmp).get());
    }
	
	@Test
	public void testReduce2() {
		List<Integer> list = Arrays.asList(3, 2, 4, 1);
		System.out.println(list.stream().reduce(100, (acc, tmp) -> acc + tmp).intValue());
	}
	
	@Test
    public void testReduce3() {
        // 串行操作
		List<Integer> list = Arrays.asList(3, 2, 4, 1);
		System.out.println(list.stream().reduce(100, (acc, tmp) -> acc + tmp, (a, b) -> a + b).intValue()); // out ==>
 
        // 并行操作
		System.out.println(list.stream().parallel().reduce(100, (acc, tmp) -> acc + tmp, (a, b) -> a + b).intValue()); // out
																														// 410
		/**
		 * 分析： list集合中四个值并行执行, 分别与初始值100相加后, 再进行合并操作, 
		 * 即： 
		 * 1）3+100=103, 2+100=102,4+100=104, 1+100=101 
		 * 2）103+102+104+101=410
		 */
    }
	
	@Test
	public void testCollector() {
		List<Integer> list = Arrays.asList(3, 2, 4, 1);
		list.stream().map(a -> a*2).collect(Collectors.toList()).forEach(System.out :: println);
	}
	
}
