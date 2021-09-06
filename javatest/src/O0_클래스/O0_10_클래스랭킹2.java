package O0_클래스;

import java.util.Arrays;

//1) 랭크 클래스를 만든다.
//2) 점수에 기반해서 rank 에 등수를 저장한다. 
// [조건] 동점자가 있을경우 등수는 같게 저장하고 다음 점수학생은
// 동점자만큼 뒤의 등수를 저장한다.
// 예) 지금 점수가 10 , 30 , 100, 30  ==> 등수는  4, 2, 1, 2 이다.	
//class Rank{
//	int score[] = {10, 30, 100, 30};
//	int rank [] = new int[4];
//}
public class O0_10_클래스랭킹2 {
	public static void main(String[] args) {		
		Rank r = new Rank();
		int rank[] =  r.rank;
		int score[] = r.score;
		
		for(int i = 0; i < score.length; i++) {
			int count = 1;
			for(int j = 0; j < score.length; j++) {
				if(i == j) {
					continue;
				}
				if(score[i] < score[j] ) {
					count += 1;
				}
			}
			rank[i] = count;
		}
		System.out.println(Arrays.toString(r.score));
		System.out.println(Arrays.toString(r.rank));
		
		
		
	}

}