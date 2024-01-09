package javaFinal;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Testing {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N: ");
		String str = sc.nextLine().toLowerCase();
		int[] countArr = new int[26];
		char[] ch = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
			for (int j = 'a'; j <= 'z'; j++) {
				if (ch[i] == j) {
					countArr[j - 'a']++;
				}
			}
		}
		for (int i = 0; i < countArr.length; i++) {
			System.out.println((char) (i + 97) + ": " + countArr[i]);
		}

	}
}
