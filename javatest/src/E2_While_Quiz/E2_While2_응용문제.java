package E2_While_Quiz;

public class E2_While2_���빮�� {
	public static void main(String[] args) {
		
		
//����4) 50���� 100���� �ڿ����߿��� 9�� ����� ������ ���
//		# �� : 6 (54,63,72,81,90,99)
		int ���� = 0;
		int count = 0;
		while(���� <= 100) {
			if(���� % 9 == 0 && ���� >= 50) {
				count += 1;
			}
			���� += 1;
		}
		System.out.println(count);
		System.out.println("-----------------------");
		
//����5) 28�� ��� �߿��� ���� ū ���ڸ� ���� ���
//		�� : 980
		���� = 0;
		int �ӽü��� = 0;
		int run = 1;
		while(run == 1) {
			if(�ӽü��� > 1000) {
				System.out.println(����);
				run = 0;
			}
			else {
				���� = �ӽü���;
			}
			�ӽü��� += 28;
		}
		
		System.out.println("-----------------------");
		
		���� = 0;
		int temp = 0;
		while(���� < 1000) {
			if(���� % 28 == 0) {
				temp = ����;
				
			}
			���� += 1;
		}System.out.println(temp);
		
//����6) 8�� ����� ���������� 5�� ���
//		�� : 0,8,16,24,32
		���� = 0;
		count = 1;
		while(count <= 5) {
			if(���� % 8 == 0) {
				System.out.print(���� + " ");
				count += 1;
			}
			���� += 1;
		}
		
	}
}