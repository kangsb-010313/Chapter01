package com.javaex.ex05;

public class Ex03 {

	public static void main(String[] args) {

		//로또번호
		
		int[] lottos = new int[6];
		
		/*
		// 이 경우 규칙이 일정하여 for문을 사용할 수 있다
		//(입력은 아닌 경우가 더 많음)
		//배열은 0부터 
		lottos[0]=(int)(Math.random()*45) + 1;
		lottos[1]=(int)(Math.random()*45) + 1;
		lottos[2]=(int)(Math.random()*45) + 1;
		lottos[3]=(int)(Math.random()*45) + 1;
		lottos[4]=(int)(Math.random()*45) + 1;
		lottos[5]=(int)(Math.random()*45) + 1;
		*/
		
		for(int i=0; i<6; i++) {
			lottos[i] = (int)(Math.random()*45) + 1;
		}
		
		
		/*
		방 출력 방법1 (진짜 굳이)
		System.out.println(lottos[0]); //3
		System.out.println(lottos[1]); //6
		System.out.println(lottos[2]); //9
		System.out.println(lottos[3]); //22
		System.out.println(lottos[4]); //34
		System.out.println(lottos[5]); //45
		*/

		//방 출력 방법2 (한 줄 표현 가능)
		for(int i=0; i<6; i++) {
			System.out.print(lottos[i] + "\t");
		}
		
	}

}
