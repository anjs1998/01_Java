package edu.kh.array.ex;

import java.util.Arrays;

public class ArrayExample2 {
	public void shallowCopy() {
		//얕은 복사 -> 주소를 복사하여 서로 다른 두 참조변수가 
		//하나의 배열(또는 객체)를 참조하는 상태를 만드는 복사 방법
		int[] arr = {1, 2, 3, 4, 5};
		
		int[] copyArr = arr; // 주소만 복사
		
		System.out.println("변경 전");
		System.out.println("arr 주소 : " + arr);
		System.out.println("copyArr 주소 : " + copyArr);
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copyArr : " + Arrays.toString(copyArr));
		
		//얕은 복사한 배열의 값을 변경
		copyArr[2] = 999;
		
		System.out.println("변경 후");
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copyArr : " + Arrays.toString(copyArr));
	}
	
	public void deepCopy() {
		//깊은 복사 -> 같은 자료형의 새로운 배열을 만들어서
		//기존 배열의 data를 모두 복사
		int[] arr = {1,2,3,4,5};
		
		//1. for문을 이용한 깊은 복사
		int[] copyArr1 = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			copyArr1[i] = arr[i];
			
		}
		
		System.out.println("arr 주소 : " + arr);
		System.out.println("copyArr1 주소 : " + copyArr1);
		
		System.out.println("arr : Arrays.toString(arr)");
		System.out.println("copyArr1 : " + Arrays.toString(copyArr1));
		
		System.arraycopy(arr, 0, copyArr1, 0, arr.length);
		
		int[] copyArr3 = Arrays.copyOf(arr, arr.length);
		                                              
		
		copyArr1[4] = 0;
		//copyArr2[4] = 999;
		copyArr3[3] = 5000;
		
		
	}
	/*public void createLotttoNumber(){}
	
	//1. 정수 6개를 저장할 배열 선언 및 할당
	for(int i = 0; i <lotto.length i++) {}
	int random = (int)(Math.random() *45 + ))

	for(int x = 0; x < i; x++){
		if(random == lotto[x]) {i--;}
	}*/

}

