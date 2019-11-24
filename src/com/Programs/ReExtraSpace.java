package com.Programs;

public class ReExtraSpace {
 public static void main(String[] args) {
	String str="Love   janu  come     here";
	String sb= str.replaceAll("\\s+"," ");
	System.out.println(sb);
}
}
