package org.anirban.interviewbit.math;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		System.out.println(gcd(6, 9));
		System.out.println(gcd(0, 9));
		System.out.println(gcd(1, 0));
		System.out.println(gcd(0, 0));
	}
	
	public static int gcd(int A, int B) {
		if(A==0) {
			return B;
		} else if(B==0) {
			return A;
		} else {
			return gcd(B, A%B);
		}
	}
	
	public static int gcd2(int A, int B) {
		if(A==0 || B==0) {
			return A==0?B:B==0?A:0;
		}
		TreeSet<Integer> factorForA = allFactors(A);
		TreeSet<Integer> factorForB = allFactors(B);
		NavigableSet<Integer> treereverse = factorForA.descendingSet(); 
		  
        // getting iterated view of NavigableSet 
        Iterator<Integer> iterator = treereverse.iterator();
        int divisor = 0;
        while (iterator.hasNext()) {
        	divisor = iterator.next();
            if(factorForB.contains(divisor)) {
            	break;
            }
        }
        return divisor;
    }
	
	public static TreeSet<Integer> allFactors(int A) {
		TreeSet<Integer> ret = new TreeSet<>();
        if(A==0){
           return ret; 
        }
        ret.add(1);
        if(A==1) {
        	return ret;
        }
        ret.add(A);
        int end = A;
        int start = 2;
        while(start<end){
            if(A%start==0){
                int fact2 = A/start;
                ret.add(start);
                if(start!=fact2){
                    ret.add(fact2);
                }
                end = fact2;
            }
            start++;
        }
        return ret;
    }

}
