package A1_Basic_Quiz;

public class A4_Operator2_���� {
	public static void main(String[] args) {
		//��) ������ 1000���ִ�. 200��¥�� ���� ���� ��, �ܵ� ��� 
		System.out.println(1000 - 200);
		System.out.println("�ܵ� = " + (1000 - 200) + "��");
		//����1) ������ 100���̴�. ������? (���� : ���� 10% ����)
		System.out.println(100 * 12 * 0.9);
		System.out.println("���Ŀ��� : " + 100 * 12 * 0.9 + "��");
		//����2) ���������� 30, 50, 4�� �� �޾Ҵ�. �����?
		System.out.println((30 + 50 + 4) / 3);
		System.out.println("��� : " + (30 + 50 + 4) / 3 + "��");
		//����3) ���ΰ� 3�̰� ���ΰ� 6�� �ﰢ�� ���� ���
		System.out.println(3 * 6 / 2);
		System.out.println("���� : " + 3 * 6 / 2);
		//����4) 100�ʸ� 1�� 40�ʷ� ���
		System.out.println(100 / 60);
		System.out.println(100 % 60);
		System.out.println(100 / 60 + "��" + 100 % 60 + "��");
		//����5) 800������ 500��¥�� ���� , 800���� 500������ 100��¥�� ���� ���
		//����5) 500��(1��), 100��(3��)
		System.out.println(800 / 500);
		System.out.println(800 % 500 / 100 );
		System.out.println("500�� = " + 800 / 500 + "��");
		System.out.println("100�� = " + 800 % 500 / 100 + "��");
	}
}
