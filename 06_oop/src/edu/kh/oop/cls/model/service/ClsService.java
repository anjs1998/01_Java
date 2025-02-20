package edu.kh.oop.cls.model.service;

import edu.kh.oop.cls.model.vo.Student;
import edu.kh.oop.cls.model.vo.User;

//ClsService와 Student/TestVO는 패키지가 다름

public class ClsService extends Student {
	
	//student 상속
	
	
	public void ex1() {
		
		//클래스 접근제한자 확인하기
		Student std = new Student();
		//public class인 Student는 import 가능(어디서든 접근가능)
		//TestVo test = new TestVO();
		//default class인 TestVO는 import 불가능(다른 패키지라 불가능)
		
		System.out.println( v1 );
		System.out.println( v2 );
		
		//System.out.println( v3 );
		//System.out.println( v4 );
		
		
	}
	
	public void ex2() {
		
		//static 필드 확인 예제
		
		//학생 객체 2개 생성
		Student std1 = new Student();
		Student std2 = new Student();
		
		System.out.println( std1.schoolName );
		System.out.println( std2.schoolName );
		
		// *** static이 붙은 변수(필드)는 class명.variable명 으로 사용해야 함!
		System.out.println(Student.schoolName);
		Student.schoolName = "KH정보교육원";
		
		System.out.println( std1.schoolName);
		System.out.println( std2.schoolName);
		System.out.println( Student.schoolName);
		
		/*프로그램 시작시 static이 붙은 코드들이 모두 static 영역에 생성되고, 프로그램이 종료될 때까지 사라지지 않음
		 * 그리고, static 영역에 생성된 변수는 어디서든지 공유가능*/
		
	}
	public void ex3() {
		
		//생성자 확인 테스트
		
		//User 기본 생성자를 이용해서 u1 객체 생성
		
		User u1 = new User();
		User u2 = new User();
		System.out.println(u1.getUserId());
		System.out.println(u1.getUserPw());
		System.out.println(u1.getUserName());
		System.out.println(u1.getUserAge());
		System.out.println(u1.getUserGender());
		// 문제점 : u1이 참조하고 있는 User객체와
		//u2가 참조하고 있는 User객체의 필드값이 모두 동일함
		//같은 기본생성자로 User객체를 생서했기 때문에
		
		u2.setUserId("asd1234");
		u2.setUserPw("1s2d3r");
		u2.setUserName("김영희");
		u2.setUserAge(25);
		u2.setUserGender('여');
		
		//해결방법 2: 매개변수 생성자를 이용해서
		//객체가 생성될 때부터 다른값으로 필드를 초기화
		
		User u3 = new User("test3", "password1234");
		System.out.println(u3.getUserId());
		System.out.println(u3.getUserPw());
		System.out.println(u3.getUserName());
		System.out.println(u3.getUserAge());
		System.out.println(u3.getUserGender());
		
		
		
		
	}
	
	public void ex4() {
		
		User u1 = new User();
		User u2 = new User("user02", "pass02");
		User u3 = new User("user03", "pass03", "김길동", 30, '남');
		
		//매개변수 5개짜리 생성자(전부 초기화)
		
		System.out.printf("u1 : %s / %s /%s / %d / %c\n", u1.getUserId(), u1.getUserPw(), u1.getUserName(), u1.getUserAge(), u1.getUserGender());
		System.out.printf("u1 : %s / %s /%s / %d / %c\n", u2.getUserId(), u2.getUserPw(), u2.getUserName(), u2.getUserAge(), u2.getUserGender());
		System.out.printf("u1 : %s / %s /%s / %d / %c\n", u3.getUserId(), u3.getUserPw(), u3.getUserName(), u3.getUserAge(), u3.getUserGender());
		
		System.out.println(u1);
	}
}
