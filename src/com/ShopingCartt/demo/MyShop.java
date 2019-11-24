package com.ShopingCartt.demo;

import java.util.HashMap;
import java.util.Map;

public class MyShop {
	public static void main(String[] args) {
		Map<String,Double>msd= new HashMap<String, Double>();
		msd.put("T-Shirt", 130.50);
		msd.put("Shirt", 160.50);
		msd.put("jeans", 122.50);
		msd.put("Sparky", 630.50);
		msd.put("Adfidda", 830.50);
		msd.put("Pantaloon", 1030.50);
		//get the value of the item
		System.out.println("\n msd price of"+msd.get("T-Shirt"));
		System.out.println("\n Is Out of stock"+msd.isEmpty());
		//remove some item
		msd.remove("Sparky");
		//now resize the item
		System.out.println("\n"+msd);
		System.out.println("\n size of the hashMap"+msd.size());
	}

}
