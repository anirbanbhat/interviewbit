package org.anirban.interviewbit.binarrysearch;

public class SquareRootOfInteger {

	public static void main(String[] args) {
		System.out.println(sqrt(2147483647));
		System.out.println(sqrt(120));
		System.out.println(sqrt(121));
		System.out.println(sqrt(100));
		System.out.println(sqrt(1));
		System.out.println(sqrt(2));
		
	}
	
	public static int sqrt(int A) {
		int low = 0;
		int high = 1;
		
		while(high>low) {
			long current = (long)high*high;
			if(current == A) {
				return high;
			} else if(current > A) {
				high = low + (high - low)/2;
			} else {
				int diff = high - low;
				low = high;
				high = low + diff*2;
			}
		}
		return high;
    }

}
