package E1_While_Quiz;

import java.util.Random;
import java.util.Scanner;

public class E1_While3_���������� {
	
	/*
	 * # ������ ����[3�ܰ�]
	 * 1. ������ ������ 5ȸ �ݺ��Ѵ�.
	 * 2. ������ ���߸� 20���̴�.
	 * 3. ���� ���� ��, ������ ����Ѵ�.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int score = 0;
		int cnt = 0;
		
		int i = 1;
		while(i <= 5) {
			
			int x = ran.nextInt(8) + 2;
			int y = ran.nextInt(9) + 1;
			int answer = x * y;
			
			System.out.print(x + " X " + y + " = ");
			int myAnswer = scan.nextInt();
			
			if(answer == myAnswer) {
				cnt = cnt + 1;
			}
			i = i + 1;
		}
		score = cnt * 20;
		System.out.println("���� = " + score + "��");
	}
}