package P2_Ŭ������ȭ_level3_3_Ÿ�ڰ���;

import java.util.Scanner;

public class GameManager {
	Scanner scan = new Scanner(System.in);
	
	WordDAO wordDAO;
	ScoreDAO scoreDAO;
	
	void init(WordDAO worddao ,ScoreDAO scoredao) {
		wordDAO = worddao;
		scoreDAO = scoredao;
	}

	void insertWord() {
		System.out.println("�߰��� �ܾ� �Է� : ");
		String word = scan.next();
		wordDAO.insertWord(word);
	}
	void removeWord() {
		System.out.println("������ �ܾ� �Է� : ");
		String word = scan.next();
		wordDAO.removeWord(word);
	}
	
	void gameStart(Member member , int gameCount) {
		int size = wordDAO.getSize();
		if(size < gameCount) {
			System.out.println("�ܾ ��������ʾ� ������ �����Ҽ������ϴ�.");
			System.out.println("�ּ� " + gameCount + "���� ������ �ʿ��մϴ�.");
			return;
		}
				
		String[] gameWord = wordDAO.getRandomWordList(gameCount);
		int score = 0;
		int i = 0;
		while(true) {
			System.out.println("���� : " + gameWord[i]);
			String input = scan.next();
			if(input.equals(gameWord[i])) {
				score += 1;
				System.out.println("[����]");
			}else {
				System.out.println("[��]");
			}
			i += 1;
			
			if(gameCount == i) {
				System.out.println("[��繮���� Ǯ�����ϴ�]");
				break;
			}
			
		}	
		int rank = scoreDAO.saveScore(member.id , score);
		if(rank == -1) {
			System.out.println("�ƽ��Ե� ������ ���� ���߽��ϴ�.");
		}else {
			System.out.println(rank + "�� �Դϴ�. �����մϴ�.");
		}
		
	}
	void printRank() {
		scoreDAO.printRank();
	}
	
}
