package javaFestDay3;

public class Day3Q1 {

	public static void main(String[] args) {
//		1-2+3-4...+99-100 을 계산하여 출력하는 프로그램 생성
//		i - (1+i) + (1+i) - (1+i)  i++;
//		1 -   2   +   3   -  4
		int sum = 0;
		for (int i = 1; i < 101; i++) {

			if (i % 2 == 0) {
				sum -= i;
			} else {
				sum += i;
			}

		}
		System.out.println(sum);
	}

}
