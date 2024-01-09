package ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PhoneList {
	public static void main(String[] args) {
		// 이름, 전화번호
		Scanner sc = new Scanner(System.in);

		// PhoneVO 객체를 저장할 ArrayList생성
		ArrayList<PhoneVO> list = new ArrayList<PhoneVO>();

		while (true) {
			System.out.println("1.목록  2.등록  3.삭제  4.검색  5.종료 >> ");
			int menu = sc.nextInt();
			if (menu == 1) {
				for (int i = 0; i < list.size(); i++) {

					System.out.println(i + 1 + "." + list.get(i).getName() + " // " + list.get(i).getPhone());
				}

			} else if (menu == 2) {
				System.out.println("====등록====");
				System.out.println("이름 : ");
				String name = sc.next();
				System.out.println("전화번호 : ");
				String phone = sc.next();

				// PhoneVO 객체 생성
				PhoneVO vo = new PhoneVO(name, phone);
				list.add(vo);
				// 위에 두줄과 같음 (익명객체생성)
				// list.add(new PhoneVO(name,phone));

			} else if (menu == 3) {
				for (int i = 0; i < list.size(); i++) {

					System.out.println(i + 1 + "." + list.get(i).getName() + " // " + list.get(i).getPhone());
				}
				System.out.print("삭제할 번호입력: ");
				int remove = sc.nextInt();
				if (remove <= list.size() && remove > 0) {

					System.out.print(list.get(remove - 1).getName() + "//" + list.get(remove - 1).getPhone() + "를");
					System.out.println("진짜 지울거야 ? (Y/N)");
					String str = sc.next();
					if (str.equals("Y")) {
						list.remove(remove - 1);
					} else {
						System.out.println("잘 생각했어");
					}

				} else {
					System.out.println("없는 숫자입니다.");

				}

			} else if (menu == 4) {
				System.out.println("검색할 이름을 입력하세요: ");
				String name = sc.next();
				//Sequencial Search 순차검색: 성능개쓰레기
				boolean isCheck = true;
				for (int i = 0; i < list.size(); i++) {

					if (name.equals(list.get(i).getName())) {
						System.out.println(list.get(i).getName()+ "의 연락처는: " + list.get(i).getPhone() + "입니다.");
						isCheck = false;

					} 
				}
				//위의 if문에서 회원정보를 찾으면 boolean 변수 isCheck 를 false로 변환
				//for문이 끝나도 true 라면 찾는 회원정보가 없음.
				//else문을 쓰지 않는 이유는 for문안에 if else문에 넣으면
				//sequencial search가 시행되면서 찾지 못할때마다 else문이 반환됨.
				//찾는 결과가 없다는 한번만 출력되면 되기때문에 isCheck를 만들어 사용.
				if(isCheck = true) {
					System.out.println("검색결과가 없습니다.");
				}

			} else if (menu == 5) {
				System.out.println("종료");
				break;
			} else {
				System.out.println("정확한 번호를 입력바람");
			}
		}
	}

}
