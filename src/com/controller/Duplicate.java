package com.controller;

public class Duplicate {
	public static void main(String[] args) {
		int [] arr=new int[]{1,2,3,1,2,4};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i] == arr[j]){
					System.out.print(arr[i]+" ");
				}else{
					System.err.println();
				}
			}
		}
		System.out.println();
	}

}
