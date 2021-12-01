package com.java.enumerations;

import com.java.enumerations.sample.Month;
import com.java.enumerations.sample.Priority;

public class EnumDemo {

	public static void main(String[] args) {
		
		Priority priority = Priority.HIGH;
		
		switch(priority) {
		case HIGH:
			System.out.println("High Priority");
			break;
			
		case MEDIUM:
			System.out.println("Medium Priority");
			
		case LOW:
			System.out.println("Low Priority");
		}

		System.out.println("====================== Enum ValueOf() ======================");
		Priority priority2 = Priority.valueOf("LOW");
		System.out.println(priority2);

		
		System.out.println("====================== Enum Comparison  ======================");
		System.out.println("Priority.HIGH == Priority.MEDIUM is " + (priority == Priority.MEDIUM) ); // false
		System.out.println("Priority.HIGH == Priority.HIGH is " + (priority == Priority.HIGH) ); // true 
		
		System.out.println("====================== Enum values ======================");
		Priority[] values = Priority.values();
		for(Priority priority3 : values) {
			System.out.println(priority3);
		}
		
		System.out.println("====================== Enum fields and methods ======================");
		System.out.println("Month JANUARY.getDaysAmount() : " + Month.JANUARY.getDaysAmount());

		

	}

}
