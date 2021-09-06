package _04_문자열;

public class _04_01_문자열1_정답 {
	public static void main(String[] args) {
		String id[] = {"qwer" , "asdf" , "zxc"};
		
		String find = "aaaa";
		
		/*
		 * 1) id[] 는  아이디를 저장해놓은 배열이다.
		 * 2) find 는  로그인할 아이디 이다.
		 * 3) find 의 값이 id[] 에 있으면 "o" , 없으면 "x" 출력.
		 */
		boolean check = false;
		for(int i = 0; i < id.length; i++) {
			if(find.equals(id[i])) {
				System.out.println("o");
				check = true;
			}
		}
		
		if(check == false) {
			System.out.println("x");
		}
	}
}