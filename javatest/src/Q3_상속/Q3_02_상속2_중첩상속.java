package Q3_상속;

class AA{
	int aa;
}

class BB extends AA {
	int bb;
}

class CC extends BB {
	int cc;
}

public class Q3_02_상속2_중첩상속 {
	// 클래스당 상속은 1번만 가능하다.
	// 상속이 여러개 필요한경우 줄줄이 상속해야한다. 

	public static void main(String[] args) {
		CC cc = new CC();
		
		// 상속을 받으면 부모변수를 마치 자기변수 처럼 사용할수있다.
		cc.aa = 10;
		cc.bb = 20;
		cc.cc = 30;
		
		
	}
}