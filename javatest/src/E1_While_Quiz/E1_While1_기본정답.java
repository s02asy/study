package E1_While_Quiz;

public class E1_While1_기본정답 {

	public static void main(String[] args) {
		//문제 1) 1~10까지 출력
		//정답) 1,2,3,4,5,6,7,8,9,10
		int i = 1;
		while(i <= 10) {
			System.out.print(i + " ");
			i += 1; // i++
		}
		System.out.println();
		System.out.println();
		//문제2) 5~-4까지 거꾸로 출력
		//정답) 5,4,3,2,1,0,-1,-2,-3,-4
		int a = 5;
		while(a >= -4) {
			System.out.print(a + " ");
			a -= 1; // i--
		}
		System.out.println();
		System.out.println("---------------------------");
		//문제3) 1~10까지 반복해 5~9출력 (if문사용)
		//정답) 5,6,7,8,9
		int b = 1;
		while(b <= 10) {
			if(b >= 5 && b <= 9) {
				System.out.print(b + " ");
			}
			b++;
		}
		System.out.println();
		System.out.println("---------------------------");
		//문제4) 10~1까지 반복해 6~3 거꾸로 출력
		//정답) 6,5,4,3
		int c = 10;
		while(c >= 1) {
			if(c <= 6 && c >= 3) {
				System.out.print(c + " ");
			}
			c--;
		}
		System.out.println();
		System.out.println("---------------------------");
		//문제5) 1~10까지 반복해 짝수만 출력
		//정답) 2,4,6,8,10
		int d = 1;
		while(d <= 10) {
			if(d % 2 == 0) {
				System.out.print(d + " ");
			}
			d++;
		}
	}
}
