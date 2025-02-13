package edu.kh.op.practice;

import java.util.Scanner;

//기능제공용 class
public class OperatorPractice {
		Scanner sc = new Scanner(System.in);
	public void practice1() {
		
		
		System.out.println("인원수 : ");
		int numOfPeople = sc.nextInt(); 
		sc.nextLine();
		
		System.out.println("사탕 개수 : ");
		int numOfCandy = sc.nextInt(); 
		sc.nextLine();
		
		System.out.printf("1인당 사탕 개수 : %d\n남는 사탕개수 : %d\n",numOfCandy / numOfPeople,  numOfCandy % numOfPeople);
		
	}
	
	public void practice2(){
		System.out.println("이름 : ");
		String name = sc.next(); 
		sc.nextLine();
		
		System.out.println("학년(정수만) : ");
		int age = sc.nextInt(); 
		sc.nextLine();
		
		System.out.println("반(정수만) : ");
		int classNum = sc.nextInt(); 
		sc.nextLine();
		
		System.out.println("번호(정수만) : ");
		int studentNum = sc.nextInt(); 
		sc.nextLine();
		
		System.out.println("성별(남학생/여학생) : ");
		String gender = sc.next(); 
		sc.nextLine();
		
		System.out.println("성적(소수점 아래 둘째 자리까지) : ");
		double grade = sc.nextDouble(); 
		sc.nextLine();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", age, classNum, studentNum, name, gender, grade);
	}
	
	public void practice3(){
		System.out.println("국어 : ");
		int korean = sc.nextInt(); 
		sc.nextLine();
		
		System.out.println("수학 : ");
		int math = sc.nextInt(); 
		sc.nextLine();
		
		System.out.println("영어 : ");
		int english = sc.nextInt(); 
		sc.nextLine();
		
		boolean result = (korean >= 40)&& (english >= 40) && ( math >= 40) && (korean + math + english)/3 >= 60;
		System.out.println(result?"합격":"불합격");
		
		System.out.println("합계 : " + (korean + math + english));
		System.out.println("평균 : " + (korean + math + english) / 3.0f);
	}
}
/*메소드 명 : public void practice1(){}
모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고
1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.

[실행화면]
인원 수 : 29
사탕 개수 : 100
1인당 사탕 개수 : 3
남는 사탕 개수 : 13

▶ 실습문제2

메소드 명 : public void practice2(){}
키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.

ex.
이름 : 홍길동
학년(정수만) : 3
반(정수만) : 4
번호(정수만) : 15
성별(남학생/여학생) : 남학생
성적(소수점 아래 둘째 자리까지) : 85.75
3학년 4반 15번 홍길동 남학생의 성적은 85.75이다.

▶ 실습문제3

메소드 명 : public void practice3(){}
국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.

[실행화면]
국어 : 60
영어 : 80
수학 : 40
합계 : 180
평균 : 60.0*/