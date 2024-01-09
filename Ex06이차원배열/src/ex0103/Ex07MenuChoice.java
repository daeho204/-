package ex0103;

import java.util.Random;
import java.util.Scanner;

public class Ex07MenuChoice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		// 메뉴 저장용 배열 생성 : 비정방배열로 생성

		String[][] fList = new String[4][];

		// 메뉴타입을 저장할 배열 생성
		String[] mList = { "한식", "중식", "양식", "일식" };

		System.out.println(" 저녁메뉴 추천 프로그램 ");

		while (true) {
			System.out.print("1.메뉴등록  2.메뉴보기  3.추천받기  4.종료 >>  ");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("  <<<<< 메뉴등록 >>>>>  ");
				System.out.print("1.한식  2.중식  3.양식  4.일식 >>  ");
				int row = sc.nextInt();

				System.out.println("등록할 음식의 개수를 입력하세요 >>  ");
				int col = sc.nextInt();

				fList[row - 1] = new String[col];
				for (int i = 0; i < col; i++) {
					System.out.print(i + 1 + "번째 음식입력 >>  ");
					String food = sc.next();
					fList[row - 1][i] = food;
				}

			} else if (choice == 2) {

				System.out.println("  <<<<<메뉴보기>>>>>  ");
				for (int i = 0; i < mList.length; i++) {
					System.out.print(i+1+". "+ mList[i] + ": ");
					
					if(fList[i] != null) {
					for (int j = 0; j < fList[i].length; j++) {
						System.out.print(fList[i][j] + "  ");
						
					}
					}System.out.println();
				}

			} else if (choice == 3) {
				System.out.println("  <<<<<메뉴추천>>>>>  ");
				
	            while (true) {

	                int row = ran.nextInt(mList.length);

	                if (fList[row] != null) {
	                   int col = ran.nextInt(fList[row].length);
	                   System.out.println("오늘의 추천메뉴 : " + fList[row][col]);
	                   break;
	                }

	             }


			} else if (choice == 4) {
				System.out.println("프로그램을 종료합니다");
				break;
			} else {
				System.out.println("정확한 숫자 입력 바람");
			}
		}
	}

}
