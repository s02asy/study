package E4_For;

public class E4_for7_응용정답 {
	public static void main(String[] args) {



		// #문제 1) 8 과 12 의 최소 공배수를 구하시요
		// # 최소 공배수란 각 수의 배수를 나열한다음 처음으로 같은숫자를 말한다.
		// # 예) 8 16 24... 
		// # 예) 12 24....
		// # 여기서 24가 최소공배수이다.
		int a = 8;
		int b = 12;
		for(int i = 0; i == 0;) {
			if(a < b) {
				a += 8;
			}
			if(b < a) {
				b += 12;
			}
			if(a == b) {
				System.out.println("최소 공배수" + a);
				break;
			}
		}
		/*int a = 8;
		int b = 12;
		for(int i = 0; i == 0;) {
			if(a % 12 == 0 && b % 12 == 0) {
				System.out.println(a);
				break;
			}
			a += 8;
			b += 12;
		}*/
		System.out.println("-----------------------");
		// # 문제2) 수인이는 4일 마다 수영장을 가고 형주는 6일마다 수영장에간다
		// # 두사람이  4월 3일에 만났다면 다음에 만날날은 언제인가?
		a = 4;
		b = 6;
		for(int i = 0; i == 0;) {
			if(a < b) {
				a += 4;
			}
			if(b < a) {
				b += 6;
			}
			if(a == b) {
				System.out.println("다시만날 날 : " + (a + 4));
				break;
			}
		}
		System.out.println("-----------------------");
		// # 문제3) 가로가 12 이고 세로가 8인 직사각형모양의 종이를 늘어놓아
		// # 만들수있는 가장작은 정사각형을 만들려고한다. 직사각형은몇장이 필요한가?
		a = 12;
		b = 8;
		for(int i = 0; i == 0;) {
			if(a < b) {
				a += 12;
			}
			if(b < a) {
				b += 8;
			}
			if(a == b) {
				System.out.println("필요 장수 : " + a / 12 * b / 8);
				break;
			}
		}
	}
}