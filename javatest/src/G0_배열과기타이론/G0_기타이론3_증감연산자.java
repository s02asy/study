package G0_배열과기타이론;

public class G0_기타이론3_증감연산자 {
	public static void main(String[] args) {
		
			
		int a = 10;
		System.out.println("a : " + ++a);
		System.out.println("a : " + a);
		
		int b = 10;
		// 연산자 끼리는 우선순위라는게 있는데 
		// ++을 변수 뒤에 붙이는건 우선순위가 낮아서 b가 먼저 출력되고나서 더하기 1이된다. 
		// 이런걸이용해서 코드를 한줄정도줄일수는있으나 권장하진않음 정확히 코딩하는게 더 좋음
		// 하지만 알고는 있어야함 
		System.out.println("b : " + b++);	
		System.out.println("b : " + b);
		
		//위 방법들보다는 아래방법이 코드가 한줄더들어가도 훨씬 안정적임 
		int c = 10;
		System.out.println(c);
		c += 1;
		System.out.println(c);
		
		// ------------------------------------------------
		
		//int a = 10;
				//a++;
				//++a;
				//System.out.println(a);
				//-------------------------------
				int i = 0;
				while(i <= 3) {
					System.out.print(++i + " ");
				}
				System.out.println();
				System.out.println("----------------");
				b = 0;
				while(b <= 3) {
					b += 1;
					System.out.print(b + " ");
				}
				System.out.println();
				System.out.println("-----------------");
				//-------------------------------
				c = 0;
				while(c <= 3) {
					System.out.print(c++ + " ");
				}
				System.out.println();
				System.out.println("-----------------");
				
				int d = 0;
				while(d <= 3) {
					System.out.print(d + " ");
					d += 1;
				}
				System.out.println();
				System.out.println("-----------------");
	}
}