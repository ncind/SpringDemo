package org.nik.hashmap;

import java.util.HashMap;
import java.util.LinkedList;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String str1 = "abcdef";
		String str2 = "abcdfG";
		String str3 = "abcdfH";
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		map.put("abcdef", 1);
		map.put("abcdfG", 2);
		map.put("abcdfH", 3);
		System.out.println(map);
		
		LinkedList<String> list = new LinkedList<String>();
		
		
	}

}
