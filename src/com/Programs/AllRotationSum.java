package com.Programs;

public class AllRotationSum {
	static int []arr= new int[]{3,2,1};
	//first rotate the arry
	public static int Rotate(){
		int arrSum=0;
		int curVal=0;
		for (int i = 0; i < arr.length; i++) {
			arrSum=arrSum+arr[i];
			curVal=curVal+(i*arr[i]);
		}
		int maxVal=curVal;
	//now terifying Array one by one
		for (int i = 1; i < arr.length; i++) {
			curVal=curVal+arrSum-arr.length*arr[arr.length-1];
			if(curVal > maxVal)
				curVal=maxVal;
		}
		return maxVal;
	}
	public static void main(String[] args) {
		System.out.println("Sum of the arry"+Rotate());
	}
	

}
