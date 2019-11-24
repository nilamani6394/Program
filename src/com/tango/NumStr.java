package com.tango;

import java.util.Arrays;

public class NumStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr1={10,5,8,4,3,9};
		String[]str={"Java","C#","php","c++"};
		System.out.println(" OrginalNumeric element"+Arrays.toString(arr1));
		Arrays.sort(arr1);
		System.out.println(" Sorted Numeric element"+Arrays.toString(arr1));
		System.out.println(" orginal String elements are"+Arrays.toString(str));
		Arrays.sort(str);
		System.out.println(" Sorted String elements are"+Arrays.toString(str));
		

	}

}
