package org.anirban.interviewbit.math;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Rearrange a given array so that Arr[i] becomes Arr[Arr[i]] with O(1) extra space.
 * 
 * Example:
 * 
 * Input : [1, 0]
 * Return : [0, 1]
 *  Lets say N = size of the array. Then, following holds true :
 * All elements in the array are in the range [0, N-1]
 * N * N does not overflow for a signed integer
 * 
 * ****NOTE****
 * Best way to understand:
 * 
 * arr[i] should become arr[arr[i]]
 * 
 * that means:
 * 
 * new value of arr[i] should become old value of arr[arr[i]] // (old value because the value of arr[arr[i]] might have changed when you’re incrementing in the 1st operation)
 * 
 * [4, 0, 2, 1, 3] => [arr[4], arr[0], arr[2], arr[1], arr[3]] => [3, 4, 2, 0, 1]
 * 
 * @author ebaianh
 *
 */

public class RearrangeArray {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(0);
		System.out.println(list);
		arrange(list);
		System.out.println(list);
		
		list.clear(); //[3, 4, 2, 0, 1]
		list.add(4);
		list.add(0);
		list.add(2);
		list.add(1);
		list.add(3); //[4, 0, 2, 1, 3] == [3, 4, 2, 0, 1]
		System.out.println(list);
		arrange(list);
		System.out.println(list);
	}

	/**
	 * 
	 * Approach:
	 * ---------
	 * 
	 * Take a number max (= a.size()+1) greater than Maximum value of the array
	 * multiply each number with max and add the number referenced with taking current number as index
	 * e.g.
	 * [4, 0, 2, 1, 3] say here max = 6
	 * for position 0, here 4 will be replaced with 4 X 6 + arr[4] = 24 + 3 = 27
	 * 
	 * This is how if you devide(/) 27 with max (6), you will get old value (4)
	 * if you do modular division(%) 27 with max (6), you will get new value (3)
	 * 
	 * @param a
	 */
	
	public static void arrange(List<Integer> a) {
		int max = a.size()+1;
		for (int i = 0; i < a.size(); i++) {
			if(a.get(i)<i) {
				a.set(i, max*a.get(i)+a.get(a.get(i))/max);
			} else {
				a.set(i, max*a.get(i)+a.get(a.get(i)));
			}
		}
		for (int i = 0; i < a.size(); i++) {
			a.set(i, a.get(i)%max);
		}
    }
}
