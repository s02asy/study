package Q2_00_����ƽ;


class Test{
	public int a = 20;
	private int b;
}

class Test2{
	public int[]arr = new int[3];
	public static int sa = 20;	
	void test() {
		int a = 10;
	}
}
public class Q2_01_����ƽ1_Ű�������� {
	public static void main(String[] args) {
		
		//--------------------------------------
		//   ���������� 
		// 1) public , private
		Test t = new Test();
		//t.b ==> private �̶� ���ٺҰ� 
		//--------------------------------------
		//   ������ ���ȭ ==> final 
		final int a = 10;
		//a = 20; ==> ������ �Ұ��� 
		//--------------------------------------
		//  ����ƽ  ==> �޸𸮿����� static �� �����Ǹ� ���� ���� �����ȴ�. 		
		
		Test2 t2 = new Test2();
		t2.test();
		
		Test2 t3 = new Test2();
		
	}
}