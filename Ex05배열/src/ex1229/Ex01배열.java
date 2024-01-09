package ex1229;

import java.util.Random;

public class Ex01배열 {

	public static void main(String[] args) {
//		배열 : 같은 자료형을 가진 여러 데이터들을 하나로 묶어 관리하는 자료구조
//		데이터관리에 용이하고, 메모리 검색 효율을 높일 수 있기에 사용한다.
		
//		1. 배열 생성
//		정수 데이터를 담는 5칸짜리 배열
		
//		래퍼런스 구조란:
//		배열 등 용량이 큰 구조들은 heap에 생성 하고 변수에는 주소값만을 저장해서 참조하는 구조
		int[] arr = new int[5];
		System.out.println(arr);
		//실행시키면 [I@626b2d4a 가 나오는데 I는 int배열이라는뜻, 뒤는 값이아닌 주소값이 출력됨
		
		//인덱스를 이용한 배열의 데이터 접근
		//래퍼런스변수명 [인덱스번호];
		//배열 생성 시에 기본값 세팅 : 0
		System.out.println(arr[4]);
		
		//배열의 길이
		System.out.println(arr.length);
		
		//예제 : arr모든방에 1~10 랜던한 수를 집어넣기
		Random ran = new Random();
		arr[0] = ran.nextInt(1,11);
		arr[1] = ran.nextInt(1,11);
		arr[2] = ran.nextInt(1,11);
		arr[3] = ran.nextInt(1,11);
		arr[4] = ran.nextInt(1,11);
		System.out.println(arr[0]);
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=ran.nextInt(1,1001);
			System.out.println(arr[i]);
		}
	
	}

}
