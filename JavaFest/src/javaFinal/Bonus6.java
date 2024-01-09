package javaFinal;

import java.util.Iterator;

public class Bonus6 {

	public static void main(String[] args) {
		int base = 2;
		int n = 3;
		int result = powerN(base,n);
		System.out.println(result);
	}
	public static int powerN(int base, int n) {
		int sum = 1;
		for (int i = 0; i < n; i++) {
			sum *= base; 
			
		}
		return sum;
	}

}
