package org.anirban.interviewbit.binarrysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotatedSortedArraySearch {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list = Arrays.asList(new Integer[] {4, 5, 6, 7, 0, 1, 2, 3});
		System.out.println(search(list, 4));
		System.out.println(search(list, 2));
		System.out.println(search(list, 6));
		System.out.println(search(list, 100));
		list = Arrays.asList(new Integer[] {5, 17, 100, 3});
		System.out.println(search(list, 6));
	}

	public static int search(final List<Integer> A, int B) {
		int start = 0, end = A.size() - 1;
	    while (start <= end) {
	      int mid = start + (end - start) / 2;
	      if (A.get(mid) == B)
	        return mid;

	      if (A.get(start) <= A.get(mid)) { // left side is sorted in ascending order
	        if (B >= A.get(start) && B < A.get(mid)) {
	          end = mid - 1;
	        } else { //B > A.get[mid]
	          start = mid + 1;
	        }
	      } else { // right side is sorted in ascending order       
	        if (B > A.get(mid) && B <= A.get(end)) {
	          start = mid + 1;
	        } else {
	          end = mid - 1;
	        }
	      }
	    }
	    return -1;
    }
}
