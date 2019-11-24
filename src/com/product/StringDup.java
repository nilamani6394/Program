package com.product;

import java.util.HashMap;
import java.util.Map;

public class StringDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []str={"ramesh","jignesh","ramesh","jignesh","rahul","plunket","shivam","plunket"};
		Map<String, String>map=new HashMap<String, String>();
		for (int i = 0; i < str.length; i++) {
			if (map.containsKey(str[i])) {
				map.put(str[i], map.get(str[i])+1);
			} else {
                map.put(str[i], null);
			}
		}
		map.forEach((k,v)->System.out.println(k));

	}

}
