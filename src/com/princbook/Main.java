package com.princbook;
class Base{
	public void print(){
		System.out.println("Base");
	}
}
class Derived1 extends Base{
	public void print(){
		System.out.println("Derived");
	}
}

public class Main {
	public static void Doprint(Base o){
		o.print();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Base b= new Base();
        Base d= new Derived1();
        Derived1 m= new Derived1();
        Doprint(b);
        Doprint(d);
        Doprint(m);
	}

}
