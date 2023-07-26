package com.mkdev.java8.interview;

public class StringProblemSolve {

	public static void main(String[] args) {
		String str1 = "i love programming";
		String str2 ="they are playing cricket";
		String str3 = "good to see you";
		
		System.out.println(toUpperCase(str1));
		System.out.println(toUpperCase(str2));
		System.out.println(toUpperCase(str3));
		

	}

	private static String toUpperCase(String str1) {
		String outputString = "";
		String[] strArr = str1.split(" ");
		
		
		for (String word : strArr) {
			outputString += word.substring(0, 1).toUpperCase()+""+word.substring(1)+" ";
		}
		return outputString.trim();
	}
	
}
