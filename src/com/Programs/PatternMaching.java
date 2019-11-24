package com.Programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMaching {
	public static void main(String[] args) {
		Pattern ptr=Pattern.compile("[a-zA-Z0-9]*");
		String str="alkl";
		Matcher matcher=ptr.matcher(str);
		if(!matcher.matches()){
			System.out.println("String"+str+"Sepsial charecters contain");
		}else {
			System.out.println("not contaain any special charecter");
		}
	}

}
