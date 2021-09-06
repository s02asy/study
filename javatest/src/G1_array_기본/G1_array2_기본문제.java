package G1_array_기본;

public class G1_array2_기본문제 {

	public static void main(String[] args) {

		int[] arr = {10,20,30,40,50};

		// 문제1) 4의 배수만 출력
		// 정답1) 20 40
		System.out.println("문제1");
		for(int i = 0; i < 5; i++) {
			if(arr[i] % 4 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
		// 문제2) 4의 배수의 합 출력
		// 정답2) 60
		System.out.println("문제2");
		int total = 0;
		for(int i = 0; i < 5; i++) {
			if(arr[i] % 4 == 0) {
				total = total + arr[i];
			}
		}
		System.out.println("4의 배수 합 : " + total);
		// 문제3) 4의 배수의 개수 출력
		// 정답3) 2
		System.out.println("문제3");
		int count = 0;
		for(int i = 0; i < 5; i++) {
			if(arr[i] % 4 == 0) {
				count += 1;
			}
		}
		System.out.println("4의 배수 개수 : " + count);
	}

}