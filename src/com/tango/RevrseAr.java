package com.tango;

import java.util.Arrays;

import sun.security.util.Length;

public class RevrseAr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr={10,7,5,3,4,9,8,6};
	      int start=0;
	      int end=arr.length-1;
	      int temp;
			while (start<end) {
				temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				start++;end--;
			}
		System.out.println(arr);

	}

}
