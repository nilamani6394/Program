package com.tango;

import java.util.Arrays;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr={100,124,99,101,127,111};
		System.out.println("Orginal ekement of the array"+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("After sorting the elements are"+Arrays.toString(arr));
		System.out.println("Maximum element"+arr[arr.length-1]);
		System.out.println("minimum number"+arr[0]);

	}

}
