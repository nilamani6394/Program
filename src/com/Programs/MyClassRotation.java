package com.Programs;

import java.util.Scanner;

class Thyem{
	
	public void leftRotate(int []arr,int d,int n){
		for (int i = 0; i < d; i++) {
			Rotat(arr, n);
		}
	}
	public void Rotat(int []arr,int n){
		int i, temp;
		//travers the arry
		temp=arr[0];
		for ( i = 0; i < n-1; i++) 
			arr[i] =arr[i+1];
			arr[i]=temp;
			
		
	}
	//utility function to print an array
	public void  printArray(int[]arr,int n){
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}

public class MyClassRotation {
	public static void main(String[] args) {
		//MyClassRotation mr = new MyClassRotation();
		Thyem tm = new Thyem();
		int []arr={1,2,3,4,5,6,7};
		tm.leftRotate(arr, 2, 7);
		tm.printArray(arr, 7);
		
	}

}
