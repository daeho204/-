package javaFinal;

import java.util.Scanner;

public class Q25 {

	public static void main(String[] args) {
		// 대시('_')문자로 구성된 형태의 숫자를 주어진 숫자와 같이 출력하고싶을때 
		//사용되게 하는 대시의 개수를 출력하는 프로그램 작성
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요>> ");
		int input = sc.nextInt();
		System.out.print("대시('_')의 총 합>> ");
		
		int result = 0; //결과값 담을 변수
		int[] count = {6,2,5,5,4,5,6,3,7,6}; //0-9까지의 대쉬 갯수를 배열에 저장
		while(input > 0) { 
			int num = input%10;   //계속 10으로 나눠서 나머지를 num에 넣을거고 
			input /= 10;			//몫은 input 에 다시 넣은다음
			result += count[num];	//카운트 배열의 num번째 인덱스 값만큼 result에 계속 더함
		}
		System.out.println(result);
		
		/*과정예시
		 * input = 1234
		 * 1234%10 = 4   4---> num에 넣고
		 * 1234/10 = 123 ----> input 에 넣고
		 * result = 0 += count[4] 
		 * result = 4 저장
		 * input이 0보다 작아지면 while문 종료
*/		
	
		
		
	
		
	}

}
