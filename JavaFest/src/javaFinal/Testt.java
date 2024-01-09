package javaFinal;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Testt {

	public static void main(String[] args) {
//		정수 N을 입력받아 N*N배열에 다음과 같이 숫자를 저장하고 출력하시오
//		{{1,2,3,4,5},
//		{10,9,8,7,6},
//		{11,12,13,14,15},
//		{20,19,18,17,16},
//		{21,22,23,24,25}}
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수 : ");
//		int input = sc.nextInt();
//		int[] arr = new int[16];
//		int count = 0;
//		
//		while(input != 1) {
//			arr[count++] = input %2;
//			input = input / 2;
//			
//		}
//		arr[count] = input;
//		
//		for (int i = count; i >= 0; i--) {
//			System.out.print(arr[i] + " ");
//			
//		}
//		Scanner sc = new Scanner(System.in);
//		int[] arr = new int[5];
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("숫자: ");
//			int input = sc.nextInt();
//			arr[i] = input;
//		}
//		
//		System.out.println(Arrays.toString(arr));
//		int base = 2;
//		int n =3;
//		int sum = 1;
//		for (int i = 0; i < n; i++) {
//			
//			sum *= base;
//			
//		}
//		System.out.println(base);
//		
//		String str = "10111101";
//		String[] str1 = str.split("");
//		System.out.println(Arrays.toString(str1));
 
		//대문자 A = 65 
		//소문자 a = 97
//		char ch = 'a';
//		System.out.println((int)ch);
		
//		int A = 65;
//		int a = 97;
//		char[] charArr = new char[32];
//		
//		for (int i = 0; i < 32; i++) {
//			for (int j = 0; j < 32; j++) {
//				if(charArr[i] == charArr[j]) {
//					A = a;
//				}
//				
//			}
//			
//		}System.out.println(a);
//		System.out.println(A);
		
		Scanner sc = new Scanner(System.in);
	      System.out.print("입력>> ");
	      String str = sc.nextLine().toLowerCase();
	      int[] arr = new int[26];


	      for (int i = 0; i < str.length(); i++) {
	         if(str.charAt(i)!=' ') {
	            int ch = (int) str.charAt(i);
	            arr[ch - 97]++;
	         }
	         
	      }

	      for (int i = 0; i < 26; i++) {
	         System.out.println((char) (i + 97) + " : " + arr[i]);
	      }
		
	}

}
