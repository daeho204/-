package javaFestDay3;

public class Day3Q2 {

	public static void main(String[] args) {
//		(77*1) + (76*2) + (75*3) ... +(1*77)
//		를 계산하여 결과를 출력하시오
		
//		((77-0)*(0+1)) + ((77-1)*(0+2))
		
		int sum = 0;
		
		for (int i = 0; i < 78; i++) {
			sum += (77-i)*(i+1);
			
		}
		System.out.println(sum);
	}

}
