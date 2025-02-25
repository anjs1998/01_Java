package edu.kh.inheritance.model.dto;//data transform object : 비즈니스 계층(db)과 data 교환을 위해 사용하는 객체

 
//Object 클래스 - 모든 클래스의 최상위 부모
//컴파일러가 자동으로 object 상속 구문을 자동으로 추가해준다.

public class Person {
	private String name;
	private int age;
	private String nationality;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public Person() {}
	
	public Person(String name, int age, String nationality) {
		super();//부모 생성자(object클래스의 기본생성자 실행)
		this.name = name;
		this.age = age;
		this.nationality = nationality;
	}
	public void breath() {
		System.out.println("사람은 코나 입으로 숨을 쉰다.");
	}
	
	public void move() {
		System.out.println("사람은 움직일수 있다.");
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", nationality=" + nationality + "]";
	}
	
	
}
