package G1_array_�⺻;

public class G1_array1_�⺻���� {

	public static void main(String[] args) {

		int[] arr = new int[5];

		// ����1) 10���� 50���� arr �迭�� ����
		// ����1) 10 20 30 40 50
		System.out.println("����1");
		for(int i = 0; i < 5; i++) {
			arr[i] = (i + 1) * 10;
		}
		for(int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		// ����2) ��ü �� ���
		// ����2) 150
		System.out.println("����2");
		int total = 0;
		for(int i = 0; i < 5; i++) {
			total = total + arr[i];
		}
		System.out.println("�� : " + total);
	}

}