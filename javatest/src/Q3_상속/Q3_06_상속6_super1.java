package Q3_���;
// [super]
// -��ӹ��� �ڽ�Ŭ�������� �θ��� �ڿ��� ����Ҷ� �����.
class Test06{	
	void test1() {
		System.out.println("����� �θ� test1()");
	}
}
class Test06Child extends Test06{
	
	void test1() {
		System.out.println("����� �ڽ� test1()");
	}
	void play() {
		//�Ʒ� test1(); �� �ڽ��� �޼��带 ������.
		test1(); 
		//this.test1(); // �����̳� this��������.		
		
		//-----------------------------------
		super.test1(); 		
		// �θ��� test1() �� ������.
		// super�� �θ� ����.
	}
}

public class Q3_06_���6_super1 {

	public static void main(String[] args) {
		Test06Child t6 = new Test06Child();
		t6.play();
	}
}