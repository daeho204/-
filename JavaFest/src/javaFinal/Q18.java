package javaFinal;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Q18 {
	public static void main(String[] args) {
		// 중복없이 숫자를 뽑는 로또 프로그램을 만드시오
		Random ran = new Random();
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(1, 6);
			for (int j = 0; j < i; j++) {

				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
			
		}
		for (int j = 0; j < arr.length; j++) {
			
			System.out.println("행운의 숫자: " + arr[j]
					);
		}

	}

}
