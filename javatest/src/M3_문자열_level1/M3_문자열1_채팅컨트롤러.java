package M3_���ڿ�_level1;

import java.util.Scanner;

public class M3_���ڿ�1_ä����Ʈ�ѷ� {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String wordList []= {
				"����� �ȳ�" , 
				"ö���� �ȳ�" ,  
				"���� ���ɰ��� ������? ", 
				"�ƴ� ����־�." , 
				"�׷��㿡 ����."
			};
		// ��Ʈ�ѷ��� ���� �ݺ������� ä���� �Է��ϰ� ���� ������ �̵��ϵ��ϸ�������.
		
		for(int i = 0; i < wordList.length; i++) {
			System.out.println(wordList[i]);
		}
		boolean check = false;
		while(true) {
			if(check == false) {
				System.out.println("�����Է� : ");
				String input = scan.nextLine();
				for(int i = 0; i < wordList.length - 1; i++) {
					wordList[i] = wordList[i + 1];
				}
				wordList[wordList.length - 1] = input;
				for(int i = 0; i < wordList.length; i++) {
					System.out.println(wordList[i]);
				}
				check = true;
			}
			if(check == true) {
				System.out.println("ö���Է� : ");
				String input = scan.nextLine();
				for(int i = 0; i < wordList.length - 1; i++) {
					wordList[i] = wordList[i + 1];
				}
				wordList[wordList.length - 1] = input;
				for(int i = 0; i < wordList.length; i++) {
					System.out.println(wordList[i]);
				}
				check = false;
			}
		}
		
	}

}