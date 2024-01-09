package javaFinal;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
//		정수 N을 입력받아 N*N배열에 다음과 같이 숫자를 저장하고 출력하시오
//		{{1,2,3,4,5},
//		{10,9,8,7,6},
//		{11,12,13,14,15},
//		{20,19,18,17,16},
//		{21,22,23,24,25}}
		
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 N 입력: ");
		int num = sc.nextInt();
		int[][] arr = new int[num][num];
		int cnt = 1;

		for (int i = 0; i < num; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < num; j++) {
					arr[i][j] = cnt;
					cnt++;

				}

			} else {
				for (int j = num-1; j >= 0; j--) {
					arr[i][j] = cnt;
					cnt++;
				}

			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}

	}

}
