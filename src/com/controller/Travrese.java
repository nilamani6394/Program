package com.controller;

public class Travrese {
	static void Check(int []arr,int n){
		for (int i = 1; i <n-1; i++) {
			if(arr[i]>arr[i-1]&& arr[i]>arr[i+1])
				System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		//Travrese ts = new Travrese();
		int []arr={1,5,3,4,2,7,6};
		int n =arr.length;
		System.out.println("Elements are");
		
		Check(arr, n);
		
	} 
	

}
