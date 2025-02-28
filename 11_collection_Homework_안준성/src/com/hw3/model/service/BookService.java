package com.hw3.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.hw3.model.dto.Book;



public class BookService {
	List<Book> bookList = new ArrayList<Book>();
	List<Book> favoriteList = new ArrayList<Book>();
	Scanner sc = new Scanner(System.in);
	
public void displayMenu() {
		
		int menuNum = 0; // 메뉴 선택용 변수
		
		do {
			System.out.println("\n=====학생 관리 프로그램=====");
			System.out.println("1. 도서 등록");
			System.out.println("2. 도서 조회");
			System.out.println("3. 도서 수정");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 즐겨찾기 추가");
			System.out.println("6. 즐겨찾기 삭제");
			System.out.println("7. 즐겨찾기 조회");	//Comparable 사용
			System.out.println("8. 추천순으로 뽑기");	//Comparator 사용
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 번호 선택 : ");
			
			
			try {
				menuNum = sc.nextInt();
				sc.nextLine(); //입력버퍼 개행문자 제거용
				switch(menuNum) {
				case 1: System.out.println(addBook()); break;
				case 2: selectAll();  break;
				case 3: updateStudent(); break;
				case 4: /*removeStudent();*/ break;
				case 5: /*searchName1();*/ break;
				case 6: /*searchName2();*/ break;
				case 7: /*sortByAge();*/ break;
				case 8: /*sortByName();*/ break;
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
public String addBook()  {
	//CheckedException : 반드시 throws 구문이나 try - catch 처리 강제
	//IOException, SQLException
	//UncheckedException : 강제 처리 X, 예외 발생시 자동으로 상위 호출 메서드로 예외전파
	//상위호출메서드로 예외가 전파됨
	//inputMismatchException, NullPointerException
	
	//삽입 성공시 "성공", 실패시 "실패" 문자열 반환
	System.out.println("=====도서 등록=====");
	System.out.print("도서 번호 : ");
	int num = sc.nextInt();
	System.out.print("도서 제목 : ");
	String name = sc.nextLine();
	System.out.print("도서 저자 : ");
	int price = sc.nextInt();
	System.out.print("도서 가격  : ");
	String author = sc.nextLine();
	System.out.print("도서 출판사:"  );
	String publisher = sc.nextLine();
	
	
	//Student 새 객체 생성 후 studentList에 추가
		if ( bookList.add( new Book(num, name, author, price, publisher) ) ){
			return "성공";
		}else {
			return "실패";
		}
	
	
	
	}

	public void selectAll() {
		System.out.println("=======학생 전체 조회=======");
	
	//studentList가 비어잇는 지 확인
	//List에 저장된 데이터의 개수를 얻어오는 방법 : int List.size();
	
	//if(studentList.size() == 0) {
	//List.isEmpty() --> 컬렉션이 비어있다면 true반환
		if(bookList.isEmpty()) {
			System.err.println("도서 정보가 없습니다");
			return; // 현재 메서드를 종료하고 호출한곳으로 돌아감
		}
	
	/*for(int i = 0; i < studentList.size(); i++) {
		// -> length(X)
		
		
	} 향상된 for each 문 사용-*/
		int index = 0;
		for(Book std : bookList) {
			System.out.print( (index++) + "번 : ");
			System.out.println(std);
		
		}
	
		
	}
	public String updateStudent() {
		System.out.println("=======도서 수정=======");
		System.out.println("수정할 도서 번호를 입력하세요:");
		int num_input = sc.nextInt();
		if(num_input < 0) return "음수는 입력할수 없습니다";
		else {
			for(Book b:bookList) {
				int index = 0;
				if (b.getNum() == num_input) {
					int num2_input = 0;
					System.out.println("1. 도서명  ");
					//int num = sc.nextInt();
					System.out.println("2. 도서 저자 ");
					//String title = sc.nextLine();
					System.out.println("3. 도서 가격");
					//int price = sc.nextInt();
					System.out.println("4. 도서 출판사 ");
					//String author = sc.nextLine();
					System.out.println("0. 수정 종료"  );
					System.out.println("어떤 걸 수정하시겟습니까? : "  );
					//index번째에 있던 기존 학생정보 반환, 객체를 temp에 저장
					switch(num2_input) {
					case 1:
						int num = sc.nextInt();
						Book temp = bookList.set(
								index, new Book(num, b.getTitle(),  b.getAuthor(), b.getPrice(), b.getPublisher())
								);
						return temp.getTitle() + "의 정보가 변경되었습니다";
					
					case 2:
						String title = sc.nextLine();
						Book temp2 = bookList.set(
							index, new Book(b.getNum(), title,  b.getAuthor(), b.getPrice(), b.getPublisher())
							);
						return temp2.getTitle() + "의 정보가 변경되었습니다";
					case 3:
						String author = sc.nextLine();
						Book temp3 = bookList.set(
								index, new Book(b.getNum(), b.getTitle(), author, b.getPrice(), b.getPublisher())
								);
						return temp3.getTitle() + "의 정보가 변경되었습니다";
					case 4:
						int price = sc.nextInt();
						Book temp4 = bookList.set(
								index, new Book(b.getNum(), b.getTitle(),  b.getAuthor(), price, b.getPublisher())
								);
						return temp4.getTitle() + "의 정보가 변경되었습니다";	
					
					case 0:
						return "도서 정보수정 취소";
					
				}
				}
				
				index++;
			}
				
				
			}
		return "도서 번호가 없습니다.";
}
		

		
	}/*
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
		
	}*/

