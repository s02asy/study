package M0_배열의주소;

public class M0_주소_상수 {
	public static void main(String[] args) {

		int a = 10;
		a = 20;
		
		//상수 ==> 변하지 않는수 
		// 키워드 final ==> 말그대로 마지막값이라는뜻 (변형불가)
		
		final int b = 20;
		// b = 30; 키워드 final을 붙이면 한번정한값을 수정할수없다.
		
		// 자바는 일반적으로 상수는 대문자로 표시한다. (암묵적인룰)
		final int SIZE = 20; // 암묵적인룰 ==> 상수는 대문자로 표기
		int arr[] = new int[SIZE];
		
	}

}