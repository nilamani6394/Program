package com.princbook;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Trident {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc= new Scanner(System.in);
		System.out.println("Enter first point");
		int L=sc.nextInt();
		System.out.println("Enter end point");
		int R=sc.nextInt();
		for (int i = L; i <=R; i++) {
			System.out.print(i);
		}
		System.out.println();
        sc.close();*/
		//String message=System.out.println(args[2]);
		/*String message="Hello world!";
		for (int i = 0; i < message.length(); i++) {
			System.out.println(message.charAt(i+1));
		}*/
		//System.out.println(message.subSequence(3, 5));
      List<Integer>al= new LinkedList<Integer>();
      al.add(5);
      al.add(1);
      al.add(4);
      System.out.println(al);
	}

}
