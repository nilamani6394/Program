package com.Programs;

import java.util.Scanner;

public class Result {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entewr sub1 score");
		int sub1=sc.nextInt();
		System.out.println("Entewr sub2 score");
		int sub2=sc.nextInt();
		System.out.println("Entewr sub3 score");
		int sub3 =sc.nextInt();
		int total=sub1+sub2+sub3;
		System.out.println("you scored"+total);
		
		System.out.println("Enter yor full mark");
		int fm=sc.nextInt();
		double grade=total*100/fm;
		if(grade>90){
			System.out.println("You passed in grade A");
		}else if (grade>70) {
			System.out.println("You Passed in Grade B+");
		}else if (grade>60) {
			System.out.println("you passed in Grade B");
		}else {
			System.out.println("you are failed");
		}
	}

}
