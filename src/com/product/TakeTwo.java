package com.product;

import java.util.Scanner;

public class TakeTwo {
	public static boolean teo(int p,int q){
		int x = 0;
		int y = 0;
		while (p>25 && q<=75){
			 x =p%10;
			 y = q%10;
			p/=10;
			q/=10;
		}
		return (p==q||p==y||x==q||x==y);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your first number");
		int a =sc.nextInt();
		System.out.println("Enter your second number");
		int b=sc.nextInt();
		System.out.println("Result common element is"+teo(a, b));
		
	}
	

}
