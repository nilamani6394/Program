package com.product;

import java.util.Arrays;

public class Sumsear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []numbers={1,2,4,5,1,2,4,5,8,7,9,6,5,4};
		System.out.println("all the elements of the array "+Arrays.toString(numbers));
		int search_num=5;
		int fixex_num=15;
		
		System.out.println("Result "+ result(numbers,search_num,fixex_num));

	}

	private static boolean result(int[] number, int search_num, int fixex_num) {
		int eemp_sum=0;
		for (int i : number) {
			if(i==search_num){
				eemp_sum+=search_num;
			}
			if(eemp_sum>fixex_num){break;}
		}
		// TODO Auto-generated method stub
		return eemp_sum==fixex_num;
	}

}
