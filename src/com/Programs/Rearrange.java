package com.Programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Java program for rearrange an  
//array such that arr[i] = i.
public class Rearrange {
	
	/*public static  int [] fix(int [] A){
		Set<Integer> sr= new HashSet<>();
		//storee the element in hashset
		for (int i = 0; i < A.length; i++) {
			sr.add(A[i]);
		}
		for (int i = 0; i < A.length; i++) {
			if(sr.contains(i))
				A[i]=i;
			else
				A[i]=-1;
		}
		return A;
		}*/
	public static int[]fix(int []arr){
		Set<Integer>ss= new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			ss.add(arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			if(ss.contains(i))
				arr[i]=i;
			else
				arr[i]=-1;
		}
		return arr;
	}
	public static void main(String[] args) {
		int[]arr={-1,-1,6,4,3,-1,2,1};
		System.out.println(Arrays.toString(fix(arr)));
	}

}
