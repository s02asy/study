package P2_Ŭ������ȭ_level2;

import java.util.Random;

class Lotto1 {
	int[] data = new int[8];
	boolean win = false;
	void print() {
		for (int i = 0; i < 8; i++) {
			System.out.print(data[i]);
		}
		if(win == false) {
			System.out.println(" ��");
		}else {
			System.out.println(" ��÷");
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


public class P2_Ŭ������ȭ2_����set_���� {
	public static void main(String[] args) {

		// 1. 8ĭ¥�� ������ �ִ�.
		// 2. 1�̳� 7�� �������� 8ĭ�� �����Ѵ�. 
		// 3. 7�� �������� 3���� ��÷ �����̴�. 
		// 4. ���� 5�Ÿ� �����ҷ��� �Ѵ�.
		// 5. ��! 1���� ��÷�̰� 4���� ������ ���� 
		
		run go = new run();
		go.setrandom();
		go.print();
		
	}
}