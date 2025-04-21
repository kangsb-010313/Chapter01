package com.javaex.ex03;

import java.util.Scanner;

public class Ex11 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("과목을 선택하세요");
		System.out.println("(1.자바 2.C 3.C++ 4.파이썬)");
		System.out.print("과목번호:");
		String study = sc.nextLine();
		
		switch (study) { //A, B, C, D, EFG
			case "A": //code == "A" -->문법은 틀림. 코드값으로 보지 말고 참고만 할 것/ 문자 입력 시 ""
				System.out.println("R101호");
				break;
				
			case "B": //code == B
				System.out.println("R202호");
				break;
				
			case "C": //code == C
				System.out.println("R303호");
				break;
		
			case "D": //code == D
				System.out.println("R404호");
				break;
				
			default: //나머지 else
				System.out.println("상담원에게 문의하세요");
		}
		
		sc.close();
		
	}
}
