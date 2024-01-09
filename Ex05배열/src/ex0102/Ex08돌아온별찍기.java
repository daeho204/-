package ex0102;

import java.util.Iterator;
import java.util.Scanner;

public class Ex08돌아온별찍기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] starcount = { 3, 4, 4, 2, 1 };

		// System.out.println(starcount[0]);
		// System.out.println("출력할 별의 개수를 입력: ");
		// int count = sc.nextInt();
		for (int j = 0; j < starcount.length; j++) {
			System.out.print(starcount[j] + " : ");

			for (int i = 1; i <= starcount[j]; i++) {

				// count = starcount[count];

				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
