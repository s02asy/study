package J5_�׽�Ʈ_�迭_level4;

public class J5_�׽�Ʈ_�迭4_�迭��2 {

	public static void main(String[] args) {
		
		int arr[] = {10, 20, 30, 40};		
		int input[] = {30, 40, 1, 10, 2};
		
		int b[] = {-1, -1, -1, -1, -1};
		
		// 1) arr �迭�ȿ� input �迭 �� �� ���� ���������� 
		// 2) b�迭�ȿ� input ���� �ε����� b�� �����ڸ��� �����ҷ��� �Ѵ�. 
		// ����) ���࿡ input ���ڰ� arr �� ������ �ε��� ��� -1 ���� 
	
		// ��)  input[] ==> { 30, 40, 1, 10, 2 }
		//   1) 30 �� arr[2] �̹Ƿ� 2���� 
		//   2) 40 �� arr[3] �̹Ƿ� 3����
		//   3) 1 �� arr�� �����Ƿ� -1 ����
		//   4) 10 �� arr[0] �̹Ƿ� 0 ����
		//   5) 2�� arr�� �����Ƿ� -1  ���� 
		
		// [����] �����ڸ��� ���� 
		// b = { 2, 3, -1, 0, -1}
		for(int i = 0; i < 5; i++) {
			boolean check = false;
			for(int j = 0; j < 4; j++) {
				if(arr[j] == input[i]) {
					b[i] = j;
					check = true;
				}
			}
			if(check == false) {
				b[i] = -1;
			}
		}
		for(int i = 0; i < 5; i++) {
			System.out.print(b[i] + " ");
		}
	}
}