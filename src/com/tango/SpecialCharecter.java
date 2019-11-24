 package com.tango;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpecialCharecter {
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter your input");
		String userInput=sc.nextLine();
		sc.close();
		System.out.println("Your entred input"+userInput);
		sc.close();
		Pattern pp= Pattern.compile("[!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]");
		Matcher mm= pp.matcher(userInput);
		int countSpl=0;
		while (mm.find()) {
			countSpl+=1;
			System.out.println(userInput.charAt(mm.start())
					+"position"+(mm.start()+1)+".");
		}
		System.out.println("Special charecter found at"+countSpl);*/
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your text");
		String userInput=sc.nextLine();
		sc.close();
		System.out.println("Your input is"+userInput);
		Pattern pp=Pattern.compile("[!\"#@$%&'(),./?+-/<=>\\{}//^]");
		Matcher mm=pp.matcher(userInput);
		
		int countChar=0;
		while(mm.find()){
			countChar+=1;
			System.out.println(userInput.charAt(mm.start())
					+"position of :"+(mm.start()+1)+" .");	
		}
		System.out.println();
	}
	
	

}
