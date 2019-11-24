package com.Programs;

public class MyRotatSearch {
	public void leftrotate(int []arr,int d,int n){
		for (int i = 0; i < d; i++) {
			rotate(arr,n);
		}
	}

	private void rotate(int[] arr, int n) {
		// TODO Auto-generated method stub
		int i,temp;
		temp=arr[0];
		for ( i = 0; i < n-1; i++) 
			arr[i]=arr[i+1];
			arr[i] =temp;
		
		
	}
	//print rotate array
	public void PrintArray(int []arr,int n){
		for (int i = 0; i <n; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	/*public void BinarySear(int []arr,int f,int l,int key){
		//int f=0,l=n-1;
		int mid=(f+l)/2;
		for (int i = 0; i < n; i++) {
			if(arr[mid]>key){
				l=mid-1;
			}else if (arr[mid]==key) {
				System.out.println("element found at " +mid);
			}else if(f>l){
				System.out.println("Element not found");
			}else {
				f=mid+1;
			}
		}*/
		
		static int search(int arr[], int l, int h, int key) 
	    { 
	        if (l > h)  
	            return -1; 
	        
	        int mid = (l+h)/2; 
	        if (arr[mid] == key) 
	            return mid; 
	        
	        /* If arr[l...mid] first subarray is sorted */
	        if (arr[l] <= arr[mid]) 
	        { 
	            /* As this subarray is sorted, we  
	               can quickly check if key lies in  
	               half or other half */
	            if (key >= arr[l] && key <= arr[mid]) 
	               return search(arr, l, mid-1, key); 
	            /*If key not lies in first half subarray,  
	           Divide other half  into two subarrays, 
	           such that we can quickly check if key lies  
	           in other half */
	            return search(arr, mid+1, h, key); 
	        } 
	        
	        /* If arr[l..mid] first subarray is not sorted,  
	           then arr[mid... h] must be sorted subarry*/
	        if (key >= arr[mid] && key <= arr[h]) 
	            return search(arr, mid+1, h, key); 
	        
	        return search(arr, l, mid-1, key); 
	    } 

		
	
	public static void main(String[] args) {
		MyRotatSearch mrs = new MyRotatSearch();
		int []arr={1,2,3,4,5,6,7,8,9};
		mrs.leftrotate(arr, 3, 9);
		mrs.PrintArray(arr, 9);
		
		
		int n=arr.length;
		mrs.search(arr, 0, n-1, 9);
		
		//mrs.BinarySear(arr, 9, 4);

        int key =11;
		int i =search(arr, 0, n-1, key);
		if(i !=-1){
			System.out.println("index : "+i);
		}else {
			System.out.println("Element not found");
		}
	}

}
