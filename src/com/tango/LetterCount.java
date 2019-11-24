package com.tango;

import java.util.Scanner;

public class LetterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your string");
		String str=sc.nextLine();
		count(str);

	}

	private static void count(String X) {
		// TODO Auto-generated method stub
		char[]ch=X.toCharArray();
		int letter=0;
		int spec=0;
		int num=0;
		int other=0;
		int i=0;
		while(i<X.length()){
			if (Character.isLetter(ch[i])) {
				letter++;
			} else if(Character.isDigit(ch[i])){
				num++;
			}else if(Character.isSpace(ch[i])){
				spec++;
			}else{
				other++;
			}
			i++;
		}
		System.out.println("Letter is : "+letter);
		System.out.println("number is : "+num);
		System.out.println("Space  is : "+spec);
		System.out.println("Other is : "+other);
	}

}
