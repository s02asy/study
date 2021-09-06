package O0_클래스;

class Ex03 {
	int[] arr = { 87, 100, 11, 72, 92 };
}

public class O0_03_클래스문제1 {
	public static void main(String[] args) {
		// 문제 1) 전체 합 출력
		// 정답 1) 362
		Ex03 e = new Ex03();
		int total = 0;
		for(int i = 0; i < e.arr.length; i++) {
			total += e.arr[i];
		}
		System.out.println(total);
		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		total = 0;
		int cnt = 0;
		int cnt2 = 0;
		for(int i = 0; i < e.arr.length; i++) {
			if(e.arr[i] % 4 == 0) {
				total += e.arr[i];
				cnt += 1;
			}
			if(e.arr[i] % 2 == 0) {
				cnt2 += 1;
			}
		}
		System.out.println(total);
		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3
		System.out.println(cnt);
		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3
		System.out.println(cnt2);
	}
}