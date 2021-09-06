package J4_배열_level4;

public class J4_배열4_팰린드롬 {

	public static void main(String[] args) {
		int arr1[] = { 1, 5, 4, 5, 3, 2, 2, 3, 5, 4, 5, 1 };
		int arr2[] = { 1, 5, 4, 5, 3, 2, 3, 5, 4, 5, 1 };
		// 위 배열들이 각각 팰린드롬인지 아닌지 출력하시요.
		// 팰린드롬이란?
		// 앞에서부터 읽을 때와
		// 뒤에서부터 읽을 때 똑같은 숫자가 나오면 팰린드롬이다
		// 예) 2112
		// 예) 12321
		int size = arr1.length; // arr1.length ==> 12
		int back = size - 1;
		boolean check = false;
		for (int i = 0; i < size / 2; i++) {
			if (arr1[i] != arr1[back]) {
				check = true;
				break;
			} else {
				back -= 1;
			}
		}

		if (check == true) {
			System.out.println("팰린드롬이 아니다.");
		} else {
			System.out.println("팰린드롬이다.");
		}
	}
}