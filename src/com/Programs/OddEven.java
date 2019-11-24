package com.Programs;

import java.util.Arrays;

public class OddEven {
/*	public static void moveOdd(int []a,int n){
		//sort the array
		Arrays.sort(a);
		int [] ans= new int[n];
		int p=0,q=n-1;
		for (int i = 0; i <n; i++) {
			
			//Assign even index with maximum element
			if((i+1)%2==0)
             ans[i]=a[q--];
             else
            	 ans[i]=a[p++];
		}
		//print the array
		for (int i = 0; i <n; i++) {
			System.out.print(ans[i]+" ");
		}
	}*/
/*	 public static void oddGreater(int []arr,int n){
		 //now sort the element
		 Arrays.sort(arr);
		 //now create temparray assign value n
		 int []ans=new int[n];
		 int p=0,q=n-1;
		 for (int i = 0; i <n; i++) {
			if((i+1)%2==0)
				ans[i]=arr[q--];
			else
				ans[i]=arr[p++];
		}
		 //npow p[rint thwe array
		 for (int i = 0; i <n; i++) {
           System.out.print(ans[i]+" ");			
		}
	 }
*/	
	public static void oddGreater(int[]arr,int n){
		Arrays.sort(arr);
		int []aks= new int[n];
		int f=0,l=n-1;for (int i = 0; i < n; i++) {
			if(i%2==0)
				aks[i]=aks[l--];
			else
				aks[i]=aks[f++];
		}
		for (int i = 0; i < aks.length; i++) {
			System.out.println(aks[i]+" ");
		}
	}
	public static void main(String[] args) {
	 int []ar={5,8,6,7,2,0,1,3};
	 int n=ar.length;
	 oddGreater(ar, n);
	}

}
