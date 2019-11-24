package com.Programs;

import java.util.Scanner;

class primefibo{
	public static void  fibo(int n){
		int i,t1=0,t2=1,temp;
	      for ( i = 0; i <n; i++) {
			temp=t1+t2;
			t1=t2;
			t2=temp;
		} 
	      System.out.printf("%%d",t1);
	      
		}
	static void prime(int n){
		 int i=0;
		 int num=0;
	     String primenumbers="";
	     for ( i = 0; i <=n; i++) {
			int counter=0;
			for ( num = 0; num>=1 ; num--) {
				if(i%num==0){
					counter=counter+1;
				}
			}
			if(counter==2){primenumbers=primenumbers+i+"";}
		}
		}
	}

public class RevrseAr {
	public static void main(String[] args) {
		/*int []arr={1,2,3,4,5};
		int n=arr.length;
		int start=0;
		int end=n-1;
		int temp;
		while (start<end) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		for (int i = 0; i < arr.length;  i++) {
			System.out.println(arr[i]+" ");
		}*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int n=sc.nextInt();
		if(n%2==1){
			primefibo.fibo(n);
		}else{
			primefibo.prime(n);
		}
		System.out.println();
	}

}
