package E1_While_Quiz;

import java.util.Random;

public class E1_While2_��������� {

	public static void main(String[] args) {
		// ����1) 1~5������ �� ��� ==> 
		//		 1 + 2 + 3 + 4 + 5
		// ���� 1) 15
		int a = 1;
		int b = 0;
		while(a <= 5) {
			b = b + a;
			a++;
		}System.out.println("1~5 �� : " + b);
		System.out.println("-------------------------");
		// ����2) 1~10���� �ݺ��� 3�̸� 7�̻� ���  ==> 
		//       1,2,7,8,9,10
		// ����2) 1, 2, 7, 8, 9, 10
		int c = 1;
		int d = 0;
		while(c <= 10) {
			if(c < 3 || c >= 7) {
				System.out.print(c + " ");
			}
			c++;
		}
		System.out.println();
		System.out.println("-------------------------");
		// ����3) 1~10���� �߿��� 3�̸� 7�̻��� �����  ==>
		//       1 + 2 + 7 + 8 + 9 + 10
		// ����3) 37
		int e = 1;
		int f = 0;
		while(e <= 10) {
			if(e < 3 || e >= 7) {
				f = f + e;
			}
			e++;
		}System.out.println("3�̸� 7�̻� �� : " + f);
		System.out.println("-------------------------");
		// ����4) 1~10���� �߿��� 3�̸� 7�̻��� ���� ��� ==> 
		//		 1,2,7,8,9,10 ==> 6�� 
		// ����4) 6
		int g = 1;
		int count = 0;
		while(g <= 10) {
			if(g < 3 || g >= 7) {
				count++;
			}
			g++;
		}System.out.println("3�̸� 7�̻� ���� ���� : " + count);
		System.out.println("-------------------------");
		// ����5) �������� ���� (1~5) 2�� �����Ѵ�.
		// ���������� ū������ 1�� �����ϸ鼭 ���
		// 1,4 ==> 1,2,3,4
		// 3,1 ==> 1,2,3
		// 5,5 ==> 5
		Random ran = new Random();
		int min = ran.nextInt(5) + 1;
		int max = ran.nextInt(5) + 1;
		System.out.println(min);
		System.out.println(max);
		if(min > max) {
			int temp = max;
			max = min;
			min = temp;
		}		
		System.out.println("-------------------");	
		while(min <= max) {
			System.out.print(min + " ");
			min++;
		}
		System.out.println();
		System.out.println("-------------------");
	}
}
