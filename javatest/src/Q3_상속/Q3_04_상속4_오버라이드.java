package Q3_���;

class MethodOverloding{
	void test(int a) {};
	void test(int a , int b) {};
	void test(String a) {};
}
class MethodOverride{
	void test() {
		System.out.println("testParent");
	}
	void overridTest() {
		System.out.println("overridTestParent");
	}
}
class Child extends MethodOverride{
	void overridTest() {
		System.out.println("overridTestChild");
	}
}
public class Q3_04_���4_�������̵� {

	public static void main(String[] args) {
		// 1)�ż��� �����ε� 		
		// �ż��� �����ε��� �Լ��̸��� ������ ����ϼ��ִ� ����̴�. 
		
		// 2)�ż���������̵� 
		// �޼��� �������̵� �� �θ� �ִ� �޼��带 �ڽ��� �����̸����� ���� ����ϴ°��̴�. 
		Child c = new Child();
		c.test(); // �翬�� �θ��� �޼��带 ����Ҽ��ִ�.
		c.overridTest(); // �θ��� �޼��� ��������ʰ� �ڽ��� �޼��尡 �켱������ ��������.
				
	}
}