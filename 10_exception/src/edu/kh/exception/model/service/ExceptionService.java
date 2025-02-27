package edu.kh.exception.model.service;
import java.io.FileNotFoundException;
import java.io.IOException;
//java.lang 패키지는 모든 소스코드에 자동 import
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionService {
	private Scanner sc = new Scanner(System.in);
	public void ex1() {
		System.out.println("정수 1 입력");
		int input1 = sc.nextInt();
		
		System.out.print("정수 2 입력");
		int input2 = sc.nextInt();
		if(input2 != 0) {
			System.out.println("결과 : " + input1 / input2);

			
			
		}else {
			System.out.println("infinity");
		}
		
		//input2에 0이 들어왔을때 0으로 나눌 수 없다 : 산술적 예외 발생
		try {
			//예외가 발생할것 같은 코드
			System.out.println("결과 : "+ input1 / input2);
		}catch(ArithmeticException e){
			// Try에서 던져진 예외를 cathc문의 매개변수 e로 잡음
			// e를 사용하여 예외 추적 코드 작성할수도 있음
			System.out.println("infinity");
			e.printStackTrace();
			
		} // 발생 예외에 대한 메서드와 위치에 대한 모든 내용을 출력
		//예외 발생 지점 추적 메서드
		
		
		//발생하는 예외 중 일부 예외 try-catch 사용안해도
		//if - else 상황 방지 가능
		// 일부 예외 == 대부분 Unchecked Exception
		
		
	
	}
	public void ex2() {
		
		//여러가지 예외에 대한 처리방법
		try {
			System.out.println("정수 1 입력");
			int input1 = sc.nextInt();
			
			System.out.print("정수 2 입력");
			int input2 = sc.nextInt();
			
			System.out.println("결과 : " + input1 / input2);
			
			String str = null;
			System.out.println( str.charAt(0) );
			//Exception <- RuntimeException <- InputMismatchException, ArithmeticException
			
		}  catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");
		} catch(InputMismatchException e) { System.out.println("타입에 맞는 값만 입력하세요.");
		} catch(RuntimeException e) {
		//RuntimeException 은 ArithmeticException과 InputMismatchException에게 상속되므로 오류. 
		/////자식 exception class 아래에 catch문을 작성할것.
		} catch(Exception e) {
			// Exception 클래스 : 모든 예외의 최상위 부모
			// 업캐스팅으로 모든 Exception을 처리할수 있다.
			//최고 조상님이라서 맨 아래에 작성
			
			e.printStackTrace();
			
		}
	}
	public void ex3() {
		try {
			System.out.println("정수 1 입력");
			int input1 = sc.nextInt();
			
			System.out.print("정수 2 입력");
			int input2 = sc.nextInt();
			System.out.println("결과 : " + input1 / input2);
			
		}catch(ArithmeticException e) {
			System.out.println("산술적 예외 처리가 됨");
			
			
			//매개변수 e: 예외 관련된 정보 + 예외 관련되 기능
			System.out.println( e.getClass() ); //Object.getClass() -> 어떤 클래스인지 확인하는 클래스
			//class명 : java.lang.ArithmeticException
			System.out.println( e.getMessage() ); // 예외 발생시 출력된 내용을 보여줌
			
			System.out.println(e);
			
			e.printStackTrace();
			
		}finally {
			System.out.println("무조건 수행됨");
			sc.close();
			
		}
	}
	
	public void ex4() {
		
		try {
			methodA();
		}catch(IOException e) {
			System.out.println("methodC에서부터 발생한 예외를 ex4에서 잡아 처리함");
		}
			
		
	}
	
	public void methodA() throws IOException{
		methodB();
	}
	public void methodB() throws IOException {
		methodC();
	}
	public void methodC() throws IOException {
		//throws : 호출한 메서드에게 예외를 던짐
		//-> 호출한 메서드에게 예외처리를 하라고 위임하는 행위
		
		//throw : 예외 강제 발생 구문
		
		throw new IOException();
		//throw new FileNotFoundException();
	}
	
	public void ex5() throws UserException {
		//사용자 정의 예외 클래스인 UserException 사용하여 강제 예외 발생시키기
		throw new UserException("사용자정의 예외 발생");
		
		
	}
	
	
}
