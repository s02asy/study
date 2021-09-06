package J4_배열_level4;

import java.util.Arrays;

public class J4_배열4_평균이하개수 {
	public static void main(String[] args) {
		 // 문제) 배열의 전체합의 평균보다 적은 값이 몇개인지 출력 
		
		 int[] data1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		 double avg1;
		 int total = 0;
		 int count = 0;
		 //자료의 합은 55이며, 자료의 개수는 10개입니다. 
		 //따라서 평균은 55 / 10 = 5.5입니다.
		 //주어진 배열에서 5.5보다 작은 숫자는 총 5개입니다.
		 for(int i = 0; i < 10; i++) {
			 total += data1[i];
		 }
		 avg1 = total / 10.0;
		 System.out.println(avg1);
		 for(int i = 0; i < 10; i++) {
			 if(avg1 > data1[i]) {
				 count += 1;
				 System.out.print(data1[i] + " ");
			 }
		 }
		 System.out.println();
		 System.out.println(count);
		 
		 int[] data2 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 10};
		 double avg2;
		 int total2 = 0;
		 int count2 = 0;
		 //자료의 합은 19이며, 자료의 개수는 10개입니다. 
		 //따라서 평균은 19 / 10 = 1.9입니다.
		 //주어진 배열에서 1.9보다 작은 숫자는 총 9개입니다.
		 
		 for(int i = 0; i < 10; i++) {
			 total2 += data2[i];
		 }
		 avg2 = total2 / 10.0;
		 System.out.println(avg2);
		 for(int i = 0; i < 10; i++) {
			 if(avg2 > data2[i]) {
				 count2 += 1;
				 System.out.print(data2[i] + " ");
			 }
		 }
		 System.out.println();
		 System.out.println(count2);
	}
}       