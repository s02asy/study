package O0_클래스_주소;


class CC{
	int a;
	int b;
}

public class O0_15_클래스배열_주소테스트3 {
	public static void main(String[] args) {
		CC [] ccList = new CC[3];
		for(int i = 0; i < ccList.length; i++) {
			ccList[i] = new CC();
			ccList[i].a = 10;
			ccList[i].b = 20;
		}
		
		CC cc = ccList[0];
		cc.a = 100;
		
		// 실행전 예상하기
		for(int i = 0; i  < ccList.length; i++) {
			//System.out.println(ccList[i].a + ccList[i].b);
		}
		
	}
}