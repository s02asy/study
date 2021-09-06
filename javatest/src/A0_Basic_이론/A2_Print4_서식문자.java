package A0_Basic_이론;
/*
 * # 출력문의 종류
 * 1. System.out.println();
 * 1) ln = new line
 * 2) 줄바꿈 가능
 * 2. System.out.print();
 * 1) 줄바꿈 불가
 * 3. System.out.printf();
 * 1) 서식문자 출력
 * 2) 종류
 * . %d : 정수 : 소수점이 없는수
 * . %f : 실수 : 소수점이 있는수
 * . %c : 문자 1개
 * . %s : 문자 여러개
 */
public class A2_Print4_서식문자 {
	public static void main(String[] args) {
		
		System.out.println("-------------------------------");
		System.out.printf("%d", 10);
		System.out.println();
		System.out.println("-------------------------------");
		System.out.printf("%f\n", 3.14);
		
		System.out.printf("%.2f\n", 3.14); // 소수점 개수를 제어할수있다. 
		
		System.out.println("-------------------------------");
		System.out.printf("%c\n", 'b');
		
		System.out.printf("%s\n", "출력문의이해");
		System.out.println("-------------------------------");
		String fruit = "사과";
		int cnt = 5;
		System.out.printf("%s가 %d개 있습니다.\n", fruit, cnt);
		System.out.println("-------------------------------");
		
		// printf 를 쓰는법 
		System.out.printf("%d + %d = %d", 10 , 3 , 13);
		System.out.println();
		System.out.println(10 + " + " + 3 + " = " + 13);		
		// 실수  // %f 는 기본 소수점 6자리 
		System.out.printf("%f" , 3.15); 
		System.out.println();
		// %.2f ==> 소수점 자리 제어 (2자리까지 출력)
		System.out.printf("%.2f" , 3.14);
		// 한글자 (char)
		System.out.println();
		System.out.printf("%c" , 'a');
				
		// 여러글자 (String)
		System.out.println();
		System.out.printf("%s" ,"안녕하세요");

	}
}
