package com.product;

public class ZerohOU {
	public static void moveZero(int []arr,int n){
		int count=0;
		int temp;
		for (int i = 0; i < arr.length; i++) {
		 if(arr[i]!=0){
			 arr[i]=i*2;
		 }else{
			 temp=arr[count];
			 arr[count]=arr[i];
			 arr[i]=temp;
			 count=count+1;
		 }
		}
	}
	public static void PrintArr(int []arr,int n){
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int []arr={0,2,0,1,0,3,0,0,5,6,0,7,0,9};
      int n=arr.length;
      PrintArr(arr, n);
      moveZero(arr, n);System.out.print("Modifiedf array");
      PrintArr(arr, n);
	}

}
