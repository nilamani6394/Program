package com.don;

public class RemoZero {
	public static void zero(int []arr,int n){
		int count=0;
		int temp;
		//
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0){
				System.out.print(arr[i]);
			}else {
				temp=arr[count];
				arr[count]=arr[i];
				arr[i]=temp;
				count=count+1;
			}
		}
		
	}
	public static void printAeea(int []arr,int n){
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr={0,1,2,0,3,0,4,0,1,4};
	//	System.out.println();
		int n=arr.length;
		printAeea(arr, n);
		zero(arr, n);
		System.out.println("after modified");
		printAeea(arr, n);

	}

}
