package com.product;

public class ArrProd {
	public  void ptoduc(int []arr,int n){
		int []right=new int[n];
		int []left=new int[n];
		int []poct=new int[n];
		
		left[0]=1;
		right[n-1]=1;
		//construct thje left array
	   for (int i = 1; i < n; i++) {
		left[i]=arr[i-1]*left[i-1];
		for (int j = n-2; j >= 0; j--) {
			right[j]=arr[i+1]+right[j+1];
			//construct product array
			for ( i= 0; i <n; i++) {
				poct[i]=left[i]*right[j];
			}
		}
	}
	   //print the product
	   for (int i = 0; i < n; i++) {
		System.out.println(poct[i]+" ");
	}
	}

	public static void main(String[] args) {
		ArrProd ap= new ArrProd();
		// TODO Auto-generated method stub
        int [] arr={10,12,13,14,15,16,17};
        int n=arr.length;
        ap.ptoduc(arr, n);
	}

}
