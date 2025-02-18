package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {
	Scanner sc = new Scanner(System.in);
	 public void practice1(){
		int[] arr = new int[9];
		for(int i = 0; i < 9; i++) {
			arr[i] = i+1;
			
		}
		int sum = 0;
		for(int i = 0; i < 9; i++) {
			sum += i % 2 == 0 ? i : 0;
			
		}
		System.out.println("짝수 번째 index의 합:"+sum);
	}
	 
	 
	 public void practice2(){
			int[] arr = new int[9];
			for(int i = 0; i < 9; i++) {
				arr[i] = 9 - i;
				
			}
			int sum = 0;
			for(int i = 0; i < 9; i++) {
				sum += i % 2 == 1 ? i : 0;
				
			}
			System.out.println("홀수 번째 index의 합:"+sum);
		}
	 
	 public void practice3(){
		 System.out.println("양의 정수 : ");
		 int length_arr = sc.nextInt();
		 int[] arr = new int[length_arr];
		 for (int i = 0; i < length_arr; i++) {
			 arr[i] = i+1;
		 }
		 System.out.println(Arrays.toString(arr));
		 
	 }
	 
	 public void practice4(){
		 int[] arr = new int[5];
		 for(int i = 0; i < 5; i++) {
			 System.out.println("입력 " + i + " : ");
			 arr[i] = sc.nextInt();
		 }
		 System.out.println("검색할 값 : ");
		 int search = sc.nextInt();
		 boolean flag = false;
		 for(int i = 0; i < 5; i++) {
			 if( arr[i] == search) System.out.println("인덱스 : " + i);
			 flag = true;
		 }
		 
		 
		 if(flag == false) System.out.println("일치하는 값이 존재하지 않습니다.");
		 
	 }
	 public void practice5(){
		 System.out.println("문자열 : ");
		 String input = sc.nextLine();
		 char[] input_char = new char[input.length()];
		 for(int i = 0; i < input.length(); i++) {
			 input_char[i] = input.charAt(i);
			 
		 }
		 System.out.println("문자 : ");
		 String search_string = sc.nextLine();
		 char search = search_string.charAt(0);
		 System.out.println("application에 i가 존재하는 위치(인덱스) : ");
		 int count_search = 0;
		 for(int i = 0; i < input.length(); i++) {
			 if(input_char[i] == search) {System.out.print(i + " "); count_search++;}
			 
		 }
		 System.out.println("\ni 개수 : " + count_search);
		 
	 }
	 public void practice6(){
		 System.out.println("정수 : ");
		 int input = sc.nextInt();
		 int[] arr = new int[input];
		 for(int i = 0; i < input; i++) {
			 System.out.println("배열" + i +"번째 인덱스에 넣을 값 :");
			 arr[i] = sc.nextInt();
		 }
		 System.out.println(Arrays.toString(arr));
		 int sum=0;
		 for(int i = 0; i < input; i++) {
			 sum = arr[i];
			 
		 }
		 System.out.println("총 합 : " + sum);
	 }
	 
	 public void practice7(){
		 System.out.println("주민등록번호(-포함) : ");
		 String id = sc.nextLine();
		 char[] id_char = new char[id.length()];
		 String id_concealed = new String();
		
		
		 for(int i = 0; i < id.length(); i++) {
			 if(i >= 8)id_concealed += "*";
			 
			 else id_char[i] = id.charAt(i); id_concealed += Character.toString(id_char[i]);
			 
		 }
		 System.out.println(id_char.toString());
		 
		 System.out.println(id_concealed);
	 }
	 
	 public void practice8(){
		 
		 int input = 0;
		 while(true) {
			 
			 System.out.println("정수 : ");
			 input = sc.nextInt();
			 if(input % 2 == 1 && input >= 3) break;
			 System.out.println("다시 입력하세요.");
		 }
		 
		 int[] arr = new int[input];
		 for(int i = 0, count = 0; i < input; i++) {
			 if (i <= ( input/ 2) ) {count++; arr[i] = count;}
			 else { count--; arr[i] = count;}
			 
		 }
		 System.out.println(Arrays.toString(arr));
		 
	 }
	 public void practice9(){
		 int[] arr = new int[10];
		 
		 for(int i = 0; i < 10; i++) {
			 arr[i] = (int)(Math.random() * 11);
			 
		 }
		 System.out.println(Arrays.toString(arr));
	 }
	 
	 public void practice10(){
		 int[] arr = new int[10];
		 
		 for(int i = 0; i < 10; i++) {
			 arr[i] = (int)(Math.random() * 11);
			 
		 }
		 int max=0, min = 10;
		 for(int i = 0; i < 10; i++) {
			if(max < arr[i]) max = arr[i]; 
			else if(min > arr[i]) min = arr[i];
		 }
		 System.out.println(Arrays.toString(arr));
		 System.out.println("최대값 : " + max);
		 System.out.println("최소값 : " + min);
	 }
	 public void practice11(){
		 int[] arr = {11, 11, 11, 11, 11, 11, 11, 11, 11, 11};
		 
		 for(int i = 0; i < 10; i++) {
			 boolean isExists = false;
			 int temp_gen = (int)(Math.random() * 10);
			 	
			 for(int j = 0; j < 10; j++) {
				 
			 	if(arr[j] == temp_gen) isExists=true;// break; 시 중복 발생...왜?
			 	
			 	
			 }
			 
			 
			 
			 arr[i] = isExists? arr[i]: temp_gen;
			 i = isExists? i-1 : i; // index out of bounds
		 }
		 
		 System.out.println(Arrays.toString(arr));
		
	 }
	 
	 public void practice12(){
		 int[] arr = {111, 111, 111, 111, 111, 111};
		 
		 for(int i = 0; i < 6; i++) {
			 boolean isExists = false;
			 int temp_gen = (int)(Math.random() * 100);
			 	
			 for(int j = 0; j < 6; j++) {
				 
			 	if(arr[j] == temp_gen) isExists=true;// break; 시 중복 발생...왜?
			 	
			 	
			 }
			 
			 
			 
			 arr[i] = isExists? arr[i]: temp_gen;
			 i = isExists? i-1 : i; // index out of bounds
		 }
		 for(int i = 0; i < 6; i++) {
			 for(int j = 0; j < 5; j++) {
				 if(arr[j] > arr[j+1]) {int temp = arr[j+1]; arr[j+1] = arr[j]; arr[j] = temp;}
				 
			 }
			 
		 }
		 
		 System.out.println(Arrays.toString(arr));
		
	 }
	 
	 public void practice13() {
		 System.out.println("문자열 : ");
		 String input = sc.nextLine();
		 char[] input_char = new char[input.length()];
		 
		 for(int i = 0; i < input.length(); i++) {
			 input_char[i] = input.charAt(i);
			 
		 }
		 
		 char[] searched = new char[0];
		 
		 for(int i = 0; i < input_char.length; i++) {
			 boolean isInSearched = false;
			 for(int j = 0; j < searched.length; j++) {
				 if(searched[j] == input_char[i]) isInSearched = true;
			 }
			 if(!isInSearched) {
				 searched = change_num_index(searched ,searched.length + 1);
				 //System.out.println(input_char[i]);
				 searched[searched.length - 1] = input_char[i];
				 //System.out.println( Arrays.toString(searched));
			 }
			 
		 }
		 //for(int i = 0; i < searched.length; i++) {System.out.println(searched[i]);}
		 
		 System.out.println("문자열에 있는 문자 : " + Arrays.toString(searched));
		 System.out.println("문자 개수 : " + searched.length);
		 
	 }
	 private char[] change_num_index(char[] ch,int index) {
		 
		 char[] ch2 = new char[index];
		 for( int i = 0; i < ch.length; i++) {
			 ch2[i] = ch[i];
			 
		 }
		 return ch2;
	 }
	 private String[] change_num_index(String[] ch,int index) {
		 
		 String[] ch2 = new String[index];
		 for( int i = 0; i < ch.length; i++) {
			 ch2[i] = ch[i];
			 
		 }
		 return ch2;
	 }
	 public void practice14(){
		 System.out.println("배열의 크기를 입력하세요 : ");
		 int arr_length = sc.nextInt();
		 sc.nextLine();
		 String[] arr = new String[arr_length];
		 for(int i = 0; i < arr.length; i++) {
			 System.out.println(i+"번째 문자열 : ");
			 arr[i] = sc.nextLine();
		 }
		 char reply = 'y';
		 while(reply == 'y') {
			 System.out.println("더 값을 입력하시겠습니까?(Y/N)");
			 String reply_s = sc.next();
			 reply = reply_s.charAt(0);
			 switch(reply) {
			 	case 'y':
			 		System.out.println("더 입력하고 싶은 개수 : ");
			 		int arr_length_more = sc.nextInt();
			 		arr = change_num_index(arr, arr.length + arr_length_more);
			 		
			 		for(int i = arr.length - arr_length_more - 1; i < arr.length; i++) {
						 System.out.println(i+"번째 문자열 : ");
						 arr[i] = sc.nextLine();
					}
			 	case 'n': break;
			 }
		 }
		 
		 System.out.println(Arrays.toString(arr));
	 }
	
}
