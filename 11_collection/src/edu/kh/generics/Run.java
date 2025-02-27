package edu.kh.generics;

public class Run {
	public static void main(String[] args) {
		Box<String> box = new Box<String>(); //T가 String으로 대체됨
		//-> 필드도 String타입, getter/setter에서 사용되는 타입도 String
		
		box.setItem("안녕 제네릭");
		
		System.out.println( box.getItem() );
		
		Box<Integer> intBox = new Box<>();
		
		//Java 7 이상에서는 우변 타입 생략 가능
		//다이아몬드 연산자 : 컴파일러가 좌변을 보고 타입추론
		intBox.setItem(123);
		System.out.println(intBox.getItem());
		
		//제네릭은 기본자료형(primitive type)인 int, double, char 같은 타입은 사용불가. 객체만 가능
		//대신 Wrapper클래스를 사용
		
		//byte Byte
		//short Short
		//int Interger
		//long Long
		//float Float
		//double Double
		//char Character
		//boolean Boolean
		
		int num = 10;
		Integer num1 = num; 	// 오토박싱(Auto-boxing)
								// 기본형 -> 래퍼클래스 자동변환
		
		int num2 = num1;		// 오토 언박싱
	}
}
