package P2_클래스심화_level2;

import java.util.Random;

class Lotto1 {
	int[] data = new int[8];
	boolean win = false;
	void print() {
		for (int i = 0; i < 8; i++) {
			System.out.print(data[i]);
		}
		if(win == false) {
			System.out.println(" 꽝");
		}else {
			System.out.println(" 당첨");
		}
	}
}
class run {
	Random ran = new Random();
	int size = 5;
	Lotto1 lotto[] = new Lotto1[size];
	void setrandom() {
		while(true) {
			int cnt = 0;
			for(int i = 0; i < size; i++) {
				lotto[i] = new Lotto1();
				for(int j = 0; j < lotto[i].data.length; j++) {
					int r = ran.nextInt(2);
					if(r == 0) {
						lotto[i].data[j] = 1;
					}else {
						lotto[i].data[j] = 7;
					}
				}
			}
			for(int i = 0; i < size; i++) {
				for(int j = 0; j < lotto[i].data.length - 2; j++) {
					if(lotto[i].data[j] == 7 && lotto[i].data[j + 1] == 7 && lotto[i].data[j + 2] == 7) {
						lotto[i].win = true;
						cnt += 1;
					}
				}
			}
			if(cnt == 1) {
				break;
			}
		}
	}
	void print() {
		for(int i = 0; i < size; i++) {
			lotto[i].print();
		}
	}
	
}


public class P2_클래스심화2_복권set_문제 {
	public static void main(String[] args) {

		// 1. 8칸짜리 복권이 있다.
		// 2. 1이나 7을 랜덤으로 8칸에 저장한다. 
		// 3. 7이 연속으로 3개면 당첨 복권이다. 
		// 4. 복권 5매를 제작할려고 한다.
		// 5. 단! 1개는 당첨이고 4개는 꽝으로 제작 
		
		run go = new run();
		go.setrandom();
		go.print();
		
	}
}