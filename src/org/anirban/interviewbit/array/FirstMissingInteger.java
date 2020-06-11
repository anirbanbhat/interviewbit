package org.anirban.interviewbit.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FirstMissingInteger {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list = Arrays.asList(new Integer[] {1,2,0});
		System.out.println(firstMissingPositive(list));
		list = Arrays.asList(new Integer[] {3,4,-1,1});
		System.out.println(firstMissingPositive(list));
		list = Arrays.asList(new Integer[] {-8, -7, -6});
		System.out.println(firstMissingPositive(list));
	}

	public static int firstMissingPositive(List<Integer> A) {
		for (int i = 0; i < A.size(); i++) {
			int current = A.get(i);
			while(i+1 != A.get(i)) {
				if(A.get(i)<1 || A.get(i)>=A.size()) {
					break;
				}
				Collections.swap(A, i, A.get(i));
				if(A.get(i) == current) {
					break;
				}
			}
		}
		for (int i = 0; i < A.size(); i++) {
			if(i+1 != A.get(i)) {
				return i+1;
			}
		}
		return A.size()+1;
    }
	
	public int firstMissingPositive(ArrayList<Integer> A) {
        boolean[] arr = new boolean[A.size()];
        for (int i = 0; i < A.size(); i++) {
			if(A.get(i) > 0 && A.get(i) <= A.size()){
			   arr[A.get(i)-1] = true; 
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if(!arr[i]) {
				return i+1;
			}
		}
		return arr.length+1;
    }
}
