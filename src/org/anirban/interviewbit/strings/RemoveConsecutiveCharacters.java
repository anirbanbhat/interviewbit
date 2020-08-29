package org.anirban.interviewbit.strings;

public class RemoveConsecutiveCharacters {

	public static void main(String[] args) {
		System.out.println(solve("aabcd", 2));
		System.out.println(solve("aabbbccd", 2));
		System.out.println(solve("abcde", 1));
		System.out.println(solve("aaabccc", 1));
		System.out.println(solve("daabbaadccc", 2));
	}

	public static String solve(String A, int B) {
        int start = 0, mark = 0;
        String ret = "";
        for(int end = 0; end < A.length(); end++){
            if(A.charAt(end) != A.charAt(start)){
                if(A.charAt(end - 1) == A.charAt(start) && end - start == B){
                    ret = ret + A.substring(mark, start);
                    mark = end;
                    start = end;
                } else {
                    start = end;
                }
            }
        }
        if(A.charAt(start) == A.charAt(A.length() - 1) && A.length() - start == B) {
        	ret = mark == 0? "" : ret + A.substring(mark, start);
        } else {
        	ret += A.substring(mark, A.length());
        }
        return ret;
    }
}
