package javaFinal;

public class Q14 {

	public static void main(String[] args) {
		//가운데 글자 구하기
		
		System.out.println(getMiddle("power"));
		System.out.println(getMiddle("powerup"));
		System.out.println(getMiddle("test"));
		System.out.println(getMiddle("testing!"));
	}

	public static String getMiddle(String text) {

		if (text.length() % 2 != 0) {

			return text.charAt((text.length() / 2)) + "";
		} else {
			return text.charAt(text.length() / 2 - 1) + "" + text.charAt(text.length() / 2);

		}

		/*
		 * 이렇게도 가능 
		 * int point = text.length()/2; 
		 * char left = text.charAt(point -1); 
		 * char right = text.charAt(point);
		 * 
		 * 
		 * if(text.length()%2 ==0) { return left + "" + right; }else { return right +
		 * ""; }
		 */

	}

}
