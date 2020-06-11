package org.anirban.interviewbit.math;

/**
 * 
 * Given a column title as appears in an Excel sheet, return its corresponding column number.
 * 
 * Example:
 * 
 *     A -> 1
 *     
 *     B -> 2
 *     
 *     C -> 3
 *     
 *     ...
 *     
 *     Z -> 26
 *     
 *     AA -> 27
 *     
 *     AB -> 28 
 * 
 * @author ebaianh
 *
 */

public class ExcelColumnNumber {

	public static void main(String[] args) {
		System.out.println(titleToNumber("ZBK"));
		System.out.println(titleToNumber("A"));
		System.out.println(titleToNumber(""));
		System.out.println(titleToNumber(null));
	}

	public static int titleToNumber(String A) {
		if(A==null) {
			return 0;
		}
		int col = 0;
		for (int i = 0; i < A.length(); i++) {
			col = col*26 + (A.charAt(i) - 'A' + 1);
		}	
		return col;
    }
}
