package P0_Ŭ������ȭ_level1;

import java.util.Scanner;

class Seat1{
	int num;
	boolean check;
	void showNum() {
		System.out.print(num + " ");
	}
	void showData() {
		
		if(check == true) {
			System.out.print("�� ");
		}
		else {
			System.out.print("�� ");
		}
	}
}

public class P0_03_Ŭ������ȭ_�ڸ�����_���� {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Seat1[] movie = new Seat1[5];
		for(int i = 0; i < movie.length; i++) {
			movie[i] = new Seat1();
			movie[i].num = i + 1;
		}
		
		while(true) {
			System.out.println("����");
			for(int i = 0; i < movie.length; i++) {
				movie[i].showNum();
			}
			System.out.println();
			for(int i = 0; i < movie.length; i++) {
				movie[i].showData();
			}
			System.out.println();
			System.out.println("�ڸ��� �����ϼ���.");
			int sel = scan.nextInt();
			sel -= 1;
			if(movie[sel].check == false) {
				movie[sel].check = true;
			}
		}
	}
}