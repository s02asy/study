package O5_�޼��帮��_level2;
class Mega{
	int a;
}
class Test{
	int a;
	void test() {  // ==> return �� �Ƚᵵ�ǵ���, ���ٸ� ���� ������ �ʰڴ�.
		a = 10;
		return;
	}
	int test2() {   // ���� : ���� 1�� �������� 
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
public class O5_�ż��帮��_������ {
	public static void main(String[] args) {
		// ���� ��� a�� 10�� �����ϰ�ʹ�.	
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