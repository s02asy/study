package O3_�ż���_level1;

import java.util.Random;
import java.util.Scanner;

class Test3Result {
	void setRandomValuesinArray(int [] scores) {
		Random ran = new Random();
		for(int i = 0; i < scores.length; i++) {
			int r = ran.nextInt(100) + 1;
			scores[i] = r;
		}
		printScores(scores);
	}
	void printScores(int [] scores) {
		for(int i = 0; i <scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
		System.out.println();
	}
	void printNuber(int[] nums) {
		for(int i = 0; i <nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}
	void printSumAndAverage(int [] scores) {
		int total = 0;
		for(int i = 0; i <scores.length; i++) {
			total += scores[i];
		}
										  // ����ȯ
		System.out.println(total + " : " + (double)total/scores.length);
	}
	void printWinner(int [] scores) {
		int count = 0;
		for(int i = 0; i <scores.length; i++) {
			if(scores[i] >= 60) {
				count += 1;
			}
		}
		System.out.println(count);
	}
	void printScore1(int [] scores) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�ε����� �Է��ϼ��� : ");
		int index = scan.nextInt();
		System.out.println(scores[index]);
		
	}
	void printScore2(int [] scores) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �Է��ϼ��� : ");
		int value = scan.nextInt();
		for(int i = 0; i < scores.length; i++) {
			if(value == scores[i]) {
				System.out.println(i);
			}
		}	
	}
	void printScore3(int [] hakbuns, int [] scores) {
		Scanner scan = new Scanner(System.in);
		printNuber(hakbuns);
		System.out.println("�й��� �Է��ϼ��� : ");
		int value = scan.nextInt();
		boolean check = false;
		for(int i = 0; i < hakbuns.length; i++) {
			if(value == hakbuns[i]) {
				System.out.println(scores[i]);
				check = true;
			}
		}	
		if(check == false) {
			System.out.println("�����й��Դϴ�.");
		}
	}
	void printNumberOne(int [] hakbuns, int [] scores) {
		int max = scores[0];
		int maxindex = 0;
		
		for(int i = 0; i < scores.length; i++) {
			if(max < scores[i]) {
				max = scores[i];
				maxindex = scores[i];
			}
		}
		System.out.println(max + " " + hakbuns[maxindex]);
	}
}

public class O3_�޼���1_03_��������3 {
	public static void main(String[] args) {
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = new int[5];
		Test3Result test = new Test3Result();
		// ����1) scores�迭�� 1~100�� ������ ���� ������ 5�� ����
		// �� 1) 87, 11, 92, 14, 47
		test.setRandomValuesinArray(scores);
		// ����2) �������� ������ ��� ���
		// �� 2) ����(251) ���(50.2)
		test.printSumAndAverage(scores);	
		// ����3) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		test.printWinner(scores);	
		// ����4) �ε����� �Է¹޾� ���� ���
		// ����4) �ε��� �Է� : 1 ���� : 11��
		test.printScore1(scores);
		// ����5) ������ �Է¹޾� �ε��� ���
		// ����5) ���� �Է� : 11 �ε��� : 1
		test.printScore2(scores);
		// ����6) �й��� �Է¹޾� ���� ��� // ��, �����й� �Է� �� ����ó��
		// ����6) �й� �Է� : 1003 ���� : 45��
		test.printScore3(hakbuns, scores);		
		// ����7) 1���л��� �й��� ���� ���
		// ����7) 1004��(98��)
		test.printNumberOne(hakbuns, scores);		
	}
}