 package com.tango;

import java.util.Scanner;

public class Prime {
	/*public static void primenum(){
		int i=0;
		int num=0;
		String pimenomo="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int n= sc.nextInt();
		for ( i = 1; i < n; i++) {
			int count=0;
			for ( num = i; num>=1; num--) {
				if(i%num==0){
					count=count+1;
				}
				if(count==2){
					pimenomo=pimenomo+i+"";
				}
			}
			System.out.println(pimenomo);
		}
		
	}*/
	public static void fico(){
		String primeno="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int n=sc.nextInt();
		sc.close();
		for (int i = 1; i < n; i++) {
			int count=0;
			for (int num = i; num >=1; num--) {
				if(i%num==0){
					count=count+1;
				}
				if(count==2){
					primeno=primeno+i+"";
				}
			}
			System.out.println(primeno);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // primenum();
		fico();
	}

}
