package Q1_01_캡슐화;


class Test01 {
	// 자바 : 한파일당 클래스 1개가 정석 , 모든 클래스명 앞에는 public이 붙는다.
	// 접근제어자 : private , default , public , protected(추후 설명)
	private int a;
	private int b;
	
	// 접근제어가 없는 것을 default 라고 부른다.(public생략된것)
	// 지금까지는 안썻지만 추후는 정확하게 명시를 위해 써주는것이 좋다.
	// 아무것도 안적는것은 별로 권장하지않는다. 
	int c;
	
	// public 은 어느 클래스에서도 접근가능한것으로 아무것도 안적으면 
	// 자동으로 public 이 된것이다 
	public int d;
	
	
}

public class Q1_01_캡슐화1 {
public static void main(String[] args) {
		
		
		Test01 t = new Test01();
		
		// 1. private을 붙인 변수는 클래스 내부에서만 사용이 가능하다.
		// 2. 다른 클래스에서는 사용할 수 없다.
		// t.a = 10;	// 에러
		// t.b = 20;	// 에러
				
		t.c = 30;
		
	}
}