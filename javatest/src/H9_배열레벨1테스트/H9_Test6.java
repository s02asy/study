package H9_�迭����1�׽�Ʈ;

public class H9_Test6 {
	public static void main(String[] args) {
		// ���� 1) �Ʒ� �迭 a �� b �� ���ؼ� ���� ���� c�� ����
		//  ����1 ) c�� ���߿��� ¦���� d�� ���� 
		//  ����2 ) d�� �����Ҷ��� �տ������� ���������� ���� 		
		// ��) c[] = {23,74,47,82,51}
		// ��) d[] = {74,82,0,0,0}
		int a[] = { 10, 20, 30, 40, 50 };
		int b[] = { 13, 54, 17, 42, 1 };
		int c[] = { 0,0,0,0,0};
		int d[] = { 0,0,0,0,0};
		int d_index = 0;
		for(int i = 0; i < 5; i++) {
			c[i] = a[i] + b[i];
			if(c[i] % 2 == 0) {
				d[d_index] = c[i];
				d_index += 1;
			}
		}
		System.out.print("c[] = { ");
		for(int i = 0; i < 5; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.print("}");
		System.out.println();
		System.out.print("d[] = { ");
		for(int i = 0; i < 5; i++) {
			System.out.print(d[i] + " ");
		}
		System.out.print("}");
		System.out.println();
		
		// ����2) �Ʒ��� ������ �̴�. ���迡 �հ��ѻ���� ��ȣ�� win �� ���� (60���̻��հ�)
		int num[] = { 1001, 1002, 1003 };
		int score[] = { 50, 83, 78 };
		int win[] = { 0,0,0 };
		int win_index = 0;
		// ��) win[]= {1002, 1003, 0};
		for(int i = 0; i < 3; i++) {
			if(score[i] >= 60) {
				win[win_index] = num[i];
				win_index += 1;
			}
		}
		System.out.print("win[] = { ");
		for(int i = 0; i < 3; i++) {
			System.out.print(win[i] + " ");
		}
		System.out.print("}");
		System.out.println();
		
		// ����3) �Ʒ��� ������ �̴� ���迡 �հ��� ����� ��ȣ�� win2 �� ���� (60���̻� �հ�)
		int data[] = { 1001, 80 , 1002, 23, 1003 , 78 };
		int win2[] = { 0,0,0 };
		int win2_index = 0;
		// ��) win2[] = {1001, 1003, 0};
		for(int i = 0; i < 6; i++) {
			if(i % 2 == 1 && data[i] >= 60) {
				win2[win2_index] = data[i - 1];
				win2_index += 1;
			}
		}
		System.out.print("win2[] = { ");
		for(int i = 0; i < 3; i++) {
			System.out.print(win2[i] + " ");
		}
		System.out.print("}");
	}
}