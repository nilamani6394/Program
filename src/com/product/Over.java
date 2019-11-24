package com.product;

class A{
	void run(){
		System.out.println("You are crazy..");
	}
}
class B extends A{
	void run(){
		System.out.println("you");
	}
}
public class Over {
    public static void main(String[] args) {
		B c=  (B) new A();
		c.run();
	}
}
