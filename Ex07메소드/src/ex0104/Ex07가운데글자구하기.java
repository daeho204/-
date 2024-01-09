package ex0104;

public class Ex07가운데글자구하기 {

	public static void main(String[] args) {
		System.out.println(getMiddle("power"));
		System.out.println(getMiddle("powerup"));
		System.out.println(getMiddle("test"));
		System.out.println(getMiddle("testing!"));
	}

	// String 은 char로 이뤄진 배열같은 구조이기때문에 .length 사용가능
	// .charAt()은 String의 인덱스번호입력시 해당 인덱스의 char의 값을 가져옴

	// 문자를 문자열로 변환하는 방법
	// char t = 'a';
	// String b = t + "";
	// return b;
	public static String getMiddle(String text) {
			
		if (text.length() % 2 != 0) {

			return text.charAt((text.length()/2)) + "";
		} else{
			return text.charAt(text.length()/2-1) + "" + text.charAt(text.length()/2);

		}
		
		/*
		 * 이렇게도 가능
		int point = text.length()/2;
		char left = text.charAt(point -1);
		char right = text.charAt(point);
		
		
		if(text.length()%2 ==0) {
			return left + "" + right;			
		}else {
			return right + "";
		}
		  */

		
	}

}
