package org.anirban.interviewbit.math;

import java.util.ArrayList;

public class PrimeNumbers {

	public static void main(String[] args) {
		System.out.println(sieve(50));
	}
	
	public static ArrayList<Integer> sieve(int A) {
		ArrayList<Integer> ret = new ArrayList<>();
		for(int i=2; i<= A; i++) {
			if(isPrime(i)) {
				ret.add(i);
			}
		}
		return ret;
    }
	
	public static boolean isPrime(int val) {
		int root = (int) Math.sqrt(val);
		for(int i=2; i <= root; i++) {
			if(val%i==0) {
				return false;
			}
		}
		return true;
	}

}
