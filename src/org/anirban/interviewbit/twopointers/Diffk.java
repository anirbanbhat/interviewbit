package org.anirban.interviewbit.twopointers;

import java.util.Arrays;
import java.util.List;

public class Diffk {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(new Integer[] {1, 2, 2, 3, 4});
		System.out.println(diffPossible(A, 0));
	}

	public static int diffPossible(List<Integer> A, int B) {
        int i = 0, j = A.size() - 1;
        while(i<j){
            long diff = Long.valueOf(B) - (Long.valueOf(A.get(i)) + Long.valueOf(A.get(j)));
            if(diff == 0){
                return 1;
            } else if(diff > 0){
                j--;
            } else {
                i++;
            }
        }
        return 0;
    }
}
