package javaFinal;

import java.util.Iterator;

public class Q15 {

	public static void main(String[] args) {
//		아래와 같이 성적정보가 문자열로 선언되어있을 때, 각 성적별 학생 수 출력
//		String score = "A,A,B,C,D,A,C,D,D,D,F";
		String score = "A,A,B,C,D,A,C,D,D,D,F";
		int cntA = 0;
		int cntB = 0;
		int cntC = 0;
		int cntD = 0;
		int cntF = 0;

		for (int i = 0; i < score.length(); i++) {
			if (score.charAt(i) == 'A') {
				cntA++;

			} else if (score.charAt(i) == 'B') {
				cntB++;

			} else if (score.charAt(i) == 'C') {
				cntC++;

			} else if (score.charAt(i) == 'D') {
				cntD++;

			} else if (score.charAt(i) == 'F') {
				cntF++;

			}

		}

		System.out.println("A : " + cntA + "명");
		System.out.println("B : " + cntB + "명");
		System.out.println("C : " + cntC + "명");
		System.out.println("D : " + cntD + "명");
		System.out.println("F : " + cntF + "명");
	}

}
