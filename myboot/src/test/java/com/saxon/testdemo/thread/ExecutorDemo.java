package com.saxon.testdemo.thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.junit.Test;

public class ExecutorDemo {

	@Test
	public void m() throws InterruptedException, ExecutionException {
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
		Callable callable = new Callable() {

			@Override
			public String call() throws Exception {
				Thread.sleep(3000);
				System.out.println("calld方法执行了");
				return "call方法返回值";
			}

		};
		System.out.println("提交任务之前 " + getStringDate());
		Future future = newFixedThreadPool.submit(callable);
		System.out.println("提交任务之后，获取结果之前 " + getStringDate());
		System.out.println("获取返回值: " + future.get());
		System.out.println("获取到结果之后 " + getStringDate());
	}

	public static String getStringDate() {
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
		String dateString = formatter.format(currentTime);
		return dateString;
	}
}
