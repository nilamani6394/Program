package com.product;

import java.util.Scanner;

public class StringPollindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your string");
		String orginal,revrse="";
		orginal=sc.nextLine();
		int length=orginal.length();
		for (int i = length-1; i>0; i--) {
			revrse=orginal+revrse.charAt(i);
		}
		System.out.print(revrse);

	}

}
