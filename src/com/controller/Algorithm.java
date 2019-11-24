package com.controller;

public class Algorithm {
	public void product(int[]arr,int n){
		int []left= new int[n];
		int []right= new int[n];
		int []product= new int[n];
		left[0]=1;
		right[n-1]=1;
		int i,j;
		//construct left 
		for ( i = 1; i <n; i++) {
			left[i]=arr[i-1]*left[i-1];
			for ( j =n-2; j>=0; j--) {
				right[i]=arr[i+1]*right[1+1];
				//construct product
				for ( i = 0; i < n; i++) {
					product[i]=left[i]*right[i];
				}
			}
		}
		for ( i = 0; i < n; i++) {
			System.out.print(product[i]+" ");
		}
		}

	public static void main(String[] args) {
		Algorithm al= new Algorithm();
		// TODO Auto-generated method stub
		int []arr={10,20,14,15,16,17};
		int n=arr.length;
		System.out.println("product of element");
		al.product(arr, n);
       
	}

}
