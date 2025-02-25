package edu.kh.inheritance.model.service;

import edu.kh.inheritance.model.dto.Employee;
import edu.kh.inheritance.model.dto.Person;
import edu.kh.inheritance.model.dto.Student;

public class InheritanceService {
	//상속 확인 예제
	
	public void ex1() {
		
		Person p = new Person();
		
		p.setName("홍길동");
		p.setAge(25);
		p.setNationality("대한민국");
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getNationality());
		
		System.err.println("=================");
		//Student 객체 생성
		Student std = new Student();
		
		//Student 만의 고유한 멤버
		std.setGrade(3);
		std.setClassRoom(5);
		
		//Person 클래스로부터 상속받은 멤버
		std.setName("고길동");
		std.setAge(19);
		std.setNationality("대한민국");
		
		System.out.println(std.getGrade());
		System.out.println(std.getClassRoom());
		
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getNationality());
		
		Employee emp = new Employee();
		
		emp.setCompany("KH정보교육원");
		
		emp.setName("조미현");
		
		emp.setAge(20);
		emp.setNationality("대한민국");
		
		System.out.println(emp.getCompany());
		
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getNationality());
	
	
	
	}
	public void ex2() {
		Student std = new Student("홍길동", 17, "한국", 1,3);
		
		
	}
	
	//Employee 객체 생성
	//매개변수생성자 이용(이름, 나이, 국적, 회사)
	
	
	public void ex3() {
		Student std = new Student();
		Employee emp = new Employee();
		
		
		std.move();//오버라이딩 X -> 부모(Person)의 메서드 실행
		emp.move();//오버라이딩 0 -> employee에서 재정의한 메서드 수행
		
		
		
		
	}
	
	public void ex4() {
		Person p = new Person("김철수", 17, "한국");
		
		System.out.println(p.toString());
		//print 구문 수행시 참조변수명을 작성하면
		// 자동으로 toString() 메서드를 호출해서 출력해준다.
		
		
		Student std = new Student("강호동", 18, "미국", 2, 6);
		
		System.out.println( std.toString() );
		
		//Employee 객체 생성 ("김노동, 36, "한국", "KH정보교육원")
		
		
	}
}
