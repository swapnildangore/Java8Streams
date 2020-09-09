package com.java8Tests;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Sum of "+add("999","2222222"));
		System.out.println("Sum of "+substract("999", "66666"));
	}

	static String add(String str1,String str2) {
		StringBuilder strTemp=new StringBuilder();
		int carry = 0;
		
		
		if(str2.length()>str1.length()) {
			
			String temp = str2; 
			str2 = str1; 
			str1=temp;
			
		}
		int largeLength = str1.length();
		int smallLength = str2.length();
		
		String remainingLargeStr = str1.substring(0,(largeLength-smallLength));
		str1=str1.substring((largeLength-smallLength), largeLength);
		System.out.println(str1+" "+str2+" "+remainingLargeStr);
		for(int i=smallLength-1;i>=0;i--) {
			//System.out.println(str2.charAt(i) +" "+str1.charAt(i));
			int sum = (Character.getNumericValue(str2.charAt(i)))+(Character.getNumericValue(str1.charAt(i)))+carry;
			carry = 0;
			int ones = (sum%10);
			carry = sum/10;
			//System.out.println(sum +" "+ones +" "+carry);
			strTemp.append(ones);
		}
		
		for(int i=remainingLargeStr.length()-1;i>=0;i--) {
			int sum = Character.getNumericValue(remainingLargeStr.charAt(i))+carry;
			int ones = (sum%10);
			carry = sum/10;
			strTemp.append(ones);
		}
			
		return strTemp.reverse().toString();
	}
	
	static String substract(String str1,String str2) {
		StringBuilder strTemp=new StringBuilder();
		int borrow = 0;
		
		
		if(str2.length()>str1.length()) {
			
			String temp = str2; str2 = str1; str1=temp;
		}
		int largeLength = str1.length();
		int smallLength = str2.length();
		String remainingLargeStr = str1.substring(0,(largeLength-smallLength));
		str1=str1.substring((largeLength-smallLength), largeLength);
		System.out.println(str1+" "+str2+" "+remainingLargeStr);
		for(int i=smallLength-1;i>=0;i--) {
			//System.out.println(str2.charAt(i) +" "+str1.charAt(i));
			int str2Num = Character.getNumericValue(str2.charAt(i));
			int str1Num = Character.getNumericValue(str1.charAt(i));
			int substraction = 0;
			if(str1Num<str2Num) {
				substraction = (10+str1Num)-(str2Num+borrow);
				borrow=1;
			}else {
				substraction = str1Num-(str2Num+borrow);
			}
			
			strTemp.append(substraction);
		}
		
		for(int i=remainingLargeStr.length()-1;i>=0;i--) {
			int strNum = Character.getNumericValue(remainingLargeStr.charAt(i));
			if(borrow>0) {
				
				strTemp.append(strNum-borrow);borrow=0;
			}else {
				strTemp.append(strNum);
			}
			
		}
			
		return strTemp.reverse().toString();
	}
}
