package com.toyFactory.model.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.toyFactory.model.dto.Toy;

import edu.kh.collection.pack1.model.dto.Student;

public class ToyFactory {

	private Scanner sc = new Scanner(System.in);
	private Set<Toy> toys = new HashSet<Toy>();
	private Map<Integer, String> ingredientMap = new HashMap<Integer, String>();
	

	
	
	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	public Set<Toy> getToys() {
		return toys;
	}

	public void setToys(Set<Toy> toys) {
		this.toys = toys;
	}

	public Map<Integer, String> getIngredientMap() {
		return ingredientMap;
	}

	public void setIngredientMap(Map<Integer, String> ingredientMap) {
		this.ingredientMap = ingredientMap;
	}

	public void addMaterials(Set<Toy> toys2Add ){
		
		toys.addAll(toys2Add);
		
	}
	
	public Set<Toy> init() {
		Set<Toy> result = new HashSet<Toy>();
		
		Set<String> ingTemp = new HashSet<>();
		ingTemp.add("면직물");
		ingTemp.add("고무");
		Toy t = new Toy("마미롱레그", 8, 36000, "분홍색", "19950805",
				ingTemp);
		result.add(t);
		
		Set<String> ingTemp2 = new HashSet<>();
		ingTemp2.add("면직물");
		ingTemp2.add("플라스틱");
		Toy t2 = new Toy("허기워기", 5, 12000, "파란색", "19940312",
				ingTemp2);
		result.add(t2);
		
		Set<String> ingTemp3 = new HashSet<>();
		ingTemp3.add("면직물");
		ingTemp3.add("플라스틱");
		Toy t3 = new Toy("키시미시", 5, 15000, "분홍색", "19940505",
				ingTemp3);
		result.add(t3);
		
		Set<String> ingTemp4 = new HashSet<>();
		ingTemp4.add("면직물");
		ingTemp4.add("플라스틱");
		Toy t4 = new Toy("캣냅", 8, 27000, "보라색", "19960128",
				ingTemp4);
		result.add(t4);
		
		Set<String> ingTemp5 = new HashSet<>();
		ingTemp5.add("면직물");
		ingTemp5.add("플라스틱");
		ingTemp5.add("고무");
		Toy t5 = new Toy("파피", 12, 57000, "빨간", "19931225",
				ingTemp5);
		result.add(t5);
		
		
		return result;
	}
	
	public void selectMenu() {
		
		System.out.println("<< 플레이타임 공장 >>");
		System.out.println("1. 전체 장난감 조회하기");
		System.out.println("2. 새로운 장난감 만들기");
		System.out.println("3. 장난감 삭제하기");
		System.out.println("4. 장난감 제조일 순으로 조회하기");
		System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
		System.out.println("6. 재료 추가");
		System.out.println("7. 재료 제거");
		
		System.out.println("선택 :");
		int menu = sc.nextInt();
		sc.nextLine();
		switch(menu) {
		
			case 1: selectAll(); break;
			case 2: System.out.println(setNewToy()); break;
			case 3: System.out.println(removeToy()); break;
			case 4: selectAllByDateManufactured(); break;
			case 5: selectAllByAgeLimit(); break;
			case 6: addNewIngredient() ;break;
			case 7: removeIngredient(); break;
		}
		
	}
	public void selectAll() {
		System.out.println("<전체 장난감 목록>");
		int count = 0;
		for(Toy toy : toys) {
			
			System.out.print((count + 1) + ". ");
			System.out.println(toy);
			count++;
		}
	}
	
	public String setNewToy() {
		System.out.println("<새로운 장난감 추가>");
		System.out.println("장난감 이름 : ");
		String nameInput = sc.nextLine();
		System.out.println("사용 가능 연령 :");
		int ageInput = sc.nextInt();
		sc.nextLine();
		System.out.println("가격 : ");
		int priceInput = sc.nextInt();
		sc.nextLine();
		System.out.println("색상 : ");
		String colorInput = sc.nextLine();
		
		System.out.println("제조일(YYYYMMDD 형식으로 입력) : ");
		String dateInput = sc.nextLine();
		
		Set<String> ingInputSet = new HashSet<>();
		char flag = 'a';
		while(flag != 'q') {
			System.out.println("재료를 입력하세요 (종료하려면 'q'를 입력하세요) :  ");
			String ingInput = sc.nextLine();
			if (ingInput.equals("q")) break;
			else ingInputSet.add(ingInput);
		}
		Toy toPush = new Toy(nameInput, ageInput, priceInput, colorInput, dateInput, ingInputSet);
		toys.add(toPush);
		selectAll();
		return "새로운 장난감이 추가되었습니다.";
	}
	
	public String removeToy() {
		System.out.println("삭제할 장난감의 이름을 입력하세요 : ");
		String nameInput = sc.nextLine();
		
		
		Iterator<Toy> toysIterator = toys.iterator();
		while(toysIterator.hasNext()) {
			Toy next = toysIterator.next();
			if (next.getName().equals(nameInput)) {toys.remove(next); return "장난감이 삭제되엇습니다.";}
		}
		return "삭제 실패. 장난감이 있는지 확인하십시요."; 
		
		
	}
	
	public void selectAllByDateManufactured() {
		System.out.println("<제조일 순으로 장난감 정렬>");
		List<Toy> tempToys = new ArrayList<>(toys);
		Collections.sort(tempToys);
		
		for(Toy t : tempToys) {
			System.out.println(t);
		}
		
		
	}
	public void selectAllByAgeLimit() {
		Set<Integer> ageSet = new HashSet<>();
		
		Iterator<Toy> toysIterator = toys.iterator();
		
		while(toysIterator.hasNext()) { // ageSet 수집
			
			Toy temp = toysIterator.next();
			ageSet.add( (Integer)(temp.getAgeLimit()) );
			
		}
		
		 //toysIterator 리셋
		System.out.println(ageSet);
		//toysIterator = toys.iterator();
		
		for(Integer i : ageSet) {
			Iterator<Toy> toysIterator2 = toys.iterator();
			System.out.println("[연령 : "  + i + "세]");
			//System.out.println(toys);
			while(toysIterator2.hasNext()) {
				
				Toy temp = toysIterator2.next();
				//System.out.println(temp);
				//System.out.println(temp.getAgeLimit());
				if( (int)i == temp.getAgeLimit() ) System.out.println(temp.toString() );
			}
		}
		
	
	}
	
	public void addNewIngredient() {	// 1. exception 해결할것 2. 재료 추가시 모든 장난감에 전부 적용되어야 함
		
		System.out.println("<재료 추가>");
		System.out.println("---현재 등록된 재료---");
		for (Map.Entry<Integer, String> entry : ingredientMap.entrySet()) {
			System.out.println( entry.getKey() + ": " + entry.getValue() );
		}
		System.out.println("재료 고유번호(key) 입력 :");
		int keyInput = sc.nextInt();
		sc.nextLine();
		System.out.println("재료명 입력 :");
		String stringInput = sc.nextLine();
		if(ingredientMap.containsKey(keyInput)) {
			System.out.println("이미 해당 키에 재료가 등록되어 있습니다.");
			System.out.println("덮어쓰시겟습니까?(Y, N)");
			char choice = sc.nextLine().charAt(0);
			if(choice == 'Y' || choice == 'y') {  ingredientMap.put(keyInput, stringInput);
				Iterator<Toy> toysSetIterator = toys.iterator();
				while(toysSetIterator.hasNext()) {
					toys.add(
							addIngredientsInToy(toysSetIterator.next(), stringInput)
							);
				
				}
				System.out.println("새로운 재료가 성공적으로 등록되엇습니다."); return;
				
				
				
			}
			else{selectAllIngredientMap();return ;}
			
		}
		
		ingredientMap.put(keyInput, stringInput);/*
		Iterator<Toy> toysSetIterator = toys.iterator();
		while(toysSetIterator.hasNext()) {
			toys.add(
					addIngredientsInToy(toysSetIterator.next(), stringInput)
					);
		
		}*/ // ConcurrentModificationException
		
		//selectAllIngredientMap();
		System.out.println(toys);
		/*System.out.println(value);
		if(value.equals( stringInput ))*/ System.out.println("새로운 재료가 성공적으로 등록되엇습니다.");
		                                                          
		
	}

	
	public void removeIngredient() {
		System.out.println("<재료 삭제>");
		System.out.println("---현재 등록된 재료---");
		selectAllIngredientMap();
		
	
		System.out.println("재료명 입력 :");
		String valueInput = sc.nextLine();
		
		for (Map.Entry<Integer, String> entry : ingredientMap.entrySet()) {
			if(entry.getValue().equals(valueInput)) { 
				
				System.out.println("재료 "+ ingredientMap.remove(entry.getKey())+"이/가 성공적으로 제거되었습니다."); 
				/*selectAllIngredientMap();*/     //debug
				return;
			}
		}
		System.out.println("해당 이름의 재료가 존재하지 않습니다.");

	}
	public void selectAllIngredientMap() {
		for (Map.Entry<Integer, String> entry : ingredientMap.entrySet()) {
		System.out.println( entry.getKey() + ": " + entry.getValue() );
		}
	}
	
	public Toy addIngredientsInToy(Toy t, String value) {
		Set<String> ingredientsResult = t.getIngredients();
		ingredientsResult.add(value);
		Toy result = new Toy(t.getName(), t.getAgeLimit(), t.getPrice(), t.getColor(), t.getDateManufactured(),
				ingredientsResult);
		
		return result;
		
	}
}
