package com.controller;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

class Demo{
	public  static void duplicate(){
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter your name");
	 String str =sc.next();
	 System.out.println(str+" ");
	 LinkedHashSet<String>lhs = new LinkedHashSet<>(Arrays.asList(str));
	 System.out.println(lhs);
	}
}
public class ADuplicate {
	public static void main(String[] args) {
		Demo dd= new Demo();
		dd.duplicate();
		System.out.println();
	}

}
