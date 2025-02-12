package edu.kh.op.ex;

import java.util.Scanner;

public class OpExample {
	public void ex1() {
		
		//증감 연산자
		
		int iNum1 = 10;
		int iNum2 = 10;
		
		iNum1++;
		iNum2--;
		
		System.out.println("iNum1 : " + iNum1);
		System.out.println("iNum2 : " + iNum2);
		
		// 전위 연산
		int temp1 = 5;
		
		System.out.println(++temp1 + 5); //11
		
		// 후위 연산
		int temp2 = 3;
		
		System.out.println(temp2-- + 2); //5
		
		System.out.println(temp2);
		
		
		int a = 3;
		int b = 5;
		int c = a++ + --b;
		//7
	}
	public void ex2() {
		//비교 연산자
		// - 비교 연산자의 결과는 항상 논리값(true)
		
		int a = 10;
		int b = 20;
		
		System.out.println((a == b) == false);
		
	}
	
	public void ex3() {
		//논리 연산자 : && ||
		
		// && (AND)
		// ||(OR)
		
		int a = 101;
		//a는 100이상 이면서 짝수인가?
		System.out.println(( a > 100) && (a % 2 == 0));
		
		int b = 5;
		// b는 1부터 10까지 숫자범위에 포함되어 있는가?
		System.out.println((b >= 1) && (b <= 10));
		
		int c = 10;
		// c는 10을 초과하거나 짝수인가?
		System.out.println((c > 10) || (c % 2 == 0));
	}
	
	public void ex4() {
		//삼항 연산자 : 조건식? true일때 수행 : false일때 수행
		
		int num = 30;
		
		//num이 30보다 크면(초과) "num은 30보다 큰수이다"
		//아니면 "num은 30 이하의 수이다" 출력
		
		//num > 30 ? System.out.println("num은 30보다 큰수이다"):System.out.println("num은 30 이하의 수이다");
		
		//System.out.println(result);
		
		//-------------------------
		
		//입력받은 정수가 음수인지 양수인지 구분
		//단, 0은 양수로 처리
		
		//Scanner 생성
		
		//ex)
		//정수 입력 : 4
		//양수 입니다.
		//-----------------
		
		//정수 입력 : -5
		//음수 입니다.
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int number1 = sc2.nextInt();
		
		String result2 = (number1 >= 1) ?  "양수 입니다" : "음수 입니다";
		
		System.out.println(result2);
		
	}
	
	
}
