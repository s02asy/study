package O0_Ŭ����;

import java.util.Arrays;

//1) ��ũ Ŭ������ �����.
//2) ������ ����ؼ� rank �� ����� �����Ѵ�. 
// [����] �����ڰ� ������� ����� ���� �����ϰ� ���� �����л���
// �����ڸ�ŭ ���� ����� �����Ѵ�.
// ��) ���� ������ 10 , 30 , 100, 30  ==> �����  4, 2, 1, 2 �̴�.	
//class Rank{
//	int score[] = {10, 30, 100, 30};
//	int rank [] = new int[4];
//}
public class O0_10_Ŭ������ŷ2 {
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