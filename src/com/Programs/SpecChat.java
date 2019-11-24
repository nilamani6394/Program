package com.Programs;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpecChat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String userinput=sc.next();
		System.out.println("Your input is"+userinput);
		Pattern pp= Pattern.compile("[!\"@#$%^&*()_+<>?/.,';:]");
		Matcher mm =pp.matcher(userinput);
		int cou=0;
        while (mm.find()) {
			System.out.println(userinput.charAt(mm.start())+
					" Positions of special char"+(mm.start()+1)+".");
			cou+=1;
		}
        System.out.println();
	}

}
