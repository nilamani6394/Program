package com.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

public class RemoveDuplic {
	/*public static void Remove(int []arr){
		Map<Integer, Integer> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements");
		int n = sc.nextInt();
		int len=arr.length;
 		for (int i = 0; i < len-1; i++) {
			arr[i]=sc.nextInt();
			System.out.println("Enter Array Elements");
			if(map.containsKey(arr[i])){
				map.put(arr[i], map.get(arr[i])+1);
			}else {
				map.put(arr[i],1);
			}
		}
		map.forEach((k,v) -> System.out.print(k));
	}*/
	/*public static void RemoveDup(int[]arr){
		Map<Integer, Integer>map= new HashMap<Integer, Integer>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int len =arr.length;
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
			System.out.println("Enter array element");
			if(map.containsKey(arr[i])){
				map.put(arr[i], map.get(arr[i])+1);
			}else{
				map.put(arr[i], 1);
			}
			
		}
		map.forEach((k,v)-> System.out.print(k));
	}*/
	/*public static void remove(int []arr){
		Map<Integer, Integer>map= new HashMap<Integer, Integer>();
		Scanner sc = new Scanner(System.in);
		//System.out.println("enter your number");
		int n=sc.nextInt();
		int len=arr.length;
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
			System.out.println("Enter your numb");
			if(map.containsKey(arr[i])){
				map.put(arr[i], map.get(arr[i])+1);
			}else {
				map.put(arr[i], 1);
			}
		}
		map.forEach((k,v)->System.out.print(k));
	}*/
	public static void duolicate(int []arr){
		Map<Integer, Integer> map= new HashMap<>();
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int len=arr.length;
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			System.out.println("Enter your arry num");
			if(map.containsKey(arr[i])){
				map.put(arr[i], map.get(arr[i])+1);
			}else {
				map.put(arr[i], 1);
			}
		}
		map.forEach((k,v)->System.out.print(k));
	}
	public static void main(String[] args) {
		       // RemoveDuplic rdc = new RemoveDuplic();
//		        int[] arr={4,7,2,1,4,1,5,6,3,8,7};
//		       // System.out.println("Before Removeing the duolicate");
//		        //int len = arr.length;
//		        //rdc.Remove(arr);
//		        Remove(arr);
//		        System.out.println("After removeing the duplicate element"+arr);
		
		/*int n = 0;
		int [] arr =new int[n];
		Remove(arr);
		System.out.println("Array elements after removeing"+arr);*/
		int n =0;
		int[]ar={10,12,14,10,15,15,17,19};
		
		
		
		
	}

}
