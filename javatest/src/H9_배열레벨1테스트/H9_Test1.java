package H9_�迭����1�׽�Ʈ;

public class H9_Test1 {
	public static void main(String[] args) {
		// �پ��� ������ �尩�� ������ 1�� �� ������� �Ѵ�. 
		// �����迭�� �尪�� ������ ��ȣ�� ǥ���Ѱ��̴� 
		// �尪�� ��ȣ�� 1,2,3 �� 3�����̴�. 
		
		// �尩�� ���  ������ִ°�?
		int arr[] = {1,2,1,3,2,1,2,1};
		
		// ��ȣ1�� �尩 2�� 
		// ��ȣ2�� �尩 1��
		
		// �� 3�� 
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		for(int i = 0; i < 8; i++) {
			if(arr[i] == 1) {
				c1 += 1;
			}
			else if(arr[i] == 2) {
				c2 += 1;
			}
			else if(arr[i] == 3) {
				c3 += 1;
			}
		}
		System.out.println("1���尩 : " + c1 + "��");
		System.out.println("2���尩 : " + c2 + "��");
		System.out.println("3���尩 : " + c3 + "��");
		c1 = c1 / 2;
		c2 = c2 / 2;
		c3 = c3 / 2;
		System.out.println("1���尩 : " + c1 + "��");
		System.out.println("2���尩 : " + c2 + "��");
		System.out.println("3���尩 : " + c3 + "��");
	}
}