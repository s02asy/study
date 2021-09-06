package O0_클래스_테스트;

import java.util.Arrays;

class Sample5{
	int arr[] = {1,2,3,4,5};
}
class Sample6{
	int arr[] = {5,4,3,2,1};
}

public class O0_11_테스트_클래스5 {
	public static void main(String[] args) {
		
		Sample5 s5 = new Sample5();
		Sample6 s6 =new Sample6();
		s5.arr = s6.arr;
		s6.arr = s5.arr;
			
		//문제) 답을 예상후 주석 풀고 실행
		System.out.println(Arrays.toString(s5.arr));
		System.out.println(Arrays.toString(s6.arr));
	}
}