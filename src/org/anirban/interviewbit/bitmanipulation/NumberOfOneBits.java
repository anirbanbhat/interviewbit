package org.anirban.interviewbit.bitmanipulation;

public class NumberOfOneBits {

	public static void main(String[] args) {
		long l = 47L;
		System.out.println(Long.toBinaryString(l));
		System.out.println(numSetBits(l));
	}

	public static int numSetBits(long a) {
		int count = 0;
        for(int i = 0; i < 32; i++){
            if((a & (1<<i)) != 0){
                count++;
            }
        }
        return count;
    }
}
