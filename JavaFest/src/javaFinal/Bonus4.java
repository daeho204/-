package javaFinal;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Bonus4 {

	public static void main(String[] args) {
		//사용자에게 정수를 입력받아 배열의 인덱스 수 만큼 별을 출력해보세요
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		for (int i = 0; i < 5; i++) {

			System.out.print(i + "번째 별의 수: ");
			arr[i] = sc.nextInt();

		}
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ": ");
			for (int j = 0; j < arr[i]; j++) {
				System.out.print("*");
				
			}System.out.println();
			
		}
		

	}

}
