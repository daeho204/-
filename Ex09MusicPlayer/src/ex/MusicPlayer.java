package ex;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class MusicPlayer {
	public static void main(String[] args) {
		
		//MP3 파일 실행할 수 있는 객체 생성
		MP3Player mp3 = new MP3Player();
		
		//음악 임포트 하는 방법
		// mp3.play("C:\\Java\\music_v2\\Rain - 깡.mp3");
		
		// 뮤직플레이어
		// 뮤직객체 3개를 생성 후 원하는 노래정보 입력

		Music m1 = new Music("깡", "Rain", 150, "C:\\Java\\music_v2\\Rain - 깡.mp3");
		// Get Set 이용하여 입력
//		m1.setName("Drama");
//		m1.setSinger("에스파");
//		m1.setPlayTime(150);

//		System.out.println(m1.getName());
//		System.out.println(m1.getSinger());
//		System.out.println(m1.getPlayTime());

		// 사용자 정의 생성자를 이용하여 입력
		Music m2 = new Music("벌써 12시", "청하", 170, "C:\\Java\\music_v2\\CHUNG HA - 벌써 12시.mp3");
		Music m3 = new Music("NO ONE", "이하이", 195, "C:\\Java\\music_v2\\이하이 - NO ONE.mp3");
		Music m4 = new Music("FANCY", "TWICE", 125, "C:\\Java\\music_v2\\TWICE - FANCY.mp3");
		Music m5 = new Music("SOLO", "JENNIE", 177, "C:\\Java\\music_v2\\JENNIE - SOLO.mp3");

		// 하나의 뮤직 리스트로 만들기
		// Ctrl + Shift + O = import 단축키
		ArrayList<Music> musicList = new ArrayList<Music>();
		// Music이라는 Class 가 데이터 타입이기때문에 자료형 자리에 Music을 넣음.
		musicList.add(m1);
		musicList.add(m2);
		musicList.add(m3);
		musicList.add(m4);
		musicList.add(m5);

		Scanner sc = new Scanner(System.in);
		int point = 0;
		while (true) {
			System.out.print("1.목록  2.재생  3.이전곡  4.다음곡  5.종료 >> ");
			int menu = sc.nextInt();
			if (menu == 1) {
				System.out.println("=====Play List=====");
				for (int i = 0; i < musicList.size(); i++) {
					System.out.println(i + 1 + "." + musicList.get(i).getName() + "-" + musicList.get(i).getSinger()
							+ "(" + musicList.get(i).getPlayTime() + "초)");
				}
				// foreach문으로 작성
//				for (Music music : musicList) {
//					System.out.println(i+1 + "." + music.getName() + "-" + music.getSinger() + "(" + music.getPlayTime() + "초)");
//					
//				}

			} else if (menu == 2) {
				System.out.println(point + 1 + "." + musicList.get(point).getName() + "-"
						+ musicList.get(point).getSinger() + "(" + musicList.get(point).getPlayTime() + "초)");
				if(mp3.isPlaying()) {
					mp3.stop();
				}
				mp3.play(musicList.get(point).getPath());

			} else if (menu == 3) {
				//이전곡 선택
				if (point == 0) {
					System.out.println("이전곡이 없음");
				}

				else {
					point--;
					System.out.println(point + 1 + "." + musicList.get(point).getName() + "-"
							+ musicList.get(point).getSinger() + "(" + musicList.get(point).getPlayTime() + "초)");
					

				}
				if(mp3.isPlaying()) {
					mp3.stop();
				}
				mp3.play(musicList.get(point).getPath());

			} else if (menu == 4) {
				// 다음곡 선택
				if (point == 4) {
					System.out.println("다음곡이 없음");
				}

				else {
					point++;
					System.out.println(point + 1 + "." + musicList.get(point).getName() + "-"
							+ musicList.get(point).getSinger() + "(" + musicList.get(point).getPlayTime() + "초)");

				}
				if(mp3.isPlaying()) {
					mp3.stop();
				}
				mp3.play(musicList.get(point).getPath());

			} else if (menu == 5) {
				System.out.println("종료");
				if(mp3.isPlaying()) {
					mp3.stop();
				}
				break;
			} else {
				System.out.println("올바른 숫자 입력바람");
			}
		}

	}

}
