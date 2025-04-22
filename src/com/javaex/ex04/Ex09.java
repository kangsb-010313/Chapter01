package com.javaex.ex04;

public class Ex09 {

	public static void main(String[] args) {
		/*
		int num = 1;
		
		while(true) {
			if(num % 6 ==0 && num % 14 ==0) {
				break;
			}//if
			
			System.out.println("현재:" + num);
			num++;
		}//while

		System.out.println(num);
		*/
		
		
		// ------------------------------------------
		//위와 다른 경우임
		int num = 1;
		
		boolean action = true;
		
		while(action) {
			if(num % 6 ==0 && num % 14 ==0) {
				action=false;
			}//if
			
			System.out.println("현재:" + num);
			num++;
		}//while

		System.out.println("정답: " + num);
		
	}

}
