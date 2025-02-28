package edu.kh.collection.pack1.model.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import edu.kh.collection.pack1.model.dto.Student;



/**
 * 
 */
/**
 * 
 */
public class StudentService {
	//java.util.List 인터페이스 : List에 반드시 필요한 필수기능을 모아둔 인터페이스
	// * 인터페이스 객체 생성 X, 부모 참조변수의 역할 O
	
	//java.util.ArrayList : 배열 형태 List (가장 대표적인 List 자식 클래스)
	
	//학생 정보를 저장할 List 생성
	private List<Student> studentList = new ArrayList<Student>();//업캐스팅 
	// new ArrayLIst() -> 기본생성자. 기본크기 10짜리 리스트 생성
	// 하지만 리스트의 크기는 늘었다 줄었다 하기때문에 큰 의미 없음
	//ArrayList는 조회, 검색에 효율적
	//LinkedList 는 추가, 수정, 삭제에 효율적
	private Scanner sc = new Scanner(System.in);
	private List<Object> testList = new ArrayList();
	
	
	public StudentService() {
		studentList.add(new Student("홍길동", 23, "서울시 중구", 'M', 100));
		studentList.add(new Student("고영희", 23, "경기도 고양시", 'F', 100));
		studentList.add(new Student("강아지", 30, "서울시 강남구", 'M', 80));
		studentList.add(new Student("오미나", 27, "충북 청주시", 'F', 90));
		studentList.add(new Student("박주희", 24, "서울시 서대문구", 'F', 70));
		
		
	}
	public void ex() { // List 테스트용 예제
	//List.add(Object e); 리스트에 객체를 추가
	//매개변수 타입이 Object = 모든 객체를 매개변수로 전달가능
		testList.add("문자열");
		testList.add(new Student("홍길동", 25, "서울시 중구", 'M', 90));
		testList.add(sc);
		testList.add(new Object());
		
		//컬렉션의 특징 : 여러 타입의 데이터 저장가능
		
		//Object List.get(index) --> List에서 index번째 인덱스에 있는 객체를 반환
		
		System.out.println( testList.get(0) + " / \n");
		System.out.println( testList.get(1) + " / \n");
		System.out.println( testList.get(2) + " / \n");
		System.out.println( testList.get(3) + " / \n");
		
		//testList에서 꺼내온 index요소가 Student 혹은 상속관계인지 검사
		//만약 Student라면 이름을 꺼내오고 싶다.
		
		for(Object e : testList) {
			if( e instanceof Student ) {
				System.out.println( ((Student)e).getName() );
			}
			
		}
		
		
	}
	/**
	 *  alt + shift + j 
	 *  
	 *  @author 안준성 (anjs1998@naver.com)
	 */
	public void displayMenu() {
		
		int menuNum = 0; // 메뉴 선택용 변수
		
		do {
			System.out.println("\n=====학생 관리 프로그램=====");
			System.out.println("1. 학생 정보 추가");
			System.out.println("2. 학생 정보 전체 조회");
			System.out.println("3. 학생 정보 수정");
			System.out.println("4. 학생 정보 제거");
			System.out.println("5. 이름으로 검색(일치)");
			System.out.println("6. 이름으로 검색(포함)");
			System.out.println("7. 나이순으로 정렬");	//Comparable 사용
			System.out.println("8. 이름순으로 정렬");	//Comparator 사용
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 번호 선택 : ");
			
			
			try {
				menuNum = sc.nextInt();
				sc.nextLine(); //입력버퍼 개행문자 제거용
				switch(menuNum) {
				case 1: System.out.println(addStudent()); break;
				case 2: selectAll();  break;
				case 3: updateStudent(); break;
				case 4: removeStudent(); break;
				case 5: searchName1(); break;
				case 6: searchName2(); break;
				case 7: sortByAge(); break;
				case 8: sortByName(); break;
				case 0: System.out.println("프로그램 종료.."); break;
				default : System.out.println("메뉴에 작성된 번호만 입력하세요!");
				
				}
				
			} catch(InputMismatchException e) {
				System.out.println("\nerror : 입력형식이 유효하지 않습니다. 다시 시도해주세요.");
				sc.nextLine(); // 입력버퍼에 남아있는 잘못된 코드 제거
				menuNum = -1; // 첫 반복시 잘못입력하는 경우 menuNum이 초기값인 0응ㄹ 가지고 있어 반복문이 종료되는데, 이를 방지하기 위해 임의값 -1 대입
				
			}
		} while(menuNum != 0);
		
	}
	
	
	/**
	 * 1. 학생 정보 추가 메서드
	 * @return 삽입 성공시 "성공", 실패시 "실패" 문자열 반환
	 */
	public String addStudent()  {
		//CheckedException : 반드시 throws 구문이나 try - catch 처리 강제
		//IOException, SQLException
		//UncheckedException : 강제 처리 X, 예외 발생시 자동으로 상위 호출 메서드로 예외전파
		//상위호출메서드로 예외가 전파됨
		//inputMismatchException, NullPointerException
		
		//삽입 성공시 "성공", 실패시 "실패" 문자열 반환
		System.out.println("=====학생 정보 추가=====");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("사는곳  : ");
		String region = sc.nextLine();
		System.out.print("성별(M/F):"  );
		char gender = sc.next().charAt(0);
		System.out.print("점수:"  );
		int score = sc.nextInt();
		
		//Student 새 객체 생성 후 studentList에 추가
		if ( studentList.add( new Student(name, age, region, gender, score) ) ){
			return "성공";
		}else {
			return "실패";
		}
		
		
		
	}
	
	/**2. 학생 전체 조회 메서드
	 *  List가 비어있는 경우 "학생 정보가 없습니다" 출력
	 *  있는 경우 전체 학생 출력
	 * 
	 */
	public void selectAll() {
		System.out.println("=======학생 전체 조회=======");
		
		//studentList가 비어잇는 지 확인
		//List에 저장된 데이터의 개수를 얻어오는 방법 : int List.size();
		
		//if(studentList.size() == 0) {
		//List.isEmpty() --> 컬렉션이 비어있다면 true반환
		if(studentList.isEmpty()) {
			System.err.println("학생 정보가 없습니다");
			return; // 현재 메서드를 종료하고 호출한곳으로 돌아감
		}
		
		/*for(int i = 0; i < studentList.size(); i++) {
			// -> length(X)
			
			
		} 향상된 for each 문 사용-*/
		int index = 0;
		for(Student std : studentList) {
			System.out.print( (index++) + "번 : ");
			System.out.println(std);
			
		}
		
			
	}
	
	/*
	 * 3. 학생 정보 수정 메서드
	 * -학생 정보가 studentList에 하나라도 있는지 검사,
	 * 없다면 "입력된 학생정보가 없습니다" 문자열 반환
	 * -인덱스 번호로 학생을 수정하려 하는데, 입력된 숫자가 0보다 작은지 검사
	 * 입력된 숫자가 0보다 작은지 검사, 작다면 "음수는 입력할 수 없습니다" 반환
	 * -studentList 범위 내 인덱스번호인지 검사,
	 * 초과시 범위를 넘어선 값을 입력할 수 없습니다 반환
	 * 
	 * 수정할 떄
	 * 1. index 번쨰에 저장된 학생정보
	 * 수정 전 정보를 출력
	 * 
	 * 2. 이름, 나이, 사는곳, 성별, 점수 수정할 값 입력받기
	 * 
	 * 3. 수정완료시 "000의 정보가 변경되엇습니다" 반환
	 * 
	 * 
	 * 
	 * */
	public String updateStudent() {
		System.out.println("=======학생 정보 수정=======");
		System.out.println("인덱스 번호:");
		int index = sc.nextInt();
		if(studentList.isEmpty()) {
			return "";
		} else if(index < 0) {
			return "음수는 입력할 수 없습니다";
		} else if(index >= studentList.size() ) {
			return "범위를 넘어선 값을 입력할수 없습니다";
			
		}else {
			//수정 코드 작성
			// 1. index번째에 저장된 학생정보 출력
			System.out.println(index + "번째에 저장된 학생 정보");
			System.out.println(studentList.get(index));
			
			System.out.println("=====학생 정보 수정=====");
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			System.out.print("사는곳  : ");
			String region = sc.nextLine();
			System.out.print("성별(M/F):"  );
			char gender = sc.next().charAt(0);
			System.out.print("점수:"  );
			int score = sc.nextInt();
			
			//index번째에 있던 기존 학생정보 반환, 객체를 temp에 저장
			Student temp = studentList.set(index, new Student(name, age, region, gender, score));
			
			return temp.getName() + "의 정보가 변경되었습니다";
		}
		
		
	}
	/**
	 * 4. 학생 정보 제거 메서드
	 * 
	 * 수정과 같은 검사 후
	 * 삭제 시
	 * "정말 삭제하시겟습니까(Y/N) : "
	 * Y -> 해당 인덱스에 있는 개체 삭제 후
	 * "000님의 정보가 제거되엇습니다" 리턴
	 * N을 입력햇다면 "취소"리턴
	 * 
	 * 
	 * */
	public String removeStudent() {
		//Student List.remove(int index);
		// 리스트에서 index번째 요소를 제거
		// 이때 제거된 요소 반환
		// 중간에 비어있는 요소 제거를 위해 삭제 시 뒤쪽 요소를 한칸씩 자동으로 당겨온다.
		int index = 0;
		for(Student std : studentList) {
			System.out.print( (index++) + "번 : ");
			System.out.println(std);
			
		}
		System.out.print("삭제할 index 입력 : ");
		int indexInput = sc.nextInt();
		
		if(studentList.isEmpty()) {
			return "";
		} else if(indexInput < 0) {
			return "음수는 입력할 수 없습니다";
		} else if(indexInput >= studentList.size() ) {
			return "범위를 넘어선 값을 입력할수 없습니다";
			
		}else {
			System.out.println("정말 삭제하시겟습니까? Y/N");
			char check = sc.nextLine().charAt(0);
			if( check == 'y' || check == 'y') { 
				Student temp =studentList.remove(indexInput);
				return temp.getName(); 
				}else {
					System.out.println("삭제 취소");
					return "";
				}
			
		}
		
	}
	
	/***
	 * 이름이 일치하는 학생을 찾아서 조회하는 메서드(완전일치)
	 * 
	 * -검색할 이름을 입력받아 studentList에서 꺼내온
	 * Student 객체의 name값이 같은지 비료
	 * 
	 * -일치하는 경우 Student 객체 출력
	 * -일치하는 게 없다면 "검색 결과가 없습니다" 출력
	 * 
	 */
	public void searchName1() {
		System.out.println("====학생 검색 (이름 완전일치)====");
		System.out.println("검색할 이름 입력 : ");
		String input = sc.next();
		
		boolean flag = true;
		//향상된 for문
		for(Student std : studentList) {
			
			if(input.equals(std.getName())) { // 이름이 일치하는 경우
				System.out.println(std); //std.toString();
				flag = false;
				
			}
			
			if(flag) {
				System.out.println("검색 결과 없음");
			}
		}
			
	}
	/**
	 * 6. 이름에 특정 문자열이 포함되는 학생을 찾아 조회하는 메서드
	 * 문자열 입력받아 studentList에서 꺼내온 Student객체의 name값에 포함되는 문자열인지 검사
	 * 
	 * -포함되는 학생 객체를 찾은경우 student객체 출력
	 * -없다면 "검색 결과 없음"출력
	 * 
	 * String.equals()대신  String.contains()사용
	 * String에 매개변수 문자열이 포함되어 있으며 true
	 * ***/
	public void searchName2() {
		System.out.println("===학생 검색(이름 부분 포함)====");
		String input = sc.next();
		
		boolean flag = true;
		for(Student std : studentList) {
			if(std.getName().contains(input) ){ //std.getName()에 input이 포함되어 있느냐?
				System.out.println(std);
				
				flag = false;
				
				
			}
			
		}
		if(flag) {System.out.println("검색 결과 없음."); }
		
		
		
	}
	//정렬을 위해 Students implements Comparable을 해야한다.
	/**
	 * List를 정렬하는 방법
	 * 
	 * 방법 1 : Comparable 인터페이스 상속받아 compareTo() 메서드 재정의
	 * Student에 Comparable 인터페이스 상속받아 오버라이딩한 compareTo에
	 * 정의한 대로 정렬됨(나이 오름차순, 내림차순..)
	 * 
	 * 방법 2: Comparator 클래스에 의한 정렬 compare()사용 (익명 내부 클래스)
	 * 익명 내부 클래스 : 이름이 없는 클래스를 즉석에서 선언하여 한번만 사용할 목적으로 작성하는것
	 * 객체를 생성하면서 바로 구현 내옹을 정의 가능
	 * 익명 내부클래스 장점
	 * 
	 *  코드 간결화, (별도로 클래스를 만들지 않아도 될떄 사용)
	 *  즉시 사용 가능(한번만 사용할 comparator등을 정의할때 유용함)
	 *  지역화 : 특정 메서드 안에서만 필요할 때
	 *  
	 *  
	 * **/
	/*
	 * 7. 나이에 따라 오름차순 정렬
	 * 
	 * 
	 * ****/
	
	public void sortByAge() {
		
		
		Collections.sort(studentList);
		
		for(Student std : studentList) {
			System.out.println(std);
		}
		
	}
	/*이름에 따라 정렬(가나다순)**/
	public void sortByName() {
		Collections.sort(studentList, new Comparator<Student>() {// 익명 내부 클래스 
			//여기 부분의 중괄호는 Comparator 인터페이스를 상속받아 구현한 익명 클래스!
			//new 연산자를 이용해서 익명 내부클래스를 선언하여 바로 활용하는 코드이다.
			//익명 내부클래스는 student객체가 만들어질때 같이 만들어진다.
			@Override
			public int compare(Student o1, Student o2) {
				// 이름비교
				return o1.getName().compareTo(o2.getName());
			
				//String.compareTo
				//name은 String형이라 compareTo()로 비교
				//String.compareTo() : 원래는 자바에서 객체를 비교하는 메서드
				//compareTo() 를 String 클래스 내부에서 재정의를 해둠.
				
				//compareTo() : 두 객체를 비교하고 순서를 결정함
				//반환값 : 0(같음), 양수(왼쪽객체가 더 큼), 음수(왼쪽객체가 더 작음)
				
			} 
			
			
		});
		for(Student std : studentList) {
			System.out.println(std);
		}
		
	}
}
	

