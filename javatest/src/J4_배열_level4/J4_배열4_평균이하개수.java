package J4_�迭_level4;

import java.util.Arrays;

public class J4_�迭4_������ϰ��� {
	public static void main(String[] args) {
		 // ����) �迭�� ��ü���� ��պ��� ���� ���� ����� ��� 
		
		 int[] data1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		 double avg1;
		 int total = 0;
		 int count = 0;
		 //�ڷ��� ���� 55�̸�, �ڷ��� ������ 10���Դϴ�. 
		 //���� ����� 55 / 10 = 5.5�Դϴ�.
		 //�־��� �迭���� 5.5���� ���� ���ڴ� �� 5���Դϴ�.
		 for(int i = 0; i < 10; i++) {
			 total += data1[i];
		 }
		 avg1 = total / 10.0;
		 System.out.println(avg1);
		 for(int i = 0; i < 10; i++) {
			 if(avg1 > data1[i]) {
				 count += 1;
				 System.out.print(data1[i] + " ");
			 }
		 }
		 System.out.println();
		 System.out.println(count);
		 
		 int[] data2 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 10};
		 double avg2;
		 int total2 = 0;
		 int count2 = 0;
		 //�ڷ��� ���� 19�̸�, �ڷ��� ������ 10���Դϴ�. 
		 //���� ����� 19 / 10 = 1.9�Դϴ�.
		 //�־��� �迭���� 1.9���� ���� ���ڴ� �� 9���Դϴ�.
		 
		 for(int i = 0; i < 10; i++) {
			 total2 += data2[i];
		 }
		 avg2 = total2 / 10.0;
		 System.out.println(avg2);
		 for(int i = 0; i < 10; i++) {
			 if(avg2 > data2[i]) {
				 count2 += 1;
				 System.out.print(data2[i] + " ");
			 }
		 }
		 System.out.println();
		 System.out.println(count2);
	}
}       