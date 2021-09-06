package O0_클래스_주소;


class BB{
	int a;
	int b;
}

public class O0_15_클래스배열_주소테스트2 {
	public static void main(String[] args) {
		BB [] bb = new BB[3];
		for(int i = 0; i < bb.length; i++) {
			bb[i].a = 10;
			bb[i].b = 20;
		}
		
		// 실행전 예상하기
		for(int i = 0; i  < bb.length; i++) {
		//	System.out.println(bb[i].a + bb[i].b);
		}
		
	}
}