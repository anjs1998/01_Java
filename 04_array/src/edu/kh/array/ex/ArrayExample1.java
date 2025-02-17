package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample1 {
	/*
	 * 배열(Array)
	 * ->같은 자료형의 변수를 하나의 묶음으로 다루는 것.
	 * 묶여진 변수들은 하나의 배열명으로 불려지고
	 * 구분은 index를 이용함.(index는 0부터 시작하는 정수)
	 * 
	 * 
	 * */
	
	public void ex1() {
		//일반 변수 vs 배열
		
		//변수 선언
		int num;
		//stack영역에 int자료형을 저장할수 있는 공간 4byte를 할당하고 그 공간에 num이란 명칭을 부여
	
		//변수 대입
		num = 10;
		//생성된 num이라는 변수공간에 10이라는 정수값 대입.
		
		//변수 사용
		System.out.println("num에 저장된 값 : " + num);
		/*************************/
		
		//배열 선언
		int[] arr;
		//stack공간에 int[] 자료형 공간을 4byte 할당하고
		//그 공간에 arr이라는 이름을 부여
		//JAVA에서는 배열은 무조건 참조형이다.
		//배열 할당
		arr = new int[3];
		//int[] int[] -> 같은 자료형(== 연산가능)
		//배열 요소 값 대입
		
		//배열 사용
		System.out.println("arr : " + arr);
		
		System.out.println( arr[0] );
		System.out.println( arr[1] );
		System.out.println( arr[2] );
		
		//-> heap영역에 생성된 공간은 절대 비어있을수 없다
		//-> JVM 기본값이 들어가있다
		//boolean : false
		//나머지 : 0
		//참조형 : NULL
		
		arr[0] = 10;
		//array.toString
	}
	public void ex2() {
		
		int[] arr = new int[4];
		
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		
		
		arr[3] = 1000;
		arr[4] = 2000; //컴파일 에러..
		
	System.out.println("배열의 길이 : " + arr.length);
	
	for(int i = 0; i < arr.length; i++) {
		System.out.printf("arr[%d]에 저장된 값 : %d\n");
	}
	int[] arr2 = {1, 2, 3, 4, 5};
	//stack영역에 int[] 자료형 공간을 4byte 할당하고'
	//그 공간에 arr2라는 이름부여
	//HEAP 메모리 영역에 int 5칸짜리 int[]을 생성하고
	//0번 인덱스부터 각 요소에 1~5까지 ㅣ초기화함(대입)
	
	System.out.println(Arrays.toString(arr2));
	}
	
	public void ex3() {
		Scanner sc = new Scanner(System.in);
		//5명의 키를 입력받고 평균 구하기
		double[] height = new double[5];
		//double[] 자료형 참조변수 height를 stack영역에 ㅔ생성
		//height에 heap영역에 새로 생성된 double 5칸짜리 배열의 주소를 대입
		
		for(int i = 0; i< height.length; i++) {
			
			System.out.print((i+1) + "번 키 입력 : "  );
			
			height[i] = sc.nextDouble();
			
		}
		System.out.println();
		
		double sum = 0;
		for(int i = 0; i < height.length; i++) {
			sum += height[i];
		}
		
		System.out.printf("\n 평균 : ;%.2f cm", sum / height.length);
	}
	
	public void ex4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 받을 인원수 : ");
		int num = sc.nextInt();
		int[] score = new int[4];
		
		for(int i = 0; i < num; i++) {
			System.out.println((i+1) + "번 점수 입력 : ");
			score[i] = sc.nextInt();
			
		}
		int sum = 0;
		int max_score=0, min_score=score[0];
		for(int i = 0; i < num; i++) {
			sum += score[i];
			max_score = max_score < score[i] ? score[i] : max_score ;
			min_score = min_score > score[i] ? score[i] : min_score ;
		}
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (double) sum / (double) num);
		System.out.println("최고점 : " + max_score);
		System.out.println("최저점 : " + min_score);
	}
	
	public void ex5() {
		String[] arr = {"김밥", "서브웨이", "햄버거", "백반", "국밥", "짜장면"};
		System.out.println("오늘 점심 메뉴 : "+ arr[(int)(Math.random() * 6)]);
		 
		
	}
	
	public void ex6() {
		//배열을 이용한 검색 - 입력받은 정수가 배열에 있는지 없는지 확인
		int[] arr = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		boolean flag = false;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == input) {
				System.out.println( i + "번째 인덱스에 존재");
				flag = true;
			}
			
		}
		
		//flag 상태를 검사
		//림ㅎrk flase라면 일치하는 값을 찾지 못햇다 라는 의미
		//
		if(!flag) System.out.println("존재하지 않음");
		
	}
	
	public void ex7() {
		Scanner sc = new Scanner(System.in);
		String[] arr = {"사과", "딸기", "바나나", "키위", "멜론", "아보카도"};
		System.out.println("과일 입력 : " );
		String input = sc.nextLine();
		for(int i = 0; i < 6; i++) {
			if(input.equals(arr[i])) System.out.println(i+"번 인덱스에 존재"); return;
			
		}
		System.out.println("존재하지 않음");
		
	}
	public void ex8() {
		String str = "가나다";				//string 선언 1 --> String Constant Pool에 저장
		String str2 = new String("가나다"); 	//string 선언 2 --> Heap에 새 객체로 저장이 된다.
		System.out.println(str);
		System.out.println(str.toString()); // toString 메소드는 자기자신을 그대로 반환하는 메소드
		//대입해둔 문자열 자체가 반환된다.
		
		//주소값(객채의 해시코드)를 확인하고 싶다면 아래처럼 사용
		System.out.println(System.identityHashCode(str));
		
	}
	
	public void ex9() {
		//문자열을 입력받아 한글자씩 잘라내어 char배열에 순서대로 저장
		Scanner sc = new Scanner(System.in);
		String input = new String();
		System.out.println("문자열 입력 : ");
		input = sc.nextLine();
		
		char[] c = new char[input.length()];
		for(int i=0; i<input.length(); i++) {
			 c[i] = input.charAt(i);
		}
		for(int i=0; i<input.length(); i++) {
			 System.out.println(c[i]);
		}
		System.out.println(Arrays.toString(c));
		System.out.print("검색할 문자 입력 : ");
		char ch = sc.next().charAt(0);
		
		int count = 0; // 중복 글자개수 카운터
		
		for(int i = 0; i < c.length; i++) {
			if(c[i] == ch) {
				count++;
				
			}
			
		}
		
		if( count > 0) { //일치하는 값 있음
			
		} else { // 일치하는 문자가 없음
			//단, 일치하는 문자 없을 경우 "존재하지 않음"출력
			System.out.println("존재하지 않음~!");
		}
	}
	
	
	
}
