package L2_������Ʈ_�迭��ȭ_level2;

import java.util.Arrays;
import java.util.Random;

public class L2_������Ʈ_�迭��ȭ2_����1��Ʈ {
	/*
	 * # ���� 1��Ʈ
	 * 1. lottoSet �迭�� 5 * 7 ������ �迭�̴�. 
	 * 2. ����1���� 7���̰� , �� 5���� ������ ������� �Ѵ�.  
	 * 3. ���� 1���� ������ 1�Ǵ� 7�� ������ �����Ѵ�. 
	 * 4. ���� 1���� 7�� �������� 3���̻��̸� "��÷" �̰� �� �̸��� "��" �̴�.
	 * 5. 5�� �����߿� 1���� ��÷�̰� 4���� ���� ������ �������� �����غ���.
	 * 
	 * ��) �Ʒ��� ���� ���ٸ� "��÷" �̰� ������ 4���� "��"�̴�.
	 * 1177117 (��)
	 * 1117771 (��÷)
	 * 7171117 (��)
	 * 7711771 (��)
	 * 7171717 (��)
	 * 
	 */

	public static void main(String[] args) {
		Random ran = new Random();
		int[][] lottoSet = new int[5][7];
		while(true) {
			int count = 0;
			for(int i = 0; i < lottoSet.length; i++) {
				for(int j = 0; j < lottoSet[i].length; j++) {
					int r = ran.nextInt(2);
					if(r == 0) {
						lottoSet[i][j] = 1;
					}else if(r == 1) {
						lottoSet[i][j] = 7;
					}
				}
			}
			for(int i = 0; i < lottoSet.length; i++) {
				for(int j = 0; j < lottoSet[i].length - 2; j++) {
					if(lottoSet[i][j] == 7 && lottoSet[i][j + 1] == 7 && lottoSet[i][j + 2] == 7) {
						count += 1;
					}
				}
			}
			if(count == 1) {
				for(int i = 0; i < lottoSet.length; i++) {
					for(int j = 0; j < lottoSet[i].length; j++) {
						System.out.print(lottoSet[i][j] + " ");
					}
					int count2 = 0;
					for(int j = 0; j < lottoSet[i].length - 2; j++) {
						if(lottoSet[i][j] == 7 && lottoSet[i][j + 1] == 7 && lottoSet[i][j + 2] == 7) {
							count2 += 1;
						}
					}
					if(count2 == 1) {
						System.out.print("��÷");
					}else {
						System.out.print("��");
					}
					System.out.println();
				}
				break;
			}
		}
	}
}