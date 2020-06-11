package org.anirban.interviewbit.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSumZero {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(new Integer[] {1, -4, 0, 0, 5, -5, 1, 0, -2, 4, -4, 1, -1, -4, 3, 4, -1, -1, -3});
		System.out.println(threeSum(A));
		A = Arrays.asList(new Integer[] {-1, 0, 1, 2, -1, -4});
		System.out.println(threeSum(A));
	}

	public static ArrayList<ArrayList<Integer>> threeSum(List<Integer> A) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		if(A==null || A.size()<3) {
			throw new IllegalArgumentException();
		}
		Collections.sort(A);
		for (int i = 0; i < A.size() - 2; i++) {
			if(i>0 && A.get(i).equals(A.get(i-1))) {
				continue;
			}
			int j = i+1, k = A.size() - 1;
			while(j<k) {
				long sum = Long.valueOf(A.get(i)) + Long.valueOf(A.get(j)) + Long.valueOf(A.get(k));
				if(sum == 0) {
					if(!(j>i+1 && k<A.size() - 1 && A.get(j).equals(A.get(j-1)) 
							&& A.get(k).equals(A.get(k+1)))) {
						ArrayList<Integer> newList = new ArrayList<>();
						newList.add(A.get(i));
						newList.add(A.get(j++));
						newList.add(A.get(k--));
						list.add(newList);
					} else {
						j++;
						k--;
					}
				} else if(sum>0) {
					k--;
				} else {
					j++;
				}
			}
		}
		return list;
    }
}
