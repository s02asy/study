package M2_문자열기본;

public class M2_05_문자열함수 {
	/*
	 * # 문자열함수
	 * [1] 문자의 길이 : length()
	 * 
	 * [2] 문자 한개 추출(인덱싱) : charAt(index)
	 * 
	 * [3] 문자 여러개 추출(슬라이싱)
	 * 	1) substring(min , max-1)  ==> 범위
	 * 	2) substring(min)          ==> 끝까지
	 * 
	 * [4] 구분자로 잘라내 배열에 담기 
	 *     String str = "hello,java,android";
	 *     String[] ar = str.split(",");
	 *     ar[0] = hello
	 *     ar[1] = java
	 *     ar[2] = android   
	 */

	public static void main(String[] args) {

		//			  012345
		String str = "megait";
		System.out.println(str);

		// [1] 문자의 길이 : length()
		int size = str.length();
		System.out.println(size);					// 6
		
		// [2] 문자 한개 추출(인덱싱) : charAt(index)
		char ch = str.charAt(0); // 첫번째글자
		System.out.println(ch);						// m
		ch = str.charAt(size - 1); //마지막글자
		System.out.println(ch);						// t
		
		// [3] 문자 여러개 추출(슬라이싱)
		// 1) substring(index1, index2)
		//    마지막은 포함하지 않는다. (index1부터 index2 미만까지)
		String rs = str.substring(4, 6);
		System.out.println(rs);						// it
		
		// 2) substring(index)
		//    index부터 문자열 끝까지
		rs = str.substring(4);
		System.out.println(rs);						// it
		
		// [4] split(구분자) 
		//		구분자로 잘라내서 배열에 담기
		str = "hello,java,android";
		String[] ar = str.split(",");
		System.out.println(ar.length);				// 3
		System.out.println(ar[0]);					// hello
		System.out.println(ar[1]);					// java
		System.out.println(ar[2]);					// android
		
	}


}