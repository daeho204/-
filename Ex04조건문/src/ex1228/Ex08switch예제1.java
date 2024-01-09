package ex1228;

import java.util.Scanner;

public class Ex08switch예제1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력: ");
		int totalScore = sc.nextInt();
		char grade;
		
		switch (totalScore/10) {
		case 9,10 : 
			grade = 'A';			
			break;
		case 8 :
			grade = 'B';
			break;
		case 7 :
			grade = 'C';
			break;
		default:
			grade = 'D';
		}
		System.out.println(grade);	
		}

}
