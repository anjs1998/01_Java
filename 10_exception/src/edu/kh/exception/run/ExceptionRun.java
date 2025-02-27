package edu.kh.exception.run;

import edu.kh.exception.model.service.ExceptionService;
import edu.kh.exception.model.service.UserException;

public class ExceptionRun {
	// 예외 : (Exception) : 소스코드의 수정으로 해결하능한 오류
	// 예외는 두 종류로 구분됨
	
	//1) Unchecked Exception : 선택적으로 예외처리(ex. Runtime Exception)
	//2) CheckedException : 필수적으로 예외처리(ex. IOException)
	
	
	public static void main(String[] args) {
		ExceptionService es = new ExceptionService();
		try {
			es.ex5();
		} catch (UserException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
