package M7_테스트_문자열_level5;

public class M7_테스트_문자열5_02_학생정보2 {
	public static void main(String[] args) {
		String [][] student = {
				{"김철만","신촌","1001"}, 
				{"오상덕","강남","1002"},
				{"민철이","대치","1003"},
				{"유재석","강동","1004"}};
		String[][] score = {
				{"번호","과목","점수"},
				{"1001" ,"국어","20"},
				{"1002" ,"국어","50"},
				{"1003" ,"국어","60"},
				{"1004" ,"국어","17"},
				{"1001" ,"수학","65"},
				{"1002" ,"수학","15"},
				{"1003" ,"수학","80"},
				{"1004" ,"수학","70"},
				{"1001" ,"영어","43"},
				{"1002" ,"영어","90"},
				{"1003" ,"영어","30"},
				{"1004" ,"영어","70"}
		};
		
		// student 데이터는  차례대로 ==>  이름 , 지역 , 번호 를 나타낸다.
		// score 데이터는 ==>  번호 국어 , 수학 , 영어 을 나타낸다.
				
				
		//문제1) 아래순서대로 전체 학생 출력  
		//     [학생번호] [이름] [지역] [국어] [수학] [영어] [총합] [평균] 
		String language = "국어";
		String english = "영어";
		String math = "수학";
		double avg[] = new double[student.length];
		int total[] = new int[student.length];
		for(int i = 0; i < student.length; i++) {
			System.out.print(student[i][2] + " ");
			for(int j = 0; j < student[i].length - 1; j++) {
				System.out.print(student[i][j] + " ");
			}
			for(int j = 0; j < score.length; j++) {
				if(student[i][2] == score[j][0]) {
					for(int k = 0; k < score[i].length; k++) {
						if(language == score[j][k]) {
							total[i] += Integer.parseInt(score[j][k + 1]);
							System.out.print(score[j][k] + " ");
							System.out.print(score[j][k + 1] + " ");
						}
						if(math == score[j][k]) {
							total[i] += Integer.parseInt(score[j][k + 1]);
							System.out.print(score[j][k] + " ");
							System.out.print(score[j][k + 1] + " ");
						}
						if(english == score[j][k]) {
							total[i] += Integer.parseInt(score[j][k + 1]);
							System.out.print(score[j][k] + " ");
							System.out.print(score[j][k + 1] + " ");
						}
					}
				}
			}
			System.out.print(total[i] + " ");
			avg[i] = (double)total[i] / 3;
			System.out.print(avg[i]);
			System.out.println();
		}
		//문제2) 각 과목별 1등 학생이름 과 전체 1등이름  출력  
		int 국어 = 0;
		int 수학 = 0;
		int 영어 = 0;
		int id1 = 0;
		int id2 = 0;
		int id3 = 0;
		int id4 = 0;
		double max = 0;
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				if(score[i][j] == language) {
					if(국어 < Integer.parseInt(score[i][j + 1])) {
						국어 = Integer.parseInt(score[i][j + 1]);
						id1 = i;
					}
				}
				if(score[i][j] == math) {
					if(수학 < Integer.parseInt(score[i][j + 1])) {
						수학 = Integer.parseInt(score[i][j + 1]);
						id2 = i;
					}
				}
				if(score[i][j] == english) {
					if(영어 < Integer.parseInt(score[i][j + 1])) {
						영어 = Integer.parseInt(score[i][j + 1]);
						id3 = i;
					}
				}
			}
		}
		for(int i = 0; i < avg.length; i++) {
			if(max < avg[i]) {
				max = avg[i];
				id4 = i;
			}
		}
		System.out.println("전체 1등 " + avg[id4] + " " + student[id4][0]);
		for(int i = 0; i < student.length; i++) {
			for(int j = 0; j < student[i].length; j++) {
				if(student[i][j] == score[id1][0]) {
					System.out.print("국어 1등 " + 국어 + " " + student[i][0]);
					System.out.println();
				}
				if(student[i][j] == score[id2][0]) {
					System.out.print("수학 1등 " + 수학 + " " + student[i][0]);
					System.out.println();
				}
				if(student[i][j] == score[id3][0]) {
					System.out.print("영어 1등 " + 영어 + " " + student[i][0]);
					System.out.println();
				}
			}
		}
		
	}
}