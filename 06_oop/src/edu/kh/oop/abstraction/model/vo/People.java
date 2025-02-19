package edu.kh.oop.abstraction.model.vo;//vo : 값 저장용 객체(Value Object)

//model - 프로그램 로직과 관련되어잇는 data를 저장하는 용도 + 비즈니스 로직
//VO - 여기서는 값 저장용 객체를 만들기 위한 class를 모아두는 package를 말한다.
public class People { //국민(사람) 클래스
	//속성 == 값 == data
	//값을 저장하기 위한 변수 선언
	//-> 국민이라면 공통적으로 가지고 있는 속성만 작성(추상화) ex. 이름, 성별, 주민번호, 주소, 전화번호, 나이
	//필드 == 필드변수 == 멤버변수 
	
	//[접근제한자] 자료형 변수명;
	
	//캡슐화 : 데이터와 기능을 하나로 몪어서 관리하는 기법
	// 데이터의 직접적인 접근을 제한하는 것이 원칙이다.
	// -> 직접접근을 못하기 때문에 클래스 내부에 간접접근방법을 제공하는 메서드를 작성해둬야 한다.
	// getter/setter
	private String name;
	
	private char gender; //unicode에서 0은 공백을 의미한다.
	
	private String pNo;
	public String getpNo() {
		return pNo;
	}

	public void setpNo(String pNo) {
		this.pNo = pNo;
	}

	private String address;
	private String phone;
	private int age;
	
	public double bitcoin; //공통점이 아니므로 제거
	
	//기능 ==행동/동작 == method(메서드)
	
	public void tax() {
		System.out.println("세금을 냅니다...");
	}
	
	public void vote() {
		System.out.println("투표를 합니다...꼭 하세요!");
		
	}
	
	//캡슐화에서 사용할 간접접근기능(getter/setter)
	public String getName() {return name;}
	
	public void setName(String name) {this.name = name;}
	
	public char getGender() {return gender;}
	
	public void setGender(char gender) {this.gender = gender;}
	
	public String getPNo() {return pNo;}
	
	public void setPNo(String pNo) {this.pNo = pNo;}
	
	public String getAddress() {return address;}
	
	public void setAddress(String address) {this.address = address;}
	
	public String getPhone() {return phone;}
	
	public void setPhone(String phone) { this.phone = phone;}
	
	public int getAge() {return age;}
	
	public void setAge(int age) {
		//음수 입력시 예외처리
		if(age > 0) {
			this.age = age;
		}else {throw new IllegalArgumentException("음수는 안된다...");}
		this.age = age;
		
	}
	//alt + shift + s
	
}
