package com.Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RotateAr {
	public static int maxSum(){
		int []arr={3,2,1};
		System.out.println("Orginal Array"+Arrays.toString(arr));
	    Collections.rotate(Arrays.asList(arr), 2);
	    System.out.println("Modified Arrays"+Arrays.toString(arr));
	    
	    int arrSum=0;
	    int curVal=0;
	    for (int i = 0; i < arr.length; i++) {
			arrSum=arrSum+arr[i];
			curVal=curVal+(i*arr[i]);
			int maxVas=curVal;
		}
		return curVal;
	    		
	}
	public static void main(String[] args) {
	/*	List<Integer>ls=new ArrayList<Integer>();
		ls.add(3);
		ls.add(2);
		ls.add(1);
		ls.add(4);
		System.out.println("All the elemenmts of the array"+ls);
		//now rotatate the element
		Collections.rotate(ls, 3);
		System.out.println(ls);*/
		System.out.println("All the elements are"+maxSum());
	}

}
