package com.javaex.ex05;

public class Ex12 {
	
	//arg = aaa(0x123)
	public static void main(String[] args) {
		//-v : 버전 출력
		//-d : 만든 날짜
		//-n : 작성자

		System.out.println("입력된 옵션---------------------");
		
		/*
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		*/
		
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		
		System.out.println("----------------------------");
		
		
		for(int i=0; i<args.length; i++) {
			if(args[i].equals("-v")) {
				System.out.println("버전 3.0");
			}
			if(args[i].equals("-d")) {
				System.out.println("만든 날짜: 2025-04-28");
			}
			if(args[i].equals("-n")) {
				System.out.println("작성자: 강수빈");
			}
		}
		
	}
	
}
