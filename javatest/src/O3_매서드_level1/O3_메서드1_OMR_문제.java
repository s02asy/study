package O3_�ż���_level1;

import java.util.Arrays;
import java.util.Random;

/*
 * # OMRī�� : Ŭ���� + �޼���
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

class OMR {
	int answer[] = {1, 3, 4, 2, 5};
	int hgd[] = new int[5];
	String ����ǥ[] = new String[5];
	int cnt;
	void SetRandomHgd() {
		Random ran = new Random();
		for(int i = 0; i < hgd.length; i++) {
			int r = ran.nextInt(5) + 1;
			hgd[i] = r;
		}
	}
	void printCheckAnswerAndHgd() {
		for(int i = 0; i < answer.length; i++) {
			if(answer[i] == hgd[i]) {
				cnt += 1;
				����ǥ[i] = "O";
			}else {
				����ǥ[i] = "X";
			}
		}
	}
	void print() {
		System.out.println("answer = " + Arrays.toString(answer));
		System.out.println("hgd    = " + Arrays.toString(hgd));
		System.out.println("����ǥ   = " + Arrays.toString(����ǥ));
		System.out.println("����    = " + cnt*20);
	}
}
public class O3_�޼���1_OMR_���� {
	public static void main(String[] args) {
		OMR omr = new OMR();
		omr.SetRandomHgd();
		omr.printCheckAnswerAndHgd();
		omr.print();
	}
}