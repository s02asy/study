package E3_While_Quiz;
import java.util.Random;

/*
 * # �����л�
 * 1. 10ȸ �ݺ��� �Ѵ�.
 * 2. 1~100 ������ ���� ���ڸ� ��� �Ѵ�.(�л��� ����)
 * 3. ������ 60�� �̻��̸� �հݻ��̴�.
 * ---------------------------------------
 * . ������(10��)�� ������ ����� ����Ѵ�.
 * . �հ��� ���� ����Ѵ�.
 * . 1�� �л��� ��ȣ�� ������ ����Ѵ�.
 */
public class E3_While1_�����л����� {

	public static void main(String[] args) {
		Random ran= new Random();		
		//9:21 ~ 9:30
		// ����ǥ ���� 
		int total = 0;
		int count = 0;
		int max = 0;
		int maxNumber = 0;
		for(int i = 1; i <= 10; i++) {
			int score = ran.nextInt(100) + 1;
			System.out.println("��ȣ : " + i + " ���� : " + score);
			total = total + score;
			
			if(score >= 60) {
				count += 1;
			}
			if(max < score) {
				max = score;
				maxNumber= i;
			}
		}
		System.out.println("���� : " + total );
		System.out.println("��� : " + total / 10.0);
		System.out.println("�հݻ��� : " + count);
		System.out.println("�ϵ� ��ȣ : " + maxNumber);
		System.out.println("�ϵ� ���� : " + max);		
	}
}