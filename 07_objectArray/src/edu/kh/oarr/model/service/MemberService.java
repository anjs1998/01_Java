package edu.kh.oarr.model.service;

import java.util.Arrays;
import java.util.Scanner;

import edu.kh.oarr.model.vo.Member;

public class MemberService {
	private Scanner sc = new Scanner(System.in);
	
	 //Member 5칸ㄴ짜리 객체배열 선언 및 할당
	
	private Member[]  memberArr = new Member[5];
	private Member loginMember = null;
	public MemberService() {
		// TODO Auto-generated constructor stub
		
		// memberArr 배열 0,1,2 인덱스 초기화
		
		memberArr[0] = new Member("user01", "pass01", "홍길동", 30, "서울");
		memberArr[1] = new Member("user02", "pass02", "계보린", 25, "경기");
		memberArr[2] = new Member("user03", "pass03", "고길동", 45, "강원");
		
	}
	public void displayMenu() {
		
		int menuNum = 0;//메뉴 선택용 변수
		
		do {
			System.out.println("===회원 정보 관리 프로그램 v2===");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 정보 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("5. 회원 검색(지역)");
			System.out.println("0. 프로그램 종료");
			
			menuNum = sc.nextInt();
			sc.nextLine();
			
			switch(menuNum) {
			
			case 1 : System.out.println(signUp());break;
			case 2 : System.out.println(login());break;
			case 3 : System.out.println(selectMember());break;
			case 4 : updateMember(); break;
			case 5 : searchRegion(); break;
			case 0 : System.out.println("프로그램 종료"); break;
			default : System.out.println("잘못 입력하셧습니다. 다시 입력하세요!");
			}
			
		}while(menuNum != 0);
	}
	//memberArr의 비어있는 인덱스 번호를 반환하는 메서드
	//단, 비어있는 인덱스가 없다면 -1 반환
	public int emptyIndex() {
		//memberArr 배열을 0인덱스부터 끝까지 접근해서 참조한느 값이 null인 경우의 인덱스를 반환
		for(int i = 0; i < memberArr.length; i++) {
			if(memberArr[i] == null) { return i;}
			
		}
		return -1;//배열에 빈칸이 없다.
	}
	
	public String signUp() {
		System.out.println("\n=======회원 가입=======");
		
		//memberArr배열에 빈자리가 있는지 확인
		int index = emptyIndex();
		if(index == -1) {return "회원가입 불가능합니다.(인원수 초과)";}
		System.out.println("아이디  : ");
		String memberId = sc.next();
		
		System.out.println("비밀번호  : ");
		String memberPw = sc.next();
		
		System.out.println("비밀번호 확인 : ");
		String memberPw2 = sc.next();
		
		System.out.println("이름  : ");
		String memberName = sc.next();
		
		System.out.println("나이  : ");
		int memberAge = sc.nextInt();
		
		System.out.println("지역  : ");
		String region = sc.next();
		if(memberPw.equals(memberPw2)) {
			
			memberArr[index] = new Member(memberId, memberPw, memberName, memberAge, region);
			
		}
		return "회원가입 완료";
	}
	
	
	public String login() {
		
		System.out.println("=======로그인=======");
		System.out.println("아이디를 입력하세요 : ");
		String idInput = sc.next();
		System.out.println("비밀번호를 입력하세요 : ");
		String pwInput = sc.next();
		
		for(int i = 0; i < memberArr.length; i++) {
			 
			 if( memberArr[i] != null
					&& memberArr[i].getMemberId().equals(idInput) 
					&& memberArr[i].getMemberPw().equals(pwInput)
					) {
				loginMember = memberArr[i];
				return loginMember.getMemberName() + "님 환영합니다!";
			}
			
		}
		return "아이디 또는 비밀번호가 일치하지 않습니다.";
		//1) 아이디, 비밀번호 입력받기
		//2) memberArr 배열 내 요소를 순서대로 접근하여
		//2-1) 현재 접근한 요소가 null이 아닌지 확인
		//2-2) 회원정보가 있을경우
		// -> 회원정보의 아이디, 비밀번호가 입력받은 아이디, 비밀번호가 같은지 비교
		//2-3) 같다면 로그인 회원정보 객체를 참조할 변수 loginMember에 현재 접근중인 memberArr[i] 요소에 저장된 주소를 얕은 복사
		
		//3) 로그인 성공/실패 여부에 따라 결과 값 반환:
		//-> 로그인 성공 : 홍길동님 환영합니다!
		//-> 로그인 실패 : 아이디 또는 비밀번호가 일치하지 않습니다.
	}
	public void searchRegion() {
		
		System.out.println("\n=======회원 검색(지역)=======");
		System.out.println("검색할 지역을 입력하세요 : ");
		String inputRegion = sc.next();
		
		//1) memberArr 배열의 모든 요소 순차 접근
		boolean flag = true;
		
		for(int i = 0; i < memberArr.length; i++) {
			if(memberArr[i] == null) break;
			
		
		//2) memberArr[i] 요소가 null인 경우 반복 종료
		
		//3) memberArr[i]요소가 null이 아니라면
		//	memberArr[i] 욧에 저장된 지역(region)이
		//입력받은 지역(inputRegion)과 같을경우
		//memberArr[i] 요소의 저장된 객체의
		//회원의 아이디, 이름을 출력
			if(memberArr[i].getRegion().equals(inputRegion)) {
				System.out.printf("아이디 : %s, 이름 : %s\n", 
						memberArr[i].getMemberId(),memberArr[i].getMemberName() );
				flag = false;
			}	
			
		}
		// 4) 입력한 지역과 일치하는 회원이 없다면
		// 일치하는 검색결과가 없습니다! 출력
		if(flag) {System.out.println("일치하는 검색결과가 없습니다!");}
		
	}
	
	public String selectMember() {
		System.out.println("======회원 정보 조회======");
		if(loginMember == null) return "로그인 후 이용바람";
		else { return "이름 : " + loginMember.getMemberName() + "\n"
					+"아이디 : " + loginMember.getMemberId() + "\n"
					+"나이 : " +loginMember.getMemberAge() + "\n"
					+"지역 : " +loginMember.getRegion();}
		
	}
	public int updateMember() {
		System.out.println("======회원 정보 수정======");
		if(loginMember == null) {System.out.println("로그인 후 이용바람"); return -1;}
		System.out.println("수정할 이름 입력 : ");
		String nameInput = sc.next();
		System.out.println("수정할 나이 입력 : ");
		int ageInput = sc.nextInt();
		System.out.println("수정할 지역 입력 : ");
		String regionInput = sc.next();
		System.out.println("비밀번호 입력 : ");
		String pwInput = sc.next();
		if(!loginMember.getMemberPw().equals(pwInput)) {System.out.println("회원정보 수정 실패(비밀번호 불일치)"); return 0;}
		else System.out.println("회원정보가 수정되었습니다:)"); return 1;
	}
	public void ex1() {System.out.println(Arrays.toString(memberArr));}
	
}
