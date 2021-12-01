package com.java.operators;

import java.util.Scanner;

public class codingEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the radius of the circle : ");
		int radius = sc.nextInt();
		
		System.out.println("The area of the circle : " + areaofCircle(radius));
		
		sc.close();
	}
	
	public static double areaofCircle(int radius) {
		return 2 * 3.14 * radius;
	}

}
