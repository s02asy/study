package I1_�׽�Ʈ_�迭_level2;
public class I1_�׽�Ʈ_�迭2_����1��ã�� {
	public static void main(String[] args) {
		int arr[] = {1001, 20, 30, 1002, 43, 23, 1003, 45, 1};
		
		// �� �����ʹ� �л���ȣ 1�� ����2 �� �� �Ѽ�Ʈ�̴�. 		
		// ��ȣ�� 1001���ͽ����̰� , ������ 1~100 �����̴�. 
		// ��) 1001 , 20, 30
		
		// �� �����ʹ� 3��Ʈ�� �����͸� ������ �迭�̴�.
		// 1�� ��ȣ ��� (2������ ��)
		int total = 0;
		int max = 0;
		int index = 0;
		for(int i = 0; i < 9; i++) {
			if(i % 3 == 0) {
				total = arr[i + 1] + arr[i + 2];
				if(max < total) {
					max = total;
					index = i;
				}
			}
		}
		System.out.println("1�� ��ȣ : " + arr[index]);
		System.out.println("1�� ���� �� : " + max);
	}
}