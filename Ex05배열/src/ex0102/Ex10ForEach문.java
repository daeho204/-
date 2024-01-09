package ex0102;

public class Ex10ForEach문 {

	public static void main(String[] args) {
		//확장 for문 : for-each문
		//배열의 원소에 순차적으로 다 접근해서 사용해야할때  (인덱스 0 부터 끝까지)
		//편리하게 쓸 수 있는 반복문
		
//		for( 자료형 변수명 :  배열/리스트){}
		
//		문자열 배열안에 있는 값을 for-each로 꺼내보기
		
		String[] foods = {"갈매기살", "된장찌개", "동치미냉국수", "참이슬"	};
		for(String food : foods) {
			
			System.out.println(food);
			
			
		}
	}

}
