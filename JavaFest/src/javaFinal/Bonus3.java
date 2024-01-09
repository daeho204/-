package javaFinal;

public class Bonus3 {
public static void main(String[] args) {
	int num = 50;
	int num1 = 15;
	char op = '-';
	
	System.out.println(cal(num,num1,op));
}
public static int cal(int num, int num1, char op) {
	if(op == '+') {
		return num + num1;
	}
	else if (op == '-') {
		return num - num1;
	}else if (op == '*') {
		return num * num1;
	}else if (op == '/') {
		return num/num1;
	}else {
		return 0;
	}
	
}
}
