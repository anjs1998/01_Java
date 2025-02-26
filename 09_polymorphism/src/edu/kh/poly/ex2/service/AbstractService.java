package edu.kh.poly.ex2.service;

import edu.kh.poly.ex2.dto.Animal;
import edu.kh.poly.ex2.dto.Fish;
import edu.kh.poly.ex2.dto.Person;

public class AbstractService {
	public void ex1() {
		//Animal a1 = new Animal()
		//객체화 불가
		//부모타입 참조변수로써의 역할은 가능하기 떄문에
		//Animal을 상속받아 미완성 부분을 구체적으로 구현한
		//자식 클래스를 이용해 객체 생성
		
		Person p1 = new Person();
		
		p1.setName("홍길동");
		p1.setType("척추동물 중 인간");
		p1.setEatType("잡식");
		
		Fish f1 = new Fish();
		
		f1.setType("척추동물 중 어류");
		f1.setEatType("잡식");
		
		//추상클래스와 다형성
		Animal a1 = new Person();
		Animal a2 = new Fish();
		
		System.out.println(p1.toString());
		System.out.println(f1.toString());
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		a1.ex();
		a1.breath();
		a1.move();
		a1.eat();
		a2.ex();
		a2.breath();
		a2.move();
		a2.eat();
		
	}
}
