package ex1229;

import java.util.Arrays;
import java.util.Random;

public class Ex04배열숙제 {
	public static void main(String[] args) {
		Random ran = new Random();
		int arr[] = new int[5];
		int temp;

		for (int i = 0; i < 5; i++) {
			arr[i] = ran.nextInt(1, 11);
			System.out.println(Arrays.toString(arr));
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("중복값: " + arr[i]);
					i--;
					break;
					

				}
				//오름차순 정렬 알고리즘. 생각보다 많이 쓰임
				if (arr[i] < arr[j]) {
					temp = arr[i];   
					arr[i] = arr[j];  
					arr[j] = temp;   
				}
			}
		}
		// 오름차순 정렬
//				for (int i = 0; i < arr.length; i++) {
//					for (int j = 0; j < arr.length; j++) {
//						if (arr[i] < arr[j]) {
//							temp = arr[i];
//							arr[i] = arr[j];
//							arr[j] = temp;
//						}
//
//					}
//
//				}

		System.out.println(Arrays.toString(arr));

		System.out.print("당첨번호는>>>");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}

	}
}
