package com.product;

public class Main {
	void a(){
		try {
			System.out.println("a(): main called");
			b();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exceptioon is caught");
		}
	}

	private void b() throws Exception {
		// TODO Auto-generated method stub
		try {
			System.out.println("b(): main called");
			c();
		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception();
		}finally {
			System.out.println("finally block is called");
		}
	}

	private void c() throws Exception {
		// TODO Auto-generated method stub
		throw new Exception();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Main m = new Main();
         m.a();
	}

}
