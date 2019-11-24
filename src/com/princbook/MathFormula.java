package com.princbook;

import javax.xml.transform.Templates;

import sun.security.util.DerEncoder;

class Derived{
	protected  void getdetails(){
		System.out.println("Can i call you");
	}
}
class Temp extends Derived{
	protected final void getdetails(){
		System.out.println("I miss you");
	}
}
public class MathFormula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Derived dv = new Temp();
           dv.getdetails();
	}

}
