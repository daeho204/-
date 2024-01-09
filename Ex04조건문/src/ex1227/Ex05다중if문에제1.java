package ex1227;

import java.util.Scanner;

public class Ex05다중if문에제1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력: ");
		int totalScore = sc.nextInt();
		String grade = "";
		//미리 선언해둔 변수에 기본값을 넣어줄것 ex) string = ""
		//가급적 if/elseif 문에서는 else로 마무리 할것.
		
			
		if(totalScore < 0 || totalScore > 100) {
			System.out.println("잘못된 값입니다");
			//grade = "E";
		}
		  else if (totalScore < 70) {
			grade = "D";
		} else if (totalScore < 80) {
			grade = "C";		} 
		  else if (totalScore < 90) {
			grade = "B";
		} else {
			grade = "A";
		}

		System.out.println(grade + "학점입니다");
	}

}
