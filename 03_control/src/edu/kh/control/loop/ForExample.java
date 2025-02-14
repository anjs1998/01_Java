package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample { // 기능 제공용 클래스
	Scanner sc = new Scanner(System.in);
	public void ex1() {
		//1부터 10까지 console에 출력하기
		for(int i = 1; i < 11; i++) {
			System.out.println(i);//반복 수행될 코드. 수행 후 증감문으로 간다.
			
		}
		
	}
	
	public void ex2() {
		for(char index = 65; index <= 90; index++) {
			System.out.print(index);//반복 수행될 코드. 수행 후 증감문으로 간다.
			
		}
		
		for(int i = 'A'; i <= 'Z'; i++) {
			System.out.print((char)i);
			
		}
	}
	
	public void ex3() {
		System.out.println("숫자 입력 : " );
		int input = sc.nextInt();
		//1부터 입력받은 수까지 1씩 증가하며 출력
		for(int i = 1; i <= input; i++) {
			System.out.print(i);
			
		}
	}
	public void ex4() {
		//정수 5개를 입력받아 합계 구하기
		int sum = 0;
		for(int i = 1; i <= 5; i++) {
			System.out.println("입력 " + i + " : ");
			int input = sc.nextInt();
			sum += input;
			
		}
		System.out.println("합계 : " + sum);
	}
	
	public void ex5() {
		
		//1부터 20까지 1씩 증가하면서 출력
		//단, 입력갑은 정수의 배수는 양쪽에 () 표시
		
		
		int input = sc.nextInt();
		for(int i = 1; i <= 20; i++) {
			System.out.println(i % input == 0 ? "( " + i + " )" : i );
				
		}
		
		
	}
	
	public void ex6() {
		//구구단 출력하기
		//2 ~ 9 사이 수를 하나 입력받아 해당 단을 출력
		// 단, 입력받은 수가 2~9 숫자가 아니라면 "잘못 입력하셧습니다"를 출력
		System.out.println("2~9 사이 단 : ");
		int input = sc.nextInt();
		if(input > 9 || input < 2) System.out.println("잘못 입력하셧습니다");
		else {
			
			for(int i = 1; i < 10; i++) {
				System.out.println(input + " X " + i + " = " + input * i);
				
			}
			
		}
	}
	
	public void ex7() {
		System.out.println("숫자 입력 : ");
		int input = sc.nextInt();
		int sum = 0;
		for(int i=1; i < 21; i++) {
			if( i % input == 0) {
				System.out.printf("%d ", i);
				sum += i;
			}
		}
		System.out.println("\n"+input +"의 배수 합계 : "+sum);
	}
	
	public void ex8() {
		for(int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {System.out.print(i + " X " + j + " = " + j * i + " ");}
			System.out.println("\n");
		}
		
	}
}
