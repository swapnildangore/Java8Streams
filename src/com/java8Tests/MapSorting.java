/**
 * 
 */
package com.java8Tests;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author dangoswa
 *
 */
public class MapSorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sortHashMapByValues();
	}

	static void sortHashMapByValues() {
		Map<String,Integer> topTen =
				getMap().entrySet().stream()
					//Ascending natural order
				 	//.sorted(Map.Entry.comparingByValue())
				 	//Reverse natural order
				 	.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
					//assending  order using comparator
					//.sorted(Map.Entry.comparingByValue(comparator));
					//Reverse Order using comparator
			       //.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
			       .limit(10)
			       .collect(Collectors.toMap(
			          Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
	
		System.out.println(topTen);
	}
	
	static Map<String,Integer> getMap(){
		Map<String,Integer> map = new HashMap<>();
		
		map.put("Swap1",1);
		map.put("Swap8",8);
		map.put("Swap10",10);
		map.put("Swap5",5);
		map.put("Swap14",14);
		
		return map;
	}
}
