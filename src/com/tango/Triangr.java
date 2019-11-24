package com.tango;

public class Triangr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if(j<=i){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
		}
		System.out.println();

	}

}
