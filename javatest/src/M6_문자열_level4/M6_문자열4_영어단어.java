package M6_���ڿ�_level4;

import java.util.Random;
import java.util.Scanner;

public class M6_���ڿ�4_����ܾ� {
	public static void main(String[] args) {
		// ����) ����ܾ� ���߱�
		// ����ܾ ���� * �� ǥ�õȴ�.
		// ����ܾ �Է¹ް� Ʋ�������� �������� �ѱ��ھ� ��������. (������ 5���� ����)
		// (����) ���࿡ ���� ö�ڰ� �������� �ѹ��� ��������.
		// ���� �������ų� ���߸� ����
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int score = 100;
		String word = "performance";
		String meaning = "����";
		int size = word.length();
		int check[] = new int[size]; // ��Ʈ üũ�� ���ؼ� Ȯ���Ҽ��ִ�.
		for(int i = 0; i < size; i++) {
			check[i] = -1;
		}
		int cnt = 0;
		while (true) {
			System.out.println("�� : " + meaning);
			System.out.print("���� : ");
			for (int i = 0; i < size; i++) {
				if(check[i] != -1) {
					System.out.print(word.charAt(i));
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
			if(cnt == size) {
				System.out.println("����.");
				break;
			}
			System.out.println("����ܾ �Է��ϼ��� >>> ");
			String me = scan.next();
			boolean ch = false;
			if(word.equals(me)) {
				ch = true;
				System.out.println(word);
				System.out.println("���� �Դϴ�.");
				break;
			}
			if(ch == false) {
				boolean run = true;
				while(run) {
					int r = ran.nextInt(size - 1);
					if(check[r] == -1) {
						check[r] = r;
						cnt += 1;
						for(int i = 0; i < size; i++) {
							if(r != i && word.charAt(r) == word.charAt(i)) {
								check[i] = i;
								cnt += 1;
							}
						}
						run = false;
					}
				}
			}
		}
	}
}