package B1_Variable_Quiz;

public class B1_Variable2_���� {
	public static void main(String[] args) {

			int money = 174900;
			
			// [����] �� �� (174900�� )�� ȭ��ż����� ����غ�����.
			
			// ������  : 3 , �ϸ��� : 2 , ��õ�� : 0 , ��õ�� : 4 , �����  : 1 , �Ϲ�� : 4
			
			
			int _������ = money / 50000;
			int _�ϸ��� = money % 50000 / 10000;
			int _��õ�� = money % 10000 / 5000;
			int _��õ�� = money % 5000 / 1000;
			int _����� = money %1000 / 500;
			int _�Ϲ�� = money % 500 / 100;
			
			System.out.println("_������ : " + _������ );
			System.out.println("_�ϸ��� : " + _�ϸ��� );
			System.out.println("_��õ�� : " + _��õ�� );
			System.out.println("_��õ�� : " + _��õ�� );
			System.out.println("_����� : " + _����� );
			System.out.println("_�Ϲ�� : " + _�Ϲ�� );
			
			
			
			
     }
}
