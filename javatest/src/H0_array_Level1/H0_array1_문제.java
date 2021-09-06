package H0_array_Level1;

public class H0_array1_문제 {
	public static void main(String[] args) {
		int a[] = { 10, 49, 51, 36, 17 };
		// 문제 1) 다음 리스트를 이용해서 a 의 값중 홀수만 b 에 저장(위치는 동일한위치에 저장)
		// 예) b = [0, 49, 51, 0, 17]
		int b[] = { 0,0,0,0,0 };
		for(int i = 0; i < 5; i++) {
			if(a[i] % 2 == 1) {
				b[i] = a[i];
			}
		}
		for(int i = 0; i < 5; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		
		// 문제 2) 다음 리스트를 이용해서 a 의 값중 홀수만 c 에 저장
		// 조건 (위치는 앞에서 부터 저장) 1번문제와 조금 다름
	
		// 예) c = [49, 51, 17, 0, 0]
		int c[] = { 0,0,0,0,0 };
		int c_index = 0;
		for(int i = 0; i < 5; i++) {
			if(a[i] % 2 == 1) {
				c[c_index] = a[i];
				c_index += 1;
			}
		}
		for(int i = 0; i < 5; i++) {
			System.out.print(c[i] + " ");
		}
	}
}