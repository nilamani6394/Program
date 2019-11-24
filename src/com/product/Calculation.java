package com.product;

public class Calculation {
	int a;
	public Calculation(int a){
		this.a=a;
	}
	public int add(){
		a=a+10;
		try {
			a=a+10;
			try {
			a=a*10;
			throw new Exception();
			} catch (Exception e) {
				// TODO: handle exception
				a=a-10;
			}
		} catch (Exception e) {
			// TODO: handle exception
			a=a-10;
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation cc= new Calculation(10);
		int result=cc.add();
		System.out.println("result"+result);

	}

}
