package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.People;

//Service : 특정 기능(비즈니스 로직)을 제공하는 패키지
public class AbstractionService {
	//속성
	//기능
	public void ex1() {
		
		//People 클래스를 이용해서 국민 객체 만들기
		People p1 = new People();
		// People p1 : People 객체의 주소를 저장하여 참조하는 변수 p1(==참조변수)
		// new People : 새로운 People 객체를 Heap 영역에 생성
		People p2 = new People();
		
		
		p1.tax();
		p1.vote();
		// * 클래스 이름이 자료형처럼 사용된다
		//== 그래서 클래스를 "사용자 정의 자료형"이라고 부른다.
		p1.setName("홍길동");
		p2.setAge(28);
		p2.setGender('남');
		p2.setName("안준성");
		p2.setPhone("010-9209-5820");
		p2.setpNo("000000-0000000");
		p2.setAddress("서울 강동구 고덕로 333");
		
		//char타입 jvm 기본값은 0
		//유니코드 문자체계에서 0은 공백을 나타냄
		// -> int형으로 강제 형변환하면 0인것을 확인할수 있음
		System.out.println("p2의 name:" + p2.getName());
		System.out.println("p2의 gender:" + p2.getGender());
		System.out.println("p2의 pNo:" + p2.getpNo());
		System.out.println("p2의 address:" + p2.getAddress());
		System.out.println("p2의 phone:" + p2.getPhone());
		System.out.println("p2의 age:" + p2.getAge());
		
		
		
		
		
		
		
		
	}
}
