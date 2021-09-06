package P0_클래스심화_level1;

import java.util.Scanner;

class Seat{
	int num;
	boolean check;
	void showNum() {
		System.out.print(num + " ");
	}
	void showData() {
		
		if(check == true) {
			System.out.print("■ ");
		}
		else {
			System.out.print("□ ");
		}
	}
}

public class P0_03_클래스심화_자리예매 {
	public static void main(String[] args) {
		boolean run = true;
		Seat [] seatList = new Seat[8];
		for(int i = 0; i < seatList.length; i++) {
			seatList[i] = new Seat(); 
			seatList[i].num = i + 1;
		}
		Scanner scan = new Scanner(System.in);
		while(run) {
			for(int i = 0; i< seatList.length; i++) {
				seatList[i].showNum();
			}
			System.out.println();
			for(int i = 0; i< seatList.length; i++) {
				seatList[i].showData();
			}
			System.out.println();
			System.out.println("번호를 입력하세요 >> ");
			int sel = scan.nextInt();
			sel -= 1;
			
			if(seatList[sel].check == false) {
				seatList[sel].check = true;
			}
		}

		
	}
}