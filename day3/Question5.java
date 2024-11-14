package day3;

import java.util.Stack;

public class Question5 {
	
	/*
	 * Write a function in your preferred programming language that takes as input a sentence containing nested parentheses and the position of an opening parenthesis. 

	The function should find the corresponding closing parenthesis and return its position.

	For example, if the input sentence is:

	"Sometimes (when I nest my parenthesis (also called parentheticals) too many times (like this (and this))) they get quite confusing."

	And the position of the opening parenthesis is 10, the function should return 79, which is the position of the corresponding closing parenthesis.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Sometimes (when I nest my parenthesis (also called parentheticals) too many times (like this (and this))) they get quite confusing";
		StringBuffer sf = new StringBuffer(s);
		for(int i=0;i<sf.length();i++) {
			if(sf.charAt(i)==' ') {
				sf.deleteCharAt(i);
			}
		}
		s = sf.toString();
		System.out.print(s);
		Stack<Character> st = new Stack<>();
		int a = 0;
		int b = 0;
        for(int i=0;i<s.length();i++) {
        	if(s.charAt(i)=='(') {
        		st.push(s.charAt(i));
        		if(st.size()==1) {
        			a = i;
        		}
        	}
        	else if(s.charAt(i)==')') {
        		st.pop();
        		if(st.isEmpty()) {
        			b = i;
                   break;
        		}
        	}
        }
        System.out.println(a+1 +" " + b);
	}

}
