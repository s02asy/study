package J5_테스트_배열_level4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class J5_테스트_배열4_숫자야구 {
	/*
	 * # 숫자 야구 게임
	 * 1. me에 1~9 사이의 숫자 3개를 저장
	 *    (단, 중복되는 숫자는 저장 불가)
	 *    예) 1,1,1 
	 * 2. com과 me를 비교해 정답을 맞출 때까지 반복 (숫자와 자리가 전부 맞아야한다) 예)1,7,3
	 * 3. 틀릴경우 힌트를준다 
     *     -숫자와 자리가 같으면 		strike += 1
	 *     -숫자만 같고 자리가 틀리면 	ball += 1
	 * 예)
	 * 정답 : 1 7 3
	 * 3 1 5		: 2b
	 * 1 5 6		: 1s
	 * ...
	 * 
	 * [추가 조건] com 에 1,7,3 고정말고 랜덤으로 중복없이 1~9저장
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
        System.out.println("정답 : " + Arrays.toString(com));
        
        while(true) {
        	int[] me = new int[3];
        	int strike = 0;
            int ball = 0;
            for(int i = 0; i < 3;) {
            	System.out.println("me 입력");
            	int num = scan.nextInt();
            	if(num < 1 || num > 9) {
            		System.out.println("범위 초과.");
            		continue;
            	}
            	boolean check = false;
            	for(int j = 0; j < 3; j++) {
            		if(me[j] == num) {
        				check = true;
        			}
            	}
            	if(check == true) {
            		System.out.println("중복.");
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
            	System.out.println("승리!!");
            	break;
            }
        }
	}
}