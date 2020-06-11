package org.anirban.interviewbit.twopointers;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * Given n non-negative integers a1, a2, ..., an,
 * where each represents a point at coordinate (i, ai).
 * 'n' vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
 * 
 * Find two lines, which together with x-axis forms a container, such that the container contains the 
 * most water.
 * 
 * Your program should return an integer which corresponds to the maximum area of water that can be 
 * contained ( Yes, we know maximum area instead of maximum volume sounds weird. But this is 2D plane 
 * we are working with for simplicity ).
 * 
 *  Note: You may not slant the container. 
 * Example :
 * 
 * Input : [1, 5, 4, 3]
 * Output : 6
 * 
 * Explanation : 5 and 3 are distance 2 apart. So size of the base = 2. Height of container = min(5, 3) = 3. 
 * So total area = 3 * 2 = 6
 * 
 * @author ebaianh
 *
 */

public class ContainerWithMostWater {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(new Integer[] {1, 5, 4, 3});
		System.out.println(maxArea(A));
		A = Arrays.asList(new Integer[] {1,8,6,2,5,4,8,3,7});
		System.out.println(maxArea(A));
	}
	
	public static int maxArea(List<Integer> A) {
        if(A==null){
            return 0;
        }
        int maxVol = 0, left = 0, right = A.size()-1;
        while(left<right){
            maxVol = Math.max(maxVol, Math.min(A.get(left), A.get(right))*(right-left));
            if(A.get(right)>A.get(left)){
                left++;
            } else {
                right--;
            }
        }
        return maxVol;
    }

}
