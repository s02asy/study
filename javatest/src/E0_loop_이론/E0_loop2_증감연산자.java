package E0_loop_이론;


public class E0_loop2_증감연산자 {
	public static void main(String[] args) {
		// 증감식 종류 (아래 4종류전부 같은뜻이다)
		// 1) i = i + 1;
		// 2) i += 1;
		// 3) i++;
		// 4) ++i;
		
		int i = 0;
		i = i + 1;
		System.out.println(i);
		System.out.println();
		i += 1;
		System.out.println(i);
		System.out.println();
		i++;
		System.out.println(i);
		System.out.println();
		++i;
		System.out.println(i);
		System.out.println();
	}
}