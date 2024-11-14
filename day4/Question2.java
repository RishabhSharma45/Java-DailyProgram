package day4;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Question2 {

	/*
	 * You need to find and print all the unique characters in a given string.

             	   Input string : java  

              	   Output : jv
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Character> set = new LinkedHashSet<>(); 
		String s = "java";
		for(int i=0;i<s.length();i++) {
			if(set.contains(s.charAt(i))) {
			set.remove(s.charAt(i));
			}else {
			set.add(s.charAt(i));
			}
		}
		String s1 = "";
		Iterator<Character> i = set.iterator();
		while(i.hasNext()) {
			s1 = s1 + i.next();
		}
		System.out.println(s1);

	}

}
