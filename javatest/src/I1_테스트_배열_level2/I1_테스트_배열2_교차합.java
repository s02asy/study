package I1_�׽�Ʈ_�迭_level2;
public class I1_�׽�Ʈ_�迭2_������ {
	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {1,2,3,4,5};
		int b[] = new int[5];
		
		//�迭�� 5���ݺ��Ѵ�. 
		//arr1�� �տ������� �����ϰ�
		//arr2�� �Ųٷ� �����ؼ� 
		//b�� �� �� �� ���� ������ ��� 
		
		// ��) b[0] = arr1[0] + arr2[4] 
		// ��) b[1] = arr1[1] + arr2[3] 
		int lastindex = 4;
		for(int i = 0; i < 5; i++) {
			b[i] = arr1[i] + arr2[lastindex];
			lastindex -= 1;
		}
		for(int i = 0; i < 5; i++) {
			System.out.print(b[i] + " ");
		}
	}
}