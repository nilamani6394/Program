package com.controller;


class Tymen{
	public static int trip(int []arr,int n,int key){
		arr = new int[n];
		int first=0;
		int last =n-1;
		//int key;
		int mid=first+(last-first)/2;
		
		for (int i = 0; i < n; i++) {
			if(arr[i]== key){
				return key;
			}else if (arr[mid] >=key) {
				last=arr[mid]-1;
			}else if (arr[mid]<key) {
				first=arr[mid]+1;
			}else {
				return -1;
			}
		}
		return 0;
	}
}
public class ArayDum {
  public static void main(String[] args) {
	int []arr={1,4,6,7,9,10,15,17};
	int n=arr.length;
	int key=7;
	Tymen tm = new Tymen();
	tm.trip(arr, n,key);
	System.out.println(key+" " );
}
}
