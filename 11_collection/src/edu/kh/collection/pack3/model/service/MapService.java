package edu.kh.collection.pack3.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.kh.collection.pack3.model.dto.Member;

public class MapService {
	// Map : Key와 Value 한쌍이 데이터가 되어 이를 모아둔 객체
	
	// Key : Value --> 이 한쌍을 "entry"라고 부름
	
	// key 를 모아두면 Set의 특징을 가짐(중복X)
	
	// value를 모아두면 List의 특징을 가진다.(중복 O)
	
	public void ex1() {
		//HashMap<K, V> : Map 인터페이스 상속 클래스중 가장 대표적으로 쓰이는 클래스이다.
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		// Map.put(Integer Key, String Value) : 추가
		map.put(1, "홍길동");
		map.put(2, "고길동");
		map.put(3, "김길동");
		map.put(4, "박길동");
		map.put(5, "정길동");
		map.put(6, "이길동");
		
		
		//key 중복 테스트
		map.put(1, "안준성"); // 중복허용 X, 대신 Value 덮어쓰기
		
		//value 중복 테스트
		map.put(7,  "고길동");
		
		System.out.println( map ); // map.toString() 오버라이딩 되어있음
		
		
	}
	
	public void ex2() {
		//Map 사용 예제
		//VO, DTO (값 저장용 객체)는 특정 DATA묶음의 재사용이 많은 경우 주로 사용
		// -> 재사용이 적은 VO는 오히려 코드낭비
		// -> Map을 이용해서 VO와 비슷한 코드를 작성가능
		
		// 1) VO 버전
		Member member = new Member();
		
		//값 세팅
		member.setId("userId");
		member.setPw("pass01");
		member.setAge(30);
		
		//값 출력
		System.out.println( member.getId() );
		System.out.println( member.getPw() );
		System.out.println( member.getAge() );
		
		// 2) Map 버전
		Map <String, Object> map = new HashMap<String, Object>(); // null포인터 exception
		//value가 Object타입 == 어떤 객체든 Value에 들어올수 있다.
		
		// 값세팅
		map.put("id", "user02");
		map.put("pw", "pass02");
		map.put("age", 25);
		
		// 값 출력
		// object(Value) Map.get(String Key) : 매개변수로 전달받은 Key와 대응되는 Value 반환
		
		System.out.println( map.get("id") );
		System.out.println( map.get("pw") );
		System.out.println( map.get("age") );
		
		System.out.println("---------------------------");
		
		// ** Map에 저장된 data 순차적으로 접근하기
		
		//for(String key : map) {System.out.println(map.get(key));} // compile error!
		
		//Map에서 Key만 모아두면 Set의 특징을 가진다( 중복저장 X)
		
		// -> 이를 활용해서 Map에서 keySet() 메서드 제공
		// -> Key만 모아서 Set으로 반환!
		
		Set<String> set = map.keySet(); // id, pw, age가 저장된 Set 반환
		
		System.out.println( "keySet() : " + set);
		
		for(String key : set) {
			System.out.println( map.get(key) );
		}
		
		// map에 저장된 data가 많거나(반복 필요)
		// 어떤 key가 있는지 불분명할때 향상된 for문이 좋다.
		// 또는 map에 저장된 모든 data에 접근해야 할때:
		//keySet() + 향상된 for문 코드 사용
		
		
	}
	
	public void ex3() {
	//List에 Map 여러개 추가하여 다루기(자주 쓰이는 테크닉임!)
	
	List< Map<String, Object>> list = new ArrayList<Map<String, Object>>();
	// ArrayList만 생성됨. Map객체는 위 Line에서는 아직 생성되지 X
	
	for(int i = 0; i < 10; i++) {
		//Map 객체 생성
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("id", "user0" +i);
		map.put("pw", "pass0" +i);
		
		list.add(map);
		

	}
	
	System.out.println( list );
	
	//향상된 for문 이용하여 key가 "id"에 대응되는 value값 전부 출력하기
	for(Map<String, Object> temp : list) {
		System.out.println( temp.get("id") );
	//hashmap은 순서를 보장하지 안는 자료구조
		
		//순서보장을 원하면 LinkedHashMap을 사용 : put한 순서를 유지시켜줌
		
		
	}
	}
}