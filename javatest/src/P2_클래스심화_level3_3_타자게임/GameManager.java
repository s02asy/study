package P2_클래스심화_level3_3_타자게임;

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
		System.out.println("추가할 단어 입력 : ");
		String word = scan.next();
		wordDAO.insertWord(word);
	}
	void removeWord() {
		System.out.println("삭제할 단어 입력 : ");
		String word = scan.next();
		wordDAO.removeWord(word);
	}
	
	void gameStart(Member member , int gameCount) {
		int size = wordDAO.getSize();
		if(size < gameCount) {
			System.out.println("단어가 충분하지않아 게임을 시작할수없습니다.");
			System.out.println("최소 " + gameCount + "개의 문제가 필요합니다.");
			return;
		}
				
		String[] gameWord = wordDAO.getRandomWordList(gameCount);
		int score = 0;
		int i = 0;
		while(true) {
			System.out.println("문제 : " + gameWord[i]);
			String input = scan.next();
			if(input.equals(gameWord[i])) {
				score += 1;
				System.out.println("[정답]");
			}else {
				System.out.println("[떙]");
			}
			i += 1;
			
			if(gameCount == i) {
				System.out.println("[모든문제를 풀었습니다]");
				break;
			}
			
		}	
		int rank = scoreDAO.saveScore(member.id , score);
		if(rank == -1) {
			System.out.println("아쉽게도 순위에 들지 못했습니다.");
		}else {
			System.out.println(rank + "등 입니다. 축하합니다.");
		}
		
	}
	void printRank() {
		scoreDAO.printRank();
	}
	
}
