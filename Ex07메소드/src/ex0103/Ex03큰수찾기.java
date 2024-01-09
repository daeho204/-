package ex0103;

public class Ex03큰수찾기 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		int result = LargerNumbers(num1, num2);
		System.out.println(result);
		System.out.println(LargerNumbers(2,7));
		System.out.println(LargerNumbers(9,5));
		System.out.println(LargerNumbers(8,15));
		System.out.println(LargerNumbers(6,6));
	}
	
	public static int LargerNumbers(int num1, int num2) {
		if(num1 > num2) {
			return num1;
		}else if(num1 < num2){
			return num2;
			
		}else if(num1 == num2){
		}
			return 0;
		}
	}


