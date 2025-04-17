package com.javaex.ex01;

public class Ex09 {

	public static void main(String[] args) {
		
		//대입 연산자 = 
		int a = 7;
		int b = 2;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("------------");
		
		//산술연산자
		int sum = a + b;
		System.out.println(sum); // +
		
		System.out.println(a+b); // +
		System.out.println(a-b); // -
		System.out.println(a*b); // *
		System.out.println(a/b); // 7/2=>(3) 정수이기 때문에 나머지는 버려짐 
		System.out.println(a%b); // 7/2=3---(1) 나머지를 알려줌
		
		System.out.println(7/2); // 3 정수/정수=>정수
		System.out.println(7.0/2); // 7.0/2.0=>3.5
		System.out.println(7.0/2.0);// 3.5
		
		System.out.println("------------");
		
		//부호연산자
		int var = -3;
		int pVar = -var; // -(-3) ==> +3
		System.out.println(pVar);
		
		int mVar = +var; // +(-3) ==> -3
		System.out.println(mVar);
		
		System.out.println("------------");
		
		//증감연산자
		System.out.println(a); // 7
		System.out.println(++a); // 7->8 변수값 변경
		System.out.println(a);
		
		System.out.println(b); // 2
		System.out.println(--b); // 2=>1 변수값 변경
		System.out.println(b); // 1
		
		System.out.println("------------");
		System.out.println(a); // 8
		System.out.println(a++); // 8 	+1, 출력
		System.out.println(a); // 9
		
		System.out.println(b); // 1
		System.out.println(b--); // -1, 출력
		System.out.println(b); // 0
		
		//해야 할 일을 나열. 가장 먼저 할지 가장 나중에 할지 결정
		System.out.println("------------");
		
		int c = 5;
		System.out.println(++c * 2); // 12 / +1, *2, 출력
		System.out.println(c); // 6
		
		int d = 5;
//		d++ *2
		System.out.println(d); // 5
		System.out.println(d++ *2); // 10
		System.out.println(d); // 6
		
		System.out.println(d); //6
		System.out.println(d++ /2); //3
		System.out.println(d); //7
		
		
	}
	
}
