package org.anirban.interviewbit.twopointers;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		//System.out.println(removeDuplicates(list));
		list.add(0);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		//System.out.println(removeDuplicates(list));
		list.clear();
		list.add(5000);
		list.add(5000);
		list.add(5000);
		System.out.println(removeDuplicates(list));
	}

	public static int removeDuplicates(List<Integer> a) {
	    if(a == null || a.size() == 0){
	        return 0;
	    }
	    if(a.size() == 1){
	        return 1;
	    }
	    int start = 1;
	    for(int end = 1; end < a.size(); end++){
	    	if(!a.get(end).equals(a.get(end-1))){
	            a.set(start++, a.get(end));
	        }
	    }
	    return start;
	}
}
