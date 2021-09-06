package O0_클래스_주소;


class AA{
	int a;
	int b;
}

public class O0_15_클래스배열_주소테스트1 {
	public static void main(String[] args) {
		AA aa = new AA();
		aa.a = 10;
		aa = new AA();
		aa.b = 20;
		
		// 실행전 예상하기
		// System.out.println(aa.a + aa.b);
	}
}