package com.product;

public class Arraytwice {
    public static void main(String[] args) {
		String str="Dareknenis";
		int idex[]={1,0,3,2,5,4,7,6,9,8};
		System.out.println("all the elements are "+str);
		StringBuffer sb= new StringBuffer();
		for (int i : idex) {
			sb.append(str.charAt(i));
		}
		System.out.println("after sorting all the elements are "+sb.toString());
		String rk="manoj   is  a         bad boy";
		rk.replaceAll("//s+", " ");
		System.out.println(rk);
	}
}
