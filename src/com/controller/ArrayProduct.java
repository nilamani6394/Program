 package com.controller;

public class ArrayProduct {
	void productArr(int []arr,int n){
		//First need to create two array left and righrt
		int []left= new int[n];
		int []right = new int[n];
		int []prod = new int[n];
		
		/* left most element of left array is always 1*/
		left[0]=1;
		right[n-1]=1;
		int i,j;
		/* construct the left array*/
		for ( i = 1; i <n; i++) 
			left[i]=arr[i-1]*left[i-1];
			for ( j =n-2; j>=0; j--) 
				right[j]=arr[j+1]*right[j+1];
				//construct the product array
				//left[i]*right[j]
				for ( i = 0; i < n; i++) 
					prod[i]=left[i]*right[i ];
				
			
		
		/*now print constructed product*/
		for ( i = 0; i < n; i++) 
			System.out.print(prod[i]+" ");
	}
	public static void main(String[] args) {
		ArrayProduct ap = new ArrayProduct();
		int []arr={10,3,5,6,2};
		int n = arr.length;
		System.out.println(" Product of array is : ");
		ap.productArr(arr, n);
		
	}

}
