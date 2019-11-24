package com.don;

import java.util.Scanner;

public class TrueFibona {
	static Scanner sc= new Scanner(System.in);
	public static void fivi(){
		System.out.println("Enter a number");
		int fiboc= sc.nextInt();
		 int []fibonab= new int[fiboc];
		 fibonab[0]=0;
		 fibonab[1]=1;
		for (int i = 2; i < fibonab.length; i++) {
			fibonab[i]=fibonab[i-1]+fibonab[i-2];
		}
		for (int i = 0; i < fibonab.length; i++) {
			System.out.print(fibonab[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         fivi();
	}

}
