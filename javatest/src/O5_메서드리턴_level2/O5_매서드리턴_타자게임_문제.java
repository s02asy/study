package O5_메서드리턴_level2;

import java.util.Random;
import java.util.Scanner;


class WordGame1{
	Random ran = new Random();
	String [] wordList = {"java" , "spring" , "jsp" , "android" , "php"};
	String [] wordList2 = new String[wordList.length];
	boolean [] checkList;
	int count;
	void ShuffleWordList(){
		for(int i = 0; i < 1000; i++) {
			int r1 = ran.nextInt(wordList.length);
			int r2 = ran.nextInt(wordList.length);
			String temp = wordList[r1];
			wordList[r1] = wordList[r2];
			wordList[r2] = temp;
		}
	}
	void setWord2() {
		for(int i = 0; i < wordList2.length; i++) {
			wordList2[i] = "";
		}
	}
	void setRanWord2() {
		for(int i = 0; i < wordList.length; i++) {
			int r = ran.nextInt(wordList[i].length());
			for(int j = 0; j < wordList[i].length(); j++) {
				if(r == j) {
					wordList2[i] += "*";
				}else {
					wordList2[i] += wordList[i].charAt(j);
				}
			}
		}
	}
	void reset() {
		count = 0;
		ShuffleWordList();
		setWord2();
		setRanWord2();
		checkList = new boolean [wordList.length];
	}
	String getword() {
		return wordList2[count];
	}
	void printGameEnd() {
		System.out.println("-----------------------------------");
		for(int i = 0; i < wordList.length; i++) {
			System.out.printf("%-8s" , wordList[i]);
		}
		System.out.println();
		for(int i = 0; i < checkList.length; i++) {
			System.out.printf("%-8s" , checkList[i]);
		}
		System.out.println();
		System.out.println("-----------------------------------");
		System.out.println("[Game Over]");
	}
	void checkWord(String word) {
		if(wordList[count].equals(word)) {
			checkList[count] = true;
		}
		count += 1;
	}
	boolean getGameEnd() {
		if(count == wordList.length) {
			return true;
		}else {
			return false;
		}
	}
}
public class O5_매서드리턴_타자게임_문제 {
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		WordGame1 game = new WordGame1();
		while(true) {
			System.out.println("타자연습게임");
			System.out.println("1)게임 0)종료");
			int sel = scan.nextInt();
			if(sel == 1) {
				game.reset();
				while(true) {
					System.out.println(game.count + 1 + ") 단어를 맞춰보세요.");
					System.out.println(game.getword());
					String word = scan.next();
					game.checkWord(word);
					if(game.getGameEnd()) {
						game.printGameEnd();
						break;
					}
				}
			}else if(sel == 0) {
				break;
			}
		}
	}
}