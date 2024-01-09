package ex03;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		//배열 : 길이가 고정되어 있다 & 정해진 자료형만 넣을 수 있다.
		//가변배열 (ArrayList) : 길이조절이 가능한 배열 - 입력하면 늘어나고 삭제하면 줄어든다
		
		//ArrayList 만들기
		//ArrayList<자료형> 이름 = new 생성자 (이경우 ArrayList<String>();
		ArrayList<String> list = new ArrayList<String>();
		
		//ArrayList에 값 넣기
		list.add("김대호");
		list.add("김동현");
		list.add("이주형");
		list.add("박민석");
		list.add("엄윤준");
		list.add("박병관");
		
		//삭제
		list.remove(2);
		
		//원하는 위치에 추가
		//1번 인덱스 앞으로 손흥민 추가
		list.add(1, "손흥민" );

		
		//길이확인
		System.out.println(list.size());
		
		//값출력
		System.out.println(list.get(0));
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
			
		}
		System.out.println();
		
		for (String str : list) {
			System.out.print(str + " ");
			
		}
	}

}
