package H9_�迭����1�׽�Ʈ;

import java.util.Random;

public class H9_Test7 {
	public static void main(String[] args) {
		 Random ran = new Random();
		//����1)  a �迭�ȿ� 1 �Ǵ� 7�� �������� ������ ���. 
		int a [] = new int[7];	
		//��) 1,7,7,1,1,7,7
		for(int i = 0; i < 7; i++) {
			int r = ran.nextInt(2);
			if(r == 0) {
				a[i] = 1;
			}
			else {
				a[i] = 7;
			}
		}
		for(int i = 0; i < 7; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("---------------------------");
		
		
		//����2) b �迭�� �Ʒ��Ͱ��� �簢������������ 
		// ��Ʈ 3ĭ���� �ٹٲ� 
		int b [] = {1,2,3,4,5,6,7,8,9};	
		// 1 2 3
		// 4 5 6
		// 7 8 9
		int index = 1;
		for(int i = 1; i <= 9; i++) {
			System.out.print(b[i - 1] + " ");
			if(i % 3 == 0) {
				System.out.println();
			}
		}
		
		System.out.println("---------------------------");
		
		for(int i = 0; i < 9; i++) {
			System.out.print(b[i] + " ");
			if(index % 3 == 0) {
				System.out.println();
			}
			index += 1;
		}
		
	}
}