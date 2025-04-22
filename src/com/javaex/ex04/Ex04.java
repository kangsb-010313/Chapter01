package com.javaex.ex04;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		//Ex02.java 구구단 for 반복문으로 해보기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단을 입력해주세요");
		System.out.print("단: ");
		int dan = sc.nextInt();
		
		for (int i=1; i<=9; i++) {
			System.out.println(dan + " * " + i + " = " + dan*i);
			
		}

		sc.close();
	}

}
