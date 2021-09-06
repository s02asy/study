package D1_if_Quiz;

public class D1_if1_정답 {
	public static void main(String[] args) {
		

		// 예시) 숫자의 값이  4의 배수면 "4의 배수" 출력
		int num2 = 12;
		if (num2 % 4 == 0) {
			System.out.println("4의 배수이다.");
		}
		if (num2 % 4 != 0) {
			System.out.println("4의 배수가 아니다.");
		}

		// 문제 1) 점수가 60 점이상이면 "합격", 아니면 "불합격" 출력
		int score = 87;
		if (score >= 60) {
			System.out.println("합격");
		}
		if (score < 60) {
			System.out.println("불합격");
		}

	}
}
