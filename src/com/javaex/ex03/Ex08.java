package com.javaex.ex03;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자: ");
		
		long num = sc.nextLong();
		
		if(num > 0 && num % 2 == 0) {
			System.out.println("짝수입니다.");
			
		}else if(num > 0 && num % 2 != 0) {
			System.out.println("홀수입니다.");
			
		}else if(num < 0) {
			System.out.println("음수입니다.");
			
		}else if(num == 0) {
			System.out.println("0입니다.");
			*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자: ");
		
		long num = sc.nextLong();
		
		if(num > 0) { // 양수일 때
			if(num % 2 == 0) { // 짝수이면
				System.out.println("짝수입니다.");
			
		}else { // 음수이면
				System.out.println("홀수입니다.");
		}
			
		}else if(num < 0) {
			System.out.println("음수입니다.");
			
		}else if(num == 0) {
			System.out.println("0입니다.");
		
		
		
		
		
		
		}
		
		
		sc.close();
		
		
		
	}
	
}
