package I0_�迭_level2;


public class I0_�迭2_������幮�� {
	
	/*
	 * # 4�� ����� ����
	 * - arr �迭���� 4�� ����� ��� temp �迭�� ����
	 * - ��! temp �� ���̸� 4�� �����ŭ�� �����Ѵ�. 
	 */

	public static void main(String[] args) {

		int[] arr = {44, 11, 29, 24, 76};
		int[] temp = null;
		int count = 0;
		for(int i = 0; i < 5; i++) {
			if(arr[i] % 4 == 0) {
				count += 1;
			}
		}
		temp = new int[count];
		System.out.println("4�� ����� : " + count + "��");
		int index = 0;
		for(int i = 0; i < 5; i++) {
			if(arr[i] % 4 == 0) {
				temp[index] = arr[i];
				index += 1;
			}
		}
		for(int i = 0; i < count; i++) {
			System.out.print(temp[i] + " ");
		}
	}

}