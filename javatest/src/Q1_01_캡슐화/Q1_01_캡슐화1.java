package Q1_01_ĸ��ȭ;


class Test01 {
	// �ڹ� : �����ϴ� Ŭ���� 1���� ���� , ��� Ŭ������ �տ��� public�� �ٴ´�.
	// ���������� : private , default , public , protected(���� ����)
	private int a;
	private int b;
	
	// ������� ���� ���� default ��� �θ���.(public�����Ȱ�)
	// ���ݱ����� �ț����� ���Ĵ� ��Ȯ�ϰ� ��ø� ���� ���ִ°��� ����.
	// �ƹ��͵� �����°��� ���� ���������ʴ´�. 
	int c;
	
	// public �� ��� Ŭ���������� ���ٰ����Ѱ����� �ƹ��͵� �������� 
	// �ڵ����� public �� �Ȱ��̴� 
	public int d;
	
	
}

public class Q1_01_ĸ��ȭ1 {
public static void main(String[] args) {
		
		
		Test01 t = new Test01();
		
		// 1. private�� ���� ������ Ŭ���� ���ο����� ����� �����ϴ�.
		// 2. �ٸ� Ŭ���������� ����� �� ����.
		// t.a = 10;	// ����
		// t.b = 20;	// ����
				
		t.c = 30;
		
	}
}