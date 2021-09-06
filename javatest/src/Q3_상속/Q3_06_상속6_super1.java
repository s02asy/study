package Q3_상속;
// [super]
// -상속받은 자식클래스에서 부모의 자원을 사용할때 사용함.
class Test06{	
	void test1() {
		System.out.println("여기는 부모 test1()");
	}
}
class Test06Child extends Test06{
	
	void test1() {
		System.out.println("여기는 자식 test1()");
	}
	void play() {
		//아래 test1(); 은 자식의 메서드를 실행함.
		test1(); 
		//this.test1(); // 원형이나 this생략가능.		
		
		//-----------------------------------
		super.test1(); 		
		// 부모의 test1() 을 실행함.
		// super는 부모를 뜻함.
	}
}

public class Q3_06_상속6_super1 {

	public static void main(String[] args) {
		Test06Child t6 = new Test06Child();
		t6.play();
	}
}