package javaFinal;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class JavafestPractice {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		String score = "A,A,B,C,D,D,D,F";
		String[] score1 = score.split(",");
		int[] count = new int[5];
		int count1 = 0;
		String[] ch = {"A", "B", "C", "D", "F"};
		System.out.println(Arrays.toString(score1));
		for (int i = 0; i < score1.length; i++) {
			for (int j = 0; j < ch.length; j++) {
				if(ch[i] == score1[j]) {
					count[i]++;
				}
			}
			
		}
		for (int i = 0; i < score.length(); i++) {
			System.out.println(ch[i] + ": " + count[i]);
		}
		
	

	}

}
