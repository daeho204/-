package ex0103;

public class Ex01메소드 {

	public static void main(String[] args) {
//		메소드란 : 필요한 코드를 묶어놓은 집합체 (기능)

		// 짜장면 만들기
		makeJjajang();
		makeJjambbong();
		makeTangsu();

	}

	// 짜장면 만드는 메소드를 만들기
	public static void makeJjajang() {

		// 짜장면 만들기
		System.out.println("면을 삶고");
		System.out.println("면위에 짜장 소스를 부은 후");
		System.out.println("얇게 채썬 오이와 완두콩을 올리고");
		System.out.println("삶은계란 반쪽으로 마무리");
		System.out.println("--------------------------end");

	}

	public static void makeJjambbong() {

		// 짬뽕 만들기
		System.out.println("양파, 배추, 당근 등 버섯을 제외한 야채를 파기름에 볶는다");
		System.out.println("고추가루를 넣고 살짝 볶자마자 육수를 부어준다");
		System.out.println("국물이 끓어오르면 목이버섯과 해산물을 넣고 끓여준다음");
		System.out.println("삶은 면위에 부어주면 끝");
		System.out.println("--------------------------end");
	}

	public static void makeTangsu() {

		// 탕수육 만들기
		System.out.println("얄개 저민 돼지고기에");
		System.out.println("밀가루 물 1:1 비율에 넣은다음");
		System.out.println("튀겨낸다");
		System.out.println("--------------------------end");

	}

}
