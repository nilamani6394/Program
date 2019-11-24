package com.controller;

import java.util.Scanner;

public class StringArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to chek ");
		String str = sc.nextLine();
		int upper=0,lower=0, number=0,special=0;
		//use for loop to print string
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >='A' && ch<='Z'){
				upper++;
			}else if (ch >='a' && ch<='z') {
				lower++;
			}else if (ch >='0' && ch<='9') {
				number++;
			}else {
				special++;
			}
		}
		System.out.println("Upper case letter"+upper);
		System.out.println("Lower case letter"+lower);
		System.out.println("Number case letter"+number);
		System.out.println("Special case letter"+special);
	}

}
