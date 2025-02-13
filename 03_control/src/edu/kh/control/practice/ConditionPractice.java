package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	Scanner sc = new Scanner(System.in);
	public void practice1() {
		System.out.println("숫자를 한 개 입력하세요 : ");
		int i = sc.nextInt();
		
		if( i < 0)  System.out.println("양수만 입력해주세요");
		else if(i % 2 == 0)System.out.println("짝수입니다.");
		else if(i % 2 == 1)System.out.println("홀수입니다.");
	}
	public void practice2() {
		
		System.out.println("국어점수 : ");
		int korean = sc.nextInt(); 
		sc.nextLine();
			
		System.out.println("수학점수 : ");
		int math = sc.nextInt(); 
		sc.nextLine();
			
		System.out.println("영어점수 : ");
		int english = sc.nextInt(); 
		sc.nextLine();
		
		boolean result = (korean >= 40)&& (english >= 40) && ( math >= 40) && (korean + math + english)/3 >= 60;
		
		
		if(result) {
			System.out.println("국어 : " + korean);
			System.out.println("수학 : " + math );
			System.out.println("영어 : " +  english);
		}
		System.out.println("합계 : " + (korean + math + english));
		System.out.println("평균 : " + (korean + math + english) / 3.0f);
		
		System.out.println(result?"축하합니다, 합격입니다!":"불합격입니다.");
		
	}
	
	public void practice3() {
		System.out.println("1~12 사이의 정수 입력 :");
		int month = sc.nextInt();
		switch(month) {
			case 1: System.out.println("1월은 31일까지 잇습니다."); break;
			case 2: System.out.println("2월은 28일까지 잇습니다."); break;
			case 3: System.out.println("3월은 31일까지 잇습니다."); break;
			case 4: System.out.println("4월은 30일까지 잇습니다."); break;
			case 5: System.out.println("5월은 31일까지 잇습니다."); break;
			case 6: System.out.println("6월은 30일까지 잇습니다."); break;
			case 7: System.out.println("7월은 31일까지 잇습니다."); break;
			case 8: System.out.println("8월은 31일까지 잇습니다."); break;
			case 9: System.out.println("9월은 30일까지 잇습니다."); break;
			case 10: System.out.println("10월은 31일까지 잇습니다."); break;
			case 11: System.out.println("11월은 30일까지 잇습니다."); break;
			case 12: System.out.println("12월은 31일까지 잇습니다."); break;
			default:
				System.out.println(month + "월은 잘못 입력된 달입니다.");
		}
	}
	public void practice4() {
		System.out.println("키(m)를 입력해주세요 : ");
		double height = sc.nextDouble();
		System.out.println("몸무게(kg)를 입력해주세요 : ");
		double weight = sc.nextDouble();
		double bmi = weight / height / height;
		System.out.println("BMI지수 : " + bmi);
		
		if(bmi < 18.5d) System.out.println("저체중");
		else if(bmi < 23.0d) System.out.println("정상체중");
		else if(bmi < 25.0d) System.out.println("과체중");
		else if(bmi < 30.0d) System.out.println("비만");
		else System.out.println("고도비만");
	}
	
	public void practice5() {
		System.out.println("중간고사 점수 : ");
		int midScore = sc.nextInt();
		System.out.println("기말고사 점수 : ");
		int finScore = sc.nextInt();
		System.out.println("과제 점수 : ");
		int assiScore = sc.nextInt();
		System.out.println("출석 횟수 : ");
		int presence = sc.nextInt();
		
		if (presence <= 14 ) System.out.println("Fail [출석 횟수 부족 (" +presence+ "/20)]");
		else {
			System.out.println("======결과======");
			System.out.println("중간고사 점수(20) :" + (double)midScore * 0.2);
			System.out.println("기말고사 점수(30) :"+ (double)finScore * 0.3);
			System.out.println("과제 점수(30) :"+ (double)assiScore * 0.3);
			System.out.println("출석 점수(20) :"+ (double)presence );
		
			double totalScore = 
					(double)midScore * 0.2 
					+ (double)finScore * 0.3 
					+ (double)assiScore * 0.3 
					+ (double)presence;
			System.out.println("총점 : " + totalScore);
			if (totalScore <= 70) System.out.println("Fail [점수 미달]");
		
			else System.out.println("PASS");
		}
		
	}
}
