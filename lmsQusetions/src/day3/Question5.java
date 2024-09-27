package day3;

import java.util.Stack;

public class Question5 {
	public static void main(String args[]) {
		String s = "Sometimes (when i nest my parenthesis (also called parentheticals) too many times (like this (and this))) they get quite confusing";
		String newstring="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				newstring=newstring+s.charAt(i);
			}
		}
		Stack<Character> st = new Stack<>();
		int count = 0;
		int ans = 0;
		for(int i=0;i<newstring.length();i++) {
			if(newstring.charAt(i)=='(') {
				st.push(newstring.charAt(i));
				count++;
			}
			if(newstring.charAt(i)==')') {
				st.pop();
				count--;
				if(count==0) {
				 ans = i;
					break;
				}
			}
			
			
		}
		System.out.println(ans);
	}

}
