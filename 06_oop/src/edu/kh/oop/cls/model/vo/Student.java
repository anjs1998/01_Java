package edu.kh.oop.cls.model.vo;

public class Student {
//[접근제한자][예약어] class 클래스명
	
	//접근제한자 public : 같은 프로젝트 내에서 어떤 클래스에서든 import하여 사용할수 있음을 나타냄
	//필드(field) : 객체의 속성을 작석하는 클래스 내부영역
	//== 멤버변수
//클래스변수 (==static 변수) : 필드에 static 예악어가 작성된 변수
//public static String schoolNmae;
//인스턴스변수 :필드에 작성되는 일반 변수
	
//필드 접근제한지 예제 : 필드의 접근제한자 뜻 : 직접 접근 가능한 범위를 나타냄

	public int v1 = 10;
	protected int v2 = 20;
	int v3 = 30;
	private int v4 = 40;
	
	public static String schoolName = "KH고등학교";
	private final int TEMP1 = 100;
	//final은 재대입 불가.
	public void ex1() {
		
		//class 접근제한자 확인해보기
		TestVo test = new TestVo();
		//같은 패키지 내에서만 사용가능
		
		//v1 ~v4 까지 전부 Student 클래스 내부에서 생성된 변수이기 떄문에 같은 클래스 내부인 이곳에서 직접 접근 가능
		
		
		
		System.out.println( v1 );
		System.out.println( v2 );
		System.out.println( v3 );
		System.out.println( v4 );
		
		
	}

}


