package javaFinal;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class JavaFest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("N입력: ");
		int inputN = sc.nextInt();
		System.out.println("X입력: ");
		int inputX = sc.nextInt();

		int[] arr = new int[inputN];

		for (int i = 0; i < arr.length; i++) {
			System.out.println((i + 1) + "번째 정수입력: ");
			int input = sc.nextInt();

			if (input < inputX) {
				arr[i] = input;
			} else {
				arr[i] = 0;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				System.out.print(arr[i] + " ");
			}
		}

	}
}
