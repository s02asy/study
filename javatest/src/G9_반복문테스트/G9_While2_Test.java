package G9_�ݺ����׽�Ʈ;

import java.util.Random;

public class G9_While2_Test {
	public static void main(String[] args) {
		Random ran = new Random();

		//����1) ���ѹݺ����� ����ؼ� 
		//       �������� 1~10�� ����ϴٰ� ������ 100 �̻��̵Ǹ� ����.
		int total = 0;
		boolean run = true;
		while(run) {
			int r = ran.nextInt(10) + 1;
			System.out.print(r + " ");
			total = total + r;
			if(total >= 100) {
				System.out.println("total : " + total);
				run = false;
			}
		}
		//����2) ���ѹݺ����� ����ؼ� �������� 1~10�� ����� ����ϴ�.
		//  "¦��" �� 5�������� ����.
		int count = 0;
		for(int i = 0; i == 0;) {
			int r = ran.nextInt(10) + 1;
			System.out.println(r);
			if(r % 2 == 0) {
				count += 1;
				System.out.println("¦�� : " + r);
			}
			if(count == 5) {
				break;
			}
		}
	} 
}