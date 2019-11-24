package com.don;

import java.util.Scanner;


public class PrimeTime {
	public static void prtNumber(){
		int  i=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter tour number");
		int num=0;
		String primeholg=" ";
		int n=sc.nextInt();
		for (i = 1; i<=n; i++) {
			int count=0;
			for ( num = i; num>=1; num--) {
				if(i%num==0){count=count+1;}
			}
			if(count==2){
				primeholg=primeholg+i+" ";
			}
		}
		System.out.println(primeholg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrueFibona tr = new TrueFibona();
		int n = 0;
		if(n%2==1){
		tr.fivi();
		}else
       prtNumber();
	}

}
