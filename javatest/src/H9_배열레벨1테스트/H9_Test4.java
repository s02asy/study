package H9_�迭����1�׽�Ʈ;

import java.util.Random;

public class H9_Test4 {
	public static void main(String[] args) {
		Random ran = new Random();
		int arr[] = {10, 43, 25, 76, 3 , 100, 56};	
		int r1;
		int r2;	
		//����) �迭ũ��� 7 �̰� ���� ���ڰ� ����Ǿ��ִ�. 
		//[����]
		// 1) r1 r2 �� ���� �迭�� �ε����� �������� �Է¹޴´�.(0~6)
		// 2) r1 r2 �� ������ "���� ���" �� ����.
		// 3) r1 �� r2 ���� ũ�� �ε������� ���ιٲ۴�. 
		// 4) r1�� �ε����� ���� r2�� �ε��� �� ������ ���������� �˻��Ѵ�.
		// 5) r1�� ���� r2�� ������ ũ�� count �� ����  ���� ���. 
		
		
		//��) r1 = 1; r2 = 1; ==> "����"
		
		//��) r1 = 1; r2 = 6;  
		//		1) arr[r1]�� ���� 43�̰�,  arr[r2] ���� 100 �̴�. 
		//      2) r1���� r2 ������ ������ 42 ����ū������ 76, 100 �ΰ��̴�. 
		//��) r1 = 4 , r2 = 1; 
		//      1) r1�� r2���ٰ��� ũ�Ƿ� ���� ���� �ٲ۴� . 
		//		2) r1 = 1, r2 = 4;
		int temp;
		int count = 0;
		r1 = ran.nextInt(7);
		r2 = ran.nextInt(7);
		System.out.println("============�迭============");
		System.out.println("{10, 43, 25, 76, 3, 100, 56}");
		System.out.println("r1 : " + r1 + " , " + "r2 : " + r2);
		if(r1 == r2) {
			System.out.println("����");
		}
		if(r1 > r2) {
			temp = r1;
			r1 = r2;
			r2 = temp;
			System.out.println("r1�� r2���� ũ�Ƿ� �ٲ��ش�.");
			System.out.println("r1 : " + r1 + " , " + "r2 : " + r2);
		}
		for(int i = r1; i <= r2; i++) {
			if(arr[r1] < arr[i]) {
				count += 1;
			}
		}
		if(count > 0) {
			System.out.println("r1�� r2�� ���� �� r1���� ū�� �� ? " + count + "��");
		}
	}
}