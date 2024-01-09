package ex1228;

public class Ex07switch문 {

	public static void main(String[] args) {


//		switch - case
//		swtich case 문에서 break 가 없다면 일치하는 값 밑의 모든 결과값이 같이 출력됨
//		ex) switch(값) == case (값) 하면 그밑의 값이 전부 출력
		int num = 1;
		
		//switch(값으로 떨어지는 식)
		switch (num) {
		
		case 1: //case 값: 실행문장
				//식의 결과값이 case와 같으면 실행
			System.out.println("case 1");
			break;
			
		case 2:
			System.out.println("case 2");
		
		default: //위의 케이스에 해당하지 않는 모든 경우. Else와 같음
			System.out.println("default");
		
		}
	}

}
