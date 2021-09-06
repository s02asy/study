package R3_쓰래드;

import java.util.Scanner;

class bgm extends Thread{
	public boolean play = true;
	
	@Override
	public void run() {
		while(play) {
			System.out.println("BGM ~~");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
public class asdsadasd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		bgm a = new bgm();
		a.start();
		int i = 0;
		while(i < 10) {
			System.out.println("게임중");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			i++;
		}
	}
}
