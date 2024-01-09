package javaFinal;

import java.util.Scanner;

public class Q20 {

	public static void main(String[] args) {
//		10진수 정수를 입력받아 2진수로 변환해서 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력>>");
		//편법
//		String binary = Integer.toBinaryString(input);
//		
//		System.out.println(binary);
		
		int input = sc.nextInt();
		int[] arr = new int[32];
		int i = 0;
		//1이 될때까지 나머지는(0,1) arr에 넣고 2로나눈 몫은 다시 input 으로
		while(input != 1) {         
			arr[i++] = input%2;		
			input = input/2;		
		}
		arr[i] = input; //input 이 1이되어서 더이상 안나눠지면 while문 마지막의 인풋값을 arr에 i 째에 입력
		//반대로 출력
		for (int j = i; j >= 0; j--) {
			System.out.print(arr[j] + " ");
			
		}
		
	}

}
