package O0_클래스_테스트;

import java.util.Arrays;

class Sample2{
	int arr[] = {10,20,30,40,50};
}

public class O0_11_테스트_클래스2 {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		
		Sample2 s2 = new Sample2();
		s2.arr = arr;
			
		
		//문제1) 답을 예상후 주석 풀고 실행
		System.out.println(Arrays.toString(s2.arr));
		
		s2.arr = null;	
		//문제2) 답을 예상후 주석 풀고 실행
		System.out.println(Arrays.toString(arr));
		
	}
}