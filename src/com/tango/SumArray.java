package com.tango;

public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] n=new int []{4,5,6,7,8,9};
		int sum=0;
		for (int i = 0; i < n.length; i++) {
			sum=sum+n[i];
		}
       System.out.println(sum);
	}

}
