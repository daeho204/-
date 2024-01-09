package ex0102;

public class EX05ArrayCopy {

	public static void main(String[] args) {
		String[] food1 = {"사과", "딸기", "망고"};
		String[] food2 = food1;
		System.out.println(food2[1]);
		food2[1] = "파인애플";
		System.out.println(food2[1]);
		System.out.println(food1[1]);
		//Reference변수의 특징
		//값이 아닌 주소를 담는다 --> 값이 아닌 주소값이 복사가 된다. (132pg)
	}

}
