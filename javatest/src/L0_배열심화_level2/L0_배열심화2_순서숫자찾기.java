package L0_�迭��ȭ_level2;

public class L0_�迭��ȭ2_��������ã�� {
	public static void main(String[] args) {		
	int arr[] = {1,3,3,6,5,6,1,8,9};
		
		int input1[] = {6,1,8};
		int input2[] = {6,3};
		
		// input �� �迭���� ������   arr�迭�� ����� ��ġ�ϰ�,
		//  �׼����� ��ġ�ϸ�  true , �ƴϸ� false ��� 
		
		//��) input1�� ������  6,1,8  �̰� arr ��  index 5~7(6,1,8) �� ���� ������ ��ġ�Ѵ�.
		//	  true
		boolean check = false;
		for(int i = 0; i < arr.length - input1.length + 1; i++) {
			int cnt = 0;
			for(int j = 0; j < input1.length; j++) {
				if(arr[i + j] == input1[j]) {
					cnt += 1;
				}
			}
			if(cnt == input1.length) {
				check = true;
			}
		}
		System.out.println(check);
		//��) input2�� ������ arr �迭�� �ִ°���� ��ġ������ , 
		//  input2 ������ 6,3 �̰�  , arr �� ���� 3,6 ���� ������ �ٸ���.
		//   false
	
	}
}