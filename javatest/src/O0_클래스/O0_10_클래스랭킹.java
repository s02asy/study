package O0_클래스;

import java.util.Arrays;
import java.util.Scanner;



class Rank{
	int score[] = {100, 30, 10, 30, 30, 30, 30, 100, 100, 60, 60, 60, 60, 60};
	int rank [] = new int[score.length];
}


public class O0_10_클래스랭킹 {
	public static void main(String[] args) {
		
		//1) 랭크 클래스를 만든다.
		//2) 점수에 기반해서 rank 에 등수를 저장한다. 
		// [조건] 동점자가 있을경우 등수는 같게 저장하고 다음 점수학생은
		// 동점자만큼 뒤의 등수를 저장한다.
		// 예) 지금 점수가 10 , 30 , 100, 30  ==> 등수는  4, 2, 1, 2 이다.
		
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