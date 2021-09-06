package M3_문자열_level1;

import java.util.Scanner;

/*
 * # 문자열 비교
 * . equals() 메서드 사용없이 문자의 일치여부 비교
   . compareTo() 도 사용금지
   . length() 는 사용해도됨
 * 예)
 * 코끼리
 * 입력 = 티라노사우루스
 * 출력 = false
 */
public class a {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String name = "코끼리";
		
		System.out.print("동물 이름을 입력하세요 : ");	// ex) 티라노사우루스
		String myName = scan.next();
		
		if(name.length() == myName.length()) {
			int count = 0;
			for(int i = 0; i < name.length(); i++) {
				if(name.charAt(i) == myName.charAt(i)) {
					count += 1;
				}
			}
			if(count == name.length()) {
				System.out.println("정답");
			}else {
				System.out.println("꽝");
			}
		}else {
			System.out.println("땡");
		}
		
		
	}

}