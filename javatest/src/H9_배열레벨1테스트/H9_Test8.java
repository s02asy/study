package H9_�迭����1�׽�Ʈ;

public class H9_Test8 {
	public static void main(String[] args) {
		
		
		// ���� 1) aa �迭�� ������ ������ ��ĭ�� ���� �ǵڿ� bb��  ���� ���� 
		int aa[] = { 10,20,30,40,50 };
		int bb = 90;
		// ��) aa = {20,30,40,50,90};
		for(int i = 0; i < 5; i++) {
			if(i == 4) {
				aa[i] = bb;
			}
			else {
				aa[i] = aa[i + 1];
			}
		}
		System.out.print("aa[] = { ");
		for(int i = 0; i < 5; i++) {
			System.out.print(aa[i] + " ");
		}
		System.out.print("}");
		System.out.println();
		// ���� 2) cc �� �迭�� �ڷ� �ϳ��� �о�� �� �տ� dd�� ���� ���� 
		// ����� �迭�� �״�� �̱⋚���� �ڷ� �ϳ��� �о� �������� �ڿ��� ���� ���� �־���� �Ѵ�.
		int cc[] = { 10,20,30,40,50 }; 
		int dd = 60;				   
		// ��) cc[] = {60,10,20,30,40};
		for(int i = 4; i >= 0; i--) {
			if(i == 0) {
				cc[i] = dd;
			}
			else {
				cc[i] = cc[i - 1];
			}
		}
		System.out.print("cc[] = { ");
		for(int i = 0; i < 5; i++) {
			System.out.print(cc[i] + " ");
		}
		System.out.print("}");
	}
}