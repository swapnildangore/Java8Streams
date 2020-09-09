package com.java8Tests;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreading {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		Runnable task = ()->{
			
			System.out.println(Thread.currentThread().getName());
		};
		
		Callable<Integer> task1 = ()->{ return 1;};
		Callable<Integer> task2 = ()->{ return 2;};
		
		List<Callable<Integer>> callables = Arrays.asList(task1,task2);
		
		try {
			executor.invokeAll(callables).stream().map(future -> {
				try {
					return future.get();
				} catch (InterruptedException | ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return 0;
			}).forEach(System.out::println);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		executor.execute(task);
		executor.submit(task);
		
		executor.shutdownNow();
	}
}
