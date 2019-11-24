package com.Programs;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternPosition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your string");
		String input=sc.nextLine();
		sc.close();
		System.out.println("Your input is " +input);
		Pattern ptr=Pattern.compile("[a-zA-Z0-9]");
		Matcher match= ptr.matcher(input);
		int Specialchar=0;
		while (match.find()) {
			Specialchar+=1;
			System.out.println(input.charAt(match.start())
					+"at position"+(match.start()+1)+".");
		}
		System.out.println("total special charecter found"+Specialchar);
	}

}
