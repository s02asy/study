package K0_�迭��ȭ_�⺻;

import java.util.Arrays;
import java.util.Scanner;

public class K0_2�����迭quiz2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[3][3];
		
		int k = 1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		
		// ���� 1) �ε��� 2���� �Է¹޾� �� ���
		// ��    1) �ε���1 �Է� : 1	�ε���2 �Է� : 2
		//		   �� ��� : 60 
		System.out.println("�ε���1 �Է� : ");
		int index1 = scan.nextInt();
		System.out.println("�ε���2 �Է� : ");
		int index2 = scan.nextInt();
		System.out.println("�� ��� : " + arr[index1][index2]);
		
		// ���� 2) ���� �Է¹޾� �ε��� 2�� ���
		// ��    2) �� �Է� : 60
		//		   �ε���1 ��� : 1	�ε���2 ��� : 2
		System.out.println("�� �Է� : ");
		int data = scan.nextInt();
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] == data) {
					System.out.println("�ε���1 ��� : " + i + " " + "�ε���2 ��� : " + j);
				}
			}
		}
		
		// ���� 3) ���� ū ���� �ε��� 2�� ���
		// ���� 3) 2 2
		int max = arr[0][0];
		index1 = 0;
		index2 = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(max < arr[i][j]) {
					max = arr[i][j];
					index1 = i;
					index2 = j;
				}
			}
		}
		System.out.println(index1 + " " + index2);
		
		// ���� 4) �� 2���� �Է¹޾� �� ��ü
		System.out.println("��1 �Է� : ");
		int data1 = scan.nextInt();
		System.out.println("��2 �Է� : ");
		int data2 = scan.nextInt();
		index1 = -1;
		index2 = -1;
		int index3 = -1;
		int index4 = -1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(data1 == arr[i][j]) {
					index1 = i;
					index2 = j;
				}
				if(data2 == arr[i][j]) {
					index3 = i;
					index4 = j;
				}
			}
		}
		if(index1 != -1 && index2 != -1 && index3 != -1 && index4 != -1) {
			int temp = arr[index1][index2];
			arr[index1][index2] = arr[index3][index4];
			arr[index3][index4] = temp;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}