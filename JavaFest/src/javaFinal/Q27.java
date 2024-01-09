package javaFinal;

import java.util.Iterator;
import java.util.Scanner;

public class Q27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 채점하기 ====");
		String score = sc.next();
		int count = 1;
		int sum = 0;

		for (int i = 0; i < score.length(); i++) {
			switch (score.charAt(i)) {
			case 'O': {
				sum += count++;
				break;

			}
			case 'X': {
				count = 1;
				break;
			}

			}

		}System.out.println(sum);

		// 방법2 String배열만들어서 안의 문자 .split으로 잘라서 스위치케이스문 작성
//		String[] str = new String[score.length()];
//		str = score.split("");

//		
//		for (int i = 0; i < str.length; i++) {
//			switch (str[i]) {
//			case "O": {
//				count++;
//				sum += count;
//				break;
//			}
//			case "X": {
//				count = 0;
//				break;
//			}
//			}
//		}
//		System.out.println(sum);
	}

}
