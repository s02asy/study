package O0_Ŭ����;

import java.util.Arrays;
import java.util.Scanner;



class Rank{
	int score[] = {100, 30, 10, 30, 30, 30, 30, 100, 100, 60, 60, 60, 60, 60};
	int rank [] = new int[score.length];
}


public class O0_10_Ŭ������ŷ {
	public static void main(String[] args) {
		
		//1) ��ũ Ŭ������ �����.
		//2) ������ ����ؼ� rank �� ����� �����Ѵ�. 
		// [����] �����ڰ� ������� ����� ���� �����ϰ� ���� �����л���
		// �����ڸ�ŭ ���� ����� �����Ѵ�.
		// ��) ���� ������ 10 , 30 , 100, 30  ==> �����  4, 2, 1, 2 �̴�.
		
		Rank e = new Rank();
		int max = e.score[0];
		int rank = 1;
		for(int i = 0; i < e.score.length; i++) {
			if(max < e.score[i]) {
				max = e.score[i];
			}
		}
		int cnt = 0;
		for(int i = 0; i < e.score.length; i++) {
			if(max == e.score[i]) {
				e.rank[i] = rank;
				cnt += 1;
			}
		}
		rank += cnt;
		while(true) {
			int min = e.score[0];
			for(int i = 0; i < e.score.length; i++) {
				if(min > e.score[i]) {
					min = e.score[i];
				}
			}
			for(int i = 0; i < e.score.length; i++) {
				if(min < e.score[i] && max > e.score[i]) {
					min = e.score[i];
				}
			}
			int cnt2 = 0;
			for(int i = 0; i < e.score.length; i++) {
				if(min == e.score[i]) {
					e.rank[i] = rank;
					cnt += 1;
					cnt2 += 1;
				}
			}
			max = min;
			rank += cnt2;
			if(cnt == e.rank.length) {
				break;
			}
		}
		System.out.println(Arrays.toString(e.score));
		System.out.println(Arrays.toString(e.rank));
	}
}