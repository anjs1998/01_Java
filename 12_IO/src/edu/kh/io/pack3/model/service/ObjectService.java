package edu.kh.io.pack3.model.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import edu.kh.io.pack3.model.dto.Member;

public class ObjectService {
/**
 * -Java객체를 입/출력할때
 * 사용하는 바이트 기반 "보조" 스트림
 * (보조 스트림은 단독사용 불가능!)
 * 
 * ***직렬화(serializable)
 * - 객체를 직렬(직선) 형태로 변환하는것
 * 
 * - 직렬화란 객체의 상태(필드값)을 바이트스트림으로 변환하는 과정
 * 이를 통해 객체는 메모리에만 존재하는 것이 아니라, 파일로 저장되거나 네트워크를 통해 전송가능
 * 
 * -역직렬화는 바이트 스트림을 다시 객체로 복원하는 과정
 * 즉, 저장되거나 전송된 데이터를 원래의 객체 형태로 되돌리는 작업.
 * 
 * 
 * 
 * 
 * 
 * *********************/
	
	/*객체를 외부 파일로 출력
	 * 자바프로그램 내부 -> 외부 출력
	 * 
	 * 직렬화 필요!
	 * 
	 * */
	public void objectOutput() {
		
		//스트링 참조변수 선언
		FileOutputStream fos = null;
		//기반 스트림
		ObjectOutputStream oos = null;
		//객체 출력용 보조 스트림
		try {
			//.dat확장자 : data의 줄임말. 
			fos = new FileOutputStream("/io_test/20250305/Member.dat");
			
			oos = new ObjectOutputStream(fos);
			
			//Member 객체 하나 생성
			Member member = new Member("member01", "pass01", "김회원", 30);
			
			//ObjectOutputStream 이용해서 Member 객체를 출력하기.
			
			oos.writeObject(member);// member객체를 연결된 경로의 파일에 쓰겟다(출력)
			//java.io.NotSerializableException: --> 직렬화 되지 않았다는 exception
			// --> Member 클래스를 직렬화하기 위해 implements Serializable 해줘야함
			
			System.out.println("회원 data 출력 완료");
			
			
			
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(oos != null) oos.close(); 
				//기반스트림 fos도 함께close됨	
			
			} catch(Exception e) {
				e.printStackTrace();
			} 
		}
		
		
		
	}
	/*역직렬화 필요*/
	public void objectInput() {
		//스트림 참조 선언 필요
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("/io_test/20250305/Member.dat");
			ois = new ObjectInputStream(fis);
			
			
			//스트림을 이용해서 파일에 작성된 직렬화된 Member객체를 읽어와
			//역직렬화를 수행하여 정상적인 Member객체로 변경
			
			//Object ois.readObject() : 직렬화된 객체를 읽어와 역직렬화
			Member member = (Member)ois.readObject(); //Object 객체를 Member객체로 다운캐스팅
			
			System.out.println(member);
				
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {if(ois != null) ois.close();}catch(Exception e) {e.printStackTrace();}
		}
		
	}
}
