package M3_문자열_level1;

import java.util.Scanner;

public class M3_문자열1_채팅컨트롤러 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String wordList []= {
				"영희야 안녕" , 
				"철수야 안녕" ,  
				"오늘 점심같이 먹을래? ", 
				"아니 약속있어." , 
				"그래담에 먹자."
			};
		// 컨트롤러를 만들어서 반복적으로 채팅을 입력하고 글이 앞으로 이동하도록만들어보세요.
		
		for(int i = 0; i < wordList.length; i++) {
			System.out.println(wordList[i]);
		}
		boolean check = false;
		while(true) {
			if(check == false) {
				System.out.println("영희입력 : ");
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
				System.out.println("철수입력 : ");
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