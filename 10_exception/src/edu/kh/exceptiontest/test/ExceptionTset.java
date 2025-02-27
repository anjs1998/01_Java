package edu.kh.exceptiontest.test;

public class ExceptionTset {
	public static void main(String[] args) {
		int a = (int)99.8;
		
		//컴파일 에러 => 개발자가 코드 잘못 쓴경우
		//자료형이 맞지 않아 연산 불가하여 "컴파일 에러"가 발생
		
		
		//런타임 애러 => 프로그램 수행 중 발생하는 에러
		//주로 if문으로 처리가능
		int[] arr = new int[3];
		arr[0 ] = 10;
		arr[1] = 20;
		arr[2] = 30;
		//arr[3] = 40;
		
		
		if(3 >= arr.length ) {	// 배열 인덱스 범위 초과한 값이 들어왓다면
			System.out.println("배열 범위를 초과햇습니다");
			
		} else {
			arr[3] = 40;
			
			System.out.println("배열 범위 안정적..");
			
		}
	}
}
