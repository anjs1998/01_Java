package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] st = new Student[3];
		st[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과" );
		st[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과" );
		st[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과" );
		System.out.println(st[0].information());
		System.out.println(st[1].information());
		System.out.println(st[2].information());
		
		char flag = 'Y';
		System.out.println("-------------------------");
		
		Employee[] list = new Employee[0];
		while(flag == 'Y' || flag == 'y') {
			System.out.println(list.length);
			list = addArrIndex(list, 1);
			System.out.println(list.length);
			System.out.println("이름 : ");
			String nameInput = sc.nextLine();
			System.out.println("나이 : ");
			int ageInput = sc.nextInt();
			System.out.println("신장 : ");
			double heightInput = sc.nextDouble();
			System.out.println("몸무게 : ");
			double weightInput = sc.nextDouble();
			System.out.println("급여 : ");
			int salaryInput = sc.nextInt();
			sc.nextLine();
			System.out.println("부서 : ");
			String deptInput = sc.nextLine();
			System.out.println("계속 추가할래? : ");
			flag = sc.nextLine().charAt(0);
			
			list[list.length - 1].setName(nameInput);;
			list[list.length - 1].setAge(ageInput);
			
			list[list.length - 1].setHeight(heightInput);
			list[list.length - 1].setWeight(weightInput);
			list[list.length - 1].setSalary(salaryInput);
			list[list.length - 1].setDept(deptInput);
			
		}
		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i].information());	
		}
		
		
		
	}
	
	public static Employee[] addArrIndex(Employee[] a, int num) {
		Employee[] result = new Employee[a.length + num];
		for(int i = 0; i < result.length; i++) {
			result[i] = new Employee();
		}
		for(int index = 0; index < a.length; index++) {
			result[index] = a[index];
			
		}
		
		
		return result;
		
	}
}/*
//for(데이터타입 변수명 : 배열 또는 컬랙션){
	//반복해서 실행할 코드
}
for(Student std : list){
	System.out.println(std.information());
}*
*/
/*
String str = sc.next().toUpperCase(); -> 소문자를 대문자로 바꿔줌*/

/*str.equalsIgnoreCase("N") -> 대문자, 소문자 구분하지 않고 같은 문자인지 boolean을 반환해서 판별해준다.*/