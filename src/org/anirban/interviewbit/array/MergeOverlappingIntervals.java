package org.anirban.interviewbit.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * Given a collection of intervals, merge all overlapping intervals.
 * 
 * For example:
 * 
 * Given [1,3],[2,6],[8,10],[15,18],
 * 
 * return [1,6],[8,10],[15,18].
 * 
 * Make sure the returned intervals are sorted.
 * 
 * @author Anirban
 *
 */

public class MergeOverlappingIntervals {

	public static void main(String[] args) {
		List<Interval> list = new ArrayList<>();
		list.add(new Interval(1, 3));
		list.add(new Interval(2, 6));
		list.add(new Interval(8, 10));
		list.add(new Interval(15, 18));
		printIntervals(list);
		printIntervals(merge(list));
	}

	
	public static ArrayList<Interval> merge(List<Interval> intervals) {
		Collections.sort(intervals, (i1, i2) -> i1.start - i2.start);
		ArrayList<Interval> ret = new ArrayList<>();
		ret.add(intervals.get(0));
		for (int i = 1; i < intervals.size(); i++) {
			Interval oldInt = ret.get(ret.size()-1);
			Interval newInt = intervals.get(i);
			if(newInt.start<=oldInt.end && newInt.end>oldInt.end) {
				ret.remove(ret.size()-1);
				ret.add(new Interval(oldInt.start, newInt.end));
			} else if(newInt.start>oldInt.end) {
				ret.add(newInt);
			}
		}
		return ret;
    }
	
	public static void printIntervals(List<Interval> intervals) {
		String prefix = "";
		for (Interval interval : intervals) {
			System.out.print(prefix + "[" + interval.start + ", " + interval.end + "]");
			prefix = ", ";
		}
		System.out.println();
	}
	
	 public static class Interval {
	     int start;
	     int end;
	     Interval() { start = 0; end = 0; }
	     Interval(int s, int e) { start = s; end = e; }
	 }
}
