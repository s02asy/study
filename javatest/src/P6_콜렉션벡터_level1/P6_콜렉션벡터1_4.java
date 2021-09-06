package P6_콜렉션벡터_level1;

import java.util.Scanner;
import java.util.Vector;

public class P6_콜렉션벡터1_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		
		// [1] Thread.sleep(밀리세컨즈)
		// [2] () 안에 넣은 값만큼 일시정지된다. 
		// [3] 밀리세컨즈이기때문에 1000 이 1초이다. 
		// [4] 이걸활용해서 동적프로그램을 만들수있다. (콘솔은 불가)
		
		
		System.out.println("시작");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		System.out.println("종료");
	}
}