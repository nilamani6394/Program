package com.controller;

import java.util.Scanner;

class Employee{
	Scanner sc= new Scanner(System.in);
	int id;
	String name;
	 public void get(){
     System.out.println("Enter id");
    id=sc.nextInt();
    System.out.println("Enter name");
    name = sc.next();
	 }
	 void Show(){
		 System.out.println("Your id is : "+id);
		 System.out.println("Your name is : "+name);
	 }
}
class Teacher extends Employee{
	Scanner sc = new Scanner(System.in);
	String sub;
	public void get(){
		System.out.println("enter id");
		id = sc.nextInt();
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter subject name");
		sub = sc.next();
	}
	void show(){
		System.out.println("Teacher teach :" + sub);
	}
}
class Cargo extends Teacher{
	Scanner sc = new Scanner(System.in);

	int salary;
	public void get(){
	System.out.println("Enter id");
	id = sc.nextInt();
	System.out.println("enter the name");
	name= sc.next();
	System.out.println("enter subject name :");
	sub=sc.next();
	System.out.println("enter salary");
	salary = sc.nextInt();
	}
	void show(){
		System.out.println("Here all the details are id is: "+id+"name is :"+name+"subject is :" +sub+"salary is : "+salary) ;
	}
}
public class Interfren {
	public static void main(String[] args) {
		System.out.println("Employee detailsJ");
		Employee elp = new Employee();
		elp.get();
		elp.Show();
		System.out.println("Details of teacher");
		Teacher tc = new Teacher();
		tc.get();
		tc.show();
		System.out.println("============================");
		Cargo cg = new Cargo();
		cg.get();
		cg.show();
	}

}
