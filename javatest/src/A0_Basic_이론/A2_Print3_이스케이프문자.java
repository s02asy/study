package A0_Basic_이론;

public class A2_Print3_이스케이프문자 {
	public static void main(String[] args) {
		System.out.println("안녕하세요.");
		System.out.println("----------------------");
		System.out.print("abc");
		System.out.println("def.");
		System.out.println("----------------------");
		/*
		 * 이스케이프 문자(escape sequence)
		 * 1) \n	: 줄바꿈
		 * 2) \t	: tab (4칸)
		 * 3) \"	: "
		 * 4) \'	: '
		 */
		System.out.println("안녕\n하세요.");
		System.out.println("----------------------");
		System.out.println("안녕\t하세요.");
		System.out.println("----------------------");
		System.out.println("\"안녕하세요.\"");
		System.out.println("----------------------");
		System.out.println("\'안녕하세요.\'");
		System.out.println("----------------------");

	}
}
