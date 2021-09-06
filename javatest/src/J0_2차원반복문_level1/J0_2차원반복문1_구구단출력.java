package J0_2차원반복문_level1;

public class J0_2차원반복문1_구구단출력 {
	public static void main(String[] args) {


		// 문제) 구구단 출력 아래와같이 9단까지출력해보세요.
				/*
				 * === 2단 ===
				 * 2 X 1 = 2
				 * 2 X 2 = 4
				 * 2 X 3 = 6
				 * 2 X 4 = 8
				 * 2 X 5 = 10
				 * 2 X 6 = 12
				 * 2 X 7 = 14
				 * 2 X 8 = 16
				 * 2 X 9 = 18
				 * === 3단 ===
				 * 3 X 1 = 3
				 * 3 X 2 = 6
				 * ...
				 * ...
				 */
		String check[] = {"","","=== 2단 ===","=== 3단 ===","=== 4단 ===","=== 5단 ===","=== 6단 ===",
				"=== 7단 ===","=== 8단 ===","=== 9단 ==="};
		for(int i = 2; i < 10; i++) {
			System.out.println(check[i]);
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " X " + j + " = " + i * j);
			}
		}
	}
}