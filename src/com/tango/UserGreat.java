package com.tango;

import java.util.Scanner;

public class UserGreat {
	public static void Threeuser(){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your numbers");
		int s1=sc.nextInt();
		System.out.println("Enter your 2nd numbers");
		int s2=sc.nextInt();
		System.out.println("Enter your 3rd numbers");
		int s3=sc.nextInt();
		if(s1==s2&&s1==s3){
			System.out.println("equal numbers");
		}else if(s1>s2&&s1>s3) {
			System.out.println("Largest number is"+s1);
		}else if (s2>s3) {
			System.out.println("largest number is"+s2);
		}else {
			System.out.println("largest number is"+s3);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threeuser();

	}

}
