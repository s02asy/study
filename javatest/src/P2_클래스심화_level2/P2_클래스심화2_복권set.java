package P2_클래스심화_level2;

import java.util.Random;

class Lotto {
	int[] data = new int[8];
	boolean win = false;
	void print() {
		for (int i = 0; i < 8; i++) {
			System.out.print(data[i]);
		}
		System.out.println();
	}
}

class List{
	Random ran = new Random();
	Lotto[] lottoList = new Lotto[5];
	void shuffle() {
		for(int i = 0; i < 1000; i++) {
			int r = ran.nextInt(5);
			Lotto temp = lottoList[0];
			lottoList[0] = lottoList[r];
			lottoList[r] = temp;
		}
		
	}
	void printList() {
		for(int i = 0; i < 5; i++) {
			lottoList[i].print();
		}
	}
	void run() {
		boolean check = false;
		int n = 0;
		while (n < 5) {
			lottoList[n] = new Lotto();
			for (int i = 0; i < 8; i++) {
				int r = ran.nextInt(2);
				if (r == 0) {
					lottoList[n].data[i] = 0;
				} else {
					lottoList[n].data[i] = 3;
				}
			}
			int count = 0;
			for (int i = 0; i < 8; i++) {
				if (lottoList[n].data[i] == 3) {
					count += 1;
					if (count == 3) {
						lottoList[n].win = true;
						break;
					}
				} else {
					count = 0;
				}
			}
			if(check == false && lottoList[n].win == true) {
				check = true;			
				n += 1;
			}else if (check == true && lottoList[n].win == false) {
				n += 1;
			}
		}
		
		shuffle();
		printList();
	}
}

public class P2_클래스심화2_복권set {
	public static void main(String[] args) {
		// 로또 1셋트 (1)
		// 1개는 당첨 4개는 꽝 인 랜덤복권
		
		List list = new List();
		list.run();
		
	}
}