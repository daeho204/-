package javaFestDay3;

import java.util.concurrent.ForkJoinPool;

public class Day3Q3 {
	public static void main(String[] args) {
		
		//for문을 사용하여 A-Z까지 출력하시오
		
		System.out.println((int)'A'); // 65
		System.out.println((int)'Z'); // 90
		
		for (int i = 0; i < 26; i++) {
			System.out.print((char)(i+65) + " ");
			
		}
	}
	


}
