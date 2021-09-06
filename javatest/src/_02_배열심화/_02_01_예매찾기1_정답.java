package _02_배열심화;

public class _02_01_예매찾기1_정답 {
	public static void main(String[] args) {
		
	
		int seatList[] = {1003,1003,0,0,1002,0,1001};
		
		int find = 1003;
		
		/*
		 * 1) seatList 는 영화관 7자리를 나타낸다. 
		 * 2) seatList 의 값들은 영화관 예매한 회원번호를 나타낸다. 
		 * 3) find 는 검색하고자하는 회원번호이다.
		 * 4) find 의 값을 영화관에서 찾아 자리를 출력해주자
		 * 	- 예) 1003 이므로 영화관 0, 1 번이다.
		 */
		
		for(int i = 0; i < seatList.length; i++) {
			if(find == seatList[i]) {
				System.out.println(i);
			}
		}			
	}
}