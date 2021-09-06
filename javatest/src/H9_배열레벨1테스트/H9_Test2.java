package H9_배열레벨1테스트;

import java.util.Random;

public class H9_Test2 {
	public static void main(String[] args) {
		Random ran = new Random();
		int page = 20;
		int arr[] = {3,2,5,3,1};
		
		// 페이퍼를 맨앞에서부터 뒤로 순차적으로 나눠줄려고 한다. 
		
		// 배열의 각각의 값은 페이지가 필요한 개수이다.
		
		// 랜덤으로 인덱스값을 입력받고 남은 page수 출력 
		
		// 예) 4 ==> 끝까지 다돌았으므로 ==> 20 - (3+2+5+3+1)
		
		// 예) 0 ==> 20 - 3 
		
		// 예) 1 ==> 20 - (3+2)
		int r_index = ran.nextInt(5);
		System.out.println(r_index);
		for(int i = 0; i <= r_index; i++) {
			page -= arr[i];
		}
		System.out.println("남은 페이지 수 : " + page);
	}
}