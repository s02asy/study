package H9_�迭����1�׽�Ʈ;

public class H9_Test8���� {
	public static void main(String[] args) {
		// ä�ÿ���
		// ���� 1) aa �迭�� ������ ������ ��ĭ�� ���� �ǵڿ� bb��  ���� ���� 
		int aa[] = { 10,20,30,40,50 };
		int bb = 90;
		// ��) aa = {20,30,40,50,90};
		
		for(int i = 0; i < 4; i++) {
			aa[i] = aa[i + 1];
		}
		aa[4] = bb;
		
		for(int i = 0; i < 5; i++) {
			System.out.print(aa[i] + " ");
		}
		System.out.println();
		System.out.println("-----------------------");
		// ���� 2) cc �� �迭�� �ڷ� �ϳ��� �о�� �� �տ� dd�� ���� ���� 
		int cc[] = { 10,20,30,40,50 };
		int dd = 60;
		// ��) cc[] = {60,10,20,30,40};
		
		/*
		for(int i = 1; i < 5; i++) {
			cc[i] = cc[i-1];
		}
		*/
		int lastindex = 4;
		for(int i = 0; i < 4; i++){
			cc[lastindex] = cc[lastindex-1];
			lastindex -= 1;
		}
		
		cc[0] = dd;
		
		for(int i = 0; i < 5; i++) {
			System.out.print(cc[i] + " ");
		}
		System.out.println();
	}
}