package org.anirban.interviewbit.strings;

public class ReverseTheString {

	public static void main(String[] args) {
		System.out.println(solve("the sky is blue"));
		System.out.println(solve(" the sky is blue "));
		System.out.println(solve(""));
		System.out.println(solve(null));
		System.out.println(solve("Anirban"));
		System.out.println(solve(" Anirban "));
	}

	
	public static String solve(String A) {
		if(A == null || A.length()==0) {
			return "";
		}
		A = A.trim();
		StringBuilder sb = new StringBuilder();
		int start = 0, end = 0;
		while(start < A.length() && end < A.length()) {
			while(start < A.length() && !Character.isAlphabetic(A.charAt(start))) {
				start++;
			}
			end = start+1;
			while(end < A.length() && Character.isAlphabetic(A.charAt(end))) {
				end++;
			}
			if(end>start) {
				sb.insert(0, A.substring(start, end) + " ");
				start = end;
			}
		}
		return sb.toString().trim();
    }
}
