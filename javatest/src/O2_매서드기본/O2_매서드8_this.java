package O2_�ż���⺻;

class MyTest{
	int a;
	String name;
	int score;
	void test() {
		int a = 10; // test()���� "a"��  �Լ��ۿ��ִ� a �� ���� �ٸ�a �̴�.
		// ����� ���а����ϴ�. ������ �Ķ��� 
		// ���θ� �������� ���ؼ��� this.�� �ٿ����Ѵ�. 	
		// ���� Ŭ���� �Լ��ۿ� �ִ� �������� this.�� ���̴°� ��Ģ������
		// �������������� ��Ȯ���� ���� ���̴°� ����.
		this.a = 100;
		System.out.println("------------------");
		System.out.println(a);
		System.out.println(this.a);
		System.out.println("------------------");
		
		this.name = "aaa";
		this.score = 100;
	}
}


public class O2_�ż���8_this {

	public static void main(String[] args) {
		MyTest t = new MyTest();
		t.test();
		System.out.println(t.a);
	}
}