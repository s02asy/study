package J3_프로젝트_배열_level3;

import java.util.Arrays;
import java.util.Scanner;

public class J3_프로젝트_배열3_미니마블 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int[] p1   = {1, 0, 0, 0, 0, 0, 0, 0};
		int[] p2   = {2, 0, 0, 0, 0, 0, 0, 0};
		
		int p1id = 0;
		int p2id = 0;
		int c1 = 0;
		int c2 = 0;
		boolean turn = true;
		while(true) {
			System.out.print(Arrays.toString(p1)); 
			System.out.println(" count1 : " + c1);
			System.out.print(Arrays.toString(p2));	
			System.out.println(" count2 : " + c2);
			if(turn == true) {
				System.out.println("[p1] 숫자 1~3을 입력 ");
				int move = scan.nextInt();
				if(move >= 1 && move <= 3) {
					p1[p1id] = 0;
					p1id += move;
					if(p1id >= 8) {
						c1 += 1;
						p1id -= 8;
					}
					p1[p1id] = 1;
					turn = false;
				}
				
			}else {
				System.out.println("[p2] 숫자 1~3을 입력 ");
				int move = scan.nextInt();
				if(move >= 1 && move <= 3) {
					p2[p2id] = 0;
					p2id += move;
					if(p2id >= 8) {
						c2 += 1;
						p2id -= 8;
					}
					p2[p2id] = 2;
					turn = true;
				}
			}	
			if(p1id != 0 && p2id != 0 && p1id == p2id && turn == false) {
				p2[p2id] = 0;
				p2id = 0;
				p2[0] = 2;
			}else if(p1id != 0 && p2id != 0 && p1id == p2id && turn == true){
				p1[p1id] = 0;
				p1id = 0;
				p1[0] = 1;
			}
			
			if(c1 == 3) {
				System.out.println("p1승리");
			}else if(c2 == 3) {
				System.out.println("p2승리");
			}
		}		
	}
}