package Q2_00_스태틱;


class Test01 {
	int a;
	static int b;
}

public class Q2_01_스태틱1 {
public static void main(String[] args) {
		
		// static 키워드 
		// 전역변수
		// static 은  시작하자마자 바로 메모리에 생성이되서 
	    // new 를 하지않아도 사용할수있다.
	
		// static으로 생성한 변수에 접근하는법
        // 클래스명.변수명  ==> Test01.b
	
		Test01.b = 10;
		System.out.println(Test01.b);
		System.out.println("-------------------------------------");
		// static으로 생성된 변수는 new 를 할때 새로 생성되지않는다. 
		
		Test01 t1 = new Test01();
		t1.a = 20;
		System.out.println(t1.a);
		System.out.println(t1.b); // 같은결과가나온다. Test01.b 와 같다.
		System.out.println("-------------------------------------");
		Test01 t2 = new Test01();
		t2.a = 30;
		System.out.println(t2.a);
		System.out.println(t2.b); // 위와 같다.
			
	}
}