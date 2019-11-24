package com.controller;

import java.util.Scanner;

public class Moveuzero {
	public  static void MoveToend(int []arr,int n){
   // Scanner sc = new Scanner(System.in);
		int count=0;
		int temp;
		for (int i = 0; i < n; i++) {
			//arr[i] = sc.nextInt();
			if(arr[i]!=0){
				arr[i]=i*2;
			}else{
				temp=arr[count];
				arr[count]=arr[i];
				arr[i]=temp;
				count= count+1;
			}
		}
		
	}
	public static  void printArray(int []arr,int n){
		for (int i = 0; i < n; i++) {
		 System.out.print(arr[i]+ " ");
		}
	}
	public static void main(String[] args) {
//		Moveuzero mvr = new Moveuzero();
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the array");
//		 int n=sc.nextInt();
//		 int []arr= new int[n];
		int []arr={1,0,2,0,3,0,4,0,5,0,6,0,7};
		int n=arr.length;
	System.out.print("orginal array");
	printArray(arr,n);
	
	MoveToend(arr, n);
	System.out.print("Modified arry7");
	printArray(arr, n);
	}

}
