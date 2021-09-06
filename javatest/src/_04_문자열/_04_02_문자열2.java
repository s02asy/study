package _04_문자열;

public class _04_02_문자열2 {
	public static void main(String[] args) {
		String userData = "1001,1002,1003,1004";
		String scoreData = "10,21,43,12";
		
		/*
		 * 1) userData 는 학생 번호 데이터이다
		 * 
		 * 2) scoreData 는 학생 점수 데이터이다.
		 * 
		 * 3) 1등 번호 출력  
		 *  - 예) 1003 : 43
		 *  
		 * 4) 전체 평균 출력
		 *  - 예) (10 + 21 + 43 + 12) / 4.0
		 */
		String udtokens[] = userData.split(",");
		String sdtokens[] = scoreData.split(",");
		int max = 0;
		int index = 0;
		int total = 0;
		for(int i = 0; i < sdtokens.length; i++) {
			if(Integer.parseInt(sdtokens[i]) > max) {
				max = Integer.parseInt(sdtokens[i]);
				index = i;
			}
			total += Integer.parseInt(sdtokens[i]);
		}
		System.out.println("1등 번호 : " + udtokens[index] + " 점수 : " + sdtokens[index]);
		double avg = (double)total / sdtokens.length;
		System.out.println("평균 : " + avg);
	}
}