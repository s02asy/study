package O0_Ŭ����;

import java.util.Arrays;
import java.util.Random;

class Test06{
	int[] answer = {1, 3, 4, 2, 5};				// ������
	int[] hgd = new int[5];						// �л����
	String ����ǥ[] = new String[answer.length];	// ����ǥ
	int cnt = 0;								// ���� ���� ����
	int score = 0;								// ����
}
/*
 * # OMRī�� : Ŭ���� + ����
 * 1. �迭 answer�� ���蹮���� �������̴�.
 * 2. �迭 hgd�� 1~5 ������ ���� ���� 5���� �����Ѵ�.
 * 3. answer�� hgd ���� ���� ����ǥ�� ����Ѵ�.
 * 4. �� ������ 20���̴�.
 * ��)
 * answer = {1, 3, 4, 2, 5}
 * hgd    = {1, 1, 4, 4, 3}
 * ����ǥ     = {O, X, O, X, X}
 * ����        = 40��
 */

public class O0_06_Ŭ����omr {
	public static void main(String[] args) {
		Random ran = new Random();
		Test06 e = new Test06();
//		for(int i = 0; i < e.hgd.length;) {
//			int r = ran.nextInt(5) + 1;
//			boolean check = false;
//			for(int j = 0; j < e.hgd.length; j++) {
//				if(e.hgd[j] == r) {
//					check =true;
//					break;
//				}
//			}
//			if(check == false) {
//				e.hgd[i] = r;
//				i++;
//			}
//		}
		for(int i = 0; i < e.hgd.length; i++) {
			e.hgd[i] = ran.nextInt(5) + 1;
		}
		System.out.println("answer = " + Arrays.toString(e.answer));
		System.out.println("hgd    = " + Arrays.toString(e.hgd));
		for(int i = 0; i < e.answer.length; i++) {
			if(e.answer[i] == e.hgd[i]) {
				e.����ǥ[i] = "O"; 
				e.cnt += 1;
			}else {
				e.����ǥ[i] = "X"; 
			}
		}
		e.score = e.cnt * 20;
		System.out.println("����ǥ   = " + Arrays.toString(e.����ǥ));
		System.out.println("����    = " + e.score + "��");
	}
}