package com.Programs;
//java programe to find max Value i*arr[i];

public class DewDandrove {
	/*static int [] arr= new int[]{10,4,3,2,1,7,8,9};
	static int maxValue(){
		int arrSum=0;
		int curVal=0;
		
		for (int i = 0; i < arr.length; i++) {
			arrSum=arrSum+arr[i];
			curVal= curVal+(i*arr[i]);
		}
		int maxVal=curVal;
		//now move the element one by one
		for (int j = 1; j < arr.length; j++) {
			curVal=curVal+arrSum-arr.length*arr[arr.length-j];
			if(curVal > maxVal)
				maxVal=curVal;
		}
		return maxVal;
	}*/
	//Declare array pass the value
	static int [] arr=new int[]{10,4,5,6,2,3,7,8,9};
	//return the possible value
	static int maxSum(){
		int arrSum=0;
		int curVal=0;
		//find array sum curentvalue with no rotatiopn
		for (int i = 0; i < arr.length; i++) {
			arrSum=arrSum+arr[i];
			curVal=curVal+(i*arr[i]);
		}
		int maxVal=curVal;
		//now rotate the array one by one
		for (int i = 1; i < arr.length; i++) {
			curVal=curVal+arrSum-arr.length*arr[arr.length-1];
			if(curVal>maxVal)
				maxVal=curVal;
		}
		return maxVal;
	}
	public static void main(String[] args) {
		System.out.println(" max sum value is"+maxSum());
	}

}
