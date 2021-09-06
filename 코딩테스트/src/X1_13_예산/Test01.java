package X1_13_¿¹»ê;
//https://programmers.co.kr/learn/courses/30/lessons/12982
import java.util.Arrays;
class Solution {
	public int solution(int[] d, int budget) {
		int answer = 0;

		Arrays.sort(d);

		int btest = budget;

		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
			if (btest >= d[i]) {
				btest -= d[i];
				answer++;
			} else {
				break;
			}
		}

		return answer;
	}
}

public class Test01 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		// int[] d = {1,3,2,5,4};
		// int budget = 9;
		int[] d = { 2, 2, 3, 3 };
		int budget = 10;

		int result = sol.solution(d, budget);
		System.out.println(result);
	}
}