package P1_테스트_클래스심화_level1;

import java.util.Random;

class OMR{
	int number;
	int [] 답안지 = new int[10];
	int score;
	String studentName;
	int rank;
}

public class P1_테스트_클래스심화_OMR {
	public static void main(String[] args) {		
		Random ran = new Random();
		// omr 정답
		int[] 정답답안지 = {1,4,2,5,5,3,2,1,3,1};
		// 학생 4명
		String[] nameList = {"이만수" ,"이철민" , "김신영" , "이종복"};	
	
		// 학생번호 1000번부터 시작한다. 
		int number = 1000; 
		//문제)
		// 1) 학생4명을 생성해서 위 데이터(이름 ,  번호)를 저장 
		// 2) 랜덤으로 omr 답안지 작성(1~5)
		// 3) 성적 입력 (1문제당 10점)
		// 4) 합격 생 이름 출력 (60점이상합격)
		// 5) 랭킹저장 (1~4등)
		// [조건] 예를 들어 100, 30 , 30, 10  이렇게 동점자가나오면 
		//       랭킹은 1,2,2,4 가된다. 
		int size = nameList.length;
		OMR []omr = new OMR[size];
		for(int i = 0; i < size; i++) {
			omr[i] = new OMR();
			omr[i].number = number;
			omr[i].studentName = nameList[i];
			number += 1;
			for(int j = 0; j < omr[i].답안지.length; j++) {
				int r = ran.nextInt(5);
				omr[i].답안지[j] = r + 1;
				if(정답답안지[j] == omr[i].답안지[j]) {
					omr[i].score += 10;
				}
			}
		}
		for(int i = 0; i < size; i++) {
			System.out.printf(omr[i].number + " ");
			System.out.printf(omr[i].studentName + " ");
			System.out.printf(omr[i].score + " ");
			System.out.println();
		}
		boolean check = false;
		System.out.println("합격자 명단");
		for(int i = 0; i < size; i++) {
			if(omr[i].score >= 60) {
				check = true;
				System.out.println(omr[i].studentName);
			}
		}
		if(check == false) {
			System.out.println("없음");
		}
		for(int i = 0; i < size; i++) {
			int rank = 1;
			for(int j = 0; j < size; j++) {
				if(i == j) {
					continue;
				}
				if(omr[i].score < omr[j].score)
					rank += 1;
			}
			omr[i].rank = rank;
		}
		System.out.println("등수");
		for(int i = 0; i < size; i++) {
			System.out.print(omr[i].rank + " ");
		}
	}
}