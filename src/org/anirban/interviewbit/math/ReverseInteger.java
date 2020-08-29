package org.anirban.interviewbit.math;

/**
 * 
 * Reverse digits of an integer.
 * 
 * Example1:
 * 
 * x = 123,
 * 
 * return 321
 * Example2:
 * 
 * x = -123,
 * 
 * return -321
 * 
 * Return 0 if the result overflows and does not fit in a 32 bit signed integer
 * 
 * @author Anirban Bhattacherji
 *
 */

public class ReverseInteger {

	public static void main(String[] args) {
		System.out.println(reverse(123));
		System.out.println(reverse(-123));
		System.out.println(reverse(1563847412));
		System.out.println(reverse(-1563847412));
	}
	
	
	public static int reverse(int A) {
		boolean isNegative = A<0;
		A = Math.abs(A);
		long result = 0;
		while(A>0) {
			result = result*10 + A%10;
			A = A/10;
		}
		if(isNegative) {
			result = 0 - result;
			if(result < Integer.MIN_VALUE) { //-2147483648
				return 0;
			}
		}
		if(result > Integer.MAX_VALUE) { // 2147483647
			return 0;
		}
		return (int) result;
    }

}
