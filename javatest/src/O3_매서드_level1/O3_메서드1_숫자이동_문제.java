package O3_매서드_level1;

import java.util.Scanner;

/*
 * # 숫자 이동하기 : 클래스 + 메서드
 * 1. 숫자 8은 캐릭터이다.
 * 2. 숫자 1을 입력하면, 캐릭터가 왼쪽으로 이동한다.
 * 3. 숫자 2를 입력하면, 캐릭터가 오른쪽으로이동한다.
 * 4. 좌우 끝에 도달했을 때 에러가 발생하지 않도록 예외처리를 해준다.
 */


class NumberGame1{
	
	Scanner scan = new Scanner(System.in);

	int[] move = {0, 0, 0, 0, 8, 0, 0, 0, 0, 0};
	int player = 4;
	void PrintMove() {
		for(int i = 0; i < this.move.length; i++) {
			if(this.move[i] == 0) {
				System.out.print("[ ]");
			}else {
				System.out.print("[읏]");
			}
		}
		System.out.println();
	}
	void Menu() {
		System.out.println("1.좌로 이동");
		System.out.println("2.우로 이동");
		System.out.println("3.종료하기");
	}
	void Left() {
		if(this.player > 0) {
			this.move[this.player] = 0;
			this.player -= 1;
			this.move[this.player] = 8;
		}else {
			System.out.println("더이상 움직일 수 없어요!");
		}
	}
	void Right() {
		if(this.player < this.move.length - 1) {
			this.move[this.player] = 0;
			this.player += 1;
			this.move[this.player] = 8;
		}else {
			System.out.println("더이상 움직일 수 없어요!");
		}
	}
	void run() {
		while(true) {
			PrintMove();
			Menu();
			System.out.println(":");
			int sel = this.scan.nextInt();
			
			if(sel == 1) {
				Left();
			}else if(sel == 2) {
				Right();
			}else if(sel == 3) {
				break;
			}
		}
	}
}


public class O3_메서드1_숫자이동_문제 {
	public static void main(String[] args) {

		NumberGame1 g = new NumberGame1();
		g.run();
		
	}
}