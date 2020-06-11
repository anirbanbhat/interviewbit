package org.anirban.interviewbit.math;

import java.util.ArrayList;
import java.util.Collections;

public class AllFactors {

	public static void main(String[] args) {
		System.out.println(allFactors(60));
		System.out.println(allFactors(1));
		System.out.println(allFactors(2));
		System.out.println(allFactors(12));
	}
	
	public static ArrayList<Integer> allFactors(int A) {
        ArrayList<Integer> ret = new ArrayList<>();
        if(A==0){
           return ret; 
        }
        ret.add(1);
        if(A==1) {
        	return ret;
        }
        ret.add(A);
        int end = A;
        int start = 2;
        while(start<end){
            if(A%start==0){
                int fact2 = A/start;
                ret.add(start);
                if(start!=fact2){
                    ret.add(fact2);
                }
                end = fact2;
            }
            start++;
        }
        Collections.sort(ret);
        return ret;
    }
}
