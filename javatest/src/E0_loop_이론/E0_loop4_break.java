package E0_loop_�̷�;

import java.util.Scanner;

public class E0_loop4_break {
	
	// # ������� 1. break �ݺ��� 1���� ��� ���� (������ ���ϴ�)

	public static void main(String[] args) {
		
		// break
		for (int i = 0; i < 15; i++) {
			if (i > 3) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("����");
	}
}