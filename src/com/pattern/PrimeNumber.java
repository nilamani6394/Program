package com.pattern;

import java.util.Scanner;

public class PrimeNumber {
  static	Scanner sc= new Scanner(System.in);
	public static void primt(){
		int num=0;
		int i=0;
		System.out.println("enter your number");
		String primenest="";
		int n=sc.nextInt();
		for ( i = 1; i <n; i++) {
			int count=0;
			for ( num = i; num>=1; num--) {
				if(i%num==0){
					count=count+1;
				}
				if(count==2){
					primenest=primenest+i+"";
				}
			}
			System.out.print(primenest);
		}
	}
	public static  void fibonasci(){
		System.out.println("enter number");
		int fibocount=sc.nextInt();
		int []fibo=new int[fibocount];
		 fibo[0]=0;
		 fibo[1]=1;
		int i=2;
		while (i<fibo.length) {
			fibo[i]=fibo[i-1]+fibo[1-2];
			i++;
		}
		System.out.println(fibo[i]+" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		if (n%2==1) {
			fibonasci();
		} else {
         primt();
		}*/
		primt();
		fibonasci();

	}

}
