package com.Programs;

public class ArraySum {
	public static void ajxRotate(int []arr,int d,int n){
		for (int i = 0; i < d; i++) {
			LeftrotateByone(arr,n);
		}
	}

	private static void LeftrotateByone(int[] arr, int n) {
		// TODO Auto-generated method stub
		int temp,i;
		temp=arr[0];
	    for (i = 0; i < n-1; i++) 
	    	arr[i]=arr[i+1];
	         arr[i]=temp;
		
	}
	public void PrintArr(int []arr,int n){
		for (int i = 0; i <=n; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraySum as = new ArraySum();
		int []arr={5,6,7,8,9,1,2};
		as.ajxRotate(arr, 3, 7);
		as.PrintArr(arr, 7);
        //as.arryMultiplication(arr, sum);
		System.out.println();

	}

}
