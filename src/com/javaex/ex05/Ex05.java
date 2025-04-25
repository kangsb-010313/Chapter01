package com.javaex.ex05;

public class Ex05 {

	public static void main(String[] args) {
		
		int[] intArr = new int[3];
		intArr[0] = 3;
		intArr[1] = 6;
		intArr[2] = 35;
		
		/*
		int[] intArr = new int[] {3, 6, 35}; 
							//숫자 빼!!!
		*/
		
		//지금 단계에서는 권장하지 않는 사용법
		//int[] intArr = {3, 6, 35};
		
		for(int i=0; i<intArr.length; i++) {
			
			System.out.println(intArr[i]);
		}
		
		
		
	}

}
