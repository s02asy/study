package E2_While_Quiz;
/*
 * # 369게임[2단계]
 * 1. 1~50까지 반복을 한다.
 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
 */
public class E2_While6_369게임문제 {
	public static void main(String[] args) {
		int i = 1;
		while(i <= 50) {
			int count = 0;
			int 십 = i / 10;
			int 일 = i % 10;
			if(십 % 3 == 0 && 십 != 0) {
				count += 1;
			}
			if(일 % 3 == 0 && 일 != 0) {
				count += 1;
			}
			if(count == 1) {
				System.out.print("짝" + " ");
			}
			else if(count == 2) {
				System.out.print("짝짝" + " ");
			}
			else {
				System.out.print(i + " ");
			}
			i += 1;
		}
		System.out.println();
	}

}