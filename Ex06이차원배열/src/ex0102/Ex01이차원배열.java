package ex0102;

import java.util.Arrays;

public class Ex01이차원배열 {
	public static void main(String[] args) {
		// pg138

		// 이차원배열
		// -데이터를 효과적으로 저장하기위해 사용됨
		// -데이터를 배열 안에 배열 형태로 저장

		// 3행3열의 int형 배열 만들기
		// {1,2,3}
		// {4,5,6}
		// {7,8,9}
		// [행][열]
		int[][] array = new int[3][3];

		// 0행에 값 넣기
		int cnt = 1;
//		array[0][0] = cnt;
//		cnt++;
//
//		array[0][1] = cnt;
//		cnt++;
//
//		array[0][2] = cnt;
//		cnt++;
//
//		// 1행
//		array[1][0] = cnt;
//		cnt++;
//
//		array[1][1] = cnt;
//		cnt++;
//
//		array[1][2] = cnt;
//		cnt++;
//
//		// 2행
//		array[2][0] = cnt;
//		cnt++;
//
//		array[2][1] = cnt;
//		cnt++;
//
//		array[2][2] = cnt;
//		cnt++;

		// System.out.println(Arrays.toString(array));

		// 미리 배열을 채워넣고 출력
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {

				for (int j = 0; j < array[i].length; j++) {
					array[i][j] = cnt;
					cnt++;

				}
				
			} else {
				for (int j = 0; j < array.length; j++) {
					array[i][j] = cnt;
					cnt++;

				}

			}

		}

		// 배열에 입력과 동시에 출력

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {

				System.out.print(array[i][j] + " ");

			}

			System.out.println();

		}

	}

}
