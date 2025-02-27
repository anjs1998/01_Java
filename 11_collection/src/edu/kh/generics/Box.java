package edu.kh.generics;

// 제네릭 클래스 선언
public class Box<T> {
	//T는 "type 파라미터라고 부름
	//실제 사용시 구체적인 타입으로 변환됨
	private T item; // T 타입의 변수 선언

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
	
}
