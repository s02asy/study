package P6_콜렉션벡터_level1;
/*
* # 래퍼 클래스(wrapper class)
* - 래퍼 클래스란, 기본 자료형을 클래스로 만들어 놓은 것을 의미한다.
* [기본형]          [래퍼 클래스]
* byte             Byte
* short            Short
* int              Integer
* long             Long
* float            Float
* double           Double
* char             Character
* boolean          Boolean
*/

public class P6_래퍼클래스 {
	public static void main(String[] args) {
		int a = 10;
		Integer i = new Integer(10);
		System.out.println(a);
		System.out.println(i);
		
		
		float b = 10.1f;
		Float f = new Float(10.1);
		System.out.println(b);
		System.out.println(f);
		
		double c = 10.11;
		Double d = new Double(10.11);
		System.out.println(c);
		System.out.println(d);
		
			
	}
}