package H0_array_Level1;

public class H0_array1_정답 {
	public static void main(String[] args) {
		int a[] = { 10, 49, 51, 36, 17 };
		// 문제 1) 다음 리스트를 이용해서 a 의 값중 홀수만 b 에 저장(위치는 동일한위치에 저장)
		// 예) b = [0, 49, 51, 0, 17]
		// init(초기화) direct x 방식. 초기화, 계산 , 출력 따로따로
		int b[] = { 0,0,0,0,0 };
		
		// update(계산)
		for(int i = 0; i < 5; i++) {
			if(a[i] % 2 == 1) {  // 같다는 자리를 바꿔도 상관없다.
				b[i] = a[i];	 // 대입연산자의 뜻은 오른쪽에 있는값을 왼쪽에 넣어라.
			}
		}
		// render(출력)
		for(int i = 0; i < 5; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		System.out.println("------------------------");
		// 문제 2) 다음 리스트를 이용해서 a 의 값중 홀수만 c 에 저장
		// 조건 (위치는 앞에서 부터 저장) 1번문제와 조금 다름
	
		// 예) c = [49, 51, 17, 0, 0]
		int c[] = { 0,0,0,0,0 };
		int cindex = 0;
		for(int i = 0; i < 5; i++) {
			if(a[i] % 2 == 1) {
				c[cindex] = a[i];
				cindex += 1; // if의 조건이 참일때 증가됨.
			}
		}
		for(int i = 0; i < 5; i++) {
			System.out.print(c[i] + " ");
		}
	}
}