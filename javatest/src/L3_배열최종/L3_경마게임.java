package L3_배열최종;

import java.util.Arrays;
import java.util.Random;

public class L3_경마게임 {
	public static void main(String[] args) {
		Random ran = new Random();
		int track[][] = new int[5][20]; 
		int sum[] = new int[5];
		int rank[] = new int[5];
		int rankid = 1;
		boolean check[] = new boolean[5];
		int id = 0;
		while(true) {
			for(int i = 0; i < track[0].length; i++) {
				int r = ran.nextInt(4) + 1;
				sum[0] += r;
				if(check[0] == false) {
					track[0][i] = r;
					rank[0] += 1;
				}
				if(sum[0] >= 19) {
					check[0] = true;
				}
			}
			for(int i = 0; i < track[0].length; i++) {
				int r = ran.nextInt(4) + 1;
				sum[1] += r;
				if(check[1] == false && rank[0] != rank[1]) {
					track[1][id] = r;
					rank[1] += 1;
					id += 1;
				}
				if(sum[1] >= 19) {
					check[1] = true;
				}
			}
			break;
		}
		System.out.println(Arrays.toString(rank));
		for(int i = 0; i < track.length; i++) {
			System.out.println(Arrays.toString(track[i]));
		}
	}
}
