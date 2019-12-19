package com.saxon.testdemo.algorithem;

import org.junit.Test;

public class SubSum {

	@Test
	public void m() {
		int[] array = { 1, -2, -3, 4, -5, -6 };
		int maxSub = getSum(array);
		System.out.println(maxSub);
	}
	
	public static int getSum(int[] a) {
		
		int maxSum = 0;
		for (int i = 0; i < a.length; i++) {
			int thisSum = 0;
			for(int j = i; j < a.length; j++) {
				thisSum += a[j];
				if(thisSum > maxSum) {
					maxSum = thisSum;
				}
			}
		}
		return maxSum;
	}
	
	@Test
	public void m2() {
		for(int i = 0; i <= 0; i++) {
			System.out.println(i);
		}
	}
}
