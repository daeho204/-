package javaFinal;

import java.util.Arrays;

public class 문자열안에문자세기 {

	public static void main(String[] args) {
		String str = "A, A, B, C, D, A, C, D, D, F";
		char[] ch = str.toCharArray();
		String[] str1 = { "A", "B", "C" };
		int[] counter = new int[str1.length];
		for (int i = 0; i < str.length(); i++) {
			for (int j = 'A'; j <= 'C'; j++) {
				if (ch[i] == j) {
					counter[j - 65]++;

				} else {

				}
			}
		}
		for (int j = 0; j < counter.length; j++) {
			System.out.println((char)(j+65) + ": " + counter[j]);
		}

	}

}
/*
 * System.out.print("Enter N : "); int num = sc.nextInt(); int[][] arr = new
 * int[num][num]; int count = 1; for (int i = 0; i < arr.length; i++) { for (int
 * j = 0; j < arr.length; j++) { arr[j][i] = count; count++; } } for (int[] is :
 * arr) { for (int is2 : is) { System.out.print(is2 + " "); }
 * System.out.println(); }
 */
