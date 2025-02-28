package edu.kh.collection.pack1.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.kh.collection.pack1.model.service.StudentService;

public class StudentRun {
	public static void main(String[] args) {
		StudentService service = new StudentService();
		service.displayMenu();
		
		/*
		List<Integer> numberList = new ArrayList<Integer>();
		numberList.add(5);//0
		numberList.add(3);//1
		numberList.add(4);//2
		numberList.add(1);//3
		numberList.add(2);//4
		
		//숫자 리스트를 정렬 오름차순
		
		//Integer는 이미 Comparable을 상속받아 CompareTo()정의함
		
		Collections.sort(numberList);
		System.out.println(numberList);*/
		
	}
}
