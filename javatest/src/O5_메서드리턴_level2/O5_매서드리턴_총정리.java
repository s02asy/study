package O5_메서드리턴_level2;
class Mega{
	int a;
}
class Test{
	int a;
	void test() {  // ==> return 을 안써도되도고, 쓴다면 값을 내보지 않겠다.
		a = 10;
		return;
	}
	int test2() {   // 장점 : 변수 1개 생략가능 
		return 10;
	}
	Mega test3() {
		Mega mega = new Mega();
		return mega;
	}
	int [] test4() {
		int arr[]  = {10,20,30};
		return arr;
	}
	Mega[] test5() {
		Mega[] megaList = new Mega[2];
		return megaList;
	}
}
public class O5_매서드리턴_총정리 {
	public static void main(String[] args) {
		// 예를 들어 a에 10을 저장하고싶다.	
		//int a = 10;
		
//		Test t = new Test();
//		t.test();	
//		int a = t.a;
				
		Test t = new Test();
		int a = t.test2();
		
		Mega m1 = new Mega();
		Mega m2 = t.test3();
		
		int arr[] = t.test4();
		
		Mega[] ml = t.test5();
	}

}