package J2_�׽�Ʈ_�迭_level3;

import java.util.Arrays;
import java.util.Scanner;

public class J2_�׽�Ʈ_�迭3_���ʿ����� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = {0,2,0,3,4,0,0,5,0};	
		// �Ʒ� ��ȣ�� �Է¹ް� ������ ���� 0 �̾ƴѼ��ڸ� �����ÿ�.
		// 1)left 2)right 
		
		// ��) 1) left ==> arr = {2,3,4,5,0,0,0,0,0};
		// ��) 1) right ==> arr = {0,0,0,0,0,2,3,4,5};
		System.out.println("1)left 2)right");
		int num = scan.nextInt();
		if(num == 1) {
			int index = 0;
			for(int i = 0; i < 9; i++) {
				if(arr[i] != 0) {
					arr[index] = arr[i];
					arr[i] = 0;
					index += 1;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		else if(num == 2) {
			int lastindex = 8;
			for(int i = 8; i >= 0; i--) {
				if(arr[i] != 0) {
					arr[lastindex] = arr[i];
					arr[i] = 0;
					lastindex -= 1;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
	}
}