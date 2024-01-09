package ex0104;


public class Ex05약수구하기 {

	public static void main(String[] args) {

		getDivisor(10);
		getDivisor(16);
		getDivisor(24);

	}

	public static void getDivisor(int a) {
		System.out.print(a + "의 약수: ");
		for (int i = 1; i < a + 1; i++) {
			if (a % i == 0) {
				System.out.print(i + " ");
			}

		}
		System.out.println();
	}
//	public static void getDivisor(int num) {
//	      
//	      System.out.print(num + "의 약수 : 1 ");
//	      
//	      for(int i = 2; i <= num / 2; i++) {
//	         if(num % i == 0) {
//	            System.out.print(i + " ");
//	         }
//	      }
//	      System.out.println(num);
//	      
//	   }
}
