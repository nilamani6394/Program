package com.Programs;

//import jdk.internal.dynalink.beans.StaticClass;

public class ArayRoatMul {
	
	public static void arraymul(int []arr,int d,int k){
		
		for (int i = k; i < k+d; i++) {
			System.out.print(arr[i%d]+" ");
		}
	}
	public static void main(String[] args) {
		int []arr={1,3,5,7,9};
		int d= arr.length;
		
		int k=2;
		arraymul(arr, d, k);
		System.out.println();
		
		 k=3;
		arraymul(arr, d, k);
		System.out.println();
		
		k=4;
		arraymul(arr, d, k);
		System.out.println();
	}

}
