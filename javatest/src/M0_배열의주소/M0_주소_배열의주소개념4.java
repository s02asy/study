package M0_�迭���ּ�;

public class M0_�ּ�_�迭���ּҰ���4 {
	public static void main(String[] args) {
		
		int [][] arr = {
				{10,20,30},
				{10,20,30,40,50},
				{10,20,30,40}
		};
		
		//���Ͱ��� �� ���� ũ�Ⱑ �ٸ� 2�����迭�� �ݺ������� �����
		
		int low = arr.length;
		int [][] test = new int[low][];
		int []list = new int[low];
		for(int i = 0; i < low; i++) {
			list[i] = arr[i].length;
		}
		for(int i = 0; i < low; i++) {
			int[] temp = new int[list[i]];
			for(int j =0; j < list[i]; j++) {
				temp[j] = arr[i][j];
			}
			test[i] = temp;
		}
		
		for(int i = 0; i < test.length; i++) {
			for(int j = 0; j < test[i].length; j++) {
				System.out.print(test[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
}