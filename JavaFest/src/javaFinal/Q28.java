package javaFinal;

import java.util.Arrays;
import java.util.Scanner;

public class Q28 {

	public static void main(String[] args) {
		// 입력받은 2진수를 10진수로 변경해 출력
		// 쉬운방법: Intger.parseInt(str1, 원하는진수)
		// ex)
//		String str = "1011";
//		int str1 = Integer.parseInt(str, 2);
//		System.out.println(str1);

		Scanner sc = new Scanner(System.in);
		System.out.println("2진수 입력: ");
		String str = sc.next();
		int str1 = Integer.parseInt(str);
		int[] arr = new int[str.length()];
		int two = 1;
		int i = 0;
		int sum = 0;

		while(str1>0) {
			arr[i++] = str1%10;
			str1 = str1/10;
		}
		System.out.println(Arrays.toString(arr));
		
		for (int j = 0; j < arr.length; j++) {
			sum += arr[j]*two;
			two *= 2;
			
		}
		
	
		System.out.println(str + "(2)" + " = " + sum + "(10)");


	}

}
