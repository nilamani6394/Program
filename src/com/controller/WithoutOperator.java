package com.controller;

public class WithoutOperator {
	public static int add(int x,int y){
		while (y!=0) {
			int carry=x&y;
			x=x^y;
			y=carry<<1;
		}
		return x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(120, 37));

	}

}
