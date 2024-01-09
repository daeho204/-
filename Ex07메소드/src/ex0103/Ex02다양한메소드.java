package ex0103;

import java.util.Random;
import java.util.Scanner;

public class Ex02다양한메소드 {

	public static void main(String[] args) {
		hello();
		
		hi("점심"); //매개변수가 있는 매소드이기때문에 반드시 String이 들어가야함
		
		int num1 = lotto();
		System.out.println(num1);
		
		int sum = result(10,15);
		System.out.println(sum);
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1입력:  ");
		int a = sc.nextInt();
		System.out.print("정수2입력:  ");
		int b = sc.nextInt();
		int sum1 = result(a,b);
		System.out.println("result:  " + sum1);
		
	}
	public static void hello() { //매개변수(parameter, argument) X 리턴(return)X
		System.out.println("Hello");
		
	}
	
	public static void hi(String text) { //매개변수 String text 는 있지만 리턴은 없음.
		System.out.println("좋은 " + text + " 이에요");
		
	}
	
	public static int lotto() { //매개변수는 없지만 리턴은 있음
		//리턴타입을 명시하는 순간, 반드시 어떤일이 일어나도 리턴을 해줘야한다.
		Random ran = new Random();
//		int num = ran.nextInt(1,46);
		int num = ran.nextInt(45) + 1;
		return num;
	}
	public static int result(int num1, int num2) {
		
		return num1 + num2;
	}
}
