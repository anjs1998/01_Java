package edu.kh.poly.ex2.service;
//계산기 인터페이스
// -> 모든 계산기에 대한 공통 필드, 기능명을 제공하는 접점의 용도

public interface Calculator {
	//인터페이스 : 추상클래스의 변형체(추상클래스보다 추상도 높음)
	// - 추상클래스 : 일부만 추상메서드
	
	//속성(필드)
	//필드는 묵시적으로 public static final => 상수
	
	public static final double PI = 3.14; // 상수는 꼭 초기화할것
	static final int MAX_NUM = 100000;
	
	public int MIN_NUM = -100000; // = public static final int MIN_NUM 과 같다
	int ZERO = 0; // = public static final int ZERO
	
	//기능
	
	//메서드는 묵시적으로 public abstract
	public abstract int plus(int num1, int num2);
	
	int minus(int num1, int num2);
	
	public int multiple(int num1, int num2);
	
	
	
	
	public abstract int divide(int num1, int num2);
	
	
	
	
	
	
}
