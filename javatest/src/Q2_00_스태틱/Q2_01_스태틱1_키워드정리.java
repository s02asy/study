package Q2_00_스태틱;


class Test{
	public int a = 20;
	private int b;
}

class Test2{
	public int[]arr = new int[3];
	public static int sa = 20;	
	void test() {
		int a = 10;
	}
}
public class Q2_01_스태틱1_키워드정리 {
	public static void main(String[] args) {
		
		//--------------------------------------
		//   접근지정자 
		// 1) public , private
		Test t = new Test();
		//t.b ==> private 이라서 접근불가 
		//--------------------------------------
		//   변수의 상수화 ==> final 
		final int a = 10;
		//a = 20; ==> 값변경 불가능 
		//--------------------------------------
		//  스태틱  ==> 메모리영역을 static 에 생성되며 가장 먼저 생성된다. 		
		
		Test2 t2 = new Test2();
		t2.test();
		
		Test2 t3 = new Test2();
		
	}
}