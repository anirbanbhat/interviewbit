package org.anirban.interviewbit.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * The following code is supposed to rotate the array A by B positions.
 * 
 * So, for example,
 * 
 * 
 * A : [1 2 3 4 5 6]
 * B : 1
 * 
 * The output :
 * 
 * [2 3 4 5 6 1]
 * However, there is a small bug in the problem. Fix the bug and submit the problem.
 * 
 * @author Anirban
 *
 */

public class ArrayBug {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list = Arrays.asList(new Integer[] {1, 2, 3, 4, 5, 6});
		System.out.println(rotateArray(list, 1));
		list = Arrays.asList(new Integer[] {14, 5, 14, 34, 42, 63, 17, 25, 39, 61, 97, 55, 33, 96, 62, 32, 98, 77, 35});
		System.out.println(rotateArray(list, 56));
	}

	public static ArrayList<Integer> rotateArray(List<Integer> A, int B) {
		int size = A.size();
        if(B>=size){
            B = B%size;
        }
        ArrayList<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < A.size(); i++) {
        	int index = (i+B)>=size?i+B-size:i+B;
            ret.add(i, A.get(index));
        }
        return ret;
    }
	
}
