package E4_For;

import javax.swing.SortingFocusTraversalPolicy;

public class E4_for3_��������{

	public static void main(String[] args) {
		// for�� ����ؼ� Ǯ����� 
		//����4) 50���� 100���� �ڿ����߿��� 9�� ����� ������ ���  # �� : 6 (54,63,72,81,90,99) 
		//����5) 28�� ��� �߿��� ���� ū ���ڸ� ���� ��� ==> �� : 980 
		//����6) 8�� ����� ���������� 4�� ��� ==> �� : 4,8,16,24,32
		// 10 �� 8 ~ 10�� 15�� 
		int num = 9;
		int count = 0;
		for(int i = 0; i == 0; ) {
			if(num >= 50 && num <= 100) {
				System.out.print(num + " ");
				count += 1;
			}
			if(num > 100) {
				i = 1;
			}
			num += 9;
		}
		System.out.println();
		System.out.println("���� : " + count);
		System.out.println("---------------------");
		num = 28;
		int �ӽ� = num;
		for(int i = 0; i==0;) {
			if(num < 1000) {
				�ӽ� = num;
			}
			if(num >= 1000) {
				break;
			}
			num = num + 28;
		}
		System.out.println(�ӽ�);
		System.out.println("---------------------");
		
		num = 8;
		count = 0;
		for(int i = 0; i == 0;) {
			System.out.print(num + " ");
			count += 1;
			num += 8;
			if(count == 4) {
				break;
			}
		}
		System.out.println();
		System.out.println("---------------------");
		
		
	}

}