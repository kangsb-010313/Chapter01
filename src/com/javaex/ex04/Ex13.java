package com.javaex.ex04;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.[0이면 종료]");
		int sum = 0; //숫자를 누적한 값
		int num;
		
		do {
			num = sc.nextInt(); //숫자 입력
			sum = sum + num ; //합계
			System.out.println("합계: " + sum); //합계출력

		}while(num != 0);

		System.out.println("종료");
		sc.close();
		*/
		
		//============================
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		System.out.println("숫자를 입력하세요.");
		
		while(true) {
			int num = sc.nextInt(); //입력받은 수
			sum = sum + num; //누적
			System.out.println("합계: " + sum); //출력
			
			if(num == 0) { //0이면 끝
				break; //반복문 끝 
			}
		}
		System.out.println("종료");
		
		
		sc.close();
		
		
		
	}

}
