package M4_문자열_level2;

import java.util.Arrays;

public class M4_문자열2_형변환1 {
	public static void main(String[] args) {

		// 문자열 함수를 사용해서 풀어볼것
		
		String str = "11/100/89";
		// 문제 1) arr 배열에 각 점수를 저장하고, 총점 출력
		// 정답 1) 200
		int[] arr = new int[3];
		String str2[] = str.split("/");
		int total = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(str2[i]);
			total += arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(total);
		// 문제 2) scores 배열의 각 점수를 슬러시를 구분자로 하나의 문자열로 연결
		// 정답 2) 11/100/89
//		int[] scores = {11, 100, 89};
//		String text = "";
//		for(int i = 0; i < scores.length; i++) {
//			if(i > 0 && i < scores.length) {
//				text += "/";
//			}
//			text += String.valueOf(scores[i]);
//		}
//		System.out.println(text);
		int[] scores = {11, 100, 89};
		String text = "";
		for(int i = 0; i<scores.length; i++) {
			text+=scores[i]+" ";
		}
		System.out.println(text);
		text = text.trim();
		text = text.replaceAll(" ","/");
		System.out.println(text);
	}

}