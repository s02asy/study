package J3_프로젝트_배열_level3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class J3_프로젝트_배열3_기억력게임 {
	/*
	  # 기억력 게임
	  1. 같은 글자가 적혀있는 카드 2장씩 5세트가있다. (총10장)
	  2. front 는 카드를 엎어논 상태를 뜻한다. 
	  3. 먼저 front 를 셔플한다. 
	  4. front 에 있는 카드 2개를 선택한다. (마우스가없으므로 인덱스로 선택)
	  5. 선택한카드 2장의 내용이 같으면  back 에 복사해서 맞춘걸 표시한다. 
	     back에 모든 글자 가 채워지면 게임은 종료된다.
	   예)
	   [1] 초기화 
	     front = {'a', 'a', 'b', 'b', 'c', 'c', 'd', 'd', 'e', 'e' };
	     back  = {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-' };
	  
	   [2] 셔플 
	     front = {'a', 'e', 'c', 'b', 'd', 'c', 'b', 'd', 'a', 'e'};
	
	   [3] 인덱스 입력 	   
	     1) 인덱스 2개 ==>  0 , 8  ==>front 배열의 인덱스 0, 과 8 의 값은  a , a 로 
	                서로 같은 내용이므로 back 에 복사
	     	back  =  {'a', '-', '-', '-', '-', '-', '-', '-', 'a', '-' };
	     	
	     2) 인덱스 2개 ==>  1 , 2  ==>front 배열의 인덱스 1, 과 2의 값은 e , c 로 
	                서로 다른글자이므로 아무일없음
	     	back  =  {'a', '-', '-', '-', '-', '-', '-', '-', 'a', '-' };	
	 */

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		String[] front = {"a", "a", "b", "b", "c", "c", "d", "d", "e", "e"};
		String[] back = {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"};
		int count = 0;
		boolean check[] = new boolean[10];
		for(int i = 0; i < 1000; i++) {
			int r1 = ran.nextInt(10);
			int r2 = ran.nextInt(10);
			String temp = front[r1];
			front[r1] = front[r2];
			front[r2] = temp;
		}
		while(true) {
			System.out.println(Arrays.toString(back));
			System.out.println("첫번째 오픈할 카드를 선택하세요. (범위  0 ~ 9)");
			int a = scan.nextInt();
			if(a < 0 || a > 9) {
				System.out.println("범위 초과.");
				continue;
			}
			
			if(check[a] == true) {
				System.out.println("이미 선택한 카드 입니다.");
				continue;
			}
			back[a] = front[a];
			System.out.println(Arrays.toString(back));
			System.out.println("두번째 오픈할 카드를 선택하세요. (범위  0 ~ 9)");
			int b = scan.nextInt();
			if(b < 0 || b > 9) {
				System.out.println("범위 초과.");
				continue;
			}
			if(check[b] == true) {
				System.out.println("이미 선택한 카드 입니다.");
				back[a] = "-";
				continue;
			}
			back[b] = front[b];
			System.out.println(Arrays.toString(back));
			if(a == b) {
				System.out.println("같은 카드 선택 불가.");
				back[a] = "-";
				continue;
			}
			if(front[a] == front[b]) {
				back[a] = front[a];
				back[b] = front[b];
				check[a] = true;
				check[b] = true;
				count += 1;
			}
			else {
				back[a] = "-";
				back[b] = "-";
			}
			if(count == 5) {
				break;
			}
		}
	}
}