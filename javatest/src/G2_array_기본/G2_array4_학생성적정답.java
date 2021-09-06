package G2_array_기본;

public class G2_array4_학생성적정답 {

	public static void main(String[] args) {
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// 문제) 1등학생의 학번과 성적 출력
		// 정답) 1004번(98점)
		
		int maxScore = 0;
		int maxIdx = 0;
		for(int i=0; i<5; i++) {
			if(maxScore < scores[i]) {
				maxScore = scores[i];
				maxIdx = i;
			}
		}
		
		System.out.println("1등 학생 = " + hakbuns[maxIdx] + "번(" + maxScore + "점)");
	}
}