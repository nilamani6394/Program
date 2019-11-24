package com.don;

import java.util.HashMap;
import java.util.Map;

public class Jabin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr={1,4,5,1,4,7};
		Map<Integer, Integer>map= new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
             if(map.containsKey(arr[i])){
            	 map.put(arr[i], map.get(arr[i])+1);
             }	else {
				map.put(arr[i],1);
			}		
		}
		map.forEach((k,v)->System.out.println(k));

	}

}
