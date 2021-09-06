package H9_배열레벨1테스트;

import java.util.Random;

public class H9_Test4 {
	public static void main(String[] args) {
		Random ran = new Random();
		int arr[] = {10, 43, 25, 76, 3 , 100, 56};	
		int r1;
		int r2;	
		//문제) 배열크기는 7 이고 각각 숫자가 저장되어있다. 
		//[조건]
		// 1) r1 r2 에 각각 배열의 인덱스를 랜덤으로 입력받는다.(0~6)
		// 2) r1 r2 가 같으면 "같다 출력" 후 종료.
		// 3) r1 이 r2 보다 크면 인덱스값을 서로바꾼다. 
		// 4) r1의 인덱스의 값을 r2의 인덱스 의 값까지 순차적으로 검사한다.
		// 5) r1의 값이 r2의 값보다 크면 count 를 세고  개수 출력. 
		
		
		//예) r1 = 1; r2 = 1; ==> "같다"
		
		//예) r1 = 1; r2 = 6;  
		//		1) arr[r1]의 값은 43이고,  arr[r2] 값은 100 이다. 
		//      2) r1부터 r2 까지의 값들중 42 보다큰값들은 76, 100 두개이다. 
		//예) r1 = 4 , r2 = 1; 
		//      1) r1이 r2보다값이 크므로 서로 값을 바꾼다 . 
		//		2) r1 = 1, r2 = 4;
		int temp;
		int count = 0;
		r1 = ran.nextInt(7);
		r2 = ran.nextInt(7);
		System.out.println("============배열============");
		System.out.println("{10, 43, 25, 76, 3, 100, 56}");
		System.out.println("r1 : " + r1 + " , " + "r2 : " + r2);
		if(r1 == r2) {
			System.out.println("같다");
		}
		if(r1 > r2) {
			temp = r1;
			r1 = r2;
			r2 = temp;
			System.out.println("r1이 r2보다 크므로 바꿔준다.");
			System.out.println("r1 : " + r1 + " , " + "r2 : " + r2);
		}
		for(int i = r1; i <= r2; i++) {
			if(arr[r1] < arr[i]) {
				count += 1;
			}
		}
		if(count > 0) {
			System.out.println("r1과 r2의 범위 중 r1보다 큰수 는 ? " + count + "개");
		}
	}
}