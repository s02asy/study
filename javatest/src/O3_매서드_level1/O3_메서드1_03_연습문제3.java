package O3_�ż���_level1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Test3 {
	void SetRandomScores(int[] scores) {
		Random ran = new Random();
		for(int i = 0; i < scores.length; i++) {
			int r = ran.nextInt(100) + 1;
			scores[i] = r;
		}
		System.out.println(Arrays.toString(scores));
	}
	void printTotalAndAverage(int[] scores) {
		int total = 0;
		for(int i = 0; i < scores.length; i++) {
			total += scores[i];
		}
		System.out.println("���� " + total + " ��� " + (double)total / scores.length);
	}
	void printWinnerAndCount(int[] scores) {
		int cnt = 0;
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] >= 60) {
				cnt += 1;
			}
		}
		System.out.println("�հݻ� �� : " + cnt + "��");
	}
	void printIndexAndScores(int[] scores) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�ε��� �Է� : ");
		int index = scan.nextInt();
		System.out.println("���� : " + scores[index]);
	}
	void printScoreAndIndex(int[] scores) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int score = scan.nextInt();
		for(int i = 0; i < scores.length; i++) {
			if(score == scores[i]) {
				System.out.println("�ε��� : " + i);
			}
		}
	}
	void printHakbunAndScore(int[] scores, int[] hakbuns) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�й� �Է� : ");
		int hakbun = scan.nextInt();
		for(int i = 0; i < hakbuns.length; i++) {
			if(hakbun == hakbuns[i]) {
				System.out.println("���� : " + scores[i]);
			}
		}
	}
	void printHakbunAndScore2(int[] scores, int[] hakbuns) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�й� �Է� : ");
		int hakbun = scan.nextInt();
		boolean check = false;
		for(int i = 0; i < hakbuns.length; i++) {
			if(hakbun == hakbuns[i]) {
				check = true;
				System.out.println("���� : " + scores[i]);
			}
		}
		if(check == false) {
			System.out.println(hakbun + " �ش��й��� �������� �ʽ��ϴ�.");
		}
	}
	void printRankNumber1(int[] scores, int[] hakbuns) {
		int max = 0;
		int id = 0;
		for(int i = 0; i < scores.length; i++) {
			if(max < scores[i]) {
				max = scores[i];
				id = i;
			}
		}
		System.out.println("�й� : " + hakbuns[id] + " ���� : " + max);
	}

}

public class O3_�޼���1_03_��������3 {
	public static void main(String[] args) {
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = new int[5];
		Test3 t3 = new Test3();
		// ����1) scores�迭�� 1~100�� ������ ���� ������ 5�� ����
		// �� 1) 87, 11, 92, 14, 47
		t3.SetRandomScores(scores);
		// ����2) �������� ������ ��� ���
		// �� 2) ����(251) ���(50.2)
		t3.printTotalAndAverage(scores);
		// ����3) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		// �� 3) 2��
		t3.printWinnerAndCount(scores);
		// ����4) �ε����� �Է¹޾� ���� ���
		// ����4) �ε��� �Է� : 1 ���� : 11��
		t3.printIndexAndScores(scores);
		// ����5) ������ �Է¹޾� �ε��� ���
		// ����5) ���� �Է� : 11 �ε��� : 1
		t3.printScoreAndIndex(scores);
		// ����6) �й��� �Է¹޾� ���� ���
		// ����6) �й� �Է� : 1003 ���� : 45��
		t3.printHakbunAndScore(scores, hakbuns);
		// ����7) �й��� �Է¹޾� ���� ���
		// ��, �����й� �Է� �� ����ó��
		// �� 7)
		// �й� �Է� : 1002 ���� : 11��
		// �й� �Է� : 1000 �ش��й��� �������� �ʽ��ϴ�.
		t3.printHakbunAndScore2(scores, hakbuns);
		// ����8) 1���л��� �й��� ���� ���
		// ����8) 1004��(98��)
		t3.printRankNumber1(scores, hakbuns);
	}
}
