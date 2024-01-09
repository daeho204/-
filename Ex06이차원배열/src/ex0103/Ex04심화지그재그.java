package ex0103;

import java.util.Iterator;
import java.util.Scanner;

public class Ex04심화지그재그 {

	public static void main(String[] args) {

		// 정수를 입력받고 입력받은 수만큼 이차원배열의 행과 열의 크기를 결정
		// 3을 입력받으면 3*3배열이 생성
		// 해당크기의 배열이 남김없이 지그재그로 채워넣는다
		// 3입력시
		// 1 6 7
		// 2 5 8
		// 3 4 9

//		0 0
//		1 0
//		2 0
//		
//		2 1
//		1 1
//		0 1
//		
//		0 2
//		1 2
//		2 2

		Scanner sc = new Scanner(System.in);

		System.out.print("정수입력 : ");
		int num = sc.nextInt();

		int[][] array = new int[num][num];

		int cnt = 1;

		for (int i = 0; i < num; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < num; j++) {

					array[j][i] = cnt;
					cnt++;
					
				}
			} else {
				for (int j = 0; j < num; j++) {
					
					array[(num-1)-j][i] = cnt;
					cnt++;

				}
			}
			
			
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j]);
			}System.out.println();
		}
//		for (int[] arr : array) {
//			for (int number : arr) {
//				System.out.print(number + " ");
//				
//			}
//			System.out.println();
//		}
		

//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array.length; j++) {
//				
//				System.out.print(array[i][j] + " ");
//				
//				
//			}System.out.println();
//			
//		}

//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array.length; j++) {
//				array[i][j] = cnt;
//				System.out.print(array[i][j] + " ");
//				cnt++;
//
//			}
//			System.out.println();
//
//		}
	}

}
