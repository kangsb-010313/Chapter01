package com.javaex.ex05;

public class Ex09 {

	public static void main(String[] args) {

		/*
		int no =5;
		int var = no;
		*/
		
		int[] arrA = new int[3];
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 7;
		
		//이부분이 중요
		int[] arrB = arrA;
		
		
		//arrA 출력
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		System.out.println("========================");
		
		//arrB 출력
		for(int i=0; i<arrB.length; i++) {
			System.out.println(arrB[i]);
		}
		
		System.out.println("========================");
		System.out.println("========================");
		
		//arrB를 통해서 [2]를 100으로 변경
		//arrA 와  arrB 동시에 바뀌는지 확인
		
		arrA[1] = 100;
		
		//arrA 출력
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		System.out.println("========================");
		
		//arrB 출력
		for(int i=0; i<arrB.length; i++) {
			System.out.println(arrB[i]);
		}
		
		System.out.println("========================");
		System.out.println("========================");
		
		arrB[2] = 99;
		
		//arrA 출력
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		System.out.println("========================");
		
		//arrB 출력
		for(int i=0; i<arrB.length; i++) {
			System.out.println(arrB[i]);
		}
	}

}
