package com.javaex.ex05;

public class Ex11 {

	public static void main(String[] args) {

		int[] leftArray = new int[] {10, 20, 30};
		int[] rightArray = new int[] {10, 20, 30};
		
		
		if(leftArray.length == rightArray.length) {
			//세부비교 개수가 같은 상황
			
			for(int i=0; i<leftArray.length; i++) {
				if(leftArray[i] != rightArray[i]) {
					//값이 같으면 아무것도 출력하지x
					System.out.println(i+ "번째 값이 다릅니다.");
				}//if
			}//for
			
		}else {
			System.out.println("두 배열의 크기가 다릅니다.");
		}//else
	
	}

}
