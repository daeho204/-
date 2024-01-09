package ex0102;

import java.util.Scanner;

public class Ex07AnswerCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//입력한 답을 저장한 배열
		int[] input = new int[5];
		//실제 정답을 담은 배열
		
		int[] answer = {1, 4, 3, 2, 1};
		int score = 0;
		
		
		System.out.println("==채점하기==");
		
		System.out.println("답을 입력하세요");
		
		
		for (int i = 0; i < input.length; i++) {
			
			
			System.out.println(i+1 + "번답 >>");
			input[i] = sc.nextInt();
			
		}
		
		System.out.print("입력한답은: ");
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + "\t");
			
		}
		
		System.out.println();
		System.out.print("정답은>>>");
		for (int i=0; i<input.length; i++) {
		if(input[i]==answer[i]) {
			System.out.print(" O\t");
			score+=20;
			
		}
		else {
			System.out.print("X\t");
		}
		}
		System.out.println();
		System.out.println("총점은: " + score + "점 입니다.");
	
	}

}
