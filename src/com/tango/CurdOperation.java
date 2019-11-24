package com.tango;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurdOperation {
        Map<String, String> map= new HashMap<String, String>();
        public  void add(String key,String value){
        map.put(key , value);
        System.out.println("Content of the map is "+map);
        }
        public void Search(String key){
        	map.get(key);
        	System.out.println("You Search this item  "+map);
        }
        public void remove(String value){
        	map.remove(value);
        	System.out.println("Your item is removed from  "+map);
        }
        public void replace(String key,String value){
        	map.replace(key, value);
        	System.out.println("After replaceing the item  "+map);
        }
	public static void main(String[] args) {
		CurdOperation crd= new CurdOperation();
		Scanner sc = new Scanner(System.in);
		String key,value;
		int ch;
		do {
			System.out.println("1.add element");
			System.out.println("2.search element");
			System.out.println("3.remove element");
			System.out.println("4.replace element");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Add country and capital");
				key=sc.next();
				value=sc.next();
				crd.add(key, value);
				break;
			case  2:
				System.out.println("Enter your key to search");
				key=sc.next();
				crd.Search(key);
				break;
		    case 3:
		    	System.out.println("Enter your value to delete");
		    	value=sc.next();
		    	crd.remove(value);
		    	break;
		    case 4:
		    	System.out.println("Add key and value to replace the");
		    	key=sc.next();
		    	value=sc.next();
		    	crd.replace(key, value);

			default:
				System.err.println("Invalid entry! provide proper entry");
				break;
			}
			
		} while (ch<=4);
		// TODO Auto-generated method stub
		

	}

}
