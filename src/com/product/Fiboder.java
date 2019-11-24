package com.product;

import java.util.Scanner;

public class Fiboder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int fibocount=sc.nextInt();
		int[]arr= new int[fibocount];
		arr[0]=0;
		arr[1]=1;
		for (int i = 2; i < arr.length; i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
