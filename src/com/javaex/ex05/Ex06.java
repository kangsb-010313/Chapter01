package com.javaex.ex05;

public class Ex06 {

	public static void main(String[] args) {

		//정수와 실수 한 가지로만 출력가능, 기본자료형 실수형일 때 자동형변환되어 출력됨
		double[] doubleArr = new double[3];
		
		doubleArr[0] = 3.4;
		doubleArr[1] = 6.2;
		doubleArr[2] = 9.5; 
		
		for(int i=0; i<doubleArr.length; i++) {
			
			System.out.println(doubleArr[i]);
		}
		
		System.out.println("=================");
		
		char[] charArr = new char[3];
		
		charArr[0] = 'a';
		charArr[1] = 'b';
		charArr[2] = 'c'; //숫자로 입력 시 코드로 인식하여 출력해주기 때문에 주의!!!
	
		for(int i=0; i<charArr.length; i++) {
			System.out.println(charArr[i]);
		}
		System.out.println("=================");
		
		char[] charArr02 = new char[] {'a','b','c'};
		
		for(int i=0; i<charArr.length; i++) {
			System.out.println(charArr[i]);
		}
		System.out.println("=================");
		
		char[] charArr03 = {'a','b','c'};
		
		for(int i=0; i<charArr.length; i++) {
			System.out.println(charArr[i]);
		}
		System.out.println("=================");
	
		String[] sArr = new String[3];
		
		sArr[0] = "최우식";
		sArr[1] = "남윤수";
		sArr[2] = "김진영";
		
		for(int i=0; i<sArr.length; i++) {
			System.out.println(sArr[i]);
		}
		System.out.println(sArr[0]);
	}

}
