package ex1229;


import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class Ex02배열예제1 {
	public static void main(String[] args) {
	
		int[] arr = new int[5];
		Random ran = new Random();
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(1,101);
			
			if(arr[i]%2 !=0) {
				System.out.print(arr[i] + " 이며 ");
				count++;
				System.out.println(" 총 " + count + " 개입니다.");
				
			

			}
			
			
			
		}
//		System.out.print("array에 들어있는 홀수는 " + Arrays.toString(arr) + "이며,"  + "총 "+ count + "개입니다 \n");
//		Arrays.toString(arrname); = arrname {1,2,3,4,5} 배열 출력
	}

}
