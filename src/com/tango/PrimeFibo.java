package com.tango;

import java.util.Scanner;

public class PrimeFibo {
	  static Scanner sc= new Scanner(System.in);
	/*public static void prime(){
		int i=0;
		int num=0;
		String  primenumber="";
		System.out.println("Enter number to find prime number");
		int n=sc.nextInt();
		for ( i = 1; i <=n; i++) {
			int count=0;
			for ( num = i; num>=1; num--) {
				if(i%num==0){
					count=count+1;
				}
			}
			if(count==2){
				primenumber=primenumber+i+" ";
			}
		}
		System.out.println(primenumber);
	}*/
	  public static void Prime(){
		  System.out.println("Enter number");
		  int n=sc.nextInt();
		  int i=0;
		  int num=0;
		  String primenock="";
		  for ( i = 1; i <= n; i++) {
			int count=0;
			for ( num = i; num>=1; num--) {
				if(i%num==0){
					count=count+1;
				}
			}
			if(count==2){
				primenock=primenock +i+" ";
			}
		}
		  System.out.println(primenock);
	  }
  public static void fibo(){
	  System.out.println("enter your number to print fibo number");
	  int fivcou=sc.nextInt();
	  int [] fiba=new int[fivcou];
	  fiba[0]=0;
	  fiba[1]=1;
	  int i=2;
	  while (i<fivcou) {
		fiba[i]=fiba[i-1]+fiba[i-2];
		i++;
	}
	  for ( i = 0; i < fivcou; i++) {
		System.out.println(fiba[i]);
	}
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prime();
		fibo();
		

	}

}
