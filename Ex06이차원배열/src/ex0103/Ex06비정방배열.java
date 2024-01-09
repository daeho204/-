package ex0103;

import java.util.Arrays;

public class Ex06비정방배열 {
	public static void main(String[] args) {
		// pg140

		int[][] array = new int[4][];
		array[0] = new int[2];
		array[1] = new int[3];
		array[2] = new int[1];
		array[3] = new int[4];

		int cnt = 1;
		// 0행
//		array[0][0] = cnt;
//		cnt++;
//		array[0][1] = cnt;
//		cnt++;
		// 1행
//		array[1][0] = cnt;
//		cnt++;
//		array[1][1] = cnt;
//		cnt++;
//		array[1][2] = cnt;
//		cnt++;

		// 2행
//		array[2][0] = cnt;
//		cnt++;
		

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = cnt;
				cnt++;

			}
		}
		
		for (int[] arr : array) {
			for (int num : arr) {
				System.out.print(num + " ");
				
			}
			System.out.println();
		}
		
		//for문 없이 이런식으로 만들어도 됨
		int[][] array2 = {{1,2},
						   {3,4,5},
						   {6},
						   {7,8,9,10}};
		

	}
}
