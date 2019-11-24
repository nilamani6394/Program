package com.Programs;

import java.util.Arrays;

public class Second {
	public static  int secondHigh(int []arr,int total){
		Arrays.sort(arr);
		return arr[total-2];
	}
	public static void main(String[] args) {
		int []arr={4,2,8,9,7,1};
		System.out.println("Second Largest number is :"+secondHigh(arr, 6));
	}

}
