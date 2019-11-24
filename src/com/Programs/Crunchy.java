package com.Programs;
class PairSorted{
	static boolean PairInSortateRotate(int []arr,int n,int x){
		int i;
		for ( i = 0; i <n-1; i++)
			if(arr[i] >arr[i+1])
				break;
		int l=(i+1)%1;
		int r=i;
		while (l != r) {
			if(arr[l]+arr[r]==x)
				return true;
			if(arr[l]+arr[r]<x)
				l=(l+1)%n;
			else
				r=(n+r-1)%n;
		}
		return false;
		
	}
}

public class Crunchy {
	public static void main(String[] args) {
		int []arr={1,2,4,7,8,9};
		int sum =11;
		int n=arr.length;
		if(PairInSortateRotate(arr,n,sum))
			System.out.print("Array has two element"+" with sum 11");
		else
			System.out.println("Array has no element "+ " with sum 11");
		
	}

	private static boolean PairInSortateRotate(int[] arr, int n, int sum) {
		// TODO Auto-generated method stub
		return false;
	}


}
