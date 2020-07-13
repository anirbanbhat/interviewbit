package org.anirban.interviewbit.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * Hamming distance between two non-negative integers is defined as the number of positions at which the corresponding 
 * bits are different.
 * 
 * For example,
 * 
 * HammingDistance(2, 7) = 2, as only the first and the third bit differs in the binary representation of 2 (010) and 7 
 * (111).
 * 
 * Given an array of N non-negative integers, find the sum of hamming distances of all pairs of integers in the array.
 * Return the answer modulo 1000000007.
 * 
 * Example
 * 
 * Let f(x, y) be the hamming distance defined above.
 * 
 * A=[2, 4, 6]
 * 
 * We return,
 * f(2, 2) + f(2, 4) + f(2, 6) + 
 * f(4, 2) + f(4, 4) + f(4, 6) +
 * f(6, 2) + f(6, 4) + f(6, 6) = 
 * 
 * 0 + 2 + 1
 * 2 + 0 + 1
 * 1 + 1 + 0 = 8
 * 
 * @author ebaianh
 *
 */

public class SumOfPairwiseHammingDistance {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list = Arrays.asList(new Integer[] {2, 4, 6});
		System.out.println(hammingDistance(list));
	}

	public static int hammingDistance(final List<Integer> A) {
        long sum = 0;
        long n = A.size();
        //int M = 1000000007;
        for(long i = 0; i < 31; i++) {
            long counter=0;

            for(int j = 0; j < n; j++) {
            	//System.out.println("j: " + j + "\ti: " + i);
            	//System.out.print((long)A.get(j));
            	//System.out.println("\t" + (long)(1<<i));
            	//System.out.println(((long)A.get(j) & (long)(1<<i)) > 0);
            	// Checking each bit if it is 1. If there are 5 numbers, and say 3 of them has 
            	// first bit is 1, then counter is 3.
                if(((long)A.get(j) & (long)(1<<i)) > 0) {
                    counter++;
                }
            }
            // With above example 3 of the numbers' first bit = 1 and 2 of those first bit = 0.
            // So, permutation of pairwise difference of first bit = (3 X 2) = 6.
            // i.e. counter * (n-counter)
            sum = (sum + counter * (n-counter));//%M;

        }
        return (int) (sum << 1);//%M;
    }
}
