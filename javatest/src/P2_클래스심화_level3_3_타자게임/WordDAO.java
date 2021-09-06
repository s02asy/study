package P2_클래스심화_level3_3_타자게임;

import java.util.Random;

public class WordDAO {
	String[] wordList;
	int wordCount;

	void init(int size) {
		wordList = new String[size];
		wordCount = 0;
	}
	
	void insertSampleList() {
		String [] sampleList = {"banana" , "apple" , "jsp" , "android" , "java",
				"c++" , "father" ,"mother" , "love" , "spring"};
		
		for(int i = 0; i < sampleList.length; i++) {
			insertWord(sampleList[i]);
		}
	}
	
	void print() {
		for(int i = 0; i < wordCount; i++) {
			System.out.println( (i + 1) +"번) " +  wordList[i]);
		}
	}
	void insertWord(String word) {
		wordList[wordCount] = word;
		wordCount += 1;
	}
	void removeWord(String word) {
		int index = -1;
		for(int i = 0; i < wordCount; i++) {
			if(word.equals(wordList[i])) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("삭제할단어가 없습니다.");
		}else {
			for(int i = index; i < wordCount-1; i++) {
				wordList[i] =wordList[i + 1];
			}
			wordCount -= 1;
		}
	}
	int getSize() {
		return wordCount;
	}
	String[] getRandomWordList(int count) {
		Random ran = new Random();
		String [] sampleList =new String[count];
		
		for(int i = 0; i < 1000; i++) {
			int r = ran.nextInt(wordCount);
			String temp = wordList[r];
			wordList[r] = wordList[0];
			wordList[0] = temp;
		}
		
		for(int i = 0; i < count; i++) {
			sampleList[i] = wordList[i];
		}	
		return sampleList;
	}
}
