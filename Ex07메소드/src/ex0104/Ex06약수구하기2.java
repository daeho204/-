package ex0104;

public class Ex06약수구하기2 {

	public static void main(String[] args) {
//		startValue 부터 endValue까지의 약수를 구하는 getDivisor()메소드 구현

		int startValue = 10;
		int endValue = 36;
		getDivisor(startValue, endValue);

	}

	// a 약수
	// a + 1의 약수
	// a + 2의 약수
	public static void getDivisor(int a, int b) {

		for (int i = a; i <= b; i++) {
			System.out.print(i + "의 약수 : ");
			for (int j = 1; j <= b; j++) {
				if (i % j == 0) {
					System.out.print(j + " ");

				}
			}

			System.out.println();
			
		}

	}

}
