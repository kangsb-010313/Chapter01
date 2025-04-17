package com.javaex.ex01;

public class Ex11 {

	public static void main(String[] args) {
		
		//논리 연산자
		int a = 5;
		int b = 7;
		System.out.println("&& 연산자(엄격, 깐깐)---------------");
		
		System.out.println(true && true);   // t && t -> true
		System.out.println(true && false);  // t && f -> false
		System.out.println(false && true);  // f && t -> false
		System.out.println(false && false); // f && f -> false
		
		System.out.println("|| 연산자(널널, 인자함---------------");
		
		System.out.println(true || true);   // t || t -> true
		System.out.println(true || false);  // t || f -> true
		System.out.println(false || true);  // f || t -> true
		System.out.println(false || false); // f || f -> false
		
		System.out.println("! 연산자(반대)---------------------");
		System.out.println(!true); //false
		System.out.println(!false); //true
		
		
		System.out.println("응용-----------------------------");
		boolean result = (a<b) && (a>b); // 5<7 && 5>7 => true && false
		System.out.println(result); // false
		
		System.out.println(true && false || true); // 앞에서부터 t&&f||t / t&&f f, f||t t
		System.out.println(true || false || true); // OR 연산자는 뒤에 누가오든 앞에 true가 오면 t
		
		System.out.println( !(a>b) ); // !f-->t
		
		
		
		
	}
}
