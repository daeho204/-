package javaFinal;

import java.util.Arrays;
import java.util.Scanner;

public class Bonus5 {

	public static void main(String[] args) {
//		5개의 정수를 입력받아 오름차순으로 정렬하여 출력하는 프로그램을 구현하시오.
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print("번째 수 입력 : ");
			arr[i] = sc.nextInt();

		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			} 
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		

	}

}
