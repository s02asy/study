package J5_�׽�Ʈ_�迭_level4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class J5_�׽�Ʈ_�迭4_���ھ߱� {
	/*
	 * # ���� �߱� ����
	 * 1. me�� 1~9 ������ ���� 3���� ����
	 *    (��, �ߺ��Ǵ� ���ڴ� ���� �Ұ�)
	 *    ��) 1,1,1 
	 * 2. com�� me�� ���� ������ ���� ������ �ݺ� (���ڿ� �ڸ��� ���� �¾ƾ��Ѵ�) ��)1,7,3
	 * 3. Ʋ����� ��Ʈ���ش� 
     *     -���ڿ� �ڸ��� ������ 		strike += 1
	 *     -���ڸ� ���� �ڸ��� Ʋ���� 	ball += 1
	 * ��)
	 * ���� : 1 7 3
	 * 3 1 5		: 2b
	 * 1 5 6		: 1s
	 * ...
	 * 
	 * [�߰� ����] com �� 1,7,3 �������� �������� �ߺ����� 1~9����
	 */

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int[] com = new int[3];
        for(int i = 0; i < 3;) {
        	boolean check = false;
        	int r = ran.nextInt(9) + 1;
        	for(int j = 0; j < 3; j++) {
        		if(com[j] == r) {
        			check = true;
        		}
        	}
        	if(check == false) {
        		com[i] = r;
        		i += 1;
        	}
        }
        System.out.println("���� : " + Arrays.toString(com));
        
        while(true) {
        	int[] me = new int[3];
        	int strike = 0;
            int ball = 0;
            for(int i = 0; i < 3;) {
            	System.out.println("me �Է�");
            	int num = scan.nextInt();
            	if(num < 1 || num > 9) {
            		System.out.println("���� �ʰ�.");
            		continue;
            	}
            	boolean check = false;
            	for(int j = 0; j < 3; j++) {
            		if(me[j] == num) {
        				check = true;
        			}
            	}
            	if(check == true) {
            		System.out.println("�ߺ�.");
            		continue;
            	}
            	else if(check == false) {
            		me[i] = num;
            		i += 1;
            		System.out.println(Arrays.toString(me));
            	}
            }
            for(int i = 0; i < 3; i++) {
            	for(int j = 0; j < 3; j++) {
            		if(com[i] == me[j] && i == j) {
            			strike += 1;
            		}
            		else if(com[i] == me[j] && i != j) {
            			ball += 1;
            		}
            	}
            }
            System.out.println(strike + "s");
            System.out.println(ball + "b");
            if(strike == 3) {
            	System.out.println("�¸�!!");
            	break;
            }
        }
	}
}