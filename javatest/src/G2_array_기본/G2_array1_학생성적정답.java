package G2_array_기본;

import java.util.Random;

public class G2_array1_학생성적정답 {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int[] arr = new int[5];

		// 문제1) arr배열에 1~100점 사이의 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		System.out.println("문제1");
		for(int i=0; i<5; i++) {
			arr[i] = ran.nextInt(100) + 1;
		}
		
		for(int i=0; i<5; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		System.out.println("문제2");
		int tot = 0;
		double avg = 0.0;
		for(int i=0; i<5; i++) {
			tot = tot + arr[i];
		}
		avg = tot / 5.0;
		System.out.println("총점 = " + tot + "점");
		System.out.println("평균 = " + avg + "점");
		
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
		System.out.println("문제3");
		int cnt = 0;
		for(int i=0; i<5; i++) {
			if(arr[i] >= 60) {
				cnt = cnt + 1;
			}
		}
		System.out.println("합격생 수 = " + cnt + "명");




	}

}