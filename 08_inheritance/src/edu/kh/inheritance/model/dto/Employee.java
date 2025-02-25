package edu.kh.inheritance.model.dto;
//final 클래스 : 상속불가
// -> 제공되는 클래스 그대로 사용해야하는 경우
// ex) String
public /*final*/ class Employee extends Person {
	
	private String company;

	

	public Employee() {
		super();
	}

	public Employee(String name, int age, String nationality, String company) {
		super(name, age, nationality);
		this.company = company;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	// Person으로부터 상송받은 메서드 중
	// move() 메서드를 employee에 맞게 재정의(== 오버라이딩)
	//@Override
	//-> 컴파일러에게 문법체크를 하도록 알린다.
	//-> 부모에게 해당 메서드가 있는지 체크
	//-> 이름, 매개변수 타입과 개수가 일치하는 여부 검사
	@Override
	public void move() {
		//super.move(str, num);
		//super 참조변수 : 상속관계에서 부모의 원래 원본함수
		System.out.println("오버라이딩된 move()");
		System.out.println("효율적으로 빨리 일하고 퇴근한다.");
		
		
	}
	public final void onlyEmployee() {
		System.out.println("final 메서드입니다.");
		
	}
}
