package O0_Ŭ����;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Ex04 {
	int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
	int[] scores = new int[5];
}

public class O0_04_Ŭ��������2 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		// ����1) scores�迭�� 1~100�� ������ ������ 5�� ����
		// �� 1) 87, 11, 92, 14, 47
		Ex04 e = new Ex04();
//		for(int i = 0; i < e.scores.length;) {
//			int r = ran.nextInt(100) + 1;
//			boolean check = false;
//			for(int j = 0; j < e.scores.length; j++) {
//				if(r == e.scores[j]) {
//					check = true;
//					break;
//				}
//			}
//			if(check == false) {
//				e.scores[i] = r;
//				i += 1;
//			}
//		}
		for(int i = 0; i < e.scores.length; i++) {
			e.scores[i] = ran.nextInt(100) + 1;
		}
		System.out.println(Arrays.toString(e.scores));
		// ����2) �������� ������ ��� ���
		// �� 2) ����(251) ���(50.2)
		int total = 0;
		for(int i = 0; i < e.scores.length; i++) {
			total += e.scores[i];
		}
		System.out.println(total);
		double avg = (double)total / e.scores.length;
		System.out.println(avg);
		// ����3) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		// �� 3) 2��
		int cnt = 0;
		for(int i = 0 ; i < e.scores.length; i++) {
			if(e.scores[i] >= 60) {
				cnt += 1;
			}
		}
		System.out.println(cnt + "��");
		// ����4) �ε����� �Է¹޾� ���� ���
		// ����4) �ε��� �Է� : 1 ���� : 11��
		System.out.println("�ε��� �Է�(0~4) : ");
		int index = scan.nextInt();
		System.out.println(e.scores[index]);
		// ����5) ������ �Է¹޾� �ε��� ���
		// ����5) ���� �Է� : 11 �ε��� : 1
		System.out.println("���� �Է� : ");
		int score = scan.nextInt();
		for(int i = 0; i < e.scores.length; i++) {
			if(score == e.scores[i]) {
				System.out.println(i);
			}
		}
		// ����6) �й��� �Է¹޾� ���� ���
		// ����6) �й� �Է� : 1003 ���� : 45��
		System.out.println("�й� �Է� : ");
		int hakbun = scan.nextInt();
		for(int i = 0; i < e.hakbuns.length; i++) {
			if(hakbun == e.hakbuns[i]) {
				System.out.println(e.scores[i]);
			}
		}
		// ����7) �й��� �Է¹޾� ���� ���
		// ��, �����й� �Է� �� ����ó��
		// �� 7)
		// �й� �Է� : 1002 ���� : 11��
		// �й� �Է� : 1000 �ش��й��� �������� �ʽ��ϴ�.
		System.out.println("�й� �Է� : ");
		hakbun = scan.nextInt();
		if(hakbun >= 1001 && hakbun <= 1005) {
			for(int i = 0; i < e.hakbuns.length; i++) {
				if(hakbun == e.hakbuns[i]) {
					System.out.println("���� : " + e.scores[i] + "��");
				}
			}
		}else {
			System.out.println("�ش��й��� �������� �ʽ��ϴ�.");
		}
		// ����8) 1���л��� �й��� ���� ���
		// ����8) 1004��(98��)
		int max = 0;
		int id = 0;
		for(int i = 0; i < e.scores.length; i++) {
			if(max < e.scores[i]) {
				max = e.scores[i];
				id = i;
			}
		}
		System.out.println(e.hakbuns[id] + "��" + "(" + e.scores[id] + "��)");
		scan.close();
	}
}