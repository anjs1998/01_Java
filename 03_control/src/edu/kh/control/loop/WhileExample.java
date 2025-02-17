package edu.kh.control.loop;

import java.util.Scanner;

public class WhileExample {
	/*별도의 초기식, 증감식이 존재하지 않고 반복 종료 조건을 자유롭게 설정하는 반복문.
	 * 
	 * 활실히 얼마만큼 반복후에 끝날지는 모르지만 언젠가 반복 조건이 false가 되는 경우 반복 종료*/
		Scanner sc = new Scanner(System.in);
		
	public void ex1() {
		int input = 9;
		
		while(input != 0) {
			System.out.println("------메뉴선택------");
			System.out.println("1. 떡볶이");
			System.out.println("2. 쫄면");
			System.out.println("3. 김밥");
			System.out.println("0. 종료");
			
			System.out.println("메뉴 선택 >>");
			input = sc.nextInt();
			
			switch(input) {
			
			
			case 1: System.out.println("떡볶이 를 주문했다."); break;
			case 2: System.out.println("쫄면을 주문했다."); break;
			case 3: System.out.println("김밥을 주문했다."); break;
			case 0: System.out.println("프로그램을 종료합니다."); break;
			default : System.out.println("잘못 입력하셧습니다.");
			}
			
		}
		
	}
	
	public void ex2() {
		
		//입력되는 모든 정수의 합 구하기. 0 입력시 반복 종료 후 결과 출력
		int input = 0;
		int sum = 0;
		do {
			System.out.println("정수 입력 : ");
			input = sc.nextInt();
			sum += input;
		}while(input == 0);
		System.out.println("입력된 모든 정수의 합 : "+sum);
	}
}
