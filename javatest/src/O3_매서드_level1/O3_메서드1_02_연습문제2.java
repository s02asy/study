package O3_매서드_level1;

class Test2 {
	int total;
	int cnt;
	void printSum(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			this.total += arr[i];
		}
		System.out.println(this.total);
	}
	void printSumMultiple4(int[] arr) {
		this.total = 0;
		System.out.print("4의 배수 : ");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 4 == 0) {
				this.total += arr[i];
				this.cnt += 1;
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}
	void printCountMultiple4(int[] arr) {
		this.cnt = 0;
		System.out.print("arr의 짝수 : ");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				this.cnt += 1;
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}
}

public class O3_메서드1_02_연습문제2 {
	public static void main(String[] args) {
		int[] arr = { 87, 100, 11, 72, 92 };
		Test2 t2 = new Test2();
		// 문제 1) 전체 합 출력
		// 정답 1) 362
		t2.printSum(arr);
		
		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		t2.printSumMultiple4(arr);
		System.out.println("4의 배수의 합 : " + t2.total);
		
		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3
		System.out.println("4의 배수의 개수 : " + t2.cnt);
		
		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3
		t2.printCountMultiple4(arr);
		System.out.println("짝수의 개수 : " + t2.cnt);
	}
}