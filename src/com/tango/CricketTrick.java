package com.tango;

public class CricketTrick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int n=10;
		for (int i = 1; i < n; i++) {
			for (int j = 1; j <=i; j++) {
				if(count!=n){
					count++;
					System.out.print(count+" ");
				}else{ break ;}
			}
			System.out.println();
		}

	}

}
