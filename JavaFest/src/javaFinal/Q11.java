package javaFinal;

import java.util.Iterator;
import java.util.Random;

public class Q11 {

	public static void main(String[] args) {
//		8칸 크기의 배열을 선언하고 랜덤수를 입력한뒤 가장 작은수와 가장 큰수를 출력하라
		int[] arr = new int[8];
		Random ran = new Random();
		int temp = 0;
		System.out.print("배열에 있는 모든 값: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(1, 101);
			System.out.print(arr[i] + " ");

		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.print("가장 큰 값: " + arr[arr.length-1]);
		System.out.println();
		System.out.print("가장 작은 값: " + arr[0]);
	}

}
