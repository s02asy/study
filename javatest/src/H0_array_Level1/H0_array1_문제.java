package H0_array_Level1;

public class H0_array1_���� {
	public static void main(String[] args) {
		int a[] = { 10, 49, 51, 36, 17 };
		// ���� 1) ���� ����Ʈ�� �̿��ؼ� a �� ���� Ȧ���� b �� ����(��ġ�� ��������ġ�� ����)
		// ��) b = [0, 49, 51, 0, 17]
		int b[] = { 0,0,0,0,0 };
		for(int i = 0; i < 5; i++) {
			if(a[i] % 2 == 1) {
				b[i] = a[i];
			}
		}
		for(int i = 0; i < 5; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		
		// ���� 2) ���� ����Ʈ�� �̿��ؼ� a �� ���� Ȧ���� c �� ����
		// ���� (��ġ�� �տ��� ���� ����) 1�������� ���� �ٸ�
	
		// ��) c = [49, 51, 17, 0, 0]
		int c[] = { 0,0,0,0,0 };
		int c_index = 0;
		for(int i = 0; i < 5; i++) {
			if(a[i] % 2 == 1) {
				c[c_index] = a[i];
				c_index += 1;
			}
		}
		for(int i = 0; i < 5; i++) {
			System.out.print(c[i] + " ");
		}
	}
}