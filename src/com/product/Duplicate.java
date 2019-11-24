package com.product;

import java.util.HashMap;
import java.util.Map;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int [] arr={9,4,3,5,9,4,2,7,6};
		Map<Integer, Integer>mm= new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (mm.containsKey(arr[i])) {
				mm.put(arr[i], mm.get(arr[i])+1);
			}else {
				mm.put(arr[i], 1);
			}
		}
		mm.forEach((k,v)->System.out.println(k));*/
		int []arr={7,8,9,1,2,3,4,5,6,7,8,9,4,1};
		Map<Integer, Integer> map= new HashMap<Integer, Integer>();
		for (int i = 0; i < args.length; i++) {
			if(map.containsKey(arr[i])){
			map.put(arr[i], map.get(arr[i])+1);
			}else {
				map.put(arr[i],1);
			}
		}
		map.forEach((k,v)->System.out.println(k));

	}

}
