package J4_�迭_level4;

public class J4_�迭4_�Ӹ���� {

	public static void main(String[] args) {
		int arr1[] = { 1, 5, 4, 5, 3, 2, 2, 3, 5, 4, 5, 1 };
		int arr2[] = { 1, 5, 4, 5, 3, 2, 3, 5, 4, 5, 1 };
		// �� �迭���� ���� �Ӹ�������� �ƴ��� ����Ͻÿ�.
		// �Ӹ�����̶�?
		// �տ������� ���� ����
		// �ڿ������� ���� �� �Ȱ��� ���ڰ� ������ �Ӹ�����̴�
		// ��) 2112
		// ��) 12321
		int size = arr1.length; // arr1.length ==> 12
		int back = size - 1;
		boolean check = false;
		for (int i = 0; i < size / 2; i++) {
			if (arr1[i] != arr1[back]) {
				check = true;
				break;
			} else {
				back -= 1;
			}
		}

		if (check == true) {
			System.out.println("�Ӹ������ �ƴϴ�.");
		} else {
			System.out.println("�Ӹ�����̴�.");
		}
	}
}