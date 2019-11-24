package com.tango;

import java.util.Scanner;

public class NumberGame {
	static void TenCount(){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter ten numbers");
		int n= sc.nextInt();
		int []arr= new int[n];
		System.out.println("Enter ten digit" );
		int odd_sum=0,even_sum=0;
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i <=n; i++) {
			if(arr[i]%2!=0){
				odd_sum=odd_sum+arr[i];
			}else {
				even_sum=even_sum+arr[i];
			}
			System.out.println("OOdd number sum is"+odd_sum);
			System.out.println("even number sum is"+even_sum);
		}
			
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TenCount();

	}

}
