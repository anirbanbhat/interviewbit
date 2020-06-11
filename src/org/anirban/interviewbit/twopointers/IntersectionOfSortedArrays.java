package org.anirban.interviewbit.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfSortedArrays {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(new Integer[] {1, 2, 3, 3, 4, 5, 6});
		List<Integer> B = Arrays.asList(new Integer[] {3, 3, 5});
		System.out.println(intersect(A, B));
		B = Arrays.asList(new Integer[] {3, 5, 7});
		System.out.println(intersect(A, B));
	}

	public static ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int indexA = 0, indexB = 0;
		while(indexA<A.size() && indexB<B.size()) {
			if(A.get(indexA).equals(B.get(indexB))) {
				list.add(A.get(indexA));
				indexA++;
				indexB++;
			} else if(A.get(indexA)>B.get(indexB)) {
				indexB++;
			} else {
				indexA++;
			}
		}
		return list;
    }
	
}
