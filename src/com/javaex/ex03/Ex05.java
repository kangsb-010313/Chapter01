package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("근무시간:");
		int time = sc.nextInt();
		
		double pay;
		
		if(time <= 8) {
			pay = time*10000;
			
		}else{
			int pay2 = time - 8;
			pay = (8 * 10000) + (pay2 * 10000 * 1.5);
		}
		
		System.out.println("임금은 " + (int)pay + "원 입니다.");

		
		sc.close();
		
		
	}
}
