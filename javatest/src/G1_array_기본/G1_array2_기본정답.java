package G1_array_�⺻;

public class G1_array2_�⺻���� {

	public static void main(String[] args) {

		int[] arr = {10,20,30,40,50};

		// ����1) 4�� ����� ���
		// ����1) 20 40
		System.out.println(">>>����1");
		for (int i = 0; i < 5; i++) {
			if (arr[i] % 4 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();

		// ����2) 4�� ����� �� ���
		// ����2) 60
		System.out.println(">>>����2");
		int tot = 0;
		for (int i = 0; i < 5; i++) {
			if (arr[i] % 4 == 0) {
				tot = tot + arr[i];
			}
		}
		System.out.println("tot = " + tot);

		// ����3) 4�� ����� ���� ���
		// ����) 2
		System.out.println(">>>����3");
		int cnt = 0;
		for (int i = 0; i < 5; i++) {
			if (arr[i] % 4 == 0) {
				cnt = cnt + 1;
			}
		}
		System.out.println("cnt = " + cnt);

	}

}