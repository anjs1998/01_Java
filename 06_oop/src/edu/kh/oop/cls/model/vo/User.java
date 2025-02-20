package edu.kh.oop.cls.model.vo;

public class User {
	//속성(필드)
	//아이디, 비밀번호, 이름, 나이, 성별(추상화 진행)
	//data 직접접근 불가원칙
	//필드는 기본저긍로 모두 private (캡슐화 진행)
	private String userId;
	private String userPw;
	private String userName;
	private int userAge;
	private char userGender;
	
	//기본생성자 ( -> 매개변수 없는 생성자)
	//ctrl + space 단축키
	public User() {
		//기능
		System.out.println("기본생성자로 User 객체 생성");
		
		//필드 초기화
		userId = "user01";
		userPw = "pass01";
		userName = "홍길동";
		userAge = 20;
		userGender = '남';
		
	}
	public User(String userId, String userName, char userGender) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userGender = userGender;
	}
	//매개변수 생성자:
	//변수 : 매개변수, Overloading(오버로딩), this
	public User(String userId, String userPw) {
		System.out.println("매개변수 생성자를 이용하여 User 객체 생성");
		//필드 초기화
		this.userId = userId;
		this.userPw = userPw;
		
		//this 참조변수 
		// - 객체가 자기 자신을 참조할수 있도록 하는변수
		// 왜 사용?
		//-> 필드명과 매개변수명이 같은경우
		//이를 구분하기 위해서 사용한다.
		
		
	}
	
	//오버로딩 조건
	//메서드의 이름이 동일
	//매개변수의 개수, 타입(자료형), 순서 중 1개라도 달라야 함.
	
	
	//필드를 전부 초기화하는 목적의 매개변수 생성자
	public User(String userId, String userPw, String userName, int userAge, char userGender) {
		
		this(userId, userPw); // ******중요****** this()는 생성자 내에서 사용할때 반드시 첫번째 줄에 사용해야 한다!!!!!!!!
		//this.userId = userId;
		//this.userPw = userPw;
		this.userName = userName;
		this.userAge = userAge;
		this.userGender = userGender;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public char getUserGender() {
		return userGender;
	}
	public void setUserGender(char userGender) {
		this.userGender = userGender;
	}
	
	//기능 (생성자 + 메서드)
	
	
	/*
	 * 생성자(constructor)
	 * 
	 * -new 연산자를 통해서 객체를 생성할때 
	 * 생성된 객체의 필드값 초기화 + 지정된 기능을 수행하는 역할
	 * 
	 * 
	 * -생성자 작성 규칙
	 * 1) 생성자의 이름은 반드시 클래스명과 같아야 한다.
	 * 2) 반환형이 존재하지 않는다.
	 * 
	 * -생성자 종류
	 * 1) 기본생성자
	 * 2) 매개변수 생성자
	 * 
	 * 
	 * */
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userPw=" + userPw + ", userName=" + userName + ", userAge=" + userAge
				+ ", userGender=" + userGender + "]";
	}
}
