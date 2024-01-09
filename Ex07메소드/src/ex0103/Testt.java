package ex0103;

import java.util.Arrays;
import java.util.Scanner;

public class Testt {

	public static void main(String[] args) {
		
		int a = 10;
		int[] array = new int[a];
		for (int i = 0; i < a; i++) {
			
			for (int j = 0; j < 9; j++) {
				
				if (a % j == 0) {
					array[j] = j;
			
				}
			}

		}
		
		System.out.println(Arrays.toString(array));

	}
}
