package edu.kh.variable.ex1;

public class VariableExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*강제 형변환
			 * -기존 자료형을 원하는 자료형으로 강제변환시키는것
			 * 
			 * 1) 값의 번위가 큰 자료형을 값의 범위가 작은 자료형으로 변환할때
			 * 2) 출력되는 데이터의 표기법을 변환시키고 싶을때
			 * 
			 * * 강제 형변환 방법
			 * -자료형을 변환시키고 싶은값 또는 변수 앞에 (자료형)을 작성
			 * 
			 * 
			 * 
			 * */
		
		double temp = 3.14;
		int num = (int)temp; //강제 형변환
		
		System.out.println("temp : " + temp);
		System.out.println("num : " + num);
		
		//정수형 변환시 소수점 아래자리 손실(데이터 손실)
		
		
		//int -> byte
		
		int iNum = 290;
		byte bNum = (byte)iNum;//강제 형변환
		
		//같은 정수형끼리의 변환시에도
		//값의 범위차이때문에 데이터 손실발생!
		
		
		//char -> int 강제 형변환
		char ch = 'A';
		
		System.out.println((int)ch);
		
		//int -> char 강제형변환
		//44085
		
		int iNum3 = 44085;
		System.out.println((char)iNum3);
		
		int i6 = 2147483647;// int의 최댓값
		int result2 = i6 + 1;
		System.out.println(result2);
		
		
		
	} 
	
	

}
