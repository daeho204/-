package javaFinal;

import java.util.Iterator;
import java.util.Random;

public class Ttesttt {
	public static void main(String[] args) {
		Random ran = new Random();
		int[] arr = new int[6];
		for (int i = 0; i < 6; i++) {
			arr[i] = ran.nextInt(1, 100);

			for (int j = 0; j < 6; j++) {

				System.out.print(arr[j] + " ");
			}
		}
	}
}
