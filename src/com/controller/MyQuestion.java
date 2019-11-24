package com.controller;

import java.util.Scanner;

public class MyQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "mayank";
		int []index={1,0,3,2,5,4};
		System.out.printf("element are avlaiable %s%n",st);
		StringBuffer sb = new StringBuffer();
		for (int i : index) {
			sb.append(st.charAt(i));
			System.out.printf("Modified strings are %s%n",sb.toString());
		}
		//Remove extra space
		String at="Lazy    Brown    fox  Jump Over      the head";
        String ad= at.replaceAll("\\s+", " ");
        System.out.println(ad);
        
        //fibonasci number
        int fibocount=10;
        int [] fib= new int[fibocount];
        int i=2;
        fib[0]=0;
        fib[1]=1;
        while(i<fibocount){
        	fib[i]=fib[i-1]+fib[i-2];
        	i++;
        }
	for ( i = 0; i < fibocount; i++) {
		System.out.println(fib[i]+" ");
	}
	
		//Revrse a String
	 String orginal,revrse="";
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter your number /Sytring to revrse");
	 orginal =sc.nextLine();
	 //travers the string
	 int length=orginal.length();
	 int x=length-1;
	 while (x>=0 ) {
		revrse=revrse+orginal.charAt(x);
		x--;
	}
	 System.out.println("after modified the String :" +revrse);
	 
	 
	 //Amstrong Number
	 System.out.println("Enter your number");
	 int n=sc.nextInt();
	 int count=0,temp,a;
	 temp=n;
	 while (n!=0) {
		a=n%10;
		n=n/10;
		count=count+(a*a*a);
	}
	 if (temp==count) {
		System.out.println("It is a amstrong number");
	}else {
		System.out.println("Not an amstrong number");
	}
	}
	}


