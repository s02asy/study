package M1_�׽�Ʈ_�迭���ּ�;

public class M1_�׽�Ʈ_�ּҰ���2 {
	public static void main(String[] args) {
		int arr[] = {10,20,30};
		
		int darr[][] = {
				{10,20,30},
				{20,30,40},
				{30,40,50}
		};
		
		darr[0] = arr;
		darr[1] = arr;
		darr[2] = arr;
		
        arr[1] = 100;

		// ����) �Ʒ� ���������� ������ ������ �����Ͻÿ�.
		/*
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(darr[i][j] + " ");
			}
			System.out.println();
		}
		*/
	}
}