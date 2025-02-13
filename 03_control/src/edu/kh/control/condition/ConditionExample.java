package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExample {//기능 제공용 class
	Scanner sc = new Scanner(System.in);
	public void ex1() {
		
		//if문
		//조건식이 true일때만 내부 코드 수행
		//입력받은 정수가 양수인지 검사 -> 양수라면 "양수입니다"출력
		int input = sc.nextInt();
		
		if(input > 0) {
			System.out.println("양수입니다.");
			
		}
		
		else{
			System.out.println("양수가 아닙니다.");
			
		}
	}
	
	public void ex2() {
		int input = sc.nextInt();
		System.out.println("정수 입력 : ");
		
		
		if(input % 2 != 0) {System.out.println("홀수입니다.");
	}else {
		
		if(input == 0) {
			System.out.println("0 입니다.");
			
		}else {System.out.println("짝수입니다.");}
	}
	}//if~else문
	//조건식 결과가 true인 if문
	//false면 else 구문이 수행됨
	
	
	//홀짝 검사
	//입력받은 정수값이 
	//홀수이면 "홀수입니다"출력
	//0이면 "0입니다"
	//짝수이면"짝수입니다"출력
	//중첩 if문 사용
	
	public void ex3() {
		int input = sc.nextInt();
		//if(조건식) ~ else if(조건식) ~ else
		//양수 음수 0 판별
		System.out.println("정수 입력:");
		
		
		if(input > 0) {
			System.out.println("양수입니다.");
			
		}
		else if(input < 0) {
			System.out.println("음수입니다.");
		}
		else {
			System.out.println("0입니다.");
		}
	}
	
	public void ex4() {
		int input = sc.nextInt();
		//달(month)을 입력받아 해당달에 맞는 계절 출력
		// 1, 2, 13 겨울(-15도 이하 : "한파 경보" / -12도 이하 : "한파 주의보"
		//3~5 봄
		//6~8 여름(35도 이상: "폭염 경보" / 33도 이상: "폭염 주의보")
		//9~11 가을
		//1~12 사이가 아닐땐 "해당하는 계절이 없다"출력
		
		System.out.println("달 입력 : ");
		int month = sc.nextInt();
		String season;
		
		if(month == 1|| month == 2 || month ==12) {
			season = "겨울";
			System.out.print("온도 입력 : ");
			int temperature = sc.nextInt();
			
			if(temperature <= 15) {
				//겨울 한파 경보
				season += "한파 경보";
			}else if(temperature <= -12) {
				season += "한파 주의보";
			}  
		} else if(month >= 3 && month <=5) {
			season = "봄";
		} else if(month >= 6 && month <= 8) {
			season = "여름";
			
		}else if(month >= 9 && month <= 11) {
			season = "가을";
			
		}else  {
			;
			
		}
		
	}
	public void ex5() {
		
		//나이를 입력받아
		//13세 이하면 "어린이 입니다"
		//13세 초과 19세 이하면 "청소년 입니다"
		//19세 초과시 "성인 입니다" 출력
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		if(age <= 13) { System.out.println("어린이 입니다.");
		}else if(age <= 19){ System.out.println("청소년 입니다.");
		}else if(age > 19) {System.out.println("성인입니다");}
		
	}
	
	public void ex6() {
		
		//점수(100점 만점)를 입력받아
		//90점 이상 : A .......
		int score = sc.nextInt();
		if( score >= 90 ) System.out.println("A");
		else if( score >= 80 ) System.out.println("B");
		else if( score >= 70 ) System.out.println("C");
		else if( score >= 60 ) System.out.println("D");
		else if( score < 60 ) System.out.println("F");
		else if ( score >= 100 || score < 0) System.out.println("잘못 입력하셧습니다.");
	}
	
	public void ex7() {
		
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		System.out.println("키를 입력하세요");
		int height = sc.nextInt();
		
		if(height < 140) System.out.println("적정 키가 아닙니다");
		else {
			if(age < 12) System.out.println("적정 연령이 아닙니다");
			else if (age > 100 || age < 0) System.out.println("잘못 입력하셧습니다.");		
		}
		
	}
	
	public void ex8() {
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		if(age > 100 || age < 0)System.out.println("나이를 잘못 입력하셧습니다.");
		System.out.println("키를 입력하세요");
		int height = sc.nextInt();
		if(height > 250 || height < 0)System.out.println("키를 잘못 입력하셧습니다.");
		
		
		
		if(height < 140) {
			if(age < 12) System.out.println("나이와 키 모두 적절치 않음");
			else  System.out.println("나이는 적절하나, 키는 적절치 않음");
		
		}else {
			if(age < 12) System.out.println("키는 적절하나, 나이는 적절치 않음");
			else System.out.println("탑승 가능!!");
		}
		
	}
	public void ex9() {
		
		//switch문
		//여러 case중 하나를 선택하여 수행하는 조건문
		
		//요일 번호 입력 (1~7) : 3
		System.out.println("요일번호 입력 : ");
		int day = sc.nextInt();
		switch(day) {
			case 1: 
				System.out.println("월요일"); break;
			case 2: 
				System.out.println("화요일"); break;
			case 3: 
				System.out.println("수요일"); break;
			case 4: 
				System.out.println("목요일"); break;
			case 5: 
				System.out.println("금요일"); break;
			case 6: 
				System.out.println("토요일"); break;
			case 7: 
				System.out.println("일요일"); break;
			default:
				System.out.println("잘못된 입력값입니다.");
		}
	}
	
	public void ex10() {
		
		//점수 입력 (0 ~ 100)
		
		System.out.println("점수 입력(0~100):");
		int score = sc.nextInt();
		switch(score / 10) {
			case 10: // 여기를 비워두면 자동으로 case 9로 넘어감.
			case 9: System.out.println("학점 : A"); break;
			case 8: System.out.println("학점 : B"); break;
			case 7: System.out.println("학점 : C"); break;
			case 6: System.out.println("학점 : C"); break;
			default: System.out.println("학점 : F"); break;
		
		}
		
	}
	
}
