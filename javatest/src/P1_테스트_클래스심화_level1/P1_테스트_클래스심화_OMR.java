package P1_�׽�Ʈ_Ŭ������ȭ_level1;

import java.util.Random;

class OMR{
	int number;
	int [] ����� = new int[10];
	int score;
	String studentName;
	int rank;
}

public class P1_�׽�Ʈ_Ŭ������ȭ_OMR {
	public static void main(String[] args) {		
		Random ran = new Random();
		// omr ����
		int[] �������� = {1,4,2,5,5,3,2,1,3,1};
		// �л� 4��
		String[] nameList = {"�̸���" ,"��ö��" , "��ſ�" , "������"};	
	
		// �л���ȣ 1000������ �����Ѵ�. 
		int number = 1000; 
		//����)
		// 1) �л�4���� �����ؼ� �� ������(�̸� ,  ��ȣ)�� ���� 
		// 2) �������� omr ����� �ۼ�(1~5)
		// 3) ���� �Է� (1������ 10��)
		// 4) �հ� �� �̸� ��� (60���̻��հ�)
		// 5) ��ŷ���� (1~4��)
		// [����] ���� ��� 100, 30 , 30, 10  �̷��� �����ڰ������� 
		//       ��ŷ�� 1,2,2,4 ���ȴ�. 
		int size = nameList.length;
		OMR []omr = new OMR[size];
		for(int i = 0; i < size; i++) {
			omr[i] = new OMR();
			omr[i].number = number;
			omr[i].studentName = nameList[i];
			number += 1;
			for(int j = 0; j < omr[i].�����.length; j++) {
				int r = ran.nextInt(5);
				omr[i].�����[j] = r + 1;
				if(��������[j] == omr[i].�����[j]) {
					omr[i].score += 10;
				}
			}
		}
		for(int i = 0; i < size; i++) {
			System.out.printf(omr[i].number + " ");
			System.out.printf(omr[i].studentName + " ");
			System.out.printf(omr[i].score + " ");
			System.out.println();
		}
		boolean check = false;
		System.out.println("�հ��� ���");
		for(int i = 0; i < size; i++) {
			if(omr[i].score >= 60) {
				check = true;
				System.out.println(omr[i].studentName);
			}
		}
		if(check == false) {
			System.out.println("����");
		}
		for(int i = 0; i < size; i++) {
			int rank = 1;
			for(int j = 0; j < size; j++) {
				if(i == j) {
					continue;
				}
				if(omr[i].score < omr[j].score)
					rank += 1;
			}
			omr[i].rank = rank;
		}
		System.out.println("���");
		for(int i = 0; i < size; i++) {
			System.out.print(omr[i].rank + " ");
		}
	}
}