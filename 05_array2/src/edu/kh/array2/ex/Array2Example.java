package edu.kh.array2.ex;

import java.util.Arrays;

public class Array2Example {
	/*
	 * 2차원 배열
	 * -자료형이 같은 1차원 배열을 묶음으로 다루는것
	 * -> 행, 열 개념이 추가
	 * 
	 * 
	 * 
	 * 
	 * */
	public void ex1() {
		//2차원 배열 선언
		
		int[][] arr; // -> int 2차원 배열을 참조하는 참조변수 arr 선언
		
		//2차원 배열 할당
		//-> new 자료형[행크기][열크기] 
		arr = new int[2][3];
		
		//2차원 배열 초기화
		//1) 행, 열 인덱스를 이용해서 직접 초기화
		
		
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;
		
		System.out.println(Arrays.toString(arr));
		//참조하고 잇느 배열의 1차원배열 값을 문자열로 반환
		System.out.println(Arrays.deepToString(arr)); // 참조하고 있는 배열의 실제 데이터가 나오는 부분까지 파고 들어가서 모든 값을 문자열로 반환
		
		//2) 2중 for문을 이용한 초기화
		int num = 10;
		System.out.println(arr.length);
		// arr이 참조하고 있는 2차원 배열의 행의 길이
		System.out.println(arr[0].length);
		// arr[0]이 참조하고 있는 배열의 길이
		
		for(int row = 0; row < arr.length; row++) {
			
			for(int col = 0; col < arr[row].length; col++) {
				arr[row][col] = num;
				num += 10;
				
			}
			
		}
		//3) 선언과 동시에 초기화
		int[][] arr2 = {{10, 20, 30}, {40, 50, 60}};
	}
	
	public void ex2() {
		
		//2차원 배열 선언과 동시에 초기화
		//3행 3열짜리 정수형 2차원 배열 선언과 동시에 1~9까지 초기화
		
		//행별로 합출력
		int[][] arr = {{1,2,3},
				{4,5,6},
				{7,8,9}};
		
		for(int row = 0; row < arr.length; row++) {
			int sum = 0;
			for(int col = 0; col < arr[row].length; col++) {
				sum += arr[row][col];
				
			}
			System.out.printf("%d행의 합: %d\n", row, sum);
		}
		for(int col = 0; col < arr.length; col++) {
			int sum = 0;
			for(int row = 0; row < arr[col].length; row++) {
				sum += arr[row][col];
				
			}
			System.out.printf("%d열의 합: %d\n", col, sum);
		}
		
		
		
	}
	
	public void ex3() {
		//가변 배열
		//- 2차원 배열 생성시 마지막 배열차수(열)를 지정하지 않고
		//나중에 서로 크기가 다른 1차원 배열을 생성하여 참조
		
		char[][] arr = new char[4][];
		//char 2차원 배열 생성시 행 부분만 생성
		
		arr[0] = new char[3];
		arr[1] = new char[4];
		arr[2] = new char[5];
		arr[3] = new char[2];
		
		char ch = 'a';
		
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[row].length; col++) {
				arr[row][col] = ch++;
				
			}
			
		}
		
		System.out.println(Arrays.deepToString(arr));
		
		
		
	}
}
