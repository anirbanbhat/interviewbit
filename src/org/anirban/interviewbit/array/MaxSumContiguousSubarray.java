package org.anirban.interviewbit.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * Find the contiguous subarray within an array, A of length N which has the largest sum.
 * 
 * Input Format:
 * 
 * The first and the only argument contains an integer array, A.
 * Output Format:
 * 
 * Return an integer representing the maximum possible sum of the contiguous subarray.
 * Constraints:
 * 
 * 1 <= N <= 1e6
 * -1000 <= A[i] <= 1000
 * For example:
 * 
 * Input 1:
 *     A = [1, 2, 3, 4, -10]
 * 
 * Output 1:
 *     10
 * 
 * Explanation 1:
 *     The subarray [1, 2, 3, 4] has the maximum possible sum of 10.
 * 
 * Input 2:
 *     A = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
 * 
 * Output 2:
 *     6
 * 
 * Explanation 2:
 *     The subarray [4,-1,2,1] has the maximum possible sum of 6.
 * 
 * @author Anirban
 *
 */

public class MaxSumContiguousSubarray {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list = Arrays.asList(new Integer[] {1, 2, 3, 4, -10}); // 10
		System.out.println(maxSubArray(list));
		
		list = Arrays.asList(new Integer[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}); // 6
		System.out.println(maxSubArray(list));
	}
	
	public static int maxSubArray(final List<Integer> A) {
		int maxSum = A.get(0);
		int[] sum = new int[A.size()];
		sum[0] = A.get(0);
		for (int i = 1; i < A.size(); i++) {
			sum[i] = Math.max(A.get(i), sum[i-1] + A.get(i));
			maxSum = Math.max(maxSum, sum[i]);
		}
		return maxSum;
    }

}
