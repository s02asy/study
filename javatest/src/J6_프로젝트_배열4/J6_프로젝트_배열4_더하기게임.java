package J6_������Ʈ_�迭4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class J6_������Ʈ_�迭4_���ϱ���� {
	
	// ���ϱ� ����
	
	//1) 1~10 ������ ���ڸ� �������� 7�������ش�. (�ߺ�����)
	//2) �׾ȿ��� 3���� �ε����� �����ְ����ش�. (�ߺ�����)
	//3) ������ ����3���� ��������  �ϳ� �����ϴµ�  ,
     //   ���� �� �ε���3���� ���� ���� ���õ� ���ڶ� ������ ����. 
	//   ������ ������ �ϼ��ִ�. 
	//4) �ݵ�� ������ ����� ���� �־���Ѵ�.
	
	// ��) ����  = {1,5,8,6,4,2,9};
	// ��) ���þ� = 13
	
	// ����) 0,2,4  ==>1 + 8 + 4
	// ����) 5,5,6 ==> ���� ������ �ߺ��ε�������
	
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int arr[] = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		for(int i = 0; i < 100; i++) {
			int r1 = ran.nextInt(10);
			int r2 = ran.nextInt(10);
			int temp = arr[r1];
			arr[r1] = arr[r2];
			arr[r2] = temp;
		}
		
		int num7[] = new int[7];
		
		for(int i = 0; i < 7; i++) {
			num7[i] = arr[i];
		}
		System.out.println("���� = " + Arrays.toString(num7));
		int sum = 0;
		boolean check2[] = new boolean[7];
		for(int i = 0; i < 3;) {
			int r = ran.nextInt(7);
			if(check2[r] == false) {
				check2[r] = true;
				sum += num7[r];
				i++;
			}
		}
		System.out.println("���þ� = " + sum);
		while(true) {
			int total = 0;
			boolean check[] = new boolean[7];
			for(int i = 0; i < 3;) {
				System.out.println("������ �ε��� 3���� ��� ���� ���� ���þ �ϼ��Ͻÿ�.(" + (i + 1) + "��°)");
				int index = scan.nextInt();
				if(index < 0 || index > 6) {
					System.out.println("�ε��� ���� �ʰ�.");
					continue;
				}
				if(check[index] == false) {
					System.out.println(num7[index] + "�� ������ϴ�.");
					check[index] = true;
					total += num7[index];
					System.out.println("���� �� : " + total);
					i++;
				}
				else {
					System.out.println("�ߺ��� �ε����� �����ϼ̽��ϴ�.");
				}
			}
			if(sum == total) {
				System.out.println("���� �Դϴ�.");
				break;
			}else {
				System.out.println("���� �Դϴ�.");
			}
		}
	}
}