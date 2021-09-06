package G2_array_기본;

import java.util.Random;

public class G2_array1_학생성적문제 {

	public static void main(String[] args) {
		Random ran = new Random();
		int[] arr = new int[5];

		// 문제1) arr배열에 1~100점 사이의 랜덤 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		System.out.println("문제1");
		for(int i = 0; i < 5; i++) {
			arr[i] = ran.nextInt(100) + 1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		System.out.println("문제2");
		int total = 0;
		for(int i = 0; i < 5; i++) {
			total = total + arr[i];
		}
		double avg = total / 5.0;
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
		System.out.println("문제3");
		int count = 0;
		for(int i = 0; i < 5; i++) {
			if(arr[i] >= 60) {
				count += 1;
			}
		}
		System.out.println("합격생 수  : " + count);
	}
}