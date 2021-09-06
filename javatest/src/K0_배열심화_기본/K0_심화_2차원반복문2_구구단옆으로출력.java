package K0_배열심화_기본;


public class K0_심화_2차원반복문2_구구단옆으로출력 {
	
	public static void main(String[] args) {
		// 아래와같이 구구단을 옆으로 출력해보세요.
		/* 2*1 = 2		3*1 = 3  .....  	9*1 = 9
		 * 2*2 = 4  	3*2 = 6	 .....		9*2 = 18
		 * 2*3 = 6  	3*3 = 9	 .....		9*3 = 27
		 * ...      	...					...
		 * ...      	...					...
		 * 2*9 = 18		3*9 = 27 .....		9*9 = 81
		 */	
		int num = 2;
		for(int i = 0; i < 8; i++) {
			System.out.print("      " + num + "단                  ");
			num += 1;
		}
		System.out.println();
		for(int i = 1; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				//System.out.print("[" + j + " * " + i + " = " + j*i + "]");
				System.out.printf(" [%d * %d = %2d]", j , i ,j*i);
			}
			System.out.println();
		}
		for(int i = 1; i > 1; i--) {
			System.out.println("@");
		}
	}
}