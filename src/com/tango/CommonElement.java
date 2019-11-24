package com.tango;

public class CommonElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]ar1={1,2,3,4,5,6};
		int []arr={4,5,6,7,8,9};
		for (int i = 0; i < ar1.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(ar1[i]==arr[j]){
					System.out.println(ar1[i]);
				}
			}
		}

	}

}
