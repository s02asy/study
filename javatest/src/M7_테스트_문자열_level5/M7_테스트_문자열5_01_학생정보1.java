package M7_테스트_문자열_level5;

public class M7_테스트_문자열5_01_학생정보1 {
	public static void main(String[] args) {
		String [][] student = {
				{"이만수","신촌","1001"}, 
				{"김철민","강남","1002"},
				{"심장호","대치","1003"} , 
				{"유재석","강동","1004"}};
		String[][] score = {
				{"1001","100","20","30"},
				{"1002","10" ,"60","60"},
				{"1003","23" ,"63","31"},
				{"1004","45" ,"30","35"},
		};
		// student 데이터는  차례대로 ==>  이름 , 지역 , 번호 를 나타낸다.
		// score 데이터는 ==>  번호 국어 , 수학 , 영어 을 나타낸다.
		
		
		//문제1) 아래순서대로 전체 학생 출력  
		//     [학생번호] [이름] [지역] [국어] [수학] [영어] [총합] [평균] 
		int total[] = new int[score.length];
		double avg[] = new double[score.length];
		for(int i = 0; i < student.length; i++) {
			System.out.print(student[i][2] + " ");
			for(int j = 0; j < score.length; j++) {
				if(student[i][2] == score[j][0]) {
					for(int k = 0; k < student[i].length - 1; k++) {
						System.out.print(student[i][k] + " ");
					}
					for(int l = 1; l < score[j].length; l++) {
						total[j] += Integer.parseInt(score[j][l]);
						avg[j] = (double)total[j] / (score[j].length - 1);
						System.out.print(score[j][l] + " ");
					}
					System.out.print(total[j] + " ");
					System.out.printf("%.2f",avg[j]);
				}
			}
			System.out.println();
		}
		//문제2) 각 과목별 1등 학생이름 과 전체 1등이름  출력
		int 국어 = 0;
		int 수학 = 0;
		int 영어 = 0;
		double max = 0;
		int id1 = 0;
		int id2 = 0;
		int id3 = 0;
		int id4 = 0;
		for(int i = 0; i < score.length; i++) {
			if(국어 < Integer.parseInt(score[i][1])) {
				국어 = Integer.parseInt(score[i][1]);
				id1 = i;
			}
			if(수학 < Integer.parseInt(score[i][2])) {
				수학 = Integer.parseInt(score[i][2]);
				id2 = i;
			}
			if(영어 < Integer.parseInt(score[i][3])) {
				영어 = Integer.parseInt(score[i][3]);
				id3 = i;
			}
			if(max < avg[i]) {
				max = avg[i];
				id4 = i;
			}
		}
		for(int i = 0; i < student.length; i++) {
			if(student[i][2] == score[id1][0]) {
				System.out.println("국어 1등 " + 국어 + "점 " + student[i][0]);
			}
			if(student[i][2] == score[id2][0]) {
				System.out.println("수학 1등 " + 수학 + "점 " + student[i][0]);
			}
			if(student[i][2] == score[id3][0]) {
				System.out.println("영어 1등 " + 영어 + "점 " + student[i][0]);
			}
			if(student[i][2] == score[id4][0]) {
				System.out.println("전체평균 1등 " + avg[id4] + "점 " + student[i][0]);
			}
		}
		
	}
}