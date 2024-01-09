package ex1227;

import java.util.Scanner;

public class Ex03if문예제 {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.println("====에버랜드에 오신 걸 환영합니다===");
			System.out.print("나이를 입력하세요: ");
			int age = sc.nextInt();
			System.out.print("인원수를 입력하세요: ");
			int num = sc.nextInt();
			int pay = 5000;
			
			if(age < 20) {
				pay = pay * num / 2;
			}
			else {
				pay *= num;
			}
				
			
			System.out.println("총" + pay + "원입니다. ");
			
			//지역변수: 중괄호 안에서 선언된 변수는 중괄호가 끝날 때 메모리에서 삭제됨
			
		
			
	}

}
