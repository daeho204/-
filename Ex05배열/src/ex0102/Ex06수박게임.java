package ex0102;

import java.util.Iterator;
import java.util.Scanner;

public class Ex06수박게임 {

	public static void main(String[] args) {
		char[] text = { '수', '박' }; // char은 길이가 2. 0,1 인덱스만 존재
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 수박게임 Start! ====");
		System.out.print("숫자를 입력해 주세요 >>  ");
		int num = sc.nextInt();
		

		for (int i = 0; i < num; i++) {
			
			System.out.print(text[i % 2]);
			
			
		}
		
		
		
	}

}
