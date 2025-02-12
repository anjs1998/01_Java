package edu.kh.variable.ex2;

public class PrintExample {
	public static void main(String[] args) {
		//System.out.println() :  한줄 출력용 메서드(출력후 줄바꿈 수행)
		System.out.println("테스트1");
		System.out.println("테스트2");
		//System.out.println() :  한줄 출력용 메서드(출력후 줄바꿈 X)
		System.out.print("테스트3");	//줄바꿈 여부 차이점은 있지만 괄호안 내용이 그래도 출력된다는것은 똑같음.
		
		System.out.println();//단순 줄바꿈
		System.out.print("테스트4");
		System.out.println();
		
		int iNum1 = 10;
		int iNum2 = 5;
		
		System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
		
		System.out.printf("%d + %d = %d", iNum1, iNum2, iNum1+iNum2);
		//\n -> 줄바꿈
		
		//System.out.printf("패턴", 패턴에 들어갈 변수 나열, , ...);
		/*%d : 정수형, %o : 8진수, %x : 16진수
%c : 문자, %s : 문자열
%f : 실수(소수점 아래 6자리), %e : 지수형태표현, %g : 대입 값 그대로
%A : 16진수 실수
%b : 논리형*/
		System.out.printf("%d + %d * %d / %d = %d", 10, 10, 5, 2, 10 + 10 * 5 / 2);
		int iNum3 = 3;
		
		System.out.printf("%d\n", iNum3);
		System.out.printf("%5d\n", iNum3);//5칸 공간 확보후 오른쪽 정렬
		System.out.printf("%-5d\n", iNum3);
		
		//패턴연습
		
		System.out.printf("%f\n", 10 / 4.0);
		System.out.printf("%.2f\n", 10 / 4.0);
		
		//문자, 문자열, boolean
		boolean isTrue = false;
		char ch = '가';
		String str = "안녕하세요~!";
		
		System.out.printf("%b / %c / %s", isTrue, ch, str);
		
		System.out.println("\\");
		System.out.println("\\o/");
		System.out.println("a\tb\tc\td");
		
		System.out.println("\u0041");
	}
	
	
	
}
