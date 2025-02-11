package edu.kh.variable.ex1;

public class VariableExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 자바 기본자료형 8가지
		 * 논리형 : boolean ( 1byte)
		 * 정수형 : byte(1byte), short(2byte), int(4byte), long(8byte)
		 * 실수형 : float(4byte), double(8byte) 
		 * 문자형 : char(2byte, 유니코드)
		 * 
		 * 참조형 : String 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 변수 선언 : 메모리(RAM)에 값을 저장할 공간을 할당하는 것
		 * 변수 값 대입 : 변수에 값을 집어넣는 것
		 * */
		boolean booleanData; //변수의 선언
		//메모리에 논리값(t/f)을 저장할 공간을 1byte 할당후
		//할당된 공간의 이름을 booleanData라고 정하겟다.
		booleanData = true;
		
		System.out.println("booleanData : " + booleanData);
		
		byte byteNumber = 127; // 128넣는 순간 에러( 값의 범위( -128 ~ 127))
		//메모리에 정수값을 저장할 공간을 1byte 할당하고
		//할당된 공간을 byteNumber라고 부르겟다
		//선언된 byteNumber 변수에 처음으로(초기값) 127을 넣음
		//--> 초기화 : 처음 변수에 값을 대입
		
		short shortNumber = 32767;
		//정수 자료형 기본형 int ->> (short, byte는 옛날 코드의 잔재)
		int intNumber = 2147483647;
		//프로그래밍에서 대입되는 데이터(값 자체)를 literal이라는 단어로도 표현
		
		
		long  longNumber = 10000000000L; //자료형에 따라서 리터럴 표기법이 다름!
		/*the literal 10000000000 of type int is out of range
		 * -> 100억이라는 값은 int의 범위를 벗어났다
		 * 리터럴값 자체를 int로 인식하고 있다
		 * 뒤에 L 을 붙여줘서 long 자료형인것을 나타내줌
		 */
		
		
		float floatNumber = 1.2345f;
		//1.2345까지만 쓰면 double 자료형으로 인식하기 때문에
		//변수 타입인 float과 일치하지 않아 type mismatch
		
		double doubleNumber = 3.141592d;
		//double이 실수형 중에서 기본형!
		//리터럴 표기법 없는 실수는 double로 인식
		
		//문자형(char) 리터럴 표기법 : ''(홑따옴표)
		char ch = 'A';
		char ch2 = 66;
		
		/*
		 * char 자료형에 숫자가 대입될수 있는 이유!
		 * 컴퓨터에는 문자표가 존재하고 있음
		 * 숫자에 따라 지정된 문자모양이 각각 매핑되고
		 * 'B'문자 그대로 대입되면 변수에 숫자 66으로 변환되어 저장
		 * -> 반대로 생각하면 변수에 처음부터 66이라는 숫자를 저장하는것도 가능하다!
		 *
		 * 
		 * */
		
		
		
		
		
		//변수의 명명규칙
		//1. 대소문자 구분, 길이제한 X
		int abcdefg123456789;
		//2. 예약어 사용 X
		//double final;
		//3. 숫자 시작 X
		//char 1abc
		char a1bc;
		
		//4. 특수문자 $, _만 사용가능( 하지만 현업에서는 쓰지 X)
		int $intNumber; //문제 없음
		int int_Number; // 대신 카멜표기법 사용. 상수(대문자로 표기)나 자바 외 DB에서 사용할것 (ex. MEMBER_NAME)
		
		//5. 카멜표기법(맨 처음 소문자 시작, 후속 단어 첫글자 대문자)
		char helloWorldAppleBananaTomato;
		
		//6. 변수명은 언어를 가리지 않는다. (다만 실제로는 절때 쓰지 말것)
		
		//-----------------------------------------
		
		final double PI_VALUE = 3.14;
		//PI_VALUE = 2.33 --> 에러!
		
		/* 상수(항상 같은 수)
		 * 변수 한 종류
		 * 한번 값 대입시 다른 값을 재대입 할수없음
		 * 자료형 앞에 final키워드를 작성
		 * 상수 명명 규칙 :  모두 대문자, 여러단어 작성시 _ 사용
		 * 
		 * 상수를 사용하는 경우:
		 * 1) 변하면 안되는 고정된 값을 저장할때
		 */
		
		final int MIN_AGE = 1;
		
		
		
	}

}
