package J2_�׽�Ʈ_�迭_level3;

import java.util.Arrays;
import java.util.Scanner;

public class J2_�׽�Ʈ_�迭3_�迭�ߺ����� {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int data[] = {5,5,6,8,2,6};
		int b [] = {0,0,0,0,0,0};
	// ���� �Է¹ް� ���� 
	// ����) ���࿡ �������� ������ ���� ���� �� b �� ���������� ���� 
	// ��) 2 ==> b [] = {5,5,6,8,6,0};
	// ��) 5 ==> b [] = {6,8,2,6,0,0};
		/*System.out.println(Arrays.toString(data));
		System.out.println("������ �� �Է� : ");
		int remove = scan.nextInt();
		int index = 0;
		for(int i = 0; i < 6; i++) {
			if(data[i] != remove) {
				b[index] = data[i];
				index += 1;
			}
		}
		System.out.println(Arrays.toString(b));*/
		
		//�տ��� ����
		/*System.out.println(Arrays.toString(data));
		System.out.println("������ �� �Է� : ");
		int num = scan.nextInt();
		int index = 0;
		boolean check = false;
		for(int i = 0; i < 6; i++) {
			if(data[i] == num && check == false) {
				check = true;
			}
			else {
				b[index] = data[i];
				index += 1;
			}
		}
		System.out.println(Arrays.toString(b));*/
		
		//�ڿ��� ����
		/*System.out.println(Arrays.toString(data));
		System.out.println("������ �� �Է� : ");
		int remove = scan.nextInt();
		int index = 4;
		boolean check = false;
		for(int i = 5; i >= 0; i--) {
			if(data[i] == remove && check == false) {
				check = true;
			}
			else {
				b[index] = data[i];
				index -= 1;
			}
		}
		System.out.println(Arrays.toString(b));*/
		
		System.out.println(Arrays.toString(data));
		System.out.println("������ �� �Է� : ");
		int remove = scan.nextInt();
		int index = 0;
		int bindex = 0;
		for(int i = 0; i < 6; i++) {
			if(data[i] == remove) {
				index = i;
				//break;
			}
		}
		for(int i = 0; i < 6; i++) {
			if(i != index) {
				b[bindex] = data[i];
				bindex += 1;
			}
		}
		System.out.println(Arrays.toString(b));
	}
}