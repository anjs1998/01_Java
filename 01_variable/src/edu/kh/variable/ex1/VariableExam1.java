package edu.kh.variable.ex1;

public class VariableExam1 {
	//생성된 .java파일과 class 오른쪽에 작성된 클래스명(이름)은 같아야 한다!
	
	
	public static void main(String[] args) {
		System.out.println(2 * 3.141592653589793 * 5); //원의 둘레
		System.out.println(3.141592653589793 * 5 * 5); //원의 넓이
		
		
		//변수 사용
		double pi = 3.141592653589793; //원주율
		int radius = 5; //반지름(radius)
		int height = 20; //높이(height)
				
		System.out.println(2 * pi * radius);
		System.out.println(pi * radius * radius);
		System.out.println(pi * radius * radius * height);
		System.out.println(4 * pi * radius * radius);
		/*변수(variable)
		 * -메모리(RAM)에 값을 기록하는 공간
		 * ->공간에 기록되는 값(Data)이 변할수 있어서 변수라고 한다.
		 * -변수는 여러 종류가 존재(저장되는 값의 형태, 크기가 다름)
		 * 변수 사용의 장점
		 * 1. 가독성 증가
		 * 2. 재사용성 증가
		 * 3. 코드 길이 감소
		 * 4. 유지보수성 증가(코드 수정이 간단해짐)
		 * 
		 * 
		 * 
		 * */
		
	}
}
