package com.controller;

import java.util.Scanner;

public class BishnuFight {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int []arr= new int[n];
		int sum=0;
		int count=0;
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		//now create array for round
		System.out.println("enter round");
		int round=sc.nextInt();
		int[]newround= new int[round];
		for (int i = 0; i <round; i++) {
			newround[i]=sc.nextInt();
		}
		// create arry for to count the power
		for (int power = 0; power < round; power++) {
			count=0;
			sum=0;
			for (int i = 0; i < n; i++) {
				if(arr[i] <=newround[power])
					count++;
				sum=sum+arr[i];
			}
		}
		System.out.println(count+" "+sum);
	}
	
	

}
