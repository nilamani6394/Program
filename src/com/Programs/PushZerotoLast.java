package com.Programs;

public class PushZerotoLast {
	/*public static void pushZero(int[]arr,int n){
		int count=0;
		
		for (int i = 0; i < n; i++) 
			if(arr[i]!=0)
				arr[count++]=arr[i];
			
			while (count < n) 
				arr[count++]=0;
			
		
	}*/
	public static void pUshZeRo(int []arr,int n){
		int cou=0;
		
		//travers6+ the array
		for (int i = 0; i < n; i++) 
			if (arr[i]!=0) 
				arr[cou++]=arr[i];
		      
		while (cou<n) 
			arr[cou]=0;
	}
	public static void main(String[] args) {
		int []arr={0,1,2,0,3,4,0,5,0,6,0,7,8,0,9};
		int n=arr.length;
		pUshZeRo(arr, n);
		System.out.println("Array elements are");
		for (int i = 0; i <n; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
