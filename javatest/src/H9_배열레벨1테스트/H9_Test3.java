package H9_�迭����1�׽�Ʈ;

public class H9_Test3 {
	public static void main(String[] args) {
	
		// �� ǰ������ ������ڵ���  ����� �Ѵ�. 
		
		// ��������� ���幫�Դ� 600 �̰�  ���� ������ �ʰ� �̸� ����  10% ���  ������ ��������̴�.
		// ����ڸ� ���������? 
		int arr[] = {653, 670, 533, 541, 660};
		Double box = 600.0;
		int count = 0;
		for(int i = 0; i < 5; i++) {
			if(box * 0.9 <= arr[i] && box * 1.1 >= arr[i]) {
				count += 1;
			}
		}
		System.out.println(count + "����");
	}
}