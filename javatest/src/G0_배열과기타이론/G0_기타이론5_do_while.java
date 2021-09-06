package G0_배열과기타이론;

public class G0_기타이론5_do_while {
	public static void main(String[] args) {
		// do while 
		
		// while 의 변형된형태이다.
		// while 과 별차이없다. 
		
		
		// 1)  do         ==> 일단 실행부터 한다. 
		// 2) {싱행영역 }   ==> 실행이 끝난후 조건을 검사한다.
		// 3) while(조건); ==> 조건이 사실이면  다시 do 로 이동 한다. 
		
		
		int i = 0;
		do {
			System.out.println(i);
			i += 1;
		}while(i < 6);
		
		//----------------------------------
		
		while(i < 6) {
			i += 1;
		}
	}
}