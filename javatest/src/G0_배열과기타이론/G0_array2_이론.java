package G0_�迭����Ÿ�̷�;

public class G0_array2_�̷� {

	public static void main(String[] args) {

		// 1.�迭 ����(1)
		int[] arr = null;
		arr = new int[3];
		arr[0] = 10;
		arr[2] = 20;
		arr[3] = 30;
		
		for (int i = 0; i < 3; i++) {
			System.out.println(arr[i]);
		}
		
		int[] arr2 = new int[3];
		arr2[0] = 10;
		arr2[1] = 20;
		arr2[2] = 30;

		for (int i = 0; i < 3; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println("-----------------------------");
		// 2.�迭 ����(2) : �����
		int[] temp = { 10, 20, 30 }; // ���� �����ϴ�.

		for (int i = 0; i < 3; i++) {
			System.out.println(temp[i]);
		}

	}

}