package org.anirban.interviewbit.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of non negative integers, arrange them such that they form the largest number.
 * 
 * For example:
 * 
 * Given [3, 30, 34, 5, 9], the largest formed number is 9534330.
 * 
 * Note: The result may be very large, so you need to return a string instead of an integer.
 * 
 * @author Anirban
 *
 */

public class LargestNumber {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list = Arrays.asList(new Integer[] {3, 30, 34, 5, 9});
		System.out.println(largestNumber(list));
	}
	
	public static String largestNumber(final List<Integer> A) {
		List<String> copy = A.stream().map(String::valueOf).collect(Collectors.toList());

        Collections.sort(copy, new Comparator<String>(){
            @Override
            public int compare(String X, String Y) {
                String XY = X + Y;
                String YX = Y + X;
                return XY.compareTo(YX) > 0 ? -1 : 1;
            }
        });

        StringBuilder sb = new StringBuilder("");
        for (String s : copy) {
            sb.append(s);
        }
        return sb.toString().charAt(0) == '0' ? "0" : sb.toString();
    }

}
