package com.javaex.ex03;

import java.util.Scanner;

public class Ex10 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("과목을 선택하세요");
		System.out.println("(1.자바 2.C 3.C++ 4.파이썬)");
		System.out.print("과목번호:");
//		int study = sc.nextInt();
		
		char study = 'A';
		
		switch (study) { //1, 2, 3, 4, 99
			case 1: //code == 1
				System.out.println("R101호");
				break;
				
			case 2: //code == 2
				System.out.println("R202호");
				break;
				
			case 3: //code == 3
				System.out.println("R303호");
				break;
		
			case 4: //code == 4
				System.out.println("R404호");
				break;
				
			default: //나머지 else
				System.out.println("상담원에게 문의하세요");
		}
		
		sc.close();
		
	}
}
