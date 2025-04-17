package com.javaex.ex01;

public class Ex10 {

	public static void main(String[] args) {
		
		//관계연산자
		int a = 5;
		int b = 3;
		
		System.out.println(a<b); // 5<3 --> false
		System.out.println(a>b); // 5>3 --> true
		
		System.out.println(a<=b); // 5<=3 -->false
		System.out.println(a>=b); // 5>=3 -->true
		
		System.out.println(a==b); // 5=3 --> false
		System.out.println(a!=b); // 5!=3 --> true (!= 다른가?)
		
		System.out.println("------------");
		
		boolean result = a==b;
		System.out.println(result);
		
		
	}
}
