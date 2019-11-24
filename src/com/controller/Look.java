package com.controller;

public class Look {
	void Leader(int []arr,int n){
		for (int i = 1; i < n-1; i++) {
			if(arr[i]>arr[i+1]){
				System.out.println("Leaders are"+arr[i]);
			}else{
				System.out.println("Error");
			}
		}
	}
	public static void main(String[] args) {
		Look lk= new Look();
		int []arr={16,17,4,5,2};
		int n=arr.length;
		lk.Leader(arr, n);
		
	}

}
