package G0_�迭����Ÿ�̷�;

public class G0_array1_�̷� {
	/*
	 * # �迭(array)
	 * 1. "���� ����"�� �����͸� "������" �����ϱ� ���� ���
	 * 
	 * 2. ����
	 * 		int num = 10;
	 * 		int[] arr = new int[���� ����];
	 * 		int arr[] = new int[���� ����];
	 * 
	 * 3. �ε���(index)
	 * 		0���� �����ϴ� ���ȣ(index)�� �ο��ȴ�.
	 * 		1�� �����Ѵ�.
	 */

	public static void main(String[] args) {

		// 1.�Ϲݺ���(�� ����)
		int num = 0; // �Ϲݺ����� 0���� �ʱ�ȭ.
		num = 10;
		System.out.println("num = " + num);
		System.out.println("------------------------------");
		// 2.�迭
		int[] arr = null;	// �迭�� null �� 0 ��� ����� 
		arr = new int[5]; // ���� 5���� ���ܳ��� �⺻�� 0 �� �����.
		
		System.out.println(arr[0]);				// 0
		System.out.println(arr[1]);				// 0
		System.out.println(arr[2]);				// 0
		System.out.println(arr[3]);				// 0
		System.out.println(arr[4]);				// 0
		System.out.println("------------------------------");		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		
	}

	
}