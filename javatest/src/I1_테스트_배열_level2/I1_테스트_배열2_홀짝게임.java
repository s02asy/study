package I1_�׽�Ʈ_�迭_level2;

import java.util.Random;
import java.util.Scanner;

public class I1_�׽�Ʈ_�迭2_Ȧ¦���� {
	public static void main(String[] args) {
		int arr[] = new int[6];
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		// �迭 Ȧ¦���� 
		// 1) arr �迭�� 1~100������ �������� 6�� �����Ѵ�.
		
		// ��) arr = {7,45,3,6,78,1}
		
		// 2) �迭�� ����  ���ʴ��  ����Ѵ�.
		
		// ��) ù��° :   7  (1)Ȧ , (2)¦
		// ��) �ι�° :   45  (1)Ȧ , (2)¦
		
		// 3) ���õȹ����� Ȧ���� 1  , ¦���� 2 �� �����Ѵ�.
		
		// 4) 6�� �ݺ��ϰ� ���䰹�� ��� 
		
		// [��������] 
		// Ʋ���� ���������� �Ѿ���ʰ�
		// ���������� ��������ϵ��� ���� 
		for(int i = 0; i < 6; i++) {
			arr[i] = ran.nextInt(100) + 1;
		}
		int count = 0;
		String a[] = {"ù��° : ","�ι�° : ","����° : ","�׹�° : ","�ټ���° : ","������° : "};
		for(int i = 0; i < 6;) {
			System.out.println(a[i] + arr[i] + " (1)Ȧ (2)¦");
			int num = scan.nextInt();
			if(num == 1) {
				if(arr[i] % 2 == 1) {
					System.out.println("����");
					count += 1;
				}else {
					System.out.println("����");
					continue;
				}
			}else if(num == 2) {
				if(arr[i] % 2 == 0) {
					System.out.println("����");
					count += 1;
				}else {
					System.out.println("����");
					continue;
				}
			}else {
				System.out.println("�Է¼��ڸ� �ٽ� Ȯ�����ּ���.");
				continue;
			}
			i += 1;
		}
		System.out.println("���䰳�� : " + count + "��");
	}
}