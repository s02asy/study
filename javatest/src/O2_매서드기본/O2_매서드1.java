package O2_�ż���⺻;

//�ż��� �⺻���� 
// ����
// 1) void 				==> Ű����
// 2) testPrint() 		==> �̸�
// 3) {���}            	==> ����Ǵ� ���� 
	
// ����
// t1.testPrint();
// 1) t1     ==> Ŭ����������
// 2) .testPrint(); ==> .�Լ��̸�();
class Test{		
	void testPrint() {
		System.out.println("!!");
	}
}
public class O2_�ż���1 {
	public static void main(String[] args) {
		Test test = new Test();
		test.testPrint();
		test.testPrint();
		test.testPrint();
		test.testPrint();
	}
}