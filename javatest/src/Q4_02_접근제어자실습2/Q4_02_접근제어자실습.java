package Q4_02_���������ڽǽ�2;



import Q4_01_���������ڽǽ�1.Q4_01_��������������;

// a �� private �̹Ƿ� ���Ұ�
// b �� public �̹Ƿ� ���Ŭ���������� ��밡��
// c �� protected �̹Ƿ� �ڽ�Ŭ������ TestŬ���� ���ο����� ��밡�� 
// d �� default �� ��Ű���� �޶����� private �̹Ƿ� ���Ұ� 
class Test extends Q4_01_��������������{
	
	public Test(){
		b = 10; // b�� public �̹Ƿ� ��밡��
		c = 10; // c�� protected �̹Ƿ� �ڽ�Ŭ���������� ��밡���ϴ�.
	}
}

public class Q4_02_���������ڽǽ� {
	public static void main(String[] args) {
		Test test = new Test();	
		test.b = 10; // b�� public �̹Ƿ� ��밡��.
		// ���⼭�� ���� b�� ��밡���ϴ�. 
	}
}