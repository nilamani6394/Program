package com.product;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
        int n=sc.nextInt();
        int temp,count=0,a;
        temp=n;
        while (n!=0) {
       	a=n%10;
		n=n/10;
		count=count+((a*a*a));
		}
        if(count==temp){
        	System.out.println("It is a amstrong number");
        }else {
			System.out.println("Not a amstrong");
		}
	}

}
