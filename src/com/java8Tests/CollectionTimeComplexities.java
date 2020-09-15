/**
 * 
 */
package com.java8Tests;

import java.util.*;

import com.java8Tests.model.Trader;

/**
 * @author dangoswa
 *
 */
public class CollectionTimeComplexities {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayListTimeComplexity();
		//LinkedListTimeComplexity();
		HashMapTimeComplexity();
	}

	static void ArrayListTimeComplexity() {
		List<String> strinList = new ArrayList<>();
		for(int i=0;i<10000000;i++) {
			strinList.add("swapnil"+i);
		}
		System.out.println("============= ArrayList time complexity========");
		System.out.println("size > "+strinList.size());
		long currenttime = System.currentTimeMillis();
		
		System.out.println(strinList.contains("swapnil1000984"));;
		
		System.out.println("Time for contains() -> "+(System.currentTimeMillis()-currenttime));
		
		currenttime = System.currentTimeMillis();
		strinList.add(100034, "swapnil567");
		System.out.println("Time for add(i,e) -> "+(System.currentTimeMillis()-currenttime));
		System.out.println("size > "+strinList.size());
		
		currenttime = System.currentTimeMillis();
		strinList.add("swapnil567");
		System.out.println("Time for add() -> "+(System.currentTimeMillis()-currenttime));
		System.out.println("size > "+strinList.size());
		
		currenttime = System.currentTimeMillis();
		strinList.remove("swapnil1000567");
		System.out.println("Time for remove(e) -> "+(System.currentTimeMillis()-currenttime));
		System.out.println("size > "+strinList.size());
		
		currenttime = System.currentTimeMillis();
		strinList.remove(1000076);
		System.out.println("Time for remove(i) -> "+(System.currentTimeMillis()-currenttime));
		System.out.println("size > "+strinList.size());
		
		System.out.println("============= End ========");
	}
	
	static void LinkedListTimeComplexity() {
		List<String> strinList = new LinkedList<>();
		for(int i=0;i<10000000;i++) {
			strinList.add("swapnil"+i);
		}
		System.out.println("============= LinkedList time complexity========");
		System.out.println("size > "+strinList.size());
		long currenttime = System.currentTimeMillis();
		
		System.out.println(strinList.contains("swapnil1000984"));;
		
		System.out.println("Time for contains() -> "+(System.currentTimeMillis()-currenttime));
		
		currenttime = System.currentTimeMillis();
		strinList.add(100034, "swapnil567");
		System.out.println("Time for add(i,e) -> "+(System.currentTimeMillis()-currenttime));
		System.out.println("size > "+strinList.size());
		
		currenttime = System.currentTimeMillis();
		strinList.add("swapnil567");
		System.out.println("Time for add() -> "+(System.currentTimeMillis()-currenttime));
		System.out.println("size > "+strinList.size());
		
		currenttime = System.currentTimeMillis();
		strinList.remove("swapnil1000567");
		System.out.println("Time for remove(e) -> "+(System.currentTimeMillis()-currenttime));
		System.out.println("size > "+strinList.size());
		
		currenttime = System.currentTimeMillis();
		strinList.remove(1000076);
		System.out.println("Time for remove(i) -> "+(System.currentTimeMillis()-currenttime));
		System.out.println("size > "+strinList.size());
		
		System.out.println("============= End ========");
	}
	
	static void HashSetTimeComplexity() {
		Set<Trader> strinList = new HashSet<>();
		for(int i=0;i<1000000;i++) {
			strinList.add(new Trader("Swapnil"+i,"Pune"+i));
		}
		System.out.println("============= HashSet time complexity========");
		System.out.println("size > "+strinList.size());
		long currenttime = System.currentTimeMillis();
		
		System.out.println(strinList.contains(new Trader("Swapnil999998","Pune999998")));
		
		System.out.println("Time for contains() -> "+(System.currentTimeMillis()-currenttime));
						
		currenttime = System.currentTimeMillis();
		strinList.add(new Trader("Swapnil999998","Pune999998"));
		System.out.println("Time for add() -> "+(System.currentTimeMillis()-currenttime));
		System.out.println("size > "+strinList.size());
		
		currenttime = System.currentTimeMillis();
		strinList.remove(new Trader("Swapnil999998","Pune999998"));
		System.out.println("Time for remove(e) -> "+(System.currentTimeMillis()-currenttime));
		System.out.println("size > "+strinList.size());
		
		
		
		System.out.println("============= End ========");
	}
	
	static void HashMapTimeComplexity() {
		Map<Trader,String> strinList = new TreeMap<>();
		for(int i=0;i<1000000;i++) {
			strinList.put(new Trader("Swapnil"+i,"Pune"+i),null);
		}
		System.out.println("============= HashMap time complexity========");
		System.out.println("size > "+strinList.size());
		long currenttime = System.currentTimeMillis();
		
		System.out.println(strinList.containsKey(new Trader("Swapnil999998","Pune999998")));
		
		System.out.println("Time for contains() -> "+(System.currentTimeMillis()-currenttime));
						
		currenttime = System.currentTimeMillis();
		strinList.put(new Trader("Swapnil999998","Pune999998"),null);
		System.out.println("Time for add() -> "+(System.currentTimeMillis()-currenttime));
		System.out.println("size > "+strinList.size());
		
		currenttime = System.currentTimeMillis();
		strinList.remove(new Trader("Swapnil999998","Pune999998"));
		System.out.println("Time for remove(e) -> "+(System.currentTimeMillis()-currenttime));
		System.out.println("size > "+strinList.size());
		
		
		
		System.out.println("============= End ========");
	}
}
