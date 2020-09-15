/**
 * 
 */
package com.java8Tests;

import java.util.*;
import java.util.stream.*;

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
		 System.out.println("Please enter  input string below:");  
        String inputStr = input.nextLine();
        
        System.out.println("You entered string "+inputStr);
        
        
        
        input.close();
        //maxOccuringCharInString(s);
        //removeDuplicatesFromString(inputStr);
        reverseString(inputStr);
        
        //System.out.println("Please enter inpt no below: ");
       // String noToMatch = input.nextLine();
        
        //System.out.println("You entered noToMatch "+noToMatch);

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
		
		//input like "my name is anthony name and my age is 22"
		/*List<String> tokens = Arrays.stream(input.split("\\s+"))
				.distinct()
				.collect(Collectors.toList());*/
		
		//Input used "xxyyzz"
		List<Character> tokens = input.chars()
				.mapToObj(e->(char)e)
				.distinct()
				.collect(Collectors.toList());
		
		
		System.out.println("tokens>>"+tokens);
	}
	
	static void reverseString(String input) {
		StringBuilder builder = new StringBuilder();
		
		for(int i=(input.length()-1);i>=0;i--) {
			builder.append(input.charAt(i));
		}
		System.out.println("reversed string >>> "+builder);
		//System.out.println("reversed string >>> "+builder.reverse());
	}
}
