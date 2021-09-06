package J3_������Ʈ_�迭_level3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class J3_������Ʈ_�迭3_���°��� {
	/*
	  # ���� ����
	  1. ���� ���ڰ� �����ִ� ī�� 2�徿 5��Ʈ���ִ�. (��10��)
	  2. front �� ī�带 ����� ���¸� ���Ѵ�. 
	  3. ���� front �� �����Ѵ�. 
	  4. front �� �ִ� ī�� 2���� �����Ѵ�. (���콺�������Ƿ� �ε����� ����)
	  5. ������ī�� 2���� ������ ������  back �� �����ؼ� ����� ǥ���Ѵ�. 
	     back�� ��� ���� �� ä������ ������ ����ȴ�.
	   ��)
	   [1] �ʱ�ȭ 
	     front = {'a', 'a', 'b', 'b', 'c', 'c', 'd', 'd', 'e', 'e' };
	     back  = {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-' };
	  
	   [2] ���� 
	     front = {'a', 'e', 'c', 'b', 'd', 'c', 'b', 'd', 'a', 'e'};
	
	   [3] �ε��� �Է� 	   
	     1) �ε��� 2�� ==>  0 , 8  ==>front �迭�� �ε��� 0, �� 8 �� ����  a , a �� 
	                ���� ���� �����̹Ƿ� back �� ����
	     	back  =  {'a', '-', '-', '-', '-', '-', '-', '-', 'a', '-' };
	     	
	     2) �ε��� 2�� ==>  1 , 2  ==>front �迭�� �ε��� 1, �� 2�� ���� e , c �� 
	                ���� �ٸ������̹Ƿ� �ƹ��Ͼ���
	     	back  =  {'a', '-', '-', '-', '-', '-', '-', '-', 'a', '-' };	
	 */

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		String[] front = {"a", "a", "b", "b", "c", "c", "d", "d", "e", "e"};
		String[] back = {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"};
		int count = 0;
		boolean check[] = new boolean[10];
		for(int i = 0; i < 1000; i++) {
			int r1 = ran.nextInt(10);
			int r2 = ran.nextInt(10);
			String temp = front[r1];
			front[r1] = front[r2];
			front[r2] = temp;
		}
		while(true) {
			System.out.println(Arrays.toString(back));
			System.out.println("ù��° ������ ī�带 �����ϼ���. (����  0 ~ 9)");
			int a = scan.nextInt();
			if(a < 0 || a > 9) {
				System.out.println("���� �ʰ�.");
				continue;
			}
			
			if(check[a] == true) {
				System.out.println("�̹� ������ ī�� �Դϴ�.");
				continue;
			}
			back[a] = front[a];
			System.out.println(Arrays.toString(back));
			System.out.println("�ι�° ������ ī�带 �����ϼ���. (����  0 ~ 9)");
			int b = scan.nextInt();
			if(b < 0 || b > 9) {
				System.out.println("���� �ʰ�.");
				continue;
			}
			if(check[b] == true) {
				System.out.println("�̹� ������ ī�� �Դϴ�.");
				back[a] = "-";
				continue;
			}
			back[b] = front[b];
			System.out.println(Arrays.toString(back));
			if(a == b) {
				System.out.println("���� ī�� ���� �Ұ�.");
				back[a] = "-";
				continue;
			}
			if(front[a] == front[b]) {
				back[a] = front[a];
				back[b] = front[b];
				check[a] = true;
				check[b] = true;
				count += 1;
			}
			else {
				back[a] = "-";
				back[b] = "-";
			}
			if(count == 5) {
				break;
			}
		}
	}
}