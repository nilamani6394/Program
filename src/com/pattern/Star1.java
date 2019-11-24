package com.pattern;

public class Star1 {
	public static void main(String[] args) {
		/*for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		/*for (int i = 0; i <8; i++) {
			for (int j = 0; j < 8; j++) {
				if(j>=i){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}*/
		for (int i =0 ; i <5; i++) {
			for (int j = 0; j < 9; j++) {
				if(j>=6-i&&j<=4+i){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	

}
