package P2_클래스심화_level2;

import java.util.Random;

class horse1{
	String name = ""; 
	int position = 0; 
	int rank =  0;
	boolean win = false;
}
class racing1{
	Random ran = new Random();
	int size = 5;
	int line = 20;
	horse1 hor[] = new horse1[size];
	void run(String horse[]) {
		for(int i = 0; i < size; i++) {
			this.hor[i] = new horse1();
			this.hor[i].name = horse[i];
		}
		play1();
		print1();
		for(int i = 0; i < size; i++) {
			System.out.print(hor[i].name + " : " + hor[i].rank + "등");
			System.out.println();
		}
	}
	void play1() {
		int cnt = 0;
		while(true) {
			print1();
			int ranking = 1;
			for(int i = 0; i < size; i++) {
				for(int j = 1; j < size; j++) {
					if(hor[i].rank == j) {
						ranking += 1;
					}
				}
			}
			for(int i = 0; i < size; i++) {
				int r = ran.nextInt(4) + 1;
				if(hor[i].win == true) {
					continue;
				}
				hor[i].position += r;
				if(hor[i].position >= 19) {
					hor[i].position = 19;
					hor[i].win = true;
					hor[i].rank = ranking;
					cnt += 1;
				}
			}
			if(cnt >= size) {
				break;
			}
		}
	}
	void print1() {
		for(int i = 0; i < size; i++) {
			for(int n = 0; n < line; n++) {
				if(hor[i].position == n) {
					System.out.print("["+hor[i].name+"]");
				}else {
					System.out.print("[  ]");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
}

public class P2_클래스심화2_경마_문제 {
	public static void main(String[] args) {
		// 경마게임
		// 5x20 크기의 트랙이 있다. 
		// 말 5마리가 한번에 랜덤으로1~4칸을 순차적으로 이동한다.
		// 계속해서 반복해 모든말이 20칸에 도착하면 종료이고, 
		// 매번이동한 말의 위치와 각 말의 등수출력 
		// [조건] 동시도착가능 (단 동시도착한말의 등수는 같아야한다)
		
		String horseNameData = "aa/bb/cc/dd/ee";
		String token[] = horseNameData.split("/");
		racing1 race = new racing1();
		race.run(token);
	}
}