package H0_array_Level1;

public class H0_array3_���� {
	public static void main(String[] args) {
		// ����1) d �迭�� ���� e �迭�� �ϳ��� �����ϴµ� ������ �Ųٷ� ���� 
		int d[] = { 1,2,3,4,5 };
		int e[] = { 0,0,0,0,0 };
		//��)  ={5,4,3,2,1};
		int lastindex = 4;
		for(int i = 0; i < 5; i++) {
			e[lastindex] = d[i];
			lastindex -= 1;
		}
		for(int i = 0; i < 5; i++) {
			System.out.print(e[i] + " ");
		}
		
		
				
		
	}
}