package com.Programs;

import java.util.Arrays;

public class numsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr_num={10,12,25,13,10,12,10};
		System.out.println("All numbers"+Arrays.toString(arr_num));
		int search_num=10;
		int fixed_num=30;
		System.out.println("Result"+result(arr_num,search_num,fixed_num));

	}

	private static boolean result(int[] numbers, int search_num, int fixed_num) {
		// TODO Auto-generated method stub
		int temp_num=0;
		for (int i : numbers) {
			if(i==search_num){
				temp_num+=search_num;
			}
			if(temp_num>fixed_num){break;}
		}
		return temp_num==fixed_num;
	}

}
