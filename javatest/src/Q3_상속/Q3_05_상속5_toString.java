package Q3_���;
class Test05_1{	
}
class Test05_2{	
	
	// �θ� toString �� �ִ��� Ȯ���ϴ� Ű����(������̼�)�̶���Ѵ�.
	// �������� 
	@Override // ������̼��� �ٿ��ָ� �θ� ���� �޼��尡 �ִ��� Ȯ�����ش�.
	public String toString() {
		return "�ȳ�";
	}
	
	 // �θ� ���� �޼ҵ� ���� �ٿ����� ����������.
	//@Override 
	//void test() {}
	
}
public class Q3_05_���5_toString {

	public static void main(String[] args) {
		//[�������̵�]		
		// Ŭ���� ��ü�� ������ ��� �ϸ� �ּҰ� ��µȴ�.
		// ������ ����.toString() ������ 
		// ������ �����ְ� ������� �����Ѱ��̴�.
		
		// toString() ��  Object Ŭ�������� �����ϴ� �Լ���,
		// �ּҸ� ������ش�. 
		Test05_1 t1 = new Test05_1();		
		System.out.println(t1);
		System.out.println(t1.toString());
				
		System.out.println("--------------------");
				
		// �θ� Object Ŭ������ �ִ� toString() �޼��带 
		// �ڽ��� ��Ȱ���ؼ� ����Ҽ��ִ�.
		Test05_2 t2 = new Test05_2();		
		System.out.println(t2);
		System.out.println(t2.toString());
		
	}
}