package edu.kh.poly.ex2.run;

import edu.kh.poly.ex2.service.AJSCalculator;
import edu.kh.poly.ex2.service.AbstractService;
import edu.kh.poly.ex2.service.Calculator;

public class AbstractRun {
	public static void main(String[] args) {
		AbstractService as = new AbstractService();
		
		Calculator cal = new AJSCalculator();
		
		
		
		System.out.println("합 : " + cal.plus(20, 30));
		System.out.println("차 : " + cal.minus(20, 30));
		System.out.println("곱 : " + cal.multiple(20, 30));
		System.out.println("몫 : " + cal.divide(20, 30));

	
		//인터페이스 == 미완성 설계도 == 객체 생성 불가
		// -> 참조 변수로는 사용가능
		
		//코드의 큰 수정없이
		//객체 생성 코드만 바꾸면 새로운 클래스 코드를 수행할수 있다.
		
		// 인터페이스 특징
		// 1) 인터페이스를 부모 참조변수로 사용하면
		// 다형성 중 업캐스팅이 적용되서
		// 상속받은 모든 클래스를 자식객체로 참조할수 있다.
		// -> 이를 이용해서 중요한 메인코드의 수정을 최소화 할수있다.
		
		// 2) 자식 클래스에 공통된 메서드를 강제 구현하라고 하기때문에
		//모든 자식 클래스가 동일한 형태를 띄게된다
		// ->이를 이용하여 공동작업에 필요한 개발환경 조성이 용이하다
		
		
		
		
		//다중상속중인 인터페이스들에 같은 디폴트 메서드가 겹치면 오류발생
		//구현클래스에오버라이디
	
	}
}
