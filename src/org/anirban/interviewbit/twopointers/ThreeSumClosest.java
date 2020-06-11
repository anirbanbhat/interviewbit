package org.anirban.interviewbit.twopointers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ThreeSumClosest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(-1);
		list.add(2);
		list.add(1);
		list.add(-4);
		//System.out.println(threeSumClosest(list, 1));
		list.add(6);
		//System.out.println(threeSumClosest(list, 3));
		list.clear();
		list.add(2147483647);
		list.add(-2147483648);
		list.add(-2147483648);
		list.add(0);
		list.add(1);
		System.out.println(threeSumClosest(list, 0));
	}

	public static int threeSumClosest(List<Integer> A, int B) {
		if(A == null || A.size()<3) {
			throw new IllegalArgumentException();
		}
		long minDiff = Long.MAX_VALUE;
		Collections.sort(A);
		for (int i = 0; i < A.size() - 2; i++) {
			int j = i+1, k = A.size()-1;
			while(j<k) {
				long diff =  (long)(B - (long)(Long.valueOf(A.get(i)) 
						+ Long.valueOf(A.get(j)) + Long.valueOf(A.get(k))));
				if(diff == 0) {
					return B;
				}
				if(Math.abs(diff)<Math.abs(minDiff) || 
						((Math.abs(diff) == Math.abs(minDiff) && diff>minDiff))) {
					minDiff = diff;
				}
				if(diff<0) {
					k--;
				} else {
					j++;
				}
			}
		}
		
		return (int)(B - minDiff);
    }
}
