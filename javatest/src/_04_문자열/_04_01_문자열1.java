package _04_문자열;

public class _04_01_문자열1 {
	public static void main(String[] args) {
		String id[] = {"qwer" , "asdf" , "zxc"};
		
		String find = "asdf";
		
		/*
		 * 1) id[] 는  아이디를 저장해놓은 배열이다.
		 * 
		 * 2) find 는  로그인할 아이디 이다.
		 * 
		 * 3) find 의 값이 id[] 에 있으면 "o" , 없으면 "x" 출력.
		 * 
		 * 
		 */
		for(int i = 0; i < id.length; i++) {
			if(id[i].equals(find)) {
				System.out.println(id[i] + " : o");
			}else {
				System.out.println(id[i] + " : x");
			}
		}
	}
}