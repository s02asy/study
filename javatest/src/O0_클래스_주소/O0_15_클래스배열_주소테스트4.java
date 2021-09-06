package O0_클래스_주소;


class DD {
	int a;
	int b;
}

public class O0_15_클래스배열_주소테스트4 {
	public static void main(String[] args) {
		
		DD[] ddList = new DD[3];
		
		DD d1 = new DD();
		d1.a = 100;
		
		ddList[0] = d1;
		
		d1 = new DD();
		d1.a = 200;
		ddList[1] = d1;
		
		d1 = new DD();
		d1.a = 300;
		ddList[2] = d1;
		
		// 실행전 예상하기
		for(int i = 0; i < ddList.length; i++) {
			System.out.println(ddList[i].a);
		}
	}
}