package com.Programs;

import com.sun.xml.internal.ws.util.StringUtils;

public class SrringRota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ap="Akynkshya";
		int []index={1,0,3,2,5,4,7,6,8};
        System.out.printf("All element %s%n",ap);
        StringBuffer sb=  new StringBuffer();
        for (int i : index) {
			sb.append(ap.charAt(i));
		}
        System.out.printf("Modified elements are %s%n",  sb.toString());
        
        String ap1="man  to    the  heartly    mad";
        String srt = ap1.replaceAll("\\s+", " ");
        System.out.println(srt);
        

	}

}
