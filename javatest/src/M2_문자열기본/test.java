package M2_문자열기본;

import java.util.Arrays;
import java.util.Random;

public class test {
public static void main(String[] args) {
	Random ran = new Random();
	String [] wordList = {"java" , "spring" , "jsp" , "android" , "php"};
	int cnt = 0;
	String []wordList2 = new String[wordList.length];
	for(int i = 0; i < wordList2.length; i++) {
		wordList2[i] = "";
	}
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
	System.out.println(Arrays.toString(wordList2));
}
}
