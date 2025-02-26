package edu.kh.poly.ex1.model.service;

import edu.kh.poly.ex1.model.dto.Car;
import edu.kh.poly.ex1.model.dto.Spark;
import edu.kh.poly.ex1.model.dto.Tesla;

public class PolyService {
	
	//다형성 확인예제
	public void ex1() {
		//Car 객체 생성
		Car car = new Car();
		//부모타입 참조변수 = 부모객체주소
		
		//tesla 객체생성
		Tesla tesla = new Tesla();
		/***************** 다형성 *****************/
		//업캐스팅 : 부모타입 참조변수 = 자식객체
		
		Car car2 = new Tesla();
		//Tesla객체를 참조하는 변수의 타입이 Car(부모)이기 때문에 
		//Tesla객체가 Car(부모)객체로 변화함
		// -> 업 캐스팅
		
		Car car3 = new Spark();
		// Spark 객체를 참조하는 변수의 타입이 Car
		// Spark객체가 Car객체로 변화함
		// -> 업 캐스팅
		
		// 1) 자식 객체가 부모 객체로 변하였기 때문에
		// 자식만의 고유한 필드, 메서드를 사용할수 없다.
		// 1-1) Car
		
		car.setEngine("v6 6기통 엔진");
		car.setFuel("휘발유");
		car.setWheel(4);
		//Car 본인의 메서드 모두 사용가능
		
		//1-2) tesla( 자식 = 자식)
		tesla.setEngine("전기모터");
		tesla.setFuel("전기");
		
		tesla.setWheel(4);
		tesla.setBatteryCapacity(100000);
		
		//1-3) car2, car3(부모 = 자식(tesla))
		car2.setEngine("전기모터");
		car2.setFuel("전기");
		car2.setWheel(4);
		//car2.setBatteryCapacity();
		//car2.setEngine();
		
		car3.setEngine("경차인젠");
		car3.setFuel("휘발유");
		car3.setWheel(4);
		
		//-> car, car3는 부모타입 참조변수(Car이기 떄문에 Tesla,Spark와 같은 자식객체의 고유필드, 메서드 사용불가)
		// 2) 다형성을 이용한 객체배열 만들기
		
		//객체 배열 : 같은 객체 참조 자료형의 변수를 하나의 묶음으로 다루는것ㄷ
		//다형성을 이용한 객체배열:
		//부모 타입 참조 자료형의 벼수를 하나의 묶음응로 다루는것
		
		
		Car[] arr =new Car[3];
		arr[0 ] = car;
		arr[1] = car2;
		arr[2] = car3;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + "번째 인덱스의 엔진");
			
			//상속 + 다형성
			//상속 특징 : car 상속 클래스는 모두 getEngine()을 가지고 있다.
			//다형성(업캐스팅) : 부모타입 참조변수 arr[i]로 자식객체 참조가능
			
			
			
		}
		//전달받은 Car 또는 자식객체(Tesla, Spark)의 엔젠, 연료, 바퀴갯수를 출력하는 메서드
		
		}
		public void printCar(Car temp) {
			//Car temp = c(Car)
			//Car temp = t(Tesla)
			//Car temp = s(Spark)
			System.out.println("엔진 : " + temp.getEngine());
			System.out.println("연료 : " + temp.getFuel());
			System.out.println("바퀴 갯수 : " + temp.getWheel() + "개");
			System.out.println();
		}
		//다형성(업캐스팅)을 이용한 매개변수 사용법
		
		
		public Car createCar(int num) {
			
			Car result = null;
			switch(num) {
				case 1: result = new Car(); break;
				case 2: result = new Tesla(); break;
				case 3: result = new Spark(); break;
				
			
			}
			return result;
			
		}
		
		public void ex2() {
			Tesla t = new Tesla("전기모터", "전기", 4, 1000000);
			Spark s= new Spark("경차엔진", "휘발유",4,0.5);
			
			Car c = new Car("경유엔진", "경유", 12);
			
			Car[] arr = {createCar(1), createCar(2), createCar(3)};
			
			//instanceof 연산자 : 객체가 어떤 타입(자료형)인지 검사
			//-> 참조하는 객체가 특정 자료형이가 상속관계인지를 확인
			System.out.println(arr[1] instanceof Tesla);//true
			System.out.println(arr[1] instanceof Spark);//false
			System.out.println(arr[1] instanceof Car);//true
			
		}	
		
		//다형성 중 다운캐스팅 예제
		public void ex3() {
			//다운캐스팅
			//부모타입 참조변수가 자식객체를 참조하는 기술(업캐스팅)
			//적용된 상태에서만 진행할 수 있다.
			//부모타입을 자식타입으로 "강제 형변환"해서
			//자식객체의 본래 필드, 메서드를 사용가능케 한다.
			
			Car c1 = new Tesla("전기모터", "전기", 4, 50000);
			//upcasted
			
			System.out.println(((Tesla)c1).getBatteryCapacity());
			// 주의!
			// () 표기에 주목
			
			Tesla t1 = (Tesla)c1;
			
			System.out.println(t1.getBatteryCapacity()) ;
			
			
		}
		public void ex4() {
			
			Car c1 = new Tesla();
			
			//Spark s1 = (Spark)c1;
			//주의: 다운캐스팅 잘못해도 컴파일떈 에러발생안함. 단, 실행시 런타임 에러.
			//해결방법 : instanceof와 같이 사용할것
			if(c1 instanceof Spark) { // c1이 Spark이거나 상속관계인가?
				//맞다면
				Spark s1 = (Spark)c1;
				System.out.println("다운캐스팅 성공");
			}else {
				System.out.println("실패. Spark 타입/상속관계 아님");
			}
		}
		
		public void ex5() {
			//바인딩(Binding)
			//실제 실행할 메소드 코드와 호출하는 코드를 연결시키는 것.
			
			Car c1 = new Car("경유엔진", "경유", 8);
			
			
			System.out.println( c1.toString());
			// Car 객체에 잇는 toString() 메서드를 호출
			// 프로그램 "실행 전"
			// 컴파일러는 toString()메서드가 Car에 있는걸로 인식해서
			// c1.toString() 호출코드와
			// edu.kh.poly.ex1.model.dto.Car.toString()
			// -> 정적 바인딩
			
			
			// *** 다형성 적용 시 바인딩 ***
			Car c2 = new Spark("경차엔진", "휘발유", 4, 0.5);
			// 업캐스팅 적용 -> 부모 부분만 참조 가능 상태
			System.out.println( c2.toString() ); //Car.toString() 
			//toString() 호출코드와 Car의 toString() 메소드 코드를 연결
			// -> 정적 바인딩
			
			//실행해보면 자식(Spark)의 toString()이 호출되는것을 확인
			//경차엔진 / 휘발유 / 4 /0.5
			// -> 컴파일 시에는 부모객체(Car)와 바인딩 == 정적바인딩
			// -> 실행 시에는 정적바인딩보다 자식(Spark) 에서 오버라이딩된
			//toString() 메서드가 우선시되어 Spark의 메서드와 바인딩
			
			
			
			
		}
}
