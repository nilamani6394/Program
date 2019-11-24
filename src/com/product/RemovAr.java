package com.product;

public class RemovAr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr={0,1,2,0,3,4,0,5,0,2,0,0,1};
		int count=0;
		int temp;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0){
				arr[i]=i*2;
			}else {
				temp=arr[count];
				arr[count]=arr[i];
				arr[i]=temp;
				count=count+1;
				
			}
		}
			
		}

	}


