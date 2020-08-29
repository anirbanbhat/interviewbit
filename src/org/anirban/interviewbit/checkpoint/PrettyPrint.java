package org.anirban.interviewbit.checkpoint;

import java.util.ArrayList;

/**
 * 
 * Print concentric rectangular pattern in a 2d matrix.
Let us show you some examples to clarify what we mean.

Example 1:

Input: A = 4.
Output:

4 4 4 4 4 4 4 
4 3 3 3 3 3 4 
4 3 2 2 2 3 4 
4 3 2 1 2 3 4 
4 3 2 2 2 3 4 
4 3 3 3 3 3 4 
4 4 4 4 4 4 4 
Example 2:

Input: A = 3.
Output:

3 3 3 3 3 
3 2 2 2 3 
3 2 1 2 3 
3 2 2 2 3 
3 3 3 3 3 
The outermost rectangle is formed by A, then the next outermost is formed by A-1 and so on.

You will be given A as an argument to the function you need to implement, and you need to return a 2D array.
 * 
 * @author Anirban Bhattacherji
 *
 */

public class PrettyPrint {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> list = prettyPrint(5);
		print(list);
	}

	public static ArrayList<ArrayList<Integer>> prettyPrint(int A) {
		int size = 2*A-1;
		int limit = size;
		int temp = 0;
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		for (int i = 0; i < limit; i++) {
			ArrayList<Integer> sublist = new ArrayList<>(A);
			list.add(sublist);
		}
		while(A>0) {
			for (int i = temp; i < limit; i++) {
				for (int j = temp; j < limit; j++) {
					if(temp==0) {
						list.get(i).add(A);
					} else {
						list.get(i).set(j, A);
					}
					
				}
			}
			A--;
			temp++;
			limit--;
		}
		return list;
    }
	
	public static void print(ArrayList<ArrayList<Integer>> list) {
		for (ArrayList<Integer> arrayList : list) {
			for (Integer i : arrayList) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
