/**
 * 
 */
package com.java8Tests;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author dangoswa
 *
 */
public class StringProgrammes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		  
        String s = input.nextLine();
        
        System.out.println("You entered string "+s);
        input.close();
        maxOccuringCharInString(s);

	}

	static void maxOccuringCharInString(String input) {
		char charInInput;
		int count=0;
		input = Objects.requireNonNull(input, "Input can't be null");
		
		if(input.isBlank())
			return;
		Map<Character,Integer> countMap = new HashMap<>();
		
		for(int i=0;i<input.length();i++) {
			charInInput = input.charAt(i);
			if(Character.isWhitespace(charInInput))
				continue;
			if(countMap.containsKey(charInInput)) {
				int cnt = countMap.get(charInInput);
				countMap.put(charInInput, (cnt+1)) ;
			}else {
				countMap.put(charInInput,1);
			}
		}
		
		Map<Character,Integer> sortedMapByValue = countMap.entrySet()
				.stream()
				.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				.peek(e->System.out.println("element1 - "+e))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue,newValue)->oldValue,LinkedHashMap::new));
		System.out.println(sortedMapByValue);
		for(Map.Entry<Character, Integer> entry:sortedMapByValue.entrySet()) {
			System.out.println("Max occuring character: '"+entry.getKey()+" occured "+entry.getValue()+ " times");
			break;
		}
	}
	
	static void removeDuplicatesFromString(String input) {
		input = Objects.requireNonNull(input, "Input can't be null");
		
		if(input.isBlank())
			return;
		
		
	}
}
