package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExample {
	
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		//1부터 10까지 1씩 증가하며 출력하는 반복문 작성
		//단, 5를 출력하면 반복문 종료
		//1 2 3 4 5
		
		for(int i = 1; i < 10; i++) {
			System.out.println(i + " ");
			if( i == 5 ) break;
			
		}
		
	}
	
	public void ex2() {
		String str = "";
		
		while(true) {
			System.out.println("문자열 입력(exit@ 입력시 종료) : ");
			String input = sc.nextLine();
			//자바에서 문자열(String 비교는 == 사용 불가. ==는 기본자료형끼리의 연산에서만 사용가능)
			if(input.equals("exit@")) {
				break;
			}
			str += input + "\n";
		}
		System.out.println(str);
	}
	public void ex3() {
		//continue : 다음 반복으로 넘어감
		
		
		//1 ~ 10까지 1씩 증가하며 출력, 단 3의 배수 제외
		
		//1 2 4 5 7 8 10
		
		for(int i = 1; i < 11; i++) {
			if(i % 3 == 0) continue;
			else System.out.println(i + " ");
			
		}
		
	}
	
	public void ex4() {
		//1~100 까지 1씩 증가하며 출력하는 반복문. 5의 배수는 건너뛰고 증가하는 값이 40이 되었을때 반복 멈춤
		
		for(int i = 100; i < 101; i++) {
			if(i % 5 == 0) continue;
			else if(i == 40) break;
			else System.out.println(i + "\n");
			
		}
		
	}
	
	public void RSPgame() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("[가위 바우 보 게임~!!");
		System.out.println("몇 판 ? :");
		int round = sc.nextInt();
		
		//승패 기록용 변수
		int win = 0;
		int draw = 0;
		int lose = 0;
		
		for(int i = 1; i <= round; i++) {
			
			System.out.println("\n" + i +"번째 게임");
			System.out.print("가위/바위/보 중 하나 입력 : ");
			String input = sc.next();
			
			int random = (int)(Math.random() * 3 + 1);
			String com = null;
			
			switch(random) {
			case 1: com = "가위"; break;
			case 2: com = "바위"; break;
			case 3: com = "보"; break;
			
			}
			System.out.printf("컴퓨터는 [%s]를 선택햇습니다. \n", com);
			
			if(input.equals(com)) {
				System.out.println("비겼습니다.");
				draw++;
			} else {
				boolean win
			}
		}
		
	}
		
		
		
	}
}
