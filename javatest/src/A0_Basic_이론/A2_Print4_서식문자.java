package A0_Basic_�̷�;
/*
 * # ��¹��� ����
 * 1. System.out.println();
 * 1) ln = new line
 * 2) �ٹٲ� ����
 * 2. System.out.print();
 * 1) �ٹٲ� �Ұ�
 * 3. System.out.printf();
 * 1) ���Ĺ��� ���
 * 2) ����
 * . %d : ���� : �Ҽ����� ���¼�
 * . %f : �Ǽ� : �Ҽ����� �ִ¼�
 * . %c : ���� 1��
 * . %s : ���� ������
 */
public class A2_Print4_���Ĺ��� {
	public static void main(String[] args) {
		
		System.out.println("-------------------------------");
		System.out.printf("%d", 10);
		System.out.println();
		System.out.println("-------------------------------");
		System.out.printf("%f\n", 3.14);
		
		System.out.printf("%.2f\n", 3.14); // �Ҽ��� ������ �����Ҽ��ִ�. 
		
		System.out.println("-------------------------------");
		System.out.printf("%c\n", 'b');
		
		System.out.printf("%s\n", "��¹�������");
		System.out.println("-------------------------------");
		String fruit = "���";
		int cnt = 5;
		System.out.printf("%s�� %d�� �ֽ��ϴ�.\n", fruit, cnt);
		System.out.println("-------------------------------");
		
		// printf �� ���¹� 
		System.out.printf("%d + %d = %d", 10 , 3 , 13);
		System.out.println();
		System.out.println(10 + " + " + 3 + " = " + 13);		
		// �Ǽ�  // %f �� �⺻ �Ҽ��� 6�ڸ� 
		System.out.printf("%f" , 3.15); 
		System.out.println();
		// %.2f ==> �Ҽ��� �ڸ� ���� (2�ڸ����� ���)
		System.out.printf("%.2f" , 3.14);
		// �ѱ��� (char)
		System.out.println();
		System.out.printf("%c" , 'a');
				
		// �������� (String)
		System.out.println();
		System.out.printf("%s" ,"�ȳ��ϼ���");

	}
}
