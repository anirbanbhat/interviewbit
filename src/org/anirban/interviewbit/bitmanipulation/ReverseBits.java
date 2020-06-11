package org.anirban.interviewbit.bitmanipulation;

public class ReverseBits {

	public static void main(String[] args) {
		long l = 2L;
		System.out.println(Long.toBinaryString(l));
		System.out.println(Long.toBinaryString(reverse(l)));
		l = 1L;
		System.out.println(Long.toBinaryString(l));
		System.out.println(Long.toBinaryString(reverse(l)));
		l = 43L;
		System.out.println(Long.toBinaryString(l));
		System.out.println(Long.toBinaryString(reverse(l)));
		
	}

	public static long reverse(long a) {
        long result = 0;
        for(int i = 0; i<32; i++){
            long temp = a & (1<<i);
            if(temp != 0){
                result = result | 2147483648L>>i;
            }
        }
        return result;
    }
}
