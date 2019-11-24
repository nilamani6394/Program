package com.controller;

public class FiboWhile {
	public static void main(String[] args) {
		int fibocount=10;
		int []fib= new int[fibocount];
		fib[0]=0;
		fib[1]=1;
		int i=2;
		while (i<fibocount) {
			fib[i]=fib[i-1]+fib[i-2];
			i++;
		}
		//now print the array number
		for ( i = 0; i < fibocount; i++) {
			System.out.print(fib[i]+" ");
		}
	}

}
