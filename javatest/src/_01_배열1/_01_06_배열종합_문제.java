package _01_�迭1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _01_06_�迭����_���� {
	public static void main(String[] args) {
		int arr[] = new int[5];
		int count = 0;
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		while(true) {
			System.out.println(Arrays.toString(arr));
			System.out.println("[1]�߰� [2]���� [3]���� [4]���� [0]����");
			int sel = scan.nextInt();
			if(sel == 1) {
				int r = ran.nextInt(100) + 1;
				arr[count] = r;
				count += 1;
			}else if(sel == 2) {
				System.out.println("[����]�ε��� �Է� : ");
				int num = scan.nextInt();
				if(num < 0 || num >= arr.length) {
					System.out.println("���� �ʰ�");
					continue;
				}
				if(arr[num] != 0) {
					for(int i = num; i < arr.length - 1; i++) {
						arr[i] = arr[i + 1];
					}
					count -= 1;
					arr[count] = 0;
				}else {
					System.out.println("������ ���� �����ϴ�.");
				}
			}else if(sel == 3) {
				for(int i = 0; i < arr.length; i++) {
					for(int j = 0; j < arr.length; j++) {
						if(arr[i] < arr[j] && arr[i] != 0 && arr[j] != 0) {
							int temp = arr[i];
							arr[i] = arr[j];
							arr[j] = temp;
						}
					}
				}
			}else if(sel == 4) {
				System.out.println("[����]�ε��� �Է� : ");
				int num = scan.nextInt();
				if(num < 0 || num >= arr.length) {
					System.out.println("���� �ʰ�");
					continue;
				}
				if(arr[num] != 0) {
					System.out.println("[����]�� �Է�(1 ~ 100) : ");
					int value = scan.nextInt();
					if(value < 1 || value > 100) {
						System.out.println("��� �� �ʰ�");
						continue;
					}else {
						arr[num] = value;
					}
				}else {
					System.out.println("������ ���� �����ϴ�.");
				}
			}else if(sel == 0) {
				System.out.println("���α׷� ����");
				break;
			}
		}
	}
}