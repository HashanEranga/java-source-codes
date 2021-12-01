package com.java.string;

import java.util.Arrays;

public class StringMain {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("============ Introduction to String Methods ============");
		System.out.println();
		
		
		String s = "Hello";
		System.out.println("s.length : " + s.length()); // 5 calculate the spaces as well
		System.out.println("s.containes(\"he\") : " + s.contains("he")); // true
		System.out.println("s.isEmpty() : " + s.isEmpty()); // false
		System.out.println("s.toUpperCase() : " + s.toUpperCase()); // HELLO
		System.out.println("s.startsWith(\"h\") : " + s.startsWith("h")); // true
		System.out.println("s.endsWith(\"h\") : " + s.endsWith("h")); // false
		System.out.println("s.replace(\"ll\", \"LL\") : " + s.replace("ll", "LL")); // false
		System.out.println("s.trim()" + s.trim()); // trims the trailing and leading spaces 
		System.out.println("s.strip()" + s.strip()); // trims the leading spaces 
		System.out.println("s.substring(0,3)" + s.substring(0,3)); // hel
		System.out.println("Arrays.toString(s.getBytes()) : " + Arrays.toString(s.getBytes())); // creates an byte array
		System.out.println(s);
		
		System.out.println();
		System.out.println("============ String Comparison ============");
		System.out.println();
		
		String s2 = "Hello";
		
		System.out.println("s == s2 : " + s2 == "Hello"); // true
	
		// creating a string object
		String s3 = new String("Hello");
		System.out.println("s2 == s3 : " + (s2 == s3)); // false
		System.out.println("s2 == s3 : " + (s2.equals(s3))); // true
		System.out.println("s2 == s3.intern() : " + (s2 == s3.intern())); // true
		
		
		String name1 = "Hashan";
		String name2 = "hashan";
		
		System.out.println("name1.equals(name2) : " + name1.equals(name2)); // false
		System.out.println("name1.equals(name2) : " + name1.equals(name2)); // true
		

		/* Escape letter sequences
		 * \t - tab space
		 * \b - backspace
		 * \n - new line
		 * \r - carriage return
		 * \f - form feed
		 * \' - single quote
		 * \'' - double quote
		 * \\ - backslash
		 */
		

	}

}
