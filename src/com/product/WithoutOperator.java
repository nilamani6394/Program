package com.product;

public class WithoutOperator {
	/*public static int Add(int x,int y){
		while (y!=0) {
			int carry=x &y;
			x=x^y;
			y=carry<<1;
		}
		return x;
	}
*/
	public static int Add(int x,int y){
		while (y!=0) {
			int carry=x&y;
			x=x^y;
			y=carry<<1;
			//return x;
		}
		return x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(Add(20, 70));
		System.out.println(Add(120, 37));

	}

}
