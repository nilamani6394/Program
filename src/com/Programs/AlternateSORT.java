package com.Programs;

import java.util.Arrays;

public class AlternateSORT {
	public static void alter(int []arr,int n){
		Arrays.sort(arr);
		
		int i=0,j=n-1;
		while (i<j) {
			System.out.print(arr[j--]+" ");
			System.out.print(arr[i++]+" ");
		}
		if(n%2!=0)
			System.out.print(arr[i]);
	}
    public static void main(String[] args) {
		int[]aj={8,5,2,1,4,7,9,6,3};
		int n =aj.length;
		alter(aj, n);
	}
}
