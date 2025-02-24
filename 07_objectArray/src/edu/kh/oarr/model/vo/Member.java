package edu.kh.oarr.model.vo;

public class Member {
	private String memberId;
	private String memberPw;
	private String memberName;
	private int memberAge;
	private String region;
	
	//생성자 작성 규칙:
	//1.생성자 이름은 클래스명과 같다.
	//2. 반환형이 없다.
	//3. 기본생성자는 컴파일러가 자동으로 생성해준다.
	//-> 단, 다른 생성자가 하나라도 있으면 자동생성은 이루어지지 않는다.
	//-> 매개변수생성자가 있다면, 기본생성자를 직접 만들어야한다.
	
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	//오버로딩 성립조건 : 매개변수의 개수, 순서, 자료형(type) 중 하나라도 달라야 한다.
	
	public Member(String memberId, String memberPw, String memberName, int memberAge, String region) {
		
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
		this.region = region;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public int getMemberAge() {
		return memberAge;
	}
	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	
	
	
	
}
