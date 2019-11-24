package com.controller;

import java.util.Scanner;

public class RecruFact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the number");
//		int n=sc.nextInt();
//		int a1=3,b1=4;
//		int r1=1,s1=1,term;
//		for (int i = 3; i <=n; i++) {
//			if(i%2==1){
//				r1=r1*a1;
//				term=r1;
//			}else{
//				s1=s1*b1;
//				term=s1;
//			}
//			System.out.print(" "+term);
//		}
//		System.out.println();
//		sc.close();
		int [] arr= new int[]{2,4,3,0,7,0,0,3};
		for (int i = 1; i < arr.length-1; i++) {
               if (arr[i]!=0) {
            	   arr[i]=i*2;
				System.out.println(arr[i]);
			} else {
              System.err.println("not");
			}			
		}
		System.out.println();

	}

}
