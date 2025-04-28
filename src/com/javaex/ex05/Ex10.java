package com.javaex.ex05;

public class Ex10 {

	public static void main(String[] args) {

		int[] arrA = new int[3];
		arrA[0]= 3;
		arrA[1]= 6;
		arrA[2]= 7;
		
		
		int[] arrB = new int[3];
		
		//같은 방끼리 값을 복사
		//ex08 참고
		for(int i=0; i<3; i++) {
			arrB[i] = arrA[i];
		}
		/*
		arrB[0] = arrA[0];
		arrB[1] = arrA[1];
		arrB[2] = arrA[2];
		*/
		
		//A출력
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		System.out.println("=========================");
		//B출력
		for(int i=0; i<arrB.length; i++) {
			System.out.println(arrB[i]);
		}
		
		System.out.println("=========================");
		System.out.println("=========================");
		
		arrA[1] = 13;
		
		//A출력
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		System.out.println("=========================");
		//B출력
		for(int i=0; i<arrB.length; i++) {
			System.out.println(arrB[i]);
		}
		
	}

}
