package com.controller;

public class ArrString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  str="manoj";
		int [] index={4,2,0,3,2};
		StringBuffer sb = new StringBuffer();
		for (int i : index) {
			sb.append(str.charAt(i));;
		}
		System.out.println("Result is" +sb.toString());

	}

}
