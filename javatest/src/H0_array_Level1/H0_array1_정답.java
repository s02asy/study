package H0_array_Level1;

public class H0_array1_���� {
	public static void main(String[] args) {
		int a[] = { 10, 49, 51, 36, 17 };
		// ���� 1) ���� ����Ʈ�� �̿��ؼ� a �� ���� Ȧ���� b �� ����(��ġ�� ��������ġ�� ����)
		// ��) b = [0, 49, 51, 0, 17]
		// init(�ʱ�ȭ) direct x ���. �ʱ�ȭ, ��� , ��� ���ε���
		int b[] = { 0,0,0,0,0 };
		
		// update(���)
		for(int i = 0; i < 5; i++) {
			if(a[i] % 2 == 1) {  // ���ٴ� �ڸ��� �ٲ㵵 �������.
				b[i] = a[i];	 // ���Կ������� ���� �����ʿ� �ִ°��� ���ʿ� �־��.
			}
		}
		// render(���)
		for(int i = 0; i < 5; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		System.out.println("------------------------");
		// ���� 2) ���� ����Ʈ�� �̿��ؼ� a �� ���� Ȧ���� c �� ����
		// ���� (��ġ�� �տ��� ���� ����) 1�������� ���� �ٸ�
	
		// ��) c = [49, 51, 17, 0, 0]
		int c[] = { 0,0,0,0,0 };
		int cindex = 0;
		for(int i = 0; i < 5; i++) {
			if(a[i] % 2 == 1) {
				c[cindex] = a[i];
				cindex += 1; // if�� ������ ���϶� ������.
			}
		}
		for(int i = 0; i < 5; i++) {
			System.out.print(c[i] + " ");
		}
	}
}