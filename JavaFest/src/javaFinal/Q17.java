package javaFinal;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		//숫자입력후 3의 배수만 출력하기
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {

			System.out.print(i + 1 + "번 째 정수 입력>> ");
			arr[i] = sc.nextInt();

		}

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 3 == 0) {
				System.out.print(arr[i] + " ");
			}

		}

	}

}
