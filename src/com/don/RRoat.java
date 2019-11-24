package com.don;

public class RRoat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="mauanle";
		int []ins={1,0,3,2,6,4,5};
		System.out.println("Elements are");
		StringBuffer sb= new StringBuffer();
		for (int i : ins) {
			sb.append(str.charAt(i));
		}
		System.out.println("Modified elements are "+"=="+sb.toString());
       String std="Mayank is a    bad    boy";
       String ss= std.replaceAll("\\s", " ");
       System.out.println(ss);
	}

}
