package ex1227;

public class test {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 7;
		float num3 = 10.0f;
		float num4 = 7.0f;
		
		String str1 = "20";
		
		System.out.println(num1/num2);
		System.out.println(num3/num4);
		System.out.println(num1/num4);
		System.out.println(num1+str1);
		
		//산술연산 시 더 큰쪽에 형이 맞춰서 형변환이 이뤄짐
		//str + int = str
	}

}
