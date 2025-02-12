package edu.kh.variable.ex2;

import java.util.Scanner;

public class ScannerExample3 {
	public static void main(String[] args) {
		//문자열(String) 입력
		//문자열을 3번 입력받아 한줄로 출력하기
		
		Scanner sc = new Scanner(System.in);
		//String s1 = sc.next(); -> 스페이스, 탭이 들어오면 입력중단
		//String s1 = sc.nextLine(); -> 공백포함 다음 입력된 한 줄을 읽어온다.
		/*
		System.out.print("입력 테스트 : ");
		String input1 = sc.next();
		System.out.println(input1);
		System.out.print("입력 테스트 : ");
		String input2 = sc.nextLine();
		System.out.println(input2);
		*/
		System.out.print("입력 테스트 : ");
		String input1 = sc.next();
		System.out.print("입력 테스트 : ");
		String input2 = sc.next();
		System.out.print("입력 테스트 : ");
		String input3 = sc.next();
		System.out.println(input1 +' '+ input2 +' '+input3);
	}
}
