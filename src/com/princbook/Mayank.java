package com.princbook;

class Der{
	public static void rub(){
		System.out.println("Driver Drive the Bike Smmothly");
	}
}
public class Mayank extends Der {
    protected final void bike(){
    	System.out.println("It is a gear motor cycle");
    }
    class car extends Mayank{
    	void engine(){
    		System.out.println("Work perfectely");
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Der dd= new Mayank();
		dd.rub();
		//Mayank mm= new car();
		// 0mm.bike();

	}

}
