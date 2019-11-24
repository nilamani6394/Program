package com.product;

public class LinearSear {
	public static  int Linear(int []arr,int key){
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==key){
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a1={10,30,50,40,91,45};
		int key=40;
		System.out.println(key+"is found at index "+Linear(a1, key));

	}

}
