package H9_배열레벨1테스트;

import java.util.Random;

public class H9_Test7 {
	public static void main(String[] args) {
		 Random ran = new Random();
		//문제1)  a 배열안에 1 또는 7만 랜덤으로 저장후 출력. 
		int a [] = new int[7];	
		//예) 1,7,7,1,1,7,7
		for(int i = 0; i < 7; i++) {
			int r = ran.nextInt(2);
			if(r == 0) {
				a[i] = 1;
			}
			else {
				a[i] = 7;
			}
		}
		for(int i = 0; i < 7; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("---------------------------");
		
		
		//문제2) b 배열을 아래와같이 사각형모양으로출력 
		// 힌트 3칸마다 줄바꿈 
		int b [] = {1,2,3,4,5,6,7,8,9};	
		// 1 2 3
		// 4 5 6
		// 7 8 9
		int index = 1;
		for(int i = 1; i <= 9; i++) {
			System.out.print(b[i - 1] + " ");
			if(i % 3 == 0) {
				System.out.println();
			}
		}
		
		System.out.println("---------------------------");
		
		for(int i = 0; i < 9; i++) {
			System.out.print(b[i] + " ");
			if(index % 3 == 0) {
				System.out.println();
			}
			index += 1;
		}
		
	}
}