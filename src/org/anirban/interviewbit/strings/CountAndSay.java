package org.anirban.interviewbit.strings;

public class CountAndSay {

	public static void main(String[] args) {
		// 1, 11, 21, 1211, 111221, 312211, 13112221, 1113213211
		System.out.println(countAndSay(8));
	}
	
	public static String countAndSay(int n) {
		// Base cases 
	    if (n == 1) {     
	    	return "1";
	    }
	    String str = "11";
	    if (n == 2) {    
	    	return str; 
	    }
	    // Find n'th term by generating all terms from 3 to n-1. Every term is generated using previous term.	      
	    for (int i = 3; i <= n; i++) {
	    	int count = 1;
	    	String tmp = "";
	    	for (int j = 0; j < str.length(); j++) {
	    		if(j==0) {
	    			tmp = Character.toString(str.charAt(j));
	    		} else if(str.charAt(j) != str.charAt(j-1)) {
	    			tmp = tmp.substring(0, tmp.length()-1) + count + tmp.substring(tmp.length()-1) 
	    					+ Character.toString(str.charAt(j));
					count = 1;
				} else {
					count++;
				}
			}
	    	str = tmp.substring(0, tmp.length()-1) + count + tmp.substring(tmp.length()-1);
	    }
	    return str;
	}
}
