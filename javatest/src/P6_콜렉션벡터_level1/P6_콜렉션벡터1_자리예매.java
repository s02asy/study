package P6_�ݷ��Ǻ���_level1;

import java.util.Scanner;
import java.util.Vector;

class Seat{
	int num;
	boolean check;
}
public class P6_�ݷ��Ǻ���1_�ڸ����� {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		Vector<Seat> seatList = new Vector<Seat>();
		
		for(int i = 0; i < 10; i++) {
			Seat seat = new Seat();  
			seat.check = false;
			seat.num = i;
			seatList.add(seat);
		}
		
		while(true) {
			for(int i = 0; i < seatList.size(); i++) {
				if(seatList.get(i).check == false) {
					System.out.print("[ ]");
				}else {
					System.out.print("[X]");
				}
			}
			System.out.println();
			System.out.println("1) ���� 0) ����");
			int sel = scan.nextInt();
			if(sel == 1) {			
				
				System.out.println("��ȣ�� �����ϼ��� : ");
				int num = scan.nextInt();
				if(num < 0 || num >= seatList.size()) {
					System.out.println("�����Ҽ� ���� �ڸ��Դϴ�. ");
					continue;
				}
				if(seatList.get(num).check == false) {
					seatList.get(num).check = true;
					System.out.println(num + " ���ڸ� ���� �Ϸ�.");
				}else {
					System.out.println("�̹� ���ŵ��ڸ��Դϴ�. ");
				}
				
			}else if(sel == 0) {
				break;
			}
		}
		
		
	}
}