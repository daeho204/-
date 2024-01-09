package ex1229;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class Ex03배열예제2 {

	public static void main(String[] args) {
		Random ran = new Random();
		int arr[] = new int[5];
		int maxResult = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(1,10);
			if(maxResult < arr [i]) {
				maxResult = arr[i];
			}
		}
		System.out.print("배열안에 있는 값: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " "); 
			
		}
		System.out.println("가장 큰 값은 :" + maxResult);
//		
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = ran.nextInt(1,10);
//			System.out.println("배열 안에 들어있는 값: " + Arrays.toString(arr));
//			
//			
//			if(maxResult > arr[i]) {
//				maxResult = maxResult;
//			}else {
//				maxResult = arr[i];
//			}
//			
//			
//			
//				
//		
//		}
//		
//		
//		
//		System.out.println("가장 큰 값은" + maxResult + " 입니다.");
//		
	}

}
