package G1_array_�⺻;

public class G1_array2_�⺻���� {

	public static void main(String[] args) {

		int[] arr = {10,20,30,40,50};

		// ����1) 4�� ����� ���
		// ����1) 20 40
		System.out.println("����1");
		for(int i = 0; i < 5; i++) {
			if(arr[i] % 4 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
		// ����2) 4�� ����� �� ���
		// ����2) 60
		System.out.println("����2");
		int total = 0;
		for(int i = 0; i < 5; i++) {
			if(arr[i] % 4 == 0) {
				total = total + arr[i];
			}
		}
		System.out.println("4�� ��� �� : " + total);
		// ����3) 4�� ����� ���� ���
		// ����3) 2
		System.out.println("����3");
		int count = 0;
		for(int i = 0; i < 5; i++) {
			if(arr[i] % 4 == 0) {
				count += 1;
			}
		}
		System.out.println("4�� ��� ���� : " + count);
	}

}