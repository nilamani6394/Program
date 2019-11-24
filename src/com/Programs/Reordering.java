 package com.Programs;

import java.util.Arrays;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

//Java to find positions of zeroes flipping which 
//produces maximum number of consecutive 1's

public class Reordering {
/*	 static int arr[]=new int[]{12,20,30,40,50};
	 static int  index[]=new int[]{1,0,3,2,4};
	//method to record element of array accirding to index
	static  void recod(){
		int temp[]= new int[arr.length];
		//array[i] should present at index[i
		for (int i = 0; i < arr.length; i++) 
			temp[index[i]]=arr[i];
		//copy temp[] to arr[]
		for (int i = 0; i < temp.length; i++) {
			arr[i]=temp[i];
			index[i]=i;
		}
		
	}
*/
	/*
	static String []arr=new  String[]{"Technoarck"};
	static int [] index= new int[]{1,0,3,2,5,4,7,6,8};
	
	static void record(){
		String []temp= new String[arr.length];
		//arr[i] should be present at index[i]
		for (int i = 0; i < arr.length; i++) 
		temp[index[i]]=arr[i];
		//copy temp to array
		for (int i = 0; i < temp.length; i++) {
			arr[i]=temp[i];
			index[i]=i;
		}
		
 	}*/
	public void arrayReordering(){
		int []arr={10,2,14,52,47,46,84,32};
		int[]index={1,0,3,2,5,4,6};
		int temp[] = new int[arr.length];
		for (int i = 0; i < temp.length; i++) {
			temp[index[i]]=arr[i];
		}
		//now copy the arry
         for (int i = 0; i < temp.length; i++) {
			arr[i]=temp[i];
		
			index[i]=i;
		}		
			
		}
	 
	public static void main(String[] args) {
/*		String input = "Technoarck";
		int[] index = {1,0,3,2,5,4,7,6,8};
		System.out.printf("Recorded input is %s%n", input);
		StringBuilder sb = new StringBuilder();
		for (int i : index) {
		    sb.append(input.charAt(i));
		}
		System.out.printf("Modified output is %s%n", sb.toString());*/
		/*String str="nilmani";
		int []index={2,0,1,5,3,4,6};
		System.out.printf("Recoeded input is %s%n",str);
		StringBuffer sb = new StringBuffer();
		for (int i : index) {
			sb.append(str.charAt(i));
		}
		System.out.printf("modified out out put is %s%n",sb.toString());*/
		String str="Technoark";
		int []index={1,0,3,2,5,4,7,6,8};
		System.out.printf("reordering inputs are %s%n",str);
		StringBuffer sb=new StringBuffer();
		for (int i : index) {
			sb.append(str.charAt(i));
		}
		System.out.printf("modified out put is %s%n",sb.toString());
	}

}
