package org.anirban.interviewbit.math;import jdk.nashorn.internal.runtime.FindProperty;

public class BinaryRepresentation {

	public static void main(String[] args) {
		System.out.println(findDigitsInBinary(98));
	}

	public static String findDigitsInBinary(int A) {
        StringBuilder sb = new StringBuilder();
        while(A != 0){
            sb.insert(0, Integer.toString(A%2));
            A = A/2;
        }
        return sb.toString();
    }
}
