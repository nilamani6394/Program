package com.tango;

import java.util.Scanner;

public class ArrangeStri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string input");
		String userInput=sc.nextLine();
		int []index={1,0,3,2,5,4};
		System.out.printf("Elements are %s%n",userInput);
		StringBuffer sb= new StringBuffer();
		for (int i : index) {
			sb.append(userInput.charAt(i));
		}
		System.out.println("modified elements are"+sb.toString());
		
		String str="Love    lagan     ne        locha";
		String stt=str.replace("\\s+", " ");
		System.out.println(stt);

	}

}
