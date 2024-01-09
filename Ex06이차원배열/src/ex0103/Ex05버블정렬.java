package ex0103;

import java.util.Arrays;
import java.util.Iterator;

public class Ex05버블정렬 {
	public static void main(String[] args) {

		// 치환
//		int num1 = 5;
//		int num2 = 9;
//		int tempo = num2;
//		num2 = num1;
//		num1 = tempo;

		// 정렬 & 서치 알고리즘

		int[] array = { 6, 5, 3, 1, 8, 7, 2, 4 };
		int temp = 0;


		
		for (int i = array.length -1 ; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				if(array[j] > array[j+1]) { //부등호 방향에 따라 오름차순/내림차순 결정
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
				
			}
			
		}

		System.out.println(Arrays.toString(array));

		
//		for (int i = 0; i < array.length; i++) {
//		for (int j = 0; j < array.length; j++) {
//			if (array[i] < array[j]) {
//				temp = array[i];
//				array[i] = array[j];
//				array[j] = temp;
//			}
//
//		}
//	}

	}

}
