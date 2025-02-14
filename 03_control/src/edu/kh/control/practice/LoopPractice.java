package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.println("1이상의 숫자를 입력하세요 :");
		int input = sc.nextInt();
		if(input < 1) System.out.println("1 이상의 숫자를 입력해주세요.");
		else {
			for(int i = 1; i <= input; i++) System.out.print(i + " ");
		}
	}
	public void practice2() {
		System.out.println("1이상의 숫자를 입력하세요 :");
		int input = sc.nextInt();
		if(input < 1) System.out.println("1 이상의 숫자를 입력해주세요.");
		else {
			for(int i = input; i > 0; i--) System.out.print(i + " ");
		}
		
	}
	
	public void practice3() {
		
		System.out.println("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		int sum = 0;
		for(int i=1; i <= input; i++) {
			System.out.print(i + " + ");
			sum += i;
		}
		System.out.println("= " + sum);
	}
	
	public void practice4() {
		
		System.out.println("첫번째 숫자 :");
		int input1 = sc.nextInt();
		System.out.println("두번째 숫자 : ");
		int input2 = sc.nextInt();
		if(input1 < 1 || input2 < 1) System.out.println("1 이상의 숫자를 입력해주세요.");
		else {
			if(input1 < input2) for(int i = input1; i <= input2; i++) System.out.print(i + " ");
			else for(int i = input2; i <= input1; i++) System.out.print(i + " ");
			
		}
		
		
	}
	public void practice5() {
		System.out.println("숫자 : ");
		int input = sc.nextInt();
		//if(input > 9 || input < 2) System.out.println("잘못 입력하셧습니다");
		
		System.out.println("===== "+ input+"단 =====");
		for(int i = 1; i < 10; i++) {
			System.out.println(input + " X " + i + " = " + input * i);
			
		}
	}
	
	public void practice6() {
		System.out.println("숫자 : ");
		int input = sc.nextInt();
		if(input > 9) System.out.println("2~9 사이 숫자만 입력해주세요.");
		for(int i = input; i < 10; i++) {
			System.out.println("===== "+ i+"단 =====");
			for (int j = 1; j < 10; j++) {System.out.println(i + " X " + j + " = " + j * i + " ");}
			System.out.println("\n");
		}
	}
	
	public void practice7() {
		System.out.println("정수 입력 : ");
		int input = sc.nextInt();
		for(int i = 1; i <= input; i++) {
			for( int j = 1; j <= i; j++) System.out.print("*");
			System.out.println();
		}
	}
	public void practice8() {
		System.out.println("정수 입력 : ");
		int input = sc.nextInt();
		for(int i = input; i >= 1; i--) {
			for( int j = i; j >= 1; j--) System.out.print("*");
			System.out.println();
		}
		

	}
	public void practice9() {
		System.out.println("정수 입력 : ");
		int input = sc.nextInt();
		for(int i = 0; i < input; i++) {
			for( int j = input - i; j > 1; j--) System.out.print(" "); 
			for( int k = 0; k <= i; k++) System.out.print("*"); 
			System.out.println();
		}
	
	}
	
	public void practice10() {
		System.out.println("정수 입력 : ");
		int input = sc.nextInt();
		for(int i = 1; i <= input; i++) {
			for( int j = 1; j <= i; j++) System.out.print("*");
			System.out.println();
		}
		for(int i = input - 1; i >= 1; i--) {
			for( int j = i; j >= 1; j--) System.out.print("*");
			System.out.println();
		}
		
	}
	public void practice11() {
		System.out.println("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 0; i < input; i++) {
			for( int j = input - i - 1; j > 0 ; j--) System.out.print(" ");
			for( int k = 0; k < 2 * (i+1) -1; k++ ) System.out.print("*");
			for( int l = input - i - 1; l > 0 ; l--) System.out.print(" ");
			System.out.println();
		}
	}
	
	public void practice12() {
		System.out.println("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 0; i < input; i++) {
			
			for (int j = 0; j < input; j++) {
				 if ((i == 0) || (i == (input - 1)) || (j == 0) || (j == (input - 1) )) System.out.print("*");
				 else System.out.print(" ");
			}
			System.out.println();
			
		}
		
	}
	public void practice13() {
		System.out.println("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();
		int count=0;
		for(int i = 1; i <= input; i++) { 
			if((i % 2) == 0 || (i % 3) == 0)  System.out.println(i);
		}
		for(int i = 1; i < input; i++) { 
			if((i % 2) == 0 && (i % 3) == 0)  count++;
		}
		System.out.println("count : " + count);
		
	}
}
