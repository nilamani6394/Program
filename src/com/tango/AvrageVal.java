package com.tango;

public class AvrageVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []number=new int[]{10,25,84,35,75,100};
		//sum the totaaal value in an array
		int sum=0;
		for (int i = 0; i < number.length; i++) 
			sum=sum+number[i];
			double avg=sum/number.length;
			System.out.println("Average number is  "+avg);
		

	}

}
