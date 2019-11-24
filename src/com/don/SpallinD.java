package com.don;

import java.util.Scanner;

public class SpallinD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String orginal,revrse="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String element");
		orginal=sc.nextLine();
		int length=orginal.length();
		for (int i=length-1; i>=0; i--) {
			revrse=revrse+orginal.charAt(i);
		}
		System.out.print(revrse);
        sc.close();
	}

}
