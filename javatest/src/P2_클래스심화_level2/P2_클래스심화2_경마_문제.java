package P2_Ŭ������ȭ_level2;

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
			System.out.print(hor[i].name + " : " + hor[i].rank + "��");
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

public class P2_Ŭ������ȭ2_�渶_���� {
	public static void main(String[] args) {
		// �渶����
		// 5x20 ũ���� Ʈ���� �ִ�. 
		// �� 5������ �ѹ��� ��������1~4ĭ�� ���������� �̵��Ѵ�.
		// ����ؼ� �ݺ��� ��縻�� 20ĭ�� �����ϸ� �����̰�, 
		// �Ź��̵��� ���� ��ġ�� �� ���� ������ 
		// [����] ���õ������� (�� ���õ����Ѹ��� ����� ���ƾ��Ѵ�)
		
		String horseNameData = "aa/bb/cc/dd/ee";
		String token[] = horseNameData.split("/");
		racing1 race = new racing1();
		race.run(token);
	}
}