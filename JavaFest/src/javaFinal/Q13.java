package javaFinal;

import java.util.Iterator;
import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {

//		정수 N을 입력받아 N*N배열에 다음과 같이 숫자를 저장하고 출력하시오
//		{{1,6,11,16,21},
//		{2,7,12,17,22},
//		{3,8,13,18,23},
//		{4,9,14,19,24},
//		{5,10,15,20,25}}
		Scanner sc = new Scanner(System.in);
		System.out.print("정수N 입력: ");
		int num = sc.nextInt();
		int[][] array = new int[num][num];
		int cnt = 1;

		for (int i = 0; i < array.length; i++) {
			
				for (int j = 0; j < array[i].length; j++) {
					array[j][i] = cnt;
					cnt++;
				

			} 
			

		}
		System.out.println();
		for (int[] arr : array) {
			for (int num1 : arr) {
				System.out.print(num1 + " ");

			}
			System.out.println();
		}
	}

}
