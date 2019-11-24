package com.Programs;

public class SomeSpecialChar {
	public static void main(String[] args) {
		String str = "mayank%aj@$bdvg&";
		System.out.println(str.replaceAll("[a-zA-Z0-9]", ""));
	}

}
