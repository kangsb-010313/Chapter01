package com.javaex.ex05;

public class Ex08 {

	public static void main(String[] args) {

		//배열 A
		int[] arrA = new int[3];
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 7;
		
		
		//배열 B
		int[] arrB = new int[3];
		arrB[0] = 3; //ex10번은 이부분을 for문으로 복사
		arrB[1] = 6;
		arrB[2] = 7;
		
		
		//A
		for(int i =0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		
		System.out.println("============================");
		
		//B
		for(int i=0; i<arrB.length; i++) {
			System.out.println(arrB[i]);
		}
		
		System.out.println("============================");
		System.out.println("============================");
		
		//배열A[1] => 100으로 변경
		arrA[1] = 100;
		
		//A
		for(int i =0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		
		System.out.println("============================");
		
		//B
		for(int i=0; i<arrB.length; i++) {
			System.out.println(arrB[i]);
		}
		
	}

}
