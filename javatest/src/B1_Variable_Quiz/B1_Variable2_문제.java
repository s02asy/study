package B1_Variable_Quiz;

public class B1_Variable2_���� {
	public static void main(String[] args) {

			int money = 174900;
			
			// [����] �� �� (174900�� )�� ȭ��ż����� ����غ�����.
			
			// ������  : 3 , �ϸ��� : 2 , ��õ�� : 0 , ��õ�� : 4 , �����  : 1 , �Ϲ�� : 4
			
			int �� = 174900;
			int ������ = �� / 50000;
			int �ϸ��� = �� % 50000 / 10000;
			int ��õ�� = �� % 10000 / 5000;
			int ��õ�� = �� % 5000 / 1000;
			int ����� = �� % 1000 / 500;
			int �Ϲ�� = �� % 500 / 100;

			System.out.println("������ : " + ������ );
			System.out.println("�ϸ��� : " + �ϸ��� );
			System.out.println("��õ�� : " + ��õ�� );
			System.out.println("��õ�� : " + ��õ�� );
			System.out.println("����� : " + ����� );
			System.out.println("�Ϲ�� : " + �Ϲ�� );
     }
}
