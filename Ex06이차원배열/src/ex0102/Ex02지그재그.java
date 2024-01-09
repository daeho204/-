package ex0102;

import java.util.Iterator;

public class Ex02지그재그 {
	public static void main(String[] args) {

		// 5 x 5 정수형 2차원 배열을 생성 후 아래와 같이 값을 넣고 출력하시오

		// 1 2 3 4 5
		// 10 9 8 7 6
		// 11 12 13 14 15
		// 20 19 18 17 16
		// 21 22 23 24 25

		int[][] array = new int[5][5];

		int cnt = 1;

		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {

				for (int j = 0; j < array[i].length; j++) {
					array[i][j] = cnt;
					cnt++;
					
				}
			} else {
				for (int j = 0; j < array[i].length; j++) {
					array[i][(array[i].length - 1) - j] = cnt;
					cnt++;

					
				}
			}

		}
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array[i].length; j++) {
//				System.out.print(array[i][j] + " ");
//			}
//			System.out.println();
//		}

		
		// for-each문으로 풀이
		for (int[] arr : array) {
			for (int num : arr) {
				System.out.print(num + " ");
				
			}
			System.out.println();
		}

	}

}
