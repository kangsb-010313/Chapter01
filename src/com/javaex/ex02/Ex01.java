package com.javaex.ex02;

public class Ex01 {
	public static void main(String[] args) {
		
		System.out.println("안녕");
		System.out.println("하시렵니까");
		
		System.out.print("안녕");
		System.out.println("하시렵니까");
		
		System.out.println("--------------------");
		
		int i = 2345;
		double d = 3.14;
		char c = '한';
		
		String s = "한";
		String str = "굿모닝";
		String name = "강수빈";
		
		System.out.println(i);
		System.out.println(str);
		System.out.println(5+3);
		System.out.println(str + name);
		System.out.println(str + name + str);
		
		System.out.println(i + i); //정수 + 정수
		System.out.println(i + d); //정수 + 실수 =>실수(자동형변환)+실수
		System.out.println(str + i); // 문자열 + 정수
		System.out.println(str + d); // 문자열 + 실수
		
		String result = name + d; //문자열 + 정수 =>문자열, 문자열 + 실수 => 문자열
		System.out.println(result);
		
		System.out.println("-------------------------------");
		
		//굿모닝랑강수빈
		
		//ex1
		String r = "랑";
		System.out.println(str + r + name);
		
		//ex2
		System.out.println(str + "랑" + name);
		
		//굿모닝 랑 강수빈
		System.out.println(str + " 랑 " + name);
		
		//굿모닝 강수빈
		System.out.println(str + " " + name);
		
		//제이름은 강수빈 입니다.
		System.out.println("제이름은 " + name + " 입니다.");
		
		System.out.println("-------------------------");
		System.out.println(c); //한
		System.out.println(c + c); //한한 char 형(코드값 숫자로 관리)은 + 숫자더하기 
		System.out.println("c" + "c");
		
		System.out.println("-------------------------");
		
		//제이름은 "강수빈" 입니다.
		//ex1
		System.out.println("제이름은 \"" + name + "\" 입니다.");
		//ex2 (굳이)
		System.out.println("제이름은 " + '"' + name + '"' + " 입니다.");
		
		//제이름은 \강수빈\ 입니다.
		System.out.println("제이름은 \\" + name + "\\ 입니다.");

		
		System.out.println("제이름은\t" + name + "\t입니다.");
		System.out.println("나의이름은\t" + name + "입니다.");
		System.out.println("나의이름은\n" + name + "입니다.");
	
	
	
	}
	
}
