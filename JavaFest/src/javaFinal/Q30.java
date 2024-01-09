package javaFinal;

import java.util.Scanner;

public class Q30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 알파벳 빈도수 구하기 =====");
		System.out.print("입력>> ");
		String str = sc.nextLine().toLowerCase();
		
//		String[] input = new String[str.length()];
		int[] count = new int[26];
		char[] ch = str.toCharArray();
		for (int i = 0; i < count.length; i++) {
			for (int j = 'a'; j <= 'z'; j++) {
				if(ch[i] == j) {
					count[j-97]++;
				}
				
			}
			
			
		}for (int j = 0; j < count.length; j++) {
			System.out.println((char)(j+97) + ": " + count[j]);
		}
		
		

	}

}
