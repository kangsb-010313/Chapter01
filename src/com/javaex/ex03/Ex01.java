package com.javaex.ex03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
//		점수를 입력받아 
//		점수가 60점 이상이면 “합격입니다.” 를 출력하세요

		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수:");
		int point = sc.nextInt();
		
		//90 55 60
		if(point >= 60) {
			//true일 때 해야 할 일 나열
			System.out.println("합격입니다.");
		}
		
//		System.out.println("종료");
		
		sc.close();
		
	}
	
}
