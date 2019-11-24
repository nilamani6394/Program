package com.tango;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a year");
		int year=sc.nextInt();
		while(year>=0) {
			if (year%4==0) {
				System.out.println("it is a leap year");
			} else {
				System.out.println("Not a leap year");

			}
		}
		System.out.println(year);

	}

}
