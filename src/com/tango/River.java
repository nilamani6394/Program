package com.tango;

import java.util.Scanner;

public class River {
   public static void rivrseString(){
	   Scanner sc= new Scanner(System.in);
	   System.out.println("Enter the string");
	   String str=sc.nextLine();
	   int[] indes={1,0,3,2,5,4};
	   sc.close();
	   System.out.println("input array is"+str);
	   StringBuffer sb= new StringBuffer();
	   for (int i : indes) {
		   sb.append(str.charAt(i));
		System.out.println("After revrseing the arr"+sb.toString());
	} }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rivrseString();

	}

}
