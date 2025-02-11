package edu.kh.variable.ex1;

public class VariableExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 형변환(casting) : 값의 자료형을 변환하는것 (단, boolean 제외)
		/*
		 * 형변환은 왜 필요한가?
		 * -컴퓨터는 기본적으로 같은 자료형까리만 연산가능
		 * 다른 자료형과 연산시 오류
		 * --> 이런 상황을 해결하기 위해서 필요한 기술이 형변환
		 * 
		 * 자동 / 강제 2가지 형변환 존재
		 * 
		 * 
		 * 
		 * */
		
		int num1 = 10;
		double num2 = 3.5;
		
		System.out.println("자동 형변환 결과 : " + (num1 + num2));
		//원래 에러가 발생해야 하지만 "자동 형변환"덕분에 발생하지 않는다.
		// int -> long 형변환
		int i2 = 2_100_000_000; //21억
		
		long l2 = 10_000_000_000l; //100억
		
		long result = i2 + l2;
		System.out.println(result);	
		
		//char -> int 형변환
		//char자료형은 문자형이지만 실제 저장하는 값은
		//0부터 6만 5천번 사이에 있는 숫자(정수형)
		
		char ch3 = 'V';
		int i3 = ch3;
		System.out.println(i3);
		
		
		char ch4 = '각';
		int i4 = ch4;
		System.out.println(i4);
		
		
	}

}
