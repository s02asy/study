package B0_Variable_이론;

public class B_Variable7_자료형변환 {
	public static void main(String[] args) {

		//[자료형변환] 
		
		
		//자바는 같은타입끼리만 연산을 할수있다.
		// 정수 + 정수
		// 실수 + 실수 
		
		
		// 1) 자동형변환 
		// 만약에 실수 + 정수 를 하면 내부적으로 정수를 실수로 형변환을 한다.
		// 예) 10 + 3.0 ==> 10.0 + 3.0
		System.out.println("[자동 형변환]");
		System.out.println(10 + 3);
		System.out.println(10 + 3.0);
		
		
		// 2) 강제형변환 (변수끼리 연산할때 필요)
		// 사용자가 직접 형변환 시키는것.
		// 자료형이 다른 변수끼리 연산이 필요할때는 강제 형변환을 해야한다.  
		// 형변환 하는법 ==> (형변환타입)변수;	
		System.out.println("[강제 형변환]");
		int a = 10;
		System.out.println(a);
		double b = (double)a ; // 강제 형변환 
		System.out.println(b);
		int c = (int) b; // 강제 형변환 
		System.out.println(c);
		
		
		// int f = d + e; // 에러가난다.
		int d = 10;
		double e = 143.23;
		int f = d + (int)e; 
		System.out.println(f);
		
     }
}
